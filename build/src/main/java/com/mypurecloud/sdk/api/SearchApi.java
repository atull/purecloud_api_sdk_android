package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.GroupsSearchResponse;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.LocationsSearchResponse;
import com.mypurecloud.sdk.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.model.UsersSearchResponse;
import com.mypurecloud.sdk.model.GroupSearchRequest;
import com.mypurecloud.sdk.model.LocationSearchRequest;
import com.mypurecloud.sdk.model.SearchRequest;
import com.mypurecloud.sdk.model.UserSearchRequest;
import com.mypurecloud.sdk.model.SuggestSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @GET("api/v2/groups/search")
  Call<GroupsSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<LocationsSearchResponse>
   */
  
  @GET("api/v2/locations/search")
  Call<LocationsSearchResponse> getSearch_0(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @GET("api/v2/search")
  Call<JsonNodeSearchResponse> getSearch_1(
    @Query("q64") String q64, @Query("expand") List<String> expand, @Query("profile") Boolean profile
  );

  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @GET("api/v2/users/search")
  Call<UsersSearchResponse> getSearch_2(
    @Query("q64") String q64, @Query("expand") List<String> expand
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
   * @return Call<GroupsSearchResponse>
   */
  
  @POST("api/v2/groups/search")
  Call<GroupsSearchResponse> postSearch(
    @Body GroupSearchRequest body
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @return Call<LocationsSearchResponse>
   */
  
  @POST("api/v2/locations/search")
  Call<LocationsSearchResponse> postSearch_0(
    @Body LocationSearchRequest body
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @POST("api/v2/search")
  Call<JsonNodeSearchResponse> postSearch_1(
    @Body SearchRequest body, @Query("profile") Boolean profile
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @return Call<UsersSearchResponse>
   */
  
  @POST("api/v2/users/search")
  Call<UsersSearchResponse> postSearch_2(
    @Body UserSearchRequest body
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
