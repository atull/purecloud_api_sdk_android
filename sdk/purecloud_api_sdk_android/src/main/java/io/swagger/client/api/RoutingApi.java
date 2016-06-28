package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.InboundDomainEntityListing;
import io.swagger.client.model.InboundRouteEntityListing;
import io.swagger.client.model.InboundRoute;
import io.swagger.client.model.EmailSetup;
import io.swagger.client.model.QueueEntityListing;
import io.swagger.client.model.Queue;
import io.swagger.client.model.EstimatedWaitTimePredictions;
import io.swagger.client.model.QueueMember;
import io.swagger.client.model.WrapupCode;
import io.swagger.client.model.SkillEntityListing;
import io.swagger.client.model.RoutingSkill;
import io.swagger.client.model.Utilization;
import io.swagger.client.model.WrapupCodeEntityListing;
import io.swagger.client.model.UserSkillEntityListing;
import io.swagger.client.model.ObservationQuery;
import io.swagger.client.model.ObservationQueryResponse;
import io.swagger.client.model.InboundDomain;
import io.swagger.client.model.CallableTimeSet;
import io.swagger.client.model.UserRoutingSkill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RoutingApi {
  /**
   * Delete a domain
   * 
   * @param domainId domain ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/email/domains/{domainId}")
  Call<String> deleteRoutingEmailDomainsDomainId(
    @Path("domainId") String domainId
  );

  /**
   * Delete a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/email/domains/{domainName}/routes/{routeId}")
  Call<String> deleteRoutingEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId
  );

  /**
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete  (optional)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/queues/{queueId}")
  Call<String> deleteRoutingQueuesQueueId(
    @Path("queueId") String queueId, @Query("forceDelete") Boolean forceDelete
  );

  /**
   * Delete queue member
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/queues/{queueId}/users/{memberId}")
  Call<String> deleteRoutingQueuesQueueIdUsersMemberId(
    @Path("queueId") String queueId, @Path("memberId") String memberId
  );

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}")
  Call<String> deleteRoutingQueuesQueueIdWrapupcodesCodeId(
    @Path("queueId") String queueId, @Path("codeId") String codeId
  );

  /**
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/skills/{skillId}")
  Call<String> deleteRoutingSkillsSkillId(
    @Path("skillId") String skillId
  );

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/utilization")
  Call<String> deleteRoutingUtilization();
    

  /**
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/wrapupcodes/{codeId}")
  Call<String> deleteRoutingWrapupcodesCodeId(
    @Path("codeId") String codeId
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
   * Get domains
   * 
   * @return Call<InboundDomainEntityListing>
   */
  
  @GET("api/v2/routing/email/domains")
  Call<InboundDomainEntityListing> getRoutingEmailDomains();
    

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @return Call<InboundRouteEntityListing>
   */
  
  @GET("api/v2/routing/email/domains/{domainName}/routes")
  Call<InboundRouteEntityListing> getRoutingEmailDomainsDomainnameRoutes(
    @Path("domainName") String domainName
  );

  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return Call<InboundRoute>
   */
  
  @GET("api/v2/routing/email/domains/{domainName}/routes/{routeId}")
  Call<InboundRoute> getRoutingEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId
  );

  /**
   * Get email setup
   * 
   * @return Call<EmailSetup>
   */
  
  @GET("api/v2/routing/email/setup")
  Call<EmailSetup> getRoutingEmailSetup();
    

  /**
   * Get list of queues.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param active Active (optional)
   * @return Call<QueueEntityListing>
   */
  
  @GET("api/v2/routing/queues")
  Call<QueueEntityListing> getRoutingQueues(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("name") String name, @Query("active") Boolean active
  );

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Call<Queue>
   */
  
  @GET("api/v2/routing/queues/{queueId}")
  Call<Queue> getRoutingQueuesQueueId(
    @Path("queueId") String queueId
  );

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return Call<EstimatedWaitTimePredictions>
   */
  
  @GET("api/v2/routing/queues/{queueId}/estimatedwaittime")
  Call<EstimatedWaitTimePredictions> getRoutingQueuesQueueIdEstimatedwaittime(
    @Path("queueId") String queueId, @Query("conversationId") String conversationId
  );

  /**
   * Get the members of this queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param expand expand (optional)
   * @param directMembers Only get users that are direct members of the queue (optional, default to false)
   * @return Call<QueueMember>
   */
  
  @GET("api/v2/routing/queues/{queueId}/users")
  Call<QueueMember> getRoutingQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") String expand, @Query("directMembers") Boolean directMembers
  );

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/routing/queues/{queueId}/wrapupcodes")
  Call<WrapupCode> getRoutingQueuesQueueIdWrapupcodes(
    @Path("queueId") String queueId, @Path("codeId") String codeId
  );

  /**
   * Get the list of routing skills.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<SkillEntityListing>
   */
  
  @GET("api/v2/routing/skills")
  Call<SkillEntityListing> getRoutingSkills(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return Call<RoutingSkill>
   */
  
  @GET("api/v2/routing/skills/{skillId}")
  Call<RoutingSkill> getRoutingSkillsSkillId(
    @Path("skillId") String skillId
  );

  /**
   * Get the utilization settings.
   * 
   * @return Call<Utilization>
   */
  
  @GET("api/v2/routing/utilization")
  Call<Utilization> getRoutingUtilization();
    

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<WrapupCodeEntityListing>
   */
  
  @GET("api/v2/routing/wrapupcodes")
  Call<WrapupCodeEntityListing> getRoutingWrapupcodes(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy
  );

  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/routing/wrapupcodes/{codeId}")
  Call<WrapupCode> getRoutingWrapupcodesCodeId(
    @Path("codeId") String codeId
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
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (optional)
   * @return Call<QueueMember>
   */
  
  @PATCH("api/v2/routing/queues/{queueId}/users")
  Call<QueueMember> patchRoutingQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Body List<QueueMember> body
  );

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (optional)
   * @return Call<QueueMember>
   */
  
  @PATCH("api/v2/routing/queues/{queueId}/users/{memberId}")
  Call<QueueMember> patchRoutingQueuesQueueIdUsersMemberId(
    @Path("queueId") String queueId, @Path("memberId") String memberId, @Body QueueMember body
  );

  /**
   * Query for queue observations
   * 
   * @param body query (optional)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/queues/observations/query")
  Call<ObservationQueryResponse> postAnalyticsQueuesObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Create a domain
   * 
   * @param body Domain (optional)
   * @return Call<InboundDomain>
   */
  
  @POST("api/v2/routing/email/domains")
  Call<InboundDomain> postRoutingEmailDomains(
    @Body InboundDomain body
  );

  /**
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (optional)
   * @return Call<InboundRoute>
   */
  
  @POST("api/v2/routing/email/domains/{domainName}/routes")
  Call<InboundRoute> postRoutingEmailDomainsDomainnameRoutes(
    @Path("domainName") String domainName, @Body InboundRoute body
  );

  /**
   * Create queue
   * 
   * @param body Queue (optional)
   * @return Call<Queue>
   */
  
  @POST("api/v2/routing/queues")
  Call<Queue> postRoutingQueues(
    @Body Queue body
  );

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (optional)
   * @param delete True to delete queue members (optional, default to false)
   * @return Call<QueueMember>
   */
  
  @POST("api/v2/routing/queues/{queueId}/users")
  Call<QueueMember> postRoutingQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Body List<QueueMember> body, @Query("delete") Boolean delete
  );

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @param body  (optional)
   * @return Call<WrapupCode>
   */
  
  @POST("api/v2/routing/queues/{queueId}/wrapupcodes")
  Call<WrapupCode> postRoutingQueuesQueueIdWrapupcodes(
    @Path("queueId") String queueId, @Path("codeId") String codeId, @Body List<WrapupCode> body
  );

  /**
   * Create Skill
   * 
   * @param body Skill (optional)
   * @return Call<RoutingSkill>
   */
  
  @POST("api/v2/routing/skills")
  Call<RoutingSkill> postRoutingSkills(
    @Body RoutingSkill body
  );

  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (optional)
   * @return Call<CallableTimeSet>
   */
  
  @POST("api/v2/routing/wrapupcodes")
  Call<CallableTimeSet> postRoutingWrapupcodes(
    @Body WrapupCode body
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
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (optional)
   * @return Call<InboundRoute>
   */
  
  @PUT("api/v2/routing/email/domains/{domainName}/routes/{routeId}")
  Call<InboundRoute> putRoutingEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId, @Body InboundRoute body
  );

  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (optional)
   * @return Call<Queue>
   */
  
  @PUT("api/v2/routing/queues/{queueId}")
  Call<Queue> putRoutingQueuesQueueId(
    @Path("queueId") String queueId, @Body Queue body
  );

  /**
   * Update the utilization settings.
   * 
   * @param body utilization (optional)
   * @return Call<Utilization>
   */
  
  @PUT("api/v2/routing/utilization")
  Call<Utilization> putRoutingUtilization(
    @Body Utilization body
  );

  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (optional)
   * @return Call<WrapupCode>
   */
  
  @PUT("api/v2/routing/wrapupcodes/{codeId}")
  Call<WrapupCode> putRoutingWrapupcodesCodeId(
    @Path("codeId") String codeId, @Body WrapupCode body
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

}
