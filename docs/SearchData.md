

# SearchData

The invoice search parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientEmail** | **String** | Filters the search by the email address. |  [optional] |
|**recipientFirstName** | **String** | Filters the search by the recipient first name. |  [optional] |
|**recipientLastName** | **String** | Filters the search by the recipient last name. |  [optional] |
|**recipientBusinessName** | **String** | Filters the search by the recipient business name. |  [optional] |
|**invoiceNumber** | **String** | Filters the search by the invoice number. |  [optional] |
|**status** | **List&lt;InvoiceStatus&gt;** | An array of status values. |  [optional] |
|**reference** | **String** | The reference data, such as a PO number. |  [optional] |
|**currencyCode** | **String** | The [three-character ISO-4217 currency code](https://raw.githubusercontent.com) that identifies the currency. |  [optional] |
|**memo** | **String** | A private bookkeeping memo for the user. |  [optional] |
|**totalAmountRange** | [**AmountRange**](AmountRange.md) |  |  [optional] |
|**invoiceDateRange** | [**DateRange**](DateRange.md) |  |  [optional] |
|**dueDateRange** | [**DateRange**](DateRange.md) |  |  [optional] |
|**paymentDateRange** | [**DateTimeRange**](DateTimeRange.md) |  |  [optional] |
|**creationDateRange** | [**DateTimeRange**](DateTimeRange.md) |  |  [optional] |
|**archived** | **Boolean** | Indicates whether to list merchant-archived invoices in the response. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;true&lt;/code&gt;. Response lists only merchant-archived invoices.&lt;/li&gt;&lt;li&gt;&lt;code&gt;false&lt;/code&gt;. Response lists only unarchived invoices.&lt;/li&gt;&lt;li&gt;&lt;code&gt;null&lt;/code&gt;. Response lists all invoices.&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**fields** | **List&lt;String&gt;** | A CSV file of fields to return for the user, if available. Because the invoice object can be very large, field filtering is required. Valid collection fields are &lt;code&gt;items&lt;/code&gt;, &lt;code&gt;payments&lt;/code&gt;, &lt;code&gt;refunds&lt;/code&gt;, &lt;code&gt;additional_recipients_info&lt;/code&gt;, and &lt;code&gt;attachments&lt;/code&gt;. |  [optional] |



