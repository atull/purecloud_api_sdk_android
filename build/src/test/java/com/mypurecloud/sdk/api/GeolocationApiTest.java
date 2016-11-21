package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.GeolocationSettings;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Geolocation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeolocationApi
 */
public class GeolocationApiTest {

    private GeolocationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GeolocationApi.class);
    }

    
    /**
     * Get a organization&#39;s GeolocationSettings
     *
     * 
     */
    @Test
    public void getSettingsTest() {
        // GeolocationSettings response = api.getSettings();

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s Geolocation
     *
     * 
     */
    @Test
    public void getUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        // Geolocation response = api.getUserIdGeolocationsClientId(userId, clientId);

        // TODO: test validations
    }
    
    /**
     * Patch a organization&#39;s GeolocationSettings
     *
     * 
     */
    @Test
    public void patchSettingsTest() {
        GeolocationSettings body = null;
        // GeolocationSettings response = api.patchSettings(body);

        // TODO: test validations
    }
    
    /**
     * Patch a user&#39;s Geolocation
     *
     * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
     */
    @Test
    public void patchUserIdGeolocationsClientIdTest() {
        String userId = null;
        String clientId = null;
        Geolocation body = null;
        // Geolocation response = api.patchUserIdGeolocationsClientId(userId, clientId, body);

        // TODO: test validations
    }
    
}
