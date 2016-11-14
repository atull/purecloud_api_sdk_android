package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
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
    public void deleteUserIdTest() {
        String userId = null;
        // String response = api.deleteUserId(userId);

        // TODO: test validations
    }
    
    /**
     * Removes all the roles from the user.
     *
     * 
     */
    @Test
    public void deleteUserIdRolesTest() {
        String userId = null;
        // Void response = api.deleteUserIdRoles(userId);

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
     * Clear associated station
     *
     * 
     */
    @Test
    public void deleteUserIdStationAssociatedstationTest() {
        String userId = null;
        // Void response = api.deleteUserIdStationAssociatedstation(userId);

        // TODO: test validations
    }
    
    /**
     * Clear default station
     *
     * 
     */
    @Test
    public void deleteUserIdStationDefaultstationTest() {
        String userId = null;
        // Void response = api.deleteUserIdStationDefaultstation(userId);

        // TODO: test validations
    }
    
    /**
     * Get current user details.
     *
     * This request is not valid when using the Client Credentials OAuth grant.
     */
    @Test
    public void getMeTest() {
        List<String> expand = null;
        // UserMe response = api.getMe(expand);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // UsersSearchResponse response = api.getSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Get user.
     *
     * 
     */
    @Test
    public void getUserIdTest() {
        String userId = null;
        List<String> expand = null;
        // User response = api.getUserId(userId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void getUserIdCallforwardingTest() {
        String userId = null;
        // CallForwarding response = api.getUserIdCallforwarding(userId);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s Geolocation
     *
     * 
     */
    @Test
    public void getUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        // Geolocation response = api.getUserIdGeolocationsClientId(userId, clientId);

        // TODO: test validations
    }
    
    /**
     * Get a OutOfOffice
     *
     * 
     */
    @Test
    public void getUserIdOutofofficeTest() {
        String userId = null;
        // OutOfOffice response = api.getUserIdOutofoffice(userId);

        // TODO: test validations
    }
    
    /**
     * Get queues for user
     *
     * 
     */
    @Test
    public void getUserIdQueuesTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        Boolean joined = null;
        // UserQueueEntityListing response = api.getUserIdQueues(userId, pageSize, pageNumber, joined);

        // TODO: test validations
    }
    
    /**
     * Returns a listing of roles and permissions for a user.
     *
     * 
     */
    @Test
    public void getUserIdRolesTest() {
        String userId = null;
        // UserAuthorization response = api.getUserIdRoles(userId);

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
     * Fetch the routing status of a user
     *
     * 
     */
    @Test
    public void getUserIdRoutingstatusTest() {
        String userId = null;
        // RoutingStatus response = api.getUserIdRoutingstatus(userId);

        // TODO: test validations
    }
    
    /**
     * Get station information for user
     *
     * 
     */
    @Test
    public void getUserIdStationTest() {
        String userId = null;
        // UserStations response = api.getUserIdStation(userId);

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
        String sortOrder = null;
        List<String> expand = null;
        // UsersEntityListing response = api.getUsers(pageSize, pageNumber, id, sortOrder, expand);

        // TODO: test validations
    }
    
    /**
     * Update user
     *
     * 
     */
    @Test
    public void patchUserIdTest() {
        String userId = null;
        User body = null;
        // User response = api.patchUserId(userId, body);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void patchUserIdCallforwardingTest() {
        String userId = null;
        CallForwarding body = null;
        // CallForwarding response = api.patchUserIdCallforwarding(userId, body);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s Geolocation
     *
     * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
     */
    @Test
    public void patchUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        Geolocation body = null;
        // Geolocation response = api.patchUserIdGeolocationsClientId(userId, clientId, body);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a set of queues for a user
     *
     * 
     */
    @Test
    public void patchUserIdQueuesTest() {
        String userId = null;
        List<UserQueue> body = null;
        // UserQueue response = api.patchUserIdQueues(userId, body);

        // TODO: test validations
    }
    
    /**
     * Join or unjoin a queue for a user
     *
     * 
     */
    @Test
    public void patchUserIdQueuesQueueIdTest() {
        String queueId = null;
        String userId = null;
        UserQueue body = null;
        // UserQueue response = api.patchUserIdQueuesQueueId(queueId, userId, body);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearchTest() {
        UserSearchRequest body = null;
        // UsersSearchResponse response = api.postSearch(body);

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
     * Query for user aggregates
     *
     * 
     */
    @Test
    public void postUsersAggregatesQueryTest() {
        AggregationQuery body = null;
        // PresenceQueryResponse response = api.postUsersAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for user observations
     *
     * 
     */
    @Test
    public void postUsersObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postUsersObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update a user&#39;s CallForwarding
     *
     * 
     */
    @Test
    public void putUserIdCallforwardingTest() {
        String userId = null;
        CallForwarding body = null;
        // CallForwarding response = api.putUserIdCallforwarding(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update an OutOfOffice
     *
     * 
     */
    @Test
    public void putUserIdOutofofficeTest() {
        String userId = null;
        OutOfOffice body = null;
        // OutOfOffice response = api.putUserIdOutofoffice(userId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the user&#39;s roles
     *
     * 
     */
    @Test
    public void putUserIdRolesTest() {
        String userId = null;
        List<String> body = null;
        // UserAuthorization response = api.putUserIdRoles(userId, body);

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
     * Update the routing status of a user
     *
     * 
     */
    @Test
    public void putUserIdRoutingstatusTest() {
        String userId = null;
        RoutingStatus body = null;
        // RoutingStatus response = api.putUserIdRoutingstatus(userId, body);

        // TODO: test validations
    }
    
    /**
     * Set associated station
     *
     * 
     */
    @Test
    public void putUserIdStationAssociatedstationStationIdTest() {
        String userId = null;
        String stationId = null;
        // Void response = api.putUserIdStationAssociatedstationStationId(userId, stationId);

        // TODO: test validations
    }
    
    /**
     * Set default station
     *
     * 
     */
    @Test
    public void putUserIdStationDefaultstationStationIdTest() {
        String userId = null;
        String stationId = null;
        // Void response = api.putUserIdStationDefaultstationStationId(userId, stationId);

        // TODO: test validations
    }
    
}
