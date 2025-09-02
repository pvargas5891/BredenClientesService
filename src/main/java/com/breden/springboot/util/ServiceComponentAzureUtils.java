package com.breden.springboot.util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;

import com.azure.data.tables.TableClient;
import com.azure.data.tables.TableClientBuilder;
import com.azure.data.tables.models.ListEntitiesOptions;
import com.azure.data.tables.models.TableEntity;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;
import java.sql.Connection;
import java.sql.Statement;

//@Component("keyvaultUtils")
public class ServiceComponentAzureUtils {

    @Value("${url.azure.keyvault}")
    private String localUrl;

    private final SecretClient secretClient;
    Utils utils = new Utils();
    Properties prop = utils.getProperties();

    public ServiceComponentAzureUtils() {

        if (this.localUrl == null) {
            this.localUrl = prop.getProperty("url.azure.keyvault");
        }
        System.out.println("url springboot: " + this.localUrl);

        this.secretClient = new SecretClientBuilder()
                .vaultUrl(this.localUrl)
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();

    }

    public String getInvoice(String code) {

        System.out.println("Intento accesar al mysql");
        try (Connection conn = DriverManager.getConnection(prop.getProperty("mysqlazure.string.connection"),
                prop.getProperty("mysqlazure.usuario"), prop.getProperty("mysqlazure.password"))) {

            String SQL = "SELECT archivo FROM archivos_facturas_hqb where nombre='" + code + "'";
            System.out.println("QUERY SQL:" + SQL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            if (rs.next()) {

                return rs.getString("archivo");

            } else {
                conn.close();
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
        return "No encontrado";
    }

    public String getInvoiceTable(String code) {

        try {
            KeyVaultSecret secret = secretClient.getSecret("TablesStorage");
            System.out.println("secret TablesStorage: " + secret.getValue());
            TableClient tableClient = new TableClientBuilder()
                    .connectionString(secret.getValue())
                    .tableName("files64hqb")
                    .buildClient();
            List<String> selectList = new ArrayList<>();
            selectList.add("RowKey");
            selectList.add("base64");
            ListEntitiesOptions options = new ListEntitiesOptions()
                    .setFilter(String.format("RowKey eq '%s'", code))
                    .setSelect(selectList);
            String base64 = "";
            for (TableEntity entity : tableClient.listEntities(options, null, null)) {
                Map<String, Object> properties = entity.getProperties();
                base64 = properties.get("base64").toString();
                System.out.println(base64);
            }
            return base64;

        } catch (Exception e) {

            return "Error: " + e.getMessage();
        }
    }

    public String getSecret(String secretName) {

        try {
            KeyVaultSecret secret = secretClient.getSecret(secretName);

            return secret.getValue();

        } catch (Exception e) {

            return "Error: " + e.getMessage();
        }

    }

    /**
     * @return String return the localUrl
     */
    public String getLocalUrl() {
        return localUrl;
    }

    /**
     * @param localUrl the localUrl to set
     */
    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl;
    }

}