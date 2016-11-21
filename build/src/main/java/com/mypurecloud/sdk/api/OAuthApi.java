package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.OAuthClientEntityListing;
import com.mypurecloud.sdk.model.OAuthClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OAuthApi {
  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/oauth/clients/{clientId}")
  Call<Void> deleteClientsClientId(
    @Path("clientId") String clientId
  );

  /**
   * The list of OAuth clients
   * 
   * @return Call<OAuthClientEntityListing>
   */
  
  @GET("api/v2/oauth/clients")
  Call<OAuthClientEntityListing> getClients();
    

  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return Call<OAuthClient>
   */
  
  @GET("api/v2/oauth/clients/{clientId}")
  Call<OAuthClient> getClientsClientId(
    @Path("clientId") String clientId
  );

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return Call<OAuthClient>
   */
  
  @POST("api/v2/oauth/clients")
  Call<OAuthClient> postClients(
    @Body OAuthClient body
  );

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/oauth/clients/{clientId}/secret")
  Call<Void> postClientsClientIdSecret(
    @Path("clientId") String clientId
  );

  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return Call<OAuthClient>
   */
  
  @PUT("api/v2/oauth/clients/{clientId}")
  Call<OAuthClient> putClientsClientId(
    @Path("clientId") String clientId, @Body OAuthClient body
  );

}
