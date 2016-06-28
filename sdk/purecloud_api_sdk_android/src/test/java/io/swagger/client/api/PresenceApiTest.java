package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.OrganizationPresence;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.OrganizationPresenceEntityListing;
import io.swagger.client.model.SystemPresence;
import io.swagger.client.model.UserPresence;
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
    public void deletePresencedefinitionsPresenceIdTest() {
        String presenceId = null;
        // OrganizationPresence response = api.deletePresencedefinitionsPresenceId(presenceId);

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
     * Get a Presence Definition
     *
     * 
     */
    @Test
    public void getPresencedefinitionsPresenceIdTest() {
        String presenceId = null;
        // OrganizationPresence response = api.getPresencedefinitionsPresenceId(presenceId);

        // TODO: test validations
    }
    
    /**
     * Get the list of SystemPresences
     *
     * 
     */
    @Test
    public void getSystempresencesTest() {
        // SystemPresence response = api.getSystempresences();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s Presence
     *
     * 
     */
    @Test
    public void getUsersUserIdPresencesSourceIdTest() {
        String userId = null;
        String sourceId = null;
        // UserPresence response = api.getUsersUserIdPresencesSourceId(userId, sourceId);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s Presence
     *
     * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
     */
    @Test
    public void patchUsersUserIdPresencesSourceIdTest() {
        String userId = null;
        String sourceId = null;
        UserPresence body = null;
        // UserPresence response = api.patchUsersUserIdPresencesSourceId(userId, sourceId, body);

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
    public void putPresencedefinitionsPresenceIdTest() {
        String presenceId = null;
        OrganizationPresence body = null;
        // OrganizationPresence response = api.putPresencedefinitionsPresenceId(presenceId, body);

        // TODO: test validations
    }
    
}
