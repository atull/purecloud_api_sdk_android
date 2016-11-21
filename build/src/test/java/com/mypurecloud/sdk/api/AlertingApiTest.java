package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.model.InteractionStatsAlert;
import com.mypurecloud.sdk.model.UnreadMetric;
import com.mypurecloud.sdk.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.model.InteractionStatsRule;
import com.mypurecloud.sdk.model.UnreadStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlertingApi
 */
public class AlertingApiTest {

    private AlertingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AlertingApi.class);
    }

    
    /**
     * Delete an interaction stats alert
     *
     * 
     */
    @Test
    public void deleteInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        // Void response = api.deleteInteractionstatsAlertsAlertId(alertId);

        // TODO: test validations
    }
    
    /**
     * Delete an interaction stats rule.
     *
     * 
     */
    @Test
    public void deleteInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        // Void response = api.deleteInteractionstatsRulesRuleId(ruleId);

        // TODO: test validations
    }
    
    /**
     * Get interaction stats alert list.
     *
     * 
     */
    @Test
    public void getInteractionstatsAlertsTest() {
        // InteractionStatsAlertContainer response = api.getInteractionstatsAlerts();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats alert
     *
     * 
     */
    @Test
    public void getInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        // InteractionStatsAlert response = api.getInteractionstatsAlertsAlertId(alertId);

        // TODO: test validations
    }
    
    /**
     * Gets user unread count of interaction stats alerts.
     *
     * 
     */
    @Test
    public void getInteractionstatsAlertsUnreadTest() {
        // UnreadMetric response = api.getInteractionstatsAlertsUnread();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats rule list.
     *
     * 
     */
    @Test
    public void getInteractionstatsRulesTest() {
        // InteractionStatsRuleContainer response = api.getInteractionstatsRules();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats rule.
     *
     * 
     */
    @Test
    public void getInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        // InteractionStatsRule response = api.getInteractionstatsRulesRuleId(ruleId);

        // TODO: test validations
    }
    
    /**
     * Create an interaction stats rule.
     *
     * 
     */
    @Test
    public void postInteractionstatsRulesTest() {
        InteractionStatsRule body = null;
        // InteractionStatsRule response = api.postInteractionstatsRules(body);

        // TODO: test validations
    }
    
    /**
     * Update an interaction stats alert read status
     *
     * 
     */
    @Test
    public void putInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        UnreadStatus body = null;
        // UnreadStatus response = api.putInteractionstatsAlertsAlertId(alertId, body);

        // TODO: test validations
    }
    
    /**
     * Update an interaction stats rule
     *
     * 
     */
    @Test
    public void putInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        InteractionStatsRule body = null;
        // InteractionStatsRule response = api.putInteractionstatsRulesRuleId(ruleId, body);

        // TODO: test validations
    }
    
}
