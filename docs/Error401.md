

# Error401

Authentication failed due to missing Authorization header, or invalid authentication credentials.

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
| AUTHENTICATION_FAILURE | &quot;AUTHENTICATION_FAILURE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AUTHENTICATION_FAILED_DUE_TO_MISSING_AUTHORIZATION_HEADER_OR_INVALID_AUTHENTICATION_CREDENTIALS_ | &quot;Authentication failed due to missing authorization header, or invalid authentication credentials.&quot; |



