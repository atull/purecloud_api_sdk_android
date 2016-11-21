# ConversationsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCallsCallIdParticipantsParticipantIdConsult**](ConversationsApi.md#deleteCallsCallIdParticipantsParticipantIdConsult) | **DELETE** api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Cancel the transfer
[**deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode**](ConversationsApi.md#deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode) | **DELETE** api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode} | Delete a code used to add a communication to this participant
[**deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId**](ConversationsApi.md#deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId) | **DELETE** api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId} | Delete attachment from draft
[**getCallbacks**](ConversationsApi.md#getCallbacks) | **GET** api/v2/conversations/callbacks | Get callback conversations
[**getCallbacksCallbackId**](ConversationsApi.md#getCallbacksCallbackId) | **GET** api/v2/conversations/callbacks/{callbackId} | Get callback conversation
[**getCallbacksCallbackIdParticipantsParticipantIdWrapup**](ConversationsApi.md#getCallbacksCallbackIdParticipantsParticipantIdWrapup) | **GET** api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
[**getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes**](ConversationsApi.md#getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes) | **GET** api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
[**getCalls**](ConversationsApi.md#getCalls) | **GET** api/v2/conversations/calls | Get recent conversations
[**getCallsCallId**](ConversationsApi.md#getCallsCallId) | **GET** api/v2/conversations/calls/{callId} | Get call conversation
[**getCallsCallIdParticipantsParticipantIdWrapup**](ConversationsApi.md#getCallsCallIdParticipantsParticipantIdWrapup) | **GET** api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
[**getCallsCallIdParticipantsParticipantIdWrapupcodes**](ConversationsApi.md#getCallsCallIdParticipantsParticipantIdWrapupcodes) | **GET** api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
[**getCallsHistory**](ConversationsApi.md#getCallsHistory) | **GET** api/v2/conversations/calls/history | Get call history
[**getCallsMaximumconferenceparties**](ConversationsApi.md#getCallsMaximumconferenceparties) | **GET** api/v2/conversations/calls/maximumconferenceparties | Get the maximum number of participants that this user can have on a conference
[**getChats**](ConversationsApi.md#getChats) | **GET** api/v2/conversations/chats | Get recent chat conversations
[**getChatsChatId**](ConversationsApi.md#getChatsChatId) | **GET** api/v2/conversations/chats/{chatId} | Get chat conversation
[**getChatsChatIdParticipantsParticipantIdWrapup**](ConversationsApi.md#getChatsChatIdParticipantsParticipantIdWrapup) | **GET** api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
[**getChatsChatIdParticipantsParticipantIdWrapupcodes**](ConversationsApi.md#getChatsChatIdParticipantsParticipantIdWrapupcodes) | **GET** api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
[**getConversationId**](ConversationsApi.md#getConversationId) | **GET** api/v2/conversations/{conversationId} | Get conversation
[**getConversationIdParticipantsParticipantIdWrapup**](ConversationsApi.md#getConversationIdParticipantsParticipantIdWrapup) | **GET** api/v2/conversations/{conversationId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
[**getConversationIdParticipantsParticipantIdWrapupcodes**](ConversationsApi.md#getConversationIdParticipantsParticipantIdWrapupcodes) | **GET** api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
[**getConversations**](ConversationsApi.md#getConversations) | **GET** api/v2/conversations | Get conversations
[**getConversationsConversationIdDetails**](ConversationsApi.md#getConversationsConversationIdDetails) | **GET** api/v2/analytics/conversations/{conversationId}/details | Get a conversation by id
[**getEmails**](ConversationsApi.md#getEmails) | **GET** api/v2/conversations/emails | Get recent email conversations
[**getEmailsEmailId**](ConversationsApi.md#getEmailsEmailId) | **GET** api/v2/conversations/emails/{emailId} | Get email conversation
[**getEmailsEmailIdMessages**](ConversationsApi.md#getEmailsEmailIdMessages) | **GET** api/v2/conversations/emails/{emailId}/messages | Get conversation messages
[**getEmailsEmailIdMessagesDraft**](ConversationsApi.md#getEmailsEmailIdMessagesDraft) | **GET** api/v2/conversations/emails/{emailId}/messages/draft | Get conversation draft reply
[**getEmailsEmailIdMessagesMessageId**](ConversationsApi.md#getEmailsEmailIdMessagesMessageId) | **GET** api/v2/conversations/emails/{emailId}/messages/{messageId} | Get conversation message
[**getEmailsEmailIdParticipantsParticipantIdWrapup**](ConversationsApi.md#getEmailsEmailIdParticipantsParticipantIdWrapup) | **GET** api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup | Get the wrap-up for this conversation participant. 
[**getEmailsEmailIdParticipantsParticipantIdWrapupcodes**](ConversationsApi.md#getEmailsEmailIdParticipantsParticipantIdWrapupcodes) | **GET** api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes | Get list of wrapup codes for this conversation participant
[**patchCallbacksCallbackId**](ConversationsApi.md#patchCallbacksCallbackId) | **PATCH** api/v2/conversations/callbacks/{callbackId} | Update a conversation by disconnecting all of the participants
[**patchCallbacksCallbackIdParticipantsParticipantId**](ConversationsApi.md#patchCallbacksCallbackIdParticipantsParticipantId) | **PATCH** api/v2/conversations/callbacks/{callbackId}/participants/{participantId} | Update conversation participant
[**patchCallbacksCallbackIdParticipantsParticipantIdAttributes**](ConversationsApi.md#patchCallbacksCallbackIdParticipantsParticipantIdAttributes) | **PATCH** api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
[**patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId**](ConversationsApi.md#patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId) | **PATCH** api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
[**patchCallsCallId**](ConversationsApi.md#patchCallsCallId) | **PATCH** api/v2/conversations/calls/{callId} | Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
[**patchCallsCallIdParticipantsParticipantId**](ConversationsApi.md#patchCallsCallIdParticipantsParticipantId) | **PATCH** api/v2/conversations/calls/{callId}/participants/{participantId} | Update conversation participant
[**patchCallsCallIdParticipantsParticipantIdAttributes**](ConversationsApi.md#patchCallsCallIdParticipantsParticipantIdAttributes) | **PATCH** api/v2/conversations/calls/{callId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
[**patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId**](ConversationsApi.md#patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId) | **PATCH** api/v2/conversations/calls/{callId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
[**patchCallsCallIdParticipantsParticipantIdConsult**](ConversationsApi.md#patchCallsCallIdParticipantsParticipantIdConsult) | **PATCH** api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Change who can speak
[**patchChatsChatId**](ConversationsApi.md#patchChatsChatId) | **PATCH** api/v2/conversations/chats/{chatId} | Update a conversation by disconnecting all of the participants
[**patchChatsChatIdParticipantsParticipantId**](ConversationsApi.md#patchChatsChatIdParticipantsParticipantId) | **PATCH** api/v2/conversations/chats/{chatId}/participants/{participantId} | Update conversation participant
[**patchChatsChatIdParticipantsParticipantIdAttributes**](ConversationsApi.md#patchChatsChatIdParticipantsParticipantIdAttributes) | **PATCH** api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
[**patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId**](ConversationsApi.md#patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId) | **PATCH** api/v2/conversations/chats/{chatId}/participants/{participantId}/communications/{communicationId} | Update conversation participant&#39;s communication by disconnecting it.
[**patchConversationIdParticipantsParticipantId**](ConversationsApi.md#patchConversationIdParticipantsParticipantId) | **PATCH** api/v2/conversations/{conversationId}/participants/{participantId} | Update a participant.
[**patchConversationIdParticipantsParticipantIdAttributes**](ConversationsApi.md#patchConversationIdParticipantsParticipantIdAttributes) | **PATCH** api/v2/conversations/{conversationId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
[**patchEmailsEmailId**](ConversationsApi.md#patchEmailsEmailId) | **PATCH** api/v2/conversations/emails/{emailId} | Update a conversation by disconnecting all of the participants
[**patchEmailsEmailIdParticipantsParticipantId**](ConversationsApi.md#patchEmailsEmailIdParticipantsParticipantId) | **PATCH** api/v2/conversations/emails/{emailId}/participants/{participantId} | Update conversation participant
[**patchEmailsEmailIdParticipantsParticipantIdAttributes**](ConversationsApi.md#patchEmailsEmailIdParticipantsParticipantIdAttributes) | **PATCH** api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes | Update the attributes on a conversation participant.
[**postCallbacks**](ConversationsApi.md#postCallbacks) | **POST** api/v2/conversations/callbacks | Create a Callback
[**postCallbacksCallbackIdParticipantsParticipantIdReplace**](ConversationsApi.md#postCallbacksCallbackIdParticipantsParticipantIdReplace) | **POST** api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
[**postCalls**](ConversationsApi.md#postCalls) | **POST** api/v2/conversations/calls | Create a call conversation
[**postCallsCallId**](ConversationsApi.md#postCallsCallId) | **POST** api/v2/conversations/calls/{callId} | Add a new call to a conversation
[**postCallsCallIdParticipants**](ConversationsApi.md#postCallsCallIdParticipants) | **POST** api/v2/conversations/calls/{callId}/participants | Add participants to a conversation
[**postCallsCallIdParticipantsParticipantIdConsult**](ConversationsApi.md#postCallsCallIdParticipantsParticipantIdConsult) | **POST** api/v2/conversations/calls/{callId}/participants/{participantId}/consult | Initiate and update consult transfer
[**postCallsCallIdParticipantsParticipantIdMonitor**](ConversationsApi.md#postCallsCallIdParticipantsParticipantIdMonitor) | **POST** api/v2/conversations/calls/{callId}/participants/{participantId}/monitor | Listen in on the conversation from the point of view of a given participant.
[**postCallsCallIdParticipantsParticipantIdReplace**](ConversationsApi.md#postCallsCallIdParticipantsParticipantIdReplace) | **POST** api/v2/conversations/calls/{callId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
[**postChatsChatIdParticipantsParticipantIdReplace**](ConversationsApi.md#postChatsChatIdParticipantsParticipantIdReplace) | **POST** api/v2/conversations/chats/{chatId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
[**postConversationIdParticipantsParticipantIdCallbacks**](ConversationsApi.md#postConversationIdParticipantsParticipantIdCallbacks) | **POST** api/v2/conversations/{conversationId}/participants/{participantId}/callbacks | Create a new callback for the specified participant on the conversation.
[**postConversationIdParticipantsParticipantIdReplace**](ConversationsApi.md#postConversationIdParticipantsParticipantIdReplace) | **POST** api/v2/conversations/{conversationId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
[**postConversationsAggregatesQuery**](ConversationsApi.md#postConversationsAggregatesQuery) | **POST** api/v2/analytics/conversations/aggregates/query | Query for conversation aggregates
[**postConversationsConversationIdDetailsProperties**](ConversationsApi.md#postConversationsConversationIdDetailsProperties) | **POST** api/v2/analytics/conversations/{conversationId}/details/properties | Index conversation properties
[**postConversationsDetailsQuery**](ConversationsApi.md#postConversationsDetailsQuery) | **POST** api/v2/analytics/conversations/details/query | Query for conversation details
[**postEmailsEmailIdMessages**](ConversationsApi.md#postEmailsEmailIdMessages) | **POST** api/v2/conversations/emails/{emailId}/messages | Send an email reply
[**postEmailsEmailIdParticipantsParticipantIdReplace**](ConversationsApi.md#postEmailsEmailIdParticipantsParticipantIdReplace) | **POST** api/v2/conversations/emails/{emailId}/participants/{participantId}/replace | Replace this participant with the specified user and/or address
[**postFaxes**](ConversationsApi.md#postFaxes) | **POST** api/v2/conversations/faxes | Create Fax Conversation
[**putEmailsEmailIdMessagesDraft**](ConversationsApi.md#putEmailsEmailIdMessagesDraft) | **PUT** api/v2/conversations/emails/{emailId}/messages/draft | Update conversation draft reply


<a name="deleteCallsCallIdParticipantsParticipantIdConsult"></a>
# **deleteCallsCallIdParticipantsParticipantIdConsult**
> String deleteCallsCallIdParticipantsParticipantIdConsult(callId, participantId)

Cancel the transfer



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    String result = apiInstance.deleteCallsCallIdParticipantsParticipantIdConsult(callId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteCallsCallIdParticipantsParticipantIdConsult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode"></a>
# **deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode**
> Void deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode(conversationId, participantId, addCommunicationCode)

Delete a code used to add a communication to this participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String addCommunicationCode = "addCommunicationCode_example"; // String | addCommunicationCode
try {
    Void result = apiInstance.deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode(conversationId, participantId, addCommunicationCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **addCommunicationCode** | **String**| addCommunicationCode |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId"></a>
# **deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId**
> String deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId(emailId, attachmentId)

Delete attachment from draft



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String attachmentId = "attachmentId_example"; // String | attachmentId
try {
    String result = apiInstance.deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId(emailId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **attachmentId** | **String**| attachmentId |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallbacks"></a>
# **getCallbacks**
> CallbackConversationEntityListing getCallbacks()

Get callback conversations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallbackConversationEntityListing result = apiInstance.getCallbacks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallbacks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CallbackConversationEntityListing**](CallbackConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallbacksCallbackId"></a>
# **getCallbacksCallbackId**
> CallbackConversation getCallbacksCallbackId(callbackId)

Get callback conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
try {
    CallbackConversation result = apiInstance.getCallbacksCallbackId(callbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallbacksCallbackId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |

### Return type

[**CallbackConversation**](CallbackConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallbacksCallbackIdParticipantsParticipantIdWrapup"></a>
# **getCallbacksCallbackIdParticipantsParticipantIdWrapup**
> Wrapup getCallbacksCallbackIdParticipantsParticipantIdWrapup(callbackId, participantId, provisional)

Get the wrap-up for this conversation participant. 



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getCallbacksCallbackIdParticipantsParticipantIdWrapup(callbackId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallbacksCallbackIdParticipantsParticipantIdWrapup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |
 **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false]

### Return type

[**Wrapup**](Wrapup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes"></a>
# **getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes**
> List&lt;WrapupCode&gt; getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(callbackId, participantId)

Get list of wrapup codes for this conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(callbackId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCalls"></a>
# **getCalls**
> CallConversationEntityListing getCalls()

Get recent conversations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallConversationEntityListing result = apiInstance.getCalls();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCalls");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallsCallId"></a>
# **getCallsCallId**
> CallConversation getCallsCallId(callId)

Get call conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
try {
    CallConversation result = apiInstance.getCallsCallId(callId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallsCallId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |

### Return type

[**CallConversation**](CallConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallsCallIdParticipantsParticipantIdWrapup"></a>
# **getCallsCallIdParticipantsParticipantIdWrapup**
> Wrapup getCallsCallIdParticipantsParticipantIdWrapup(callId, participantId, provisional)

Get the wrap-up for this conversation participant. 



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getCallsCallIdParticipantsParticipantIdWrapup(callId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallsCallIdParticipantsParticipantIdWrapup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false]

### Return type

[**Wrapup**](Wrapup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallsCallIdParticipantsParticipantIdWrapupcodes"></a>
# **getCallsCallIdParticipantsParticipantIdWrapupcodes**
> List&lt;WrapupCode&gt; getCallsCallIdParticipantsParticipantIdWrapupcodes(callId, participantId)

Get list of wrapup codes for this conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getCallsCallIdParticipantsParticipantIdWrapupcodes(callId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallsCallIdParticipantsParticipantIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallsHistory"></a>
# **getCallsHistory**
> CallConversationEntityListing getCallsHistory(pageSize, pageNumber, interval)

Get call history



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String interval = "interval_example"; // String | Interval string; format is ISO-8601. Separate start and end times with forward slash '/'
try {
    CallConversationEntityListing result = apiInstance.getCallsHistory(pageSize, pageNumber, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallsHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **interval** | **String**| Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; | [optional]

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallsMaximumconferenceparties"></a>
# **getCallsMaximumconferenceparties**
> MaxParticipants getCallsMaximumconferenceparties()

Get the maximum number of participants that this user can have on a conference



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    MaxParticipants result = apiInstance.getCallsMaximumconferenceparties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getCallsMaximumconferenceparties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MaxParticipants**](MaxParticipants.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChats"></a>
# **getChats**
> ChatConversationEntityListing getChats()

Get recent chat conversations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    ChatConversationEntityListing result = apiInstance.getChats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getChats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChatConversationEntityListing**](ChatConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatsChatId"></a>
# **getChatsChatId**
> ChatConversation getChatsChatId(chatId)

Get chat conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
try {
    ChatConversation result = apiInstance.getChatsChatId(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getChatsChatId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |

### Return type

[**ChatConversation**](ChatConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatsChatIdParticipantsParticipantIdWrapup"></a>
# **getChatsChatIdParticipantsParticipantIdWrapup**
> Wrapup getChatsChatIdParticipantsParticipantIdWrapup(chatId, participantId, provisional)

Get the wrap-up for this conversation participant. 



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getChatsChatIdParticipantsParticipantIdWrapup(chatId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getChatsChatIdParticipantsParticipantIdWrapup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |
 **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false]

### Return type

[**Wrapup**](Wrapup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatsChatIdParticipantsParticipantIdWrapupcodes"></a>
# **getChatsChatIdParticipantsParticipantIdWrapupcodes**
> List&lt;WrapupCode&gt; getChatsChatIdParticipantsParticipantIdWrapupcodes(chatId, participantId)

Get list of wrapup codes for this conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getChatsChatIdParticipantsParticipantIdWrapupcodes(chatId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getChatsChatIdParticipantsParticipantIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationId"></a>
# **getConversationId**
> Conversation getConversationId(conversationId)

Get conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    Conversation result = apiInstance.getConversationId(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdParticipantsParticipantIdWrapup"></a>
# **getConversationIdParticipantsParticipantIdWrapup**
> WrapupCode getConversationIdParticipantsParticipantIdWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant. 



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    WrapupCode result = apiInstance.getConversationIdParticipantsParticipantIdWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationIdParticipantsParticipantIdWrapup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false]

### Return type

[**WrapupCode**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdParticipantsParticipantIdWrapupcodes"></a>
# **getConversationIdParticipantsParticipantIdWrapupcodes**
> List&lt;WrapupCode&gt; getConversationIdParticipantsParticipantIdWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    List<WrapupCode> result = apiInstance.getConversationIdParticipantsParticipantIdWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationIdParticipantsParticipantIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversations"></a>
# **getConversations**
> ConversationEntityListing getConversations(communicationType)

Get conversations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String communicationType = "communicationType_example"; // String | Call or Chat communication filtering
try {
    ConversationEntityListing result = apiInstance.getConversations(communicationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **communicationType** | **String**| Call or Chat communication filtering | [optional]

### Return type

[**ConversationEntityListing**](ConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsConversationIdDetails"></a>
# **getConversationsConversationIdDetails**
> AnalyticsConversation getConversationsConversationIdDetails(conversationId)

Get a conversation by id



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversation result = apiInstance.getConversationsConversationIdDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsConversationIdDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |

### Return type

[**AnalyticsConversation**](AnalyticsConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmails"></a>
# **getEmails**
> EmailConversationEntityListing getEmails()

Get recent email conversations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
try {
    EmailConversationEntityListing result = apiInstance.getEmails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailConversationEntityListing**](EmailConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailId"></a>
# **getEmailsEmailId**
> EmailConversation getEmailsEmailId(emailId)

Get email conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailConversation result = apiInstance.getEmailsEmailId(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |

### Return type

[**EmailConversation**](EmailConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailIdMessages"></a>
# **getEmailsEmailIdMessages**
> EmailMessageListing getEmailsEmailIdMessages(emailId)

Get conversation messages



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailMessageListing result = apiInstance.getEmailsEmailIdMessages(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailIdMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |

### Return type

[**EmailMessageListing**](EmailMessageListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailIdMessagesDraft"></a>
# **getEmailsEmailIdMessagesDraft**
> EmailMessage getEmailsEmailIdMessagesDraft(emailId)

Get conversation draft reply



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
try {
    EmailMessage result = apiInstance.getEmailsEmailIdMessagesDraft(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailIdMessagesDraft");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |

### Return type

[**EmailMessage**](EmailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailIdMessagesMessageId"></a>
# **getEmailsEmailIdMessagesMessageId**
> EmailMessage getEmailsEmailIdMessagesMessageId(emailId, messageId)

Get conversation message



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String messageId = "messageId_example"; // String | messageId
try {
    EmailMessage result = apiInstance.getEmailsEmailIdMessagesMessageId(emailId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailIdMessagesMessageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **messageId** | **String**| messageId |

### Return type

[**EmailMessage**](EmailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailIdParticipantsParticipantIdWrapup"></a>
# **getEmailsEmailIdParticipantsParticipantIdWrapup**
> Wrapup getEmailsEmailIdParticipantsParticipantIdWrapup(emailId, participantId, provisional)

Get the wrap-up for this conversation participant. 



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    Wrapup result = apiInstance.getEmailsEmailIdParticipantsParticipantIdWrapup(emailId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailIdParticipantsParticipantIdWrapup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **participantId** | **String**| participantId |
 **provisional** | **Boolean**| Indicates if the wrap-up code is provisional. | [optional] [default to false]

### Return type

[**Wrapup**](Wrapup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailsEmailIdParticipantsParticipantIdWrapupcodes"></a>
# **getEmailsEmailIdParticipantsParticipantIdWrapupcodes**
> List&lt;WrapupCode&gt; getEmailsEmailIdParticipantsParticipantIdWrapupcodes(emailId, participantId)

Get list of wrapup codes for this conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getEmailsEmailIdParticipantsParticipantIdWrapupcodes(emailId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getEmailsEmailIdParticipantsParticipantIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **participantId** | **String**| participantId |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallbacksCallbackId"></a>
# **patchCallbacksCallbackId**
> Conversation patchCallbacksCallbackId(callbackId, body)

Update a conversation by disconnecting all of the participants



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchCallbacksCallbackId(callbackId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallbacksCallbackId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **body** | [**Conversation**](Conversation.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallbacksCallbackIdParticipantsParticipantId"></a>
# **patchCallbacksCallbackIdParticipantsParticipantId**
> Void patchCallbacksCallbackIdParticipantsParticipantId(callbackId, participantId, body)

Update conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Void result = apiInstance.patchCallbacksCallbackIdParticipantsParticipantId(callbackId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallbacksCallbackIdParticipantsParticipantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Participant |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallbacksCallbackIdParticipantsParticipantIdAttributes"></a>
# **patchCallbacksCallbackIdParticipantsParticipantIdAttributes**
> Void patchCallbacksCallbackIdParticipantsParticipantIdAttributes(callbackId, participantId, body)

Update the attributes on a conversation participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Attributes
try {
    Void result = apiInstance.patchCallbacksCallbackIdParticipantsParticipantIdAttributes(callbackId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallbacksCallbackIdParticipantsParticipantIdAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |
 **body** | [**ParticipantAttributes**](ParticipantAttributes.md)| Attributes |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId"></a>
# **patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId**
> Void patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId(callbackId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Void result = apiInstance.patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId(callbackId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |
 **communicationId** | **String**| communicationId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Participant |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallsCallId"></a>
# **patchCallsCallId**
> Conversation patchCallsCallId(callId, body)

Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchCallsCallId(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallsCallId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **body** | [**Conversation**](Conversation.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallsCallIdParticipantsParticipantId"></a>
# **patchCallsCallIdParticipantsParticipantId**
> Void patchCallsCallIdParticipantsParticipantId(callId, participantId, body)

Update conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant request
try {
    Void result = apiInstance.patchCallsCallIdParticipantsParticipantId(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallsCallIdParticipantsParticipantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Participant request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallsCallIdParticipantsParticipantIdAttributes"></a>
# **patchCallsCallIdParticipantsParticipantIdAttributes**
> Void patchCallsCallIdParticipantsParticipantIdAttributes(callId, participantId, body)

Update the attributes on a conversation participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    Void result = apiInstance.patchCallsCallIdParticipantsParticipantIdAttributes(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallsCallIdParticipantsParticipantIdAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **body** | [**ParticipantAttributes**](ParticipantAttributes.md)| Participant attributes |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId"></a>
# **patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId**
> Void patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId(callId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Void result = apiInstance.patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId(callId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **communicationId** | **String**| communicationId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Participant |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchCallsCallIdParticipantsParticipantIdConsult"></a>
# **patchCallsCallIdParticipantsParticipantIdConsult**
> ConsultTransferResponse patchCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body)

Change who can speak



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ConsultTransferUpdate body = new ConsultTransferUpdate(); // ConsultTransferUpdate | new speak to
try {
    ConsultTransferResponse result = apiInstance.patchCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchCallsCallIdParticipantsParticipantIdConsult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **body** | [**ConsultTransferUpdate**](ConsultTransferUpdate.md)| new speak to |

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchChatsChatId"></a>
# **patchChatsChatId**
> Conversation patchChatsChatId(chatId, body)

Update a conversation by disconnecting all of the participants



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchChatsChatId(chatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchChatsChatId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **body** | [**Conversation**](Conversation.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchChatsChatIdParticipantsParticipantId"></a>
# **patchChatsChatIdParticipantsParticipantId**
> Void patchChatsChatIdParticipantsParticipantId(chatId, participantId, body)

Update conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    Void result = apiInstance.patchChatsChatIdParticipantsParticipantId(chatId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchChatsChatIdParticipantsParticipantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Update request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchChatsChatIdParticipantsParticipantIdAttributes"></a>
# **patchChatsChatIdParticipantsParticipantIdAttributes**
> Void patchChatsChatIdParticipantsParticipantIdAttributes(chatId, participantId, body)

Update the attributes on a conversation participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    Void result = apiInstance.patchChatsChatIdParticipantsParticipantIdAttributes(chatId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchChatsChatIdParticipantsParticipantIdAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |
 **body** | [**ParticipantAttributes**](ParticipantAttributes.md)| Participant attributes |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId"></a>
# **patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId**
> Void patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId(chatId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Void result = apiInstance.patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId(chatId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |
 **communicationId** | **String**| communicationId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Participant |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchConversationIdParticipantsParticipantId"></a>
# **patchConversationIdParticipantsParticipantId**
> Void patchConversationIdParticipantsParticipantId(conversationId, participantId, body)

Update a participant.

Update conversation participant.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    Void result = apiInstance.patchConversationIdParticipantsParticipantId(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationIdParticipantsParticipantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Update request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchConversationIdParticipantsParticipantIdAttributes"></a>
# **patchConversationIdParticipantsParticipantIdAttributes**
> Void patchConversationIdParticipantsParticipantIdAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    Void result = apiInstance.patchConversationIdParticipantsParticipantIdAttributes(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationIdParticipantsParticipantIdAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **body** | [**ParticipantAttributes**](ParticipantAttributes.md)| Participant attributes |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchEmailsEmailId"></a>
# **patchEmailsEmailId**
> Conversation patchEmailsEmailId(emailId, body)

Update a conversation by disconnecting all of the participants



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchEmailsEmailId(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchEmailsEmailId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **body** | [**Conversation**](Conversation.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchEmailsEmailIdParticipantsParticipantId"></a>
# **patchEmailsEmailIdParticipantsParticipantId**
> Void patchEmailsEmailIdParticipantsParticipantId(emailId, participantId, body)

Update conversation participant



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    Void result = apiInstance.patchEmailsEmailIdParticipantsParticipantId(emailId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchEmailsEmailIdParticipantsParticipantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **participantId** | **String**| participantId |
 **body** | [**MediaParticipantRequest**](MediaParticipantRequest.md)| Update request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchEmailsEmailIdParticipantsParticipantIdAttributes"></a>
# **patchEmailsEmailIdParticipantsParticipantIdAttributes**
> Void patchEmailsEmailIdParticipantsParticipantIdAttributes(emailId, participantId, body)

Update the attributes on a conversation participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    Void result = apiInstance.patchEmailsEmailIdParticipantsParticipantIdAttributes(emailId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchEmailsEmailIdParticipantsParticipantIdAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **participantId** | **String**| participantId |
 **body** | [**ParticipantAttributes**](ParticipantAttributes.md)| Participant attributes |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallbacks"></a>
# **postCallbacks**
> CreateCallbackResponse postCallbacks(body)

Create a Callback



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | Callback
try {
    CreateCallbackResponse result = apiInstance.postCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallbacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCallbackCommand**](CreateCallbackCommand.md)| Callback |

### Return type

[**CreateCallbackResponse**](CreateCallbackResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallbacksCallbackIdParticipantsParticipantIdReplace"></a>
# **postCallbacksCallbackIdParticipantsParticipantIdReplace**
> Void postCallbacksCallbackIdParticipantsParticipantIdReplace(callbackId, participantId, body)

Replace this participant with the specified user and/or address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callbackId = "callbackId_example"; // String | callbackId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    Void result = apiInstance.postCallbacksCallbackIdParticipantsParticipantIdReplace(callbackId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallbacksCallbackIdParticipantsParticipantIdReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callbackId** | **String**| callbackId |
 **participantId** | **String**| participantId |
 **body** | [**TransferRequest**](TransferRequest.md)| Transfer request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCalls"></a>
# **postCalls**
> CreateCallResponse postCalls(body)

Create a call conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
CreateCallRequest body = new CreateCallRequest(); // CreateCallRequest | Call request
try {
    CreateCallResponse result = apiInstance.postCalls(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCallRequest**](CreateCallRequest.md)| Call request |

### Return type

[**CreateCallResponse**](CreateCallResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallsCallId"></a>
# **postCallsCallId**
> Conversation postCallsCallId(callId, body)

Add a new call to a conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
CallCommand body = new CallCommand(); // CallCommand | Conversation
try {
    Conversation result = apiInstance.postCallsCallId(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallsCallId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **body** | [**CallCommand**](CallCommand.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallsCallIdParticipants"></a>
# **postCallsCallIdParticipants**
> Conversation postCallsCallIdParticipants(callId, body)

Add participants to a conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.postCallsCallIdParticipants(callId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallsCallIdParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **body** | [**Conversation**](Conversation.md)| Conversation |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallsCallIdParticipantsParticipantIdConsult"></a>
# **postCallsCallIdParticipantsParticipantIdConsult**
> ConsultTransferResponse postCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body)

Initiate and update consult transfer



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
ConsultTransfer body = new ConsultTransfer(); // ConsultTransfer | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallsCallIdParticipantsParticipantIdConsult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **body** | [**ConsultTransfer**](ConsultTransfer.md)| Destination address &amp; initial speak to |

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallsCallIdParticipantsParticipantIdMonitor"></a>
# **postCallsCallIdParticipantsParticipantIdMonitor**
> Void postCallsCallIdParticipantsParticipantIdMonitor(callId, participantId)

Listen in on the conversation from the point of view of a given participant.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
try {
    Void result = apiInstance.postCallsCallIdParticipantsParticipantIdMonitor(callId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallsCallIdParticipantsParticipantIdMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallsCallIdParticipantsParticipantIdReplace"></a>
# **postCallsCallIdParticipantsParticipantIdReplace**
> Void postCallsCallIdParticipantsParticipantIdReplace(callId, participantId, body)

Replace this participant with the specified user and/or address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String callId = "callId_example"; // String | callId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    Void result = apiInstance.postCallsCallIdParticipantsParticipantIdReplace(callId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postCallsCallIdParticipantsParticipantIdReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| callId |
 **participantId** | **String**| participantId |
 **body** | [**TransferRequest**](TransferRequest.md)| Transfer request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChatsChatIdParticipantsParticipantIdReplace"></a>
# **postChatsChatIdParticipantsParticipantIdReplace**
> Void postChatsChatIdParticipantsParticipantIdReplace(chatId, participantId, body)

Replace this participant with the specified user and/or address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String chatId = "chatId_example"; // String | chatId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    Void result = apiInstance.postChatsChatIdParticipantsParticipantIdReplace(chatId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postChatsChatIdParticipantsParticipantIdReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| chatId |
 **participantId** | **String**| participantId |
 **body** | [**TransferRequest**](TransferRequest.md)| Transfer request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationIdParticipantsParticipantIdCallbacks"></a>
# **postConversationIdParticipantsParticipantIdCallbacks**
> Void postConversationIdParticipantsParticipantIdCallbacks(conversationId, participantId, body)

Create a new callback for the specified participant on the conversation.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | 
try {
    Void result = apiInstance.postConversationIdParticipantsParticipantIdCallbacks(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationIdParticipantsParticipantIdCallbacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **body** | [**CreateCallbackCommand**](CreateCallbackCommand.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationIdParticipantsParticipantIdReplace"></a>
# **postConversationIdParticipantsParticipantIdReplace**
> Void postConversationIdParticipantsParticipantIdReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    Void result = apiInstance.postConversationIdParticipantsParticipantIdReplace(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationIdParticipantsParticipantIdReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversation ID |
 **participantId** | **String**| participant ID |
 **body** | [**TransferRequest**](TransferRequest.md)| Transfer request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsAggregatesQuery"></a>
# **postConversationsAggregatesQuery**
> AggregateQueryResponse postConversationsAggregatesQuery(body)

Query for conversation aggregates



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AggregationQuery**](AggregationQuery.md)| query |

### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsConversationIdDetailsProperties"></a>
# **postConversationsConversationIdDetailsProperties**
> PropertyIndexRequest postConversationsConversationIdDetailsProperties(conversationId, body)

Index conversation properties



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postConversationsConversationIdDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsConversationIdDetailsProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **body** | [**PropertyIndexRequest**](PropertyIndexRequest.md)| request |

### Return type

[**PropertyIndexRequest**](PropertyIndexRequest.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsDetailsQuery"></a>
# **postConversationsDetailsQuery**
> AnalyticsConversationQueryResponse postConversationsDetailsQuery(body)

Query for conversation details



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsDetailsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConversationQuery**](ConversationQuery.md)| query |

### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEmailsEmailIdMessages"></a>
# **postEmailsEmailIdMessages**
> EmailMessage postEmailsEmailIdMessages(emailId, body)

Send an email reply



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
EmailMessage body = new EmailMessage(); // EmailMessage | Reply
try {
    EmailMessage result = apiInstance.postEmailsEmailIdMessages(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postEmailsEmailIdMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **body** | [**EmailMessage**](EmailMessage.md)| Reply |

### Return type

[**EmailMessage**](EmailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEmailsEmailIdParticipantsParticipantIdReplace"></a>
# **postEmailsEmailIdParticipantsParticipantIdReplace**
> Void postEmailsEmailIdParticipantsParticipantIdReplace(emailId, participantId, body)

Replace this participant with the specified user and/or address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    Void result = apiInstance.postEmailsEmailIdParticipantsParticipantIdReplace(emailId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postEmailsEmailIdParticipantsParticipantIdReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **participantId** | **String**| participantId |
 **body** | [**TransferRequest**](TransferRequest.md)| Transfer request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFaxes"></a>
# **postFaxes**
> FaxSendResponse postFaxes(body)

Create Fax Conversation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
FaxSendRequest body = new FaxSendRequest(); // FaxSendRequest | Fax
try {
    FaxSendResponse result = apiInstance.postFaxes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postFaxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FaxSendRequest**](FaxSendRequest.md)| Fax |

### Return type

[**FaxSendResponse**](FaxSendResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putEmailsEmailIdMessagesDraft"></a>
# **putEmailsEmailIdMessagesDraft**
> EmailMessage putEmailsEmailIdMessagesDraft(emailId, body)

Update conversation draft reply



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConversationsApi apiInstance = new ConversationsApi();
String emailId = "emailId_example"; // String | emailId
EmailMessage body = new EmailMessage(); // EmailMessage | Draft
try {
    EmailMessage result = apiInstance.putEmailsEmailIdMessagesDraft(emailId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putEmailsEmailIdMessagesDraft");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | **String**| emailId |
 **body** | [**EmailMessage**](EmailMessage.md)| Draft |

### Return type

[**EmailMessage**](EmailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

