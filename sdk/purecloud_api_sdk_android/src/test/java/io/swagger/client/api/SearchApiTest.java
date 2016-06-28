package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.GroupsSearchResponse;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LocationsSearchResponse;
import io.swagger.client.model.JsonNodeSearchResponse;
import io.swagger.client.model.UsersSearchResponse;
import io.swagger.client.model.GroupSearchRequest;
import io.swagger.client.model.LocationSearchRequest;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SuggestSearchRequest;
import io.swagger.client.model.UserSearchRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
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
     * Search using q64
     *
     * 
     */
    @Test
    public void getLocationsSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // LocationsSearchResponse response = api.getLocationsSearch(q64, expand);

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
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.getSearch(q64, expand, profile);

        // TODO: test validations
    }
    
    /**
     * Suggest using q64
     *
     * 
     */
    @Test
    public void getSearchSuggestTest() {
        String q64 = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.getSearchSuggest(q64, profile);

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
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postLocationsSearchTest() {
        LocationSearchRequest body = null;
        // LocationsSearchResponse response = api.postLocationsSearch(body);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearchTest() {
        SearchRequest body = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.postSearch(body, profile);

        // TODO: test validations
    }
    
    /**
     * Suggest
     *
     * 
     */
    @Test
    public void postSearchSuggestTest() {
        SuggestSearchRequest body = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.postSearchSuggest(body, profile);

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
    
}
