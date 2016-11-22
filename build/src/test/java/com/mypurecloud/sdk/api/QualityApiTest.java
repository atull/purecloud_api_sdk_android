package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Calibration;
import com.mypurecloud.sdk.model.Evaluation;
import java.util.Date;
import com.mypurecloud.sdk.model.AgentActivityEntityListing;
import com.mypurecloud.sdk.model.CalibrationEntityListing;
import com.mypurecloud.sdk.model.QualityAuditPage;
import com.mypurecloud.sdk.model.EvaluationEntityListing;
import com.mypurecloud.sdk.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.model.EvaluationForm;
import com.mypurecloud.sdk.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.model.KeywordSet;
import com.mypurecloud.sdk.model.AggregationQuery;
import com.mypurecloud.sdk.model.AggregateQueryResponse;
import com.mypurecloud.sdk.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.model.EvaluationScoringSet;
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
    public void deleteCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        String calibratorId = null;
        // Calibration response = api.deleteCalibrationsCalibrationId(calibrationId, calibratorId);

        // TODO: test validations
    }
    
    /**
     * Delete an evaluation
     *
     * 
     */
    @Test
    public void deleteConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        String expand = null;
        // Evaluation response = api.deleteConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);

        // TODO: test validations
    }
    
    /**
     * Delete an evaluation form.
     *
     * 
     */
    @Test
    public void deleteFormsFormIdTest() {
        String formId = null;
        // String response = api.deleteFormsFormId(formId);

        // TODO: test validations
    }
    
    /**
     * Delete keyword sets
     *
     * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
     */
    @Test
    public void deleteKeywordsetsTest() {
        String ids = null;
        // String response = api.deleteKeywordsets(ids);

        // TODO: test validations
    }
    
    /**
     * Delete a keywordSet by id.
     *
     * 
     */
    @Test
    public void deleteKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        // Void response = api.deleteKeywordsetsKeywordsetId(keywordSetId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Agent Activities
     *
     * Including the number of evaluations and average evaluation score
     */
    @Test
    public void getAgentsActivityTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        Date startTime = null;
        Date endTime = null;
        List<Object> agentUserId = null;
        String evaluatorUserId = null;
        String name = null;
        String group = null;
        // AgentActivityEntityListing response = api.getAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group);

        // TODO: test validations
    }
    
    /**
     * Get the list of calibrations
     *
     * 
     */
    @Test
    public void getCalibrationsTest() {
        String calibratorId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        String conversationId = null;
        Date startTime = null;
        Date endTime = null;
        // CalibrationEntityListing response = api.getCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get a calibration by id.
     *
     * 
     */
    @Test
    public void getCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        String calibratorId = null;
        // Calibration response = api.getCalibrationsCalibrationId(calibrationId, calibratorId);

        // TODO: test validations
    }
    
    /**
     * Get audits for conversation or recording
     *
     * 
     */
    @Test
    public void getConversationsConversationIdAuditsTest() {
        String conversationId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        String recordingId = null;
        String entityType = null;
        // QualityAuditPage response = api.getConversationsConversationIdAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType);

        // TODO: test validations
    }
    
    /**
     * Get an evaluation
     *
     * 
     */
    @Test
    public void getConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        String expand = null;
        // Evaluation response = api.getConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);

        // TODO: test validations
    }
    
    /**
     * Queries Evaluations and returns a paged list
     *
     * Query params must include one of conversationId, evaluatorUserId, or agentUserId
     */
    @Test
    public void getEvaluationsQueryTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        String conversationId = null;
        String agentUserId = null;
        String evaluatorUserId = null;
        String queueId = null;
        String startTime = null;
        String endTime = null;
        List<Object> evaluationState = null;
        Boolean isReleased = null;
        Boolean agentHasRead = null;
        Boolean expandAnswerTotalScores = null;
        Integer maximum = null;
        // EvaluationEntityListing response = api.getEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum);

        // TODO: test validations
    }
    
    /**
     * Get an evaluator activity
     *
     * 
     */
    @Test
    public void getEvaluatorsActivityTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        Date startTime = null;
        Date endTime = null;
        String name = null;
        List<Object> permission = null;
        String group = null;
        // EvaluatorActivityEntityListing response = api.getEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group);

        // TODO: test validations
    }
    
    /**
     * Get the list of evaluation forms
     *
     * 
     */
    @Test
    public void getFormsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String nextPage = null;
        String previousPage = null;
        String expand = null;
        String name = null;
        // EvaluationFormEntityListing response = api.getForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name);

        // TODO: test validations
    }
    
    /**
     * Get an evaluation form
     *
     * 
     */
    @Test
    public void getFormsFormIdTest() {
        String formId = null;
        // EvaluationForm response = api.getFormsFormId(formId);

        // TODO: test validations
    }
    
    /**
     * Gets all the revisions for a specific evaluation.
     *
     * 
     */
    @Test
    public void getFormsFormIdVersionsTest() {
        String formId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // EvaluationFormEntityListing response = api.getFormsFormIdVersions(formId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get the list of keyword sets
     *
     * 
     */
    @Test
    public void getKeywordsetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        String name = null;
        // KeywordSetEntityListing response = api.getKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name);

        // TODO: test validations
    }
    
    /**
     * Get a keywordSet by id.
     *
     * 
     */
    @Test
    public void getKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        // KeywordSet response = api.getKeywordsetsKeywordsetId(keywordSetId);

        // TODO: test validations
    }
    
    /**
     * Get the published evaluation forms.
     *
     * 
     */
    @Test
    public void getPublishedformsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        // EvaluationFormEntityListing response = api.getPublishedforms(pageSize, pageNumber, name);

        // TODO: test validations
    }
    
    /**
     * Get the published evaluation forms.
     *
     * 
     */
    @Test
    public void getPublishedformsFormIdTest() {
        String formId = null;
        // EvaluationForm response = api.getPublishedformsFormId(formId);

        // TODO: test validations
    }
    
    /**
     * Create a calibration
     *
     * 
     */
    @Test
    public void postCalibrationsTest() {
        Calibration body = null;
        String expand = null;
        // Calibration response = api.postCalibrations(body, expand);

        // TODO: test validations
    }
    
    /**
     * Create an evaluation
     *
     * 
     */
    @Test
    public void postConversationsConversationIdEvaluationsTest() {
        String conversationId = null;
        Evaluation body = null;
        String expand = null;
        // Evaluation response = api.postConversationsConversationIdEvaluations(conversationId, body, expand);

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
     * Score evaluation
     *
     * 
     */
    @Test
    public void postEvaluationsScoringTest() {
        EvaluationFormAndScoringSet body = null;
        // EvaluationScoringSet response = api.postEvaluationsScoring(body);

        // TODO: test validations
    }
    
    /**
     * Create an evaluation form.
     *
     * 
     */
    @Test
    public void postFormsTest() {
        EvaluationForm body = null;
        // EvaluationForm response = api.postForms(body);

        // TODO: test validations
    }
    
    /**
     * Create a Keyword Set
     *
     * 
     */
    @Test
    public void postKeywordsetsTest() {
        KeywordSet body = null;
        String expand = null;
        // KeywordSet response = api.postKeywordsets(body, expand);

        // TODO: test validations
    }
    
    /**
     * Publish an evaluation form.
     *
     * 
     */
    @Test
    public void postPublishedformsTest() {
        EvaluationForm body = null;
        // EvaluationForm response = api.postPublishedforms(body);

        // TODO: test validations
    }
    
    /**
     * Retrieve the spotability statistic
     *
     * 
     */
    @Test
    public void postSpotabilityTest() {
        KeywordSet body = null;
        // KeywordSet response = api.postSpotability(body);

        // TODO: test validations
    }
    
    /**
     * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
     *
     * 
     */
    @Test
    public void putCalibrationsCalibrationIdTest() {
        String calibrationId = null;
        Calibration body = null;
        // Calibration response = api.putCalibrationsCalibrationId(calibrationId, body);

        // TODO: test validations
    }
    
    /**
     * Update an evaluation
     *
     * 
     */
    @Test
    public void putConversationsConversationIdEvaluationsEvaluationIdTest() {
        String conversationId = null;
        String evaluationId = null;
        Evaluation body = null;
        String expand = null;
        // Evaluation response = api.putConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, body, expand);

        // TODO: test validations
    }
    
    /**
     * Update an evaluation form.
     *
     * 
     */
    @Test
    public void putFormsFormIdTest() {
        String formId = null;
        EvaluationForm body = null;
        // EvaluationForm response = api.putFormsFormId(formId, body);

        // TODO: test validations
    }
    
    /**
     * Update a keywordSet to the specified keywordSet via PUT.
     *
     * 
     */
    @Test
    public void putKeywordsetsKeywordsetIdTest() {
        String keywordSetId = null;
        KeywordSet body = null;
        // KeywordSet response = api.putKeywordsetsKeywordsetId(keywordSetId, body);

        // TODO: test validations
    }
    
}
