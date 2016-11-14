package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.OrganizationPresence;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.model.SystemPresence;
import com.mypurecloud.sdk.model.UserPresence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PresenceApi {
  /**
   * Delete a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @return Call<OrganizationPresence>
   */
  
  @DELETE("api/v2/presencedefinitions/{presenceId}")
  Call<OrganizationPresence> deletePresenceId(
    @Path("presenceId") String presenceId
  );

  /**
   * Get a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @return Call<OrganizationPresence>
   */
  
  @GET("api/v2/presencedefinitions/{presenceId}")
  Call<OrganizationPresence> getPresenceId(
    @Path("presenceId") String presenceId
  );

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Deleted query can be true, false or all (optional, default to false)
   * @return Call<OrganizationPresenceEntityListing>
   */
  
  @GET("api/v2/presencedefinitions")
  Call<OrganizationPresenceEntityListing> getPresencedefinitions(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("deleted") String deleted
  );

  /**
   * Get the list of SystemPresences
   * 
   * @return Call<List<SystemPresence>>
   */
  
  @GET("api/v2/systempresences")
  Call<List<SystemPresence>> getSystempresences();
    

  /**
   * Get a user&#39;s Presence
   * 
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @return Call<UserPresence>
   */
  
  @GET("api/v2/users/{userId}/presences/{sourceId}")
  Call<UserPresence> getUserIdPresencesSourceId(
    @Path("userId") String userId, @Path("sourceId") String sourceId
  );

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param userId user Id (required)
   * @param sourceId Source (required)
   * @param body User presence (required)
   * @return Call<UserPresence>
   */
  
  @PATCH("api/v2/users/{userId}/presences/{sourceId}")
  Call<UserPresence> patchUserIdPresencesSourceId(
    @Path("userId") String userId, @Path("sourceId") String sourceId, @Body UserPresence body
  );

  /**
   * Create a Presence Definition
   * 
   * @param body The Presence Definition to create (required)
   * @return Call<OrganizationPresence>
   */
  
  @POST("api/v2/presencedefinitions")
  Call<OrganizationPresence> postPresencedefinitions(
    @Body OrganizationPresence body
  );

  /**
   * Update a Presence Definition
   * 
   * @param presenceId Organization Presence ID (required)
   * @param body The OrganizationPresence to update (required)
   * @return Call<OrganizationPresence>
   */
  
  @PUT("api/v2/presencedefinitions/{presenceId}")
  Call<OrganizationPresence> putPresenceId(
    @Path("presenceId") String presenceId, @Body OrganizationPresence body
  );

}
