/*
 * Invoices
 * Use the Invoicing API to create, send, and manage invoices. You can also use the API or webhooks to track invoice payments. When you send an invoice to a customer, the invoice moves from draft to payable state. PayPal then emails the customer a link to the invoice on the PayPal website. Customers with a PayPal account can log in and pay the invoice with PayPal. Alternatively, customers can pay as a guest with a debit card or credit card. For more information, see the <a href=\"/docs/invoicing/\">Invoicing Overview</a> and the <a href=\"/docs/invoicing/basic-integration/\">Invoicing Integration Guide</a>.
 *
 * The version of the OpenAPI document: 2.3
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PhoneType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PhoneDetail
 */
public class PhoneDetailTest {
    private final PhoneDetail model = new PhoneDetail();

    /**
     * Model tests for PhoneDetail
     */
    @Test
    public void testPhoneDetail() {
        // TODO: test PhoneDetail
    }

    /**
     * Test the property 'countryCode'
     */
    @Test
    public void countryCodeTest() {
        // TODO: test countryCode
    }

    /**
     * Test the property 'nationalNumber'
     */
    @Test
    public void nationalNumberTest() {
        // TODO: test nationalNumber
    }

    /**
     * Test the property 'extensionNumber'
     */
    @Test
    public void extensionNumberTest() {
        // TODO: test extensionNumber
    }

    /**
     * Test the property 'phoneType'
     */
    @Test
    public void phoneTypeTest() {
        // TODO: test phoneType
    }

}
