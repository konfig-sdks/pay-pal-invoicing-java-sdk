

# MetadataAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**cancelledBy** | **String** | The actor who canceled the resource. |  [optional] [readonly] |
|**firstSentTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**lastSentTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**lastSentBy** | **String** | The email address of the account that last sent the resource. |  [optional] [readonly] |
|**createdByFlow** | **InvoiceCreationFlow** |  |  [optional] |
|**recipientViewUrl** | **URI** | The URL for the invoice payer view hosted on paypal.com. |  [optional] [readonly] |
|**invoicerViewUrl** | **URI** | The URL for the invoice merchant view hosted on paypal.com. |  [optional] [readonly] |



