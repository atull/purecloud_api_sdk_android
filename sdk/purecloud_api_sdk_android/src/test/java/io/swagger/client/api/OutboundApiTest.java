package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.CallableTimeSetEntityListing;
import io.swagger.client.model.CallableTimeSet;
import io.swagger.client.model.ResponseSetEntityListing;
import io.swagger.client.model.ResponseSet;
import io.swagger.client.model.CampaignEntityListing;
import io.swagger.client.model.Campaign;
import io.swagger.client.model.CampaignDiagnostics;
import io.swagger.client.model.CampaignProgress;
import io.swagger.client.model.CampaignStats;
import io.swagger.client.model.ContactListEntityListing;
import io.swagger.client.model.ContactList;
import io.swagger.client.model.DialerContact;
import io.swagger.client.model.ExportUri;
import io.swagger.client.model.ImportStatus;
import io.swagger.client.model.DncListEntityListing;
import io.swagger.client.model.DncList;
import io.swagger.client.model.RuleSetEntityListing;
import io.swagger.client.model.RuleSet;
import io.swagger.client.model.CampaignSchedule;
import io.swagger.client.model.SequenceSchedule;
import io.swagger.client.model.CampaignSequenceEntityListing;
import io.swagger.client.model.CampaignSequence;
import io.swagger.client.model.WrapUpCodeMapping;
import io.swagger.client.model.AuditSearchResult;
import io.swagger.client.model.DialerAuditRequest;
import io.swagger.client.model.ContactCallbackRequest;
import io.swagger.client.model.Agent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutboundApi
 */
public class OutboundApiTest {

