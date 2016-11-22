
# Greeting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Greeting type | 
**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) | Greeting owner type | 
**owner** | [**DomainEntity**](DomainEntity.md) | Greeting owner | 
**audioFile** | [**GreetingAudioFile**](GreetingAudioFile.md) |  |  [optional]
**audioTTS** | **String** |  |  [optional]
**createdDate** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**createdBy** | **String** |  |  [optional]
**modifiedDate** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
STATION | &quot;STATION&quot;
VOICEMAIL | &quot;VOICEMAIL&quot;
NAME | &quot;NAME&quot;


<a name="OwnerTypeEnum"></a>
## Enum: OwnerTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
USER | &quot;USER&quot;
ORGANIZATION | &quot;ORGANIZATION&quot;
GROUP | &quot;GROUP&quot;



