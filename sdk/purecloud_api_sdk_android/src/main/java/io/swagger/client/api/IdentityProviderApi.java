package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.OAuthProviderEntityListing;
import io.swagger.client.model.ADFS;
import io.swagger.client.model.CustomerInteractionCenter;
import io.swagger.client.model.Okta;
import io.swagger.client.model.OneLogin;
import io.swagger.client.model.OAuthProvider;
import io.swagger.client.model.PureCloud;
import io.swagger.client.model.Salesforce;

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
  Call<Void> deleteIdentityprovidersAdfs();
    

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/cic")
  Call<Void> deleteIdentityprovidersCic();
    

  /**
   * Delete Okta Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/okta")
  Call<Void> deleteIdentityprovidersOkta();
    

  /**
   * Delete OneLogin Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/onelogin")
  Call<Void> deleteIdentityprovidersOnelogin();
    

  /**
   * Delete an identity provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/{providerId}")
  Call<Void> deleteIdentityprovidersProviderId();
    

  /**
   * Delete PureCloud Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/purecloud")
  Call<Void> deleteIdentityprovidersPurecloud();
    

  /**
   * Delete Salesforce Identity Provider
   * 
   * @return Call<Void>
   */
  
  @DELETE("api/v2/identityproviders/salesforce")
  Call<Void> deleteIdentityprovidersSalesforce();
    

  /**
   * The list of identity providers
   * 
   * @return Call<OAuthProviderEntityListing>
   */
  
  @GET("api/v2/identityproviders")
  Call<OAuthProviderEntityListing> getIdentityproviders();
    

  /**
   * Get ADFS Identity Provider
   * 
   * @return Call<ADFS>
   */
  
  @GET("api/v2/identityproviders/adfs")
  Call<ADFS> getIdentityprovidersAdfs();
    

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Call<CustomerInteractionCenter>
   */
  
  @GET("api/v2/identityproviders/cic")
  Call<CustomerInteractionCenter> getIdentityprovidersCic();
    

  /**
   * Get Okta Identity Provider
   * 
   * @return Call<Okta>
   */
  
  @GET("api/v2/identityproviders/okta")
  Call<Okta> getIdentityprovidersOkta();
    

  /**
   * Get OneLogin Identity Provider
   * 
   * @return Call<OneLogin>
   */
  
  @GET("api/v2/identityproviders/onelogin")
  Call<OneLogin> getIdentityprovidersOnelogin();
    

  /**
   * Get an identity provider
   * 
   * @return Call<OAuthProvider>
   */
  
  @GET("api/v2/identityproviders/{providerId}")
  Call<OAuthProvider> getIdentityprovidersProviderId();
    

  /**
   * Get PureCloud Identity Provider
   * 
   * @return Call<PureCloud>
   */
  
  @GET("api/v2/identityproviders/purecloud")
  Call<PureCloud> getIdentityprovidersPurecloud();
    

  /**
   * Get Salesforce Identity Provider
   * 
   * @return Call<Salesforce>
   */
  
  @GET("api/v2/identityproviders/salesforce")
  Call<Salesforce> getIdentityprovidersSalesforce();
    

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/adfs")
  Call<Void> putIdentityprovidersAdfs(
    @Body ADFS body
  );

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/cic")
  Call<Void> putIdentityprovidersCic(
    @Body CustomerInteractionCenter body
  );

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/okta")
  Call<Void> putIdentityprovidersOkta(
    @Body Okta body
  );

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/onelogin")
  Call<Void> putIdentityprovidersOnelogin(
    @Body OneLogin body
  );

  /**
   * Update an identity provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/{providerId}")
  Call<Void> putIdentityprovidersProviderId(
    @Body OAuthProvider body
  );

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/purecloud")
  Call<Void> putIdentityprovidersPurecloud(
    @Body PureCloud body
  );

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (optional)
   * @return Call<Void>
   */
  
  @PUT("api/v2/identityproviders/salesforce")
  Call<Void> putIdentityprovidersSalesforce(
    @Body Salesforce body
  );

}
