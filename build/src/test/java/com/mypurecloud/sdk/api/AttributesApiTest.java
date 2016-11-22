package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Attribute;
import com.mypurecloud.sdk.model.AttributeEntityListing;
import com.mypurecloud.sdk.model.AttributeQueryRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttributesApi
 */
public class AttributesApiTest {

    private AttributesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AttributesApi.class);
    }

    
    /**
     * Delete an existing Attribute.
     *
     * This will remove attribute.
     */
    @Test
    public void deleteAttributeIdTest() {
        String attributeId = null;
        // Void response = api.deleteAttributeId(attributeId);

        // TODO: test validations
    }
    
    /**
     * Get details about an existing attribute.
     *
     * 
     */
    @Test
    public void getAttributeIdTest() {
        String attributeId = null;
        // Attribute response = api.getAttributeId(attributeId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of existing attributes.
     *
     * 
     */
    @Test
    public void getAttributesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // AttributeEntityListing response = api.getAttributes(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Create an attribute.
     *
     * 
     */
    @Test
    public void postAttributesTest() {
        Attribute body = null;
        // Attribute response = api.postAttributes(body);

        // TODO: test validations
    }
    
    /**
     * Query attributes
     *
     * 
     */
    @Test
    public void postQueryTest() {
        AttributeQueryRequest body = null;
        // AttributeEntityListing response = api.postQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update an existing attribute.
     *
     * Fields that can be updated: name, description. The most recent version is required for updates.
     */
    @Test
    public void putAttributeIdTest() {
        String attributeId = null;
        Attribute body = null;
        // Attribute response = api.putAttributeId(attributeId, body);

        // TODO: test validations
    }
    
}
