package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.InteractionStatsAlertContainer;
import io.swagger.client.model.InteractionStatsAlert;
import io.swagger.client.model.UnreadMetric;
import io.swagger.client.model.InteractionStatsRuleContainer;
import io.swagger.client.model.InteractionStatsRule;
import io.swagger.client.model.UnreadStatus;
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
    public void deleteAlertingInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        // Void response = api.deleteAlertingInteractionstatsAlertsAlertId(alertId);

        // TODO: test validations
    }
    
    /**
     * Delete an interaction stats rule.
     *
     * 
     */
    @Test
    public void deleteAlertingInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        // Void response = api.deleteAlertingInteractionstatsRulesRuleId(ruleId);

        // TODO: test validations
    }
    
    /**
     * Get interaction stats alert list.
     *
     * 
     */
    @Test
    public void getAlertingInteractionstatsAlertsTest() {
        // InteractionStatsAlertContainer response = api.getAlertingInteractionstatsAlerts();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats alert
     *
     * 
     */
    @Test
    public void getAlertingInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        // InteractionStatsAlert response = api.getAlertingInteractionstatsAlertsAlertId(alertId);

        // TODO: test validations
    }
    
    /**
     * Gets user unread count of interaction stats alerts.
     *
     * 
     */
    @Test
    public void getAlertingInteractionstatsAlertsUnreadTest() {
        // UnreadMetric response = api.getAlertingInteractionstatsAlertsUnread();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats rule list.
     *
     * 
     */
    @Test
    public void getAlertingInteractionstatsRulesTest() {
        // InteractionStatsRuleContainer response = api.getAlertingInteractionstatsRules();

        // TODO: test validations
    }
    
    /**
     * Get an interaction stats rule.
     *
     * 
     */
    @Test
    public void getAlertingInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        // InteractionStatsRule response = api.getAlertingInteractionstatsRulesRuleId(ruleId);

        // TODO: test validations
    }
    
    /**
     * Create an interaction stats rule.
     *
     * 
     */
    @Test
    public void postAlertingInteractionstatsRulesTest() {
        InteractionStatsRule body = null;
        // InteractionStatsRule response = api.postAlertingInteractionstatsRules(body);

        // TODO: test validations
    }
    
    /**
     * Update an interaction stats alert read status
     *
     * 
     */
    @Test
    public void putAlertingInteractionstatsAlertsAlertIdTest() {
        String alertId = null;
        UnreadStatus body = null;
        // UnreadStatus response = api.putAlertingInteractionstatsAlertsAlertId(alertId, body);

        // TODO: test validations
    }
    
    /**
     * Update an interaction stats rule
     *
     * 
     */
    @Test
    public void putAlertingInteractionstatsRulesRuleIdTest() {
        String ruleId = null;
        InteractionStatsRule body = null;
        // InteractionStatsRule response = api.putAlertingInteractionstatsRulesRuleId(ruleId, body);

        // TODO: test validations
    }
    
}
