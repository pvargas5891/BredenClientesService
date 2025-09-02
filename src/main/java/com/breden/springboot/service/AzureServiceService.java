package com.breden.springboot.service;

public interface AzureServiceService {

    public String getSecret(String secretName);

    public String getInvoice(String code);

}
