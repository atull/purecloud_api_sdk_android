
# SearchCriteria

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endValue** | **String** |  |  [optional]
**values** | **List&lt;String&gt;** |  |  [optional]
**startValue** | **String** |  |  [optional]
**fields** | **List&lt;String&gt;** |  |  [optional]
**value** | **String** |  |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional]
**group** | [**List&lt;SearchCriteria&gt;**](SearchCriteria.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


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
CONTAINS | &quot;CONTAINS&quot;
STARTS_WITH | &quot;STARTS_WITH&quot;
REQUIRED_FIELDS | &quot;REQUIRED_FIELDS&quot;
RANGE | &quot;RANGE&quot;
DATE_RANGE | &quot;DATE_RANGE&quot;
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_EQUAL_TO | &quot;LESS_THAN_EQUAL_TO&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;
GREATER_THAN_EQUAL_TO | &quot;GREATER_THAN_EQUAL_TO&quot;
SIMPLE | &quot;SIMPLE&quot;
TERM | &quot;TERM&quot;
TERMS | &quot;TERMS&quot;
QUERY_STRING | &quot;QUERY_STRING&quot;



