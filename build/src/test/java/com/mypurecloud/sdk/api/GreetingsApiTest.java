package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.Greeting;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.DefaultGreetingList;
import com.mypurecloud.sdk.model.GreetingMediaInfo;
import com.mypurecloud.sdk.model.DomainEntityListing;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GreetingsApi
 */
public class GreetingsApiTest {

    private GreetingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GreetingsApi.class);
    }

    
    /**
     * Deletes a Greeting with the given GreetingId
     *
     * 
     */
    @Test
    public void deleteGreetingIdTest() {
        String greetingId = null;
        // Greeting response = api.deleteGreetingId(greetingId);

        // TODO: test validations
    }
    
    /**
     * Get an Organization&#39;s DefaultGreetingList
     *
     * 
     */
    @Test
    public void getDefaultsTest() {
        // DefaultGreetingList response = api.getDefaults();

        // TODO: test validations
    }
    
    /**
     * Get a Greeting with the given GreetingId
     *
     * 
     */
    @Test
    public void getGreetingIdTest() {
        String greetingId = null;
        // Greeting response = api.getGreetingId(greetingId);

        // TODO: test validations
    }
    
    /**
     * Get media playback URI for this greeting
     *
     * 
     */
    @Test
    public void getGreetingIdMediaTest() {
        String greetingId = null;
        String formatId = null;
        // GreetingMediaInfo response = api.getGreetingIdMedia(greetingId, formatId);

        // TODO: test validations
    }
    
    /**
     * Gets an Organization&#39;s Greetings
     *
     * 
     */
    @Test
    public void getGreetingsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // DomainEntityListing response = api.getGreetings(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a list of the User&#39;s Greetings
     *
     * 
     */
    @Test
    public void getUserIdGreetingsTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // DomainEntityListing response = api.getUserIdGreetings(userId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Grabs the list of Default Greetings given a User&#39;s ID
     *
     * 
     */
    @Test
    public void getUserIdGreetingsDefaultsTest() {
        String userId = null;
        // DefaultGreetingList response = api.getUserIdGreetingsDefaults(userId);

        // TODO: test validations
    }
    
    /**
     * Create a Greeting for an Organization
     *
     * 
     */
    @Test
    public void postGreetingsTest() {
        Greeting body = null;
        // DefaultGreetingList response = api.postGreetings(body);

        // TODO: test validations
    }
    
    /**
     * Creates a Greeting for a User
     *
     * 
     */
    @Test
    public void postUserIdGreetingsTest() {
        String userId = null;
        Greeting body = null;
        // Greeting response = api.postUserIdGreetings(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update an Organization&#39;s DefaultGreetingList
     *
     * 
     */
    @Test
    public void putDefaultsTest() {
        DefaultGreetingList body = null;
        // DefaultGreetingList response = api.putDefaults(body);

        // TODO: test validations
    }
    
    /**
     * Updates the Greeting with the given GreetingId
     *
     * 
     */
    @Test
    public void putGreetingIdTest() {
        String greetingId = null;
        Greeting body = null;
        // Greeting response = api.putGreetingId(greetingId, body);

        // TODO: test validations
    }
    
    /**
     * Updates the DefaultGreetingList of the specified User
     *
     * 
     */
    @Test
    public void putUserIdGreetingsDefaultsTest() {
        String userId = null;
        DefaultGreetingList body = null;
        // DefaultGreetingList response = api.putUserIdGreetingsDefaults(userId, body);

        // TODO: test validations
    }
    
}
