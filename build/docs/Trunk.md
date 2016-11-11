
# Trunk

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
**trunkType** | [**TrunkTypeEnum**](#TrunkTypeEnum) | The type of this trunk. |  [optional]
**edge** | [**UriReference**](UriReference.md) | The Edge using this trunk. |  [optional]
**trunkBase** | [**UriReference**](UriReference.md) | The trunk base configuration used on this trunk. |  [optional]
**trunkMetabase** | [**UriReference**](UriReference.md) | The metabase used to create this trunk. |  [optional]
**edgeGroup** | [**UriReference**](UriReference.md) | The edge group associated with this trunk. |  [optional]
**enabled** | **Boolean** | True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="TrunkTypeEnum"></a>
## Enum: TrunkTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
EXTERNAL | &quot;EXTERNAL&quot;
PHONE | &quot;PHONE&quot;
EDGE | &quot;EDGE&quot;



