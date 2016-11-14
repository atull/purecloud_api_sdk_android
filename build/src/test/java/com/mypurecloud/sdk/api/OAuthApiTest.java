package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.OAuthClientEntityListing;
import com.mypurecloud.sdk.model.OAuthClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
public class OAuthApiTest {

    private OAuthApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OAuthApi.class);
    }

    
    /**
     * Delete OAuth Client
     *
     * 
     */
    @Test
    public void deleteClientsClientIdTest() {
        String clientId = null;
        // Void response = api.deleteClientsClientId(clientId);

        // TODO: test validations
    }
    
    /**
     * The list of OAuth clients
     *
     * 
     */
    @Test
    public void getClientsTest() {
        // OAuthClientEntityListing response = api.getClients();

        // TODO: test validations
    }
    
    /**
     * Get OAuth Client
     *
     * 
     */
    @Test
    public void getClientsClientIdTest() {
        String clientId = null;
        // OAuthClient response = api.getClientsClientId(clientId);

        // TODO: test validations
    }
    
    /**
     * Create OAuth client
     *
     * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
     */
    @Test
    public void postClientsTest() {
        OAuthClient body = null;
        // OAuthClient response = api.postClients(body);

        // TODO: test validations
    }
    
    /**
     * Regenerate Client Secret
     *
     * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
     */
    @Test
    public void postClientsClientIdSecretTest() {
        String clientId = null;
        // Void response = api.postClientsClientIdSecret(clientId);

        // TODO: test validations
    }
    
    /**
     * Update OAuth Client
     *
     * 
     */
    @Test
    public void putClientsClientIdTest() {
        String clientId = null;
        OAuthClient body = null;
        // OAuthClient response = api.putClientsClientId(clientId, body);

        // TODO: test validations
    }
    
}
