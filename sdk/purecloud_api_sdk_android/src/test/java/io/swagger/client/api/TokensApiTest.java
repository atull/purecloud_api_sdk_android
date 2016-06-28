package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
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
    public void deleteTokensMeTest() {
        // String response = api.deleteTokensMe();

        // TODO: test validations
    }
    
}
