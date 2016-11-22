package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.model.InteractionStatsAlert;
import com.mypurecloud.sdk.model.UnreadMetric;
import com.mypurecloud.sdk.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.model.InteractionStatsRule;
import com.mypurecloud.sdk.model.UnreadStatus;

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
  Call<Void> deleteInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId
  );

  /**
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<Void> deleteInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId
  );

  /**
   * Get interaction stats alert list.
   * 
   * @return Call<InteractionStatsAlertContainer>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts")
  Call<InteractionStatsAlertContainer> getInteractionstatsAlerts();
    

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @return Call<InteractionStatsAlert>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts/{alertId}")
  Call<InteractionStatsAlert> getInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId
  );

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return Call<UnreadMetric>
   */
  
  @GET("api/v2/alerting/interactionstats/alerts/unread")
  Call<UnreadMetric> getInteractionstatsAlertsUnread();
    

  /**
   * Get an interaction stats rule list.
   * 
   * @return Call<InteractionStatsRuleContainer>
   */
  
  @GET("api/v2/alerting/interactionstats/rules")
  Call<InteractionStatsRuleContainer> getInteractionstatsRules();
    

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @return Call<InteractionStatsRule>
   */
  
  @GET("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<InteractionStatsRule> getInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId
  );

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (required)
   * @return Call<InteractionStatsRule>
   */
  
  @POST("api/v2/alerting/interactionstats/rules")
  Call<InteractionStatsRule> postInteractionstatsRules(
    @Body InteractionStatsRule body
  );

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (required)
   * @return Call<UnreadStatus>
   */
  
  @PUT("api/v2/alerting/interactionstats/alerts/{alertId}")
  Call<UnreadStatus> putInteractionstatsAlertsAlertId(
    @Path("alertId") String alertId, @Body UnreadStatus body
  );

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (required)
   * @return Call<InteractionStatsRule>
   */
  
  @PUT("api/v2/alerting/interactionstats/rules/{ruleId}")
  Call<InteractionStatsRule> putInteractionstatsRulesRuleId(
    @Path("ruleId") String ruleId, @Body InteractionStatsRule body
  );

}
