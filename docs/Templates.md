

# Templates

An array of merchant-created templates with associated details that include the emails, addresses, and phone numbers from the user's PayPal profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addresses** | [**List&lt;AddressPortable&gt;**](AddressPortable.md) | An array of addresses in the user&#39;s PayPal profile. |  [optional] [readonly] |
|**emails** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**phones** | [**List&lt;PhoneDetail&gt;**](PhoneDetail.md) | An array of phone numbers in the user&#39;s PayPal profile. |  [optional] |
|**templates** | [**List&lt;Template&gt;**](Template.md) | An array of details for each template. If &#x60;fields&#x60; is &#x60;none&#x60;, returns only the template name, ID, and default status. |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |



