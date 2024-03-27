

# TemplateInfo

The template details. Includes invoicer business information, invoice recipients, items, and configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detail** | [**TemplateDetail**](TemplateDetail.md) |  |  [optional] |
|**invoicer** | [**InvoicerInfo**](InvoicerInfo.md) |  |  [optional] |
|**primaryRecipients** | [**List&lt;RecipientInfo&gt;**](RecipientInfo.md) | The billing and shipping information. Includes name, email, address, phone, and language. |  [optional] |
|**additionalRecipients** | **List&lt;String&gt;** | An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Valid values are email addresses in the &#x60;additional_recipients&#x60; value associated with the invoice.&lt;/blockquote&gt; |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) | An array of invoice line-item information. |  [optional] |
|**_configuration** | [**TemplateConfiguration**](TemplateConfiguration.md) |  |  [optional] |
|**amount** | [**AmountSummaryDetail**](AmountSummaryDetail.md) |  |  [optional] |
|**dueAmount** | [**Money**](Money.md) |  |  [optional] |



