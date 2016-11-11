
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**address** | [**LocationAddress**](LocationAddress.md) |  |  [optional]
**addressVerified** | **Boolean** |  |  [optional]
**emergencyNumber** | [**LocationEmergencyNumber**](LocationEmergencyNumber.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current activity status of the location. |  [optional]
**version** | **Integer** |  |  [optional]
**path** | **List&lt;String&gt;** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
DELETED | &quot;deleted&quot;



