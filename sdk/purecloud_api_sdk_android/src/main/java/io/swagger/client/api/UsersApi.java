package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.UsersEntityListing;
import io.swagger.client.model.UserMe;
import io.swagger.client.model.UsersSearchResponse;
import io.swagger.client.model.User;
import io.swagger.client.model.CallForwarding;
import io.swagger.client.model.Geolocation;
import io.swagger.client.model.OutOfOffice;
import io.swagger.client.model.UserQueueEntityListing;
import io.swagger.client.model.UserAuthorization;
import io.swagger.client.model.UserSkillEntityListing;
import io.swagger.client.model.RoutingStatus;
import io.swagger.client.model.UserStations;
import io.swagger.client.model.UserQueue;
import io.swagger.client.model.PresenceQueryResponse;
import io.swagger.client.model.AggregationQuery;
import io.swagger.client.model.ObservationQuery;
import io.swagger.client.model.ObservationQueryResponse;
import io.swagger.client.model.CreateUser;
import io.swagger.client.model.UserSearchRequest;
import io.swagger.client.model.UserRoutingSkill;

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
  Call<String> deleteUsersUserId(
    @Path("userId") String userId
  );

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/roles")
  Call<Void> deleteUsersUserIdRoles(
    @Path("userId") String userId
  );

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId  (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/users/{userId}/routingskills/{skillId}")
  Call<String> deleteUsersUserIdRoutingskillsSkillId(
    @Path("userId") String userId, @Path("skillId") String skillId
  );

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/station/associatedstation")
  Call<Void> deleteUsersUserIdStationAssociatedstation(
    @Path("userId") String userId
  );

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/station/defaultstation")
  Call<Void> deleteUsersUserIdStationDefaultstation(
    @Path("userId") String userId
  );

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @param role Role (optional)
   * @param name Name (optional)
   * @param username Username (optional)
   * @param skill Skill (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<UsersEntityListing>
   */
  
  @GET("api/v2/users")
  Call<UsersEntityListing> getUsers(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("id") List<String> id, @Query("sortBy") String sortBy, @Query("role") String role, @Query("name") String name, @Query("username") String username, @Query("skill") List<String> skill, @Query("expand") List<String> expand
  );

  /**
   * Get user.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<UserMe>
   */
  
  @GET("api/v2/users/me")
  Call<UserMe> getUsersMe(
    @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @GET("api/v2/users/search")
  Call<UsersSearchResponse> getUsersSearch(
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
  Call<User> getUsersUserId(
    @Path("userId") String userId, @Query("expand") List<String> expand
  );

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return Call<CallForwarding>
   */
  
  @GET("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> getUsersUserIdCallforwarding(
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
  Call<Geolocation> getUsersUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId
  );

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return Call<OutOfOffice>
   */
  
  @GET("api/v2/users/{userId}/outofoffice")
  Call<OutOfOffice> getUsersUserIdOutofoffice(
    @Path("userId") String userId
  );

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<UserQueueEntityListing>
   */
  
  @GET("api/v2/users/{userId}/queues")
  Call<UserQueueEntityListing> getUsersUserIdQueues(
    @Path("userId") String userId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return Call<UserAuthorization>
   */
  
  @GET("api/v2/users/{userId}/roles")
  Call<UserAuthorization> getUsersUserIdRoles(
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
  Call<UserSkillEntityListing> getUsersUserIdRoutingskills(
    @Path("userId") String userId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
  );

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return Call<RoutingStatus>
   */
  
  @GET("api/v2/users/{userId}/routingstatus")
  Call<RoutingStatus> getUsersUserIdRoutingstatus(
    @Path("userId") String userId
  );

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return Call<UserStations>
   */
  
  @GET("api/v2/users/{userId}/station")
  Call<UserStations> getUsersUserIdStation(
    @Path("userId") String userId
  );

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body  (optional)
   * @return Call<User>
   */
  
  @PATCH("api/v2/users/{userId}")
  Call<User> patchUsersUserId(
    @Path("userId") String userId, @Body User body
  );

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body  (optional)
   * @return Call<CallForwarding>
   */
  
  @PATCH("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> patchUsersUserIdCallforwarding(
    @Path("userId") String userId, @Body CallForwarding body
  );

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body  (optional)
   * @return Call<Geolocation>
   */
  
  @PATCH("api/v2/users/{userId}/geolocations/{clientId}")
  Call<Geolocation> patchUsersUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId, @Body Geolocation body
  );

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (optional)
   * @return Call<UserQueue>
   */
  
  @PATCH("api/v2/users/{userId}/queues")
  Call<UserQueue> patchUsersUserIdQueues(
    @Path("userId") String userId, @Body List<UserQueue> body
  );

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (optional)
   * @return Call<UserQueue>
   */
  
  @PATCH("api/v2/users/{userId}/queues/{queueId}")
  Call<UserQueue> patchUsersUserIdQueuesQueueId(
    @Path("queueId") String queueId, @Path("userId") String userId, @Body UserQueue body
  );

  /**
   * Query for user aggregates
   * 
   * @param body query (optional)
   * @return Call<PresenceQueryResponse>
   */
  
  @POST("api/v2/analytics/users/aggregates/query")
  Call<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for user observations
   * 
   * @param body query (optional)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/users/observations/query")
  Call<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Create user
   * 
   * @param body User (optional)
   * @return Call<User>
   */
  
  @POST("api/v2/users")
  Call<User> postUsers(
    @Body CreateUser body
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @POST("api/v2/users/search")
  Call<UsersSearchResponse> postUsersSearch(
    @Body UserSearchRequest body
  );

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (optional)
   * @return Call<UserRoutingSkill>
   */
  
  @POST("api/v2/users/{userId}/routingskills")
  Call<UserRoutingSkill> postUsersUserIdRoutingskills(
    @Path("userId") String userId, @Body UserRoutingSkill body
  );

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body  (optional)
   * @return Call<CallForwarding>
   */
  
  @PUT("api/v2/users/{userId}/callforwarding")
  Call<CallForwarding> putUsersUserIdCallforwarding(
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
  Call<OutOfOffice> putUsersUserIdOutofoffice(
    @Path("userId") String userId, @Body OutOfOffice body
  );

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body  (optional)
   * @return Call<UserAuthorization>
   */
  
  @PUT("api/v2/users/{userId}/roles")
  Call<UserAuthorization> putUsersUserIdRoles(
    @Path("userId") String userId, @Body List<String> body
  );

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId  (required)
   * @param body Skill (optional)
   * @return Call<UserRoutingSkill>
   */
  
  @PUT("api/v2/users/{userId}/routingskills/{skillId}")
  Call<UserRoutingSkill> putUsersUserIdRoutingskillsSkillId(
    @Path("userId") String userId, @Path("skillId") String skillId, @Body UserRoutingSkill body
  );

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (optional)
   * @return Call<RoutingStatus>
   */
  
  @PUT("api/v2/users/{userId}/routingstatus")
  Call<RoutingStatus> putUsersUserIdRoutingstatus(
    @Path("userId") String userId, @Body RoutingStatus body
  );

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId  (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/users/{userId}/station/associatedstation/{stationId}")
  Call<Void> putUsersUserIdStationAssociatedstationStationId(
    @Path("userId") String userId, @Path("stationId") String stationId
  );

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId  (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/users/{userId}/station/defaultstation/{stationId}")
  Call<Void> putUsersUserIdStationDefaultstationStationId(
    @Path("userId") String userId, @Path("stationId") String stationId
  );

}
