# InvoicesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSentInvoice**](InvoicesApi.md#cancelSentInvoice) | **POST** /v2/invoicing/invoices/{invoice_id}/cancel | Cancel sent invoice |
| [**createDraftInvoice**](InvoicesApi.md#createDraftInvoice) | **POST** /v2/invoicing/invoices | Create draft invoice |
| [**deleteDraftOrScheduledInvoice**](InvoicesApi.md#deleteDraftOrScheduledInvoice) | **DELETE** /v2/invoicing/invoices/{invoice_id} | Delete invoice |
| [**deleteExternalPayment**](InvoicesApi.md#deleteExternalPayment) | **DELETE** /v2/invoicing/invoices/{invoice_id}/payments/{transaction_id} | Delete external payment |
| [**deleteExternalRefund**](InvoicesApi.md#deleteExternalRefund) | **DELETE** /v2/invoicing/invoices/{invoice_id}/refunds/{transaction_id} | Delete external refund |
| [**generateNextInvoiceNumber**](InvoicesApi.md#generateNextInvoiceNumber) | **POST** /v2/invoicing/generate-next-invoice-number | Generate invoice number |
| [**generateQrCode**](InvoicesApi.md#generateQrCode) | **POST** /v2/invoicing/invoices/{invoice_id}/generate-qr-code | Generate QR code |
| [**getDetails**](InvoicesApi.md#getDetails) | **GET** /v2/invoicing/invoices/{invoice_id} | Show invoice details |
| [**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /v2/invoicing/invoices | List invoices |
| [**recordPayment**](InvoicesApi.md#recordPayment) | **POST** /v2/invoicing/invoices/{invoice_id}/payments | Record payment for invoice |
| [**recordRefund**](InvoicesApi.md#recordRefund) | **POST** /v2/invoicing/invoices/{invoice_id}/refunds | Record refund for invoice |
| [**sendInvoice**](InvoicesApi.md#sendInvoice) | **POST** /v2/invoicing/invoices/{invoice_id}/send | Send invoice |
| [**sendReminder**](InvoicesApi.md#sendReminder) | **POST** /v2/invoicing/invoices/{invoice_id}/remind | Send invoice reminder |
| [**updateFullInvoice**](InvoicesApi.md#updateFullInvoice) | **PUT** /v2/invoicing/invoices/{invoice_id} | Fully update invoice |


<a name="cancelSentInvoice"></a>
# **cancelSentInvoice**
> cancelSentInvoice(invoiceId, notification).execute();

Cancel sent invoice

Cancels a sent invoice, by ID, and, optionally, sends a notification about the cancellation to the payer, merchant, and CC: emails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String subject = "subject_example"; // The subject of the email that is sent as a notification to the recipient.
    String note = "note_example"; // A note to the payer.
    Boolean sendToInvoicer = false; // Indicates whether to send a copy of the email to the merchant.
    Boolean sendToRecipient = true; // Indicates whether to send a copy of the email to the recipient.
    List<String> additionalRecipients = Arrays.asList(); // An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.<blockquote><strong>Note:</strong> Valid values are email addresses in the `additional_recipients` value associated with the invoice.</blockquote>
    try {
      client
              .invoices
              .cancelSentInvoice(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#cancelSentInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .cancelSentInvoice(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#cancelSentInvoice");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer on cancellation. | |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **0** | The default response. |  -  |

<a name="createDraftInvoice"></a>
# **createDraftInvoice**
> Invoice createDraftInvoice(invoice).execute();

Create draft invoice

Creates a draft invoice. To move the invoice from a draft to payable state, you must &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send the invoice&lt;/a&gt;.&lt;br/&gt;&lt;br/&gt;In the JSON request body, include invoice details including merchant information. The &lt;code&gt;invoice&lt;/code&gt; object must include an &lt;code&gt;items&lt;/code&gt; array.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The merchant that you specify in an invoice must have a PayPal account in good standing.&lt;/blockquote&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceDetail detail = new InvoiceDetail();
    String id = "id_example"; // The ID of the invoice.
    String parentId = "parentId_example"; // The parent ID to an invoice that defines the group invoice to which the invoice is related.
    InvoiceStatus status = InvoiceStatus.fromValue("DRAFT");
    InvoicerInfo invoicer = new InvoicerInfo();
    List<RecipientInfo> primaryRecipients = Arrays.asList(); // The billing and shipping information. Includes name, email, address, phone and language.
    List<String> additionalRecipients = Arrays.asList(); // An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.<blockquote><strong>Note:</strong> Valid values are email addresses in the `additional_recipients` value associated with the invoice.</blockquote>
    List<Item> items = Arrays.asList(); // An array of invoice line item information.
    ModelConfiguration _configuration = new ModelConfiguration();
    AmountSummaryDetail amount = new AmountSummaryDetail();
    Money dueAmount = new Money();
    Money gratuity = new Money();
    Payments payments = new Payments();
    Refunds refunds = new Refunds();
    List<LinkDescription> links = Arrays.asList(); // An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
    try {
      Invoice result = client
              .invoices
              .createDraftInvoice(detail)
              .id(id)
              .parentId(parentId)
              .status(status)
              .invoicer(invoicer)
              .primaryRecipients(primaryRecipients)
              .additionalRecipients(additionalRecipients)
              .items(items)
              ._configuration(_configuration)
              .amount(amount)
              .dueAmount(dueAmount)
              .gratuity(gratuity)
              .payments(payments)
              .refunds(refunds)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getParentId());
      System.out.println(result.getStatus());
      System.out.println(result.getDetail());
      System.out.println(result.getInvoicer());
      System.out.println(result.getPrimaryRecipients());
      System.out.println(result.getAdditionalRecipients());
      System.out.println(result.getItems());
      System.out.println(result.getConfiguration());
      System.out.println(result.getAmount());
      System.out.println(result.getDueAmount());
      System.out.println(result.getGratuity());
      System.out.println(result.getPayments());
      System.out.println(result.getRefunds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createDraftInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoice> response = client
              .invoices
              .createDraftInvoice(detail)
              .id(id)
              .parentId(parentId)
              .status(status)
              .invoicer(invoicer)
              .primaryRecipients(primaryRecipients)
              .additionalRecipients(additionalRecipients)
              .items(items)
              ._configuration(_configuration)
              .amount(amount)
              .dueAmount(dueAmount)
              .gratuity(gratuity)
              .payments(payments)
              .refunds(refunds)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createDraftInvoice");
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
| **invoice** | [**Invoice**](Invoice.md)| The invoice details which includes all information of the invoice like items, billing information. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **0** | The default response. |  -  |

<a name="deleteDraftOrScheduledInvoice"></a>
# **deleteDraftOrScheduledInvoice**
> deleteDraftOrScheduledInvoice(invoiceId).execute();

Delete invoice

Deletes a draft or scheduled invoice, by ID. Deletes invoices in the draft or scheduled state only. For invoices that have already been sent, you can &lt;a href&#x3D;\&quot;/docs/api/invoicing/v2/#invoices_cancel\&quot;&gt;cancel the invoice&lt;/a&gt;. After you delete a draft or scheduled invoice, you can no longer use it or show its details. However, you can reuse its invoice number.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    try {
      client
              .invoices
              .deleteDraftOrScheduledInvoice(invoiceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteDraftOrScheduledInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .deleteDraftOrScheduledInvoice(invoiceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteDraftOrScheduledInvoice");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **0** | The default response. |  -  |

<a name="deleteExternalPayment"></a>
# **deleteExternalPayment**
> deleteExternalPayment(invoiceId, transactionId).execute();

Delete external payment

Deletes an external payment, by invoice ID and transaction ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String transactionId = "transactionId_example"; // The ID of the external refund transaction to delete.
    try {
      client
              .invoices
              .deleteExternalPayment(invoiceId, transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteExternalPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .deleteExternalPayment(invoiceId, transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteExternalPayment");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **0** | The default response. |  -  |

<a name="deleteExternalRefund"></a>
# **deleteExternalRefund**
> deleteExternalRefund(invoiceId, transactionId).execute();

Delete external refund

Deletes an external refund, by invoice ID and transaction ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String transactionId = "transactionId_example"; // The ID of the external refund transaction to delete.
    try {
      client
              .invoices
              .deleteExternalRefund(invoiceId, transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteExternalRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .deleteExternalRefund(invoiceId, transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteExternalRefund");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **transactionId** | **String**| The ID of the external refund transaction to delete. | |

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

<a name="generateNextInvoiceNumber"></a>
# **generateNextInvoiceNumber**
> InvoiceNumber generateNextInvoiceNumber().execute();

Generate invoice number

Generates the next invoice number that is available to the merchant. The next invoice number uses the prefix and suffix from the last invoice number and increments the number by one. For example, the next invoice number after &#x60;INVOICE-1234&#x60; is &#x60;INVOICE-1235&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    try {
      InvoiceNumber result = client
              .invoices
              .generateNextInvoiceNumber()
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoiceNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#generateNextInvoiceNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceNumber> response = client
              .invoices
              .generateNextInvoiceNumber()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#generateNextInvoiceNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InvoiceNumber**](InvoiceNumber.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the next invoice number. |  -  |
| **0** | The default response. |  -  |

<a name="generateQrCode"></a>
# **generateQrCode**
> generateQrCode(invoiceId).qrConfig(qrConfig).execute();

Generate QR code

Generates a QR code for an invoice, by ID. The QR code is a PNG image in &lt;a href&#x3D;\&quot;https://www.base64encode.org/\&quot;&gt;Base64-encoded&lt;/a&gt; format that corresponds to the invoice ID. You can generate a QR code for an invoice and add it to a paper or PDF invoice. When customers use their mobile devices to scan the QR code, they are redirected to the PayPal mobile payment flow where they can view the invoice and pay online with PayPal or a credit card. Before you get a QR code, you must &lt;a href&#x3D;\&quot;#invoices_create\&quot;&gt;create an invoice&lt;/a&gt; and &lt;a href&#x3D;\&quot;#invoices_send\&quot;&gt;send an invoice&lt;/a&gt; to move the invoice from a draft to payable state. Do not include an email address if you do not want the invoice emailed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    Integer width = 500; // The width, in pixels, of the QR code image. Value is from `150` to `500`.
    Integer height = 500; // The height, in pixels, of the QR code image. Value is from `150` to `500`.
    String action = "pay"; // The type of URL for which to generate a QR code. Valid values are `pay` and `details`.
    try {
      client
              .invoices
              .generateQrCode(invoiceId)
              .width(width)
              .height(height)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#generateQrCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .generateQrCode(invoiceId)
              .width(width)
              .height(height)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#generateQrCode");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **qrConfig** | [**QrConfig**](QrConfig.md)| Optional configuration parameters to adjust QR code width, height and the encoded URL. | [optional] |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/mixed, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows the QR code as a PNG image. |  -  |
| **0** | The default response. |  -  |

<a name="getDetails"></a>
# **getDetails**
> Invoice getDetails(invoiceId).execute();

Show invoice details

Shows details for an invoice, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    try {
      Invoice result = client
              .invoices
              .getDetails(invoiceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getParentId());
      System.out.println(result.getStatus());
      System.out.println(result.getDetail());
      System.out.println(result.getInvoicer());
      System.out.println(result.getPrimaryRecipients());
      System.out.println(result.getAdditionalRecipients());
      System.out.println(result.getItems());
      System.out.println(result.getConfiguration());
      System.out.println(result.getAmount());
      System.out.println(result.getDueAmount());
      System.out.println(result.getGratuity());
      System.out.println(result.getPayments());
      System.out.println(result.getRefunds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoice> response = client
              .invoices
              .getDetails(invoiceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getDetails");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows invoice details. |  -  |
| **0** | The default response. |  -  |

<a name="getInvoices"></a>
# **getInvoices**
> Invoices getInvoices().page(page).pageSize(pageSize).totalRequired(totalRequired).fields(fields).execute();

List invoices

Lists invoices. To filter the invoices that appear in the response, you can specify one or more optional query parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    Integer page = 1; // The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
    Integer pageSize = 20; // The maximum number of templates to return in the response.
    Boolean totalRequired = false; // Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
    String fields = "all"; // The fields to return in the response. Value is `all` or `none`. To return only the template name, ID, and default attributes, specify `none`.
    try {
      Invoices result = client
              .invoices
              .getInvoices()
              .page(page)
              .pageSize(pageSize)
              .totalRequired(totalRequired)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalPages());
      System.out.println(result.getTotalItems());
      System.out.println(result.getItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoices> response = client
              .invoices
              .getInvoices()
              .page(page)
              .pageSize(pageSize)
              .totalRequired(totalRequired)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoices");
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
| **page** | **Integer**| The page number to be retrieved, for the list of templates. So, a combination of &#x60;page&#x3D;1&#x60; and &#x60;page_size&#x3D;20&#x60; returns the first 20 templates. A combination of &#x60;page&#x3D;2&#x60; and &#x60;page_size&#x3D;20&#x60; returns the next 20 templates. | [optional] [default to 1] |
| **pageSize** | **Integer**| The maximum number of templates to return in the response. | [optional] [default to 20] |
| **totalRequired** | **Boolean**| Indicates whether the to show &lt;code&gt;total_pages&lt;/code&gt; and &lt;code&gt;total_items&lt;/code&gt; in the response. | [optional] [default to false] |
| **fields** | **String**| The fields to return in the response. Value is &#x60;all&#x60; or &#x60;none&#x60;. To return only the template name, ID, and default attributes, specify &#x60;none&#x60;. | [optional] [default to all] |

### Return type

[**Invoices**](Invoices.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists invoices with details. |  -  |
| **0** | The default response. |  -  |

<a name="recordPayment"></a>
# **recordPayment**
> PaymentReference recordPayment(invoiceId, paymentDetail).execute();

Record payment for invoice

Records a payment for the invoice. If no payment is due, the invoice is marked as &#x60;PAID&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY PAID&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    PaymentMethod method = PaymentMethod.fromValue("BANK_TRANSFER");
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    PaymentType type = PaymentType.fromValue("PAYPAL");
    String paymentId = "paymentId_example"; // The ID for a PayPal payment transaction. Required for the `PAYPAL` payment type.
    String paymentDate = "paymentDate_example"; // The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
    String note = "note_example"; // A note associated with an external cash or check payment.
    Money amount = new Money();
    ContactNameAddress shippingInfo = new ContactNameAddress();
    try {
      PaymentReference result = client
              .invoices
              .recordPayment(method, invoiceId)
              .type(type)
              .paymentId(paymentId)
              .paymentDate(paymentDate)
              .note(note)
              .amount(amount)
              .shippingInfo(shippingInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getPaymentId());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#recordPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentReference> response = client
              .invoices
              .recordPayment(method, invoiceId)
              .type(type)
              .paymentId(paymentId)
              .paymentDate(paymentDate)
              .note(note)
              .amount(amount)
              .shippingInfo(shippingInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#recordPayment");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **paymentDetail** | [**PaymentDetail**](PaymentDetail.md)| The details of the payment to record against the invoice. | |

### Return type

[**PaymentReference**](PaymentReference.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded payment. |  -  |
| **0** | The default response. |  -  |

<a name="recordRefund"></a>
# **recordRefund**
> RefundReference recordRefund(invoiceId, refundDetail).execute();

Record refund for invoice

Records a refund for the invoice. If all payments are refunded, the invoice is marked as &#x60;REFUNDED&#x60;. Otherwise, the invoice is marked as &#x60;PARTIALLY REFUNDED&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    PaymentMethod method = PaymentMethod.fromValue("BANK_TRANSFER");
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    PaymentType type = PaymentType.fromValue("PAYPAL");
    String refundId = "refundId_example"; // The ID for a PayPal payment transaction. Required for the `PAYPAL` payment type.
    String refundDate = "refundDate_example"; // The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
    Money amount = new Money();
    try {
      RefundReference result = client
              .invoices
              .recordRefund(method, invoiceId)
              .type(type)
              .refundId(refundId)
              .refundDate(refundDate)
              .amount(amount)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefundId());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#recordRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RefundReference> response = client
              .invoices
              .recordRefund(method, invoiceId)
              .type(type)
              .refundId(refundId)
              .refundDate(refundDate)
              .amount(amount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#recordRefund");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **refundDetail** | [**RefundDetail**](RefundDetail.md)| The details of the refund to record against the invoice. | |

### Return type

[**RefundReference**](RefundReference.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 Created&#x60; status code and a reference to the recorded refund. |  -  |
| **0** | The default response. |  -  |

<a name="sendInvoice"></a>
# **sendInvoice**
> LinkDescription sendInvoice(invoiceId).notification(notification).execute();

Send invoice

Sends or schedules an invoice, by ID, to be sent to a customer. The action depends on the invoice issue date:&lt;ul&gt;&lt;li&gt;If the invoice issue date is current or in the past, sends the invoice immediately.&lt;/li&gt;&lt;li&gt;If the invoice issue date is in the future, schedules the invoice to be sent on that date.&lt;/li&gt;&lt;/ul&gt;To suppress the merchant&#39;s email notification, set the &#x60;send_to_invoicer&#x60; body parameter to &#x60;false&#x60;. To send the invoice through a share link and not through PayPal, set the &lt;code&gt;send_to_recipient&lt;/code&gt; parameter to &lt;code&gt;false&lt;/code&gt; in the &lt;code&gt;notification&lt;/code&gt; object. The &lt;code&gt;send_to_recipient&lt;/code&gt; parameter does not apply to a future issue date because the invoice is scheduled to be sent through PayPal on that date.&lt;blockquote&gt;&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;After you send an invoice, resending it has no effect.&lt;/li&gt;&lt;li&gt;To send a notification for updates, &lt;a href&#x3D;\&quot;#invoices_update\&quot;&gt;update the invoice&lt;/a&gt; and set the &lt;code&gt;send_to_recipient&lt;/code&gt; body parameter to &lt;code&gt;true&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String subject = "subject_example"; // The subject of the email that is sent as a notification to the recipient.
    String note = "note_example"; // A note to the payer.
    Boolean sendToInvoicer = false; // Indicates whether to send a copy of the email to the merchant.
    Boolean sendToRecipient = true; // Indicates whether to send a copy of the email to the recipient.
    List<String> additionalRecipients = Arrays.asList(); // An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.<blockquote><strong>Note:</strong> Valid values are email addresses in the `additional_recipients` value associated with the invoice.</blockquote>
    try {
      LinkDescription result = client
              .invoices
              .sendInvoice(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getRel());
      System.out.println(result.getMethod());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#sendInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkDescription> response = client
              .invoices
              .sendInvoice(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#sendInvoice");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification to send to the payer when they send an invoice.. | [optional] |

### Return type

[**LinkDescription**](LinkDescription.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; when the invoice issue date is current date. |  -  |
| **202** | A successful request returns the HTTP &#x60;202 Accepted&#x60; status code with no JSON response body, when the invoice issue date is in future. |  -  |
| **0** | The default response. |  -  |

<a name="sendReminder"></a>
# **sendReminder**
> sendReminder(invoiceId).notification(notification).execute();

Send invoice reminder

Sends a reminder to the payer about an invoice, by ID. In the JSON request body, include a &#x60;notification&#x60; object that defines the subject of the reminder and other details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String subject = "subject_example"; // The subject of the email that is sent as a notification to the recipient.
    String note = "note_example"; // A note to the payer.
    Boolean sendToInvoicer = false; // Indicates whether to send a copy of the email to the merchant.
    Boolean sendToRecipient = true; // Indicates whether to send a copy of the email to the recipient.
    List<String> additionalRecipients = Arrays.asList(); // An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.<blockquote><strong>Note:</strong> Valid values are email addresses in the `additional_recipients` value associated with the invoice.</blockquote>
    try {
      client
              .invoices
              .sendReminder(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#sendReminder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .invoices
              .sendReminder(invoiceId)
              .subject(subject)
              .note(note)
              .sendToInvoicer(sendToInvoicer)
              .sendToRecipient(sendToRecipient)
              .additionalRecipients(additionalRecipients)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#sendReminder");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **notification** | [**Notification**](Notification.md)| The email or SMS notification that will be sent to the payer for reminder. | [optional] |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with no JSON response body. |  -  |
| **0** | The default response. |  -  |

<a name="updateFullInvoice"></a>
# **updateFullInvoice**
> Invoice updateFullInvoice(invoiceId, invoice).sendToRecipient(sendToRecipient).sendToInvoicer(sendToInvoicer).execute();

Fully update invoice

Fully updates an invoice, by ID. In the JSON request body, include a complete &#x60;invoice&#x60; object. This call does not support partial updates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceDetail detail = new InvoiceDetail();
    String invoiceId = "invoiceId_example"; // The ID of the draft invoice to delete.
    String id = "id_example"; // The ID of the invoice.
    String parentId = "parentId_example"; // The parent ID to an invoice that defines the group invoice to which the invoice is related.
    InvoiceStatus status = InvoiceStatus.fromValue("DRAFT");
    InvoicerInfo invoicer = new InvoicerInfo();
    List<RecipientInfo> primaryRecipients = Arrays.asList(); // The billing and shipping information. Includes name, email, address, phone and language.
    List<String> additionalRecipients = Arrays.asList(); // An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.<blockquote><strong>Note:</strong> Valid values are email addresses in the `additional_recipients` value associated with the invoice.</blockquote>
    List<Item> items = Arrays.asList(); // An array of invoice line item information.
    ModelConfiguration _configuration = new ModelConfiguration();
    AmountSummaryDetail amount = new AmountSummaryDetail();
    Money dueAmount = new Money();
    Money gratuity = new Money();
    Payments payments = new Payments();
    Refunds refunds = new Refunds();
    List<LinkDescription> links = Arrays.asList(); // An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
    Boolean sendToRecipient = true; // Indicates whether to send the invoice update notification to the recipient.
    Boolean sendToInvoicer = true; // Indicates whether to send the invoice update notification to the merchant.
    try {
      Invoice result = client
              .invoices
              .updateFullInvoice(detail, invoiceId)
              .id(id)
              .parentId(parentId)
              .status(status)
              .invoicer(invoicer)
              .primaryRecipients(primaryRecipients)
              .additionalRecipients(additionalRecipients)
              .items(items)
              ._configuration(_configuration)
              .amount(amount)
              .dueAmount(dueAmount)
              .gratuity(gratuity)
              .payments(payments)
              .refunds(refunds)
              .links(links)
              .sendToRecipient(sendToRecipient)
              .sendToInvoicer(sendToInvoicer)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getParentId());
      System.out.println(result.getStatus());
      System.out.println(result.getDetail());
      System.out.println(result.getInvoicer());
      System.out.println(result.getPrimaryRecipients());
      System.out.println(result.getAdditionalRecipients());
      System.out.println(result.getItems());
      System.out.println(result.getConfiguration());
      System.out.println(result.getAmount());
      System.out.println(result.getDueAmount());
      System.out.println(result.getGratuity());
      System.out.println(result.getPayments());
      System.out.println(result.getRefunds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateFullInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoice> response = client
              .invoices
              .updateFullInvoice(detail, invoiceId)
              .id(id)
              .parentId(parentId)
              .status(status)
              .invoicer(invoicer)
              .primaryRecipients(primaryRecipients)
              .additionalRecipients(additionalRecipients)
              .items(items)
              ._configuration(_configuration)
              .amount(amount)
              .dueAmount(dueAmount)
              .gratuity(gratuity)
              .payments(payments)
              .refunds(refunds)
              .links(links)
              .sendToRecipient(sendToRecipient)
              .sendToInvoicer(sendToInvoicer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateFullInvoice");
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
| **invoiceId** | **String**| The ID of the draft invoice to delete. | |
| **invoice** | [**Invoice**](Invoice.md)| A representation of changes to make in the invoice. | |
| **sendToRecipient** | **Boolean**| Indicates whether to send the invoice update notification to the recipient. | [optional] [default to true] |
| **sendToInvoicer** | **Boolean**| Indicates whether to send the invoice update notification to the merchant. | [optional] [default to true] |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code. A JSON response body that shows invoice details is returned if you set &lt;code&gt;prefer&#x3D;return&#x3D;representation&lt;/code&gt;. |  -  |
| **0** | The default response. |  -  |

