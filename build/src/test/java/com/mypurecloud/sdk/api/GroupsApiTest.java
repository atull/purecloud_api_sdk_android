package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Group;
import com.mypurecloud.sdk.model.UserEntityListing;
import com.mypurecloud.sdk.model.GroupEntityListing;
import com.mypurecloud.sdk.model.GroupsSearchResponse;
import com.mypurecloud.sdk.model.GroupMembersUpdate;
import com.mypurecloud.sdk.model.GroupSearchRequest;
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
    public void deleteGroupIdMembersTest() {
        String groupId = null;
        String ids = null;
        // Void response = api.deleteGroupIdMembers(groupId, ids);

        // TODO: test validations
    }
    
    /**
     * Get group
     *
     * 
     */
    @Test
    public void getGroupIdTest() {
        String groupId = null;
        // Group response = api.getGroupId(groupId);

        // TODO: test validations
    }
    
    /**
     * Get group members
     *
     * 
     */
    @Test
    public void getGroupIdMembersTest() {
        String groupId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // UserEntityListing response = api.getGroupIdMembers(groupId, pageSize, pageNumber, sortOrder);

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
     * Search using q64
     *
     * 
     */
    @Test
    public void getSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // GroupsSearchResponse response = api.getSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Add members
     *
     * 
     */
    @Test
    public void postGroupIdMembersTest() {
        String groupId = null;
        GroupMembersUpdate body = null;
        // Void response = api.postGroupIdMembers(groupId, body);

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
     * Search
     *
     * 
     */
    @Test
    public void postSearchTest() {
        GroupSearchRequest body = null;
        // GroupsSearchResponse response = api.postSearch(body);

        // TODO: test validations
    }
    
}
