package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Location;
import io.swagger.client.model.LocationsSearchResponse;
import io.swagger.client.model.LocationSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LocationsApi {
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
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @return Call<Location>
   */
  
  @GET("api/v2/locations/{locationId}")
  Call<Location> getLocationsLocationId(
    @Path("locationId") String locationId
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
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<LocationsSearchResponse>
   */
  
  @POST("api/v2/locations/search")
  Call<LocationsSearchResponse> postLocationsSearch(
    @Body LocationSearchRequest body
  );

}
