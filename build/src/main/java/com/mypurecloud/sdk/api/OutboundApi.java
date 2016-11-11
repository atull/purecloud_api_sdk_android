package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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
  Call<String> deleteCallabletimesetsCallabletimesetId(
    @Path("callableTimeSetId") String callableTimeSetId
  );

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<String> deleteCallanalysisresponsesetsCallanalysissetId(
    @Path("callAnalysisSetId") String callAnalysisSetId
  );

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/campaigns/{campaignId}")
  Call<String> deleteCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/campaigns/{campaignId}/progress")
  Call<String> deleteCampaignsCampaignIdProgress(
    @Path("campaignId") String campaignId
  );

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/contactlists/{contactListId}")
  Call<String> deleteContactlistsContactlistId(
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
  Call<String> deleteContactlistsContactlistIdContactsContactId(
    @Path("contactListId") String contactListId, @Path("contactId") String contactId
  );

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/dnclists/{dncListId}")
  Call<String> deleteDnclistsDnclistId(
    @Path("dncListId") String dncListId
  );

  /**
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/rulesets/{ruleSetId}")
  Call<String> deleteRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId
  );

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<String> deleteSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<String> deleteSchedulesSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/outbound/sequences/{sequenceId}")
  Call<String> deleteSequencesSequenceId(
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
  Call<CallableTimeSetEntityListing> getCallabletimesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return Call<CallableTimeSet>
   */
  
  @GET("api/v2/outbound/callabletimesets/{callableTimeSetId}")
  Call<CallableTimeSet> getCallabletimesetsCallabletimesetId(
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
  Call<ResponseSetEntityListing> getCallanalysisresponsesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return Call<ResponseSet>
   */
  
  @GET("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<ResponseSet> getCallanalysisresponsesetsCallanalysissetId(
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
  Call<CampaignEntityListing> getCampaigns(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("contactListId") String contactListId, @Query("dncListId") String dncListId, @Query("distributionQueueId") String distributionQueueId, @Query("edgeGroupId") String edgeGroupId, @Query("callAnalysisResponseSetId") String callAnalysisResponseSetId, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<Campaign>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}")
  Call<Campaign> getCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignDiagnostics>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/diagnostics")
  Call<CampaignDiagnostics> getCampaignsCampaignIdDiagnostics(
    @Path("campaignId") String campaignId
  );

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignProgress>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/progress")
  Call<CampaignProgress> getCampaignsCampaignIdProgress(
    @Path("campaignId") String campaignId
  );

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignStats>
   */
  
  @GET("api/v2/outbound/campaigns/{campaignId}/stats")
  Call<CampaignStats> getCampaignsCampaignIdStats(
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
  Call<ContactListEntityListing> getContactlists(
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
  Call<ContactList> getContactlistsContactlistId(
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
  Call<DialerContact> getContactlistsContactlistIdContactsContactId(
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
  Call<ExportUri> getContactlistsContactlistIdExport(
    @Path("contactListId") String contactListId, @Query("download") String download
  );

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return Call<ImportStatus>
   */
  
  @GET("api/v2/outbound/contactlists/{contactListId}/importstatus")
  Call<ImportStatus> getContactlistsContactlistIdImportstatus(
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
  Call<DncListEntityListing> getDnclists(
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
  Call<DncList> getDnclistsDnclistId(
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
  Call<ExportUri> getDnclistsDnclistIdExport(
    @Path("dncListId") String dncListId, @Query("download") String download
  );

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return Call<ImportStatus>
   */
  
  @GET("api/v2/outbound/dnclists/{dncListId}/importstatus")
  Call<ImportStatus> getDnclistsDnclistIdImportstatus(
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
  Call<RuleSetEntityListing> getRulesets(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return Call<RuleSet>
   */
  
  @GET("api/v2/outbound/rulesets/{ruleSetId}")
  Call<RuleSet> getRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId
  );

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return Call<List<CampaignSchedule>>
   */
  
  @GET("api/v2/outbound/schedules/campaigns")
  Call<List<CampaignSchedule>> getSchedulesCampaigns();
    

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return Call<CampaignSchedule>
   */
  
  @GET("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<CampaignSchedule> getSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId
  );

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return Call<List<SequenceSchedule>>
   */
  
  @GET("api/v2/outbound/schedules/sequences")
  Call<List<SequenceSchedule>> getSchedulesSequences();
    

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return Call<SequenceSchedule>
   */
  
  @GET("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<SequenceSchedule> getSchedulesSequencesSequenceId(
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
  Call<CampaignSequenceEntityListing> getSequences(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("filterType") String filterType, @Query("name") String name, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return Call<CampaignSequence>
   */
  
  @GET("api/v2/outbound/sequences/{sequenceId}")
  Call<CampaignSequence> getSequencesSequenceId(
    @Path("sequenceId") String sequenceId
  );

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return Call<WrapUpCodeMapping>
   */
  
  @GET("api/v2/outbound/wrapupcodemappings")
  Call<WrapUpCodeMapping> getWrapupcodemappings();
    

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return Call<AuditSearchResult>
   */
  
  @POST("api/v2/outbound/audits")
  Call<AuditSearchResult> postAudits(
    @Body DialerAuditRequest body, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("facetsOnly") Boolean facetsOnly
  );

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return Call<CallableTimeSet>
   */
  
  @POST("api/v2/outbound/callabletimesets")
  Call<CallableTimeSet> postCallabletimesets(
    @Body CallableTimeSet body
  );

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return Call<ResponseSet>
   */
  
  @POST("api/v2/outbound/callanalysisresponsesets")
  Call<ResponseSet> postCallanalysisresponsesets(
    @Body ResponseSet body
  );

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @return Call<Campaign>
   */
  
  @POST("api/v2/outbound/campaigns")
  Call<Campaign> postCampaigns(
    @Body Campaign body
  );

  /**
   * Schedule a Callback for a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return Call<ContactCallbackRequest>
   */
  
  @POST("api/v2/outbound/campaigns/{campaignId}/callback/schedule")
  Call<ContactCallbackRequest> postCampaignsCampaignIdCallbackSchedule(
    @Path("campaignId") String campaignId, @Body ContactCallbackRequest body
  );

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return Call<List<CampaignProgress>>
   */
  
  @POST("api/v2/outbound/campaigns/progress")
  Call<List<CampaignProgress>> postCampaignsProgress(
    @Body List<String> body
  );

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return Call<ContactList>
   */
  
  @POST("api/v2/outbound/contactlists")
  Call<ContactList> postContactlists(
    @Body ContactList body
  );

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @return Call<List<DialerContact>>
   */
  
  @POST("api/v2/outbound/contactlists/{contactListId}/contacts")
  Call<List<DialerContact>> postContactlistsContactlistIdContacts(
    @Path("contactListId") String contactListId, @Body List<DialerContact> body, @Query("priority") Boolean priority
  );

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/outbound/contactlists/{contactListId}/export")
  Call<String> postContactlistsContactlistIdExport(
    @Path("contactListId") String contactListId
  );

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/outbound/conversations/{conversationId}/dnc")
  Call<Void> postConversationsConversationIdDnc(
    @Path("conversationId") String conversationId
  );

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return Call<DncList>
   */
  
  @POST("api/v2/outbound/dnclists")
  Call<DncList> postDnclists(
    @Body DncList body
  );

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/outbound/dnclists/{dncListId}/export")
  Call<String> postDnclistsDnclistIdExport(
    @Path("dncListId") String dncListId
  );

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/outbound/dnclists/{dncListId}/phonenumbers")
  Call<Void> postDnclistsDnclistIdPhonenumbers(
    @Path("dncListId") String dncListId, @Body List<String> body
  );

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (required)
   * @return Call<RuleSet>
   */
  
  @POST("api/v2/outbound/rulesets")
  Call<RuleSet> postRulesets(
    @Body RuleSet body
  );

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return Call<CampaignSequence>
   */
  
  @POST("api/v2/outbound/sequences")
  Call<CampaignSequence> postSequences(
    @Body CampaignSequence body
  );

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return Call<CallableTimeSet>
   */
  
  @PUT("api/v2/outbound/callabletimesets/{callableTimeSetId}")
  Call<CallableTimeSet> putCallabletimesetsCallabletimesetId(
    @Path("callableTimeSetId") String callableTimeSetId, @Body CallableTimeSet body
  );

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return Call<ResponseSet>
   */
  
  @PUT("api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}")
  Call<ResponseSet> putCallanalysisresponsesetsCallanalysissetId(
    @Path("callAnalysisSetId") String callAnalysisSetId, @Body ResponseSet body
  );

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @return Call<Campaign>
   */
  
  @PUT("api/v2/outbound/campaigns/{campaignId}")
  Call<Campaign> putCampaignsCampaignId(
    @Path("campaignId") String campaignId, @Body Campaign body
  );

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (required)
   * @return Call<String>
   */
  
  @PUT("api/v2/outbound/campaigns/{campaignId}/agents/{userId}")
  Call<String> putCampaignsCampaignIdAgentsUserId(
    @Path("campaignId") String campaignId, @Path("userId") String userId, @Body Agent body
  );

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return Call<ContactList>
   */
  
  @PUT("api/v2/outbound/contactlists/{contactListId}")
  Call<ContactList> putContactlistsContactlistId(
    @Path("contactListId") String contactListId, @Body ContactList body
  );

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return Call<DialerContact>
   */
  
  @PUT("api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}")
  Call<DialerContact> putContactlistsContactlistIdContactsContactId(
    @Path("contactListId") String contactListId, @Path("contactId") String contactId, @Body DialerContact body
  );

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return Call<DncList>
   */
  
  @PUT("api/v2/outbound/dnclists/{dncListId}")
  Call<DncList> putDnclistsDnclistId(
    @Path("dncListId") String dncListId, @Body DncList body
  );

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return Call<RuleSet>
   */
  
  @PUT("api/v2/outbound/rulesets/{ruleSetId}")
  Call<RuleSet> putRulesetsRulesetId(
    @Path("ruleSetId") String ruleSetId, @Body RuleSet body
  );

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return Call<CampaignSchedule>
   */
  
  @PUT("api/v2/outbound/schedules/campaigns/{campaignId}")
  Call<CampaignSchedule> putSchedulesCampaignsCampaignId(
    @Path("campaignId") String campaignId, @Body CampaignSchedule body
  );

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return Call<SequenceSchedule>
   */
  
  @PUT("api/v2/outbound/schedules/sequences/{sequenceId}")
  Call<SequenceSchedule> putSchedulesSequencesSequenceId(
    @Path("sequenceId") String sequenceId, @Body SequenceSchedule body
  );

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return Call<CampaignSequence>
   */
  
  @PUT("api/v2/outbound/sequences/{sequenceId}")
  Call<CampaignSequence> putSequencesSequenceId(
    @Path("sequenceId") String sequenceId, @Body CampaignSequence body
  );

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return Call<WrapUpCodeMapping>
   */
  
  @PUT("api/v2/outbound/wrapupcodemappings")
  Call<WrapUpCodeMapping> putWrapupcodemappings(
    @Body WrapUpCodeMapping body
  );

}
