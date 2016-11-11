
# Site

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** | The name of the entity. | 
**description** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**modifiedByApp** | **String** |  |  [optional]
**createdByApp** | **String** |  |  [optional]
**primarySites** | [**List&lt;UriReference&gt;**](UriReference.md) |  |  [optional]
**secondarySites** | [**List&lt;UriReference&gt;**](UriReference.md) |  |  [optional]
**primaryEdges** | [**List&lt;Edge&gt;**](Edge.md) |  |  [optional]
**secondaryEdges** | [**List&lt;Edge&gt;**](Edge.md) |  |  [optional]
**addresses** | [**List&lt;Contact&gt;**](Contact.md) |  |  [optional]
**edges** | [**List&lt;Edge&gt;**](Edge.md) |  |  [optional]
**edgeAutoUpdateConfig** | [**EdgeAutoUpdateConfig**](EdgeAutoUpdateConfig.md) | Recurrance rule, time zone, and start/end settings for automatic edge updates for this site |  [optional]
**location** | [**UriReference**](UriReference.md) | Location | 
**managed** | **Boolean** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



