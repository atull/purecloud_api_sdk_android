
# Participant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**startTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**endTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**connectedTime** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**name** | **String** |  |  [optional]
**userUri** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]
**externalContactId** | **String** |  |  [optional]
**queueId** | **String** |  |  [optional]
**groupId** | **String** |  |  [optional]
**queueName** | **String** |  |  [optional]
**purpose** | **String** |  |  [optional]
**participantType** | **String** |  |  [optional]
**consultParticipantId** | **String** |  |  [optional]
**address** | **String** |  |  [optional]
**ani** | **String** |  |  [optional]
**dnis** | **String** |  |  [optional]
**locale** | **String** |  |  [optional]
**wrapupRequired** | **Boolean** |  |  [optional]
**wrapupPrompt** | [**WrapupPromptEnum**](#WrapupPromptEnum) |  |  [optional]
**wrapupTimeoutMs** | **Integer** |  |  [optional]
**wrapupSkipped** | **Boolean** |  |  [optional]
**wrapup** | [**Wrapup**](Wrapup.md) |  |  [optional]
**monitoredParticipantId** | **String** |  |  [optional]
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]
**calls** | [**List&lt;Call&gt;**](Call.md) |  |  [optional]
**callbacks** | [**List&lt;Callback&gt;**](Callback.md) |  |  [optional]
**chats** | [**List&lt;ConversationChat&gt;**](ConversationChat.md) |  |  [optional]
**emails** | [**List&lt;Email&gt;**](Email.md) |  |  [optional]
**socialExpressions** | [**List&lt;SocialExpression&gt;**](SocialExpression.md) |  |  [optional]
**videos** | [**List&lt;Video&gt;**](Video.md) |  |  [optional]
**evaluations** | [**List&lt;Evaluation&gt;**](Evaluation.md) |  |  [optional]


<a name="WrapupPromptEnum"></a>
## Enum: WrapupPromptEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
MANDATORY | &quot;MANDATORY&quot;
OPTIONAL | &quot;OPTIONAL&quot;
TIMEOUT | &quot;TIMEOUT&quot;
FORCED_TIMEOUT | &quot;FORCED_TIMEOUT&quot;



