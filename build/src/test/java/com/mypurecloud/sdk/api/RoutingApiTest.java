package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingApi
 */
public class RoutingApiTest {

    private RoutingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RoutingApi.class);
    }

    
    /**
     * Delete a domain
     *
     * 
     */
    @Test
    public void deleteEmailDomainsDomainIdTest() {
        String domainId = null;
        // String response = api.deleteEmailDomainsDomainId(domainId);

        // TODO: test validations
    }
    
    /**
     * Delete a route
     *
     * 
     */
    @Test
    public void deleteEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        // String response = api.deleteEmailDomainsDomainnameRoutesRouteId(domainName, routeId);

        // TODO: test validations
    }
    
    /**
     * Delete a queue
     *
     * 
     */
    @Test
    public void deleteQueuesQueueIdTest() {
        String queueId = null;
        Boolean forceDelete = null;
        // String response = api.deleteQueuesQueueId(queueId, forceDelete);

        // TODO: test validations
    }
    
    /**
     * Delete queue member
     *
     * 
     */
    @Test
    public void deleteQueuesQueueIdUsersMemberIdTest() {
        String queueId = null;
        String memberId = null;
        // String response = api.deleteQueuesQueueIdUsersMemberId(queueId, memberId);

        // TODO: test validations
    }
    
    /**
     * Delete a wrap-up code from a queue
     *
     * 
     */
    @Test
    public void deleteQueuesQueueIdWrapupcodesCodeIdTest() {
        String queueId = null;
        String codeId = null;
        // String response = api.deleteQueuesQueueIdWrapupcodesCodeId(queueId, codeId);

        // TODO: test validations
    }
    
    /**
     * Delete Routing Skill
     *
     * 
     */
    @Test
    public void deleteSkillsSkillIdTest() {
        String skillId = null;
        // String response = api.deleteSkillsSkillId(skillId);

        // TODO: test validations
    }
    
    /**
     * Remove routing skill from user
     *
     * 
     */
    @Test
    public void deleteUserIdRoutingskillsSkillIdTest() {
        String userId = null;
        String skillId = null;
        // String response = api.deleteUserIdRoutingskillsSkillId(userId, skillId);

        // TODO: test validations
    }
    
    /**
     * Delete utilization settings and revert to system defaults.
     *
     * 
     */
    @Test
    public void deleteUtilizationTest() {
        // String response = api.deleteUtilization();

        // TODO: test validations
    }
    
    /**
     * Delete wrap-up code
     *
     * 
     */
    @Test
    public void deleteWrapupcodesCodeIdTest() {
        String codeId = null;
        // String response = api.deleteWrapupcodesCodeId(codeId);

        // TODO: test validations
    }
    
    /**
     * Get domains
     *
     * 
     */
    @Test
    public void getEmailDomainsTest() {
        // InboundDomainEntityListing response = api.getEmailDomains();

        // TODO: test validations
    }
    
    /**
     * Get routes
     *
     * 
     */
    @Test
    public void getEmailDomainsDomainnameRoutesTest() {
        String domainName = null;
        // InboundRouteEntityListing response = api.getEmailDomainsDomainnameRoutes(domainName);

        // TODO: test validations
    }
    
    /**
     * Get a route
     *
     * 
     */
    @Test
    public void getEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        // InboundRoute response = api.getEmailDomainsDomainnameRoutesRouteId(domainName, routeId);

        // TODO: test validations
    }
    
    /**
     * Get email setup
     *
     * 
     */
    @Test
    public void getEmailSetupTest() {
        // EmailSetup response = api.getEmailSetup();

        // TODO: test validations
    }
    
    /**
     * Get list of queues.
     *
     * 
     */
    @Test
    public void getQueuesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String name = null;
        Boolean active = null;
        // QueueEntityListing response = api.getQueues(pageSize, pageNumber, sortBy, name, active);

        // TODO: test validations
    }
    
    /**
     * Get details about this queue.
     *
     * 
     */
    @Test
    public void getQueuesQueueIdTest() {
        String queueId = null;
        // Queue response = api.getQueuesQueueId(queueId);

        // TODO: test validations
    }
    
    /**
     * Get recent conversations that are still active
     *
     * 
     */
    @Test
    public void getQueuesQueueIdConversationsTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // CallConversationEntityListing response = api.getQueuesQueueIdConversations(queueId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get recent callback conversations that are still active
     *
     * 
     */
    @Test
    public void getQueuesQueueIdConversationsCallbacksTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // CallbackConversationEntityListing response = api.getQueuesQueueIdConversationsCallbacks(queueId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get recent call conversations that are still active
     *
     * 
     */
    @Test
    public void getQueuesQueueIdConversationsCallsTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // CallConversationEntityListing response = api.getQueuesQueueIdConversationsCalls(queueId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get recent chat conversations that are still active
     *
     * 
     */
    @Test
    public void getQueuesQueueIdConversationsChatsTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // ChatConversationEntityListing response = api.getQueuesQueueIdConversationsChats(queueId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get recent email conversations that are still active
     *
     * 
     */
    @Test
    public void getQueuesQueueIdConversationsEmailsTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // EmailConversationEntityListing response = api.getQueuesQueueIdConversationsEmails(queueId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get Estimated Wait Time
     *
     * 
     */
    @Test
    public void getQueuesQueueIdEstimatedwaittimeTest() {
        String queueId = null;
        String conversationId = null;
        // EstimatedWaitTimePredictions response = api.getQueuesQueueIdEstimatedwaittime(queueId, conversationId);

        // TODO: test validations
    }
    
    /**
     * Get the members of this queue
     *
     * 
     */
    @Test
    public void getQueuesQueueIdUsersTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String expand = null;
        Boolean directMembers = null;
        // QueueMemberEntityListing response = api.getQueuesQueueIdUsers(queueId, pageSize, pageNumber, sortBy, expand, directMembers);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up codes for a queue
     *
     * 
     */
    @Test
    public void getQueuesQueueIdWrapupcodesTest() {
        String queueId = null;
        String codeId = null;
        // WrapupCodeEntityListing response = api.getQueuesQueueIdWrapupcodes(queueId, codeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of routing skills.
     *
     * 
     */
    @Test
    public void getSkillsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // SkillEntityListing response = api.getSkills(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get Routing Skill
     *
     * 
     */
    @Test
    public void getSkillsSkillIdTest() {
        String skillId = null;
        // RoutingSkill response = api.getSkillsSkillId(skillId);

        // TODO: test validations
    }
    
    /**
     * List routing skills for user
     *
     * 
     */
    @Test
    public void getUserIdRoutingskillsTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // UserSkillEntityListing response = api.getUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get the utilization settings.
     *
     * 
     */
    @Test
    public void getUtilizationTest() {
        // Utilization response = api.getUtilization();

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes.
     *
     * 
     */
    @Test
    public void getWrapupcodesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        // WrapupCodeEntityListing response = api.getWrapupcodes(pageSize, pageNumber, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get details about this wrap-up code.
     *
     * 
     */
    @Test
    public void getWrapupcodesCodeIdTest() {
        String codeId = null;
        // WrapupCode response = api.getWrapupcodesCodeId(codeId);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a set of users for a queue
     *
     * 
     */
    @Test
    public void patchQueuesQueueIdUsersTest() {
        String queueId = null;
        List<QueueMember> body = null;
        // QueueMemberEntityListing response = api.patchQueuesQueueIdUsers(queueId, body);

        // TODO: test validations
    }
    
    /**
     * Update the ring number of joined status for a User in a Queue
     *
     * 
     */
    @Test
    public void patchQueuesQueueIdUsersMemberIdTest() {
        String queueId = null;
        String memberId = null;
        QueueMember body = null;
        // QueueMember response = api.patchQueuesQueueIdUsersMemberId(queueId, memberId, body);

        // TODO: test validations
    }
    
    /**
     * Create a domain
     *
     * 
     */
    @Test
    public void postEmailDomainsTest() {
        InboundDomain body = null;
        // InboundDomain response = api.postEmailDomains(body);

        // TODO: test validations
    }
    
    /**
     * Create a route
     *
     * 
     */
    @Test
    public void postEmailDomainsDomainnameRoutesTest() {
        String domainName = null;
        InboundRoute body = null;
        // InboundRoute response = api.postEmailDomainsDomainnameRoutes(domainName, body);

        // TODO: test validations
    }
    
    /**
     * Create queue
     *
     * 
     */
    @Test
    public void postQueuesTest() {
        CreateQueueRequest body = null;
        // Queue response = api.postQueues(body);

        // TODO: test validations
    }
    
    /**
     * Query for queue observations
     *
     * 
     */
    @Test
    public void postQueuesObservationsQueryTest() {
        ObservationQuery body = null;
        // QualifierMappingObservationQueryResponse response = api.postQueuesObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Bulk add or delete up to 100 queue members
     *
     * 
     */
    @Test
    public void postQueuesQueueIdUsersTest() {
        String queueId = null;
        List<QueueMember> body = null;
        Boolean delete = null;
        // String response = api.postQueuesQueueIdUsers(queueId, body, delete);

        // TODO: test validations
    }
    
    /**
     * Add up to 100 wrap-up codes to a queue
     *
     * 
     */
    @Test
    public void postQueuesQueueIdWrapupcodesTest() {
        String queueId = null;
        String codeId = null;
        List<WrapupCode> body = null;
        // List<WrapupCode> response = api.postQueuesQueueIdWrapupcodes(queueId, codeId, body);

        // TODO: test validations
    }
    
    /**
     * Create Skill
     *
     * 
     */
    @Test
    public void postSkillsTest() {
        RoutingSkill body = null;
        // RoutingSkill response = api.postSkills(body);

        // TODO: test validations
    }
    
    /**
     * Add routing skill to user
     *
     * 
     */
    @Test
    public void postUserIdRoutingskillsTest() {
        String userId = null;
        UserRoutingSkill body = null;
        // UserRoutingSkill response = api.postUserIdRoutingskills(userId, body);

        // TODO: test validations
    }
    
    /**
     * Create a wrap-up code
     *
     * 
     */
    @Test
    public void postWrapupcodesTest() {
        WrapupCode body = null;
        // CallableTimeSet response = api.postWrapupcodes(body);

        // TODO: test validations
    }
    
    /**
     * Update a route
     *
     * 
     */
    @Test
    public void putEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        InboundRoute body = null;
        // InboundRoute response = api.putEmailDomainsDomainnameRoutesRouteId(domainName, routeId, body);

        // TODO: test validations
    }
    
    /**
     * Update a queue
     *
     * 
     */
    @Test
    public void putQueuesQueueIdTest() {
        String queueId = null;
        Queue body = null;
        // Queue response = api.putQueuesQueueId(queueId, body);

        // TODO: test validations
    }
    
    /**
     * Update routing skill proficiency or state.
     *
     * 
     */
    @Test
    public void putUserIdRoutingskillsSkillIdTest() {
        String userId = null;
        String skillId = null;
        UserRoutingSkill body = null;
        // UserRoutingSkill response = api.putUserIdRoutingskillsSkillId(userId, skillId, body);

        // TODO: test validations
    }
    
    /**
     * Update the utilization settings.
     *
     * 
     */
    @Test
    public void putUtilizationTest() {
        Utilization body = null;
        // Utilization response = api.putUtilization(body);

        // TODO: test validations
    }
    
    /**
     * Update wrap-up code
     *
     * 
     */
    @Test
    public void putWrapupcodesCodeIdTest() {
        String codeId = null;
        WrapupCode body = null;
        // WrapupCode response = api.putWrapupcodesCodeId(codeId, body);

        // TODO: test validations
    }
    
}
