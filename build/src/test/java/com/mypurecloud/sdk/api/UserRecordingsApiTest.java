package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.UserRecording;
import com.mypurecloud.sdk.model.DownloadResponse;
import com.mypurecloud.sdk.model.FaxSummary;
import com.mypurecloud.sdk.model.UserRecordingEntityListing;
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
    public void deleteRecordingIdTest() {
        String recordingId = null;
        // Void response = api.deleteRecordingId(recordingId);

        // TODO: test validations
    }
    
    /**
     * Get a user recording.
     *
     * 
     */
    @Test
    public void getRecordingIdTest() {
        String recordingId = null;
        String expand = null;
        // UserRecording response = api.getRecordingId(recordingId, expand);

        // TODO: test validations
    }
    
    /**
     * Download a user recording.
     *
     * 
     */
    @Test
    public void getRecordingIdMediaTest() {
        String recordingId = null;
        String formatId = null;
        // DownloadResponse response = api.getRecordingIdMedia(recordingId, formatId);

        // TODO: test validations
    }
    
    /**
     * Get user recording summary
     *
     * 
     */
    @Test
    public void getSummaryTest() {
        // FaxSummary response = api.getSummary();

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
     * Update a user recording.
     *
     * 
     */
    @Test
    public void putRecordingIdTest() {
        String recordingId = null;
        UserRecording body = null;
        String expand = null;
        // UserRecording response = api.putRecordingId(recordingId, body, expand);

        // TODO: test validations
    }
    
}
