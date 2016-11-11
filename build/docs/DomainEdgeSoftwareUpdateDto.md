
# DomainEdgeSoftwareUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**DomainEdgeSoftwareVersionDto**](DomainEdgeSoftwareVersionDto.md) | Version | 
**maxDownloadRate** | **Integer** |  |  [optional]
**downloadStartTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**executeStartTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**executeStopTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**executeOnIdle** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**edgeUri** | **String** |  |  [optional]
**current** | **Boolean** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NONE | &quot;NONE&quot;
INIT | &quot;INIT&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
EXPIRED | &quot;EXPIRED&quot;
EXCEPTION | &quot;EXCEPTION&quot;
ABORTED | &quot;ABORTED&quot;
FAILED | &quot;FAILED&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
DELETE | &quot;DELETE&quot;



