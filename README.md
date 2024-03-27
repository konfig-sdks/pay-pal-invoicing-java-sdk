<div align="left">

[![Visit Paypal](./header.png)](https://www.paypal.com&#x2F;)

# [Paypal](https://www.paypal.com&#x2F;)

Use the Invoicing API to create, send, and manage invoices. You can also use the API or webhooks to track invoice payments. When you send an invoice to a customer, the invoice moves from draft to payable state. PayPal then emails the customer a link to the invoice on the PayPal website. Customers with a PayPal account can log in and pay the invoice with PayPal. Alternatively, customers can pay as a guest with a debit card or credit card. For more information, see the <a href="/docs/invoicing/">Invoicing Overview</a> and the <a href="/docs/invoicing/basic-integration/">Invoicing Integration Guide</a>.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=PayPal&serviceName=Invoicing&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>pay-pal-invoicing-java-sdk</artifactId>
  <version>2.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:pay-pal-invoicing-java-sdk:2.3"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/pay-pal-invoicing-java-sdk-2.3.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api-m.sandbox.paypal.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InvoicesApi* | [**cancelSentInvoice**](docs/InvoicesApi.md#cancelSentInvoice) | **POST** /v2/invoicing/invoices/{invoice_id}/cancel | Cancel sent invoice
*InvoicesApi* | [**createDraftInvoice**](docs/InvoicesApi.md#createDraftInvoice) | **POST** /v2/invoicing/invoices | Create draft invoice
*InvoicesApi* | [**deleteDraftOrScheduledInvoice**](docs/InvoicesApi.md#deleteDraftOrScheduledInvoice) | **DELETE** /v2/invoicing/invoices/{invoice_id} | Delete invoice
*InvoicesApi* | [**deleteExternalPayment**](docs/InvoicesApi.md#deleteExternalPayment) | **DELETE** /v2/invoicing/invoices/{invoice_id}/payments/{transaction_id} | Delete external payment
*InvoicesApi* | [**deleteExternalRefund**](docs/InvoicesApi.md#deleteExternalRefund) | **DELETE** /v2/invoicing/invoices/{invoice_id}/refunds/{transaction_id} | Delete external refund
*InvoicesApi* | [**generateNextInvoiceNumber**](docs/InvoicesApi.md#generateNextInvoiceNumber) | **POST** /v2/invoicing/generate-next-invoice-number | Generate invoice number
*InvoicesApi* | [**generateQrCode**](docs/InvoicesApi.md#generateQrCode) | **POST** /v2/invoicing/invoices/{invoice_id}/generate-qr-code | Generate QR code
*InvoicesApi* | [**getDetails**](docs/InvoicesApi.md#getDetails) | **GET** /v2/invoicing/invoices/{invoice_id} | Show invoice details
*InvoicesApi* | [**getInvoices**](docs/InvoicesApi.md#getInvoices) | **GET** /v2/invoicing/invoices | List invoices
*InvoicesApi* | [**recordPayment**](docs/InvoicesApi.md#recordPayment) | **POST** /v2/invoicing/invoices/{invoice_id}/payments | Record payment for invoice
*InvoicesApi* | [**recordRefund**](docs/InvoicesApi.md#recordRefund) | **POST** /v2/invoicing/invoices/{invoice_id}/refunds | Record refund for invoice
*InvoicesApi* | [**sendInvoice**](docs/InvoicesApi.md#sendInvoice) | **POST** /v2/invoicing/invoices/{invoice_id}/send | Send invoice
*InvoicesApi* | [**sendReminder**](docs/InvoicesApi.md#sendReminder) | **POST** /v2/invoicing/invoices/{invoice_id}/remind | Send invoice reminder
*InvoicesApi* | [**updateFullInvoice**](docs/InvoicesApi.md#updateFullInvoice) | **PUT** /v2/invoicing/invoices/{invoice_id} | Fully update invoice
*SearchInvoicesApi* | [**list**](docs/SearchInvoicesApi.md#list) | **POST** /v2/invoicing/search-invoices | Search for invoices
*TemplatesApi* | [**createTemplate**](docs/TemplatesApi.md#createTemplate) | **POST** /v2/invoicing/templates | Create template
*TemplatesApi* | [**deleteById**](docs/TemplatesApi.md#deleteById) | **DELETE** /v2/invoicing/templates/{template_id} | Delete template
*TemplatesApi* | [**listDetails**](docs/TemplatesApi.md#listDetails) | **GET** /v2/invoicing/templates | List templates
*TemplatesApi* | [**showDetailsById**](docs/TemplatesApi.md#showDetailsById) | **GET** /v2/invoicing/templates/{template_id} | Show template details
*TemplatesApi* | [**updateFullTemplate**](docs/TemplatesApi.md#updateFullTemplate) | **PUT** /v2/invoicing/templates/{template_id} | Fully update template


## Documentation for Models

 - [AddressDetailsProperty](docs/AddressDetailsProperty.md)
 - [AddressPortable](docs/AddressPortable.md)
 - [AggregatedDiscount](docs/AggregatedDiscount.md)
 - [AmountRange](docs/AmountRange.md)
 - [AmountSummaryDetail](docs/AmountSummaryDetail.md)
 - [AmountWithBreakdown](docs/AmountWithBreakdown.md)
 - [BillingInfo](docs/BillingInfo.md)
 - [BillingInfoAllOf](docs/BillingInfoAllOf.md)
 - [BusinessName](docs/BusinessName.md)
 - [CANNOTCANCELDRAFTINVOICE](docs/CANNOTCANCELDRAFTINVOICE.md)
 - [CANNOTDELETEEXTERNALPAYMENT](docs/CANNOTDELETEEXTERNALPAYMENT.md)
 - [CANNOTREMINDINVOICE](docs/CANNOTREMINDINVOICE.md)
 - [ConfigurationAllOf](docs/ConfigurationAllOf.md)
 - [ContactNameAddress](docs/ContactNameAddress.md)
 - [ContactNameAddressAllOf](docs/ContactNameAddressAllOf.md)
 - [CustomAmount](docs/CustomAmount.md)
 - [DateRange](docs/DateRange.md)
 - [DateTimeRange](docs/DateTimeRange.md)
 - [Detail](docs/Detail.md)
 - [Discount](docs/Discount.md)
 - [Error401](docs/Error401.md)
 - [Error409](docs/Error409.md)
 - [Error415](docs/Error415.md)
 - [Error500](docs/Error500.md)
 - [Error503](docs/Error503.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorLinkDescription](docs/ErrorLinkDescription.md)
 - [FileReference](docs/FileReference.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceCreationFlow](docs/InvoiceCreationFlow.md)
 - [InvoiceDetail](docs/InvoiceDetail.md)
 - [InvoiceDetailAllOf](docs/InvoiceDetailAllOf.md)
 - [InvoiceNumber](docs/InvoiceNumber.md)
 - [InvoicePaymentTerm](docs/InvoicePaymentTerm.md)
 - [InvoicePaymentTermAllOf](docs/InvoicePaymentTermAllOf.md)
 - [InvoiceStatus](docs/InvoiceStatus.md)
 - [InvoicerInfo](docs/InvoicerInfo.md)
 - [InvoicerInfoAllOf](docs/InvoicerInfoAllOf.md)
 - [Invoices](docs/Invoices.md)
 - [InvoicesCancel400](docs/InvoicesCancel400.md)
 - [InvoicesCancel422](docs/InvoicesCancel422.md)
 - [InvoicesCancelSentInvoice403Response](docs/InvoicesCancelSentInvoice403Response.md)
 - [InvoicesCancelSentInvoice422Response](docs/InvoicesCancelSentInvoice422Response.md)
 - [InvoicesCancelSentInvoiceResponse](docs/InvoicesCancelSentInvoiceResponse.md)
 - [InvoicesCreate400](docs/InvoicesCreate400.md)
 - [InvoicesCreateDraftInvoice400Response](docs/InvoicesCreateDraftInvoice400Response.md)
 - [InvoicesCreateDraftInvoice422Response](docs/InvoicesCreateDraftInvoice422Response.md)
 - [InvoicesCreateDraftInvoiceResponse](docs/InvoicesCreateDraftInvoiceResponse.md)
 - [InvoicesDeleteDraftOrScheduledInvoiceResponse](docs/InvoicesDeleteDraftOrScheduledInvoiceResponse.md)
 - [InvoicesDeleteExternalPayment422Response](docs/InvoicesDeleteExternalPayment422Response.md)
 - [InvoicesDeleteExternalPaymentResponse](docs/InvoicesDeleteExternalPaymentResponse.md)
 - [InvoicesDeleteExternalRefund403Response](docs/InvoicesDeleteExternalRefund403Response.md)
 - [InvoicesDeleteExternalRefundResponse](docs/InvoicesDeleteExternalRefundResponse.md)
 - [InvoicesGenerateQrCode400](docs/InvoicesGenerateQrCode400.md)
 - [InvoicesGenerateQrCode403Response](docs/InvoicesGenerateQrCode403Response.md)
 - [InvoicesGenerateQrCodeResponse](docs/InvoicesGenerateQrCodeResponse.md)
 - [InvoicesGetDetailsResponse](docs/InvoicesGetDetailsResponse.md)
 - [InvoicesGetInvoices400Response](docs/InvoicesGetInvoices400Response.md)
 - [InvoicesGetInvoicesResponse](docs/InvoicesGetInvoicesResponse.md)
 - [InvoicesPayments400](docs/InvoicesPayments400.md)
 - [InvoicesPayments422](docs/InvoicesPayments422.md)
 - [InvoicesPaymentsDelete422](docs/InvoicesPaymentsDelete422.md)
 - [InvoicesRecordPayment400Response](docs/InvoicesRecordPayment400Response.md)
 - [InvoicesRecordPayment403Response](docs/InvoicesRecordPayment403Response.md)
 - [InvoicesRecordPayment422Response](docs/InvoicesRecordPayment422Response.md)
 - [InvoicesRecordPaymentResponse](docs/InvoicesRecordPaymentResponse.md)
 - [InvoicesRecordRefund400Response](docs/InvoicesRecordRefund400Response.md)
 - [InvoicesRecordRefund403Response](docs/InvoicesRecordRefund403Response.md)
 - [InvoicesRecordRefund422Response](docs/InvoicesRecordRefund422Response.md)
 - [InvoicesRecordRefundResponse](docs/InvoicesRecordRefundResponse.md)
 - [InvoicesRefunds400](docs/InvoicesRefunds400.md)
 - [InvoicesRefunds422](docs/InvoicesRefunds422.md)
 - [InvoicesRemind400](docs/InvoicesRemind400.md)
 - [InvoicesRemind422](docs/InvoicesRemind422.md)
 - [InvoicesSearchInvoices400](docs/InvoicesSearchInvoices400.md)
 - [InvoicesSendReminder400Response](docs/InvoicesSendReminder400Response.md)
 - [InvoicesSendReminder403Response](docs/InvoicesSendReminder403Response.md)
 - [InvoicesSendReminder422Response](docs/InvoicesSendReminder422Response.md)
 - [InvoicesSendReminderResponse](docs/InvoicesSendReminderResponse.md)
 - [InvoicesUpdate400](docs/InvoicesUpdate400.md)
 - [InvoicesUpdateFullInvoice400Response](docs/InvoicesUpdateFullInvoice400Response.md)
 - [InvoicesUpdateFullInvoice403Response](docs/InvoicesUpdateFullInvoice403Response.md)
 - [InvoicesUpdateFullInvoice422Response](docs/InvoicesUpdateFullInvoice422Response.md)
 - [InvoicesUpdateFullInvoiceResponse](docs/InvoicesUpdateFullInvoiceResponse.md)
 - [Item](docs/Item.md)
 - [LinkDescription](docs/LinkDescription.md)
 - [Metadata](docs/Metadata.md)
 - [MetadataAllOf](docs/MetadataAllOf.md)
 - [Model202Response](docs/Model202Response.md)
 - [Model400](docs/Model400.md)
 - [Model403](docs/Model403.md)
 - [Model422](docs/Model422.md)
 - [ModelConfiguration](docs/ModelConfiguration.md)
 - [Money](docs/Money.md)
 - [Name](docs/Name.md)
 - [Notification](docs/Notification.md)
 - [PERMISSIONDENIED](docs/PERMISSIONDENIED.md)
 - [PERMISSIONDENIED1](docs/PERMISSIONDENIED1.md)
 - [PartialPayment](docs/PartialPayment.md)
 - [PaymentDetail](docs/PaymentDetail.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentReference](docs/PaymentReference.md)
 - [PaymentTerm](docs/PaymentTerm.md)
 - [PaymentTermType](docs/PaymentTermType.md)
 - [PaymentType](docs/PaymentType.md)
 - [Payments](docs/Payments.md)
 - [Phone](docs/Phone.md)
 - [PhoneDetail](docs/PhoneDetail.md)
 - [PhoneDetailAllOf](docs/PhoneDetailAllOf.md)
 - [PhoneType](docs/PhoneType.md)
 - [QrConfig](docs/QrConfig.md)
 - [RecipientInfo](docs/RecipientInfo.md)
 - [RefundDetail](docs/RefundDetail.md)
 - [RefundReference](docs/RefundReference.md)
 - [Refunds](docs/Refunds.md)
 - [SearchData](docs/SearchData.md)
 - [SearchinvoicesList400Response](docs/SearchinvoicesList400Response.md)
 - [SearchinvoicesListResponse](docs/SearchinvoicesListResponse.md)
 - [ShippingCost](docs/ShippingCost.md)
 - [Tax](docs/Tax.md)
 - [Template](docs/Template.md)
 - [TemplateConfiguration](docs/TemplateConfiguration.md)
 - [TemplateDetail](docs/TemplateDetail.md)
 - [TemplateDetailAllOf](docs/TemplateDetailAllOf.md)
 - [TemplateDisplayPreference](docs/TemplateDisplayPreference.md)
 - [TemplateInfo](docs/TemplateInfo.md)
 - [TemplateItemField](docs/TemplateItemField.md)
 - [TemplateItemSetting](docs/TemplateItemSetting.md)
 - [TemplateMetadata](docs/TemplateMetadata.md)
 - [TemplateSettings](docs/TemplateSettings.md)
 - [TemplateSubtotalField](docs/TemplateSubtotalField.md)
 - [TemplateSubtotalSetting](docs/TemplateSubtotalSetting.md)
 - [Templates](docs/Templates.md)
 - [TemplatesCreate400](docs/TemplatesCreate400.md)
 - [TemplatesCreate422](docs/TemplatesCreate422.md)
 - [TemplatesCreateTemplate400Response](docs/TemplatesCreateTemplate400Response.md)
 - [TemplatesCreateTemplate422Response](docs/TemplatesCreateTemplate422Response.md)
 - [TemplatesCreateTemplateResponse](docs/TemplatesCreateTemplateResponse.md)
 - [TemplatesDelete403](docs/TemplatesDelete403.md)
 - [TemplatesDeleteById403Response](docs/TemplatesDeleteById403Response.md)
 - [TemplatesDeleteByIdResponse](docs/TemplatesDeleteByIdResponse.md)
 - [TemplatesGet403](docs/TemplatesGet403.md)
 - [TemplatesListDetails400Response](docs/TemplatesListDetails400Response.md)
 - [TemplatesListDetailsResponse](docs/TemplatesListDetailsResponse.md)
 - [TemplatesShowDetailsById403Response](docs/TemplatesShowDetailsById403Response.md)
 - [TemplatesShowDetailsByIdResponse](docs/TemplatesShowDetailsByIdResponse.md)
 - [TemplatesUpdate400](docs/TemplatesUpdate400.md)
 - [TemplatesUpdate422](docs/TemplatesUpdate422.md)
 - [TemplatesUpdateFullTemplate403Response](docs/TemplatesUpdateFullTemplate403Response.md)
 - [TemplatesUpdateFullTemplate422Response](docs/TemplatesUpdateFullTemplate422Response.md)
 - [TemplatesUpdateFullTemplateResponse](docs/TemplatesUpdateFullTemplateResponse.md)
 - [USERNOTFOUND](docs/USERNOTFOUND.md)
 - [UnitOfMeasure](docs/UnitOfMeasure.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
