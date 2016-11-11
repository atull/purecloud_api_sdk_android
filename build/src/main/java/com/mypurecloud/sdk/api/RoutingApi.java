package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.model.InboundRoute;
import com.mypurecloud.sdk.model.EmailSetup;
import com.mypurecloud.sdk.model.QueueEntityListing;
import com.mypurecloud.sdk.model.Queue;
import com.mypurecloud.sdk.model.CallConversationEntityListing;
import com.mypurecloud.sdk.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.model.SkillEntityListing;
import com.mypurecloud.sdk.model.RoutingSkill;
import com.mypurecloud.sdk.model.UserSkillEntityListing;
import com.mypurecloud.sdk.model.Utilization;
import com.mypurecloud.sdk.model.WrapupCode;
import com.mypurecloud.sdk.model.QueueMember;
import com.mypurecloud.sdk.model.InboundDomain;
import com.mypurecloud.sdk.model.CreateQueueRequest;
import com.mypurecloud.sdk.model.ObservationQuery;
import com.mypurecloud.sdk.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.model.UserRoutingSkill;
import com.mypurecloud.sdk.model.CallableTimeSet;

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
  Call<String> deleteEmailDomainsDomainId(
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
  Call<String> deleteEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId
  );

  /**
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete forceDelete (optional)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/queues/{queueId}")
  Call<String> deleteQueuesQueueId(
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
  Call<String> deleteQueuesQueueIdUsersMemberId(
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
  Call<String> deleteQueuesQueueIdWrapupcodesCodeId(
    @Path("queueId") String queueId, @Path("codeId") String codeId
  );

  /**
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/skills/{skillId}")
  Call<String> deleteSkillsSkillId(
    @Path("skillId") String skillId
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
   * Delete utilization settings and revert to system defaults.
   * 
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/utilization")
  Call<String> deleteUtilization();
    

  /**
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/routing/wrapupcodes/{codeId}")
  Call<String> deleteWrapupcodesCodeId(
    @Path("codeId") String codeId
  );

  /**
   * Get domains
   * 
   * @return Call<InboundDomainEntityListing>
   */
  
  @GET("api/v2/routing/email/domains")
  Call<InboundDomainEntityListing> getEmailDomains();
    

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @return Call<InboundRouteEntityListing>
   */
  
  @GET("api/v2/routing/email/domains/{domainName}/routes")
  Call<InboundRouteEntityListing> getEmailDomainsDomainnameRoutes(
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
  Call<InboundRoute> getEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId
  );

  /**
   * Get email setup
   * 
   * @return Call<EmailSetup>
   */
  
  @GET("api/v2/routing/email/setup")
  Call<EmailSetup> getEmailSetup();
    

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
  Call<QueueEntityListing> getQueues(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("name") String name, @Query("active") Boolean active
  );

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Call<Queue>
   */
  
  @GET("api/v2/routing/queues/{queueId}")
  Call<Queue> getQueuesQueueId(
    @Path("queueId") String queueId
  );

  /**
   * Get recent conversations that are still active
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<CallConversationEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/conversations")
  Call<CallConversationEntityListing> getQueuesQueueIdConversations(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get recent callback conversations that are still active
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<CallbackConversationEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/conversations/callbacks")
  Call<CallbackConversationEntityListing> getQueuesQueueIdConversationsCallbacks(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get recent call conversations that are still active
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<CallConversationEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/conversations/calls")
  Call<CallConversationEntityListing> getQueuesQueueIdConversationsCalls(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get recent chat conversations that are still active
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<ChatConversationEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/conversations/chats")
  Call<ChatConversationEntityListing> getQueuesQueueIdConversationsChats(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get recent email conversations that are still active
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<EmailConversationEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/conversations/emails")
  Call<EmailConversationEntityListing> getQueuesQueueIdConversationsEmails(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return Call<EstimatedWaitTimePredictions>
   */
  
  @GET("api/v2/routing/queues/{queueId}/estimatedwaittime")
  Call<EstimatedWaitTimePredictions> getQueuesQueueIdEstimatedwaittime(
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
   * @return Call<QueueMemberEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/users")
  Call<QueueMemberEntityListing> getQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") String expand, @Query("directMembers") Boolean directMembers
  );

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @return Call<WrapupCodeEntityListing>
   */
  
  @GET("api/v2/routing/queues/{queueId}/wrapupcodes")
  Call<WrapupCodeEntityListing> getQueuesQueueIdWrapupcodes(
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
  Call<SkillEntityListing> getSkills(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return Call<RoutingSkill>
   */
  
  @GET("api/v2/routing/skills/{skillId}")
  Call<RoutingSkill> getSkillsSkillId(
    @Path("skillId") String skillId
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
   * Get the utilization settings.
   * 
   * @return Call<Utilization>
   */
  
  @GET("api/v2/routing/utilization")
  Call<Utilization> getUtilization();
    

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<WrapupCodeEntityListing>
   */
  
  @GET("api/v2/routing/wrapupcodes")
  Call<WrapupCodeEntityListing> getWrapupcodes(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy
  );

  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return Call<WrapupCode>
   */
  
  @GET("api/v2/routing/wrapupcodes/{codeId}")
  Call<WrapupCode> getWrapupcodesCodeId(
    @Path("codeId") String codeId
  );

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return Call<QueueMemberEntityListing>
   */
  
  @PATCH("api/v2/routing/queues/{queueId}/users")
  Call<QueueMemberEntityListing> patchQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Body List<QueueMember> body
  );

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @return Call<QueueMember>
   */
  
  @PATCH("api/v2/routing/queues/{queueId}/users/{memberId}")
  Call<QueueMember> patchQueuesQueueIdUsersMemberId(
    @Path("queueId") String queueId, @Path("memberId") String memberId, @Body QueueMember body
  );

  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return Call<InboundDomain>
   */
  
  @POST("api/v2/routing/email/domains")
  Call<InboundDomain> postEmailDomains(
    @Body InboundDomain body
  );

  /**
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (required)
   * @return Call<InboundRoute>
   */
  
  @POST("api/v2/routing/email/domains/{domainName}/routes")
  Call<InboundRoute> postEmailDomainsDomainnameRoutes(
    @Path("domainName") String domainName, @Body InboundRoute body
  );

  /**
   * Create queue
   * 
   * @param body Queue (required)
   * @return Call<Queue>
   */
  
  @POST("api/v2/routing/queues")
  Call<Queue> postQueues(
    @Body CreateQueueRequest body
  );

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return Call<QualifierMappingObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/queues/observations/query")
  Call<QualifierMappingObservationQueryResponse> postQueuesObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @return Call<String>
   */
  
  @POST("api/v2/routing/queues/{queueId}/users")
  Call<String> postQueuesQueueIdUsers(
    @Path("queueId") String queueId, @Body List<QueueMember> body, @Query("delete") Boolean delete
  );

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @param body List of wrapup codes (required)
   * @return Call<List<WrapupCode>>
   */
  
  @POST("api/v2/routing/queues/{queueId}/wrapupcodes")
  Call<List<WrapupCode>> postQueuesQueueIdWrapupcodes(
    @Path("queueId") String queueId, @Path("codeId") String codeId, @Body List<WrapupCode> body
  );

  /**
   * Create Skill
   * 
   * @param body Skill (required)
   * @return Call<RoutingSkill>
   */
  
  @POST("api/v2/routing/skills")
  Call<RoutingSkill> postSkills(
    @Body RoutingSkill body
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
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return Call<CallableTimeSet>
   */
  
  @POST("api/v2/routing/wrapupcodes")
  Call<CallableTimeSet> postWrapupcodes(
    @Body WrapupCode body
  );

  /**
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (required)
   * @return Call<InboundRoute>
   */
  
  @PUT("api/v2/routing/email/domains/{domainName}/routes/{routeId}")
  Call<InboundRoute> putEmailDomainsDomainnameRoutesRouteId(
    @Path("domainName") String domainName, @Path("routeId") String routeId, @Body InboundRoute body
  );

  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (required)
   * @return Call<Queue>
   */
  
  @PUT("api/v2/routing/queues/{queueId}")
  Call<Queue> putQueuesQueueId(
    @Path("queueId") String queueId, @Body Queue body
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
   * Update the utilization settings.
   * 
   * @param body utilization (required)
   * @return Call<Utilization>
   */
  
  @PUT("api/v2/routing/utilization")
  Call<Utilization> putUtilization(
    @Body Utilization body
  );

  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (required)
   * @return Call<WrapupCode>
   */
  
  @PUT("api/v2/routing/wrapupcodes/{codeId}")
  Call<WrapupCode> putWrapupcodesCodeId(
    @Path("codeId") String codeId, @Body WrapupCode body
  );

}
