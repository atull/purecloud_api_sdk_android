package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LibraryEntityListing;
import io.swagger.client.model.Library;
import io.swagger.client.model.ResponseEntityListing;
import io.swagger.client.model.Response;
import io.swagger.client.model.ResponseQueryRequest;
import io.swagger.client.model.ResponseQueryResults;
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
    public void deleteResponsemanagementLibrariesLibraryIdTest() {
        String libraryId = null;
        // Void response = api.deleteResponsemanagementLibrariesLibraryId(libraryId);

        // TODO: test validations
    }
    
    /**
     * Delete an existing response.
     *
     * This will remove the response from any libraries associated with it.
     */
    @Test
    public void deleteResponsemanagementResponsesResponseIdTest() {
        String responseId = null;
        // Void response = api.deleteResponsemanagementResponsesResponseId(responseId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of existing response libraries.
     *
     * 
     */
    @Test
    public void getResponsemanagementLibrariesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // LibraryEntityListing response = api.getResponsemanagementLibraries(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get details about an existing response library.
     *
     * 
     */
    @Test
    public void getResponsemanagementLibrariesLibraryIdTest() {
        String libraryId = null;
        // Library response = api.getResponsemanagementLibrariesLibraryId(libraryId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of existing responses.
     *
     * 
     */
    @Test
    public void getResponsemanagementResponsesTest() {
        String libraryId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        // ResponseEntityListing response = api.getResponsemanagementResponses(libraryId, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get details about an existing response.
     *
     * 
     */
    @Test
    public void getResponsemanagementResponsesResponseIdTest() {
        String responseId = null;
        // Response response = api.getResponsemanagementResponsesResponseId(responseId);

        // TODO: test validations
    }
    
    /**
     * Create a response library.
     *
     * 
     */
    @Test
    public void postResponsemanagementLibrariesTest() {
        Library body = null;
        // Library response = api.postResponsemanagementLibraries(body);

        // TODO: test validations
    }
    
    /**
     * Create a response.
     *
     * 
     */
    @Test
    public void postResponsemanagementResponsesTest() {
        Response body = null;
        // Response response = api.postResponsemanagementResponses(body);

        // TODO: test validations
    }
    
    /**
     * Query responses
     *
     * 
     */
    @Test
    public void postResponsemanagementResponsesQueryTest() {
        ResponseQueryRequest body = null;
        // ResponseQueryResults response = api.postResponsemanagementResponsesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update an existing response library.
     *
     * Fields that can be updated: name. The most recent version is required for updates.
     */
    @Test
    public void putResponsemanagementLibrariesLibraryIdTest() {
        String libraryId = null;
        Library body = null;
        // Library response = api.putResponsemanagementLibrariesLibraryId(libraryId, body);

        // TODO: test validations
    }
    
    /**
     * Update an existing response.
     *
     * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
     */
    @Test
    public void putResponsemanagementResponsesResponseIdTest() {
        String responseId = null;
        Response body = null;
        // Response response = api.putResponsemanagementResponsesResponseId(responseId, body);

        // TODO: test validations
    }
    
}
