
# ConversationNotificationChat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**roomId** | **String** |  |  [optional]
**held** | **Boolean** |  |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional]
**startHoldTime** | **Integer** |  |  [optional]
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
TRANSFER_NO_ANSWER | &quot;TRANSFER_NO_ANSWER&quot;
TRANSFER_NOT_AVAILABLE | &quot;TRANSFER_NOT_AVAILABLE&quot;
TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot;
TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot;
ERROR | &quot;ERROR&quot;
PEER | &quot;PEER&quot;
OTHER | &quot;OTHER&quot;
SPAM | &quot;SPAM&quot;



