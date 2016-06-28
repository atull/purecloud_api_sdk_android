package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.UserRecordingEntityListing;
import io.swagger.client.model.UserRecording;
import io.swagger.client.model.DownloadResponse;
import io.swagger.client.model.FaxSummary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserRecordingsApi
 */
public class UserRecordingsApiTest {

    private UserRecordingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserRecordingsApi.class);
    }

    
    /**
     * Delete a user recording.
     *
     * 
     */
    @Test
    public void deleteUserrecordingsRecordingIdTest() {
        String recordingId = null;
        // Void response = api.deleteUserrecordingsRecordingId(recordingId);

        // TODO: test validations
    }
    
    /**
     * Get a list of user recordings.
     *
     * 
     */
    @Test
    public void getUserrecordingsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String expand = null;
        // UserRecordingEntityListing response = api.getUserrecordings(pageSize, pageNumber, expand);

        // TODO: test validations
    }
    
    /**
     * Get a user recording.
     *
     * 
     */
    @Test
    public void getUserrecordingsRecordingIdTest() {
        String recordingId = null;
        String expand = null;
        // UserRecording response = api.getUserrecordingsRecordingId(recordingId, expand);

        // TODO: test validations
    }
    
    /**
     * Download a user recording.
     *
     * 
     */
    @Test
    public void getUserrecordingsRecordingIdMediaTest() {
        String recordingId = null;
        String formatId = null;
        // DownloadResponse response = api.getUserrecordingsRecordingIdMedia(recordingId, formatId);

        // TODO: test validations
    }
    
    /**
     * Get user recording summary
     *
     * 
     */
    @Test
    public void getUserrecordingsSummaryTest() {
        // FaxSummary response = api.getUserrecordingsSummary();

        // TODO: test validations
    }
    
    /**
     * Update a user recording.
     *
     * 
     */
    @Test
    public void putUserrecordingsRecordingIdTest() {
        String recordingId = null;
        UserRecording body = null;
        String expand = null;
        // UserRecording response = api.putUserrecordingsRecordingId(recordingId, body, expand);

        // TODO: test validations
    }
    
}
