package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Organization;
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
    public void getOrganizationsMeTest() {
        // Organization response = api.getOrganizationsMe();

        // TODO: test validations
    }
    
}
