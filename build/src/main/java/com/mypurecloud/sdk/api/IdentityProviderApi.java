package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.ADFS;
import com.mypurecloud.sdk.model.CustomerInteractionCenter;
import com.mypurecloud.sdk.model.OAuthProviderEntityListing;
import com.mypurecloud.sdk.model.Okta;
import com.mypurecloud.sdk.model.OneLogin;
import com.mypurecloud.sdk.model.OAuthProvider;
import com.mypurecloud.sdk.model.PureCloud;
import com.mypurecloud.sdk.model.Salesforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IdentityProviderApi {
  /**
   * Delete ADFS Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/adfs")
  Call<Void> deleteAdfs();
    

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/cic")
  Call<Void> deleteCic();
    

  /**
   * Delete Okta Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/okta")
  Call<Void> deleteOkta();
    

  /**
   * Delete OneLogin Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/onelogin")
  Call<Void> deleteOnelogin();
    

  /**
   * Delete an identity provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/{providerId}")
  Call<Void> deleteProviderId();
    

  /**
   * Delete PureCloud Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/purecloud")
  Call<Void> deletePurecloud();
    

  /**
   * Delete Salesforce Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/salesforce")
  Call<Void> deleteSalesforce();
    

  /**
   * Get ADFS Identity Provider
   * 
   * @return Call<ADFS>
   */
  
  @GET("api/v2/identityproviders/adfs")
  Call<ADFS> getAdfs();
    

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Call<CustomerInteractionCenter>
   */
  
  @GET("api/v2/identityproviders/cic")
  Call<CustomerInteractionCenter> getCic();
    

  /**
   * The list of identity providers
   * 
   * @return Call<OAuthProviderEntityListing>
   */
  
  @GET("api/v2/identityproviders")
  Call<OAuthProviderEntityListing> getIdentityproviders();
    

  /**
   * Get Okta Identity Provider
   * 
   * @return Call<Okta>
   */
  
  @GET("api/v2/identityproviders/okta")
  Call<Okta> getOkta();
    

  /**
   * Get OneLogin Identity Provider
   * 
   * @return Call<OneLogin>
   */
  
  @GET("api/v2/identityproviders/onelogin")
  Call<OneLogin> getOnelogin();
    

  /**
   * Get an identity provider
   * 
   * @return Call<OAuthProvider>
   */
  
  @GET("api/v2/identityproviders/{providerId}")
  Call<OAuthProvider> getProviderId();
    

  /**
   * Get PureCloud Identity Provider
   * 
   * @return Call<PureCloud>
   */
  
  @GET("api/v2/identityproviders/purecloud")
  Call<PureCloud> getPurecloud();
    

  /**
   * Get Salesforce Identity Provider
   * 
   * @return Call<Salesforce>
   */
  
  @GET("api/v2/identityproviders/salesforce")
  Call<Salesforce> getSalesforce();
    

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/adfs")
  Call<Void> putAdfs(
    @Body ADFS body
  );

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/cic")
  Call<Void> putCic(
    @Body CustomerInteractionCenter body
  );

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/okta")
  Call<Void> putOkta(
    @Body Okta body
  );

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/onelogin")
  Call<Void> putOnelogin(
    @Body OneLogin body
  );

  /**
   * Update an identity provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/{providerId}")
  Call<Void> putProviderId(
    @Body OAuthProvider body
  );

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/purecloud")
  Call<Void> putPurecloud(
    @Body PureCloud body
  );

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/salesforce")
  Call<Void> putSalesforce(
    @Body Salesforce body
  );

}
