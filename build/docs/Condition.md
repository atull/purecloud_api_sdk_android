
# Condition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the condition |  [optional]
**inverted** | **Boolean** | Indicates whether to evaluate for the opposite of the stated condition; default is false |  [optional]
**attributeName** | **String** | An attribute name associated with the condition (applies only to certain rule conditions) |  [optional]
**value** | **String** | A value associated with the condition |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | Determines the type of the value associated with the condition |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | An operation type for condition evaluation |  [optional]
**codes** | **List&lt;String&gt;** | List of wrap-up code identifiers (used only in conditions of type &#39;wrapupCondition&#39;) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
WRAPUPCONDITION | &quot;wrapupCondition&quot;
CONTACTATTRIBUTECONDITION | &quot;contactAttributeCondition&quot;
PHONENUMBERCONDITION | &quot;phoneNumberCondition&quot;
PHONENUMBERTYPECONDITION | &quot;phoneNumberTypeCondition&quot;
CALLANALYSISCONDITION | &quot;callAnalysisCondition&quot;


<a name="ValueTypeEnum"></a>
## Enum: ValueTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
STRING | &quot;STRING&quot;
NUMERIC | &quot;NUMERIC&quot;
DATETIME | &quot;DATETIME&quot;
PERIOD | &quot;PERIOD&quot;


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
EQUALS | &quot;EQUALS&quot;
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;
GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot;
CONTAINS | &quot;CONTAINS&quot;
BEGINS_WITH | &quot;BEGINS_WITH&quot;
ENDS_WITH | &quot;ENDS_WITH&quot;
BEFORE | &quot;BEFORE&quot;
AFTER | &quot;AFTER&quot;



