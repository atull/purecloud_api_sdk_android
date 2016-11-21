
# CallConversation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**participants** | [**List&lt;CallMediaParticipant&gt;**](CallMediaParticipant.md) | The list of participants involved in the conversation. |  [optional]
**otherMediaUris** | **List&lt;String&gt;** | The list of other media channels involved in the conversation. |  [optional]
**recordingState** | [**RecordingStateEnum**](#RecordingStateEnum) |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="RecordingStateEnum"></a>
## Enum: RecordingStateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NONE | &quot;NONE&quot;
ACTIVE | &quot;ACTIVE&quot;
PAUSED | &quot;PAUSED&quot;



