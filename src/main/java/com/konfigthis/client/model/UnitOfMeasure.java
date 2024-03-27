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
 * The unit of measure for the invoiced item.
 */
@JsonAdapter(UnitOfMeasure.Adapter.class)public enum UnitOfMeasure {
  
  QUANTITY("QUANTITY"),
  
  HOURS("HOURS"),
  
  AMOUNT("AMOUNT");

  private String value;

  UnitOfMeasure(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UnitOfMeasure fromValue(String value) {
    for (UnitOfMeasure b : UnitOfMeasure.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UnitOfMeasure> {
    @Override
    public void write(final JsonWriter jsonWriter, final UnitOfMeasure enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UnitOfMeasure read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UnitOfMeasure.fromValue(value);
    }
  }
}

