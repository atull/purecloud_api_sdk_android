
# Edge

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
**interfaces** | [**List&lt;EdgeInterface&gt;**](EdgeInterface.md) |  |  [optional]
**make** | **String** |  |  [optional]
**model** | **String** |  |  [optional]
**apiVersion** | **String** |  |  [optional]
**softwareVersion** | **String** |  |  [optional]
**softwareVersionTimestamp** | **String** |  |  [optional]
**softwareVersionPlatform** | **String** |  |  [optional]
**softwareVersionConfiguration** | **String** |  |  [optional]
**fullSoftwareVersion** | **String** |  |  [optional]
**pairingId** | **String** |  |  [optional]
**fingerprint** | **String** |  |  [optional]
**fingerprintHint** | **String** |  |  [optional]
**currentVersion** | **String** |  |  [optional]
**stagedVersion** | **String** |  |  [optional]
**patch** | **String** |  |  [optional]
**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) |  |  [optional]
**edgeGroup** | [**EdgeGroup**](EdgeGroup.md) |  |  [optional]
**site** | [**UriReference**](UriReference.md) |  |  [optional]
**softwareStatus** | [**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md) |  |  [optional]
**onlineStatus** | [**OnlineStatusEnum**](#OnlineStatusEnum) |  |  [optional]
**serialNumber** | **String** |  |  [optional]
**physicalEdge** | **Boolean** |  |  [optional]
**managed** | **Boolean** |  |  [optional]
**edgeDeploymentType** | [**EdgeDeploymentTypeEnum**](#EdgeDeploymentTypeEnum) |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="StatusCodeEnum"></a>
## Enum: StatusCodeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NEW | &quot;NEW&quot;
AWAITING_CONNECTION | &quot;AWAITING_CONNECTION&quot;
AWAITING_FINGERPRINT | &quot;AWAITING_FINGERPRINT&quot;
AWAITING_FINGERPRINT_VERIFICATION | &quot;AWAITING_FINGERPRINT_VERIFICATION&quot;
FINGERPRINT_VERIFIED | &quot;FINGERPRINT_VERIFIED&quot;
AWAITING_BOOTSTRAP | &quot;AWAITING_BOOTSTRAP&quot;
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
RMA | &quot;RMA&quot;
UNPAIRING | &quot;UNPAIRING&quot;
UNPAIRED | &quot;UNPAIRED&quot;


<a name="OnlineStatusEnum"></a>
## Enum: OnlineStatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ONLINE | &quot;ONLINE&quot;
OFFLINE | &quot;OFFLINE&quot;


<a name="EdgeDeploymentTypeEnum"></a>
## Enum: EdgeDeploymentTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
HARDWARE | &quot;HARDWARE&quot;
LDM | &quot;LDM&quot;
CDM | &quot;CDM&quot;
INVALID | &quot;INVALID&quot;



