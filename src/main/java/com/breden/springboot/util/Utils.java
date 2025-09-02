package com.breden.springboot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;


public class Utils {

		
	public Properties getProperties() {
		 try (InputStream input =Utils.class.getClassLoader().getResourceAsStream("application.properties")) {
			 
	            Properties prop = new Properties();
	            if (input == null) {
	                System.out.println("No se encontro el archivo properties");
	                throw new RuntimeException("Error : Archivo properties no encontrado ");
	            }
	            prop.load(input);

	            return prop;
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		 
		 return null;
	}
	
	public void sendLogTransaccion(String informacion,String accion,String origen,String destino) {
		
		/* try {
			 	Properties prop = this.getProperties();
			 	String charset = "UTF-8";
			 	System.out.println("URL:"+prop.getProperty("url.rest.transaccion"));
				URL url = new URL(prop.getProperty("url.rest.transaccion"));
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("POST");			   
			    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
			    conn.setUseCaches(false);
			    conn.setDoInput(true);
			    conn.setDoOutput(true);

				
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				params.add(new BasicNameValuePair("accion", accion));
				params.add(new BasicNameValuePair("origen", origen));
				params.add(new BasicNameValuePair("destino", destino));
				params.add(new BasicNameValuePair("informacion", informacion));
				
				System.out.println("se enviara a logs desde el servicio .... \n"+ params.toString());
				try (OutputStream output = conn.getOutputStream()) {
				    output.write(getQuery(params).getBytes(charset));
				
				}
	
				if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

				String output2;
				System.out.println("salida desde el servicio .... \n");
				while ((output2 = br.readLine()) != null) {
					
					
					System.out.println(output2);
				}

				conn.disconnect();

			  }  catch (Exception e) {

			 }*/
		
		
	}

	public String getQuery(List<NameValuePair> params) throws UnsupportedEncodingException
	{
	    StringBuilder result = new StringBuilder();
	    boolean first = true;

	    for (NameValuePair pair : params)
	    {
	        if (first)
	            first = false;
	        else
	            result.append("&");

	        result.append(URLEncoder.encode(pair.getName(), "UTF-8"));
	        result.append("=");
	        result.append(URLEncoder.encode(pair.getValue(), "UTF-8"));
	    }

	    return result.toString();
	}
}
