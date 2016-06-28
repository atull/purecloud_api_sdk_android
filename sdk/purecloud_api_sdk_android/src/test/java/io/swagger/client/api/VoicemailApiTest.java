package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.VoicemailMailboxInfo;
import io.swagger.client.model.VoicemailMessageEntityListing;
import io.swagger.client.model.VoicemailMessage;
import io.swagger.client.model.VoicemailMediaInfo;
import io.swagger.client.model.VoicemailOrganizationPolicy;
import io.swagger.client.model.VoicemailUserPolicy;
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
    public void deleteVoicemailMessagesTest() {
        // String response = api.deleteVoicemailMessages();

        // TODO: test validations
    }
    
    /**
     * Delete a message.
     *
     * 
     */
    @Test
    public void deleteVoicemailMessagesMessageIdTest() {
        String messageId = null;
        // String response = api.deleteVoicemailMessagesMessageId(messageId);

        // TODO: test validations
    }
    
    /**
     * Get mailbox information
     *
     * 
     */
    @Test
    public void getVoicemailMailboxTest() {
        // VoicemailMailboxInfo response = api.getVoicemailMailbox();

        // TODO: test validations
    }
    
    /**
     * List voicemail messages
     *
     * 
     */
    @Test
    public void getVoicemailMessagesTest() {
        // VoicemailMessageEntityListing response = api.getVoicemailMessages();

        // TODO: test validations
    }
    
    /**
     * Get message.
     *
     * 
     */
    @Test
    public void getVoicemailMessagesMessageIdTest() {
        String messageId = null;
        // VoicemailMessage response = api.getVoicemailMessagesMessageId(messageId);

        // TODO: test validations
    }
    
    /**
     * Get media playback URI for this message
     *
     * 
     */
    @Test
    public void getVoicemailMessagesMessageIdMediaTest() {
        String messageId = null;
        String formatId = null;
        // VoicemailMediaInfo response = api.getVoicemailMessagesMessageIdMedia(messageId, formatId);

        // TODO: test validations
    }
    
    /**
     * Get a policy
     *
     * 
     */
    @Test
    public void getVoicemailPolicyTest() {
        // VoicemailOrganizationPolicy response = api.getVoicemailPolicy();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s voicemail policy
     *
     * 
     */
    @Test
    public void getVoicemailUserpoliciesUserIdTest() {
        String userId = null;
        // VoicemailUserPolicy response = api.getVoicemailUserpoliciesUserId(userId);

        // TODO: test validations
    }
    
    /**
     * Update a user&#39;s voicemail policy
     *
     * 
     */
    @Test
    public void patchVoicemailUserpoliciesUserIdTest() {
        String userId = null;
        VoicemailUserPolicy body = null;
        // VoicemailUserPolicy response = api.patchVoicemailUserpoliciesUserId(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a message.
     *
     * 
     */
    @Test
    public void putVoicemailMessagesMessageIdTest() {
        String messageId = null;
        VoicemailMessage body = null;
        // VoicemailMessage response = api.putVoicemailMessagesMessageId(messageId, body);

        // TODO: test validations
    }
    
    /**
     * Update a policy
     *
     * 
     */
    @Test
    public void putVoicemailPolicyTest() {
        VoicemailOrganizationPolicy body = null;
        // VoicemailOrganizationPolicy response = api.putVoicemailPolicy(body);

        // TODO: test validations
    }
    
}
