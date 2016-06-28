package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AttributeEntityListing;
import io.swagger.client.model.Attribute;
import io.swagger.client.model.AttributeQueryRequest;
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
    public void deleteAttributesAttributeIdTest() {
        String attributeId = null;
        // Void response = api.deleteAttributesAttributeId(attributeId);

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
     * Get details about an existing attribute.
     *
     * 
     */
    @Test
    public void getAttributesAttributeIdTest() {
        String attributeId = null;
        // Attribute response = api.getAttributesAttributeId(attributeId);

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
    public void postAttributesQueryTest() {
        AttributeQueryRequest body = null;
        // AttributeEntityListing response = api.postAttributesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update an existing attribute.
     *
     * Fields that can be updated: name, description. The most recent version is required for updates.
     */
    @Test
    public void putAttributesAttributeIdTest() {
        String attributeId = null;
        Attribute body = null;
        // Attribute response = api.putAttributesAttributeId(attributeId, body);

        // TODO: test validations
    }
    
}
