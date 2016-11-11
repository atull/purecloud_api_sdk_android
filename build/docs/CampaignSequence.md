
# CampaignSequence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**campaigns** | [**List&lt;UriReference&gt;**](UriReference.md) | the ordered list of campaign identifiers | 
**currentCampaign** | **Integer** | the zero-based index of the current campaign in the campaigns list | 
**status** | [**StatusEnum**](#StatusEnum) | status of the sequence | 
**stopMessage** | **String** | if a sequence has unexpectedly stopped, this message provides the reason |  [optional]
**repeat** | **Boolean** | indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ON | &quot;ON&quot;
OFF | &quot;OFF&quot;
COMPLETE | &quot;COMPLETE&quot;



