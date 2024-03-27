package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api-m.sandbox.paypal.com";
        // Configure OAuth2 client credentials for "application" OAuth flow
        String clientId = System.getenv("CLIENT_ID");
        String clientSecret = System.getenv("CLIENT_SECRET");
        configuration.clientId = "clientId";
        configuration.clientSecret = "clientSecret";
        
        PayPalInvoicing client = new PayPalInvoicing(configuration);
        assertNotNull(client);
    }
}