    private OutboundApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OutboundApi.class);
    }

    
    /**
     * Delete callable time set
     *
     * 
     */
    @Test
    public void deleteOutboundCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        // String response = api.deleteOutboundCallabletimesetsCallabletimesetId(callableTimeSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void deleteOutboundCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        // String response = api.deleteOutboundCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a campaign.
     *
     * 
     */
    @Test
    public void deleteOutboundCampaignsCampaignIdTest() {
        String campaignId = null;
        // String response = api.deleteOutboundCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Reset campaign progress and recycle the campaign
     *
     * 
     */
    @Test
    public void deleteOutboundCampaignsCampaignIdProgressTest() {
        String campaignId = null;
        // String response = api.deleteOutboundCampaignsCampaignIdProgress(campaignId);

        // TODO: test validations
    }
    
    /**
     * Delete a contact list.
     *
     * 
     */
    @Test
    public void deleteOutboundContactlistsContactlistIdTest() {
        String contactListId = null;
        // String response = api.deleteOutboundContactlistsContactlistId(contactListId);

        // TODO: test validations
    }
    
    /**
     * Delete a contact.
     *
     * 
     */
    @Test
    public void deleteOutboundContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        // String response = api.deleteOutboundContactlistsContactlistIdContactsContactId(contactListId, contactId);

        // TODO: test validations
    }
    
    /**
     * Delete dialer DNC list
     *
     * 
     */
    @Test
    public void deleteOutboundDnclistsDnclistIdTest() {
        String dncListId = null;
        // String response = api.deleteOutboundDnclistsDnclistId(dncListId);

        // TODO: test validations
    }
    
    /**
     * Delete a Rule set.
     *
     * 
     */
    @Test
    public void deleteOutboundRulesetsRulesetIdTest() {
        String ruleSetId = null;
        // String response = api.deleteOutboundRulesetsRulesetId(ruleSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer campaign schedule.
     *
     * 
     */
    @Test
    public void deleteOutboundSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        // String response = api.deleteOutboundSchedulesCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer sequence schedule.
     *
     * 
     */
    @Test
    public void deleteOutboundSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        // String response = api.deleteOutboundSchedulesSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer campaign sequence.
     *
     * 
     */
    @Test
    public void deleteOutboundSequencesSequenceIdTest() {
        String sequenceId = null;
        // String response = api.deleteOutboundSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Query callable time set list
     *
     * 
     */
    @Test
    public void getOutboundCallabletimesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // CallableTimeSetEntityListing response = api.getOutboundCallabletimesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get callable time set
     *
     * 
     */
    @Test
    public void getOutboundCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        // CallableTimeSet response = api.getOutboundCallabletimesetsCallabletimesetId(callableTimeSetId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer call analysis response sets.
     *
     * 
     */
    @Test
    public void getOutboundCallanalysisresponsesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // ResponseSetEntityListing response = api.getOutboundCallanalysisresponsesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void getOutboundCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        // ResponseSet response = api.getOutboundCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer campaigns.
     *
     * 
     */
    @Test
    public void getOutboundCampaignsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String contactListId = null;
        String dncListId = null;
        String distributionQueueId = null;
        String edgeGroupId = null;
        String callAnalysisResponseSetId = null;
        String sortBy = null;
        String sortOrder = null;
        // CampaignEntityListing response = api.getOutboundCampaigns(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get dialer campaign.
     *
     * 
     */
    @Test
    public void getOutboundCampaignsCampaignIdTest() {
        String campaignId = null;
        // Campaign response = api.getOutboundCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get campaign diagnostics
     *
     * 
     */
    @Test
    public void getOutboundCampaignsCampaignIdDiagnosticsTest() {
        String campaignId = null;
        // CampaignDiagnostics response = api.getOutboundCampaignsCampaignIdDiagnostics(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get campaign progress
     *
     * 
     */
    @Test
    public void getOutboundCampaignsCampaignIdProgressTest() {
        String campaignId = null;
        // CampaignProgress response = api.getOutboundCampaignsCampaignIdProgress(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get statistics about a Dialer Campaign
     *
     * 
     */
    @Test
    public void getOutboundCampaignsCampaignIdStatsTest() {
        String campaignId = null;
        // CampaignStats response = api.getOutboundCampaignsCampaignIdStats(campaignId);

        // TODO: test validations
    }
    
    /**
     * Query a list of contact lists.
     *
     * 
     */
    @Test
    public void getOutboundContactlistsTest() {
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // ContactListEntityListing response = api.getOutboundContactlists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer contact list.
     *
     * 
     */
    @Test
    public void getOutboundContactlistsContactlistIdTest() {
        String contactListId = null;
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        // ContactList response = api.getOutboundContactlistsContactlistId(contactListId, includeImportStatus, includeSize);

        // TODO: test validations
    }
    
    /**
     * Get a contact.
     *
     * 
     */
    @Test
    public void getOutboundContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        // DialerContact response = api.getOutboundContactlistsContactlistIdContactsContactId(contactListId, contactId);

        // TODO: test validations
    }
    
    /**
     * Get the URI of a contact list export.
     *
     * 
     */
    @Test
    public void getOutboundContactlistsContactlistIdExportTest() {
        String contactListId = null;
        String download = null;
        // ExportUri response = api.getOutboundContactlistsContactlistIdExport(contactListId, download);

        // TODO: test validations
    }
    
    /**
     * Get dialer contactList import status.
     *
     * 
     */
    @Test
    public void getOutboundContactlistsContactlistIdImportstatusTest() {
        String contactListId = null;
        // ImportStatus response = api.getOutboundContactlistsContactlistIdImportstatus(contactListId);

        // TODO: test validations
    }
    
    /**
     * Query dialer DNC lists
     *
     * 
     */
    @Test
    public void getOutboundDnclistsTest() {
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // DncListEntityListing response = api.getOutboundDnclists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get dialer DNC list
     *
     * 
     */
    @Test
    public void getOutboundDnclistsDnclistIdTest() {
        String dncListId = null;
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        // DncList response = api.getOutboundDnclistsDnclistId(dncListId, includeImportStatus, includeSize);

        // TODO: test validations
    }
    
    /**
     * Get the URI of a DNC list export.
     *
     * 
     */
    @Test
    public void getOutboundDnclistsDnclistIdExportTest() {
        String dncListId = null;
        String download = null;
        // ExportUri response = api.getOutboundDnclistsDnclistIdExport(dncListId, download);

        // TODO: test validations
    }
    
    /**
     * Get dialer dncList import status.
     *
     * 
     */
    @Test
    public void getOutboundDnclistsDnclistIdImportstatusTest() {
        String dncListId = null;
        // ImportStatus response = api.getOutboundDnclistsDnclistIdImportstatus(dncListId);

        // TODO: test validations
    }
    
    /**
     * Query a list of Rule Sets.
     *
     * 
     */
    @Test
    public void getOutboundRulesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // RuleSetEntityListing response = api.getOutboundRulesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a Rule Set by ID.
     *
     * 
     */
    @Test
    public void getOutboundRulesetsRulesetIdTest() {
        String ruleSetId = null;
        // RuleSet response = api.getOutboundRulesetsRulesetId(ruleSetId);

        // TODO: test validations
    }
    
    /**
     * Query for a list of dialer campaign schedules.
     *
     * 
     */
    @Test
    public void getOutboundSchedulesCampaignsTest() {
        // List<CampaignSchedule> response = api.getOutboundSchedulesCampaigns();

        // TODO: test validations
    }
    
    /**
     * Get a dialer campaign schedule.
     *
     * 
     */
    @Test
    public void getOutboundSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        // CampaignSchedule response = api.getOutboundSchedulesCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Query for a list of dialer sequence schedules.
     *
     * 
     */
    @Test
    public void getOutboundSchedulesSequencesTest() {
        // List<SequenceSchedule> response = api.getOutboundSchedulesSequences();

        // TODO: test validations
    }
    
    /**
     * Get a dialer sequence schedule.
     *
     * 
     */
    @Test
    public void getOutboundSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        // SequenceSchedule response = api.getOutboundSchedulesSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer campaign sequences.
     *
     * 
     */
    @Test
    public void getOutboundSequencesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // CampaignSequenceEntityListing response = api.getOutboundSequences(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer campaign sequence.
     *
     * 
     */
    @Test
    public void getOutboundSequencesSequenceIdTest() {
        String sequenceId = null;
        // CampaignSequence response = api.getOutboundSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Get the Dialer wrap up code mapping.
     *
     * 
     */
    @Test
    public void getOutboundWrapupcodemappingsTest() {
        // WrapUpCodeMapping response = api.getOutboundWrapupcodemappings();

        // TODO: test validations
    }
    
    /**
     * Retrieves audits for dialer.
     *
     * 
     */
    @Test
    public void postOutboundAuditsTest() {
        DialerAuditRequest body = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        Boolean facetsOnly = null;
        // AuditSearchResult response = api.postOutboundAudits(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly);

        // TODO: test validations
    }
    
    /**
     * Create callable time set
     *
     * 
     */
    @Test
    public void postOutboundCallabletimesetsTest() {
        CallableTimeSet body = null;
        // CallableTimeSet response = api.postOutboundCallabletimesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void postOutboundCallanalysisresponsesetsTest() {
        ResponseSet body = null;
        // ResponseSet response = api.postOutboundCallanalysisresponsesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a campaign.
     *
     * 
     */
    @Test
    public void postOutboundCampaignsTest() {
        Campaign body = null;
        // Campaign response = api.postOutboundCampaigns(body);

        // TODO: test validations
    }
    
    /**
     * Schedule a Callback for a Dialer Campaign
     *
     * 
     */
    @Test
    public void postOutboundCampaignsCampaignIdCallbackScheduleTest() {
        String campaignId = null;
        ContactCallbackRequest body = null;
        // ContactCallbackRequest response = api.postOutboundCampaignsCampaignIdCallbackSchedule(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Get progress for a list of campaigns
     *
     * 
     */
    @Test
    public void postOutboundCampaignsProgressTest() {
        List<String> body = null;
        // List<CampaignProgress> response = api.postOutboundCampaignsProgress(body);

        // TODO: test validations
    }
    
    /**
     * Create a contact List.
     *
     * 
     */
    @Test
    public void postOutboundContactlistsTest() {
        ContactList body = null;
        // ContactList response = api.postOutboundContactlists(body);

        // TODO: test validations
    }
    
    /**
     * Add contacts to a contact list.
     *
     * 
     */
    @Test
    public void postOutboundContactlistsContactlistIdContactsTest() {
        String contactListId = null;
        List<DialerContact> body = null;
        Boolean priority = null;
        // DialerContact response = api.postOutboundContactlistsContactlistIdContacts(contactListId, body, priority);

        // TODO: test validations
    }
    
    /**
     * Initiate the export of a contact list.
     *
     * Returns 200 if received OK.
     */
    @Test
    public void postOutboundContactlistsContactlistIdExportTest() {
        String contactListId = null;
        // String response = api.postOutboundContactlistsContactlistIdExport(contactListId);

        // TODO: test validations
    }
    
    /**
     * Add phone numbers to a Dialer DNC list.
     *
     * 
     */
    @Test
    public void postOutboundConversationsConversationIdDncTest() {
        String conversationId = null;
        // Void response = api.postOutboundConversationsConversationIdDnc(conversationId);

        // TODO: test validations
    }
    
    /**
     * Create dialer DNC list
     *
     * 
     */
    @Test
    public void postOutboundDnclistsTest() {
        DncList body = null;
        // DncList response = api.postOutboundDnclists(body);

        // TODO: test validations
    }
    
    /**
     * Initiate the export of a dnc list.
     *
     * Returns 200 if received OK.
     */
    @Test
    public void postOutboundDnclistsDnclistIdExportTest() {
        String dncListId = null;
        // String response = api.postOutboundDnclistsDnclistIdExport(dncListId);

        // TODO: test validations
    }
    
    /**
     * Add phone numbers to a Dialer DNC list.
     *
     * 
     */
    @Test
    public void postOutboundDnclistsDnclistIdPhonenumbersTest() {
        String dncListId = null;
        List<String> body = null;
        // Void response = api.postOutboundDnclistsDnclistIdPhonenumbers(dncListId, body);

        // TODO: test validations
    }
    
    /**
     * Create a Dialer Call Analysis Response Set.
     *
     * 
     */
    @Test
    public void postOutboundRulesetsTest() {
        RuleSet body = null;
        // RuleSet response = api.postOutboundRulesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a new campaign sequence.
     *
     * 
     */
    @Test
    public void postOutboundSequencesTest() {
        CampaignSequence body = null;
        // CampaignSequence response = api.postOutboundSequences(body);

        // TODO: test validations
    }
    
    /**
     * Update callable time set
     *
     * 
     */
    @Test
    public void putOutboundCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        CallableTimeSet body = null;
        // CallableTimeSet response = api.putOutboundCallabletimesetsCallabletimesetId(callableTimeSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void putOutboundCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        ResponseSet body = null;
        // ResponseSet response = api.putOutboundCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a campaign.
     *
     * 
     */
    @Test
    public void putOutboundCampaignsCampaignIdTest() {
        String campaignId = null;
        Campaign body = null;
        // Campaign response = api.putOutboundCampaignsCampaignId(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Send notification that an agent&#39;s state changed 
     *
     * New agent state.
     */
    @Test
    public void putOutboundCampaignsCampaignIdAgentsUserIdTest() {
        String campaignId = null;
        String userId = null;
        Agent body = null;
        // String response = api.putOutboundCampaignsCampaignIdAgentsUserId(campaignId, userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a contact list.
     *
     * 
     */
    @Test
    public void putOutboundContactlistsContactlistIdTest() {
        String contactListId = null;
        ContactList body = null;
        // ContactList response = api.putOutboundContactlistsContactlistId(contactListId, body);

        // TODO: test validations
    }
    
    /**
     * Update a contact.
     *
     * 
     */
    @Test
    public void putOutboundContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        DialerContact body = null;
        // DialerContact response = api.putOutboundContactlistsContactlistIdContactsContactId(contactListId, contactId, body);

        // TODO: test validations
    }
    
    /**
     * Update dialer DNC list
     *
     * 
     */
    @Test
    public void putOutboundDnclistsDnclistIdTest() {
        String dncListId = null;
        DncList body = null;
        // DncList response = api.putOutboundDnclistsDnclistId(dncListId, body);

        // TODO: test validations
    }
    
    /**
     * Update a RuleSet.
     *
     * 
     */
    @Test
    public void putOutboundRulesetsRulesetIdTest() {
        String ruleSetId = null;
        RuleSet body = null;
        // RuleSet response = api.putOutboundRulesetsRulesetId(ruleSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new campaign schedule.
     *
     * 
     */
    @Test
    public void putOutboundSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        CampaignSchedule body = null;
        // CampaignSchedule response = api.putOutboundSchedulesCampaignsCampaignId(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new sequence schedule.
     *
     * 
     */
    @Test
    public void putOutboundSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        SequenceSchedule body = null;
        // SequenceSchedule response = api.putOutboundSchedulesSequencesSequenceId(sequenceId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new campaign sequence.
     *
     * 
     */
    @Test
    public void putOutboundSequencesSequenceIdTest() {
        String sequenceId = null;
        CampaignSequence body = null;
        // CampaignSequence response = api.putOutboundSequencesSequenceId(sequenceId, body);

        // TODO: test validations
    }
    
    /**
     * Update the Dialer wrap up code mapping.
     *
     * 
     */
    @Test
    public void putOutboundWrapupcodemappingsTest() {
        WrapUpCodeMapping body = null;
        // WrapUpCodeMapping response = api.putOutboundWrapupcodemappings(body);

        // TODO: test validations
    }
    
}
