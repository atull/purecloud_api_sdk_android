package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.model.FaxDocument;
import com.mypurecloud.sdk.model.DownloadResponse;
import com.mypurecloud.sdk.model.FaxSummary;
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
    public void deleteDocumentsDocumentIdTest() {
        String documentId = null;
        // Void response = api.deleteDocumentsDocumentId(documentId);

        // TODO: test validations
    }
    
    /**
     * Get a list of fax documents.
     *
     * 
     */
    @Test
    public void getDocumentsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // FaxDocumentEntityListing response = api.getDocuments(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a document.
     *
     * 
     */
    @Test
    public void getDocumentsDocumentIdTest() {
        String documentId = null;
        // FaxDocument response = api.getDocumentsDocumentId(documentId);

        // TODO: test validations
    }
    
    /**
     * Download a fax document.
     *
     * 
     */
    @Test
    public void getDocumentsDocumentIdContentTest() {
        String documentId = null;
        // DownloadResponse response = api.getDocumentsDocumentIdContent(documentId);

        // TODO: test validations
    }
    
    /**
     * Get fax summary
     *
     * 
     */
    @Test
    public void getSummaryTest() {
        // FaxSummary response = api.getSummary();

        // TODO: test validations
    }
    
    /**
     * Update a fax document.
     *
     * 
     */
    @Test
    public void putDocumentsDocumentIdTest() {
        String documentId = null;
        FaxDocument body = null;
        // FaxDocument response = api.putDocumentsDocumentId(documentId, body);

        // TODO: test validations
    }
    
}
