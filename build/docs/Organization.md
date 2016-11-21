
# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**thirdPartyOrgId** | **String** |  |  [optional]
**thirdPartyOrgName** | **String** |  |  [optional]
**thirdPartyURI** | **String** |  |  [optional]
**domain** | **String** |  |  [optional]
**version** | **Integer** | The current version of the organization. | 
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**defaultSiteId** | **String** |  |  [optional]
**deletable** | **Boolean** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



