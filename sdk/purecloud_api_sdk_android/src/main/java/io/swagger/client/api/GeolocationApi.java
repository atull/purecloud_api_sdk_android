package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.GeolocationSettings;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Geolocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GeolocationApi {
  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @return Call<GeolocationSettings>
   */
  
  @GET("api/v2/geolocations/settings")
  Call<GeolocationSettings> getGeolocationsSettings();
    

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Call<Geolocation>
   */
  
  @GET("api/v2/users/{userId}/geolocations/{clientId}")
  Call<Geolocation> getUsersUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId
  );

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param body  (optional)
   * @return Call<GeolocationSettings>
   */
  
  @PATCH("api/v2/geolocations/settings")
  Call<GeolocationSettings> patchGeolocationsSettings(
    @Body GeolocationSettings body
  );

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body  (optional)
   * @return Call<Geolocation>
   */
  
  @PATCH("api/v2/users/{userId}/geolocations/{clientId}")
  Call<Geolocation> patchUsersUserIdGeolocationsClientId(
    @Path("userId") String userId, @Path("clientId") String clientId, @Body Geolocation body
  );

}
