package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.UserRecording;
import com.mypurecloud.sdk.model.DownloadResponse;
import com.mypurecloud.sdk.model.FaxSummary;
import com.mypurecloud.sdk.model.UserRecordingEntityListing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserRecordingsApi {
  /**
   * Delete a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/userrecordings/{recordingId}")
  Call<Void> deleteRecordingId(
    @Path("recordingId") String recordingId
  );

  /**
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand conversation (optional)
   * @return Call<UserRecording>
   */
  
  @GET("api/v2/userrecordings/{recordingId}")
  Call<UserRecording> getRecordingId(
    @Path("recordingId") String recordingId, @Query("expand") String expand
  );

  /**
   * Download a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return Call<DownloadResponse>
   */
  
  @GET("api/v2/userrecordings/{recordingId}/media")
  Call<DownloadResponse> getRecordingIdMedia(
    @Path("recordingId") String recordingId, @Query("formatId") String formatId
  );

  /**
   * Get user recording summary
   * 
   * @return Call<FaxSummary>
   */
  
  @GET("api/v2/userrecordings/summary")
  Call<FaxSummary> getSummary();
    

  /**
   * Get a list of user recordings.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand conversation (optional)
   * @return Call<UserRecordingEntityListing>
   */
  
  @GET("api/v2/userrecordings")
  Call<UserRecordingEntityListing> getUserrecordings(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("expand") String expand
  );

  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (required)
   * @param expand conversation (optional)
   * @return Call<UserRecording>
   */
  
  @PUT("api/v2/userrecordings/{recordingId}")
  Call<UserRecording> putRecordingId(
    @Path("recordingId") String recordingId, @Body UserRecording body, @Query("expand") String expand
  );

}
