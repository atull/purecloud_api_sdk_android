package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Organization;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
public class OrganizationApiTest {

    private OrganizationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OrganizationApi.class);
    }

    
    /**
     * Get organization.
     *
     * 
     */
    @Test
    public void getMeTest() {
        // Organization response = api.getMe();

        // TODO: test validations
    }
    
}
