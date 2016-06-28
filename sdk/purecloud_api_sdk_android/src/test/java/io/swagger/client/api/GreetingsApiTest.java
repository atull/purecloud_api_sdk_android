package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Greeting;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.DomainEntityListing;
import io.swagger.client.model.DefaultGreetingList;
import io.swagger.client.model.GreetingMediaInfo;
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
    public void deleteGreetingsGreetingIdTest() {
        String greetingId = null;
        // Greeting response = api.deleteGreetingsGreetingId(greetingId);

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
     * Get an Organization&#39;s DefaultGreetingList
     *
     * 
     */
    @Test
    public void getGreetingsDefaultsTest() {
        // DefaultGreetingList response = api.getGreetingsDefaults();

        // TODO: test validations
    }
    
    /**
     * Get a Greeting with the given GreetingId
     *
     * 
     */
    @Test
    public void getGreetingsGreetingIdTest() {
        String greetingId = null;
        // Greeting response = api.getGreetingsGreetingId(greetingId);

        // TODO: test validations
    }
    
    /**
     * Get media playback URI for this greeting
     *
     * 
     */
    @Test
    public void getGreetingsGreetingIdMediaTest() {
        String greetingId = null;
        String formatId = null;
        // GreetingMediaInfo response = api.getGreetingsGreetingIdMedia(greetingId, formatId);

        // TODO: test validations
    }
    
    /**
     * Get a list of the User&#39;s Greetings
     *
     * 
     */
    @Test
    public void getUsersUserIdGreetingsTest() {
        String userId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // DomainEntityListing response = api.getUsersUserIdGreetings(userId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Grabs the list of Default Greetings given a User&#39;s ID
     *
     * 
     */
    @Test
    public void getUsersUserIdGreetingsDefaultsTest() {
        String userId = null;
        // DefaultGreetingList response = api.getUsersUserIdGreetingsDefaults(userId);

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
    public void postUsersUserIdGreetingsTest() {
        String userId = null;
        Greeting body = null;
        // Greeting response = api.postUsersUserIdGreetings(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update an Organization&#39;s DefaultGreetingList
     *
     * 
     */
    @Test
    public void putGreetingsDefaultsTest() {
        DefaultGreetingList body = null;
        // DefaultGreetingList response = api.putGreetingsDefaults(body);

        // TODO: test validations
    }
    
    /**
     * Updates the Greeting with the given GreetingId
     *
     * 
     */
    @Test
    public void putGreetingsGreetingIdTest() {
        String greetingId = null;
        Greeting body = null;
        // Greeting response = api.putGreetingsGreetingId(greetingId, body);

        // TODO: test validations
    }
    
    /**
     * Updates the DefaultGreetingList of the specified User
     *
     * 
     */
    @Test
    public void putUsersUserIdGreetingsDefaultsTest() {
        String userId = null;
        DefaultGreetingList body = null;
        // DefaultGreetingList response = api.putUsersUserIdGreetingsDefaults(userId, body);

        // TODO: test validations
    }
    
}
