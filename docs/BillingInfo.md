

# BillingInfo

The billing information of the invoice recipient. Includes name, address, email, phone, and language.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessName** | **String** | Required. The business name of the party. |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**address** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**phones** | [**List&lt;PhoneDetail&gt;**](PhoneDetail.md) | The invoice recipient&#39;s phone numbers. Extension number is not supported. |  [optional] |
|**additionalInfo** | **String** | Any additional information about the recipient. |  [optional] |
|**language** | **String** | The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com). |  [optional] |



