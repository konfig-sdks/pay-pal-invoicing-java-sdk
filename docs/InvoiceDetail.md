

# InvoiceDetail

The details of the invoice. Includes invoice number, date, payment terms, and audit metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference** | **String** | The reference data. Includes a post office (PO) number. |  [optional] |
|**currencyCode** | **String** | The [three-character ISO-4217 currency code](https://raw.githubusercontent.com) that identifies the currency. |  |
|**note** | **String** | A note to the invoice recipient. Also appears on the invoice notification email. |  [optional] |
|**termsAndConditions** | **String** | The general terms of the invoice. Can include return or cancellation policy and other terms and conditions. |  [optional] |
|**memo** | **String** | A private bookkeeping memo for the user. |  [optional] |
|**attachments** | [**List&lt;FileReference&gt;**](FileReference.md) | An array of PayPal IDs for the files that are attached to an invoice. |  [optional] |
|**invoiceNumber** | **String** | The invoice number. Default is the number that is auto-incremented number from the last number. |  [optional] |
|**invoiceDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**paymentTerm** | [**InvoicePaymentTerm**](InvoicePaymentTerm.md) |  |  [optional] |
|**metadata** | [**Metadata**](Metadata.md) |  |  [optional] |



