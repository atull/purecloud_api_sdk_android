package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.OAuthClientEntityListing;
import io.swagger.client.model.OAuthClient;
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
    public void deleteOauthClientsClientIdTest() {
        String clientId = null;
        // Void response = api.deleteOauthClientsClientId(clientId);

        // TODO: test validations
    }
    
    /**
     * The list of OAuth clients
     *
     * 
     */
    @Test
    public void getOauthClientsTest() {
        // OAuthClientEntityListing response = api.getOauthClients();

        // TODO: test validations
    }
    
    /**
     * Get OAuth Client
     *
     * 
     */
    @Test
    public void getOauthClientsClientIdTest() {
        String clientId = null;
        // OAuthClient response = api.getOauthClientsClientId(clientId);

        // TODO: test validations
    }
    
    /**
     * Create OAuth client
     *
     * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
     */
    @Test
    public void postOauthClientsTest() {
        OAuthClient body = null;
        // OAuthClient response = api.postOauthClients(body);

        // TODO: test validations
    }
    
    /**
     * Regenerate Client Secret
     *
     * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
     */
    @Test
    public void postOauthClientsClientIdSecretTest() {
        String clientId = null;
        // Void response = api.postOauthClientsClientIdSecret(clientId);

        // TODO: test validations
    }
    
    /**
     * Update OAuth Client
     *
     * 
     */
    @Test
    public void putOauthClientsClientIdTest() {
        String clientId = null;
        OAuthClient body = null;
        // OAuthClient response = api.putOauthClientsClientId(clientId, body);

        // TODO: test validations
    }
    
}
