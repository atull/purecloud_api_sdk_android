package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Location;
import com.mypurecloud.sdk.model.LocationsSearchResponse;
import com.mypurecloud.sdk.model.LocationSearchRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
public class LocationsApiTest {

    private LocationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LocationsApi.class);
    }

    
    /**
     * Get Location by ID.
     *
     * 
     */
    @Test
    public void getLocationIdTest() {
        String locationId = null;
        // Location response = api.getLocationId(locationId);

        // TODO: test validations
    }
    
    /**
     * Get a list of all locations.
     *
     * 
     */
    @Test
    public void getLocationsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        // List<Location> response = api.getLocations(pageSize, pageNumber, sortOrder);

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
        // LocationsSearchResponse response = api.getSearch(q64, expand);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * 
     */
    @Test
    public void postSearchTest() {
        LocationSearchRequest body = null;
        // LocationsSearchResponse response = api.postSearch(body);

        // TODO: test validations
    }
    
}
