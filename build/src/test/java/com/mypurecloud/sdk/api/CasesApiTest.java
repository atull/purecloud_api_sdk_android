package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.CaseEntityListing;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.ModelCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CasesApi
 */
public class CasesApiTest {

    private CasesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CasesApi.class);
    }

    
    /**
     * Gets a list of existing cases.
     *
     * 
     */
    @Test
    public void getCasesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // CaseEntityListing response = api.getCases(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Create a new case
     *
     * 
     */
    @Test
    public void postCasesTest() {
        ModelCase body = null;
        // ModelCase response = api.postCases(body);

        // TODO: test validations
    }
    
}
