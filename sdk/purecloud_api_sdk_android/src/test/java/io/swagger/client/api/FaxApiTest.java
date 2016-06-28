package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.FaxDocumentEntityListing;
import io.swagger.client.model.FaxDocument;
import io.swagger.client.model.DownloadResponse;
import io.swagger.client.model.FaxSummary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FaxApi
 */
public class FaxApiTest {

    private FaxApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FaxApi.class);
    }

    
    /**
     * Delete a fax document.
     *
     * 
     */
    @Test
    public void deleteFaxDocumentsDocumentIdTest() {
        String documentId = null;
        // Void response = api.deleteFaxDocumentsDocumentId(documentId);

        // TODO: test validations
    }
    
    /**
     * Get a list of fax documents.
     *
     * 
     */
    @Test
    public void getFaxDocumentsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // FaxDocumentEntityListing response = api.getFaxDocuments(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a document.
     *
     * 
     */
    @Test
    public void getFaxDocumentsDocumentIdTest() {
        String documentId = null;
        // FaxDocument response = api.getFaxDocumentsDocumentId(documentId);

        // TODO: test validations
    }
    
    /**
     * Download a fax document.
     *
     * 
     */
    @Test
    public void getFaxDocumentsDocumentIdContentTest() {
        String documentId = null;
        // DownloadResponse response = api.getFaxDocumentsDocumentIdContent(documentId);

        // TODO: test validations
    }
    
    /**
     * Get fax summary
     *
     * 
     */
    @Test
    public void getFaxSummaryTest() {
        // FaxSummary response = api.getFaxSummary();

        // TODO: test validations
    }
    
    /**
     * Update a fax document.
     *
     * 
     */
    @Test
    public void putFaxDocumentsDocumentIdTest() {
        String documentId = null;
        FaxDocument body = null;
        // FaxDocument response = api.putFaxDocumentsDocumentId(documentId, body);

        // TODO: test validations
    }
    
}
