package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.GroupsSearchResponse;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LocationsSearchResponse;
import io.swagger.client.model.JsonNodeSearchResponse;
import io.swagger.client.model.UsersSearchResponse;
import io.swagger.client.model.GroupSearchRequest;
import io.swagger.client.model.LocationSearchRequest;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SuggestSearchRequest;
import io.swagger.client.model.UserSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApi {
  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @GET("api/v2/groups/search")
  Call<GroupsSearchResponse> getGroupsSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @return Call<LocationsSearchResponse>
   */
  
  @GET("api/v2/locations/search")
  Call<LocationsSearchResponse> getLocationsSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @param profile  (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @GET("api/v2/search")
  Call<JsonNodeSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand, @Query("profile") Boolean profile
  );

  /**
   * Suggest using q64
   * 
   * @param q64  (required)
   * @param profile  (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @GET("api/v2/search/suggest")
  Call<JsonNodeSearchResponse> getSearchSuggest(
    @Query("q64") String q64, @Query("profile") Boolean profile
  );

  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @GET("api/v2/users/search")
  Call<UsersSearchResponse> getUsersSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @POST("api/v2/groups/search")
  Call<GroupsSearchResponse> postGroupsSearch(
    @Body GroupSearchRequest body
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<LocationsSearchResponse>
   */
  
  @POST("api/v2/locations/search")
  Call<LocationsSearchResponse> postLocationsSearch(
    @Body LocationSearchRequest body
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @param profile  (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @POST("api/v2/search")
  Call<JsonNodeSearchResponse> postSearch(
    @Body SearchRequest body, @Query("profile") Boolean profile
  );

  /**
   * Suggest
   * 
   * @param body Search request options (optional)
   * @param profile  (optional, default to true)
   * @return Call<JsonNodeSearchResponse>
   */
  
  @POST("api/v2/search/suggest")
  Call<JsonNodeSearchResponse> postSearchSuggest(
    @Body SuggestSearchRequest body, @Query("profile") Boolean profile
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<UsersSearchResponse>
   */
  
  @POST("api/v2/users/search")
  Call<UsersSearchResponse> postUsersSearch(
    @Body UserSearchRequest body
  );

}
