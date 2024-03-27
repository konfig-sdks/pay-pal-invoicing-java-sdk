

# Notification

The email or SMS notification to send to the invoicer or payer on sending an invoice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | The subject of the email that is sent as a notification to the recipient. |  [optional] |
|**note** | **String** | A note to the payer. |  [optional] |
|**sendToInvoicer** | **Boolean** | Indicates whether to send a copy of the email to the merchant. |  [optional] |
|**sendToRecipient** | **Boolean** | Indicates whether to send a copy of the email to the recipient. |  [optional] |
|**additionalRecipients** | **List&lt;String&gt;** | An array of one or more CC: emails to which notifications are sent. If you omit this parameter, a notification is sent to all CC: email addresses that are part of the invoice.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Valid values are email addresses in the &#x60;additional_recipients&#x60; value associated with the invoice.&lt;/blockquote&gt; |  [optional] |



