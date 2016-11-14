
# VideoConversationNotificationVideoMediaParticipant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**address** | **String** |  |  [optional]
**startTime** | **Integer** |  |  [optional]
**connectedTime** | **Integer** |  |  [optional]
**endTime** | **Integer** |  |  [optional]
**startHoldTime** | **Integer** |  |  [optional]
**purpose** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional]
**held** | **Boolean** |  |  [optional]
**wrapupRequired** | **Boolean** |  |  [optional]
**wrapupPrompt** | **String** |  |  [optional]
**user** | [**CallbackConversationNotificationUser**](CallbackConversationNotificationUser.md) |  |  [optional]
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]
**errorInfo** | [**CallbackConversationNotificationErrorInfo**](CallbackConversationNotificationErrorInfo.md) |  |  [optional]
**wrapupTimeoutMs** | **Integer** |  |  [optional]
**wrapupSkipped** | **Boolean** |  |  [optional]
**audioMuted** | **Boolean** |  |  [optional]
**videoMuted** | **Boolean** |  |  [optional]
**sharingScreen** | **Boolean** |  |  [optional]
**peerCount** | **Integer** |  |  [optional]
**context** | **String** |  |  [optional]
**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ALERTING | &quot;alerting&quot;
DIALING | &quot;dialing&quot;
CONTACTING | &quot;contacting&quot;
OFFERING | &quot;offering&quot;
CONNECTED | &quot;connected&quot;
DISCONNECTED | &quot;disconnected&quot;
TERMINATED | &quot;terminated&quot;
CONVERTING | &quot;converting&quot;
UPLOADING | &quot;uploading&quot;
TRANSMITTING | &quot;transmitting&quot;
SCHEDULED | &quot;scheduled&quot;
NONE | &quot;none&quot;


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;


<a name="DisconnectTypeEnum"></a>
## Enum: DisconnectTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ENDPOINT | &quot;endpoint&quot;
CLIENT | &quot;client&quot;
SYSTEM | &quot;system&quot;
TRANSFER | &quot;transfer&quot;
TIMEOUT | &quot;timeout&quot;
TRANSFER_CONFERENCE | &quot;transfer.conference&quot;
TRANSFER_CONSULT | &quot;transfer.consult&quot;
TRANSFER_FORWARD | &quot;transfer.forward&quot;
TRANSPORT_FAILURE | &quot;transport.failure&quot;
TRANSPORT_NOANSWER | &quot;transport.noanswer&quot;
TRANSPORT_NOTAVAILABLE | &quot;transport.notavailable&quot;
ERROR | &quot;error&quot;
PEER | &quot;peer&quot;
OTHER | &quot;other&quot;
SPAM | &quot;spam&quot;


<a name="ProviderEnum"></a>
## Enum: ProviderEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
PURECLOUD_WEBRTC | &quot;PureCloud WebRTC&quot;
PURECLOUD_EMAIL | &quot;PureCloud Email&quot;
PURECLOUD_WEBCHAT | &quot;PureCloud Webchat&quot;
PURECLOUD_CO_BROWSE | &quot;PureCloud Co-browse&quot;
PURECLOUD_VR | &quot;PureCloud VR&quot;
PURECLOUD_CALLBACK | &quot;PureCloud Callback&quot;
PURECLOUD_SOCIAL_CHANNEL_MANAGEMENT | &quot;PureCloud Social Channel Management&quot;
PURECLOUD_FAX | &quot;PureCloud Fax&quot;
EDGE | &quot;Edge&quot;
TWILLIO | &quot;Twillio&quot;
BIFROST | &quot;Bifrost&quot;
UNKNOWN | &quot;Unknown&quot;



