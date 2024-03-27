

# AddressPortable

The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine1** | **String** | The first line of the address. For example, number or street. For example, &#x60;173 Drury Lane&#x60;. Required for data entry and compliance and risk checks. Must contain the full address. |  [optional] |
|**addressLine2** | **String** | The second line of the address. For example, suite or apartment number. |  [optional] |
|**addressLine3** | **String** | The third line of the address, if needed. For example, a street complement for Brazil, direction text, such as &#x60;next to Walmart&#x60;, or a landmark in an Indian address. |  [optional] |
|**adminArea4** | **String** | The neighborhood, ward, or district. Smaller than &#x60;admin_area_level_3&#x60; or &#x60;sub_locality&#x60;. Value is:&lt;ul&gt;&lt;li&gt;The postal sorting code for Guernsey and many French territories, such as French Guiana.&lt;/li&gt;&lt;li&gt;The fine-grained administrative levels in China.&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**adminArea3** | **String** | A sub-locality, suburb, neighborhood, or district. Smaller than &#x60;admin_area_level_2&#x60;. Value is:&lt;ul&gt;&lt;li&gt;Brazil. Suburb, bairro, or neighborhood.&lt;/li&gt;&lt;li&gt;India. Sub-locality or district. Street name information is not always available but a sub-locality or district can be a very small area.&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**adminArea2** | **String** | A city, town, or village. Smaller than &#x60;admin_area_level_1&#x60;. |  [optional] |
|**adminArea1** | **String** | The highest level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. Format for postal delivery. For example, &#x60;CA&#x60; and not &#x60;California&#x60;. Value, by country, is:&lt;ul&gt;&lt;li&gt;UK. A county.&lt;/li&gt;&lt;li&gt;US. A state.&lt;/li&gt;&lt;li&gt;Canada. A province.&lt;/li&gt;&lt;li&gt;Japan. A prefecture.&lt;/li&gt;&lt;li&gt;Switzerland. A kanton.&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**postalCode** | **String** | The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code). |  [optional] |
|**countryCode** | **String** | The [two-character ISO 3166-1 code](https://raw.githubusercontent.com) that identifies the country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that country. Use the &#x60;C2&#x60; country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt; |  |
|**addressDetails** | [**AddressDetailsProperty**](AddressDetailsProperty.md) |  |  [optional] |



