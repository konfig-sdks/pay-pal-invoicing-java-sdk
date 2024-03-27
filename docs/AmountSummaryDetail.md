

# AmountSummaryDetail

The invoice amount summary of item total, discount, tax total, and shipping.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currencyCode** | **String** | The [three-character ISO-4217 currency code](https://raw.githubusercontent.com) that identifies the currency. |  [optional] |
|**value** | **String** | The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like &#x60;JPY&#x60; that are not typically fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like &#x60;TND&#x60; that are subdivided into thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see [Currency Codes](https://raw.githubusercontent.com). |  [optional] |
|**breakdown** | [**AmountWithBreakdown**](AmountWithBreakdown.md) |  |  [optional] |



