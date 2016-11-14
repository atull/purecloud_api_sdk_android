package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.model.CallbackConversation;
import com.mypurecloud.sdk.model.Wrapup;
import com.mypurecloud.sdk.model.WrapupCode;
import com.mypurecloud.sdk.model.CallConversationEntityListing;
import com.mypurecloud.sdk.model.CallConversation;
import com.mypurecloud.sdk.model.MaxParticipants;
import com.mypurecloud.sdk.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.model.ChatConversation;
import com.mypurecloud.sdk.model.Conversation;
import com.mypurecloud.sdk.model.ConversationEntityListing;
import com.mypurecloud.sdk.model.AnalyticsConversation;
import com.mypurecloud.sdk.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.model.EmailConversation;
import com.mypurecloud.sdk.model.EmailMessageListing;
import com.mypurecloud.sdk.model.EmailMessage;
import com.mypurecloud.sdk.model.MediaParticipantRequest;
import com.mypurecloud.sdk.model.ParticipantAttributes;
import com.mypurecloud.sdk.model.ConsultTransferResponse;
import com.mypurecloud.sdk.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.model.CreateCallbackCommand;
import com.mypurecloud.sdk.model.CreateCallbackResponse;
import com.mypurecloud.sdk.model.TransferRequest;
import com.mypurecloud.sdk.model.CreateCallRequest;
import com.mypurecloud.sdk.model.CreateCallResponse;
import com.mypurecloud.sdk.model.CallCommand;
import com.mypurecloud.sdk.model.ConsultTransfer;
import com.mypurecloud.sdk.model.AggregationQuery;
import com.mypurecloud.sdk.model.AggregateQueryResponse;
import com.mypurecloud.sdk.model.PropertyIndexRequest;
import com.mypurecloud.sdk.model.ConversationQuery;
import com.mypurecloud.sdk.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.model.FaxSendRequest;
import com.mypurecloud.sdk.model.FaxSendResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConversationsApi {
  /**
   * Cancel the transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<String> deleteCallsCallIdParticipantsParticipantIdConsult(
    @Path("callId") String callId, @Path("participantId") String participantId
  );

  /**
   * Delete a code used to add a communication to this participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param addCommunicationCode addCommunicationCode (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode}")
  Call<Void> deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Path("addCommunicationCode") String addCommunicationCode
  );

  /**
   * Delete attachment from draft
   * 
   * @param emailId emailId (required)
   * @param attachmentId attachmentId (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId}")
  Call<String> deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId(
    @Path("emailId") String emailId, @Path("attachmentId") String attachmentId
  );

  /**
   * Get callback conversations
   * 
   * @return Call<CallbackConversationEntityListing>
   */
  
  @GET("api/v2/conversations/callbacks")
  Call<CallbackConversationEntityListing> getCallbacks();
    

  /**
   * Get callback conversation
   * 
   * @param callbackId callbackId (required)
   * @return Call<CallbackConversation>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}")
  Call<CallbackConversation> getCallbacksCallbackId(
    @Path("callbackId") String callbackId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<Wrapup>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup")
  Call<Wrapup> getCallbacksCallbackIdParticipantsParticipantIdWrapup(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @return Call<List<WrapupCode>>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes")
  Call<List<WrapupCode>> getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId
  );

  /**
   * Get recent conversations
   * 
   * @return Call<CallConversationEntityListing>
   */
  
  @GET("api/v2/conversations/calls")
  Call<CallConversationEntityListing> getCalls();
    

  /**
   * Get call conversation
   * 
   * @param callId callId (required)
   * @return Call<CallConversation>
   */
  
  @GET("api/v2/conversations/calls/{callId}")
  Call<CallConversation> getCallsCallId(
    @Path("callId") String callId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<Wrapup>
   */
  
  @GET("api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup")
  Call<Wrapup> getCallsCallIdParticipantsParticipantIdWrapup(
    @Path("callId") String callId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return Call<List<WrapupCode>>
   */
  
  @GET("api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes")
  Call<List<WrapupCode>> getCallsCallIdParticipantsParticipantIdWrapupcodes(
    @Path("callId") String callId, @Path("participantId") String participantId
  );

  /**
   * Get call history
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param interval Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; (optional)
   * @return Call<CallConversationEntityListing>
   */
  
  @GET("api/v2/conversations/calls/history")
  Call<CallConversationEntityListing> getCallsHistory(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("interval") String interval
  );

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return Call<MaxParticipants>
   */
  
  @GET("api/v2/conversations/calls/maximumconferenceparties")
  Call<MaxParticipants> getCallsMaximumconferenceparties();
    

  /**
   * Get recent chat conversations
   * 
   * @return Call<ChatConversationEntityListing>
   */
  
  @GET("api/v2/conversations/chats")
  Call<ChatConversationEntityListing> getChats();
    

  /**
   * Get chat conversation
   * 
   * @param chatId chatId (required)
   * @return Call<ChatConversation>
   */
  
  @GET("api/v2/conversations/chats/{chatId}")
  Call<ChatConversation> getChatsChatId(
    @Path("chatId") String chatId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<Wrapup>
   */
  
  @GET("api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup")
  Call<Wrapup> getChatsChatIdParticipantsParticipantIdWrapup(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @return Call<List<WrapupCode>>
   */
  
  @GET("api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes")
  Call<List<WrapupCode>> getChatsChatIdParticipantsParticipantIdWrapupcodes(
    @Path("chatId") String chatId, @Path("participantId") String participantId
  );

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Call<Conversation>
   */
  
  @GET("api/v2/conversations/{conversationId}")
  Call<Conversation> getConversationId(
    @Path("conversationId") String conversationId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/{conversationId}/participants/{participantId}/wrapup")
  Call<WrapupCode> getConversationIdParticipantsParticipantIdWrapup(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return Call<List<WrapupCode>>
   */
  
  @GET("api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes")
  Call<List<WrapupCode>> getConversationIdParticipantsParticipantIdWrapupcodes(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId
  );

  /**
   * Get conversations
   * 
   * @param communicationType Call or Chat communication filtering (optional)
   * @return Call<ConversationEntityListing>
   */
  
  @GET("api/v2/conversations")
  Call<ConversationEntityListing> getConversations(
    @Query("communicationType") String communicationType
  );

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return Call<AnalyticsConversation>
   */
  
  @GET("api/v2/analytics/conversations/{conversationId}/details")
  Call<AnalyticsConversation> getConversationsConversationIdDetails(
    @Path("conversationId") String conversationId
  );

  /**
   * Get recent email conversations
   * 
   * @return Call<EmailConversationEntityListing>
   */
  
  @GET("api/v2/conversations/emails")
  Call<EmailConversationEntityListing> getEmails();
    

  /**
   * Get email conversation
   * 
   * @param emailId emailId (required)
   * @return Call<EmailConversation>
   */
  
  @GET("api/v2/conversations/emails/{emailId}")
  Call<EmailConversation> getEmailsEmailId(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation messages
   * 
   * @param emailId emailId (required)
   * @return Call<EmailMessageListing>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages")
  Call<EmailMessageListing> getEmailsEmailIdMessages(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation draft reply
   * 
   * @param emailId emailId (required)
   * @return Call<EmailMessage>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages/draft")
  Call<EmailMessage> getEmailsEmailIdMessagesDraft(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation message
   * 
   * @param emailId emailId (required)
   * @param messageId messageId (required)
   * @return Call<EmailMessage>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages/{messageId}")
  Call<EmailMessage> getEmailsEmailIdMessagesMessageId(
    @Path("emailId") String emailId, @Path("messageId") String messageId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<Wrapup>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup")
  Call<Wrapup> getEmailsEmailIdParticipantsParticipantIdWrapup(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @return Call<List<WrapupCode>>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes")
  Call<List<WrapupCode>> getEmailsEmailIdParticipantsParticipantIdWrapupcodes(
    @Path("emailId") String emailId, @Path("participantId") String participantId
  );

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param callbackId callbackId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}")
  Call<Conversation> patchCallbacksCallbackId(
    @Path("callbackId") String callbackId, @Body Conversation body
  );

  /**
   * Update conversation participant
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Participant (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}")
  Call<Void> patchCallbacksCallbackIdParticipantsParticipantId(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Attributes (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes")
  Call<Void> patchCallbacksCallbackIdParticipantsParticipantIdAttributes(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/communications/{communicationId}")
  Call<Void> patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Path("communicationId") String communicationId, @Body MediaParticipantRequest body
  );

  /**
   * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}")
  Call<Conversation> patchCallsCallId(
    @Path("callId") String callId, @Body Conversation body
  );

  /**
   * Update conversation participant
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant request (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}")
  Call<Void> patchCallsCallIdParticipantsParticipantId(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}/attributes")
  Call<Void> patchCallsCallIdParticipantsParticipantIdAttributes(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}/communications/{communicationId}")
  Call<Void> patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId(
    @Path("callId") String callId, @Path("participantId") String participantId, @Path("communicationId") String communicationId, @Body MediaParticipantRequest body
  );

  /**
   * Change who can speak
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body new speak to (required)
   * @return Call<ConsultTransferResponse>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<ConsultTransferResponse> patchCallsCallIdParticipantsParticipantIdConsult(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ConsultTransferUpdate body
  );

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param chatId chatId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}")
  Call<Conversation> patchChatsChatId(
    @Path("chatId") String chatId, @Body Conversation body
  );

  /**
   * Update conversation participant
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}/participants/{participantId}")
  Call<Void> patchChatsChatIdParticipantsParticipantId(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes")
  Call<Void> patchChatsChatIdParticipantsParticipantIdAttributes(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update conversation participant&#39;s communication by disconnecting it.
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param communicationId communicationId (required)
   * @param body Participant (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}/participants/{participantId}/communications/{communicationId}")
  Call<Void> patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Path("communicationId") String communicationId, @Body MediaParticipantRequest body
  );

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Update request (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/{conversationId}/participants/{participantId}")
  Call<Void> patchConversationIdParticipantsParticipantId(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Participant attributes (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/{conversationId}/participants/{participantId}/attributes")
  Call<Void> patchConversationIdParticipantsParticipantIdAttributes(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update a conversation by disconnecting all of the participants
   * 
   * @param emailId emailId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @PATCH("api/v2/conversations/emails/{emailId}")
  Call<Conversation> patchEmailsEmailId(
    @Path("emailId") String emailId, @Body Conversation body
  );

  /**
   * Update conversation participant
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Update request (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/emails/{emailId}/participants/{participantId}")
  Call<Void> patchEmailsEmailIdParticipantsParticipantId(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Participant attributes (required)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes")
  Call<Void> patchEmailsEmailIdParticipantsParticipantIdAttributes(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Create a Callback
   * 
   * @param body Callback (required)
   * @return Call<CreateCallbackResponse>
   */
  
  @POST("api/v2/conversations/callbacks")
  Call<CreateCallbackResponse> postCallbacks(
    @Body CreateCallbackCommand body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId callbackId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace")
  Call<Void> postCallbacksCallbackIdParticipantsParticipantIdReplace(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Create a call conversation
   * 
   * @param body Call request (required)
   * @return Call<CreateCallResponse>
   */
  
  @POST("api/v2/conversations/calls")
  Call<CreateCallResponse> postCalls(
    @Body CreateCallRequest body
  );

  /**
   * Add a new call to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @POST("api/v2/conversations/calls/{callId}")
  Call<Conversation> postCallsCallId(
    @Path("callId") String callId, @Body CallCommand body
  );

  /**
   * Add participants to a conversation
   * 
   * @param callId callId (required)
   * @param body Conversation (required)
   * @return Call<Conversation>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants")
  Call<Conversation> postCallsCallIdParticipants(
    @Path("callId") String callId, @Body Conversation body
  );

  /**
   * Initiate and update consult transfer
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Destination address &amp; initial speak to (required)
   * @return Call<ConsultTransferResponse>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<ConsultTransferResponse> postCallsCallIdParticipantsParticipantIdConsult(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ConsultTransfer body
  );

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/monitor")
  Call<Void> postCallsCallIdParticipantsParticipantIdMonitor(
    @Path("callId") String callId, @Path("participantId") String participantId
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callId callId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/replace")
  Call<Void> postCallsCallIdParticipantsParticipantIdReplace(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId chatId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/chats/{chatId}/participants/{participantId}/replace")
  Call<Void> postChatsChatIdParticipantsParticipantIdReplace(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Create a new callback for the specified participant on the conversation.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/{conversationId}/participants/{participantId}/callbacks")
  Call<Void> postConversationIdParticipantsParticipantIdCallbacks(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body CreateCallbackCommand body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body Transfer request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/{conversationId}/participants/{participantId}/replace")
  Call<Void> postConversationIdParticipantsParticipantIdReplace(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/aggregates/query")
  Call<AggregateQueryResponse> postConversationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return Call<PropertyIndexRequest>
   */
  
  @POST("api/v2/analytics/conversations/{conversationId}/details/properties")
  Call<PropertyIndexRequest> postConversationsConversationIdDetailsProperties(
    @Path("conversationId") String conversationId, @Body PropertyIndexRequest body
  );

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return Call<AnalyticsConversationQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/details/query")
  Call<AnalyticsConversationQueryResponse> postConversationsDetailsQuery(
    @Body ConversationQuery body
  );

  /**
   * Send an email reply
   * 
   * @param emailId emailId (required)
   * @param body Reply (required)
   * @return Call<EmailMessage>
   */
  
  @POST("api/v2/conversations/emails/{emailId}/messages")
  Call<EmailMessage> postEmailsEmailIdMessages(
    @Path("emailId") String emailId, @Body EmailMessage body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId emailId (required)
   * @param participantId participantId (required)
   * @param body Transfer request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/emails/{emailId}/participants/{participantId}/replace")
  Call<Void> postEmailsEmailIdParticipantsParticipantIdReplace(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (required)
   * @return Call<FaxSendResponse>
   */
  
  @POST("api/v2/conversations/faxes")
  Call<FaxSendResponse> postFaxes(
    @Body FaxSendRequest body
  );

  /**
   * Update conversation draft reply
   * 
   * @param emailId emailId (required)
   * @param body Draft (required)
   * @return Call<EmailMessage>
   */
  
  @PUT("api/v2/conversations/emails/{emailId}/messages/draft")
  Call<EmailMessage> putEmailsEmailIdMessagesDraft(
    @Path("emailId") String emailId, @Body EmailMessage body
  );

}
