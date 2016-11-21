
# OrphanRecording

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**createdTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**recoveredTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**providerType** | [**ProviderTypeEnum**](#ProviderTypeEnum) |  |  [optional]
**mediaSizeBytes** | **Long** |  |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional]
**fileState** | [**FileStateEnum**](#FileStateEnum) |  |  [optional]
**providerEndpoint** | [**Endpoint**](Endpoint.md) |  |  [optional]
**recording** | [**Recording**](Recording.md) |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="ProviderTypeEnum"></a>
## Enum: ProviderTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
EDGE | &quot;EDGE&quot;
CHAT | &quot;CHAT&quot;
EMAIL | &quot;EMAIL&quot;


<a name="MediaTypeEnum"></a>
## Enum: MediaTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
CALL | &quot;CALL&quot;
CHAT | &quot;CHAT&quot;
EMAIL | &quot;EMAIL&quot;


<a name="FileStateEnum"></a>
## Enum: FileStateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ARCHIVED | &quot;ARCHIVED&quot;
AVAILABLE | &quot;AVAILABLE&quot;
DELETED | &quot;DELETED&quot;
RESTORED | &quot;RESTORED&quot;
RESTORING | &quot;RESTORING&quot;
UPLOADING | &quot;UPLOADING&quot;



