
# DialerRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the rule |  [optional]
**name** | **String** | The name of the rule | 
**order** | **Integer** | The ranked order of the rule; rules are processed from lowest number to highest |  [optional]
**category** | [**CategoryEnum**](#CategoryEnum) | The category of the rule | 
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | The list of rule conditions; all must evaluate to true to trigger the rule actions | 
**actions** | [**List&lt;DialerAction&gt;**](DialerAction.md) | The list of rule actions to be taken if the conditions are true |  [optional]


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
PRECALL | &quot;DIALER_PRECALL&quot;
WRAPUP | &quot;DIALER_WRAPUP&quot;



