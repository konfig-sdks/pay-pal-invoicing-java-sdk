

# Error503

The server is temporarily unable to handle the request, for example, because of planned maintenance or downtime.

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
| SERVICE_UNAVAILABLE | &quot;SERVICE_UNAVAILABLE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| SERVICE_UNAVAILABLE_ | &quot;Service Unavailable.&quot; |



