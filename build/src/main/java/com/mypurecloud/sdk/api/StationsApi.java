package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Station;
import com.mypurecloud.sdk.model.StationEntityListing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StationsApi {
  /**
   * Unassigns the user assigned to this station
   * 
   * @param stationId Station ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/stations/{stationId}/associateduser")
  Call<String> deleteStationIdAssociateduser(
    @Path("stationId") String stationId
  );

  /**
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Call<Station>
   */
  
  @GET("api/v2/stations/{stationId}")
  Call<Station> getStationId(
    @Path("stationId") String stationId
  );

  /**
   * Get the list of available stations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param lineAppearanceId lineAppearanceId (optional)
   * @return Call<StationEntityListing>
   */
  
  @GET("api/v2/stations")
  Call<StationEntityListing> getStations(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("name") String name, @Query("lineAppearanceId") String lineAppearanceId
  );

}
