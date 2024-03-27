

# Error415

The server does not support the request payload's media type.

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
| UNSUPPORTED_MEDIA_TYPE | &quot;UNSUPPORTED_MEDIA_TYPE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SERVER_DOES_NOT_SUPPORT_THE_REQUEST_PAYLOAD_S_MEDIA_TYPE_ | &quot;The server does not support the request payload&#39;s media type.&quot; |



