# TemplatesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /v2/invoicing/templates | Create template |
| [**deleteById**](TemplatesApi.md#deleteById) | **DELETE** /v2/invoicing/templates/{template_id} | Delete template |
| [**listDetails**](TemplatesApi.md#listDetails) | **GET** /v2/invoicing/templates | List templates |
| [**showDetailsById**](TemplatesApi.md#showDetailsById) | **GET** /v2/invoicing/templates/{template_id} | Show template details |
| [**updateFullTemplate**](TemplatesApi.md#updateFullTemplate) | **PUT** /v2/invoicing/templates/{template_id} | Fully update template |


<a name="createTemplate"></a>
# **createTemplate**
> Template createTemplate(template).execute();

Create template

Creates an invoice template. You can use details from this template to create an invoice. You can create up to 50 templates.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Every merchant starts with three PayPal system templates that are optimized for the unit type billed. The template includes &#x60;Quantity&#x60;, &#x60;Hours&#x60;, and &#x60;Amount&#x60;.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalInvoicing client = new PayPalInvoicing(configuration);
    String id = "id_example"; // The ID of the template.
    String name = "name_example"; // The template name.<blockquote><strong>Note:</strong> The template name must be unique.</blockquote>
    Boolean defaultTemplate = true; // Indicates whether this template is the default template. A invoicer can have one default template.
    TemplateInfo templateInfo = new TemplateInfo();
    TemplateSettings settings = new TemplateSettings();
    UnitOfMeasure unitOfMeasure = UnitOfMeasure.fromValue("QUANTITY");
    Boolean standardTemplate = true; // Indicates whether this template is a invoicer-created custom template. The system generates non-custom templates.
    List<LinkDescription> links = Arrays.asList(); // An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
    try {
      Template result = client
              .templates
              .createTemplate()
              .id(id)
              .name(name)
              .defaultTemplate(defaultTemplate)
              .templateInfo(templateInfo)
              .settings(settings)
              .unitOfMeasure(unitOfMeasure)
              .standardTemplate(standardTemplate)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getDefaultTemplate());
      System.out.println(result.getTemplateInfo());
      System.out.println(result.getSettings());
      System.out.println(result.getUnitOfMeasure());
      System.out.println(result.getStandardTemplate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .templates
              .createTemplate()
              .id(id)
              .name(name)
              .defaultTemplate(defaultTemplate)
              .templateInfo(templateInfo)
              .settings(settings)
              .unitOfMeasure(unitOfMeasure)
              .standardTemplate(standardTemplate)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **template** | [**Template**](Template.md)|  | |

### Return type

[**Template**](Template.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **0** | The default response. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(templateId).execute();

Delete template

Deletes a template, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalInvoicing client = new PayPalInvoicing(configuration);
    String templateId = "templateId_example"; // The ID of the template to delete.
    try {
      client
              .templates
              .deleteById(templateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .templates
              .deleteById(templateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateId** | **String**| The ID of the template to delete. | |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **0** | The default response. |  -  |

<a name="listDetails"></a>
# **listDetails**
> Templates listDetails().fields(fields).page(page).pageSize(pageSize).execute();

List templates

Lists merchant-created templates with associated details. The associated details include the emails, addresses, and phone numbers from the user&#39;s PayPal profile.&lt;br/&gt;The user can select which values to show in the business information section of their template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalInvoicing client = new PayPalInvoicing(configuration);
    String fields = "all"; // The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
    Integer page = 1; // The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
    Integer pageSize = 20; // The maximum number of templates to return in the response.
    try {
      Templates result = client
              .templates
              .listDetails()
              .fields(fields)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddresses());
      System.out.println(result.getEmails());
      System.out.println(result.getPhones());
      System.out.println(result.getTemplates());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Templates> response = client
              .templates
              .listDetails()
              .fields(fields)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |

### Return type

[**Templates**](Templates.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices. |  -  |
| **0** | The default response. |  -  |

<a name="showDetailsById"></a>
# **showDetailsById**
> Template showDetailsById(templateId).execute();

Show template details

Shows details for a template, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalInvoicing client = new PayPalInvoicing(configuration);
    String templateId = "templateId_example"; // The ID of the template to delete.
    try {
      Template result = client
              .templates
              .showDetailsById(templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getDefaultTemplate());
      System.out.println(result.getTemplateInfo());
      System.out.println(result.getSettings());
      System.out.println(result.getUnitOfMeasure());
      System.out.println(result.getStandardTemplate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#showDetailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .templates
              .showDetailsById(templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#showDetailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateId** | **String**| The ID of the template to delete. | |

### Return type

[**Template**](Template.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows template details. |  -  |
| **0** | The default response. |  -  |

<a name="updateFullTemplate"></a>
# **updateFullTemplate**
> Template updateFullTemplate(templateId, template).execute();

Fully update template

Fully updates a template, by ID. In the JSON request body, include a complete &#x60;template&#x60; object. This call does not support partial updates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalInvoicing client = new PayPalInvoicing(configuration);
    String templateId = "templateId_example"; // The ID of the template to delete.
    String id = "id_example"; // The ID of the template.
    String name = "name_example"; // The template name.<blockquote><strong>Note:</strong> The template name must be unique.</blockquote>
    Boolean defaultTemplate = true; // Indicates whether this template is the default template. A invoicer can have one default template.
    TemplateInfo templateInfo = new TemplateInfo();
    TemplateSettings settings = new TemplateSettings();
    UnitOfMeasure unitOfMeasure = UnitOfMeasure.fromValue("QUANTITY");
    Boolean standardTemplate = true; // Indicates whether this template is a invoicer-created custom template. The system generates non-custom templates.
    List<LinkDescription> links = Arrays.asList(); // An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
    try {
      Template result = client
              .templates
              .updateFullTemplate(templateId)
              .id(id)
              .name(name)
              .defaultTemplate(defaultTemplate)
              .templateInfo(templateInfo)
              .settings(settings)
              .unitOfMeasure(unitOfMeasure)
              .standardTemplate(standardTemplate)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getDefaultTemplate());
      System.out.println(result.getTemplateInfo());
      System.out.println(result.getSettings());
      System.out.println(result.getUnitOfMeasure());
      System.out.println(result.getStandardTemplate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateFullTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Template> response = client
              .templates
              .updateFullTemplate(templateId)
              .id(id)
              .name(name)
              .defaultTemplate(defaultTemplate)
              .templateInfo(templateInfo)
              .settings(settings)
              .unitOfMeasure(unitOfMeasure)
              .standardTemplate(standardTemplate)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateFullTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateId** | **String**| The ID of the template to delete. | |
| **template** | [**Template**](Template.md)| A representation of changes to make in the template. | |

### Return type

[**Template**](Template.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows template details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **0** | The default response. |  -  |

