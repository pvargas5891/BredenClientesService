package com.breden.springboot.service;

import org.springframework.stereotype.Service;

import com.breden.springboot.util.ServiceComponentAzureUtils;

@Service("azureServiceService")
public class AzureServiceServiceImpl implements AzureServiceService {

    private ServiceComponentAzureUtils serviceComponentAzureUtils;

    public String getSecret(String secretName) {
        this.serviceComponentAzureUtils = new ServiceComponentAzureUtils();
        return serviceComponentAzureUtils.getSecret(secretName);

    }

    public String getInvoice(String code) {
        this.serviceComponentAzureUtils = new ServiceComponentAzureUtils();
        return serviceComponentAzureUtils.getInvoice(code);

    }
}