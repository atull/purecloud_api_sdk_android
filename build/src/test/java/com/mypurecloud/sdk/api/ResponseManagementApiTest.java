package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.LibraryEntityListing;
import com.mypurecloud.sdk.model.Library;
import com.mypurecloud.sdk.model.ResponseEntityListing;
import com.mypurecloud.sdk.model.Response;
import com.mypurecloud.sdk.model.ResponseQueryRequest;
import com.mypurecloud.sdk.model.ResponseQueryResults;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResponseManagementApi
 */
public class ResponseManagementApiTest {

    private ResponseManagementApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ResponseManagementApi.class);
    }

    
    /**
     * Delete an existing response library.
     *
     * This will remove any responses associated with the library.
     */
    @Test
    public void deleteLibrariesLibraryIdTest() {
        String libraryId = null;
        // Void response = api.deleteLibrariesLibraryId(libraryId);

        // TODO: test validations
    }
    
    /**
     * Delete an existing response.
     *
     * This will remove the response from any libraries associated with it.
     */
    @Test
    public void deleteResponsesResponseIdTest() {
        String responseId = null;
        // Void response = api.deleteResponsesResponseId(responseId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of existing response libraries.
     *
     * 
     */
    @Test
    public void getLibrariesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // LibraryEntityListing response = api.getLibraries(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get details about an existing response library.
     *
     * 
     */
    @Test
    public void getLibrariesLibraryIdTest() {
        String libraryId = null;
        // Library response = api.getLibrariesLibraryId(libraryId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of existing responses.
     *
     * 
     */
    @Test
    public void getResponsesTest() {
        String libraryId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        // ResponseEntityListing response = api.getResponses(libraryId, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get details about an existing response.
     *
     * 
     */
    @Test
    public void getResponsesResponseIdTest() {
        String responseId = null;
        // Response response = api.getResponsesResponseId(responseId);

        // TODO: test validations
    }
    
    /**
     * Create a response library.
     *
     * 
     */
    @Test
    public void postLibrariesTest() {
        Library body = null;
        // Library response = api.postLibraries(body);

        // TODO: test validations
    }
    
    /**
     * Create a response.
     *
     * 
     */
    @Test
    public void postResponsesTest() {
        Response body = null;
        // Response response = api.postResponses(body);

        // TODO: test validations
    }
    
    /**
     * Query responses
     *
     * 
     */
    @Test
    public void postResponsesQueryTest() {
        ResponseQueryRequest body = null;
        // ResponseQueryResults response = api.postResponsesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update an existing response library.
     *
     * Fields that can be updated: name. The most recent version is required for updates.
     */
    @Test
    public void putLibrariesLibraryIdTest() {
        String libraryId = null;
        Library body = null;
        // Library response = api.putLibrariesLibraryId(libraryId, body);

        // TODO: test validations
    }
    
    /**
     * Update an existing response.
     *
     * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
     */
    @Test
    public void putResponsesResponseIdTest() {
        String responseId = null;
        Response body = null;
        // Response response = api.putResponsesResponseId(responseId, body);

        // TODO: test validations
    }
    
}
