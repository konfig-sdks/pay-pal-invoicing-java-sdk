

# InvoicePaymentTerm

The payment term of the invoice. Payment can be due upon receipt, a specified date, or in a set number of days.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**termType** | **PaymentTermType** |  |  [optional] |
|**dueDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |



