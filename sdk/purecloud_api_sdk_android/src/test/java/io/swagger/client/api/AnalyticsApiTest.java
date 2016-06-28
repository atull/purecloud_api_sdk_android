package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
    public void deleteAnalyticsReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        // String response = api.deleteAnalyticsReportingSchedulesScheduleId(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get a conversation by id
     *
     * 
     */
    @Test
    public void getAnalyticsConversationsConversationIdDetailsTest() {
        String conversationId = null;
        // AnalyticsConversation response = api.getAnalyticsConversationsConversationIdDetails(conversationId);

        // TODO: test validations
    }
    
    /**
     * Get list of reporting metadata.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingMetadataTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String locale = null;
        // ReportMetaDataEntityListing response = api.getAnalyticsReportingMetadata(pageNumber, pageSize, locale);

        // TODO: test validations
    }
    
    /**
     * Get a reporting metadata.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingReportIdMetadataTest() {
        String reportId = null;
        String locale = null;
        // ReportMetaData response = api.getAnalyticsReportingReportIdMetadata(reportId, locale);

        // TODO: test validations
    }
    
    /**
     * Get a list of report formats
     *
     * Get a list of report formats.
     */
    @Test
    public void getAnalyticsReportingReportformatsTest() {
        // List<String> response = api.getAnalyticsReportingReportformats();

        // TODO: test validations
    }
    
    /**
     * Get a list of scheduled report jobs
     *
     * Get a list of scheduled report jobs.
     */
    @Test
    public void getAnalyticsReportingSchedulesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        // ReportScheduleEntityListing response = api.getAnalyticsReportingSchedules(pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a scheduled report job.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        // ReportSchedule response = api.getAnalyticsReportingSchedulesScheduleId(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get list of completed scheduled report jobs.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingSchedulesScheduleIdHistoryTest() {
        String scheduleId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        // ReportRunEntryEntityDomainListing response = api.getAnalyticsReportingSchedulesScheduleIdHistory(scheduleId, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get most recently completed scheduled report job.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingSchedulesScheduleIdHistoryLatestTest() {
        String scheduleId = null;
        // ReportRunEntry response = api.getAnalyticsReportingSchedulesScheduleIdHistoryLatest(scheduleId);

        // TODO: test validations
    }
    
    /**
     * A completed scheduled report job
     *
     * A completed scheduled report job.
     */
    @Test
    public void getAnalyticsReportingSchedulesScheduleIdHistoryRunIdTest() {
        String runId = null;
        String scheduleId = null;
        // ReportRunEntry response = api.getAnalyticsReportingSchedulesScheduleIdHistoryRunId(runId, scheduleId);

        // TODO: test validations
    }
    
    /**
     * Get a list of report time periods.
     *
     * 
     */
    @Test
    public void getAnalyticsReportingTimeperiodsTest() {
        // List<String> response = api.getAnalyticsReportingTimeperiods();

        // TODO: test validations
    }
    
    /**
     * Query for conversation aggregates
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postAnalyticsConversationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Index conversation properties
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsConversationIdDetailsPropertiesTest() {
        String conversationId = null;
        PropertyIndexRequest body = null;
        // PropertyIndexRequest response = api.postAnalyticsConversationsConversationIdDetailsProperties(conversationId, body);

        // TODO: test validations
    }
    
    /**
     * Query for conversation details
     *
     * 
     */
    @Test
    public void postAnalyticsConversationsDetailsQueryTest() {
        ConversationQuery body = null;
        // AnalyticsConversationQueryResponse response = api.postAnalyticsConversationsDetailsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for evaluation aggregates
     *
     * 
     */
    @Test
    public void postAnalyticsEvaluationsAggregatesQueryTest() {
        AggregationQuery body = null;
        // AggregateQueryResponse response = api.postAnalyticsEvaluationsAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for queue observations
     *
     * 
     */
    @Test
    public void postAnalyticsQueuesObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postAnalyticsQueuesObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Create a scheduled report job
     *
     * Create a scheduled report job.
     */
    @Test
    public void postAnalyticsReportingSchedulesTest() {
        ReportSchedule body = null;
        // ReportSchedule response = api.postAnalyticsReportingSchedules(body);

        // TODO: test validations
    }
    
    /**
     * Place a scheduled report immediately into the reporting queue
     *
     * 
     */
    @Test
    public void postAnalyticsReportingSchedulesScheduleIdRunreportTest() {
        String scheduleId = null;
        // RunNowResponse response = api.postAnalyticsReportingSchedulesScheduleIdRunreport(scheduleId);

        // TODO: test validations
    }
    
    /**
     * Query for user aggregates
     *
     * 
     */
    @Test
    public void postAnalyticsUsersAggregatesQueryTest() {
        AggregationQuery body = null;
        // PresenceQueryResponse response = api.postAnalyticsUsersAggregatesQuery(body);

        // TODO: test validations
    }
    
    /**
     * Query for user observations
     *
     * 
     */
    @Test
    public void postAnalyticsUsersObservationsQueryTest() {
        ObservationQuery body = null;
        // ObservationQueryResponse response = api.postAnalyticsUsersObservationsQuery(body);

        // TODO: test validations
    }
    
    /**
     * Update a scheduled report job.
     *
     * 
     */
    @Test
    public void putAnalyticsReportingSchedulesScheduleIdTest() {
        String scheduleId = null;
        ReportSchedule body = null;
        // ReportSchedule response = api.putAnalyticsReportingSchedulesScheduleId(scheduleId, body);

        // TODO: test validations
    }
    
}
