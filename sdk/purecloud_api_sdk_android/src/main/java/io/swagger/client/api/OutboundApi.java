package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OutboundApi {
  /**
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/callabletimesets/{callableTimeSetId}")
  Call<String> deleteOutboundCallabletimesetsCallabletimesetId(
    @Path("callableTimeSetId") String callableTimeSetId
  );

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<String> deleteOutboundCallanalysisresponsesetsCallanalysissetId(
    @Path("callAnalysisSetId") String callAnalysisSetId
  );

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/campaigns/{campaignId}")
  Call<String> deleteOutboundCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/campaigns/{campaignId}/progress")
  Call<String> deleteOutboundCampaignsCampaignIdProgress(
    @Path("campaignId") String campaignId
  );

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/contactlists/{contactListId}")
  Call<String> deleteOutboundContactlistsContactlistId(
    @Path("contactListId") String contactListId
  );

  /**
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}")
  Call<String> deleteOutboundContactlistsContactlistIdContactsContactId(
    @Path("contactListId") String contactListId, @Path("contactId") String contactId
  );

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/dnclists/{dncListId}")
  Call<String> deleteOutboundDnclistsDnclistId(
    @Path("dncListId") String dncListId
  );

  /**
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/rulesets/{ruleSetId}")
  Call<String> deleteOutboundRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId
  );

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<String> deleteOutboundSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<String> deleteOutboundSchedulesSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/sequences/{sequenceId}")
  Call<String> deleteOutboundSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<CallableTimeSetEntityListing>
   */
  
  @GET("api/v2/outbound/callabletimesets")
  Call<CallableTimeSetEntityListing> getOutboundCallabletimesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return Call<CallableTimeSet>
   */
  
  @GET("api/v2/outbound/callabletimesets/{callableTimeSetId}")
  Call<CallableTimeSet> getOutboundCallabletimesetsCallabletimesetId(
    @Path("callableTimeSetId") String callableTimeSetId
  );

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<ResponseSetEntityListing>
   */
  
  @GET("api/v2/outbound/callanalysisresponsesets")
  Call<ResponseSetEntityListing> getOutboundCallanalysisresponsesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return Call<ResponseSet>
   */
  
  @GET("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<ResponseSet> getOutboundCallanalysisresponsesetsCallanalysissetId(
    @Path("callAnalysisSetId") String callAnalysisSetId
  );

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListId DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<CampaignEntityListing>
   */
  
  @GET("api/v2/outbound/campaigns")
  Call<CampaignEntityListing> getOutboundCampaigns(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("contactListId") String contactListId, @Query("dncListId") String dncListId, @Query("distributionQueueId") String distributionQueueId, @Query("edgeGroupId") String edgeGroupId, @Query("callAnalysisResponseSetId") String callAnalysisResponseSetId, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<Campaign>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}")
  Call<Campaign> getOutboundCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignDiagnostics>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/diagnostics")
  Call<CampaignDiagnostics> getOutboundCampaignsCampaignIdDiagnostics(
    @Path("campaignId") String campaignId
  );

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignProgress>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/progress")
  Call<CampaignProgress> getOutboundCampaignsCampaignIdProgress(
    @Path("campaignId") String campaignId
  );

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignStats>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/stats")
  Call<CampaignStats> getOutboundCampaignsCampaignIdStats(
    @Path("campaignId") String campaignId
  );

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<ContactListEntityListing>
   */
  
  @GET("api/v2/outbound/contactlists")
  Call<ContactListEntityListing> getOutboundContactlists(
    @Query("includeImportStatus") Boolean includeImportStatus, @Query("includeSize") Boolean includeSize, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return Call<ContactList>
   */
  
  @GET("api/v2/outbound/contactlists/{contactListId}")
  Call<ContactList> getOutboundContactlistsContactlistId(
    @Path("contactListId") String contactListId, @Query("includeImportStatus") Boolean includeImportStatus, @Query("includeSize") Boolean includeSize
  );

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return Call<DialerContact>
   */
  
  @GET("api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}")
  Call<DialerContact> getOutboundContactlistsContactlistIdContactsContactId(
    @Path("contactListId") String contactListId, @Path("contactId") String contactId
  );

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return Call<ExportUri>
   */
  
  @GET("api/v2/outbound/contactlists/{contactListId}/export")
  Call<ExportUri> getOutboundContactlistsContactlistIdExport(
    @Path("contactListId") String contactListId, @Query("download") String download
  );

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return Call<ImportStatus>
   */
  
  @GET("api/v2/outbound/contactlists/{contactListId}/importstatus")
  Call<ImportStatus> getOutboundContactlistsContactlistIdImportstatus(
    @Path("contactListId") String contactListId
  );

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return Call<DncListEntityListing>
   */
  
  @GET("api/v2/outbound/dnclists")
  Call<DncListEntityListing> getOutboundDnclists(
    @Query("includeImportStatus") Boolean includeImportStatus, @Query("includeSize") Boolean includeSize, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return Call<DncList>
   */
  
  @GET("api/v2/outbound/dnclists/{dncListId}")
  Call<DncList> getOutboundDnclistsDnclistId(
    @Path("dncListId") String dncListId, @Query("includeImportStatus") Boolean includeImportStatus, @Query("includeSize") Boolean includeSize
  );

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return Call<ExportUri>
   */
  
  @GET("api/v2/outbound/dnclists/{dncListId}/export")
  Call<ExportUri> getOutboundDnclistsDnclistIdExport(
    @Path("dncListId") String dncListId, @Query("download") String download
  );

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return Call<ImportStatus>
   */
  
  @GET("api/v2/outbound/dnclists/{dncListId}/importstatus")
  Call<ImportStatus> getOutboundDnclistsDnclistIdImportstatus(
    @Path("dncListId") String dncListId
  );

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<RuleSetEntityListing>
   */
  
  @GET("api/v2/outbound/rulesets")
  Call<RuleSetEntityListing> getOutboundRulesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return Call<RuleSet>
   */
  
  @GET("api/v2/outbound/rulesets/{ruleSetId}")
  Call<RuleSet> getOutboundRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId
  );

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return Call<List<CampaignSchedule>>
   */
  
  @GET("api/v2/outbound/schedules/campaigns")
  Call<List<CampaignSchedule>> getOutboundSchedulesCampaigns();
    

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignSchedule>
   */
  
  @GET("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<CampaignSchedule> getOutboundSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return Call<List<SequenceSchedule>>
   */
  
  @GET("api/v2/outbound/schedules/sequences")
  Call<List<SequenceSchedule>> getOutboundSchedulesSequences();
    

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return Call<SequenceSchedule>
   */
  
  @GET("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<SequenceSchedule> getOutboundSchedulesSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to PREFIX)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return Call<CampaignSequenceEntityListing>
   */
  
  @GET("api/v2/outbound/sequences")
  Call<CampaignSequenceEntityListing> getOutboundSequences(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return Call<CampaignSequence>
   */
  
  @GET("api/v2/outbound/sequences/{sequenceId}")
  Call<CampaignSequence> getOutboundSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return Call<WrapUpCodeMapping>
   */
  
  @GET("api/v2/outbound/wrapupcodemappings")
  Call<WrapUpCodeMapping> getOutboundWrapupcodemappings();
    

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return Call<AuditSearchResult>
   */
  
  @POST("api/v2/outbound/audits")
  Call<AuditSearchResult> postOutboundAudits(
    @Body DialerAuditRequest body, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("facetsOnly") Boolean facetsOnly
  );

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (optional)
   * @return Call<CallableTimeSet>
   */
  
  @POST("api/v2/outbound/callabletimesets")
  Call<CallableTimeSet> postOutboundCallabletimesets(
    @Body CallableTimeSet body
  );

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (optional)
   * @return Call<ResponseSet>
   */
  
  @POST("api/v2/outbound/callanalysisresponsesets")
  Call<ResponseSet> postOutboundCallanalysisresponsesets(
    @Body ResponseSet body
  );

  /**
   * Create a campaign.
   * 
   * @param body Campaign (optional)
   * @return Call<Campaign>
   */
  
  @POST("api/v2/outbound/campaigns")
  Call<Campaign> postOutboundCampaigns(
    @Body Campaign body
  );

  /**
   * Schedule a Callback for a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (optional)
   * @return Call<ContactCallbackRequest>
   */
  
  @POST("api/v2/outbound/campaigns/{campaignId}/callback/schedule")
  Call<ContactCallbackRequest> postOutboundCampaignsCampaignIdCallbackSchedule(
    @Path("campaignId") String campaignId, @Body ContactCallbackRequest body
  );

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (optional)
   * @return Call<List<CampaignProgress>>
   */
  
  @POST("api/v2/outbound/campaigns/progress")
  Call<List<CampaignProgress>> postOutboundCampaignsProgress(
    @Body List<String> body
  );

  /**
   * Create a contact List.
   * 
   * @param body ContactList (optional)
   * @return Call<ContactList>
   */
  
  @POST("api/v2/outbound/contactlists")
  Call<ContactList> postOutboundContactlists(
    @Body ContactList body
  );

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (optional)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @return Call<DialerContact>
   */
  
  @POST("api/v2/outbound/contactlists/{contactListId}/contacts")
  Call<DialerContact> postOutboundContactlistsContactlistIdContacts(
    @Path("contactListId") String contactListId, @Body List<DialerContact> body, @Query("priority") Boolean priority
  );

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/outbound/contactlists/{contactListId}/export")
  Call<String> postOutboundContactlistsContactlistIdExport(
    @Path("contactListId") String contactListId
  );

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/outbound/conversations/{conversationId}/dnc")
  Call<Void> postOutboundConversationsConversationIdDnc(
    @Path("conversationId") String conversationId
  );

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (optional)
   * @return Call<DncList>
   */
  
  @POST("api/v2/outbound/dnclists")
  Call<DncList> postOutboundDnclists(
    @Body DncList body
  );

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/outbound/dnclists/{dncListId}/export")
  Call<String> postOutboundDnclistsDnclistIdExport(
    @Path("dncListId") String dncListId
  );

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/outbound/dnclists/{dncListId}/phonenumbers")
  Call<Void> postOutboundDnclistsDnclistIdPhonenumbers(
    @Path("dncListId") String dncListId, @Body List<String> body
  );

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (optional)
   * @return Call<RuleSet>
   */
  
  @POST("api/v2/outbound/rulesets")
  Call<RuleSet> postOutboundRulesets(
    @Body RuleSet body
  );

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (optional)
   * @return Call<CampaignSequence>
   */
  
  @POST("api/v2/outbound/sequences")
  Call<CampaignSequence> postOutboundSequences(
    @Body CampaignSequence body
  );

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (optional)
   * @return Call<CallableTimeSet>
   */
  
  @PUT("api/v2/outbound/callabletimesets/{callableTimeSetId}")
  Call<CallableTimeSet> putOutboundCallabletimesetsCallabletimesetId(
    @Path("callableTimeSetId") String callableTimeSetId, @Body CallableTimeSet body
  );

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (optional)
   * @return Call<ResponseSet>
   */
  
  @PUT("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<ResponseSet> putOutboundCallanalysisresponsesetsCallanalysissetId(
    @Path("callAnalysisSetId") String callAnalysisSetId, @Body ResponseSet body
  );

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (optional)
   * @return Call<Campaign>
   */
  
  @PUT("api/v2/outbound/campaigns/{campaignId}")
  Call<Campaign> putOutboundCampaignsCampaignId(
    @Path("campaignId") String campaignId, @Body Campaign body
  );

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (optional)
   * @return Call<String>
   */
  
  @PUT("api/v2/outbound/campaigns/{campaignId}/agents/{userId}")
  Call<String> putOutboundCampaignsCampaignIdAgentsUserId(
    @Path("campaignId") String campaignId, @Path("userId") String userId, @Body Agent body
  );

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (optional)
   * @return Call<ContactList>
   */
  
  @PUT("api/v2/outbound/contactlists/{contactListId}")
  Call<ContactList> putOutboundContactlistsContactlistId(
    @Path("contactListId") String contactListId, @Body ContactList body
  );

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (optional)
   * @return Call<DialerContact>
   */
  
  @PUT("api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}")
  Call<DialerContact> putOutboundContactlistsContactlistIdContactsContactId(
    @Path("contactListId") String contactListId, @Path("contactId") String contactId, @Body DialerContact body
  );

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (optional)
   * @return Call<DncList>
   */
  
  @PUT("api/v2/outbound/dnclists/{dncListId}")
  Call<DncList> putOutboundDnclistsDnclistId(
    @Path("dncListId") String dncListId, @Body DncList body
  );

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (optional)
   * @return Call<RuleSet>
   */
  
  @PUT("api/v2/outbound/rulesets/{ruleSetId}")
  Call<RuleSet> putOutboundRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId, @Body RuleSet body
  );

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (optional)
   * @return Call<CampaignSchedule>
   */
  
  @PUT("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<CampaignSchedule> putOutboundSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId, @Body CampaignSchedule body
  );

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (optional)
   * @return Call<SequenceSchedule>
   */
  
  @PUT("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<SequenceSchedule> putOutboundSchedulesSequencesSequenceId(
    @Path("sequenceId") String sequenceId, @Body SequenceSchedule body
  );

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (optional)
   * @return Call<CampaignSequence>
   */
  
  @PUT("api/v2/outbound/sequences/{sequenceId}")
  Call<CampaignSequence> putOutboundSequencesSequenceId(
    @Path("sequenceId") String sequenceId, @Body CampaignSequence body
  );

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (optional)
   * @return Call<WrapUpCodeMapping>
   */
  
  @PUT("api/v2/outbound/wrapupcodemappings")
  Call<WrapUpCodeMapping> putOutboundWrapupcodemappings(
    @Body WrapUpCodeMapping body
  );

}
