package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.ServerDate;
import io.swagger.client.model.TimeZoneEntityListing;
import io.swagger.client.model.ParsedCertificate;
import io.swagger.client.model.Certificate;
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
    public void postCertificateDetailsTest() {
        Certificate body = null;
        // ParsedCertificate response = api.postCertificateDetails(body);

        // TODO: test validations
    }
    
}
