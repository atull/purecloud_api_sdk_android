
# AnalyticsConversationSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segmentStart** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**segmentEnd** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**queueId** | **String** |  |  [optional]
**wrapUpCode** | **String** |  |  [optional]
**wrapUpNote** | **String** |  |  [optional]
**wrapUpTags** | **List&lt;String&gt;** |  |  [optional]
**errorCode** | **String** |  |  [optional]
**disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional]
**segmentType** | [**SegmentTypeEnum**](#SegmentTypeEnum) |  |  [optional]
**requestedRoutingUserIds** | **List&lt;String&gt;** |  |  [optional]
**requestedRoutingSkillIds** | **List&lt;String&gt;** |  |  [optional]
**requestedLanguageId** | **String** |  |  [optional]
**properties** | [**List&lt;AnalyticsProperty&gt;**](AnalyticsProperty.md) |  |  [optional]
**sourceConversationId** | **String** |  |  [optional]
**destinationConversationId** | **String** |  |  [optional]
**sourceSessionId** | **String** |  |  [optional]
**destinationSessionId** | **String** |  |  [optional]
**sipResponseCodes** | **List&lt;Long&gt;** |  |  [optional]
**q850ResponseCodes** | **List&lt;Long&gt;** |  |  [optional]
**conference** | **Boolean** |  |  [optional]
**groupId** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]


<a name="DisconnectTypeEnum"></a>
## Enum: DisconnectTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ENDPOINT | &quot;endpoint&quot;
CLIENT | &quot;client&quot;
SYSTEM | &quot;system&quot;
TRANSFER | &quot;transfer&quot;
ERROR | &quot;error&quot;
PEER | &quot;peer&quot;
OTHER | &quot;other&quot;
SPAM | &quot;spam&quot;
TRANSPORTFAILURE | &quot;transportFailure&quot;
CONFERENCETRANSFER | &quot;conferenceTransfer&quot;
CONSULTTRANSFER | &quot;consultTransfer&quot;
FORWARDTRANSFER | &quot;forwardTransfer&quot;


<a name="SegmentTypeEnum"></a>
## Enum: SegmentTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
UNKNOWN | &quot;unknown&quot;
ALERT | &quot;alert&quot;
SYSTEM | &quot;system&quot;
DELAY | &quot;delay&quot;
HOLD | &quot;hold&quot;
INTERACT | &quot;interact&quot;
IVR | &quot;ivr&quot;
DIALING | &quot;dialing&quot;
WRAPUP | &quot;wrapup&quot;
VOICEMAIL | &quot;voicemail&quot;
SCHEDULED | &quot;scheduled&quot;



