package com.breden.springboot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

    @Value("${breden.openapi.local-url}")
    private String localUrl;

    @Value("${breden.openapi.dev-url}")
    private String devUrl;

    @Value("${breden.openapi.prod-url}")
    private String prodUrl;

    @Bean
    public OpenAPI myOpenAPI() {

        Server localServer = new Server();
        localServer.setUrl(localUrl);
        localServer.setDescription("Server URL in Development environment");

        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        Contact contact = new Contact();
        contact.setEmail("soporte@bredenmaster.com");
        contact.setName("Soporte Bredenmaster");
        contact.setUrl("https://www.bredenmaster.com");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Servicios SF API")
                .version("1.0")
                .contact(contact)
                .description("Esta API expone servicios SF.")
                .termsOfService("https://www.bredenmaster.com/terms")
                .license(mitLicense);

        List<Server> servers = new ArrayList<>();
        servers.add(localServer);
        servers.add(devServer);
        servers.add(prodServer);

        return new OpenAPI().info(info).servers(servers);
    }
}
