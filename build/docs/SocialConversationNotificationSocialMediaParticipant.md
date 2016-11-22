
# SocialConversationNotificationSocialMediaParticipant

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
**socialMediaId** | **String** |  |  [optional]
**socialMediaHub** | **String** |  |  [optional]
**socialUserName** | **String** |  |  [optional]
**previewText** | **String** |  |  [optional]


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



