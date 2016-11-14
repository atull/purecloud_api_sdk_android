
# CallMediaParticipant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique participant ID. |  [optional]
**name** | **String** | The display friendly name of the participant. |  [optional]
**address** | **String** | The participant address. |  [optional]
**startTime** | [**Date**](Date.md) | The time when this participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**connectedTime** | [**Date**](Date.md) | The time when this participant went connected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**endTime** | [**Date**](Date.md) | The time when this participant when disconnected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**startHoldTime** | [**Date**](Date.md) | The time when this participant&#39;s hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**purpose** | **String** | The participant&#39;s purpose.  Values can be: &#39;agent&#39;, &#39;user&#39;, &#39;customer&#39;, &#39;external&#39;, &#39;acd&#39;, &#39;ivr |  [optional]
**state** | [**StateEnum**](#StateEnum) | The participant&#39;s state.  Values can be: &#39;alerting&#39;, &#39;connected&#39;, &#39;disconnected&#39;, &#39;dialing&#39;, &#39;contacting |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The participant&#39;s direction.  Values can be: &#39;inbound&#39; or &#39;outbound&#39; |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) | The reason the participant was disconnected from the conversation. |  [optional]
**held** | **Boolean** | Value is true when the participant is on hold. |  [optional]
**wrapupRequired** | **Boolean** | Value is true when the participant requires wrap-up. |  [optional]
**wrapupPrompt** | **String** | The wrap-up prompt indicating the type of wrap-up to be performed. |  [optional]
**user** | [**UriReference**](UriReference.md) | The PureCloud user for this participant. |  [optional]
**queue** | [**UriReference**](UriReference.md) | The PureCloud queue for this participant. |  [optional]
**attributes** | **Map&lt;String, String&gt;** | A list of ad-hoc attributes for the participant. |  [optional]
**errorInfo** | [**ErrorBody**](ErrorBody.md) | If the conversation ends in error, contains additional error details. |  [optional]
**script** | [**UriReference**](UriReference.md) | The Engage script that should be used by this participant. |  [optional]
**wrapupTimeoutMs** | **Integer** | The amount of time the participant has to complete wrap-up. |  [optional]
**wrapupSkipped** | **Boolean** | Value is true when the participant has skipped wrap-up. |  [optional]
**muted** | **Boolean** | Value is true when the call is muted. |  [optional]
**confined** | **Boolean** | Value is true when the call is confined. |  [optional]
**recording** | **Boolean** | Value is true when the call is being recorded. |  [optional]
**recordingState** | [**RecordingStateEnum**](#RecordingStateEnum) | The state of the call recording. |  [optional]
**group** | [**UriReference**](UriReference.md) | The group involved in the group ring call. |  [optional]
**ani** | **String** | The call ANI. |  [optional]
**dnis** | **String** | The call DNIS. |  [optional]
**documentId** | **String** | The ID of the Content Management document if the call is a fax. |  [optional]
**faxStatus** | [**FaxStatus**](FaxStatus.md) | Extra fax information if the call is a fax. |  [optional]
**monitoredParticipantId** | **String** | The ID of the participant being monitored when performing a call monitor. |  [optional]
**consultParticipantId** | **String** | The ID of the consult transfer target participant when performing a consult transfer. |  [optional]


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


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
INBOUND | &quot;INBOUND&quot;
OUTBOUND | &quot;OUTBOUND&quot;


<a name="DisconnectTypeEnum"></a>
## Enum: DisconnectTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ENDPOINT | &quot;ENDPOINT&quot;
CLIENT | &quot;CLIENT&quot;
SYSTEM | &quot;SYSTEM&quot;
TRANSFER | &quot;TRANSFER&quot;
TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot;
TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot;
TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot;
TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot;
ERROR | &quot;ERROR&quot;
PEER | &quot;PEER&quot;
OTHER | &quot;OTHER&quot;
SPAM | &quot;SPAM&quot;


<a name="RecordingStateEnum"></a>
## Enum: RecordingStateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NONE | &quot;NONE&quot;
ACTIVE | &quot;ACTIVE&quot;
PAUSED | &quot;PAUSED&quot;



