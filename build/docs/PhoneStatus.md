
# PhoneStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum) | The Operational Status of this phone |  [optional]
**edgesStatus** | [**EdgesStatusEnum**](#EdgesStatusEnum) | The status of the primary or secondary Edges assigned to the phone lines. |  [optional]
**provision** | [**ProvisionInfo**](ProvisionInfo.md) | Provision information for this phone |  [optional]
**lineStatuses** | [**List&lt;LineStatus&gt;**](LineStatus.md) | A list of LineStatus information for each of the lines of this phone |  [optional]
**phoneAssignmentToEdgeType** | [**PhoneAssignmentToEdgeTypeEnum**](#PhoneAssignmentToEdgeTypeEnum) | The phone status&#39;s edge assignment type. |  [optional]
**edge** | [**UriReference**](UriReference.md) | The URI of the edge that provided this status information. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="OperationalStatusEnum"></a>
## Enum: OperationalStatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
OPERATIONAL | &quot;OPERATIONAL&quot;
DEGRADED | &quot;DEGRADED&quot;
OFFLINE | &quot;OFFLINE&quot;


<a name="EdgesStatusEnum"></a>
## Enum: EdgesStatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
IN_SERVICE | &quot;IN_SERVICE&quot;
MIXED_SERVICE | &quot;MIXED_SERVICE&quot;
OUT_OF_SERVICE | &quot;OUT_OF_SERVICE&quot;
NO_EDGES | &quot;NO_EDGES&quot;


<a name="PhoneAssignmentToEdgeTypeEnum"></a>
## Enum: PhoneAssignmentToEdgeTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
PRIMARY | &quot;PRIMARY&quot;
SECONDARY | &quot;SECONDARY&quot;



