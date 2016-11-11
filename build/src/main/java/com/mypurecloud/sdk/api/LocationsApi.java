package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Location;
import com.mypurecloud.sdk.model.LocationsSearchResponse;
import com.mypurecloud.sdk.model.LocationSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LocationsApi {
  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @return Call<Location>
   */
  
  @GET("api/v2/locations/{locationId}")
  Call<Location> getLocationId(
    @Path("locationId") String locationId
  );

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @return Call<List<Location>>
   */
  
  @GET("api/v2/locations")
  Call<List<Location>> getLocations(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
  );

  /**
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<LocationsSearchResponse>
   */
  
  @GET("api/v2/locations/search")
  Call<LocationsSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @return Call<LocationsSearchResponse>
   */
  
  @POST("api/v2/locations/search")
  Call<LocationsSearchResponse> postSearch(
    @Body LocationSearchRequest body
  );

}
