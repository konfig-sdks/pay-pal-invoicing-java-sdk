

# Error409

The server has detected a conflict while processing this request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**details** | [**List&lt;ErrorDetails&gt;**](ErrorDetails.md) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**links** | [**List&lt;ErrorLinkDescription&gt;**](ErrorLinkDescription.md) | An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS). |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| RESOURCE_CONFLICT | &quot;RESOURCE_CONFLICT&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SERVER_HAS_DETECTED_A_CONFLICT_WHILE_PROCESSING_THIS_REQUEST_ | &quot;The server has detected a conflict while processing this request.&quot; |



