package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
    public void deleteRoutingEmailDomainsDomainIdTest() {
        String domainId = null;
        // String response = api.deleteRoutingEmailDomainsDomainId(domainId);

        // TODO: test validations
    }
    
    /**
     * Delete a route
     *
     * 
     */
    @Test
    public void deleteRoutingEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        // String response = api.deleteRoutingEmailDomainsDomainnameRoutesRouteId(domainName, routeId);

        // TODO: test validations
    }
    
    /**
     * Delete a queue
     *
     * 
     */
    @Test
    public void deleteRoutingQueuesQueueIdTest() {
        String queueId = null;
        Boolean forceDelete = null;
        // String response = api.deleteRoutingQueuesQueueId(queueId, forceDelete);

        // TODO: test validations
    }
    
    /**
     * Delete queue member
     *
     * 
     */
    @Test
    public void deleteRoutingQueuesQueueIdUsersMemberIdTest() {
        String queueId = null;
        String memberId = null;
        // String response = api.deleteRoutingQueuesQueueIdUsersMemberId(queueId, memberId);

        // TODO: test validations
    }
    
    /**
     * Delete a wrap-up code from a queue
     *
     * 
     */
    @Test
    public void deleteRoutingQueuesQueueIdWrapupcodesCodeIdTest() {
        String queueId = null;
        String codeId = null;
        // String response = api.deleteRoutingQueuesQueueIdWrapupcodesCodeId(queueId, codeId);

        // TODO: test validations
    }
    
    /**
     * Delete Routing Skill
     *
     * 
     */
    @Test
    public void deleteRoutingSkillsSkillIdTest() {
        String skillId = null;
        // String response = api.deleteRoutingSkillsSkillId(skillId);

        // TODO: test validations
    }
    
    /**
     * Delete utilization settings and revert to system defaults.
     *
     * 
     */
    @Test
    public void deleteRoutingUtilizationTest() {
        // String response = api.deleteRoutingUtilization();

        // TODO: test validations
    }
    
    /**
     * Delete wrap-up code
     *
     * 
     */
    @Test
    public void deleteRoutingWrapupcodesCodeIdTest() {
        String codeId = null;
        // String response = api.deleteRoutingWrapupcodesCodeId(codeId);

        // TODO: test validations
    }
    
    /**
     * Remove routing skill from user
     *
     * 
     */
    @Test
    public void deleteUsersUserIdRoutingskillsSkillIdTest() {
        String userId = null;
        String skillId = null;
        // String response = api.deleteUsersUserIdRoutingskillsSkillId(userId, skillId);

        // TODO: test validations
    }
    
    /**
     * Get domains
     *
     * 
     */
    @Test
    public void getRoutingEmailDomainsTest() {
        // InboundDomainEntityListing response = api.getRoutingEmailDomains();

        // TODO: test validations
    }
    
    /**
     * Get routes
     *
     * 
     */
    @Test
    public void getRoutingEmailDomainsDomainnameRoutesTest() {
        String domainName = null;
        // InboundRouteEntityListing response = api.getRoutingEmailDomainsDomainnameRoutes(domainName);

        // TODO: test validations
    }
    
    /**
     * Get a route
     *
     * 
     */
    @Test
    public void getRoutingEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        // InboundRoute response = api.getRoutingEmailDomainsDomainnameRoutesRouteId(domainName, routeId);

        // TODO: test validations
    }
    
    /**
     * Get email setup
     *
     * 
     */
    @Test
    public void getRoutingEmailSetupTest() {
        // EmailSetup response = api.getRoutingEmailSetup();

        // TODO: test validations
    }
    
    /**
     * Get list of queues.
     *
     * 
     */
    @Test
    public void getRoutingQueuesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String name = null;
        Boolean active = null;
        // QueueEntityListing response = api.getRoutingQueues(pageSize, pageNumber, sortBy, name, active);

        // TODO: test validations
    }
    
    /**
     * Get details about this queue.
     *
     * 
     */
    @Test
    public void getRoutingQueuesQueueIdTest() {
        String queueId = null;
        // Queue response = api.getRoutingQueuesQueueId(queueId);

        // TODO: test validations
    }
    
    /**
     * Get Estimated Wait Time
     *
     * 
     */
    @Test
    public void getRoutingQueuesQueueIdEstimatedwaittimeTest() {
        String queueId = null;
        String conversationId = null;
        // EstimatedWaitTimePredictions response = api.getRoutingQueuesQueueIdEstimatedwaittime(queueId, conversationId);

        // TODO: test validations
    }
    
    /**
     * Get the members of this queue
     *
     * 
     */
    @Test
    public void getRoutingQueuesQueueIdUsersTest() {
        String queueId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String expand = null;
        Boolean directMembers = null;
        // QueueMember response = api.getRoutingQueuesQueueIdUsers(queueId, pageSize, pageNumber, sortBy, expand, directMembers);

        // TODO: test validations
    }
    
    /**
     * Get the wrap-up codes for a queue
     *
     * 
     */
    @Test
    public void getRoutingQueuesQueueIdWrapupcodesTest() {
        String queueId = null;
        String codeId = null;
        // WrapupCode response = api.getRoutingQueuesQueueIdWrapupcodes(queueId, codeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of routing skills.
     *
     * 
     */
    @Test
    public void getRoutingSkillsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // SkillEntityListing response = api.getRoutingSkills(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get Routing Skill
     *
     * 
     */
    @Test
    public void getRoutingSkillsSkillIdTest() {
        String skillId = null;
        // RoutingSkill response = api.getRoutingSkillsSkillId(skillId);

        // TODO: test validations
    }
    
    /**
     * Get the utilization settings.
     *
     * 
     */
    @Test
    public void getRoutingUtilizationTest() {
        // Utilization response = api.getRoutingUtilization();

        // TODO: test validations
    }
    
    /**
     * Get list of wrapup codes.
     *
     * 
     */
    @Test
    public void getRoutingWrapupcodesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        // WrapupCodeEntityListing response = api.getRoutingWrapupcodes(pageSize, pageNumber, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get details about this wrap-up code.
     *
     * 
     */
    @Test
    public void getRoutingWrapupcodesCodeIdTest() {
        String codeId = null;
        // WrapupCode response = api.getRoutingWrapupcodesCodeId(codeId);

        // TODO: test validations
    }
    
    /**
     * List routing skills for user
     *
     * 
     */
    @Test
    public void getUsersUserIdRoutingskillsTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // UserSkillEntityListing response = api.getUsersUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a set of users for a queue
     *
     * 
     */
    @Test
    public void patchRoutingQueuesQueueIdUsersTest() {
        String queueId = null;
        List<QueueMember> body = null;
        // QueueMember response = api.patchRoutingQueuesQueueIdUsers(queueId, body);

        // TODO: test validations
    }
    
    /**
     * Update the ring number of joined status for a User in a Queue
     *
     * 
     */
    @Test
    public void patchRoutingQueuesQueueIdUsersMemberIdTest() {
        String queueId = null;
        String memberId = null;
        QueueMember body = null;
        // QueueMember response = api.patchRoutingQueuesQueueIdUsersMemberId(queueId, memberId, body);

        // TODO: test validations
    }
    
    /**
     * Query for queue observations
     *
     * 
     */
    @Test
    public void postAnalyticsQueuesObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postAnalyticsQueuesObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Create a domain
     *
     * 
     */
    @Test
    public void postRoutingEmailDomainsTest() {
        InboundDomain body = null;
        // InboundDomain response = api.postRoutingEmailDomains(body);

        // TODO: test validations
    }
    
    /**
     * Create a route
     *
     * 
     */
    @Test
    public void postRoutingEmailDomainsDomainnameRoutesTest() {
        String domainName = null;
        InboundRoute body = null;
        // InboundRoute response = api.postRoutingEmailDomainsDomainnameRoutes(domainName, body);

        // TODO: test validations
    }
    
    /**
     * Create queue
     *
     * 
     */
    @Test
    public void postRoutingQueuesTest() {
        Queue body = null;
        // Queue response = api.postRoutingQueues(body);

        // TODO: test validations
    }
    
    /**
     * Bulk add or delete up to 100 queue members
     *
     * 
     */
    @Test
    public void postRoutingQueuesQueueIdUsersTest() {
        String queueId = null;
        List<QueueMember> body = null;
        Boolean delete = null;
        // QueueMember response = api.postRoutingQueuesQueueIdUsers(queueId, body, delete);

        // TODO: test validations
    }
    
    /**
     * Add up to 100 wrap-up codes to a queue
     *
     * 
     */
    @Test
    public void postRoutingQueuesQueueIdWrapupcodesTest() {
        String queueId = null;
        String codeId = null;
        List<WrapupCode> body = null;
        // WrapupCode response = api.postRoutingQueuesQueueIdWrapupcodes(queueId, codeId, body);

        // TODO: test validations
    }
    
    /**
     * Create Skill
     *
     * 
     */
    @Test
    public void postRoutingSkillsTest() {
        RoutingSkill body = null;
        // RoutingSkill response = api.postRoutingSkills(body);

        // TODO: test validations
    }
    
    /**
     * Create a wrap-up code
     *
     * 
     */
    @Test
    public void postRoutingWrapupcodesTest() {
        WrapupCode body = null;
        // CallableTimeSet response = api.postRoutingWrapupcodes(body);

        // TODO: test validations
    }
    
    /**
     * Add routing skill to user
     *
     * 
     */
    @Test
    public void postUsersUserIdRoutingskillsTest() {
        String userId = null;
        UserRoutingSkill body = null;
        // UserRoutingSkill response = api.postUsersUserIdRoutingskills(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a route
     *
     * 
     */
    @Test
    public void putRoutingEmailDomainsDomainnameRoutesRouteIdTest() {
        String domainName = null;
        String routeId = null;
        InboundRoute body = null;
        // InboundRoute response = api.putRoutingEmailDomainsDomainnameRoutesRouteId(domainName, routeId, body);

        // TODO: test validations
    }
    
    /**
     * Update a queue
     *
     * 
     */
    @Test
    public void putRoutingQueuesQueueIdTest() {
        String queueId = null;
        Queue body = null;
        // Queue response = api.putRoutingQueuesQueueId(queueId, body);

        // TODO: test validations
    }
    
    /**
     * Update the utilization settings.
     *
     * 
     */
    @Test
    public void putRoutingUtilizationTest() {
        Utilization body = null;
        // Utilization response = api.putRoutingUtilization(body);

        // TODO: test validations
    }
    
    /**
     * Update wrap-up code
     *
     * 
     */
    @Test
    public void putRoutingWrapupcodesCodeIdTest() {
        String codeId = null;
        WrapupCode body = null;
        // WrapupCode response = api.putRoutingWrapupcodesCodeId(codeId, body);

        // TODO: test validations
    }
    
    /**
     * Update routing skill proficiency or state.
     *
     * 
     */
    @Test
    public void putUsersUserIdRoutingskillsSkillIdTest() {
        String userId = null;
        String skillId = null;
        UserRoutingSkill body = null;
        // UserRoutingSkill response = api.putUsersUserIdRoutingskillsSkillId(userId, skillId, body);

        // TODO: test validations
    }
    
}
