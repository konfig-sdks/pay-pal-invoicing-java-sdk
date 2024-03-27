

# Item

An array of invoice line item information. The maximum items for an invoice is `100`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The item description for the invoice line item. |  [optional] |
|**id** | **String** | The ID of the invoice line item. |  [optional] [readonly] |
|**name** | **String** | The item name for the invoice line item. |  |
|**quantity** | **String** | The quantity of the item that the invoicer provides to the payer. Value is from &#x60;-1000000&#x60; to &#x60;1000000&#x60;. Supports up to five decimal places. |  |
|**unitAmount** | [**Money**](Money.md) |  |  |
|**tax** | [**Tax**](Tax.md) |  |  [optional] |
|**itemDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**unitOfMeasure** | **UnitOfMeasure** |  |  [optional] |



