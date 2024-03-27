

# InvoicesGetInvoices400Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**details** | **List&lt;Object&gt;** |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**links** | [**List&lt;ErrorLinkDescription&gt;**](ErrorLinkDescription.md) | An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS). |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| INVALID_REQUEST | &quot;INVALID_REQUEST&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| REQUEST_IS_NOT_WELL_FORMED_SYNTACTICALLY_INCORRECT_OR_VIOLATES_SCHEMA_ | &quot;Request is not well-formed, syntactically incorrect, or violates schema.&quot; |



