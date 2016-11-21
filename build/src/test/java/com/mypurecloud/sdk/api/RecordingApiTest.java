package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.OrphanRecording;
import com.mypurecloud.sdk.model.Recording;
import com.mypurecloud.sdk.model.Annotation;
import com.mypurecloud.sdk.model.PolicyEntityListing;
import com.mypurecloud.sdk.model.Policy;
import com.mypurecloud.sdk.model.OrphanRecordingListing;
import com.mypurecloud.sdk.model.RecordingSettings;
import com.mypurecloud.sdk.model.ScreenRecordingSessionListing;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordingApi
 */
public class RecordingApiTest {

    private RecordingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RecordingApi.class);
    }

    
    /**
     * Delete annotation
     *
     * 
     */
    @Test
    public void deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        // Void response = api.deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);

        // TODO: test validations
    }
    
    /**
     * Delete media retention policies
     *
     * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
     */
    @Test
    public void deleteMediaretentionpoliciesTest() {
        String ids = null;
        // String response = api.deleteMediaretentionpolicies(ids);

        // TODO: test validations
    }
    
    /**
     * Delete a media retention policy
     *
     * 
     */
    @Test
    public void deleteMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        // String response = api.deleteMediaretentionpoliciesPolicyId(policyId);

        // TODO: test validations
    }
    
    /**
     *  deletes a single orphan recording
     *
     * 
     */
    @Test
    public void deleteOrphanIdTest() {
        String orphanId = null;
        // OrphanRecording response = api.deleteOrphanId(orphanId);

        // TODO: test validations
    }
    
    /**
     * Get all of a Conversation&#39;s Recordings.
     *
     * 
     */
    @Test
    public void getConversationIdRecordingsTest() {
        String conversationId = null;
        Integer maxWaitMs = null;
        String formatId = null;
        // List<Recording> response = api.getConversationIdRecordings(conversationId, maxWaitMs, formatId);

        // TODO: test validations
    }
    
    /**
     * Gets a specific recording.
     *
     * 
     */
    @Test
    public void getConversationIdRecordingsRecordingIdTest() {
        String conversationId = null;
        String recordingId = null;
        String formatId = null;
        Boolean download = null;
        String fileName = null;
        // Void response = api.getConversationIdRecordingsRecordingId(conversationId, recordingId, formatId, download, fileName);

        // TODO: test validations
    }
    
    /**
     * Get annotations for recording
     *
     * 
     */
    @Test
    public void getConversationIdRecordingsRecordingIdAnnotationsTest() {
        String conversationId = null;
        String recordingId = null;
        // List<Annotation> response = api.getConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId);

        // TODO: test validations
    }
    
    /**
     * Get annotation
     *
     * 
     */
    @Test
    public void getConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        // Annotation response = api.getConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);

        // TODO: test validations
    }
    
    /**
     * Gets media retention policy list with query options to filter on name and enabled.
     *
     * for a less verbose response, add summary&#x3D;true to this endpoint
     */
    @Test
    public void getMediaretentionpoliciesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        String name = null;
        Boolean enabled = null;
        Boolean summary = null;
        Boolean hasErrors = null;
        // PolicyEntityListing response = api.getMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors);

        // TODO: test validations
    }
    
    /**
     * Get a media retention policy
     *
     * 
     */
    @Test
    public void getMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        // Policy response = api.getMediaretentionpoliciesPolicyId(policyId);

        // TODO: test validations
    }
    
    /**
     * Gets a single orphan recording
     *
     * 
     */
    @Test
    public void getOrphanIdTest() {
        String orphanId = null;
        // OrphanRecording response = api.getOrphanId(orphanId);

        // TODO: test validations
    }
    
    /**
     * Gets all orphan recordings
     *
     * 
     */
    @Test
    public void getOrphanrecordingsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        // OrphanRecordingListing response = api.getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);

        // TODO: test validations
    }
    
    /**
     * Get the Recording Settings for the Organization
     *
     * 
     */
    @Test
    public void getSettingsTest() {
        Boolean createDefault = null;
        // RecordingSettings response = api.getSettings(createDefault);

        // TODO: test validations
    }
    
    /**
     * Retrieves a paged listing of screen recording sessions
     *
     * 
     */
    @Test
    public void getsScreensessionsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // ScreenRecordingSessionListing response = api.getsScreensessions(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Patch a media retention policy
     *
     * 
     */
    @Test
    public void patchMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        Policy body = null;
        // Policy response = api.patchMediaretentionpoliciesPolicyId(policyId, body);

        // TODO: test validations
    }
    
    /**
     * Create annotation
     *
     * 
     */
    @Test
    public void postConversationIdRecordingsRecordingIdAnnotationsTest() {
        String conversationId = null;
        String recordingId = null;
        Annotation body = null;
        // Annotation response = api.postConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId, body);

        // TODO: test validations
    }
    
    /**
     * Create media retention policy
     *
     * 
     */
    @Test
    public void postMediaretentionpoliciesTest() {
        Policy body = null;
        // Policy response = api.postMediaretentionpolicies(body);

        // TODO: test validations
    }
    
    /**
     * Updates the retention records on a recording.
     *
     * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. Use of the query parameter &#39;restoreDays&#39; is deprecated and will be removed in the next major version release. If &#39;restoreDays&#39; is provided, no attempt at updating other retention data will be made. To migrate to the new usage, issuing a request with restoreDays&#x3D;10 would instead set the archiveDate&#39;s time stamp in the PUT body to 10 days in the future.
     */
    @Test
    public void putConversationIdRecordingsRecordingIdTest() {
        String conversationId = null;
        String recordingId = null;
        Recording body = null;
        // Void response = api.putConversationIdRecordingsRecordingId(conversationId, recordingId, body);

        // TODO: test validations
    }
    
    /**
     * Update annotation
     *
     * 
     */
    @Test
    public void putConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        Annotation body = null;
        // Annotation response = api.putConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId, body);

        // TODO: test validations
    }
    
    /**
     * Update a media retention policy
     *
     * 
     */
    @Test
    public void putMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        Policy body = null;
        // Policy response = api.putMediaretentionpoliciesPolicyId(policyId, body);

        // TODO: test validations
    }
    
    /**
     * Update the Recording Settings for the Organization
     *
     * 
     */
    @Test
    public void putSettingsTest() {
        RecordingSettings body = null;
        // RecordingSettings response = api.putSettings(body);

        // TODO: test validations
    }
    
}
