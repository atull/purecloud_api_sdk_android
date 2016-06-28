package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.Calibration;
import io.swagger.client.model.Evaluation;
import java.util.Date;
import io.swagger.client.model.AgentActivityEntityListing;
import io.swagger.client.model.CalibrationEntityListing;
import io.swagger.client.model.QualityAuditPage;
import io.swagger.client.model.EvaluationEntityListing;
import io.swagger.client.model.EvaluatorActivityEntityListing;
import io.swagger.client.model.EvaluationFormEntityListing;
import io.swagger.client.model.EvaluationForm;
import io.swagger.client.model.KeywordSetEntityListing;
import io.swagger.client.model.KeywordSet;
import io.swagger.client.model.AggregationQuery;
import io.swagger.client.model.AggregateQueryResponse;
import io.swagger.client.model.EvaluationFormAndScoringSet;
import io.swagger.client.model.EvaluationScoringSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QualityApi
 */
public class QualityApiTest {

    private QualityApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QualityApi.class);
    }

    
    /**
     * Delete a calibration by id.
     *
     * 
     */
    @Test
    public void deleteQualityCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        String calibratorId = null;
        // Calibration response = api.deleteQualityCalibrationsCalibrationId(calibrationId, calibratorId);

        // TODO: test validations
    }
    
    /**
     * Delete an evaluation
     *
     * 
     */
    @Test
    public void deleteQualityConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        String expand = null;
        // Evaluation response = api.deleteQualityConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);

        // TODO: test validations
    }
    
    /**
     * Delete an evaluation form.
     *
     * 
     */
    @Test
    public void deleteQualityFormsFormIdTest() {
        String formId = null;
        // String response = api.deleteQualityFormsFormId(formId);

        // TODO: test validations
    }
    
    /**
     * Delete keyword sets
     *
     * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
     */
    @Test
    public void deleteQualityKeywordsetsTest() {
        String ids = null;
        // String response = api.deleteQualityKeywordsets(ids);

        // TODO: test validations
    }
    
    /**
     * Delete a keywordSet by id.
     *
     * 
     */
    @Test
    public void deleteQualityKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        // Void response = api.deleteQualityKeywordsetsKeywordsetId(keywordSetId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Agent Activities
     *
     * Including the number of evaluations and average evaluation score
     */
    @Test
    public void getQualityAgentsActivityTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        Date startTime = null;
        Date endTime = null;
        List<String> agentUserId = null;
        String evaluatorUserId = null;
        String name = null;
        String group = null;
        // AgentActivityEntityListing response = api.getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group);

        // TODO: test validations
    }
    
    /**
     * Get the list of calibrations
     *
     * 
     */
    @Test
    public void getQualityCalibrationsTest() {
        String calibratorId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        String conversationId = null;
        Date startTime = null;
        Date endTime = null;
        // CalibrationEntityListing response = api.getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get a calibration by id.
     *
     * 
     */
    @Test
    public void getQualityCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        String calibratorId = null;
        // Calibration response = api.getQualityCalibrationsCalibrationId(calibrationId, calibratorId);

        // TODO: test validations
    }
    
    /**
     * Get audits for conversation or recording
     *
     * 
     */
    @Test
    public void getQualityConversationsConversationIdAuditsTest() {
        String conversationId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        String recordingId = null;
        String entityType = null;
        // QualityAuditPage response = api.getQualityConversationsConversationIdAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType);

        // TODO: test validations
    }
    
    /**
     * Get an evaluation
     *
     * 
     */
    @Test
    public void getQualityConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        String expand = null;
        // Evaluation response = api.getQualityConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);

        // TODO: test validations
    }
    
    /**
     * Queries Evaluations and returns a paged list
     *
     * Query params must include one of conversationId, evaluatorUserId, or agentUserId
     */
    @Test
    public void getQualityEvaluationsQueryTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        String conversationId = null;
        String agentUserId = null;
        String evaluatorUserId = null;
        String queueId = null;
        String startTime = null;
        String endTime = null;
        List<String> evaluationState = null;
        Boolean isReleased = null;
        Boolean agentHasRead = null;
        Boolean expandAnswerTotalScores = null;
        Integer maximum = null;
        // EvaluationEntityListing response = api.getQualityEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum);

        // TODO: test validations
    }
    
    /**
     * Get an evaluator activity
     *
     * 
     */
    @Test
    public void getQualityEvaluatorsActivityTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        Date startTime = null;
        Date endTime = null;
        String name = null;
        List<String> permission = null;
        String group = null;
        // EvaluatorActivityEntityListing response = api.getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group);

        // TODO: test validations
    }
    
    /**
     * Get the list of evaluation forms
     *
     * 
     */
    @Test
    public void getQualityFormsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String nextPage = null;
        String previousPage = null;
        String expand = null;
        String name = null;
        // EvaluationFormEntityListing response = api.getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name);

        // TODO: test validations
    }
    
    /**
     * Get an evaluation form
     *
     * 
     */
    @Test
    public void getQualityFormsFormIdTest() {
        String formId = null;
        // EvaluationForm response = api.getQualityFormsFormId(formId);

        // TODO: test validations
    }
    
    /**
     * Gets all the revisions for a specific evaluation.
     *
     * 
     */
    @Test
    public void getQualityFormsFormIdVersionsTest() {
        String formId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // EvaluationFormEntityListing response = api.getQualityFormsFormIdVersions(formId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get the list of keyword sets
     *
     * 
     */
    @Test
    public void getQualityKeywordsetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        String name = null;
        // KeywordSetEntityListing response = api.getQualityKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name);

        // TODO: test validations
    }
    
    /**
     * Get a keywordSet by id.
     *
     * 
     */
    @Test
    public void getQualityKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        // KeywordSet response = api.getQualityKeywordsetsKeywordsetId(keywordSetId);

        // TODO: test validations
    }
    
    /**
     * Get the published evaluation forms.
     *
     * 
     */
    @Test
    public void getQualityPublishedformsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        // EvaluationFormEntityListing response = api.getQualityPublishedforms(pageSize, pageNumber, name);

        // TODO: test validations
    }
    
    /**
     * Get the published evaluation forms.
     *
     * 
     */
    @Test
    public void getQualityPublishedformsFormIdTest() {
        String formId = null;
        // EvaluationForm response = api.getQualityPublishedformsFormId(formId);

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
     * Create a calibration
     *
     * 
     */
    @Test
    public void postQualityCalibrationsTest() {
        Calibration body = null;
        String expand = null;
        // Calibration response = api.postQualityCalibrations(body, expand);

        // TODO: test validations
    }
    
    /**
     * Create an evaluation
     *
     * 
     */
    @Test
    public void postQualityConversationsConversationIdEvaluationsTest() {
        String conversationId = null;
        Evaluation body = null;
        String expand = null;
        // Evaluation response = api.postQualityConversationsConversationIdEvaluations(conversationId, body, expand);

        // TODO: test validations
    }
    
    /**
     * Score evaluation
     *
     * 
     */
    @Test
    public void postQualityEvaluationsScoringTest() {
        EvaluationFormAndScoringSet body = null;
        // EvaluationScoringSet response = api.postQualityEvaluationsScoring(body);

        // TODO: test validations
    }
    
    /**
     * Create an evaluation form.
     *
     * 
     */
    @Test
    public void postQualityFormsTest() {
        EvaluationForm body = null;
        // EvaluationForm response = api.postQualityForms(body);

        // TODO: test validations
    }
    
    /**
     * Create a Keyword Set
     *
     * 
     */
    @Test
    public void postQualityKeywordsetsTest() {
        KeywordSet body = null;
        String expand = null;
        // KeywordSet response = api.postQualityKeywordsets(body, expand);

        // TODO: test validations
    }
    
    /**
     * Publish an evaluation form.
     *
     * 
     */
    @Test
    public void postQualityPublishedformsTest() {
        EvaluationForm body = null;
        // EvaluationForm response = api.postQualityPublishedforms(body);

        // TODO: test validations
    }
    
    /**
     * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
     *
     * 
     */
    @Test
    public void putQualityCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        Calibration body = null;
        // Calibration response = api.putQualityCalibrationsCalibrationId(calibrationId, body);

        // TODO: test validations
    }
    
    /**
     * Update an evaluation
     *
     * 
     */
    @Test
    public void putQualityConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        Evaluation body = null;
        String expand = null;
        // Evaluation response = api.putQualityConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, body, expand);

        // TODO: test validations
    }
    
    /**
     * Update an evaluation form.
     *
     * 
     */
    @Test
    public void putQualityFormsFormIdTest() {
        String formId = null;
        EvaluationForm body = null;
        // EvaluationForm response = api.putQualityFormsFormId(formId, body);

        // TODO: test validations
    }
    
    /**
     * Update a keywordSet to the specified keywordSet via PUT.
     *
     * 
     */
    @Test
    public void putQualityKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        KeywordSet body = null;
        // KeywordSet response = api.putQualityKeywordsetsKeywordsetId(keywordSetId, body);

        // TODO: test validations
    }
    
}
