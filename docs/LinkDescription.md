

# LinkDescription

The request-related [HATEOAS link](/docs/api/reference/api-responses/#hateoas-links) information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the &#x60;$&#x60;, &#x60;(&#x60;, and &#x60;)&#x60; characters. The &#x60;href&#x60; is the key HATEOAS component that links a completed call with a subsequent call. |  |
|**rel** | **String** | The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml). |  |
|**method** | [**MethodEnum**](#MethodEnum) | The HTTP method required to make the related call. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| DELETE | &quot;DELETE&quot; |
| HEAD | &quot;HEAD&quot; |
| CONNECT | &quot;CONNECT&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| PATCH | &quot;PATCH&quot; |



