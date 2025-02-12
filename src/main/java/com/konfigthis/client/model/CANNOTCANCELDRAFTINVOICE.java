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
 * CANNOTCANCELDRAFTINVOICE
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CANNOTCANCELDRAFTINVOICE {
  /**
   * Gets or Sets description
   */
  @JsonAdapter(DescriptionEnum.Adapter.class)
 public enum DescriptionEnum {
    CANNOT_CANCEL_A_DRAFT_INVOICE_("Cannot cancel a draft invoice.");

    private String value;

    DescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DescriptionEnum fromValue(String value) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DescriptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private DescriptionEnum description;

  /**
   * Gets or Sets issue
   */
  @JsonAdapter(IssueEnum.Adapter.class)
 public enum IssueEnum {
    CANNOT_CANCEL_DRAFT_INVOICE("CANNOT_CANCEL_DRAFT_INVOICE");

    private String value;

    IssueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IssueEnum fromValue(String value) {
      for (IssueEnum b : IssueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IssueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IssueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IssueEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IssueEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ISSUE = "issue";
  @SerializedName(SERIALIZED_NAME_ISSUE)
  private IssueEnum issue;

  public CANNOTCANCELDRAFTINVOICE() {
  }

  public CANNOTCANCELDRAFTINVOICE description(DescriptionEnum description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DescriptionEnum getDescription() {
    return description;
  }


  public void setDescription(DescriptionEnum description) {
    
    
    
    this.description = description;
  }


  public CANNOTCANCELDRAFTINVOICE issue(IssueEnum issue) {
    
    
    
    
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssueEnum getIssue() {
    return issue;
  }


  public void setIssue(IssueEnum issue) {
    
    
    
    this.issue = issue;
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
   * @return the CANNOTCANCELDRAFTINVOICE instance itself
   */
  public CANNOTCANCELDRAFTINVOICE putAdditionalProperty(String key, Object value) {
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
    CANNOTCANCELDRAFTINVOICE CANNOT_CANCEL_DRAFT_INVOICE = (CANNOTCANCELDRAFTINVOICE) o;
    return Objects.equals(this.description, CANNOT_CANCEL_DRAFT_INVOICE.description) &&
        Objects.equals(this.issue, CANNOT_CANCEL_DRAFT_INVOICE.issue)&&
        Objects.equals(this.additionalProperties, CANNOT_CANCEL_DRAFT_INVOICE.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, issue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CANNOTCANCELDRAFTINVOICE {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("issue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CANNOTCANCELDRAFTINVOICE
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CANNOTCANCELDRAFTINVOICE.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CANNOTCANCELDRAFTINVOICE is not found in the empty JSON string", CANNOTCANCELDRAFTINVOICE.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("issue") != null && !jsonObj.get("issue").isJsonNull()) && !jsonObj.get("issue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CANNOTCANCELDRAFTINVOICE.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CANNOTCANCELDRAFTINVOICE' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CANNOTCANCELDRAFTINVOICE> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CANNOTCANCELDRAFTINVOICE.class));

       return (TypeAdapter<T>) new TypeAdapter<CANNOTCANCELDRAFTINVOICE>() {
           @Override
           public void write(JsonWriter out, CANNOTCANCELDRAFTINVOICE value) throws IOException {
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
           public CANNOTCANCELDRAFTINVOICE read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CANNOTCANCELDRAFTINVOICE instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CANNOTCANCELDRAFTINVOICE given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CANNOTCANCELDRAFTINVOICE
  * @throws IOException if the JSON string is invalid with respect to CANNOTCANCELDRAFTINVOICE
  */
  public static CANNOTCANCELDRAFTINVOICE fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CANNOTCANCELDRAFTINVOICE.class);
  }

 /**
  * Convert an instance of CANNOTCANCELDRAFTINVOICE to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

