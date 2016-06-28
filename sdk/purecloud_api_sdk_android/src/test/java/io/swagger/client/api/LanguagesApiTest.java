package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LanguageEntityListing;
import io.swagger.client.model.Language;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LanguagesApi
 */
public class LanguagesApiTest {

    private LanguagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LanguagesApi.class);
    }

    
    /**
     * Delete Language
     *
     * 
     */
    @Test
    public void deleteLanguagesLanguageIdTest() {
        String languageId = null;
        // Void response = api.deleteLanguagesLanguageId(languageId);

        // TODO: test validations
    }
    
    /**
     * Get the list of supported languages.
     *
     * 
     */
    @Test
    public void getLanguagesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortOrder = null;
        String name = null;
        // LanguageEntityListing response = api.getLanguages(pageSize, pageNumber, sortOrder, name);

        // TODO: test validations
    }
    
    /**
     * Get language
     *
     * 
     */
    @Test
    public void getLanguagesLanguageIdTest() {
        String languageId = null;
        // Language response = api.getLanguagesLanguageId(languageId);

        // TODO: test validations
    }
    
    /**
     * Create Language
     *
     * 
     */
    @Test
    public void postLanguagesTest() {
        Language body = null;
        // Language response = api.postLanguages(body);

        // TODO: test validations
    }
    
    /**
     * Update Language
     *
     * 
     */
    @Test
    public void putLanguagesLanguageIdTest() {
        String languageId = null;
        Language body = null;
        // Language response = api.putLanguagesLanguageId(languageId, body);

        // TODO: test validations
    }
    
}
