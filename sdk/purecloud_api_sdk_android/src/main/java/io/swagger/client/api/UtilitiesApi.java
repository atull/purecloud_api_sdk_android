package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.ServerDate;
import io.swagger.client.model.TimeZoneEntityListing;
import io.swagger.client.model.ParsedCertificate;
import io.swagger.client.model.Certificate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UtilitiesApi {
  /**
   * Get the current system date/time
   * 
   * @return Call<ServerDate>
   */
  
  @GET("api/v2/date")
  Call<ServerDate> getDate();
    

  /**
   * Get time zones list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<TimeZoneEntityListing>
   */
  
  @GET("api/v2/timezones")
  Call<TimeZoneEntityListing> getTimezones(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param body  (optional)
   * @return Call<ParsedCertificate>
   */
  
  @POST("api/v2/certificate/details")
  Call<ParsedCertificate> postCertificateDetails(
    @Body Certificate body
  );

}
