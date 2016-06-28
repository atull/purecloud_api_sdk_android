package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.EncryptionKeyEntityListing;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.KeyRotationSchedule;
import io.swagger.client.model.EncryptionKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConfigurationApi {
  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<EncryptionKeyEntityListing>
   */
  
  @GET("api/v2/recording/recordingkeys")
  Call<EncryptionKeyEntityListing> getRecordingRecordingkeys(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get key rotation schedule
   * 
   * @return Call<KeyRotationSchedule>
   */
  
  @GET("api/v2/recording/recordingkeys/rotationschedule")
  Call<KeyRotationSchedule> getRecordingRecordingkeysRotationschedule();
    

  /**
   * Create encryption key
   * 
   * @return Call<EncryptionKey>
   */
  
  @POST("api/v2/recording/recordingkeys")
  Call<EncryptionKey> postRecordingRecordingkeys();
    

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (optional)
   * @return Call<KeyRotationSchedule>
   */
  
  @PUT("api/v2/recording/recordingkeys/rotationschedule")
  Call<KeyRotationSchedule> putRecordingRecordingkeysRotationschedule(
    @Body KeyRotationSchedule body
  );

}
