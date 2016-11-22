
# AnalyticsQueryFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**clauses** | [**List&lt;AnalyticsQueryClause&gt;**](AnalyticsQueryClause.md) | Boolean &#39;and/or&#39; logic with up to two-levels of nesting |  [optional]
**predicates** | [**List&lt;AnalyticsQueryPredicate&gt;**](AnalyticsQueryPredicate.md) | Like a three-word sentence: (attribute-name) (operator) (target-value). These can be one of three types: dimension, property, metric. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
AND | &quot;and&quot;
OR | &quot;or&quot;



