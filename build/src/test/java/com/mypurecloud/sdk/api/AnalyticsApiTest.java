package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
public class AnalyticsApiTest {

    private AnalyticsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AnalyticsApi.class);
    }

    
    /**
     * Delete a scheduled report job.
     *
     * 
     */
    @Test
    public void deleteReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        // String response = api.deleteReportingSchedulesScheduleId(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get a conversation by id
     *
     * 
     */
    @Test
    public void getConversationsConversationIdDetailsTest() {
        String conversationId = null;
        // AnalyticsConversation response = api.getConversationsConversationIdDetails(conversationId);

        // TODO: test validations
    }
    
    /**
     * Get list of reporting metadata.
     *
     * 
     */
    @Test
    public void getReportingMetadataTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String locale = null;
        // ReportMetaDataEntityListing response = api.getReportingMetadata(pageNumber, pageSize, locale);

        // TODO: test validations
    }
    
    /**
     * Get a reporting metadata.
     *
     * 
     */
    @Test
    public void getReportingReportIdMetadataTest() {
        String reportId = null;
        String locale = null;
        // ReportMetaData response = api.getReportingReportIdMetadata(reportId, locale);

        // TODO: test validations
    }
    
    /**
     * Get a list of report formats
     *
     * Get a list of report formats.
     */
    @Test
    public void getReportingReportformatsTest() {
        // List<String> response = api.getReportingReportformats();

        // TODO: test validations
    }
    
    /**
     * Get a list of scheduled report jobs
     *
     * Get a list of scheduled report jobs.
     */
    @Test
    public void getReportingSchedulesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // ReportScheduleEntityListing response = api.getReportingSchedules(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a scheduled report job.
     *
     * 
     */
    @Test
    public void getReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        // ReportSchedule response = api.getReportingSchedulesScheduleId(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get list of completed scheduled report jobs.
     *
     * 
     */
    @Test
    public void getReportingSchedulesScheduleIdHistoryTest() {
        String scheduleId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        // ReportRunEntryEntityDomainListing response = api.getReportingSchedulesScheduleIdHistory(scheduleId, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get most recently completed scheduled report job.
     *
     * 
     */
    @Test
    public void getReportingSchedulesScheduleIdHistoryLatestTest() {
        String scheduleId = null;
        // ReportRunEntry response = api.getReportingSchedulesScheduleIdHistoryLatest(scheduleId);

        // TODO: test validations
    }
    
    /**
     * A completed scheduled report job
     *
     * A completed scheduled report job.
     */
    @Test
    public void getReportingSchedulesScheduleIdHistoryRunIdTest() {
        String runId = null;
        String scheduleId = null;
        // ReportRunEntry response = api.getReportingSchedulesScheduleIdHistoryRunId(runId, scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get a list of report time periods.
     *
     * 
     */
    @Test
    public void getReportingTimeperiodsTest() {
        // List<String> response = api.getReportingTimeperiods();

        // TODO: test validations
    }
    
    /**
     * Query for conversation aggregates
     *
     * 
     */
    @Test
    public void postConversationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postConversationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Index conversation properties
     *
     * 
     */
    @Test
    public void postConversationsConversationIdDetailsPropertiesTest() {
        String conversationId = null;
        PropertyIndexRequest body = null;
        // PropertyIndexRequest response = api.postConversationsConversationIdDetailsProperties(conversationId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation details
     *
     * 
     */
    @Test
    public void postConversationsDetailsQueryTest() {
        ConversationQuery body = null;
        // AnalyticsConversationQueryResponse response = api.postConversationsDetailsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for evaluation aggregates
     *
     * 
     */
    @Test
    public void postEvaluationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postEvaluationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for queue observations
     *
     * 
     */
    @Test
    public void postQueuesObservationsQueryTest() {
        ObservationQuery body = null;
        // QualifierMappingObservationQueryResponse response = api.postQueuesObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Create a scheduled report job
     *
     * Create a scheduled report job.
     */
    @Test
    public void postReportingSchedulesTest() {
        ReportSchedule body = null;
        // ReportSchedule response = api.postReportingSchedules(body);

        // TODO: test validations
    }
    
    /**
     * Place a scheduled report immediately into the reporting queue
     *
     * 
     */
    @Test
    public void postReportingSchedulesScheduleIdRunreportTest() {
        String scheduleId = null;
        // RunNowResponse response = api.postReportingSchedulesScheduleIdRunreport(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Query for user aggregates
     *
     * 
     */
    @Test
    public void postUsersAggregatesQueryTest() {
        AggregationQuery body = null;
        // PresenceQueryResponse response = api.postUsersAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for user observations
     *
     * 
     */
    @Test
    public void postUsersObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postUsersObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update a scheduled report job.
     *
     * 
     */
    @Test
    public void putReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        ReportSchedule body = null;
        // ReportSchedule response = api.putReportingSchedulesScheduleId(scheduleId, body);

        // TODO: test validations
    }
    
}
