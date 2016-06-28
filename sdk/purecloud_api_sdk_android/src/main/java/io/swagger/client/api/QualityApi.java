package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QualityApi {
  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Call<Calibration>
   */
  
  @DELETE("api/v2/quality/calibrations/{calibrationId}")
  Call<Calibration> deleteQualityCalibrationsCalibrationId(
    @Path("calibrationId") String calibrationId, @Query("calibratorId") String calibratorId
  );

  /**
   * Delete an evaluation
   * 
   * @param conversationId  (required)
   * @param evaluationId  (required)
   * @param expand evaluatorId (optional)
   * @return Call<Evaluation>
   */
  
  @DELETE("api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}")
  Call<Evaluation> deleteQualityConversationsConversationIdEvaluationsEvaluationId(
    @Path("conversationId") String conversationId, @Path("evaluationId") String evaluationId, @Query("expand") String expand
  );

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/quality/forms/{formId}")
  Call<String> deleteQualityFormsFormId(
    @Path("formId") String formId
  );

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param ids A comma-delimited list of valid KeywordSet ids (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/quality/keywordsets")
  Call<String> deleteQualityKeywordsets(
    @Query("ids") String ids
  );

  /**
   * Delete a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/quality/keywordsets/{keywordSetId}")
  Call<Void> deleteQualityKeywordsetsKeywordsetId(
    @Path("keywordSetId") String keywordSetId
  );

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return Call<AgentActivityEntityListing>
   */
  
  @GET("api/v2/quality/agents/activity")
  Call<AgentActivityEntityListing> getQualityAgentsActivity(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("startTime") Date startTime, @Query("endTime") Date endTime, @Query("agentUserId") List<String> agentUserId, @Query("evaluatorUserId") String evaluatorUserId, @Query("name") String name, @Query("group") String group
  );

  /**
   * Get the list of calibrations
   * 
   * @param calibratorId user id of calibrator (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversation id (optional)
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @return Call<CalibrationEntityListing>
   */
  
  @GET("api/v2/quality/calibrations")
  Call<CalibrationEntityListing> getQualityCalibrations(
    @Query("calibratorId") String calibratorId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("conversationId") String conversationId, @Query("startTime") Date startTime, @Query("endTime") Date endTime
  );

  /**
   * Get a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Call<Calibration>
   */
  
  @GET("api/v2/quality/calibrations/{calibrationId}")
  Call<Calibration> getQualityCalibrationsCalibrationId(
    @Path("calibrationId") String calibrationId, @Query("calibratorId") String calibratorId
  );

  /**
   * Get audits for conversation or recording
   * 
   * @param conversationId Conversation ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param recordingId id of the recording (optional)
   * @param entityType entity type options: Recording, Calibration, Evaluation, Annotation (optional, default to RECORDING)
   * @return Call<QualityAuditPage>
   */
  
  @GET("api/v2/quality/conversations/{conversationId}/audits")
  Call<QualityAuditPage> getQualityConversationsConversationIdAudits(
    @Path("conversationId") String conversationId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("recordingId") String recordingId, @Query("entityType") String entityType
  );

  /**
   * Get an evaluation
   * 
   * @param conversationId  (required)
   * @param evaluationId  (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Call<Evaluation>
   */
  
  @GET("api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}")
  Call<Evaluation> getQualityConversationsConversationIdEvaluationsEvaluationId(
    @Path("conversationId") String conversationId, @Path("evaluationId") String evaluationId, @Query("expand") String expand
  );

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversationId specified (optional)
   * @param agentUserId user id of the agent (optional)
   * @param evaluatorUserId evaluator user id (optional)
   * @param queueId queue id (optional)
   * @param startTime start time of the evaluation query (optional)
   * @param endTime end time of the evaluation query (optional)
   * @param evaluationState evaluation state options: Pending, InProgress, Finished (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @return Call<EvaluationEntityListing>
   */
  
  @GET("api/v2/quality/evaluations/query")
  Call<EvaluationEntityListing> getQualityEvaluationsQuery(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("conversationId") String conversationId, @Query("agentUserId") String agentUserId, @Query("evaluatorUserId") String evaluatorUserId, @Query("queueId") String queueId, @Query("startTime") String startTime, @Query("endTime") String endTime, @Query("evaluationState") List<String> evaluationState, @Query("isReleased") Boolean isReleased, @Query("agentHasRead") Boolean agentHasRead, @Query("expandAnswerTotalScores") Boolean expandAnswerTotalScores, @Query("maximum") Integer maximum
  );

  /**
   * Get an evaluator activity
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return Call<EvaluatorActivityEntityListing>
   */
  
  @GET("api/v2/quality/evaluators/activity")
  Call<EvaluatorActivityEntityListing> getQualityEvaluatorsActivity(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("startTime") Date startTime, @Query("endTime") Date endTime, @Query("name") String name, @Query("permission") List<String> permission, @Query("group") String group
  );

  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @return Call<EvaluationFormEntityListing>
   */
  
  @GET("api/v2/quality/forms")
  Call<EvaluationFormEntityListing> getQualityForms(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("expand") String expand, @Query("name") String name
  );

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return Call<EvaluationForm>
   */
  
  @GET("api/v2/quality/forms/{formId}")
  Call<EvaluationForm> getQualityFormsFormId(
    @Path("formId") String formId
  );

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<EvaluationFormEntityListing>
   */
  
  @GET("api/v2/quality/forms/{formId}/versions")
  Call<EvaluationFormEntityListing> getQualityFormsFormIdVersions(
    @Path("formId") String formId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get the list of keyword sets
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the keyword set name - used for filtering results in searches. (optional)
   * @return Call<KeywordSetEntityListing>
   */
  
  @GET("api/v2/quality/keywordsets")
  Call<KeywordSetEntityListing> getQualityKeywordsets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("name") String name
  );

  /**
   * Get a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return Call<KeywordSet>
   */
  
  @GET("api/v2/quality/keywordsets/{keywordSetId}")
  Call<KeywordSet> getQualityKeywordsetsKeywordsetId(
    @Path("keywordSetId") String keywordSetId
  );

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @return Call<EvaluationFormEntityListing>
   */
  
  @GET("api/v2/quality/publishedforms")
  Call<EvaluationFormEntityListing> getQualityPublishedforms(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name
  );

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return Call<EvaluationForm>
   */
  
  @GET("api/v2/quality/publishedforms/{formId}")
  Call<EvaluationForm> getQualityPublishedformsFormId(
    @Path("formId") String formId
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
   * Create a calibration
   * 
   * @param body calibration (optional)
   * @param expand calibratorId (optional)
   * @return Call<Calibration>
   */
  
  @POST("api/v2/quality/calibrations")
  Call<Calibration> postQualityCalibrations(
    @Body Calibration body, @Query("expand") String expand
  );

  /**
   * Create an evaluation
   * 
   * @param conversationId  (required)
   * @param body evaluation (optional)
   * @param expand evaluatorId (optional)
   * @return Call<Evaluation>
   */
  
  @POST("api/v2/quality/conversations/{conversationId}/evaluations")
  Call<Evaluation> postQualityConversationsConversationIdEvaluations(
    @Path("conversationId") String conversationId, @Body Evaluation body, @Query("expand") String expand
  );

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (optional)
   * @return Call<EvaluationScoringSet>
   */
  
  @POST("api/v2/quality/evaluations/scoring")
  Call<EvaluationScoringSet> postQualityEvaluationsScoring(
    @Body EvaluationFormAndScoringSet body
  );

  /**
   * Create an evaluation form.
   * 
   * @param body  (optional)
   * @return Call<EvaluationForm>
   */
  
  @POST("api/v2/quality/forms")
  Call<EvaluationForm> postQualityForms(
    @Body EvaluationForm body
  );

  /**
   * Create a Keyword Set
   * 
   * @param body keywordSet (optional)
   * @param expand queueId (optional)
   * @return Call<KeywordSet>
   */
  
  @POST("api/v2/quality/keywordsets")
  Call<KeywordSet> postQualityKeywordsets(
    @Body KeywordSet body, @Query("expand") String expand
  );

  /**
   * Publish an evaluation form.
   * 
   * @param body  (optional)
   * @return Call<EvaluationForm>
   */
  
  @POST("api/v2/quality/publishedforms")
  Call<EvaluationForm> postQualityPublishedforms(
    @Body EvaluationForm body
  );

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (optional)
   * @return Call<Calibration>
   */
  
  @PUT("api/v2/quality/calibrations/{calibrationId}")
  Call<Calibration> putQualityCalibrationsCalibrationId(
    @Path("calibrationId") String calibrationId, @Body Calibration body
  );

  /**
   * Update an evaluation
   * 
   * @param conversationId  (required)
   * @param evaluationId  (required)
   * @param body evaluation (optional)
   * @param expand evaluatorId (optional)
   * @return Call<Evaluation>
   */
  
  @PUT("api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}")
  Call<Evaluation> putQualityConversationsConversationIdEvaluationsEvaluationId(
    @Path("conversationId") String conversationId, @Path("evaluationId") String evaluationId, @Body Evaluation body, @Query("expand") String expand
  );

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body  (optional)
   * @return Call<EvaluationForm>
   */
  
  @PUT("api/v2/quality/forms/{formId}")
  Call<EvaluationForm> putQualityFormsFormId(
    @Path("formId") String formId, @Body EvaluationForm body
  );

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @param body keywordSet (optional)
   * @return Call<KeywordSet>
   */
  
  @PUT("api/v2/quality/keywordsets/{keywordSetId}")
  Call<KeywordSet> putQualityKeywordsetsKeywordsetId(
    @Path("keywordSetId") String keywordSetId, @Body KeywordSet body
  );

}
