
# Endpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** | Name | 
**description** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**modifiedByApp** | **String** |  |  [optional]
**createdByApp** | **String** |  |  [optional]
**count** | **Integer** |  |  [optional]
**properties** | **Map&lt;String, Object&gt;** |  |  [optional]
**schema** | [**UriReference**](UriReference.md) | Schema | 
**enabled** | **Boolean** |  |  [optional]
**site** | [**UriReference**](UriReference.md) |  |  [optional]
**dids** | **List&lt;String&gt;** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



