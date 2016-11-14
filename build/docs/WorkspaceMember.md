
# WorkspaceMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**workspace** | [**UriReference**](UriReference.md) |  |  [optional]
**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional]
**member** | [**UriReference**](UriReference.md) |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]
**group** | [**Group**](Group.md) |  |  [optional]
**securityProfile** | [**SecurityProfile**](SecurityProfile.md) |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="MemberTypeEnum"></a>
## Enum: MemberTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;



