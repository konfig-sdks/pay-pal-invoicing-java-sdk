

# ErrorDetails

The error details. Required for client-side `4XX` errors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. |  [optional] |
|**field** | **String** | The field that caused the error. If this field is in the body, set this value to the field&#39;s JSON pointer value. Required for client-side errors. |  [optional] |
|**value** | **String** | The value of the field that caused the error. |  [optional] |
|**location** | **String** | The location of the field that caused the error. Value is &#x60;body&#x60;, &#x60;path&#x60;, or &#x60;query&#x60;. |  [optional] |
|**issue** | **String** | The unique, fine-grained application-level error code. |  |



