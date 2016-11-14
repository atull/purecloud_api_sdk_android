
# Callback

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**segments** | [**List&lt;Segment&gt;**](Segment.md) |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**held** | **Boolean** |  |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional]
**startHoldTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dialerPreview** | [**DialerPreview**](DialerPreview.md) |  |  [optional]
**callbackNumbers** | **List&lt;String&gt;** |  |  [optional]
**callbackUserName** | **String** |  |  [optional]
**scriptId** | **String** |  |  [optional]
**skipEnabled** | **Boolean** |  |  [optional]
**timeoutSeconds** | **Integer** |  |  [optional]
**connectedTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**disconnectedTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**callbackScheduledTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]


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
SCHEDULED | &quot;SCHEDULED&quot;
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
TIMEOUT | &quot;TIMEOUT&quot;
TRANSFER | &quot;TRANSFER&quot;
TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot;
TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot;
TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot;
TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot;
ERROR | &quot;ERROR&quot;
PEER | &quot;PEER&quot;
OTHER | &quot;OTHER&quot;
SPAM | &quot;SPAM&quot;



