package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.UserMe;
import com.mypurecloud.sdk.model.UsersSearchResponse;
import com.mypurecloud.sdk.model.User;
import com.mypurecloud.sdk.model.CallForwarding;
import com.mypurecloud.sdk.model.Geolocation;
import com.mypurecloud.sdk.model.OutOfOffice;
import com.mypurecloud.sdk.model.UserQueueEntityListing;
import com.mypurecloud.sdk.model.UserAuthorization;
import com.mypurecloud.sdk.model.UserSkillEntityListing;
import com.mypurecloud.sdk.model.RoutingStatus;
import com.mypurecloud.sdk.model.UserStations;
import com.mypurecloud.sdk.model.UsersEntityListing;
import com.mypurecloud.sdk.model.UserQueue;
import com.mypurecloud.sdk.model.UserSearchRequest;
import com.mypurecloud.sdk.model.UserRoutingSkill;
import com.mypurecloud.sdk.model.CreateUser;
import com.mypurecloud.sdk.model.PresenceQueryResponse;
import com.mypurecloud.sdk.model.AggregationQuery;
import com.mypurecloud.sdk.model.ObservationQuery;
import com.mypurecloud.sdk.model.ObservationQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/users/{userId}")
  Call<String> deleteUserId(
    @Path("userId") String userId
  );

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/roles")
  Call<Void> deleteUserIdRoles(
    @Path("userId") String userId
  );

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/users/{userId}/routingskills/{skillId}")
  Call<String> deleteUserIdRoutingskillsSkillId(
    @Path("userId") String userId, @Path("skillId") String skillId
  );

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/station/associatedstation")
  Call<Void> deleteUserIdStationAssociatedstation(
    @Path("userId") String userId
  );

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/station/defaultstation")
  Call<Void> deleteUserIdStationDefaultstation(
    @Path("userId") String userId
  );

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @return Call<UserMe>
   */
  
  @GET("api/v2/users/me")
  Call<UserMe> getMe(
    @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @GET("api/v2/users/search")
  Call<UsersSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<User>
   */
  
  @GET("api/v2/users/{userId}")
  Call<User> getUserId(
    @Path("userId") String userId, @Query("expand") List<String> expand
  );

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return Call<CallForwarding>
   */
  
  @GET("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> getUserIdCallforwarding(
    @Path("userId") String userId
  );

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Call<Geolocation>
   */
  
  @GET("api/v2/users/{userId}/geolocations/{clientId}")
  Call<Geolocation> getUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId
  );

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return Call<OutOfOffice>
   */
  
  @GET("api/v2/users/{userId}/outofoffice")
  Call<OutOfOffice> getUserIdOutofoffice(
    @Path("userId") String userId
  );

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @return Call<UserQueueEntityListing>
   */
  
  @GET("api/v2/users/{userId}/queues")
  Call<UserQueueEntityListing> getUserIdQueues(
    @Path("userId") String userId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("joined") Boolean joined
  );

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return Call<UserAuthorization>
   */
  
  @GET("api/v2/users/{userId}/roles")
  Call<UserAuthorization> getUserIdRoles(
    @Path("userId") String userId
  );

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return Call<UserSkillEntityListing>
   */
  
  @GET("api/v2/users/{userId}/routingskills")
  Call<UserSkillEntityListing> getUserIdRoutingskills(
    @Path("userId") String userId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
  );

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return Call<RoutingStatus>
   */
  
  @GET("api/v2/users/{userId}/routingstatus")
  Call<RoutingStatus> getUserIdRoutingstatus(
    @Path("userId") String userId
  );

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return Call<UserStations>
   */
  
  @GET("api/v2/users/{userId}/station")
  Call<UserStations> getUserIdStation(
    @Path("userId") String userId
  );

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<UsersEntityListing>
   */
  
  @GET("api/v2/users")
  Call<UsersEntityListing> getUsers(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("id") List<String> id, @Query("sortOrder") String sortOrder, @Query("expand") List<String> expand
  );

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return Call<User>
   */
  
  @PATCH("api/v2/users/{userId}")
  Call<User> patchUserId(
    @Path("userId") String userId, @Body User body
  );

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return Call<CallForwarding>
   */
  
  @PATCH("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> patchUserIdCallforwarding(
    @Path("userId") String userId, @Body CallForwarding body
  );

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Call<Geolocation>
   */
  
  @PATCH("api/v2/users/{userId}/geolocations/{clientId}")
  Call<Geolocation> patchUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId, @Body Geolocation body
  );

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @return Call<UserQueue>
   */
  
  @PATCH("api/v2/users/{userId}/queues")
  Call<UserQueue> patchUserIdQueues(
    @Path("userId") String userId, @Body List<UserQueue> body
  );

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return Call<UserQueue>
   */
  
  @PATCH("api/v2/users/{userId}/queues/{queueId}")
  Call<UserQueue> patchUserIdQueuesQueueId(
    @Path("queueId") String queueId, @Path("userId") String userId, @Body UserQueue body
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @return Call<UsersSearchResponse>
   */
  
  @POST("api/v2/users/search")
  Call<UsersSearchResponse> postSearch(
    @Body UserSearchRequest body
  );

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return Call<UserRoutingSkill>
   */
  
  @POST("api/v2/users/{userId}/routingskills")
  Call<UserRoutingSkill> postUserIdRoutingskills(
    @Path("userId") String userId, @Body UserRoutingSkill body
  );

  /**
   * Create user
   * 
   * @param body User (required)
   * @return Call<User>
   */
  
  @POST("api/v2/users")
  Call<User> postUsers(
    @Body CreateUser body
  );

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return Call<PresenceQueryResponse>
   */
  
  @POST("api/v2/analytics/users/aggregates/query")
  Call<PresenceQueryResponse> postUsersAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/users/observations/query")
  Call<ObservationQueryResponse> postUsersObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return Call<CallForwarding>
   */
  
  @PUT("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> putUserIdCallforwarding(
    @Path("userId") String userId, @Body CallForwarding body
  );

  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated UserPresence (required)
   * @return Call<OutOfOffice>
   */
  
  @PUT("api/v2/users/{userId}/outofoffice")
  Call<OutOfOffice> putUserIdOutofoffice(
    @Path("userId") String userId, @Body OutOfOffice body
  );

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return Call<UserAuthorization>
   */
  
  @PUT("api/v2/users/{userId}/roles")
  Call<UserAuthorization> putUserIdRoles(
    @Path("userId") String userId, @Body List<String> body
  );

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return Call<UserRoutingSkill>
   */
  
  @PUT("api/v2/users/{userId}/routingskills/{skillId}")
  Call<UserRoutingSkill> putUserIdRoutingskillsSkillId(
    @Path("userId") String userId, @Path("skillId") String skillId, @Body UserRoutingSkill body
  );

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return Call<RoutingStatus>
   */
  
  @PUT("api/v2/users/{userId}/routingstatus")
  Call<RoutingStatus> putUserIdRoutingstatus(
    @Path("userId") String userId, @Body RoutingStatus body
  );

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/users/{userId}/station/associatedstation/{stationId}")
  Call<Void> putUserIdStationAssociatedstationStationId(
    @Path("userId") String userId, @Path("stationId") String stationId
  );

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/users/{userId}/station/defaultstation/{stationId}")
  Call<Void> putUserIdStationDefaultstationStationId(
    @Path("userId") String userId, @Path("stationId") String stationId
  );

}
