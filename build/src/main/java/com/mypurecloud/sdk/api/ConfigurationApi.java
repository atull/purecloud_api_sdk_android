package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.VirtualEdgeSetupPackage;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.model.KeyRotationSchedule;
import com.mypurecloud.sdk.model.EncryptionKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConfigurationApi {
  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<VirtualEdgeSetupPackage>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/setuppackage")
  Call<VirtualEdgeSetupPackage> getProvidersEdgesEdgeIdSetuppackage(
    @Path("edgeId") String edgeId
  );

  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<EncryptionKeyEntityListing>
   */
  
  @GET("api/v2/recording/recordingkeys")
  Call<EncryptionKeyEntityListing> getRecordingkeys(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get key rotation schedule
   * 
   * @return Call<KeyRotationSchedule>
   */
  
  @GET("api/v2/recording/recordingkeys/rotationschedule")
  Call<KeyRotationSchedule> getRecordingkeysRotationschedule();
    

  /**
   * Create encryption key
   * 
   * @return Call<EncryptionKey>
   */
  
  @POST("api/v2/recording/recordingkeys")
  Call<EncryptionKey> postRecordingkeys();
    

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (required)
   * @return Call<KeyRotationSchedule>
   */
  
  @PUT("api/v2/recording/recordingkeys/rotationschedule")
  Call<KeyRotationSchedule> putRecordingkeysRotationschedule(
    @Body KeyRotationSchedule body
  );

}
