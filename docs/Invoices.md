

# Invoices

An array of merchant invoices. Includes the total invoices count and [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links) for navigation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalPages** | **Integer** | The total number of pages that are available for the search criteria. &lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Clients MUST NOT assume that the value of total_pages is constant. The value MAY change from one request to the next&lt;/blockquote&gt; |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of invoices that match the search criteria.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Clients MUST NOT assume that the value of &lt;code&gt;total_items&lt;/code&gt; is constant. The value MAY change from one request to the next.&lt;/blockquote&gt; |  [optional] [readonly] |
|**items** | [**List&lt;Invoice&gt;**](Invoice.md) | The list of invoices that match the search criteria. |  [optional] [readonly] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |



