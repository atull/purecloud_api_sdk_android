
# Line

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
**properties** | **Map&lt;String, Object&gt;** |  |  [optional]
**edgeGroup** | [**UriReference**](UriReference.md) |  |  [optional]
**template** | [**UriReference**](UriReference.md) |  |  [optional]
**site** | [**UriReference**](UriReference.md) |  |  [optional]
**lineBaseSettings** | [**UriReference**](UriReference.md) |  |  [optional]
**primaryEdge** | [**Edge**](Edge.md) |  |  [optional]
**secondaryEdge** | [**Edge**](Edge.md) |  |  [optional]
**loggedInUser** | [**UriReference**](UriReference.md) |  |  [optional]
**defaultForUser** | [**UriReference**](UriReference.md) |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



