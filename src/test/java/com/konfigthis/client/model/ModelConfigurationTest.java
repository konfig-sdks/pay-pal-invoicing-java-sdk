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
import com.konfigthis.client.model.PartialPayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ModelConfiguration
 */
public class ModelConfigurationTest {
    private final ModelConfiguration model = new ModelConfiguration();

    /**
     * Model tests for ModelConfiguration
     */
    @Test
    public void testModelConfiguration() {
        // TODO: test ModelConfiguration
    }

    /**
     * Test the property 'taxCalculatedAfterDiscount'
     */
    @Test
    public void taxCalculatedAfterDiscountTest() {
        // TODO: test taxCalculatedAfterDiscount
    }

    /**
     * Test the property 'taxInclusive'
     */
    @Test
    public void taxInclusiveTest() {
        // TODO: test taxInclusive
    }

    /**
     * Test the property 'allowTip'
     */
    @Test
    public void allowTipTest() {
        // TODO: test allowTip
    }

    /**
     * Test the property 'partialPayment'
     */
    @Test
    public void partialPaymentTest() {
        // TODO: test partialPayment
    }

    /**
     * Test the property 'templateId'
     */
    @Test
    public void templateIdTest() {
        // TODO: test templateId
    }

}
