package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.AnalyticsConversation;
import com.mypurecloud.sdk.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.model.ReportMetaData;
import com.mypurecloud.sdk.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.model.ReportSchedule;
import com.mypurecloud.sdk.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.model.ReportRunEntry;
import com.mypurecloud.sdk.model.AggregationQuery;
import com.mypurecloud.sdk.model.AggregateQueryResponse;
import com.mypurecloud.sdk.model.PropertyIndexRequest;
import com.mypurecloud.sdk.model.ConversationQuery;
import com.mypurecloud.sdk.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.model.ObservationQuery;
import com.mypurecloud.sdk.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.model.RunNowResponse;
import com.mypurecloud.sdk.model.PresenceQueryResponse;
import com.mypurecloud.sdk.model.ObservationQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AnalyticsApi {
  /**
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/analytics/reporting/schedules/{scheduleId}")
  Call<String> deleteReportingSchedulesScheduleId(
    @Path("scheduleId") String scheduleId
  );

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return Call<AnalyticsConversation>
   */
  
  @GET("api/v2/analytics/conversations/{conversationId}/details")
  Call<AnalyticsConversation> getConversationsConversationIdDetails(
    @Path("conversationId") String conversationId
  );

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return Call<ReportMetaDataEntityListing>
   */
  
  @GET("api/v2/analytics/reporting/metadata")
  Call<ReportMetaDataEntityListing> getReportingMetadata(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("locale") String locale
  );

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return Call<ReportMetaData>
   */
  
  @GET("api/v2/analytics/reporting/{reportId}/metadata")
  Call<ReportMetaData> getReportingReportIdMetadata(
    @Path("reportId") String reportId, @Query("locale") String locale
  );

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return Call<List<String>>
   */
  
  @GET("api/v2/analytics/reporting/reportformats")
  Call<List<String>> getReportingReportformats();
    

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<ReportScheduleEntityListing>
   */
  
  @GET("api/v2/analytics/reporting/schedules")
  Call<ReportScheduleEntityListing> getReportingSchedules(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<ReportSchedule>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}")
  Call<ReportSchedule> getReportingSchedulesScheduleId(
    @Path("scheduleId") String scheduleId
  );

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return Call<ReportRunEntryEntityDomainListing>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}/history")
  Call<ReportRunEntryEntityDomainListing> getReportingSchedulesScheduleIdHistory(
    @Path("scheduleId") String scheduleId, @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<ReportRunEntry>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}/history/latest")
  Call<ReportRunEntry> getReportingSchedulesScheduleIdHistoryLatest(
    @Path("scheduleId") String scheduleId
  );

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return Call<ReportRunEntry>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId}")
  Call<ReportRunEntry> getReportingSchedulesScheduleIdHistoryRunId(
    @Path("runId") String runId, @Path("scheduleId") String scheduleId
  );

  /**
   * Get a list of report time periods.
   * 
   * @return Call<List<String>>
   */
  
  @GET("api/v2/analytics/reporting/timeperiods")
  Call<List<String>> getReportingTimeperiods();
    

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/aggregates/query")
  Call<AggregateQueryResponse> postConversationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return Call<PropertyIndexRequest>
   */
  
  @POST("api/v2/analytics/conversations/{conversationId}/details/properties")
  Call<PropertyIndexRequest> postConversationsConversationIdDetailsProperties(
    @Path("conversationId") String conversationId, @Body PropertyIndexRequest body
  );

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return Call<AnalyticsConversationQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/details/query")
  Call<AnalyticsConversationQueryResponse> postConversationsDetailsQuery(
    @Body ConversationQuery body
  );

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/evaluations/aggregates/query")
  Call<AggregateQueryResponse> postEvaluationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return Call<QualifierMappingObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/queues/observations/query")
  Call<QualifierMappingObservationQueryResponse> postQueuesObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return Call<ReportSchedule>
   */
  
  @POST("api/v2/analytics/reporting/schedules")
  Call<ReportSchedule> postReportingSchedules(
    @Body ReportSchedule body
  );

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<RunNowResponse>
   */
  
  @POST("api/v2/analytics/reporting/schedules/{scheduleId}/runreport")
  Call<RunNowResponse> postReportingSchedulesScheduleIdRunreport(
    @Path("scheduleId") String scheduleId
  );

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return Call<PresenceQueryResponse>
   */
  
  @POST("api/v2/analytics/users/aggregates/query")
  Call<PresenceQueryResponse> postUsersAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/users/observations/query")
  Call<ObservationQueryResponse> postUsersObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return Call<ReportSchedule>
   */
  
  @PUT("api/v2/analytics/reporting/schedules/{scheduleId}")
  Call<ReportSchedule> putReportingSchedulesScheduleId(
    @Path("scheduleId") String scheduleId, @Body ReportSchedule body
  );

}
