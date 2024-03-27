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
import java.net.URI;

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
 * The file reference. Can be a file in PayPal MediaServ, PayPal DMS, or other custom store.
 */
@ApiModel(description = "The file reference. Can be a file in PayPal MediaServ, PayPal DMS, or other custom store.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FileReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REFERENCE_URL = "reference_url";
  @SerializedName(SERIALIZED_NAME_REFERENCE_URL)
  private URI referenceUrl;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public FileReference() {
  }

  public FileReference id(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the referenced file.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the referenced file.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    this.id = id;
  }


  public FileReference referenceUrl(URI referenceUrl) {
    
    
    if (referenceUrl != null && referenceUrl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceUrl. Length must be greater than or equal to 1.");
    }
    
    this.referenceUrl = referenceUrl;
    return this;
  }

   /**
   * The reference URL for the file.
   * @return referenceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference URL for the file.")

  public URI getReferenceUrl() {
    return referenceUrl;
  }


  public void setReferenceUrl(URI referenceUrl) {
    
    
    if (referenceUrl != null && referenceUrl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceUrl. Length must be greater than or equal to 1.");
    }
    this.referenceUrl = referenceUrl;
  }


  public FileReference contentType(String contentType) {
    
    
    
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The [Internet Assigned Numbers Authority (IANA) media type of the file](https://www.iana.org/assignments/media-types/media-types.xhtml).
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Internet Assigned Numbers Authority (IANA) media type of the file](https://www.iana.org/assignments/media-types/media-types.xhtml).")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    
    
    
    this.contentType = contentType;
  }


  public FileReference createTime(String createTime) {
    
    
    if (createTime != null && createTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for createTime. Length must be greater than or equal to 20.");
    }
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    
    
    if (createTime != null && createTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for createTime. Length must be greater than or equal to 20.");
    }
    this.createTime = createTime;
  }


  public FileReference size(String size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * The size of the file, in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the file, in bytes.")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    
    
    
    this.size = size;
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
   * @return the FileReference instance itself
   */
  public FileReference putAdditionalProperty(String key, Object value) {
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
    FileReference fileReference = (FileReference) o;
    return Objects.equals(this.id, fileReference.id) &&
        Objects.equals(this.referenceUrl, fileReference.referenceUrl) &&
        Objects.equals(this.contentType, fileReference.contentType) &&
        Objects.equals(this.createTime, fileReference.createTime) &&
        Objects.equals(this.size, fileReference.size)&&
        Objects.equals(this.additionalProperties, fileReference.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceUrl, contentType, createTime, size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("reference_url");
    openapiFields.add("content_type");
    openapiFields.add("create_time");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileReference is not found in the empty JSON string", FileReference.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("reference_url") != null && !jsonObj.get("reference_url").isJsonNull()) && !jsonObj.get("reference_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_url").toString()));
      }
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if ((jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonNull()) && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileReference.class));

       return (TypeAdapter<T>) new TypeAdapter<FileReference>() {
           @Override
           public void write(JsonWriter out, FileReference value) throws IOException {
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
           public FileReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FileReference instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FileReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileReference
  * @throws IOException if the JSON string is invalid with respect to FileReference
  */
  public static FileReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileReference.class);
  }

 /**
  * Convert an instance of FileReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
