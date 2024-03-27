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
 * The name of the party.
 */
@ApiModel(description = "The name of the party.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Name {
  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_ALTERNATE_FULL_NAME = "alternate_full_name";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_FULL_NAME)
  private String alternateFullName;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public Name() {
  }

  public Name prefix(String prefix) {
    
    
    
    
    this.prefix = prefix;
    return this;
  }

   /**
   * The prefix, or title, to the party&#39;s name.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The prefix, or title, to the party's name.")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    
    
    
    this.prefix = prefix;
  }


  public Name givenName(String givenName) {
    
    
    
    
    this.givenName = givenName;
    return this;
  }

   /**
   * When the party is a person, the party&#39;s given, or first, name.
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the party is a person, the party's given, or first, name.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    
    
    
    this.givenName = givenName;
  }


  public Name surname(String surname) {
    
    
    
    
    this.surname = surname;
    return this;
  }

   /**
   * When the party is a person, the party&#39;s surname or family name. Also known as the last name. Required when the party is a person. Use also to store multiple surnames including the matronymic, or mother&#39;s, surname.
   * @return surname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the party is a person, the party's surname or family name. Also known as the last name. Required when the party is a person. Use also to store multiple surnames including the matronymic, or mother's, surname.")

  public String getSurname() {
    return surname;
  }


  public void setSurname(String surname) {
    
    
    
    this.surname = surname;
  }


  public Name middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * When the party is a person, the party&#39;s middle name. Use also to store multiple middle names including the patronymic, or father&#39;s, middle name.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the party is a person, the party's middle name. Use also to store multiple middle names including the patronymic, or father's, middle name.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public Name suffix(String suffix) {
    
    
    
    
    this.suffix = suffix;
    return this;
  }

   /**
   * The suffix for the party&#39;s name.
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suffix for the party's name.")

  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    
    
    
    this.suffix = suffix;
  }


  public Name alternateFullName(String alternateFullName) {
    
    
    
    
    this.alternateFullName = alternateFullName;
    return this;
  }

   /**
   * DEPRECATED. The party&#39;s alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required when the party is a business.
   * @return alternateFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required when the party is a business.")

  public String getAlternateFullName() {
    return alternateFullName;
  }


  public void setAlternateFullName(String alternateFullName) {
    
    
    
    this.alternateFullName = alternateFullName;
  }


  public Name fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * When the party is a person, the party&#39;s full name.
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the party is a person, the party's full name.")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
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
   * @return the Name instance itself
   */
  public Name putAdditionalProperty(String key, Object value) {
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
    Name name = (Name) o;
    return Objects.equals(this.prefix, name.prefix) &&
        Objects.equals(this.givenName, name.givenName) &&
        Objects.equals(this.surname, name.surname) &&
        Objects.equals(this.middleName, name.middleName) &&
        Objects.equals(this.suffix, name.suffix) &&
        Objects.equals(this.alternateFullName, name.alternateFullName) &&
        Objects.equals(this.fullName, name.fullName)&&
        Objects.equals(this.additionalProperties, name.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, givenName, surname, middleName, suffix, alternateFullName, fullName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    alternateFullName: ").append(toIndentedString(alternateFullName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
    openapiFields.add("prefix");
    openapiFields.add("given_name");
    openapiFields.add("surname");
    openapiFields.add("middle_name");
    openapiFields.add("suffix");
    openapiFields.add("alternate_full_name");
    openapiFields.add("full_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Name
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Name.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Name is not found in the empty JSON string", Name.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("given_name") != null && !jsonObj.get("given_name").isJsonNull()) && !jsonObj.get("given_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given_name").toString()));
      }
      if ((jsonObj.get("surname") != null && !jsonObj.get("surname").isJsonNull()) && !jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      if ((jsonObj.get("alternate_full_name") != null && !jsonObj.get("alternate_full_name").isJsonNull()) && !jsonObj.get("alternate_full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternate_full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alternate_full_name").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Name.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Name' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Name> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Name.class));

       return (TypeAdapter<T>) new TypeAdapter<Name>() {
           @Override
           public void write(JsonWriter out, Name value) throws IOException {
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
           public Name read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Name instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Name given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Name
  * @throws IOException if the JSON string is invalid with respect to Name
  */
  public static Name fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Name.class);
  }

 /**
  * Convert an instance of Name to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
