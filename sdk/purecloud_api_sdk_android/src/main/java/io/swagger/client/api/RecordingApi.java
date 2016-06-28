package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.OrphanRecording;
import io.swagger.client.model.Recording;
import io.swagger.client.model.Annotation;
import io.swagger.client.model.OrphanRecordingListing;
import io.swagger.client.model.PolicyEntityListing;
import io.swagger.client.model.Policy;
import io.swagger.client.model.RecordingSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecordingApi {
  /**
   * Delete annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}")
  Call<Void> deleteConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Path("annotationId") String annotationId
  );

  /**
   *  deletes a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return Call<OrphanRecording>
   */
  
  @DELETE("api/v2/orphanrecordings/{orphanId}")
  Call<OrphanRecording> deleteOrphanrecordingsOrphanId(
    @Path("orphanId") String orphanId
  );

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/recording/mediaretentionpolicies")
  Call<String> deleteRecordingMediaretentionpolicies(
    @Query("ids") String ids
  );

  /**
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/recording/mediaretentionpolicies/{policyId}")
  Call<String> deleteRecordingMediaretentionpoliciesPolicyId(
    @Path("policyId") String policyId
  );

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @param conversationId Conversation ID (required)
   * @param maxWaitMs The maximum number of milliseconds to wait for the recording to be ready. (optional, default to 5000)
   * @param formatId The desired media format (optional, default to WEBM)
   * @return Call<List<Recording>>
   */
  
  @GET("api/v2/conversations/{conversationId}/recordings")
  Call<List<Recording>> getConversationsConversationIdRecordings(
    @Path("conversationId") String conversationId, @Query("maxWaitMs") Integer maxWaitMs, @Query("formatId") String formatId
  );

  /**
   * Gets a specific recording.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @return Call<Void>
   */
  
  @GET("api/v2/conversations/{conversationId}/recordings/{recordingId}")
  Call<Void> getConversationsConversationIdRecordingsRecordingId(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Query("formatId") String formatId, @Query("download") Boolean download, @Query("fileName") String fileName
  );

  /**
   * Get annotations for recording
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return Call<List<Annotation>>
   */
  
  @GET("api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations")
  Call<List<Annotation>> getConversationsConversationIdRecordingsRecordingIdAnnotations(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId
  );

  /**
   * Get annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Call<Annotation>
   */
  
  @GET("api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}")
  Call<Annotation> getConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Path("annotationId") String annotationId
  );

  /**
   * Gets all orphan recordings
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return Call<OrphanRecordingListing>
   */
  
  @GET("api/v2/orphanrecordings")
  Call<OrphanRecordingListing> getOrphanrecordings(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage
  );

  /**
   * Gets a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return Call<OrphanRecording>
   */
  
  @GET("api/v2/orphanrecordings/{orphanId}")
  Call<OrphanRecording> getOrphanrecordingsOrphanId(
    @Path("orphanId") String orphanId
  );

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @return Call<PolicyEntityListing>
   */
  
  @GET("api/v2/recording/mediaretentionpolicies")
  Call<PolicyEntityListing> getRecordingMediaretentionpolicies(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("name") String name, @Query("enabled") Boolean enabled, @Query("summary") Boolean summary, @Query("hasErrors") Boolean hasErrors
  );

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Call<Policy>
   */
  
  @GET("api/v2/recording/mediaretentionpolicies/{policyId}")
  Call<Policy> getRecordingMediaretentionpoliciesPolicyId(
    @Path("policyId") String policyId
  );

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param createDefault If no settings are found, a new one is created with default values (optional, default to false)
   * @return Call<RecordingSettings>
   */
  
  @GET("api/v2/recording/settings")
  Call<RecordingSettings> getRecordingSettings(
    @Query("createDefault") Boolean createDefault
  );

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (optional)
   * @return Call<Policy>
   */
  
  @PATCH("api/v2/recording/mediaretentionpolicies/{policyId}")
  Call<Policy> patchRecordingMediaretentionpoliciesPolicyId(
    @Path("policyId") String policyId, @Body Policy body
  );

  /**
   * Create annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body annotation (optional)
   * @return Call<Annotation>
   */
  
  @POST("api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations")
  Call<Annotation> postConversationsConversationIdRecordingsRecordingIdAnnotations(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Body Annotation body
  );

  /**
   * Create media retention policy
   * 
   * @param body Policy (optional)
   * @return Call<Policy>
   */
  
  @POST("api/v2/recording/mediaretentionpolicies")
  Call<Policy> postRecordingMediaretentionpolicies(
    @Body Policy body
  );

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. Use of the query parameter &#39;restoreDays&#39; is deprecated and will be removed in the next major version release. If &#39;restoreDays&#39; is provided, no attempt at updating other retention data will be made. To migrate to the new usage, issuing a request with restoreDays&#x3D;10 would instead set the archiveDate&#39;s time stamp in the PUT body to 10 days in the future.
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body recording (required)
   * @return Call<Void>
   */
  
  @PUT("api/v2/conversations/{conversationId}/recordings/{recordingId}")
  Call<Void> putConversationsConversationIdRecordingsRecordingId(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Body Recording body
  );

  /**
   * Update annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @param body annotation (optional)
   * @return Call<Annotation>
   */
  
  @PUT("api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}")
  Call<Annotation> putConversationsConversationIdRecordingsRecordingIdAnnotationsAnnotationId(
    @Path("conversationId") String conversationId, @Path("recordingId") String recordingId, @Path("annotationId") String annotationId, @Body Annotation body
  );

  /**
   * Update a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (optional)
   * @return Call<Policy>
   */
  
  @PUT("api/v2/recording/mediaretentionpolicies/{policyId}")
  Call<Policy> putRecordingMediaretentionpoliciesPolicyId(
    @Path("policyId") String policyId, @Body Policy body
  );

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param body  (optional)
   * @return Call<RecordingSettings>
   */
  
  @PUT("api/v2/recording/settings")
  Call<RecordingSettings> putRecordingSettings(
    @Body RecordingSettings body
  );

}
