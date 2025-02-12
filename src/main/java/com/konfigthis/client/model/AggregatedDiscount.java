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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Discount;
import com.konfigthis.client.model.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The discount. Can be an item- or invoice-level discount, or both. Can be applied as a percent or amount. If you provide both amount and percent, amount takes precedent.
 */
@ApiModel(description = "The discount. Can be an item- or invoice-level discount, or both. Can be applied as a percent or amount. If you provide both amount and percent, amount takes precedent.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AggregatedDiscount {
  public static final String SERIALIZED_NAME_INVOICE_DISCOUNT = "invoice_discount";
  @SerializedName(SERIALIZED_NAME_INVOICE_DISCOUNT)
  private Discount invoiceDiscount;

  public static final String SERIALIZED_NAME_ITEM_DISCOUNT = "item_discount";
  @SerializedName(SERIALIZED_NAME_ITEM_DISCOUNT)
  private Money itemDiscount;

  public AggregatedDiscount() {
  }

  public AggregatedDiscount invoiceDiscount(Discount invoiceDiscount) {
    
    
    
    
    this.invoiceDiscount = invoiceDiscount;
    return this;
  }

   /**
   * Get invoiceDiscount
   * @return invoiceDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Discount getInvoiceDiscount() {
    return invoiceDiscount;
  }


  public void setInvoiceDiscount(Discount invoiceDiscount) {
    
    
    
    this.invoiceDiscount = invoiceDiscount;
  }


  public AggregatedDiscount itemDiscount(Money itemDiscount) {
    
    
    
    
    this.itemDiscount = itemDiscount;
    return this;
  }

   /**
   * Get itemDiscount
   * @return itemDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getItemDiscount() {
    return itemDiscount;
  }


  public void setItemDiscount(Money itemDiscount) {
    
    
    
    this.itemDiscount = itemDiscount;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AggregatedDiscount instance itself
   */
  public AggregatedDiscount putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedDiscount aggregatedDiscount = (AggregatedDiscount) o;
    return Objects.equals(this.invoiceDiscount, aggregatedDiscount.invoiceDiscount) &&
        Objects.equals(this.itemDiscount, aggregatedDiscount.itemDiscount)&&
        Objects.equals(this.additionalProperties, aggregatedDiscount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceDiscount, itemDiscount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedDiscount {\n");
    sb.append("    invoiceDiscount: ").append(toIndentedString(invoiceDiscount)).append("\n");
    sb.append("    itemDiscount: ").append(toIndentedString(itemDiscount)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("invoice_discount");
    openapiFields.add("item_discount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AggregatedDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AggregatedDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregatedDiscount is not found in the empty JSON string", AggregatedDiscount.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `invoice_discount`
      if (jsonObj.get("invoice_discount") != null && !jsonObj.get("invoice_discount").isJsonNull()) {
        Discount.validateJsonObject(jsonObj.getAsJsonObject("invoice_discount"));
      }
      // validate the optional field `item_discount`
      if (jsonObj.get("item_discount") != null && !jsonObj.get("item_discount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("item_discount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregatedDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregatedDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregatedDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregatedDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregatedDiscount>() {
           @Override
           public void write(JsonWriter out, AggregatedDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregatedDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AggregatedDiscount instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AggregatedDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AggregatedDiscount
  * @throws IOException if the JSON string is invalid with respect to AggregatedDiscount
  */
  public static AggregatedDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregatedDiscount.class);
  }

 /**
  * Convert an instance of AggregatedDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

