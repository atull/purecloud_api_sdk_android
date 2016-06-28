package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Organization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrganizationApi {
  /**
   * Get organization.
   * 
   * @return Call<Organization>
   */
  
  @GET("api/v2/organizations/me")
  Call<Organization> getOrganizationsMe();
    

}
