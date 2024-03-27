# SearchInvoicesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](SearchInvoicesApi.md#list) | **POST** /v2/invoicing/search-invoices | Search for invoices |


<a name="list"></a>
# **list**
> Invoices list().page(page).pageSize(pageSize).totalRequired(totalRequired).searchData(searchData).execute();

Search for invoices

Searches for and lists invoices that match search criteria. If you pass multiple criteria, the response lists invoices that match all criteria.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalInvoicing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchInvoicesApi;
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
    String recipientEmail = "recipientEmail_example"; // Filters the search by the email address.
    String recipientFirstName = "recipientFirstName_example"; // Filters the search by the recipient first name.
    String recipientLastName = "recipientLastName_example"; // Filters the search by the recipient last name.
    String recipientBusinessName = "recipientBusinessName_example"; // Filters the search by the recipient business name.
    String invoiceNumber = "invoiceNumber_example"; // Filters the search by the invoice number.
    List<InvoiceStatus> status = Arrays.asList(); // An array of status values.
    String reference = "reference_example"; // The reference data, such as a PO number.
    String currencyCode = "currencyCode_example"; // The [three-character ISO-4217 currency code](https://raw.githubusercontent.com) that identifies the currency.
    String memo = "memo_example"; // A private bookkeeping memo for the user.
    AmountRange totalAmountRange = new AmountRange();
    DateRange invoiceDateRange = new DateRange();
    DateRange dueDateRange = new DateRange();
    DateTimeRange paymentDateRange = new DateTimeRange();
    DateTimeRange creationDateRange = new DateTimeRange();
    Boolean archived = true; // Indicates whether to list merchant-archived invoices in the response. Value is:<ul><li><code>true</code>. Response lists only merchant-archived invoices.</li><li><code>false</code>. Response lists only unarchived invoices.</li><li><code>null</code>. Response lists all invoices.</li></ul>
    List<String> fields = Arrays.asList(); // A CSV file of fields to return for the user, if available. Because the invoice object can be very large, field filtering is required. Valid collection fields are <code>items</code>, <code>payments</code>, <code>refunds</code>, <code>additional_recipients_info</code>, and <code>attachments</code>.
    Integer page = 1; // The page number to be retrieved, for the list of templates. So, a combination of `page=1` and `page_size=20` returns the first 20 templates. A combination of `page=2` and `page_size=20` returns the next 20 templates.
    Integer pageSize = 20; // The maximum number of templates to return in the response.
    Boolean totalRequired = false; // Indicates whether the to show <code>total_pages</code> and <code>total_items</code> in the response.
    try {
      Invoices result = client
              .searchInvoices
              .list()
              .recipientEmail(recipientEmail)
              .recipientFirstName(recipientFirstName)
              .recipientLastName(recipientLastName)
              .recipientBusinessName(recipientBusinessName)
              .invoiceNumber(invoiceNumber)
              .status(status)
              .reference(reference)
              .currencyCode(currencyCode)
              .memo(memo)
              .totalAmountRange(totalAmountRange)
              .invoiceDateRange(invoiceDateRange)
              .dueDateRange(dueDateRange)
              .paymentDateRange(paymentDateRange)
              .creationDateRange(creationDateRange)
              .archived(archived)
              .fields(fields)
              .page(page)
              .pageSize(pageSize)
              .totalRequired(totalRequired)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalPages());
      System.out.println(result.getTotalItems());
      System.out.println(result.getItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchInvoicesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoices> response = client
              .searchInvoices
              .list()
              .recipientEmail(recipientEmail)
              .recipientFirstName(recipientFirstName)
              .recipientLastName(recipientLastName)
              .recipientBusinessName(recipientBusinessName)
              .invoiceNumber(invoiceNumber)
              .status(status)
              .reference(reference)
              .currencyCode(currencyCode)
              .memo(memo)
              .totalAmountRange(totalAmountRange)
              .invoiceDateRange(invoiceDateRange)
              .dueDateRange(dueDateRange)
              .paymentDateRange(paymentDateRange)
              .creationDateRange(creationDateRange)
              .archived(archived)
              .fields(fields)
              .page(page)
              .pageSize(pageSize)
              .totalRequired(totalRequired)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchInvoicesApi#list");
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
| **searchData** | [**SearchData**](SearchData.md)| The invoice search can be used to retrieve the invoices based on the search parameters. | [optional] |

### Return type

[**Invoices**](Invoices.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/mixed

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that lists the invoices that match the search criteria. |  -  |
| **0** | The default response. |  -  |

