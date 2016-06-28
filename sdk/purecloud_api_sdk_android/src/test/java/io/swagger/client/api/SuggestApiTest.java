package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.JsonNodeSearchResponse;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SuggestSearchRequest;
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
    public void getSearchSuggestTest() {
        String q64 = null;
        Boolean profile = null;
        // JsonNodeSearchResponse response = api.getSearchSuggest(q64, profile);

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
    
}
