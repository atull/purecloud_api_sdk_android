
# ConversationNotificationVideo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**context** | **String** |  |  [optional]
**audioMuted** | **Boolean** |  |  [optional]
**videoMuted** | **Boolean** |  |  [optional]
**sharingScreen** | **Boolean** |  |  [optional]
**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional]
**connectedTime** | **Integer** |  |  [optional]
**disconnectedTime** | **Integer** |  |  [optional]
**additionalProperties** | **Object** |  |  [optional]


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
NONE | &quot;NONE&quot;


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


<a name="DisconnectTypeEnum"></a>
## Enum: DisconnectTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ENDPOINT | &quot;ENDPOINT&quot;
CLIENT | &quot;CLIENT&quot;
SYSTEM | &quot;SYSTEM&quot;
TIMEOUT | &quot;TIMEOUT&quot;
TRANSFER | &quot;TRANSFER&quot;
TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot;
TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot;
TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot;
TRANSFER_NO_ANSWER | &quot;TRANSFER_NO_ANSWER&quot;
TRANSFER_NOT_AVAILABLE | &quot;TRANSFER_NOT_AVAILABLE&quot;
TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot;
ERROR | &quot;ERROR&quot;
PEER | &quot;PEER&quot;
OTHER | &quot;OTHER&quot;
SPAM | &quot;SPAM&quot;



