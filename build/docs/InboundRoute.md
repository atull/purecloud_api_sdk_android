
# InboundRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**pattern** | **String** | The search pattern that the mailbox name should match. |  [optional]
**queue** | [**UriReference**](UriReference.md) | The queue to route the emails to. |  [optional]
**priority** | **Integer** | The priority to use for routing. |  [optional]
**skills** | [**List&lt;UriReference&gt;**](UriReference.md) | The skills to use for routing. |  [optional]
**language** | [**UriReference**](UriReference.md) | The language to use for routing. |  [optional]
**fromName** | **String** | The sender name to use for outgoing replies. |  [optional]
**fromEmail** | **String** | The sender email to use for outgoing replies. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]



