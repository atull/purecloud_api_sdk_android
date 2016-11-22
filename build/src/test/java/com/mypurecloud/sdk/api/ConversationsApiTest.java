package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
public class ConversationsApiTest {

    private ConversationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConversationsApi.class);
    }

    
    /**
     * Cancel the transfer
     *
     * 
     */
    @Test
    public void deleteCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        // String response = api.deleteCallsCallIdParticipantsParticipantIdConsult(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Delete a code used to add a communication to this participant
     *
     * 
     */
    @Test
    public void deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcodeTest() {
        String conversationId = null;
        String participantId = null;
        String addCommunicationCode = null;
        // Void response = api.deleteConversationIdParticipantsParticipantIdCodesAddcommunicationcode(conversationId, participantId, addCommunicationCode);

        // TODO: test validations
    }
    
    /**
     * Delete attachment from draft
     *
     * 
     */
    @Test
    public void deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentIdTest() {
        String emailId = null;
        String attachmentId = null;
        // String response = api.deleteEmailsEmailIdMessagesDraftAttachmentsAttachmentId(emailId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get callback conversations
     *
     * 
     */
    @Test
    public void getCallbacksTest() {
        // CallbackConversationEntityListing response = api.getCallbacks();

        // TODO: test validations
    }
    
    /**
     * Get callback conversation
     *
     * 
     */
    @Test
    public void getCallbacksCallbackIdTest() {
        String callbackId = null;
        // CallbackConversation response = api.getCallbacksCallbackId(callbackId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getCallbacksCallbackIdParticipantsParticipantIdWrapupTest() {
        String callbackId = null;
        String participantId = null;
        Boolean provisional = null;
        // Wrapup response = api.getCallbacksCallbackIdParticipantsParticipantIdWrapup(callbackId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getCallbacksCallbackIdParticipantsParticipantIdWrapupcodesTest() {
        String callbackId = null;
        String participantId = null;
        // List<WrapupCode> response = api.getCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(callbackId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get recent conversations
     *
     * 
     */
    @Test
    public void getCallsTest() {
        // CallConversationEntityListing response = api.getCalls();

        // TODO: test validations
    }
    
    /**
     * Get call conversation
     *
     * 
     */
    @Test
    public void getCallsCallIdTest() {
        String callId = null;
        // CallConversation response = api.getCallsCallId(callId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getCallsCallIdParticipantsParticipantIdWrapupTest() {
        String callId = null;
        String participantId = null;
        Boolean provisional = null;
        // Wrapup response = api.getCallsCallIdParticipantsParticipantIdWrapup(callId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getCallsCallIdParticipantsParticipantIdWrapupcodesTest() {
        String callId = null;
        String participantId = null;
        // List<WrapupCode> response = api.getCallsCallIdParticipantsParticipantIdWrapupcodes(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get call history
     *
     * 
     */
    @Test
    public void getCallsHistoryTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String interval = null;
        // CallConversationEntityListing response = api.getCallsHistory(pageSize, pageNumber, interval);

        // TODO: test validations
    }
    
    /**
     * Get the maximum number of participants that this user can have on a conference
     *
     * 
     */
    @Test
    public void getCallsMaximumconferencepartiesTest() {
        // MaxParticipants response = api.getCallsMaximumconferenceparties();

        // TODO: test validations
    }
    
    /**
     * Get recent chat conversations
     *
     * 
     */
    @Test
    public void getChatsTest() {
        // ChatConversationEntityListing response = api.getChats();

        // TODO: test validations
    }
    
    /**
     * Get chat conversation
     *
     * 
     */
    @Test
    public void getChatsChatIdTest() {
        String chatId = null;
        // ChatConversation response = api.getChatsChatId(chatId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getChatsChatIdParticipantsParticipantIdWrapupTest() {
        String chatId = null;
        String participantId = null;
        Boolean provisional = null;
        // Wrapup response = api.getChatsChatIdParticipantsParticipantIdWrapup(chatId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getChatsChatIdParticipantsParticipantIdWrapupcodesTest() {
        String chatId = null;
        String participantId = null;
        // List<WrapupCode> response = api.getChatsChatIdParticipantsParticipantIdWrapupcodes(chatId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get conversation
     *
     * 
     */
    @Test
    public void getConversationIdTest() {
        String conversationId = null;
        // Conversation response = api.getConversationId(conversationId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationIdParticipantsParticipantIdWrapupTest() {
        String conversationId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationIdParticipantsParticipantIdWrapup(conversationId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationIdParticipantsParticipantIdWrapupcodesTest() {
        String conversationId = null;
        String participantId = null;
        // List<WrapupCode> response = api.getConversationIdParticipantsParticipantIdWrapupcodes(conversationId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get conversations
     *
     * 
     */
    @Test
    public void getConversationsTest() {
        String communicationType = null;
        // ConversationEntityListing response = api.getConversations(communicationType);

        // TODO: test validations
    }
    
    /**
     * Get a conversation by id
     *
     * 
     */
    @Test
    public void getConversationsConversationIdDetailsTest() {
        String conversationId = null;
        // AnalyticsConversation response = api.getConversationsConversationIdDetails(conversationId);

        // TODO: test validations
    }
    
    /**
     * Get recent email conversations
     *
     * 
     */
    @Test
    public void getEmailsTest() {
        // EmailConversationEntityListing response = api.getEmails();

        // TODO: test validations
    }
    
    /**
     * Get email conversation
     *
     * 
     */
    @Test
    public void getEmailsEmailIdTest() {
        String emailId = null;
        // EmailConversation response = api.getEmailsEmailId(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation messages
     *
     * 
     */
    @Test
    public void getEmailsEmailIdMessagesTest() {
        String emailId = null;
        // EmailMessageListing response = api.getEmailsEmailIdMessages(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation draft reply
     *
     * 
     */
    @Test
    public void getEmailsEmailIdMessagesDraftTest() {
        String emailId = null;
        // EmailMessage response = api.getEmailsEmailIdMessagesDraft(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation message
     *
     * 
     */
    @Test
    public void getEmailsEmailIdMessagesMessageIdTest() {
        String emailId = null;
        String messageId = null;
        // EmailMessage response = api.getEmailsEmailIdMessagesMessageId(emailId, messageId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getEmailsEmailIdParticipantsParticipantIdWrapupTest() {
        String emailId = null;
        String participantId = null;
        Boolean provisional = null;
        // Wrapup response = api.getEmailsEmailIdParticipantsParticipantIdWrapup(emailId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getEmailsEmailIdParticipantsParticipantIdWrapupcodesTest() {
        String emailId = null;
        String participantId = null;
        // List<WrapupCode> response = api.getEmailsEmailIdParticipantsParticipantIdWrapupcodes(emailId, participantId);

        // TODO: test validations
    }
    
    /**
     * Update a conversation by disconnecting all of the participants
     *
     * 
     */
    @Test
    public void patchCallbacksCallbackIdTest() {
        String callbackId = null;
        Conversation body = null;
        // Conversation response = api.patchCallbacksCallbackId(callbackId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchCallbacksCallbackIdParticipantsParticipantIdTest() {
        String callbackId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchCallbacksCallbackIdParticipantsParticipantId(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchCallbacksCallbackIdParticipantsParticipantIdAttributesTest() {
        String callbackId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchCallbacksCallbackIdParticipantsParticipantIdAttributes(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant&#39;s communication by disconnecting it.
     *
     * 
     */
    @Test
    public void patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationIdTest() {
        String callbackId = null;
        String participantId = null;
        String communicationId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchCallbacksCallbackIdParticipantsParticipantIdCommunicationsCommunicationId(callbackId, participantId, communicationId, body);

        // TODO: test validations
    }
    
    /**
     * Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants
     *
     * 
     */
    @Test
    public void patchCallsCallIdTest() {
        String callId = null;
        Conversation body = null;
        // Conversation response = api.patchCallsCallId(callId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchCallsCallIdParticipantsParticipantIdTest() {
        String callId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchCallsCallIdParticipantsParticipantId(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchCallsCallIdParticipantsParticipantIdAttributesTest() {
        String callId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchCallsCallIdParticipantsParticipantIdAttributes(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant&#39;s communication by disconnecting it.
     *
     * 
     */
    @Test
    public void patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationIdTest() {
        String callId = null;
        String participantId = null;
        String communicationId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchCallsCallIdParticipantsParticipantIdCommunicationsCommunicationId(callId, participantId, communicationId, body);

        // TODO: test validations
    }
    
    /**
     * Change who can speak
     *
     * 
     */
    @Test
    public void patchCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        ConsultTransferUpdate body = null;
        // ConsultTransferResponse response = api.patchCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update a conversation by disconnecting all of the participants
     *
     * 
     */
    @Test
    public void patchChatsChatIdTest() {
        String chatId = null;
        Conversation body = null;
        // Conversation response = api.patchChatsChatId(chatId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchChatsChatIdParticipantsParticipantIdTest() {
        String chatId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchChatsChatIdParticipantsParticipantId(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchChatsChatIdParticipantsParticipantIdAttributesTest() {
        String chatId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchChatsChatIdParticipantsParticipantIdAttributes(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant&#39;s communication by disconnecting it.
     *
     * 
     */
    @Test
    public void patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationIdTest() {
        String chatId = null;
        String participantId = null;
        String communicationId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchChatsChatIdParticipantsParticipantIdCommunicationsCommunicationId(chatId, participantId, communicationId, body);

        // TODO: test validations
    }
    
    /**
     * Update a participant.
     *
     * Update conversation participant.
     */
    @Test
    public void patchConversationIdParticipantsParticipantIdTest() {
        String conversationId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationIdParticipantsParticipantId(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationIdParticipantsParticipantIdAttributesTest() {
        String conversationId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationIdParticipantsParticipantIdAttributes(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update a conversation by disconnecting all of the participants
     *
     * 
     */
    @Test
    public void patchEmailsEmailIdTest() {
        String emailId = null;
        Conversation body = null;
        // Conversation response = api.patchEmailsEmailId(emailId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchEmailsEmailIdParticipantsParticipantIdTest() {
        String emailId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchEmailsEmailIdParticipantsParticipantId(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchEmailsEmailIdParticipantsParticipantIdAttributesTest() {
        String emailId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchEmailsEmailIdParticipantsParticipantIdAttributes(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create a Callback
     *
     * 
     */
    @Test
    public void postCallbacksTest() {
        CreateCallbackCommand body = null;
        // CreateCallbackResponse response = api.postCallbacks(body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postCallbacksCallbackIdParticipantsParticipantIdReplaceTest() {
        String callbackId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postCallbacksCallbackIdParticipantsParticipantIdReplace(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create a call conversation
     *
     * 
     */
    @Test
    public void postCallsTest() {
        CreateCallRequest body = null;
        // CreateCallResponse response = api.postCalls(body);

        // TODO: test validations
    }
    
    /**
     * Add a new call to a conversation
     *
     * 
     */
    @Test
    public void postCallsCallIdTest() {
        String callId = null;
        CallCommand body = null;
        // Conversation response = api.postCallsCallId(callId, body);

        // TODO: test validations
    }
    
    /**
     * Add participants to a conversation
     *
     * 
     */
    @Test
    public void postCallsCallIdParticipantsTest() {
        String callId = null;
        Conversation body = null;
        // Conversation response = api.postCallsCallIdParticipants(callId, body);

        // TODO: test validations
    }
    
    /**
     * Initiate and update consult transfer
     *
     * 
     */
    @Test
    public void postCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        ConsultTransfer body = null;
        // ConsultTransferResponse response = api.postCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Listen in on the conversation from the point of view of a given participant.
     *
     * 
     */
    @Test
    public void postCallsCallIdParticipantsParticipantIdMonitorTest() {
        String callId = null;
        String participantId = null;
        // Void response = api.postCallsCallIdParticipantsParticipantIdMonitor(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postCallsCallIdParticipantsParticipantIdReplaceTest() {
        String callId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postCallsCallIdParticipantsParticipantIdReplace(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postChatsChatIdParticipantsParticipantIdReplaceTest() {
        String chatId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postChatsChatIdParticipantsParticipantIdReplace(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create a new callback for the specified participant on the conversation.
     *
     * 
     */
    @Test
    public void postConversationIdParticipantsParticipantIdCallbacksTest() {
        String conversationId = null;
        String participantId = null;
        CreateCallbackCommand body = null;
        // Void response = api.postConversationIdParticipantsParticipantIdCallbacks(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationIdParticipantsParticipantIdReplaceTest() {
        String conversationId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationIdParticipantsParticipantIdReplace(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation aggregates
     *
     * 
     */
    @Test
    public void postConversationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postConversationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Index conversation properties
     *
     * 
     */
    @Test
    public void postConversationsConversationIdDetailsPropertiesTest() {
        String conversationId = null;
        PropertyIndexRequest body = null;
        // PropertyIndexRequest response = api.postConversationsConversationIdDetailsProperties(conversationId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation details
     *
     * 
     */
    @Test
    public void postConversationsDetailsQueryTest() {
        ConversationQuery body = null;
        // AnalyticsConversationQueryResponse response = api.postConversationsDetailsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Send an email reply
     *
     * 
     */
    @Test
    public void postEmailsEmailIdMessagesTest() {
        String emailId = null;
        EmailMessage body = null;
        // EmailMessage response = api.postEmailsEmailIdMessages(emailId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postEmailsEmailIdParticipantsParticipantIdReplaceTest() {
        String emailId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postEmailsEmailIdParticipantsParticipantIdReplace(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create Fax Conversation
     *
     * 
     */
    @Test
    public void postFaxesTest() {
        FaxSendRequest body = null;
        // FaxSendResponse response = api.postFaxes(body);

        // TODO: test validations
    }
    
    /**
     * Update conversation draft reply
     *
     * 
     */
    @Test
    public void putEmailsEmailIdMessagesDraftTest() {
        String emailId = null;
        EmailMessage body = null;
        // EmailMessage response = api.putEmailsEmailIdMessagesDraft(emailId, body);

        // TODO: test validations
    }
    
}
