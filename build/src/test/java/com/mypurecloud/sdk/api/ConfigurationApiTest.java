package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.VirtualEdgeSetupPackage;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.model.KeyRotationSchedule;
import com.mypurecloud.sdk.model.EncryptionKey;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
public class ConfigurationApiTest {

    private ConfigurationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConfigurationApi.class);
    }

    
    /**
     * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdSetuppackageTest() {
        String edgeId = null;
        // VirtualEdgeSetupPackage response = api.getProvidersEdgesEdgeIdSetuppackage(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get encryption key list
     *
     * 
     */
    @Test
    public void getRecordingkeysTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // EncryptionKeyEntityListing response = api.getRecordingkeys(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get key rotation schedule
     *
     * 
     */
    @Test
    public void getRecordingkeysRotationscheduleTest() {
        // KeyRotationSchedule response = api.getRecordingkeysRotationschedule();

        // TODO: test validations
    }
    
    /**
     * Create encryption key
     *
     * 
     */
    @Test
    public void postRecordingkeysTest() {
        // EncryptionKey response = api.postRecordingkeys();

        // TODO: test validations
    }
    
    /**
     * Update key rotation schedule
     *
     * 
     */
    @Test
    public void putRecordingkeysRotationscheduleTest() {
        KeyRotationSchedule body = null;
        // KeyRotationSchedule response = api.putRecordingkeysRotationschedule(body);

        // TODO: test validations
    }
    
}
