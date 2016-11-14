
# OutboundRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** | The name of the entity. | 
**description** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**modifiedByApp** | **String** |  |  [optional]
**createdByApp** | **String** |  |  [optional]
**site** | [**Site**](Site.md) | The site associated to the outbound route. | 
**classificationTypes** | **List&lt;String&gt;** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**distribution** | [**DistributionEnum**](#DistributionEnum) |  |  [optional]
**managed** | **Boolean** |  |  [optional]
**externalTrunkBases** | [**List&lt;UriReference&gt;**](UriReference.md) | Trunk base settings of trunkType \&quot;EXTERNAL\&quot;.  This base must also be set on an edge logical interface for correct routing. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="DistributionEnum"></a>
## Enum: DistributionEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
SEQUENTIAL | &quot;SEQUENTIAL&quot;
RANDOM | &quot;RANDOM&quot;



