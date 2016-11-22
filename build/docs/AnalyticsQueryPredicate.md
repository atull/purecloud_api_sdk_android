
# AnalyticsQueryPredicate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Optional type, can usually be inferred |  [optional]
**dimension** | [**DimensionEnum**](#DimensionEnum) | Left hand side for dimension predicates |  [optional]
**propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | Left hand side for property predicates |  [optional]
**property** | **String** | Left hand side for property predicates |  [optional]
**metric** | [**MetricEnum**](#MetricEnum) | Left hand side for metric predicates |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | Optional operator, default is matches |  [optional]
**value** | **String** | Right hand side for dimension, property, or metric predicates |  [optional]
**range** | [**NumericRange**](NumericRange.md) | Right hand side for property or metric predicates |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
DIMENSION | &quot;dimension&quot;
PROPERTY | &quot;property&quot;
METRIC | &quot;metric&quot;


<a name="DimensionEnum"></a>
## Enum: DimensionEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
CONVERSATIONID | &quot;conversationId&quot;
SESSIONID | &quot;sessionId&quot;
MEDIATYPE | &quot;mediaType&quot;
QUEUEID | &quot;queueId&quot;
USERID | &quot;userId&quot;
PARTICIPANTID | &quot;participantId&quot;
PARTICIPANTNAME | &quot;participantName&quot;
DIRECTION | &quot;direction&quot;
WRAPUPCODE | &quot;wrapUpCode&quot;
WRAPUPNOTE | &quot;wrapUpNote&quot;
INTERACTIONTYPE | &quot;interactionType&quot;
REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot;
REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot;
PURPOSE | &quot;purpose&quot;
PARTICIPANTTYPE | &quot;participantType&quot;
SEGMENTTYPE | &quot;segmentType&quot;
DISCONNECTTYPE | &quot;disconnectType&quot;
ERRORCODE | &quot;errorCode&quot;
CONVERSATIONEND | &quot;conversationEnd&quot;
STATIONID | &quot;stationId&quot;
EDGEID | &quot;edgeId&quot;
DNIS | &quot;dnis&quot;
ANI | &quot;ani&quot;
OUTBOUNDCAMPAIGNID | &quot;outboundCampaignId&quot;
OUTBOUNDCONTACTID | &quot;outboundContactId&quot;
OUTBOUNDCONTACTLISTID | &quot;outboundContactListId&quot;
MONITOREDPARTICIPANTID | &quot;monitoredParticipantId&quot;
SOURCESESSIONID | &quot;sourceSessionId&quot;
DESTINATIONSESSIONID | &quot;destinationSessionId&quot;
SOURCECONVERSATIONID | &quot;sourceConversationId&quot;
DESTINATIONCONVERSATIONID | &quot;destinationConversationId&quot;
REMOTENAMEDISPLAYABLE | &quot;remoteNameDisplayable&quot;
SIPRESPONSECODE | &quot;sipResponseCode&quot;
Q850RESPONSECODE | &quot;q850ResponseCode&quot;
CONFERENCE | &quot;conference&quot;
GROUPID | &quot;groupId&quot;
ROOMID | &quot;roomId&quot;
ADDRESSFROM | &quot;addressFrom&quot;
ADDRESSTO | &quot;addressTo&quot;
PEERID | &quot;peerId&quot;
SCRIPTID | &quot;scriptId&quot;
EVALUATIONID | &quot;evaluationId&quot;
EVALUATORID | &quot;evaluatorId&quot;
CONTEXTID | &quot;contextId&quot;
FORMID | &quot;formId&quot;
FORMNAME | &quot;formName&quot;
EVENTTIME | &quot;eventTime&quot;


<a name="PropertyTypeEnum"></a>
## Enum: PropertyTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
BOOL | &quot;bool&quot;
INTEGER | &quot;integer&quot;
REAL | &quot;real&quot;
DATE | &quot;date&quot;
STRING | &quot;string&quot;
UUID | &quot;uuid&quot;


<a name="MetricEnum"></a>
## Enum: MetricEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
TSEGMENTDURATION | &quot;tSegmentDuration&quot;
OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot;
OTOTALSCORE | &quot;oTotalScore&quot;
NEVALUATIONS | &quot;nEvaluations&quot;
TABANDON | &quot;tAbandon&quot;
TIVR | &quot;tIvr&quot;
TANSWERED | &quot;tAnswered&quot;
TACD | &quot;tAcd&quot;
TTALK | &quot;tTalk&quot;
THELD | &quot;tHeld&quot;
TTALKCOMPLETE | &quot;tTalkComplete&quot;
THELDCOMPLETE | &quot;tHeldComplete&quot;
TACW | &quot;tAcw&quot;
THANDLE | &quot;tHandle&quot;
TWAIT | &quot;tWait&quot;
TAGENTROUTINGSTATUS | &quot;tAgentRoutingStatus&quot;
TORGANIZATIONPRESENCE | &quot;tOrganizationPresence&quot;
TSYSTEMPRESENCE | &quot;tSystemPresence&quot;
TUSERRESPONSETIME | &quot;tUserResponseTime&quot;
TAGENTRESPONSETIME | &quot;tAgentResponseTime&quot;
NOFFERED | &quot;nOffered&quot;
NOVERSLA | &quot;nOverSla&quot;
NTRANSFERRED | &quot;nTransferred&quot;
NOUTBOUNDATTEMPTED | &quot;nOutboundAttempted&quot;
NOUTBOUNDCONNECTED | &quot;nOutboundConnected&quot;
NOUTBOUNDABANDONED | &quot;nOutboundAbandoned&quot;
NERROR | &quot;nError&quot;
OSERVICETARGET | &quot;oServiceTarget&quot;
OSERVICELEVEL | &quot;oServiceLevel&quot;
TACTIVE | &quot;tActive&quot;
TINACTIVE | &quot;tInactive&quot;
OACTIVEUSERS | &quot;oActiveUsers&quot;
OMEMBERUSERS | &quot;oMemberUsers&quot;
OACTIVEQUEUES | &quot;oActiveQueues&quot;
OMEMBERQUEUES | &quot;oMemberQueues&quot;
OINTERACTING | &quot;oInteracting&quot;
OWAITING | &quot;oWaiting&quot;
OONQUEUEUSERS | &quot;oOnQueueUsers&quot;
OOFFQUEUEUSERS | &quot;oOffQueueUsers&quot;


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
MATCHES | &quot;matches&quot;
EXISTS | &quot;exists&quot;
NOTEXISTS | &quot;notExists&quot;



