package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.model.VoicemailMessage;
import com.mypurecloud.sdk.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.model.VoicemailUserPolicy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VoicemailApi
 */
public class VoicemailApiTest {

    private VoicemailApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VoicemailApi.class);
    }

    
    /**
     * Delete all voicemail messages
     *
     * 
     */
    @Test
    public void deleteMessagesTest() {
        // String response = api.deleteMessages();

        // TODO: test validations
    }
    
    /**
     * Delete a message.
     *
     * 
     */
    @Test
    public void deleteMessagesMessageIdTest() {
        String messageId = null;
        // String response = api.deleteMessagesMessageId(messageId);

        // TODO: test validations
    }
    
    /**
     * Get mailbox information
     *
     * 
     */
    @Test
    public void getMailboxTest() {
        // VoicemailMailboxInfo response = api.getMailbox();

        // TODO: test validations
    }
    
    /**
     * List voicemail messages
     *
     * 
     */
    @Test
    public void getMessagesTest() {
        // VoicemailMessageEntityListing response = api.getMessages();

        // TODO: test validations
    }
    
    /**
     * Get message.
     *
     * 
     */
    @Test
    public void getMessagesMessageIdTest() {
        String messageId = null;
        // VoicemailMessage response = api.getMessagesMessageId(messageId);

        // TODO: test validations
    }
    
    /**
     * Get media playback URI for this message
     *
     * 
     */
    @Test
    public void getMessagesMessageIdMediaTest() {
        String messageId = null;
        String formatId = null;
        // VoicemailMediaInfo response = api.getMessagesMessageIdMedia(messageId, formatId);

        // TODO: test validations
    }
    
    /**
     * Get a policy
     *
     * 
     */
    @Test
    public void getPolicyTest() {
        // VoicemailOrganizationPolicy response = api.getPolicy();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s voicemail policy
     *
     * 
     */
    @Test
    public void getUserpoliciesUserIdTest() {
        String userId = null;
        // VoicemailUserPolicy response = api.getUserpoliciesUserId(userId);

        // TODO: test validations
    }
    
    /**
     * Update a user&#39;s voicemail policy
     *
     * 
     */
    @Test
    public void patchUserpoliciesUserIdTest() {
        String userId = null;
        VoicemailUserPolicy body = null;
        // VoicemailUserPolicy response = api.patchUserpoliciesUserId(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a message.
     *
     * 
     */
    @Test
    public void putMessagesMessageIdTest() {
        String messageId = null;
        VoicemailMessage body = null;
        // VoicemailMessage response = api.putMessagesMessageId(messageId, body);

        // TODO: test validations
    }
    
    /**
     * Update a policy
     *
     * 
     */
    @Test
    public void putPolicyTest() {
        VoicemailOrganizationPolicy body = null;
        // VoicemailOrganizationPolicy response = api.putPolicy(body);

        // TODO: test validations
    }
    
}
