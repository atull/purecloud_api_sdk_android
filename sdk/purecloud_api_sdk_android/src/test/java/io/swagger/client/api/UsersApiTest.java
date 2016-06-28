package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    
    /**
     * Delete user
     *
     * 
     */
    @Test
    public void deleteUsersUserIdTest() {
        String userId = null;
        // String response = api.deleteUsersUserId(userId);

        // TODO: test validations
    }
    
    /**
     * Removes all the roles from the user.
     *
     * 
     */
    @Test
    public void deleteUsersUserIdRolesTest() {
        String userId = null;
        // Void response = api.deleteUsersUserIdRoles(userId);

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
     * Clear associated station
     *
     * 
     */
    @Test
    public void deleteUsersUserIdStationAssociatedstationTest() {
        String userId = null;
        // Void response = api.deleteUsersUserIdStationAssociatedstation(userId);

        // TODO: test validations
    }
    
    /**
     * Clear default station
     *
     * 
     */
    @Test
    public void deleteUsersUserIdStationDefaultstationTest() {
        String userId = null;
        // Void response = api.deleteUsersUserIdStationDefaultstation(userId);

        // TODO: test validations
    }
    
    /**
     * Get the list of available users.
     *
     * 
     */
    @Test
    public void getUsersTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        List<String> id = null;
        String sortBy = null;
        String role = null;
        String name = null;
        String username = null;
        List<String> skill = null;
        List<String> expand = null;
        // UsersEntityListing response = api.getUsers(pageSize, pageNumber, id, sortBy, role, name, username, skill, expand);

        // TODO: test validations
    }
    
    /**
     * Get user.
     *
     * 
     */
    @Test
    public void getUsersMeTest() {
        List<String> expand = null;
        // UserMe response = api.getUsersMe(expand);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getUsersSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // UsersSearchResponse response = api.getUsersSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Get user.
     *
     * 
     */
    @Test
    public void getUsersUserIdTest() {
        String userId = null;
        List<String> expand = null;
        // User response = api.getUsersUserId(userId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void getUsersUserIdCallforwardingTest() {
        String userId = null;
        // CallForwarding response = api.getUsersUserIdCallforwarding(userId);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s Geolocation
     *
     * 
     */
    @Test
    public void getUsersUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        // Geolocation response = api.getUsersUserIdGeolocationsClientId(userId, clientId);

        // TODO: test validations
    }
    
    /**
     * Get a OutOfOffice
     *
     * 
     */
    @Test
    public void getUsersUserIdOutofofficeTest() {
        String userId = null;
        // OutOfOffice response = api.getUsersUserIdOutofoffice(userId);

        // TODO: test validations
    }
    
    /**
     * Get queues for user
     *
     * 
     */
    @Test
    public void getUsersUserIdQueuesTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // UserQueueEntityListing response = api.getUsersUserIdQueues(userId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Returns a listing of roles and permissions for a user.
     *
     * 
     */
    @Test
    public void getUsersUserIdRolesTest() {
        String userId = null;
        // UserAuthorization response = api.getUsersUserIdRoles(userId);

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
     * Fetch the routing status of a user
     *
     * 
     */
    @Test
    public void getUsersUserIdRoutingstatusTest() {
        String userId = null;
        // RoutingStatus response = api.getUsersUserIdRoutingstatus(userId);

        // TODO: test validations
    }
    
    /**
     * Get station information for user
     *
     * 
     */
    @Test
    public void getUsersUserIdStationTest() {
        String userId = null;
        // UserStations response = api.getUsersUserIdStation(userId);

        // TODO: test validations
    }
    
    /**
     * Update user
     *
     * 
     */
    @Test
    public void patchUsersUserIdTest() {
        String userId = null;
        User body = null;
        // User response = api.patchUsersUserId(userId, body);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void patchUsersUserIdCallforwardingTest() {
        String userId = null;
        CallForwarding body = null;
        // CallForwarding response = api.patchUsersUserIdCallforwarding(userId, body);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s Geolocation
     *
     * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
     */
    @Test
    public void patchUsersUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        Geolocation body = null;
        // Geolocation response = api.patchUsersUserIdGeolocationsClientId(userId, clientId, body);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a set of queues for a user
     *
     * 
     */
    @Test
    public void patchUsersUserIdQueuesTest() {
        String userId = null;
        List<UserQueue> body = null;
        // UserQueue response = api.patchUsersUserIdQueues(userId, body);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a queue for a user
     *
     * 
     */
    @Test
    public void patchUsersUserIdQueuesQueueIdTest() {
        String queueId = null;
        String userId = null;
        UserQueue body = null;
        // UserQueue response = api.patchUsersUserIdQueuesQueueId(queueId, userId, body);

        // TODO: test validations
    }
    
    /**
     * Query for user aggregates
     *
     * 
     */
    @Test
    public void postAnalyticsUsersAggregatesQueryTest() {
        AggregationQuery body = null;
        // PresenceQueryResponse response = api.postAnalyticsUsersAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for user observations
     *
     * 
     */
    @Test
    public void postAnalyticsUsersObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postAnalyticsUsersObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Create user
     *
     * 
     */
    @Test
    public void postUsersTest() {
        CreateUser body = null;
        // User response = api.postUsers(body);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postUsersSearchTest() {
        UserSearchRequest body = null;
        // UsersSearchResponse response = api.postUsersSearch(body);

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
     * Update a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void putUsersUserIdCallforwardingTest() {
        String userId = null;
        CallForwarding body = null;
        // CallForwarding response = api.putUsersUserIdCallforwarding(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update an OutOfOffice
     *
     * 
     */
    @Test
    public void putUsersUserIdOutofofficeTest() {
        String userId = null;
        OutOfOffice body = null;
        // OutOfOffice response = api.putUsersUserIdOutofoffice(userId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the user&#39;s roles
     *
     * 
     */
    @Test
    public void putUsersUserIdRolesTest() {
        String userId = null;
        List<String> body = null;
        // UserAuthorization response = api.putUsersUserIdRoles(userId, body);

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
    
    /**
     * Update the routing status of a user
     *
     * 
     */
    @Test
    public void putUsersUserIdRoutingstatusTest() {
        String userId = null;
        RoutingStatus body = null;
        // RoutingStatus response = api.putUsersUserIdRoutingstatus(userId, body);

        // TODO: test validations
    }
    
    /**
     * Set associated station
     *
     * 
     */
    @Test
    public void putUsersUserIdStationAssociatedstationStationIdTest() {
        String userId = null;
        String stationId = null;
        // Void response = api.putUsersUserIdStationAssociatedstationStationId(userId, stationId);

        // TODO: test validations
    }
    
    /**
     * Set default station
     *
     * 
     */
    @Test
    public void putUsersUserIdStationDefaultstationStationIdTest() {
        String userId = null;
        String stationId = null;
        // Void response = api.putUsersUserIdStationDefaultstationStationId(userId, stationId);

        // TODO: test validations
    }
    
}
