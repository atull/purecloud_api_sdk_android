package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.EncryptionKeyEntityListing;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.KeyRotationSchedule;
import io.swagger.client.model.EncryptionKey;
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
     * Get encryption key list
     *
     * 
     */
    @Test
    public void getRecordingRecordingkeysTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // EncryptionKeyEntityListing response = api.getRecordingRecordingkeys(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get key rotation schedule
     *
     * 
     */
    @Test
    public void getRecordingRecordingkeysRotationscheduleTest() {
        // KeyRotationSchedule response = api.getRecordingRecordingkeysRotationschedule();

        // TODO: test validations
    }
    
    /**
     * Create encryption key
     *
     * 
     */
    @Test
    public void postRecordingRecordingkeysTest() {
        // EncryptionKey response = api.postRecordingRecordingkeys();

        // TODO: test validations
    }
    
    /**
     * Update key rotation schedule
     *
     * 
     */
    @Test
    public void putRecordingRecordingkeysRotationscheduleTest() {
        KeyRotationSchedule body = null;
        // KeyRotationSchedule response = api.putRecordingRecordingkeysRotationschedule(body);

        // TODO: test validations
    }
    
}
