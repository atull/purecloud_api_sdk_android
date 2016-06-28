package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.OrphanRecording;
import io.swagger.client.model.Recording;
import io.swagger.client.model.Annotation;
import io.swagger.client.model.OrphanRecordingListing;
import io.swagger.client.model.PolicyEntityListing;
import io.swagger.client.model.Policy;
import io.swagger.client.model.RecordingSettings;
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
    public void deleteConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        // Void response = api.deleteConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);

        // TODO: test validations
    }
    
    /**
     *  deletes a single orphan recording
     *
     * 
     */
    @Test
    public void deleteOrphanrecordingsOrphanIdTest() {
        String orphanId = null;
        // OrphanRecording response = api.deleteOrphanrecordingsOrphanId(orphanId);

        // TODO: test validations
    }
    
    /**
     * Delete media retention policies
     *
     * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
     */
    @Test
    public void deleteRecordingMediaretentionpoliciesTest() {
        String ids = null;
        // String response = api.deleteRecordingMediaretentionpolicies(ids);

        // TODO: test validations
    }
    
    /**
     * Delete a media retention policy
     *
     * 
     */
    @Test
    public void deleteRecordingMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        // String response = api.deleteRecordingMediaretentionpoliciesPolicyId(policyId);

        // TODO: test validations
    }
    
    /**
     * Get all of a Conversation&#39;s Recordings.
     *
     * 
     */
    @Test
    public void getConversationsConversationIdRecordingsTest() {
        String conversationId = null;
        Integer maxWaitMs = null;
        String formatId = null;
        // List<Recording> response = api.getConversationsConversationIdRecordings(conversationId, maxWaitMs, formatId);

        // TODO: test validations
    }
    
    /**
     * Gets a specific recording.
     *
     * 
     */
    @Test
    public void getConversationsConversationIdRecordingsRecordingIdTest() {
        String conversationId = null;
        String recordingId = null;
        String formatId = null;
        Boolean download = null;
        String fileName = null;
        // Void response = api.getConversationsConversationIdRecordingsRecordingId(conversationId, recordingId, formatId, download, fileName);

        // TODO: test validations
    }
    
    /**
     * Get annotations for recording
     *
     * 
     */
    @Test
    public void getConversationsConversationIdRecordingsRecordingIdAnnotationsTest() {
        String conversationId = null;
        String recordingId = null;
        // List<Annotation> response = api.getConversationsConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId);

        // TODO: test validations
    }
    
    /**
     * Get annotation
     *
     * 
     */
    @Test
    public void getConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        // Annotation response = api.getConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);

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
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        // OrphanRecordingListing response = api.getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);

        // TODO: test validations
    }
    
    /**
     * Gets a single orphan recording
     *
     * 
     */
    @Test
    public void getOrphanrecordingsOrphanIdTest() {
        String orphanId = null;
        // OrphanRecording response = api.getOrphanrecordingsOrphanId(orphanId);

        // TODO: test validations
    }
    
    /**
     * Gets media retention policy list with query options to filter on name and enabled.
     *
     * for a less verbose response, add summary&#x3D;true to this endpoint
     */
    @Test
    public void getRecordingMediaretentionpoliciesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        String name = null;
        Boolean enabled = null;
        Boolean summary = null;
        Boolean hasErrors = null;
        // PolicyEntityListing response = api.getRecordingMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors);

        // TODO: test validations
    }
    
    /**
     * Get a media retention policy
     *
     * 
     */
    @Test
    public void getRecordingMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        // Policy response = api.getRecordingMediaretentionpoliciesPolicyId(policyId);

        // TODO: test validations
    }
    
    /**
     * Get the Recording Settings for the Organization
     *
     * 
     */
    @Test
    public void getRecordingSettingsTest() {
        Boolean createDefault = null;
        // RecordingSettings response = api.getRecordingSettings(createDefault);

        // TODO: test validations
    }
    
    /**
     * Patch a media retention policy
     *
     * 
     */
    @Test
    public void patchRecordingMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        Policy body = null;
        // Policy response = api.patchRecordingMediaretentionpoliciesPolicyId(policyId, body);

        // TODO: test validations
    }
    
    /**
     * Create annotation
     *
     * 
     */
    @Test
    public void postConversationsConversationIdRecordingsRecordingIdAnnotationsTest() {
        String conversationId = null;
        String recordingId = null;
        Annotation body = null;
        // Annotation response = api.postConversationsConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId, body);

        // TODO: test validations
    }
    
    /**
     * Create media retention policy
     *
     * 
     */
    @Test
    public void postRecordingMediaretentionpoliciesTest() {
        Policy body = null;
        // Policy response = api.postRecordingMediaretentionpolicies(body);

        // TODO: test validations
    }
    
    /**
     * Updates the retention records on a recording.
     *
     * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. Use of the query parameter &#39;restoreDays&#39; is deprecated and will be removed in the next major version release. If &#39;restoreDays&#39; is provided, no attempt at updating other retention data will be made. To migrate to the new usage, issuing a request with restoreDays&#x3D;10 would instead set the archiveDate&#39;s time stamp in the PUT body to 10 days in the future.
     */
    @Test
    public void putConversationsConversationIdRecordingsRecordingIdTest() {
        String conversationId = null;
        String recordingId = null;
        Recording body = null;
        // Void response = api.putConversationsConversationIdRecordingsRecordingId(conversationId, recordingId, body);

        // TODO: test validations
    }
    
    /**
     * Update annotation
     *
     * 
     */
    @Test
    public void putConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationIdTest() {
        String conversationId = null;
        String recordingId = null;
        String annotationId = null;
        Annotation body = null;
        // Annotation response = api.putConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId, body);

        // TODO: test validations
    }
    
    /**
     * Update a media retention policy
     *
     * 
     */
    @Test
    public void putRecordingMediaretentionpoliciesPolicyIdTest() {
        String policyId = null;
        Policy body = null;
        // Policy response = api.putRecordingMediaretentionpoliciesPolicyId(policyId, body);

        // TODO: test validations
    }
    
    /**
     * Update the Recording Settings for the Organization
     *
     * 
     */
    @Test
    public void putRecordingSettingsTest() {
        RecordingSettings body = null;
        // RecordingSettings response = api.putRecordingSettings(body);

        // TODO: test validations
    }
    
}
