
# UserSearchCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endValue** | **String** |  |  [optional]
**values** | **List&lt;String&gt;** |  |  [optional]
**startValue** | **String** |  |  [optional]
**fields** | **List&lt;String&gt;** |  |  [optional]
**value** | **String** |  |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional]
**group** | [**List&lt;UserSearchCriteria&gt;**](UserSearchCriteria.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Search Type | 


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
AND | &quot;AND&quot;
OR | &quot;OR&quot;
NOT | &quot;NOT&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
EXACT | &quot;EXACT&quot;
STARTS_WITH | &quot;STARTS_WITH&quot;
CONTAINS | &quot;CONTAINS&quot;
REGEX | &quot;REGEX&quot;
TERM | &quot;TERM&quot;
TERMS | &quot;TERMS&quot;
REQUIRED_FIELDS | &quot;REQUIRED_FIELDS&quot;



