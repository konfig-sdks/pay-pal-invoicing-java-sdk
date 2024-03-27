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
 * The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and open source. Redundant with core fields.&lt;br/&gt;For example, &#x60;address_portable.address_line_1&#x60; is usually a combination of &#x60;address_details.street_number&#x60;, &#x60;street_name&#x60;, and &#x60;street_type&#x60;.
 */
@ApiModel(description = "The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and open source. Redundant with core fields.<br/>For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number`, `street_name`, and `street_type`.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddressDetailsProperty {
  public static final String SERIALIZED_NAME_STREET_NUMBER = "street_number";
  @SerializedName(SERIALIZED_NAME_STREET_NUMBER)
  private String streetNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "street_name";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_STREET_TYPE = "street_type";
  @SerializedName(SERIALIZED_NAME_STREET_TYPE)
  private String streetType;

  public static final String SERIALIZED_NAME_DELIVERY_SERVICE = "delivery_service";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SERVICE)
  private String deliveryService;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "building_name";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_SUB_BUILDING = "sub_building";
  @SerializedName(SERIALIZED_NAME_SUB_BUILDING)
  private String subBuilding;

  public AddressDetailsProperty() {
  }

  public AddressDetailsProperty streetNumber(String streetNumber) {
    
    
    
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * The street number.
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street number.")

  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    
    
    
    this.streetNumber = streetNumber;
  }


  public AddressDetailsProperty streetName(String streetName) {
    
    
    
    
    this.streetName = streetName;
    return this;
  }

   /**
   * The street name. Just &#x60;Drury&#x60; in &#x60;Drury Lane&#x60;.
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street name. Just `Drury` in `Drury Lane`.")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    
    
    
    this.streetName = streetName;
  }


  public AddressDetailsProperty streetType(String streetType) {
    
    
    
    
    this.streetType = streetType;
    return this;
  }

   /**
   * The street type. For example, avenue, boulevard, road, or expressway.
   * @return streetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street type. For example, avenue, boulevard, road, or expressway.")

  public String getStreetType() {
    return streetType;
  }


  public void setStreetType(String streetType) {
    
    
    
    this.streetType = streetType;
  }


  public AddressDetailsProperty deliveryService(String deliveryService) {
    
    
    
    
    this.deliveryService = deliveryService;
    return this;
  }

   /**
   * The delivery service. Post office box, bag number, or post office name.
   * @return deliveryService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The delivery service. Post office box, bag number, or post office name.")

  public String getDeliveryService() {
    return deliveryService;
  }


  public void setDeliveryService(String deliveryService) {
    
    
    
    this.deliveryService = deliveryService;
  }


  public AddressDetailsProperty buildingName(String buildingName) {
    
    
    
    
    this.buildingName = buildingName;
    return this;
  }

   /**
   * A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, &lt;code&gt;Craven House&lt;/code&gt;.
   * @return buildingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, <code>Craven House</code>.")

  public String getBuildingName() {
    return buildingName;
  }


  public void setBuildingName(String buildingName) {
    
    
    
    this.buildingName = buildingName;
  }


  public AddressDetailsProperty subBuilding(String subBuilding) {
    
    
    
    
    this.subBuilding = subBuilding;
    return this;
  }

   /**
   * The first-order entity below a named building or location that represents the sub-premise. Usually a single building within a collection of buildings with a common name. Can be a flat, story, floor, room, or apartment.
   * @return subBuilding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first-order entity below a named building or location that represents the sub-premise. Usually a single building within a collection of buildings with a common name. Can be a flat, story, floor, room, or apartment.")

  public String getSubBuilding() {
    return subBuilding;
  }


  public void setSubBuilding(String subBuilding) {
    
    
    
    this.subBuilding = subBuilding;
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
   * @return the AddressDetailsProperty instance itself
   */
  public AddressDetailsProperty putAdditionalProperty(String key, Object value) {
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
    AddressDetailsProperty addressDetailsProperty = (AddressDetailsProperty) o;
    return Objects.equals(this.streetNumber, addressDetailsProperty.streetNumber) &&
        Objects.equals(this.streetName, addressDetailsProperty.streetName) &&
        Objects.equals(this.streetType, addressDetailsProperty.streetType) &&
        Objects.equals(this.deliveryService, addressDetailsProperty.deliveryService) &&
        Objects.equals(this.buildingName, addressDetailsProperty.buildingName) &&
        Objects.equals(this.subBuilding, addressDetailsProperty.subBuilding)&&
        Objects.equals(this.additionalProperties, addressDetailsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetNumber, streetName, streetType, deliveryService, buildingName, subBuilding, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetailsProperty {\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    deliveryService: ").append(toIndentedString(deliveryService)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    subBuilding: ").append(toIndentedString(subBuilding)).append("\n");
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
    openapiFields.add("street_number");
    openapiFields.add("street_name");
    openapiFields.add("street_type");
    openapiFields.add("delivery_service");
    openapiFields.add("building_name");
    openapiFields.add("sub_building");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressDetailsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddressDetailsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressDetailsProperty is not found in the empty JSON string", AddressDetailsProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("street_number") != null && !jsonObj.get("street_number").isJsonNull()) && !jsonObj.get("street_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_number").toString()));
      }
      if ((jsonObj.get("street_name") != null && !jsonObj.get("street_name").isJsonNull()) && !jsonObj.get("street_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_name").toString()));
      }
      if ((jsonObj.get("street_type") != null && !jsonObj.get("street_type").isJsonNull()) && !jsonObj.get("street_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_type").toString()));
      }
      if ((jsonObj.get("delivery_service") != null && !jsonObj.get("delivery_service").isJsonNull()) && !jsonObj.get("delivery_service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_service").toString()));
      }
      if ((jsonObj.get("building_name") != null && !jsonObj.get("building_name").isJsonNull()) && !jsonObj.get("building_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `building_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("building_name").toString()));
      }
      if ((jsonObj.get("sub_building") != null && !jsonObj.get("sub_building").isJsonNull()) && !jsonObj.get("sub_building").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_building` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_building").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressDetailsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressDetailsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressDetailsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressDetailsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressDetailsProperty>() {
           @Override
           public void write(JsonWriter out, AddressDetailsProperty value) throws IOException {
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
           public AddressDetailsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddressDetailsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddressDetailsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressDetailsProperty
  * @throws IOException if the JSON string is invalid with respect to AddressDetailsProperty
  */
  public static AddressDetailsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressDetailsProperty.class);
  }

 /**
  * Convert an instance of AddressDetailsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
