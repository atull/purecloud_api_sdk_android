package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.ADFS;
import com.mypurecloud.sdk.model.CustomerInteractionCenter;
import com.mypurecloud.sdk.model.OAuthProviderEntityListing;
import com.mypurecloud.sdk.model.Okta;
import com.mypurecloud.sdk.model.OneLogin;
import com.mypurecloud.sdk.model.OAuthProvider;
import com.mypurecloud.sdk.model.PureCloud;
import com.mypurecloud.sdk.model.Salesforce;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentityProviderApi
 */
public class IdentityProviderApiTest {

    private IdentityProviderApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IdentityProviderApi.class);
    }

    
    /**
     * Delete ADFS Identity Provider
     *
     * 
     */
    @Test
    public void deleteAdfsTest() {
        // Void response = api.deleteAdfs();

        // TODO: test validations
    }
    
    /**
     * Delete Customer Interaction Center (CIC) Identity Provider
     *
     * 
     */
    @Test
    public void deleteCicTest() {
        // Void response = api.deleteCic();

        // TODO: test validations
    }
    
    /**
     * Delete Okta Identity Provider
     *
     * 
     */
    @Test
    public void deleteOktaTest() {
        // Void response = api.deleteOkta();

        // TODO: test validations
    }
    
    /**
     * Delete OneLogin Identity Provider
     *
     * 
     */
    @Test
    public void deleteOneloginTest() {
        // Void response = api.deleteOnelogin();

        // TODO: test validations
    }
    
    /**
     * Delete an identity provider
     *
     * 
     */
    @Test
    public void deleteProviderIdTest() {
        // Void response = api.deleteProviderId();

        // TODO: test validations
    }
    
    /**
     * Delete PureCloud Identity Provider
     *
     * 
     */
    @Test
    public void deletePurecloudTest() {
        // Void response = api.deletePurecloud();

        // TODO: test validations
    }
    
    /**
     * Delete Salesforce Identity Provider
     *
     * 
     */
    @Test
    public void deleteSalesforceTest() {
        // Void response = api.deleteSalesforce();

        // TODO: test validations
    }
    
    /**
     * Get ADFS Identity Provider
     *
     * 
     */
    @Test
    public void getAdfsTest() {
        // ADFS response = api.getAdfs();

        // TODO: test validations
    }
    
    /**
     * Get Customer Interaction Center (CIC) Identity Provider
     *
     * 
     */
    @Test
    public void getCicTest() {
        // CustomerInteractionCenter response = api.getCic();

        // TODO: test validations
    }
    
    /**
     * The list of identity providers
     *
     * 
     */
    @Test
    public void getIdentityprovidersTest() {
        // OAuthProviderEntityListing response = api.getIdentityproviders();

        // TODO: test validations
    }
    
    /**
     * Get Okta Identity Provider
     *
     * 
     */
    @Test
    public void getOktaTest() {
        // Okta response = api.getOkta();

        // TODO: test validations
    }
    
    /**
     * Get OneLogin Identity Provider
     *
     * 
     */
    @Test
    public void getOneloginTest() {
        // OneLogin response = api.getOnelogin();

        // TODO: test validations
    }
    
    /**
     * Get an identity provider
     *
     * 
     */
    @Test
    public void getProviderIdTest() {
        // OAuthProvider response = api.getProviderId();

        // TODO: test validations
    }
    
    /**
     * Get PureCloud Identity Provider
     *
     * 
     */
    @Test
    public void getPurecloudTest() {
        // PureCloud response = api.getPurecloud();

        // TODO: test validations
    }
    
    /**
     * Get Salesforce Identity Provider
     *
     * 
     */
    @Test
    public void getSalesforceTest() {
        // Salesforce response = api.getSalesforce();

        // TODO: test validations
    }
    
    /**
     * Update/Create ADFS Identity Provider
     *
     * 
     */
    @Test
    public void putAdfsTest() {
        ADFS body = null;
        // Void response = api.putAdfs(body);

        // TODO: test validations
    }
    
    /**
     * Update/Create Customer Interaction Center (CIC) Identity Provider
     *
     * 
     */
    @Test
    public void putCicTest() {
        CustomerInteractionCenter body = null;
        // Void response = api.putCic(body);

        // TODO: test validations
    }
    
    /**
     * Update/Create Okta Identity Provider
     *
     * 
     */
    @Test
    public void putOktaTest() {
        Okta body = null;
        // Void response = api.putOkta(body);

        // TODO: test validations
    }
    
    /**
     * Update/Create OneLogin Identity Provider
     *
     * 
     */
    @Test
    public void putOneloginTest() {
        OneLogin body = null;
        // Void response = api.putOnelogin(body);

        // TODO: test validations
    }
    
    /**
     * Update an identity provider
     *
     * 
     */
    @Test
    public void putProviderIdTest() {
        OAuthProvider body = null;
        // Void response = api.putProviderId(body);

        // TODO: test validations
    }
    
    /**
     * Update/Create PureCloud Identity Provider
     *
     * 
     */
    @Test
    public void putPurecloudTest() {
        PureCloud body = null;
        // Void response = api.putPurecloud(body);

        // TODO: test validations
    }
    
    /**
     * Update/Create Salesforce Identity Provider
     *
     * 
     */
    @Test
    public void putSalesforceTest() {
        Salesforce body = null;
        // Void response = api.putSalesforce(body);

        // TODO: test validations
    }
    
}
