
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**memberCount** | **Long** | Number of members. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Active, inactive, or deleted state. |  [optional]
**version** | **Integer** | Current version for this resource. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of group. | 
**images** | [**List&lt;UserImage&gt;**](UserImage.md) |  |  [optional]
**addresses** | [**List&lt;Contact&gt;**](Contact.md) |  |  [optional]
**rulesVisible** | **Boolean** | Are membership rules visible to the person requesting to view the group | 
**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Who can view this group | 
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
OFFICIAL | &quot;official&quot;
SOCIAL | &quot;social&quot;


<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
PUBLIC | &quot;public&quot;
OWNERS | &quot;owners&quot;
MEMBERS | &quot;members&quot;



