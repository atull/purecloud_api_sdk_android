
# RoutingStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
OFF_QUEUE | &quot;OFF_QUEUE&quot;
IDLE | &quot;IDLE&quot;
INTERACTING | &quot;INTERACTING&quot;
NOT_RESPONDING | &quot;NOT_RESPONDING&quot;
COMMUNICATING | &quot;COMMUNICATING&quot;



