package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.OrganizationPresence;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.model.SystemPresence;
import com.mypurecloud.sdk.model.UserPresence;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PresenceApi
 */
public class PresenceApiTest {

    private PresenceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PresenceApi.class);
    }

    
    /**
     * Delete a Presence Definition
     *
     * 
     */
    @Test
    public void deletePresenceIdTest() {
        String presenceId = null;
        // OrganizationPresence response = api.deletePresenceId(presenceId);

        // TODO: test validations
    }
    
    /**
     * Get a Presence Definition
     *
     * 
     */
    @Test
    public void getPresenceIdTest() {
        String presenceId = null;
        // OrganizationPresence response = api.getPresenceId(presenceId);

        // TODO: test validations
    }
    
    /**
     * Get an Organization&#39;s list of Presence Definitions
     *
     * 
     */
    @Test
    public void getPresencedefinitionsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String deleted = null;
        // OrganizationPresenceEntityListing response = api.getPresencedefinitions(pageNumber, pageSize, deleted);

        // TODO: test validations
    }
    
    /**
     * Get the list of SystemPresences
     *
     * 
     */
    @Test
    public void getSystempresencesTest() {
        // List<SystemPresence> response = api.getSystempresences();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s Presence
     *
     * 
     */
    @Test
    public void getUserIdPresencesSourceIdTest() {
        String userId = null;
        String sourceId = null;
        // UserPresence response = api.getUserIdPresencesSourceId(userId, sourceId);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s Presence
     *
     * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
     */
    @Test
    public void patchUserIdPresencesSourceIdTest() {
        String userId = null;
        String sourceId = null;
        UserPresence body = null;
        // UserPresence response = api.patchUserIdPresencesSourceId(userId, sourceId, body);

        // TODO: test validations
    }
    
    /**
     * Create a Presence Definition
     *
     * 
     */
    @Test
    public void postPresencedefinitionsTest() {
        OrganizationPresence body = null;
        // OrganizationPresence response = api.postPresencedefinitions(body);

        // TODO: test validations
    }
    
    /**
     * Update a Presence Definition
     *
     * 
     */
    @Test
    public void putPresenceIdTest() {
        String presenceId = null;
        OrganizationPresence body = null;
        // OrganizationPresence response = api.putPresenceId(presenceId, body);

        // TODO: test validations
    }
    
}
