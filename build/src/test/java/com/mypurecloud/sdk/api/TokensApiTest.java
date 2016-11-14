package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokensApi
 */
public class TokensApiTest {

    private TokensApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TokensApi.class);
    }

    
    /**
     * Delete  auth token used to make the request.
     *
     * 
     */
    @Test
    public void deleteMeTest() {
        // String response = api.deleteMe();

        // TODO: test validations
    }
    
}
