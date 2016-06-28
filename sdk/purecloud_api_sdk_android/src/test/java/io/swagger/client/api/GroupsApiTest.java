package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.GroupEntityListing;
import io.swagger.client.model.Group;
import io.swagger.client.model.UserEntityListing;
import io.swagger.client.model.GroupsSearchResponse;
import io.swagger.client.model.GroupMembersUpdate;
import io.swagger.client.model.GroupSearchRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private GroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GroupsApi.class);
    }

    
    /**
     * Remove members
     *
     * 
     */
    @Test
    public void deleteGroupsGroupIdMembersTest() {
        String groupId = null;
        String ids = null;
        // Void response = api.deleteGroupsGroupIdMembers(groupId, ids);

        // TODO: test validations
    }
    
    /**
     * Get a group list
     *
     * 
     */
    @Test
    public void getGroupsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // GroupEntityListing response = api.getGroups(pageSize, pageNumber, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get group
     *
     * 
     */
    @Test
    public void getGroupsGroupIdTest() {
        String groupId = null;
        // Group response = api.getGroupsGroupId(groupId);

        // TODO: test validations
    }
    
    /**
     * Get group members
     *
     * 
     */
    @Test
    public void getGroupsGroupIdMembersTest() {
        String groupId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // UserEntityListing response = api.getGroupsGroupIdMembers(groupId, pageSize, pageNumber, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getGroupsSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // GroupsSearchResponse response = api.getGroupsSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Create a group
     *
     * 
     */
    @Test
    public void postGroupsTest() {
        Group body = null;
        // Group response = api.postGroups(body);

        // TODO: test validations
    }
    
    /**
     * Add members
     *
     * 
     */
    @Test
    public void postGroupsGroupIdMembersTest() {
        String groupId = null;
        GroupMembersUpdate body = null;
        // Void response = api.postGroupsGroupIdMembers(groupId, body);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postGroupsSearchTest() {
        GroupSearchRequest body = null;
        // GroupsSearchResponse response = api.postGroupsSearch(body);

        // TODO: test validations
    }
    
}
