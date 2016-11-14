package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.ServerDate;
import com.mypurecloud.sdk.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.model.ParsedCertificate;
import com.mypurecloud.sdk.model.Certificate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilitiesApi
 */
public class UtilitiesApiTest {

    private UtilitiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilitiesApi.class);
    }

    
    /**
     * Get the current system date/time
     *
     * 
     */
    @Test
    public void getDateTest() {
        // ServerDate response = api.getDate();

        // TODO: test validations
    }
    
    /**
     * Get time zones list
     *
     * 
     */
    @Test
    public void getTimezonesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // TimeZoneEntityListing response = api.getTimezones(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Returns the information about an X509 PEM encoded certificate or certificate chain.
     *
     * 
     */
    @Test
    public void postDetailsTest() {
        Certificate body = null;
        // ParsedCertificate response = api.postDetails(body);

        // TODO: test validations
    }
    
}
