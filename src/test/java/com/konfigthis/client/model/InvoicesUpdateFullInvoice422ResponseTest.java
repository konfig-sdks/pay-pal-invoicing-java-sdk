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
import com.konfigthis.client.model.ErrorLinkDescription;
import com.konfigthis.client.model.USERNOTFOUND;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for InvoicesUpdateFullInvoice422Response
 */
public class InvoicesUpdateFullInvoice422ResponseTest {
    private final InvoicesUpdateFullInvoice422Response model = new InvoicesUpdateFullInvoice422Response();

    /**
     * Model tests for InvoicesUpdateFullInvoice422Response
     */
    @Test
    public void testInvoicesUpdateFullInvoice422Response() {
        // TODO: test InvoicesUpdateFullInvoice422Response
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        // TODO: test message
    }

    /**
     * Test the property 'details'
     */
    @Test
    public void detailsTest() {
        // TODO: test details
    }

    /**
     * Test the property 'debugId'
     */
    @Test
    public void debugIdTest() {
        // TODO: test debugId
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

}
