package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.GroupsSearchResponse;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.LocationsSearchResponse;
import com.mypurecloud.sdk.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.model.UsersSearchResponse;
import com.mypurecloud.sdk.model.GroupSearchRequest;
import com.mypurecloud.sdk.model.LocationSearchRequest;
import com.mypurecloud.sdk.model.SearchRequest;
import com.mypurecloud.sdk.model.UserSearchRequest;
import com.mypurecloud.sdk.model.SuggestSearchRequest;
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
    public void getSearchTest() {
        String q64 = null;
        List<String> expand = null;
        // GroupsSearchResponse response = api.getSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getSearch_0Test() {
        String q64 = null;
        List<String> expand = null;
        // LocationsSearchResponse response = api.getSearch_0(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getSearch_1Test() {
        String q64 = null;
        List<String> expand = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.getSearch_1(q64, expand, profile);

        // TODO: test validations
    }
    
    /**
     * Search using q64
     *
     * 
     */
    @Test
    public void getSearch_2Test() {
        String q64 = null;
        List<String> expand = null;
        // UsersSearchResponse response = api.getSearch_2(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Suggest using q64
     *
     * 
     */
    @Test
    public void getSuggestTest() {
        String q64 = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.getSuggest(q64, profile);

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
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearch_0Test() {
        LocationSearchRequest body = null;
        // LocationsSearchResponse response = api.postSearch_0(body);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearch_1Test() {
        SearchRequest body = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.postSearch_1(body, profile);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearch_2Test() {
        UserSearchRequest body = null;
        // UsersSearchResponse response = api.postSearch_2(body);

        // TODO: test validations
    }
    
    /**
     * Suggest
     *
     * 
     */
    @Test
    public void postSuggestTest() {
        SuggestSearchRequest body = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.postSuggest(body, profile);

        // TODO: test validations
    }
    
}
