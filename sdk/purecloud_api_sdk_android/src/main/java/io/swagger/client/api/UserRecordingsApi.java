package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.UserRecordingEntityListing;
import io.swagger.client.model.UserRecording;
import io.swagger.client.model.DownloadResponse;
import io.swagger.client.model.FaxSummary;

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
  Call<Void> deleteUserrecordingsRecordingId(
    @Path("recordingId") String recordingId
  );

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
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand conversation (optional)
   * @return Call<UserRecording>
   */
  
  @GET("api/v2/userrecordings/{recordingId}")
  Call<UserRecording> getUserrecordingsRecordingId(
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
  Call<DownloadResponse> getUserrecordingsRecordingIdMedia(
    @Path("recordingId") String recordingId, @Query("formatId") String formatId
  );

  /**
   * Get user recording summary
   * 
   * @return Call<FaxSummary>
   */
  
  @GET("api/v2/userrecordings/summary")
  Call<FaxSummary> getUserrecordingsSummary();
    

  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (optional)
   * @param expand conversation (optional)
   * @return Call<UserRecording>
   */
  
  @PUT("api/v2/userrecordings/{recordingId}")
  Call<UserRecording> putUserrecordingsRecordingId(
    @Path("recordingId") String recordingId, @Body UserRecording body, @Query("expand") String expand
  );

}
