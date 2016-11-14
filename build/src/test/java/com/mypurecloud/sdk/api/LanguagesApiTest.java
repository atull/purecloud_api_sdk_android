package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Language;
import com.mypurecloud.sdk.model.LanguageEntityListing;
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
    public void deleteLanguageIdTest() {
        String languageId = null;
        // Void response = api.deleteLanguageId(languageId);

        // TODO: test validations
    }
    
    /**
     * Get language
     *
     * 
     */
    @Test
    public void getLanguageIdTest() {
        String languageId = null;
        // Language response = api.getLanguageId(languageId);

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
    public void putLanguageIdTest() {
        String languageId = null;
        Language body = null;
        // Language response = api.putLanguageId(languageId, body);

        // TODO: test validations
    }
    
}
