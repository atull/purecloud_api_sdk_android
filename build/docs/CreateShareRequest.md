
# CreateShareRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharedEntityType** | [**SharedEntityTypeEnum**](#SharedEntityTypeEnum) |  |  [optional]
**sharedEntity** | [**SharedEntity**](SharedEntity.md) |  |  [optional]
**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional]
**member** | [**SharedEntity**](SharedEntity.md) |  |  [optional]
**members** | [**List&lt;CreateShareRequestMember&gt;**](CreateShareRequestMember.md) |  |  [optional]


<a name="SharedEntityTypeEnum"></a>
## Enum: SharedEntityTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
DOCUMENT | &quot;DOCUMENT&quot;


<a name="MemberTypeEnum"></a>
## Enum: MemberTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;
PUBLIC | &quot;PUBLIC&quot;



