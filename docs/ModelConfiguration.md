

# ModelConfiguration

The invoice configuration details. Includes partial payment, tip, and tax calculated after discount.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taxCalculatedAfterDiscount** | **Boolean** | Indicates whether the tax is calculated before or after a discount. If &#x60;false&#x60;, the tax is calculated before a discount. If &#x60;true&#x60;, the tax is calculated after a discount. |  [optional] |
|**taxInclusive** | **Boolean** | Indicates whether the unit price includes tax. |  [optional] |
|**allowTip** | **Boolean** | Indicates whether the invoice enables the customer to enter a tip amount during payment. If &#x60;true&#x60;, the invoice shows a tip amount field so that the customer can enter a tip amount. If &#x60;false&#x60;, the invoice does not show a tip amount field.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature is not available for users in &#x60;Hong Kong&#x60;, &#x60;Taiwan&#x60;, &#x60;India&#x60;, or &#x60;Japan&#x60;.&lt;/blockquote&gt; |  [optional] |
|**partialPayment** | [**PartialPayment**](PartialPayment.md) |  |  [optional] |
|**templateId** | **String** | The template ID. The template determines the layout of the invoice. Includes which fields to show and hide. |  [optional] |



