package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.model.SearchRequest;
import com.mypurecloud.sdk.model.SuggestSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SuggestApi {
  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @GET("api/v2/search")
  Call<JsonNodeSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand, @Query("profile") Boolean profile
  );

  /**
   * Suggest using q64
   * 
   * @param q64 q64 (required)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @GET("api/v2/search/suggest")
  Call<JsonNodeSearchResponse> getSuggest(
    @Query("q64") String q64, @Query("profile") Boolean profile
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @POST("api/v2/search")
  Call<JsonNodeSearchResponse> postSearch(
    @Body SearchRequest body, @Query("profile") Boolean profile
  );

  /**
   * Suggest
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @POST("api/v2/search/suggest")
  Call<JsonNodeSearchResponse> postSuggest(
    @Body SuggestSearchRequest body, @Query("profile") Boolean profile
  );

}
