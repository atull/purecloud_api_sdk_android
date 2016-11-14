
# CreateCallRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | The phone number to dial. |  [optional]
**callFromQueueId** | **String** | The queue ID to call on behalf of. |  [optional]
**callQueueId** | **String** | The queue ID to call. |  [optional]
**callUserId** | **String** | The user ID to call. |  [optional]
**priority** | **Integer** | The priority to assign to this call (if calling a queue). |  [optional]
**languageId** | **String** | The language skill ID to use for routing this call (if calling a queue). |  [optional]
**routingSkillsIds** | **List&lt;String&gt;** | The skill ID&#39;s to use for routing this call (if calling a queue). |  [optional]
**conversationIds** | **List&lt;String&gt;** | The list of existing call conversations to merge into a new ad-hoc conference. |  [optional]
**participants** | [**List&lt;Destination&gt;**](Destination.md) | The list of participants to call to create a new ad-hoc conference. |  [optional]



