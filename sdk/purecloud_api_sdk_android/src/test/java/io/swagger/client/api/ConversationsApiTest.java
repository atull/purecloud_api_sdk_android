package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
    public void deleteConversationsCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        // String response = api.deleteConversationsCallsCallIdParticipantsParticipantIdConsult(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Delete a code used to add a communication to this participant
     *
     * 
     */
    @Test
    public void deleteConversationsConversationIdParticipantsParticipantIdCodesAddcommunicationcodeTest() {
        String conversationId = null;
        String participantId = null;
        String addCommunicationCode = null;
        // Void response = api.deleteConversationsConversationIdParticipantsParticipantIdCodesAddcommunicationcode(conversationId, participantId, addCommunicationCode);

        // TODO: test validations
    }
    
    /**
     * Delete attachment from draft
     *
     * 
     */
    @Test
    public void deleteConversationsEmailsEmailIdMessagesDraftAttachmentsAttachmentIdTest() {
        String emailId = null;
        String attachmentId = null;
        // String response = api.deleteConversationsEmailsEmailIdMessagesDraftAttachmentsAttachmentId(emailId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get a conversation by id
     *
     * 
     */
    @Test
    public void getAnalyticsConversationsConversationIdDetailsTest() {
        String conversationId = null;
        // AnalyticsConversation response = api.getAnalyticsConversationsConversationIdDetails(conversationId);

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
     * Get callback conversations
     *
     * 
     */
    @Test
    public void getConversationsCallbacksTest() {
        // CallbackConversationEntityListing response = api.getConversationsCallbacks();

        // TODO: test validations
    }
    
    /**
     * Get callback conversation
     *
     * 
     */
    @Test
    public void getConversationsCallbacksCallbackIdTest() {
        String callbackId = null;
        // CallbackConversation response = api.getConversationsCallbacksCallbackId(callbackId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapupTest() {
        String callbackId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapup(callbackId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapupcodesTest() {
        String callbackId = null;
        String participantId = null;
        // WrapupCode response = api.getConversationsCallbacksCallbackIdParticipantsParticipantIdWrapupcodes(callbackId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get recent conversations
     *
     * 
     */
    @Test
    public void getConversationsCallsTest() {
        // CallConversationEntityListing response = api.getConversationsCalls();

        // TODO: test validations
    }
    
    /**
     * Get call conversation
     *
     * 
     */
    @Test
    public void getConversationsCallsCallIdTest() {
        String callId = null;
        // CallConversation response = api.getConversationsCallsCallId(callId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationsCallsCallIdParticipantsParticipantIdWrapupTest() {
        String callId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationsCallsCallIdParticipantsParticipantIdWrapup(callId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationsCallsCallIdParticipantsParticipantIdWrapupcodesTest() {
        String callId = null;
        String participantId = null;
        // WrapupCode response = api.getConversationsCallsCallIdParticipantsParticipantIdWrapupcodes(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get call history
     *
     * 
     */
    @Test
    public void getConversationsCallsHistoryTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String interval = null;
        // CallConversationEntityListing response = api.getConversationsCallsHistory(pageSize, pageNumber, interval);

        // TODO: test validations
    }
    
    /**
     * Get the maximum number of participants that this user can have on a conference
     *
     * 
     */
    @Test
    public void getConversationsCallsMaximumconferencepartiesTest() {
        // MaxParticipants response = api.getConversationsCallsMaximumconferenceparties();

        // TODO: test validations
    }
    
    /**
     * Get recent chat conversations
     *
     * 
     */
    @Test
    public void getConversationsChatsTest() {
        // ChatConversationEntityListing response = api.getConversationsChats();

        // TODO: test validations
    }
    
    /**
     * Get chat conversation
     *
     * 
     */
    @Test
    public void getConversationsChatsChatIdTest() {
        String chatId = null;
        // ChatConversation response = api.getConversationsChatsChatId(chatId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationsChatsChatIdParticipantsParticipantIdWrapupTest() {
        String chatId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationsChatsChatIdParticipantsParticipantIdWrapup(chatId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationsChatsChatIdParticipantsParticipantIdWrapupcodesTest() {
        String chatId = null;
        String participantId = null;
        // WrapupCode response = api.getConversationsChatsChatIdParticipantsParticipantIdWrapupcodes(chatId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get conversation
     *
     * 
     */
    @Test
    public void getConversationsConversationIdTest() {
        String conversationId = null;
        // Conversation response = api.getConversationsConversationId(conversationId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationsConversationIdParticipantsParticipantIdWrapupTest() {
        String conversationId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationsConversationIdParticipantsParticipantIdWrapup(conversationId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationsConversationIdParticipantsParticipantIdWrapupcodesTest() {
        String conversationId = null;
        String participantId = null;
        // WrapupCode response = api.getConversationsConversationIdParticipantsParticipantIdWrapupcodes(conversationId, participantId);

        // TODO: test validations
    }
    
    /**
     * Get recent email conversations
     *
     * 
     */
    @Test
    public void getConversationsEmailsTest() {
        // EmailConversationEntityListing response = api.getConversationsEmails();

        // TODO: test validations
    }
    
    /**
     * Get email conversation
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdTest() {
        String emailId = null;
        // EmailConversation response = api.getConversationsEmailsEmailId(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation messages
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdMessagesTest() {
        String emailId = null;
        // EmailMessageListing response = api.getConversationsEmailsEmailIdMessages(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation draft reply
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdMessagesDraftTest() {
        String emailId = null;
        // EmailMessage response = api.getConversationsEmailsEmailIdMessagesDraft(emailId);

        // TODO: test validations
    }
    
    /**
     * Get conversation message
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdMessagesMessageIdTest() {
        String emailId = null;
        String messageId = null;
        // EmailMessage response = api.getConversationsEmailsEmailIdMessagesMessageId(emailId, messageId);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up for this conversation participant. 
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdParticipantsParticipantIdWrapupTest() {
        String emailId = null;
        String participantId = null;
        Boolean provisional = null;
        // WrapupCode response = api.getConversationsEmailsEmailIdParticipantsParticipantIdWrapup(emailId, participantId, provisional);

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes for this conversation participant
     *
     * 
     */
    @Test
    public void getConversationsEmailsEmailIdParticipantsParticipantIdWrapupcodesTest() {
        String emailId = null;
        String participantId = null;
        // WrapupCode response = api.getConversationsEmailsEmailIdParticipantsParticipantIdWrapupcodes(emailId, participantId);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchConversationsCallbacksCallbackIdParticipantsParticipantIdTest() {
        String callbackId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationsCallbacksCallbackIdParticipantsParticipantId(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationsCallbacksCallbackIdParticipantsParticipantIdAttributesTest() {
        String callbackId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationsCallbacksCallbackIdParticipantsParticipantIdAttributes(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation
     *
     * 
     */
    @Test
    public void patchConversationsCallsCallIdTest() {
        String callId = null;
        Conversation body = null;
        // Conversation response = api.patchConversationsCallsCallId(callId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchConversationsCallsCallIdParticipantsParticipantIdTest() {
        String callId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationsCallsCallIdParticipantsParticipantId(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationsCallsCallIdParticipantsParticipantIdAttributesTest() {
        String callId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationsCallsCallIdParticipantsParticipantIdAttributes(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Change who can speak
     *
     * 
     */
    @Test
    public void patchConversationsCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        ConsultTransferUpdate body = null;
        // ConsultTransferResponse response = api.patchConversationsCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchConversationsChatsChatIdParticipantsParticipantIdTest() {
        String chatId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationsChatsChatIdParticipantsParticipantId(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationsChatsChatIdParticipantsParticipantIdAttributesTest() {
        String chatId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationsChatsChatIdParticipantsParticipantIdAttributes(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update a participant.
     *
     * Update conversation participant.
     */
    @Test
    public void patchConversationsConversationIdParticipantsParticipantIdTest() {
        String conversationId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationsConversationIdParticipantsParticipantId(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationsConversationIdParticipantsParticipantIdAttributesTest() {
        String conversationId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationsConversationIdParticipantsParticipantIdAttributes(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update conversation participant
     *
     * 
     */
    @Test
    public void patchConversationsEmailsEmailIdParticipantsParticipantIdTest() {
        String emailId = null;
        String participantId = null;
        MediaParticipantRequest body = null;
        // Void response = api.patchConversationsEmailsEmailIdParticipantsParticipantId(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Update the attributes on a conversation participant.
     *
     * 
     */
    @Test
    public void patchConversationsEmailsEmailIdParticipantsParticipantIdAttributesTest() {
        String emailId = null;
        String participantId = null;
        ParticipantAttributes body = null;
        // Void response = api.patchConversationsEmailsEmailIdParticipantsParticipantIdAttributes(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation aggregates
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postAnalyticsConversationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Index conversation properties
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsConversationIdDetailsPropertiesTest() {
        String conversationId = null;
        PropertyIndexRequest body = null;
        // PropertyIndexRequest response = api.postAnalyticsConversationsConversationIdDetailsProperties(conversationId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation details
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsDetailsQueryTest() {
        ConversationQuery body = null;
        // AnalyticsConversationQueryResponse response = api.postAnalyticsConversationsDetailsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Create a Callback
     *
     * 
     */
    @Test
    public void postConversationsCallbacksTest() {
        CreateCallbackCommand body = null;
        // CreateCallbackResponse response = api.postConversationsCallbacks(body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationsCallbacksCallbackIdParticipantsParticipantIdReplaceTest() {
        String callbackId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationsCallbacksCallbackIdParticipantsParticipantIdReplace(callbackId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create a call conversation
     *
     * 
     */
    @Test
    public void postConversationsCallsTest() {
        CreateCallRequest body = null;
        // CreateCallResponse response = api.postConversationsCalls(body);

        // TODO: test validations
    }
    
    /**
     * Add a new call to a conversation
     *
     * 
     */
    @Test
    public void postConversationsCallsCallIdTest() {
        String callId = null;
        CallCommand body = null;
        // Conversation response = api.postConversationsCallsCallId(callId, body);

        // TODO: test validations
    }
    
    /**
     * Add participants to a conversation
     *
     * 
     */
    @Test
    public void postConversationsCallsCallIdParticipantsTest() {
        String callId = null;
        Conversation body = null;
        // Conversation response = api.postConversationsCallsCallIdParticipants(callId, body);

        // TODO: test validations
    }
    
    /**
     * Initiate and update consult transfer
     *
     * 
     */
    @Test
    public void postConversationsCallsCallIdParticipantsParticipantIdConsultTest() {
        String callId = null;
        String participantId = null;
        ConsultTransfer body = null;
        // ConsultTransferResponse response = api.postConversationsCallsCallIdParticipantsParticipantIdConsult(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Listen in on the conversation from the point of view of a given participant.
     *
     * 
     */
    @Test
    public void postConversationsCallsCallIdParticipantsParticipantIdMonitorTest() {
        String callId = null;
        String participantId = null;
        // Void response = api.postConversationsCallsCallIdParticipantsParticipantIdMonitor(callId, participantId);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationsCallsCallIdParticipantsParticipantIdReplaceTest() {
        String callId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationsCallsCallIdParticipantsParticipantIdReplace(callId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationsChatsChatIdParticipantsParticipantIdReplaceTest() {
        String chatId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationsChatsChatIdParticipantsParticipantIdReplace(chatId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create a new callback for the specified participant on the conversation.
     *
     * 
     */
    @Test
    public void postConversationsConversationIdParticipantsParticipantIdCallbacksTest() {
        String conversationId = null;
        String participantId = null;
        CreateCallbackCommand body = null;
        // Void response = api.postConversationsConversationIdParticipantsParticipantIdCallbacks(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationsConversationIdParticipantsParticipantIdReplaceTest() {
        String conversationId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationsConversationIdParticipantsParticipantIdReplace(conversationId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Send an email reply
     *
     * 
     */
    @Test
    public void postConversationsEmailsEmailIdMessagesTest() {
        String emailId = null;
        EmailMessage body = null;
        // EmailMessage response = api.postConversationsEmailsEmailIdMessages(emailId, body);

        // TODO: test validations
    }
    
    /**
     * Replace this participant with the specified user and/or address
     *
     * 
     */
    @Test
    public void postConversationsEmailsEmailIdParticipantsParticipantIdReplaceTest() {
        String emailId = null;
        String participantId = null;
        TransferRequest body = null;
        // Void response = api.postConversationsEmailsEmailIdParticipantsParticipantIdReplace(emailId, participantId, body);

        // TODO: test validations
    }
    
    /**
     * Create Fax Conversation
     *
     * 
     */
    @Test
    public void postConversationsFaxesTest() {
        FaxSendRequest body = null;
        // FaxSendResponse response = api.postConversationsFaxes(body);

        // TODO: test validations
    }
    
    /**
     * Update conversation draft reply
     *
     * 
     */
    @Test
    public void putConversationsEmailsEmailIdMessagesDraftTest() {
        String emailId = null;
        EmailMessage body = null;
        // EmailMessage response = api.putConversationsEmailsEmailIdMessagesDraft(emailId, body);

        // TODO: test validations
    }
    
}
