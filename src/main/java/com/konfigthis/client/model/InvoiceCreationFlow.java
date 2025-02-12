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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The frequency at which the invoice is sent:&lt;ul&gt;&lt;li&gt;Multiple recipient. Sent to multiple recipients.&lt;/li&gt;&lt;li&gt;Batch. Sent in a batch.&lt;/li&gt;&lt;li&gt;Regular single. Sent one time to a single recipient.&lt;/li&gt;&lt;/ul&gt;
 */
@JsonAdapter(InvoiceCreationFlow.Adapter.class)public enum InvoiceCreationFlow {
  
  MULTIPLE_RECIPIENTS_GROUP("MULTIPLE_RECIPIENTS_GROUP"),
  
  BATCH("BATCH"),
  
  REGULAR_SINGLE("REGULAR_SINGLE");

  private String value;

  InvoiceCreationFlow(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvoiceCreationFlow fromValue(String value) {
    for (InvoiceCreationFlow b : InvoiceCreationFlow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InvoiceCreationFlow> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvoiceCreationFlow enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvoiceCreationFlow read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvoiceCreationFlow.fromValue(value);
    }
  }
}

