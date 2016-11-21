package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.model.SearchRequest;
import com.mypurecloud.sdk.model.SuggestSearchRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SuggestApi
 */
public class SuggestApiTest {

    private SuggestApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SuggestApi.class);
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
    public void postSuggestTest() {
        SuggestSearchRequest body = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.postSuggest(body, profile);

        // TODO: test validations
    }
    
}
