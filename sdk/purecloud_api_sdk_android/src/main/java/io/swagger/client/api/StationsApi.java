package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.StationEntityListing;
import io.swagger.client.model.Station;

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
  Call<String> deleteStationsStationIdAssociateduser(
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

  /**
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Call<Station>
   */
  
  @GET("api/v2/stations/{stationId}")
  Call<Station> getStationsStationId(
    @Path("stationId") String stationId
  );

}
