package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AnalyticsConversation;
import io.swagger.client.model.ConversationEntityListing;
import io.swagger.client.model.CallbackConversationEntityListing;
import io.swagger.client.model.CallbackConversation;
import io.swagger.client.model.WrapupCode;
import io.swagger.client.model.CallConversationEntityListing;
import io.swagger.client.model.CallConversation;
import io.swagger.client.model.MaxParticipants;
import io.swagger.client.model.ChatConversationEntityListing;
import io.swagger.client.model.ChatConversation;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.EmailConversationEntityListing;
import io.swagger.client.model.EmailConversation;
import io.swagger.client.model.EmailMessageListing;
import io.swagger.client.model.EmailMessage;
import io.swagger.client.model.MediaParticipantRequest;
import io.swagger.client.model.ParticipantAttributes;
import io.swagger.client.model.ConsultTransferResponse;
import io.swagger.client.model.ConsultTransferUpdate;
import io.swagger.client.model.AggregationQuery;
import io.swagger.client.model.AggregateQueryResponse;
import io.swagger.client.model.PropertyIndexRequest;
import io.swagger.client.model.ConversationQuery;
import io.swagger.client.model.AnalyticsConversationQueryResponse;
import io.swagger.client.model.CreateCallbackCommand;
import io.swagger.client.model.CreateCallbackResponse;
import io.swagger.client.model.TransferRequest;
import io.swagger.client.model.CreateCallRequest;
import io.swagger.client.model.CreateCallResponse;
import io.swagger.client.model.CallCommand;
import io.swagger.client.model.ConsultTransfer;
import io.swagger.client.model.FaxSendRequest;
import io.swagger.client.model.FaxSendResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConversationsApi {
  /**
   * Cancel the transfer
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<String> deleteConversationsCallsCallIdParticipantsParticipantIdConsult(
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
  Call<Void> deleteConversationsConversationIdParticipantsParticipantIdCodesAddcommunicationcode(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Path("addCommunicationCode") String addCommunicationCode
  );

  /**
   * Delete attachment from draft
   * 
   * @param emailId  (required)
   * @param attachmentId  (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/conversations/emails/{emailId}/messages/draft/attachments/{attachmentId}")
  Call<String> deleteConversationsEmailsEmailIdMessagesDraftAttachmentsAttachmentId(
    @Path("emailId") String emailId, @Path("attachmentId") String attachmentId
  );

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return Call<AnalyticsConversation>
   */
  
  @GET("api/v2/analytics/conversations/{conversationId}/details")
  Call<AnalyticsConversation> getAnalyticsConversationsConversationIdDetails(
    @Path("conversationId") String conversationId
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
   * Get callback conversations
   * 
   * @return Call<CallbackConversationEntityListing>
   */
  
  @GET("api/v2/conversations/callbacks")
  Call<CallbackConversationEntityListing> getConversationsCallbacks();
    

  /**
   * Get callback conversation
   * 
   * @param callbackId  (required)
   * @return Call<CallbackConversation>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}")
  Call<CallbackConversation> getConversationsCallbacksCallbackId(
    @Path("callbackId") String callbackId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callbackId  (required)
   * @param participantId  (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapup")
  Call<WrapupCode> getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapup(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callbackId  (required)
   * @param participantId  (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/wrapupcodes")
  Call<WrapupCode> getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId
  );

  /**
   * Get recent conversations
   * 
   * @return Call<CallConversationEntityListing>
   */
  
  @GET("api/v2/conversations/calls")
  Call<CallConversationEntityListing> getConversationsCalls();
    

  /**
   * Get call conversation
   * 
   * @param callId  (required)
   * @return Call<CallConversation>
   */
  
  @GET("api/v2/conversations/calls/{callId}")
  Call<CallConversation> getConversationsCallsCallId(
    @Path("callId") String callId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/calls/{callId}/participants/{participantId}/wrapup")
  Call<WrapupCode> getConversationsCallsCallIdParticipantsParticipantIdWrapup(
    @Path("callId") String callId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/calls/{callId}/participants/{participantId}/wrapupcodes")
  Call<WrapupCode> getConversationsCallsCallIdParticipantsParticipantIdWrapupcodes(
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
  Call<CallConversationEntityListing> getConversationsCallsHistory(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("interval") String interval
  );

  /**
   * Get the maximum number of participants that this user can have on a conference
   * 
   * @return Call<MaxParticipants>
   */
  
  @GET("api/v2/conversations/calls/maximumconferenceparties")
  Call<MaxParticipants> getConversationsCallsMaximumconferenceparties();
    

  /**
   * Get recent chat conversations
   * 
   * @return Call<ChatConversationEntityListing>
   */
  
  @GET("api/v2/conversations/chats")
  Call<ChatConversationEntityListing> getConversationsChats();
    

  /**
   * Get chat conversation
   * 
   * @param chatId  (required)
   * @return Call<ChatConversation>
   */
  
  @GET("api/v2/conversations/chats/{chatId}")
  Call<ChatConversation> getConversationsChatsChatId(
    @Path("chatId") String chatId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param chatId  (required)
   * @param participantId  (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapup")
  Call<WrapupCode> getConversationsChatsChatIdParticipantsParticipantIdWrapup(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param chatId  (required)
   * @param participantId  (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/chats/{chatId}/participants/{participantId}/wrapupcodes")
  Call<WrapupCode> getConversationsChatsChatIdParticipantsParticipantIdWrapupcodes(
    @Path("chatId") String chatId, @Path("participantId") String participantId
  );

  /**
   * Get conversation
   * 
   * @param conversationId conversation ID (required)
   * @return Call<Conversation>
   */
  
  @GET("api/v2/conversations/{conversationId}")
  Call<Conversation> getConversationsConversationId(
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
  Call<WrapupCode> getConversationsConversationIdParticipantsParticipantIdWrapup(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes")
  Call<WrapupCode> getConversationsConversationIdParticipantsParticipantIdWrapupcodes(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId
  );

  /**
   * Get recent email conversations
   * 
   * @return Call<EmailConversationEntityListing>
   */
  
  @GET("api/v2/conversations/emails")
  Call<EmailConversationEntityListing> getConversationsEmails();
    

  /**
   * Get email conversation
   * 
   * @param emailId  (required)
   * @return Call<EmailConversation>
   */
  
  @GET("api/v2/conversations/emails/{emailId}")
  Call<EmailConversation> getConversationsEmailsEmailId(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation messages
   * 
   * @param emailId  (required)
   * @return Call<EmailMessageListing>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages")
  Call<EmailMessageListing> getConversationsEmailsEmailIdMessages(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation draft reply
   * 
   * @param emailId  (required)
   * @return Call<EmailMessage>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages/draft")
  Call<EmailMessage> getConversationsEmailsEmailIdMessagesDraft(
    @Path("emailId") String emailId
  );

  /**
   * Get conversation message
   * 
   * @param emailId  (required)
   * @param messageId  (required)
   * @return Call<EmailMessage>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/messages/{messageId}")
  Call<EmailMessage> getConversationsEmailsEmailIdMessagesMessageId(
    @Path("emailId") String emailId, @Path("messageId") String messageId
  );

  /**
   * Get the wrap-up for this conversation participant. 
   * 
   * @param emailId  (required)
   * @param participantId  (required)
   * @param provisional Indicates if the wrap-up code is provisional. (optional, default to false)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapup")
  Call<WrapupCode> getConversationsEmailsEmailIdParticipantsParticipantIdWrapup(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Query("provisional") Boolean provisional
  );

  /**
   * Get list of wrapup codes for this conversation participant
   * 
   * @param emailId  (required)
   * @param participantId  (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/conversations/emails/{emailId}/participants/{participantId}/wrapupcodes")
  Call<WrapupCode> getConversationsEmailsEmailIdParticipantsParticipantIdWrapupcodes(
    @Path("emailId") String emailId, @Path("participantId") String participantId
  );

  /**
   * Update conversation participant
   * 
   * @param callbackId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}")
  Call<Void> patchConversationsCallbacksCallbackIdParticipantsParticipantId(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callbackId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/attributes")
  Call<Void> patchConversationsCallbacksCallbackIdParticipantsParticipantIdAttributes(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update conversation
   * 
   * @param callId  (required)
   * @param body Conversation (optional)
   * @return Call<Conversation>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}")
  Call<Conversation> patchConversationsCallsCallId(
    @Path("callId") String callId, @Body Conversation body
  );

  /**
   * Update conversation participant
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}")
  Call<Void> patchConversationsCallsCallIdParticipantsParticipantId(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}/attributes")
  Call<Void> patchConversationsCallsCallIdParticipantsParticipantIdAttributes(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Change who can speak
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param body new speak to (optional)
   * @return Call<ConsultTransferResponse>
   */
  
  @PATCH("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<ConsultTransferResponse> patchConversationsCallsCallIdParticipantsParticipantIdConsult(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ConsultTransferUpdate body
  );

  /**
   * Update conversation participant
   * 
   * @param chatId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}/participants/{participantId}")
  Call<Void> patchConversationsChatsChatIdParticipantsParticipantId(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param chatId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/chats/{chatId}/participants/{participantId}/attributes")
  Call<Void> patchConversationsChatsChatIdParticipantsParticipantIdAttributes(
    @Path("chatId") String chatId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update a participant.
   * Update conversation participant.
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/{conversationId}/participants/{participantId}")
  Call<Void> patchConversationsConversationIdParticipantsParticipantId(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/{conversationId}/participants/{participantId}/attributes")
  Call<Void> patchConversationsConversationIdParticipantsParticipantIdAttributes(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Update conversation participant
   * 
   * @param emailId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/emails/{emailId}/participants/{participantId}")
  Call<Void> patchConversationsEmailsEmailIdParticipantsParticipantId(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body MediaParticipantRequest body
  );

  /**
   * Update the attributes on a conversation participant.
   * 
   * @param emailId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @PATCH("api/v2/conversations/emails/{emailId}/participants/{participantId}/attributes")
  Call<Void> patchConversationsEmailsEmailIdParticipantsParticipantIdAttributes(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body ParticipantAttributes body
  );

  /**
   * Query for conversation aggregates
   * 
   * @param body query (optional)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/aggregates/query")
  Call<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (optional)
   * @return Call<PropertyIndexRequest>
   */
  
  @POST("api/v2/analytics/conversations/{conversationId}/details/properties")
  Call<PropertyIndexRequest> postAnalyticsConversationsConversationIdDetailsProperties(
    @Path("conversationId") String conversationId, @Body PropertyIndexRequest body
  );

  /**
   * Query for conversation details
   * 
   * @param body query (optional)
   * @return Call<AnalyticsConversationQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/details/query")
  Call<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(
    @Body ConversationQuery body
  );

  /**
   * Create a Callback
   * 
   * @param body  (optional)
   * @return Call<CreateCallbackResponse>
   */
  
  @POST("api/v2/conversations/callbacks")
  Call<CreateCallbackResponse> postConversationsCallbacks(
    @Body CreateCallbackCommand body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callbackId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/callbacks/{callbackId}/participants/{participantId}/replace")
  Call<Void> postConversationsCallbacksCallbackIdParticipantsParticipantIdReplace(
    @Path("callbackId") String callbackId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Create a call conversation
   * 
   * @param body  (optional)
   * @return Call<CreateCallResponse>
   */
  
  @POST("api/v2/conversations/calls")
  Call<CreateCallResponse> postConversationsCalls(
    @Body CreateCallRequest body
  );

  /**
   * Add a new call to a conversation
   * 
   * @param callId  (required)
   * @param body Conversation (optional)
   * @return Call<Conversation>
   */
  
  @POST("api/v2/conversations/calls/{callId}")
  Call<Conversation> postConversationsCallsCallId(
    @Path("callId") String callId, @Body CallCommand body
  );

  /**
   * Add participants to a conversation
   * 
   * @param callId  (required)
   * @param body Conversation (optional)
   * @return Call<Conversation>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants")
  Call<Conversation> postConversationsCallsCallIdParticipants(
    @Path("callId") String callId, @Body Conversation body
  );

  /**
   * Initiate and update consult transfer
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param body Destination address &amp; initial speak to (optional)
   * @return Call<ConsultTransferResponse>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/consult")
  Call<ConsultTransferResponse> postConversationsCallsCallIdParticipantsParticipantIdConsult(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body ConsultTransfer body
  );

  /**
   * Listen in on the conversation from the point of view of a given participant.
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/monitor")
  Call<Void> postConversationsCallsCallIdParticipantsParticipantIdMonitor(
    @Path("callId") String callId, @Path("participantId") String participantId
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param callId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/calls/{callId}/participants/{participantId}/replace")
  Call<Void> postConversationsCallsCallIdParticipantsParticipantIdReplace(
    @Path("callId") String callId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param chatId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/chats/{chatId}/participants/{participantId}/replace")
  Call<Void> postConversationsChatsChatIdParticipantsParticipantIdReplace(
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
  Call<Void> postConversationsConversationIdParticipantsParticipantIdCallbacks(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body CreateCallbackCommand body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param conversationId conversation ID (required)
   * @param participantId participant ID (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/{conversationId}/participants/{participantId}/replace")
  Call<Void> postConversationsConversationIdParticipantsParticipantIdReplace(
    @Path("conversationId") String conversationId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Send an email reply
   * 
   * @param emailId  (required)
   * @param body Reply (optional)
   * @return Call<EmailMessage>
   */
  
  @POST("api/v2/conversations/emails/{emailId}/messages")
  Call<EmailMessage> postConversationsEmailsEmailIdMessages(
    @Path("emailId") String emailId, @Body EmailMessage body
  );

  /**
   * Replace this participant with the specified user and/or address
   * 
   * @param emailId  (required)
   * @param participantId  (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/conversations/emails/{emailId}/participants/{participantId}/replace")
  Call<Void> postConversationsEmailsEmailIdParticipantsParticipantIdReplace(
    @Path("emailId") String emailId, @Path("participantId") String participantId, @Body TransferRequest body
  );

  /**
   * Create Fax Conversation
   * 
   * @param body Fax (optional)
   * @return Call<FaxSendResponse>
   */
  
  @POST("api/v2/conversations/faxes")
  Call<FaxSendResponse> postConversationsFaxes(
    @Body FaxSendRequest body
  );

  /**
   * Update conversation draft reply
   * 
   * @param emailId  (required)
   * @param body Draft (optional)
   * @return Call<EmailMessage>
   */
  
  @PUT("api/v2/conversations/emails/{emailId}/messages/draft")
  Call<EmailMessage> putConversationsEmailsEmailIdMessagesDraft(
    @Path("emailId") String emailId, @Body EmailMessage body
  );

}
