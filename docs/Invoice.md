

# Invoice

The invoice details which includes all information of the invoice like items, billing information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the invoice. |  [optional] [readonly] |
|**parentId** | **String** | The parent ID to an invoice that defines the group invoice to which the invoice is related. |  [optional] [readonly] |
|**status** | **InvoiceStatus** |  |  [optional] |
|**detail** | [**InvoiceDetail**](InvoiceDetail.md) |  |  |
|**invoicer** | [**InvoicerInfo**](InvoicerInfo.md) |  |  [optional] |
|**primaryRecipients** | [**List&lt;RecipientInfo&gt;**](RecipientInfo.md) | The billing and shipping information. Includes name, email, address, phone and language. |  [optional] |
|**additionalRecipients** | **List&lt;String&gt;** | An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Valid values are email addresses in the &#x60;additional_recipients&#x60; value associated with the invoice.&lt;/blockquote&gt; |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) | An array of invoice line item information. |  [optional] |
|**_configuration** | [**ModelConfiguration**](ModelConfiguration.md) |  |  [optional] |
|**amount** | [**AmountSummaryDetail**](AmountSummaryDetail.md) |  |  [optional] |
|**dueAmount** | [**Money**](Money.md) |  |  [optional] |
|**gratuity** | [**Money**](Money.md) |  |  [optional] |
|**payments** | [**Payments**](Payments.md) |  |  [optional] |
|**refunds** | [**Refunds**](Refunds.md) |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |



