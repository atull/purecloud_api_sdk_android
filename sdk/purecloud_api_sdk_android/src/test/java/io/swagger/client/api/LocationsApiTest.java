package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Location;
import io.swagger.client.model.LocationsSearchResponse;
import io.swagger.client.model.LocationSearchRequest;
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
     * Get Location by ID.
     *
     * 
     */
    @Test
    public void getLocationsLocationIdTest() {
        String locationId = null;
        // Location response = api.getLocationsLocationId(locationId);

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
    
}
