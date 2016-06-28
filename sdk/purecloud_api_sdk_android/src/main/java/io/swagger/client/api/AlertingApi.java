package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.InteractionStatsAlertContainer;
import io.swagger.client.model.InteractionStatsAlert;
import io.swagger.client.model.UnreadMetric;
import io.swagger.client.model.InteractionStatsRuleContainer;
import io.swagger.client.model.InteractionStatsRule;
import io.swagger.client.model.UnreadStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AlertingApi {
  /**
   * Delete an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/alerting/interactionstats/alerts/{alertId}")
  Call<Void> deleteAlertingInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId
  );

  /**
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<Void> deleteAlertingInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId
  );

  /**
   * Get interaction stats alert list.
   * 
   * @return Call<InteractionStatsAlertContainer>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts")
  Call<InteractionStatsAlertContainer> getAlertingInteractionstatsAlerts();
    

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @return Call<InteractionStatsAlert>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts/{alertId}")
  Call<InteractionStatsAlert> getAlertingInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId
  );

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return Call<UnreadMetric>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts/unread")
  Call<UnreadMetric> getAlertingInteractionstatsAlertsUnread();
    

  /**
   * Get an interaction stats rule list.
   * 
   * @return Call<InteractionStatsRuleContainer>
   */
  
  @GET("api/v2/alerting/interactionstats/rules")
  Call<InteractionStatsRuleContainer> getAlertingInteractionstatsRules();
    

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @return Call<InteractionStatsRule>
   */
  
  @GET("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<InteractionStatsRule> getAlertingInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId
  );

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (optional)
   * @return Call<InteractionStatsRule>
   */
  
  @POST("api/v2/alerting/interactionstats/rules")
  Call<InteractionStatsRule> postAlertingInteractionstatsRules(
    @Body InteractionStatsRule body
  );

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (optional)
   * @return Call<UnreadStatus>
   */
  
  @PUT("api/v2/alerting/interactionstats/alerts/{alertId}")
  Call<UnreadStatus> putAlertingInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId, @Body UnreadStatus body
  );

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (optional)
   * @return Call<InteractionStatsRule>
   */
  
  @PUT("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<InteractionStatsRule> putAlertingInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId, @Body InteractionStatsRule body
  );

}
