
# MediaParticipantRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wrapup** | [**Wrapup**](Wrapup.md) | Wrap-up to assign to this participant. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state to update to set for this participant&#39;s communications.  Possible values are: &#39;connected&#39; and &#39;disconnected&#39;. |  [optional]
**recording** | **Boolean** | True to enable recording of this participant, otherwise false to disable recording. |  [optional]
**muted** | **Boolean** | True to mute this conversation participant. |  [optional]
**confined** | **Boolean** | True to confine this conversation participant.  Should only be used for ad-hoc conferences |  [optional]
**held** | **Boolean** | True to hold this conversation participant. |  [optional]
**wrapupSkipped** | **Boolean** | True to skip wrap-up for this participant. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ALERTING | &quot;ALERTING&quot;
DIALING | &quot;DIALING&quot;
CONTACTING | &quot;CONTACTING&quot;
OFFERING | &quot;OFFERING&quot;
CONNECTED | &quot;CONNECTED&quot;
DISCONNECTED | &quot;DISCONNECTED&quot;
TERMINATED | &quot;TERMINATED&quot;
CONVERTING | &quot;CONVERTING&quot;
UPLOADING | &quot;UPLOADING&quot;
TRANSMITTING | &quot;TRANSMITTING&quot;
NONE | &quot;NONE&quot;



