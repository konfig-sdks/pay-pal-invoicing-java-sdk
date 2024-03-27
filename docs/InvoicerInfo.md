

# InvoicerInfo

The invoicer business information that appears on the invoice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessName** | **String** | Required. The business name of the party. |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**address** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**phones** | [**List&lt;PhoneDetail&gt;**](PhoneDetail.md) | An array of invoicer&#39;s phone numbers. The invoicer can choose to hide the phone number on the invoice. |  [optional] |
|**website** | **URI** | The invoicer&#39;s website. |  [optional] |
|**taxId** | **String** | The invoicer&#39;s tax ID. |  [optional] |
|**additionalNotes** | **String** | Any additional information. Includes business hours. |  [optional] |
|**logoUrl** | **URI** | The full URL to an external logo image. The logo image must not be larger than 250 pixels wide by 90 pixels high. |  [optional] |



