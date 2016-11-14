
# Campaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**contactList** | [**UriReference**](UriReference.md) | identifier of the contact list for the campaign | 
**queue** | [**UriReference**](UriReference.md) | identifier of the agent assignment queue, required for all dialing modes other than agentless | 
**dialingMode** | [**DialingModeEnum**](#DialingModeEnum) | dialing mode of the campaign | 
**script** | [**UriReference**](UriReference.md) | identifier of the campaign script, required for all dialing modes other than agentless | 
**edgeGroup** | [**UriReference**](UriReference.md) | identifier of the edge group, required for all dialing modes other than preview | 
**campaignStatus** | **String** | status of the campaign; can be set to &#39;on&#39; or &#39;off&#39; | 
**phoneColumns** | [**List&lt;PhoneColumn&gt;**](PhoneColumn.md) | the contact list phone columns to be called for the campaign | 
**abandonRate** | **Double** | the targeted abandon rate percentage |  [optional]
**dncLists** | [**List&lt;UriReference&gt;**](UriReference.md) | identifiers of the do not call lists |  [optional]
**callableTimeSet** | [**UriReference**](UriReference.md) | the identifier of the callable time set |  [optional]
**callAnalysisResponseSet** | [**UriReference**](UriReference.md) | the identifier of the call analysis response set, required for all dialing modes other than preview | 
**errors** | [**List&lt;RestErrorDetail&gt;**](RestErrorDetail.md) | a list of current error conditions associated with the campaign |  [optional]
**callerName** | **String** | caller id name to be displayed on the outbound call |  [optional]
**callerAddress** | **String** | caller id phone number to be displayed on the outbound call |  [optional]
**outboundLineCount** | **Integer** | for agentless campaigns, the number of outbound lines to be concurrently dialed |  [optional]
**ruleSets** | [**List&lt;UriReference&gt;**](UriReference.md) | identifiers of the rule sets |  [optional]
**skipPreviewDisabled** | **Boolean** | for preview campaigns, indicator of whether the agent can skip a preview without placing a call |  [optional]
**previewTimeOutSeconds** | **Long** | for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls |  [optional]
**contactSort** | [**ContactSort**](ContactSort.md) | information determining the order in which the contacts will be dialed |  [optional]
**noAnswerTimeout** | **Integer** | for non-preview campaigns, how long to wait before dispositioning as &#39;no-answer&#39;, default 30 seconds |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="DialingModeEnum"></a>
## Enum: DialingModeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
AGENTLESS | &quot;agentless&quot;
PREVIEW | &quot;preview&quot;
POWER | &quot;power&quot;
PREDICTIVE | &quot;predictive&quot;
PROGRESSIVE | &quot;progressive&quot;



