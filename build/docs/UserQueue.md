
# UserQueue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**modifiedByApp** | **String** |  |  [optional]
**createdByApp** | **String** |  |  [optional]
**mediaSettings** | [**Map&lt;String, MediaSetting&gt;**](MediaSetting.md) | The media settings for the queue. | 
**bullseye** | [**Bullseye**](Bullseye.md) | The bulls-eye settings for the queue. |  [optional]
**acwSettings** | [**AcwSettings**](AcwSettings.md) | The ACW settings for the queue. | 
**skillEvaluationMethod** | [**SkillEvaluationMethodEnum**](#SkillEvaluationMethodEnum) | The skill evaluation method to use when routing conversations. | 
**queueFlow** | [**UriReference**](UriReference.md) | The in-queue flow to use for conversations waiting in queue. |  [optional]
**callingPartyName** | **String** | The name to use for caller identification for outbound calls from this queue. |  [optional]
**callingPartyNumber** | **String** | The phone number to use for caller identification for outbound calls from this queue. |  [optional]
**joined** | **Boolean** |  |  [optional]
**memberCount** | **Integer** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="SkillEvaluationMethodEnum"></a>
## Enum: SkillEvaluationMethodEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NONE | &quot;NONE&quot;
BEST | &quot;BEST&quot;
ALL | &quot;ALL&quot;



