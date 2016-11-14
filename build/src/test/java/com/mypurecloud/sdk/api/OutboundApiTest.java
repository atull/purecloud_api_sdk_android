package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.model.CallableTimeSet;
import com.mypurecloud.sdk.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.model.ResponseSet;
import com.mypurecloud.sdk.model.CampaignEntityListing;
import com.mypurecloud.sdk.model.Campaign;
import com.mypurecloud.sdk.model.CampaignDiagnostics;
import com.mypurecloud.sdk.model.CampaignProgress;
import com.mypurecloud.sdk.model.CampaignStats;
import com.mypurecloud.sdk.model.ContactListEntityListing;
import com.mypurecloud.sdk.model.ContactList;
import com.mypurecloud.sdk.model.DialerContact;
import com.mypurecloud.sdk.model.ExportUri;
import com.mypurecloud.sdk.model.ImportStatus;
import com.mypurecloud.sdk.model.DncListEntityListing;
import com.mypurecloud.sdk.model.DncList;
import com.mypurecloud.sdk.model.RuleSetEntityListing;
import com.mypurecloud.sdk.model.RuleSet;
import com.mypurecloud.sdk.model.CampaignSchedule;
import com.mypurecloud.sdk.model.SequenceSchedule;
import com.mypurecloud.sdk.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.model.CampaignSequence;
import com.mypurecloud.sdk.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.model.AuditSearchResult;
import com.mypurecloud.sdk.model.DialerAuditRequest;
import com.mypurecloud.sdk.model.ContactCallbackRequest;
import com.mypurecloud.sdk.model.Agent;
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
    public void deleteCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        // String response = api.deleteCallabletimesetsCallabletimesetId(callableTimeSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void deleteCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        // String response = api.deleteCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a campaign.
     *
     * 
     */
    @Test
    public void deleteCampaignsCampaignIdTest() {
        String campaignId = null;
        // String response = api.deleteCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Reset campaign progress and recycle the campaign
     *
     * 
     */
    @Test
    public void deleteCampaignsCampaignIdProgressTest() {
        String campaignId = null;
        // String response = api.deleteCampaignsCampaignIdProgress(campaignId);

        // TODO: test validations
    }
    
    /**
     * Delete a contact list.
     *
     * 
     */
    @Test
    public void deleteContactlistsContactlistIdTest() {
        String contactListId = null;
        // String response = api.deleteContactlistsContactlistId(contactListId);

        // TODO: test validations
    }
    
    /**
     * Delete a contact.
     *
     * 
     */
    @Test
    public void deleteContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        // String response = api.deleteContactlistsContactlistIdContactsContactId(contactListId, contactId);

        // TODO: test validations
    }
    
    /**
     * Delete dialer DNC list
     *
     * 
     */
    @Test
    public void deleteDnclistsDnclistIdTest() {
        String dncListId = null;
        // String response = api.deleteDnclistsDnclistId(dncListId);

        // TODO: test validations
    }
    
    /**
     * Delete a Rule set.
     *
     * 
     */
    @Test
    public void deleteRulesetsRulesetIdTest() {
        String ruleSetId = null;
        // String response = api.deleteRulesetsRulesetId(ruleSetId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer campaign schedule.
     *
     * 
     */
    @Test
    public void deleteSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        // String response = api.deleteSchedulesCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer sequence schedule.
     *
     * 
     */
    @Test
    public void deleteSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        // String response = api.deleteSchedulesSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Delete a dialer campaign sequence.
     *
     * 
     */
    @Test
    public void deleteSequencesSequenceIdTest() {
        String sequenceId = null;
        // String response = api.deleteSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Query callable time set list
     *
     * 
     */
    @Test
    public void getCallabletimesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // CallableTimeSetEntityListing response = api.getCallabletimesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get callable time set
     *
     * 
     */
    @Test
    public void getCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        // CallableTimeSet response = api.getCallabletimesetsCallabletimesetId(callableTimeSetId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer call analysis response sets.
     *
     * 
     */
    @Test
    public void getCallanalysisresponsesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // ResponseSetEntityListing response = api.getCallanalysisresponsesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void getCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        // ResponseSet response = api.getCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer campaigns.
     *
     * 
     */
    @Test
    public void getCampaignsTest() {
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
        // CampaignEntityListing response = api.getCampaigns(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get dialer campaign.
     *
     * 
     */
    @Test
    public void getCampaignsCampaignIdTest() {
        String campaignId = null;
        // Campaign response = api.getCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get campaign diagnostics
     *
     * 
     */
    @Test
    public void getCampaignsCampaignIdDiagnosticsTest() {
        String campaignId = null;
        // CampaignDiagnostics response = api.getCampaignsCampaignIdDiagnostics(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get campaign progress
     *
     * 
     */
    @Test
    public void getCampaignsCampaignIdProgressTest() {
        String campaignId = null;
        // CampaignProgress response = api.getCampaignsCampaignIdProgress(campaignId);

        // TODO: test validations
    }
    
    /**
     * Get statistics about a Dialer Campaign
     *
     * 
     */
    @Test
    public void getCampaignsCampaignIdStatsTest() {
        String campaignId = null;
        // CampaignStats response = api.getCampaignsCampaignIdStats(campaignId);

        // TODO: test validations
    }
    
    /**
     * Query a list of contact lists.
     *
     * 
     */
    @Test
    public void getContactlistsTest() {
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // ContactListEntityListing response = api.getContactlists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer contact list.
     *
     * 
     */
    @Test
    public void getContactlistsContactlistIdTest() {
        String contactListId = null;
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        // ContactList response = api.getContactlistsContactlistId(contactListId, includeImportStatus, includeSize);

        // TODO: test validations
    }
    
    /**
     * Get a contact.
     *
     * 
     */
    @Test
    public void getContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        // DialerContact response = api.getContactlistsContactlistIdContactsContactId(contactListId, contactId);

        // TODO: test validations
    }
    
    /**
     * Get the URI of a contact list export.
     *
     * 
     */
    @Test
    public void getContactlistsContactlistIdExportTest() {
        String contactListId = null;
        String download = null;
        // ExportUri response = api.getContactlistsContactlistIdExport(contactListId, download);

        // TODO: test validations
    }
    
    /**
     * Get dialer contactList import status.
     *
     * 
     */
    @Test
    public void getContactlistsContactlistIdImportstatusTest() {
        String contactListId = null;
        // ImportStatus response = api.getContactlistsContactlistIdImportstatus(contactListId);

        // TODO: test validations
    }
    
    /**
     * Query dialer DNC lists
     *
     * 
     */
    @Test
    public void getDnclistsTest() {
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // DncListEntityListing response = api.getDnclists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get dialer DNC list
     *
     * 
     */
    @Test
    public void getDnclistsDnclistIdTest() {
        String dncListId = null;
        Boolean includeImportStatus = null;
        Boolean includeSize = null;
        // DncList response = api.getDnclistsDnclistId(dncListId, includeImportStatus, includeSize);

        // TODO: test validations
    }
    
    /**
     * Get the URI of a DNC list export.
     *
     * 
     */
    @Test
    public void getDnclistsDnclistIdExportTest() {
        String dncListId = null;
        String download = null;
        // ExportUri response = api.getDnclistsDnclistIdExport(dncListId, download);

        // TODO: test validations
    }
    
    /**
     * Get dialer dncList import status.
     *
     * 
     */
    @Test
    public void getDnclistsDnclistIdImportstatusTest() {
        String dncListId = null;
        // ImportStatus response = api.getDnclistsDnclistIdImportstatus(dncListId);

        // TODO: test validations
    }
    
    /**
     * Query a list of Rule Sets.
     *
     * 
     */
    @Test
    public void getRulesetsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // RuleSetEntityListing response = api.getRulesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a Rule Set by ID.
     *
     * 
     */
    @Test
    public void getRulesetsRulesetIdTest() {
        String ruleSetId = null;
        // RuleSet response = api.getRulesetsRulesetId(ruleSetId);

        // TODO: test validations
    }
    
    /**
     * Query for a list of dialer campaign schedules.
     *
     * 
     */
    @Test
    public void getSchedulesCampaignsTest() {
        // List<CampaignSchedule> response = api.getSchedulesCampaigns();

        // TODO: test validations
    }
    
    /**
     * Get a dialer campaign schedule.
     *
     * 
     */
    @Test
    public void getSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        // CampaignSchedule response = api.getSchedulesCampaignsCampaignId(campaignId);

        // TODO: test validations
    }
    
    /**
     * Query for a list of dialer sequence schedules.
     *
     * 
     */
    @Test
    public void getSchedulesSequencesTest() {
        // List<SequenceSchedule> response = api.getSchedulesSequences();

        // TODO: test validations
    }
    
    /**
     * Get a dialer sequence schedule.
     *
     * 
     */
    @Test
    public void getSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        // SequenceSchedule response = api.getSchedulesSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Query a list of dialer campaign sequences.
     *
     * 
     */
    @Test
    public void getSequencesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String filterType = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        // CampaignSequenceEntityListing response = api.getSequences(pageSize, pageNumber, filterType, name, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a dialer campaign sequence.
     *
     * 
     */
    @Test
    public void getSequencesSequenceIdTest() {
        String sequenceId = null;
        // CampaignSequence response = api.getSequencesSequenceId(sequenceId);

        // TODO: test validations
    }
    
    /**
     * Get the Dialer wrap up code mapping.
     *
     * 
     */
    @Test
    public void getWrapupcodemappingsTest() {
        // WrapUpCodeMapping response = api.getWrapupcodemappings();

        // TODO: test validations
    }
    
    /**
     * Retrieves audits for dialer.
     *
     * 
     */
    @Test
    public void postAuditsTest() {
        DialerAuditRequest body = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        Boolean facetsOnly = null;
        // AuditSearchResult response = api.postAudits(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly);

        // TODO: test validations
    }
    
    /**
     * Create callable time set
     *
     * 
     */
    @Test
    public void postCallabletimesetsTest() {
        CallableTimeSet body = null;
        // CallableTimeSet response = api.postCallabletimesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void postCallanalysisresponsesetsTest() {
        ResponseSet body = null;
        // ResponseSet response = api.postCallanalysisresponsesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a campaign.
     *
     * 
     */
    @Test
    public void postCampaignsTest() {
        Campaign body = null;
        // Campaign response = api.postCampaigns(body);

        // TODO: test validations
    }
    
    /**
     * Schedule a Callback for a Dialer Campaign
     *
     * 
     */
    @Test
    public void postCampaignsCampaignIdCallbackScheduleTest() {
        String campaignId = null;
        ContactCallbackRequest body = null;
        // ContactCallbackRequest response = api.postCampaignsCampaignIdCallbackSchedule(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Get progress for a list of campaigns
     *
     * 
     */
    @Test
    public void postCampaignsProgressTest() {
        List<String> body = null;
        // List<CampaignProgress> response = api.postCampaignsProgress(body);

        // TODO: test validations
    }
    
    /**
     * Create a contact List.
     *
     * 
     */
    @Test
    public void postContactlistsTest() {
        ContactList body = null;
        // ContactList response = api.postContactlists(body);

        // TODO: test validations
    }
    
    /**
     * Add contacts to a contact list.
     *
     * 
     */
    @Test
    public void postContactlistsContactlistIdContactsTest() {
        String contactListId = null;
        List<DialerContact> body = null;
        Boolean priority = null;
        // List<DialerContact> response = api.postContactlistsContactlistIdContacts(contactListId, body, priority);

        // TODO: test validations
    }
    
    /**
     * Initiate the export of a contact list.
     *
     * Returns 200 if received OK.
     */
    @Test
    public void postContactlistsContactlistIdExportTest() {
        String contactListId = null;
        // String response = api.postContactlistsContactlistIdExport(contactListId);

        // TODO: test validations
    }
    
    /**
     * Add phone numbers to a Dialer DNC list.
     *
     * 
     */
    @Test
    public void postConversationsConversationIdDncTest() {
        String conversationId = null;
        // Void response = api.postConversationsConversationIdDnc(conversationId);

        // TODO: test validations
    }
    
    /**
     * Create dialer DNC list
     *
     * 
     */
    @Test
    public void postDnclistsTest() {
        DncList body = null;
        // DncList response = api.postDnclists(body);

        // TODO: test validations
    }
    
    /**
     * Initiate the export of a dnc list.
     *
     * Returns 200 if received OK.
     */
    @Test
    public void postDnclistsDnclistIdExportTest() {
        String dncListId = null;
        // String response = api.postDnclistsDnclistIdExport(dncListId);

        // TODO: test validations
    }
    
    /**
     * Add phone numbers to a Dialer DNC list.
     *
     * Only Internal DNC lists may be appended to
     */
    @Test
    public void postDnclistsDnclistIdPhonenumbersTest() {
        String dncListId = null;
        List<String> body = null;
        // Void response = api.postDnclistsDnclistIdPhonenumbers(dncListId, body);

        // TODO: test validations
    }
    
    /**
     * Create a Dialer Call Analysis Response Set.
     *
     * 
     */
    @Test
    public void postRulesetsTest() {
        RuleSet body = null;
        // RuleSet response = api.postRulesets(body);

        // TODO: test validations
    }
    
    /**
     * Create a new campaign sequence.
     *
     * 
     */
    @Test
    public void postSequencesTest() {
        CampaignSequence body = null;
        // CampaignSequence response = api.postSequences(body);

        // TODO: test validations
    }
    
    /**
     * Update callable time set
     *
     * 
     */
    @Test
    public void putCallabletimesetsCallabletimesetIdTest() {
        String callableTimeSetId = null;
        CallableTimeSet body = null;
        // CallableTimeSet response = api.putCallabletimesetsCallabletimesetId(callableTimeSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a dialer call analysis response set.
     *
     * 
     */
    @Test
    public void putCallanalysisresponsesetsCallanalysissetIdTest() {
        String callAnalysisSetId = null;
        ResponseSet body = null;
        // ResponseSet response = api.putCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a campaign.
     *
     * 
     */
    @Test
    public void putCampaignsCampaignIdTest() {
        String campaignId = null;
        Campaign body = null;
        // Campaign response = api.putCampaignsCampaignId(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Send notification that an agent&#39;s state changed 
     *
     * New agent state.
     */
    @Test
    public void putCampaignsCampaignIdAgentsUserIdTest() {
        String campaignId = null;
        String userId = null;
        Agent body = null;
        // String response = api.putCampaignsCampaignIdAgentsUserId(campaignId, userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a contact list.
     *
     * 
     */
    @Test
    public void putContactlistsContactlistIdTest() {
        String contactListId = null;
        ContactList body = null;
        // ContactList response = api.putContactlistsContactlistId(contactListId, body);

        // TODO: test validations
    }
    
    /**
     * Update a contact.
     *
     * 
     */
    @Test
    public void putContactlistsContactlistIdContactsContactIdTest() {
        String contactListId = null;
        String contactId = null;
        DialerContact body = null;
        // DialerContact response = api.putContactlistsContactlistIdContactsContactId(contactListId, contactId, body);

        // TODO: test validations
    }
    
    /**
     * Update dialer DNC list
     *
     * 
     */
    @Test
    public void putDnclistsDnclistIdTest() {
        String dncListId = null;
        DncList body = null;
        // DncList response = api.putDnclistsDnclistId(dncListId, body);

        // TODO: test validations
    }
    
    /**
     * Update a RuleSet.
     *
     * 
     */
    @Test
    public void putRulesetsRulesetIdTest() {
        String ruleSetId = null;
        RuleSet body = null;
        // RuleSet response = api.putRulesetsRulesetId(ruleSetId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new campaign schedule.
     *
     * 
     */
    @Test
    public void putSchedulesCampaignsCampaignIdTest() {
        String campaignId = null;
        CampaignSchedule body = null;
        // CampaignSchedule response = api.putSchedulesCampaignsCampaignId(campaignId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new sequence schedule.
     *
     * 
     */
    @Test
    public void putSchedulesSequencesSequenceIdTest() {
        String sequenceId = null;
        SequenceSchedule body = null;
        // SequenceSchedule response = api.putSchedulesSequencesSequenceId(sequenceId, body);

        // TODO: test validations
    }
    
    /**
     * Update a new campaign sequence.
     *
     * 
     */
    @Test
    public void putSequencesSequenceIdTest() {
        String sequenceId = null;
        CampaignSequence body = null;
        // CampaignSequence response = api.putSequencesSequenceId(sequenceId, body);

        // TODO: test validations
    }
    
    /**
     * Update the Dialer wrap up code mapping.
     *
     * 
     */
    @Test
    public void putWrapupcodemappingsTest() {
        WrapUpCodeMapping body = null;
        // WrapUpCodeMapping response = api.putWrapupcodemappings(body);

        // TODO: test validations
    }
    
}
