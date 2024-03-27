

# Template

The template with invoice details to load with all captured fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the template. |  [optional] [readonly] |
|**name** | **String** | The template name.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The template name must be unique.&lt;/blockquote&gt; |  [optional] |
|**defaultTemplate** | **Boolean** | Indicates whether this template is the default template. A invoicer can have one default template. |  [optional] |
|**templateInfo** | [**TemplateInfo**](TemplateInfo.md) |  |  [optional] |
|**settings** | [**TemplateSettings**](TemplateSettings.md) |  |  [optional] |
|**unitOfMeasure** | **UnitOfMeasure** |  |  [optional] |
|**standardTemplate** | **Boolean** | Indicates whether this template is a invoicer-created custom template. The system generates non-custom templates. |  [optional] [readonly] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |



