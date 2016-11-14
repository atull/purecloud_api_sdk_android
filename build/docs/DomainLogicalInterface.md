
# DomainLogicalInterface

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
**edgeUri** | **String** |  |  [optional]
**edgeAssignedId** | **String** |  |  [optional]
**friendlyName** | **String** | Friendly Name | 
**vlanTagId** | **Integer** |  |  [optional]
**hardwareAddress** | **String** | Hardware Address | 
**physicalAdapterId** | **String** | Physical Adapter Id | 
**ipAddress** | **String** |  |  [optional]
**gateway** | **String** |  |  [optional]
**primaryDns** | **String** |  |  [optional]
**secondaryDns** | **String** |  |  [optional]
**ifStatus** | **String** |  |  [optional]
**routes** | [**List&lt;DomainNetworkRoute&gt;**](DomainNetworkRoute.md) |  |  [optional]
**addresses** | [**List&lt;DomainNetworkAddress&gt;**](DomainNetworkAddress.md) |  |  [optional]
**ipv4Capabilities** | [**DomainCapabilities**](DomainCapabilities.md) |  |  [optional]
**ipv6Capabilities** | [**DomainCapabilities**](DomainCapabilities.md) |  |  [optional]
**currentState** | [**CurrentStateEnum**](#CurrentStateEnum) |  |  [optional]
**lastModifiedUserId** | **String** |  |  [optional]
**lastModifiedCorrelationId** | **String** |  |  [optional]
**commandResponses** | [**List&lt;DomainNetworkCommandResponse&gt;**](DomainNetworkCommandResponse.md) |  |  [optional]
**inheritPhoneTrunkBasesIPv4** | **Boolean** | The IPv4 phone trunk base assignment will be inherited from the Edge Group. |  [optional]
**inheritPhoneTrunkBasesIPv6** | **Boolean** | The IPv6 phone trunk base assignment will be inherited from the Edge Group. |  [optional]
**useForInternalEdgeCommunication** | **Boolean** | This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group. |  [optional]
**externalTrunkBaseAssignments** | [**List&lt;TrunkBaseAssignment&gt;**](TrunkBaseAssignment.md) | External trunk base settings to use for external communication from this interface. |  [optional]
**phoneTrunkBaseAssignments** | [**List&lt;TrunkBaseAssignment&gt;**](TrunkBaseAssignment.md) | Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \&quot;inheritPhoneTrunkBases\&quot; is true. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="CurrentStateEnum"></a>
## Enum: CurrentStateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
INIT | &quot;INIT&quot;
CREATING | &quot;CREATING&quot;
UPDATING | &quot;UPDATING&quot;
OK | &quot;OK&quot;
EXCEPTION | &quot;EXCEPTION&quot;
DELETING | &quot;DELETING&quot;



