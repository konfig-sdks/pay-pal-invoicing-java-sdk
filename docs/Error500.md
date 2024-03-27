

# Error500

This is either a system or application error, and generally indicates that although the client appeared to provide a correct request, something unexpected has gone wrong on the server.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**links** | [**List&lt;ErrorLinkDescription&gt;**](ErrorLinkDescription.md) | An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS). |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| INTERNAL_SERVER_ERROR | &quot;INTERNAL_SERVER_ERROR&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AN_INTERNAL_SERVER_ERROR_OCCURRED_ | &quot;An internal server error occurred.&quot; |



