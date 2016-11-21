package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.CaseEntityListing;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.ModelCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CasesApi {
  /**
   * Gets a list of existing cases.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<CaseEntityListing>
   */
  
  @GET("api/v2/cases")
  Call<CaseEntityListing> getCases(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Create a new case
   * 
   * @param body CaseCreate (required)
   * @return Call<ModelCase>
   */
  
  @POST("api/v2/cases")
  Call<ModelCase> postCases(
    @Body ModelCase body
  );

}
