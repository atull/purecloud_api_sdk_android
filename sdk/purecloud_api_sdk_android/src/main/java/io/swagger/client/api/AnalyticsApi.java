package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AnalyticsConversation;
import io.swagger.client.model.ReportMetaDataEntityListing;
import io.swagger.client.model.ReportMetaData;
import io.swagger.client.model.ReportScheduleEntityListing;
import io.swagger.client.model.ReportSchedule;
import io.swagger.client.model.ReportRunEntryEntityDomainListing;
import io.swagger.client.model.ReportRunEntry;
import io.swagger.client.model.AggregationQuery;
import io.swagger.client.model.AggregateQueryResponse;
import io.swagger.client.model.PropertyIndexRequest;
import io.swagger.client.model.ConversationQuery;
import io.swagger.client.model.AnalyticsConversationQueryResponse;
import io.swagger.client.model.ObservationQuery;
import io.swagger.client.model.ObservationQueryResponse;
import io.swagger.client.model.RunNowResponse;
import io.swagger.client.model.PresenceQueryResponse;

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
  Call<String> deleteAnalyticsReportingSchedulesScheduleId(
    @Path("scheduleId") String scheduleId
  );

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return Call<AnalyticsConversation>
   */
  
  @GET("api/v2/analytics/conversations/{conversationId}/details")
  Call<AnalyticsConversation> getAnalyticsConversationsConversationIdDetails(
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
  Call<ReportMetaDataEntityListing> getAnalyticsReportingMetadata(
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
  Call<ReportMetaData> getAnalyticsReportingReportIdMetadata(
    @Path("reportId") String reportId, @Query("locale") String locale
  );

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return Call<List<String>>
   */
  
  @GET("api/v2/analytics/reporting/reportformats")
  Call<List<String>> getAnalyticsReportingReportformats();
    

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<ReportScheduleEntityListing>
   */
  
  @GET("api/v2/analytics/reporting/schedules")
  Call<ReportScheduleEntityListing> getAnalyticsReportingSchedules(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<ReportSchedule>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}")
  Call<ReportSchedule> getAnalyticsReportingSchedulesScheduleId(
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
  Call<ReportRunEntryEntityDomainListing> getAnalyticsReportingSchedulesScheduleIdHistory(
    @Path("scheduleId") String scheduleId, @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<ReportRunEntry>
   */
  
  @GET("api/v2/analytics/reporting/schedules/{scheduleId}/history/latest")
  Call<ReportRunEntry> getAnalyticsReportingSchedulesScheduleIdHistoryLatest(
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
  Call<ReportRunEntry> getAnalyticsReportingSchedulesScheduleIdHistoryRunId(
    @Path("runId") String runId, @Path("scheduleId") String scheduleId
  );

  /**
   * Get a list of report time periods.
   * 
   * @return Call<List<String>>
   */
  
  @GET("api/v2/analytics/reporting/timeperiods")
  Call<List<String>> getAnalyticsReportingTimeperiods();
    

  /**
   * Query for conversation aggregates
   * 
   * @param body query (optional)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/aggregates/query")
  Call<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (optional)
   * @return Call<PropertyIndexRequest>
   */
  
  @POST("api/v2/analytics/conversations/{conversationId}/details/properties")
  Call<PropertyIndexRequest> postAnalyticsConversationsConversationIdDetailsProperties(
    @Path("conversationId") String conversationId, @Body PropertyIndexRequest body
  );

  /**
   * Query for conversation details
   * 
   * @param body query (optional)
   * @return Call<AnalyticsConversationQueryResponse>
   */
  
  @POST("api/v2/analytics/conversations/details/query")
  Call<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(
    @Body ConversationQuery body
  );

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (optional)
   * @return Call<AggregateQueryResponse>
   */
  
  @POST("api/v2/analytics/evaluations/aggregates/query")
  Call<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for queue observations
   * 
   * @param body query (optional)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/queues/observations/query")
  Call<ObservationQueryResponse> postAnalyticsQueuesObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (optional)
   * @return Call<ReportSchedule>
   */
  
  @POST("api/v2/analytics/reporting/schedules")
  Call<ReportSchedule> postAnalyticsReportingSchedules(
    @Body ReportSchedule body
  );

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return Call<RunNowResponse>
   */
  
  @POST("api/v2/analytics/reporting/schedules/{scheduleId}/runreport")
  Call<RunNowResponse> postAnalyticsReportingSchedulesScheduleIdRunreport(
    @Path("scheduleId") String scheduleId
  );

  /**
   * Query for user aggregates
   * 
   * @param body query (optional)
   * @return Call<PresenceQueryResponse>
   */
  
  @POST("api/v2/analytics/users/aggregates/query")
  Call<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(
    @Body AggregationQuery body
  );

  /**
   * Query for user observations
   * 
   * @param body query (optional)
   * @return Call<ObservationQueryResponse>
   */
  
  @POST("api/v2/analytics/users/observations/query")
  Call<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(
    @Body ObservationQuery body
  );

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (optional)
   * @return Call<ReportSchedule>
   */
  
  @PUT("api/v2/analytics/reporting/schedules/{scheduleId}")
  Call<ReportSchedule> putAnalyticsReportingSchedulesScheduleId(
    @Path("scheduleId") String scheduleId, @Body ReportSchedule body
  );

}
