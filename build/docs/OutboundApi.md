# OutboundApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCallabletimesetsCallabletimesetId**](OutboundApi.md#deleteCallabletimesetsCallabletimesetId) | **DELETE** api/v2/outbound/callabletimesets/{callableTimeSetId} | Delete callable time set
[**deleteCallanalysisresponsesetsCallanalysissetId**](OutboundApi.md#deleteCallanalysisresponsesetsCallanalysissetId) | **DELETE** api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Delete a dialer call analysis response set.
[**deleteCampaignsCampaignId**](OutboundApi.md#deleteCampaignsCampaignId) | **DELETE** api/v2/outbound/campaigns/{campaignId} | Delete a campaign.
[**deleteCampaignsCampaignIdProgress**](OutboundApi.md#deleteCampaignsCampaignIdProgress) | **DELETE** api/v2/outbound/campaigns/{campaignId}/progress | Reset campaign progress and recycle the campaign
[**deleteContactlistsContactlistId**](OutboundApi.md#deleteContactlistsContactlistId) | **DELETE** api/v2/outbound/contactlists/{contactListId} | Delete a contact list.
[**deleteContactlistsContactlistIdContactsContactId**](OutboundApi.md#deleteContactlistsContactlistIdContactsContactId) | **DELETE** api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Delete a contact.
[**deleteDnclistsDnclistId**](OutboundApi.md#deleteDnclistsDnclistId) | **DELETE** api/v2/outbound/dnclists/{dncListId} | Delete dialer DNC list
[**deleteRulesetsRulesetId**](OutboundApi.md#deleteRulesetsRulesetId) | **DELETE** api/v2/outbound/rulesets/{ruleSetId} | Delete a Rule set.
[**deleteSchedulesCampaignsCampaignId**](OutboundApi.md#deleteSchedulesCampaignsCampaignId) | **DELETE** api/v2/outbound/schedules/campaigns/{campaignId} | Delete a dialer campaign schedule.
[**deleteSchedulesSequencesSequenceId**](OutboundApi.md#deleteSchedulesSequencesSequenceId) | **DELETE** api/v2/outbound/schedules/sequences/{sequenceId} | Delete a dialer sequence schedule.
[**deleteSequencesSequenceId**](OutboundApi.md#deleteSequencesSequenceId) | **DELETE** api/v2/outbound/sequences/{sequenceId} | Delete a dialer campaign sequence.
[**getCallabletimesets**](OutboundApi.md#getCallabletimesets) | **GET** api/v2/outbound/callabletimesets | Query callable time set list
[**getCallabletimesetsCallabletimesetId**](OutboundApi.md#getCallabletimesetsCallabletimesetId) | **GET** api/v2/outbound/callabletimesets/{callableTimeSetId} | Get callable time set
[**getCallanalysisresponsesets**](OutboundApi.md#getCallanalysisresponsesets) | **GET** api/v2/outbound/callanalysisresponsesets | Query a list of dialer call analysis response sets.
[**getCallanalysisresponsesetsCallanalysissetId**](OutboundApi.md#getCallanalysisresponsesetsCallanalysissetId) | **GET** api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Get a dialer call analysis response set.
[**getCampaigns**](OutboundApi.md#getCampaigns) | **GET** api/v2/outbound/campaigns | Query a list of dialer campaigns.
[**getCampaignsCampaignId**](OutboundApi.md#getCampaignsCampaignId) | **GET** api/v2/outbound/campaigns/{campaignId} | Get dialer campaign.
[**getCampaignsCampaignIdDiagnostics**](OutboundApi.md#getCampaignsCampaignIdDiagnostics) | **GET** api/v2/outbound/campaigns/{campaignId}/diagnostics | Get campaign diagnostics
[**getCampaignsCampaignIdProgress**](OutboundApi.md#getCampaignsCampaignIdProgress) | **GET** api/v2/outbound/campaigns/{campaignId}/progress | Get campaign progress
[**getCampaignsCampaignIdStats**](OutboundApi.md#getCampaignsCampaignIdStats) | **GET** api/v2/outbound/campaigns/{campaignId}/stats | Get statistics about a Dialer Campaign
[**getContactlists**](OutboundApi.md#getContactlists) | **GET** api/v2/outbound/contactlists | Query a list of contact lists.
[**getContactlistsContactlistId**](OutboundApi.md#getContactlistsContactlistId) | **GET** api/v2/outbound/contactlists/{contactListId} | Get a dialer contact list.
[**getContactlistsContactlistIdContactsContactId**](OutboundApi.md#getContactlistsContactlistIdContactsContactId) | **GET** api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Get a contact.
[**getContactlistsContactlistIdExport**](OutboundApi.md#getContactlistsContactlistIdExport) | **GET** api/v2/outbound/contactlists/{contactListId}/export | Get the URI of a contact list export.
[**getContactlistsContactlistIdImportstatus**](OutboundApi.md#getContactlistsContactlistIdImportstatus) | **GET** api/v2/outbound/contactlists/{contactListId}/importstatus | Get dialer contactList import status.
[**getDnclists**](OutboundApi.md#getDnclists) | **GET** api/v2/outbound/dnclists | Query dialer DNC lists
[**getDnclistsDnclistId**](OutboundApi.md#getDnclistsDnclistId) | **GET** api/v2/outbound/dnclists/{dncListId} | Get dialer DNC list
[**getDnclistsDnclistIdExport**](OutboundApi.md#getDnclistsDnclistIdExport) | **GET** api/v2/outbound/dnclists/{dncListId}/export | Get the URI of a DNC list export.
[**getDnclistsDnclistIdImportstatus**](OutboundApi.md#getDnclistsDnclistIdImportstatus) | **GET** api/v2/outbound/dnclists/{dncListId}/importstatus | Get dialer dncList import status.
[**getRulesets**](OutboundApi.md#getRulesets) | **GET** api/v2/outbound/rulesets | Query a list of Rule Sets.
[**getRulesetsRulesetId**](OutboundApi.md#getRulesetsRulesetId) | **GET** api/v2/outbound/rulesets/{ruleSetId} | Get a Rule Set by ID.
[**getSchedulesCampaigns**](OutboundApi.md#getSchedulesCampaigns) | **GET** api/v2/outbound/schedules/campaigns | Query for a list of dialer campaign schedules.
[**getSchedulesCampaignsCampaignId**](OutboundApi.md#getSchedulesCampaignsCampaignId) | **GET** api/v2/outbound/schedules/campaigns/{campaignId} | Get a dialer campaign schedule.
[**getSchedulesSequences**](OutboundApi.md#getSchedulesSequences) | **GET** api/v2/outbound/schedules/sequences | Query for a list of dialer sequence schedules.
[**getSchedulesSequencesSequenceId**](OutboundApi.md#getSchedulesSequencesSequenceId) | **GET** api/v2/outbound/schedules/sequences/{sequenceId} | Get a dialer sequence schedule.
[**getSequences**](OutboundApi.md#getSequences) | **GET** api/v2/outbound/sequences | Query a list of dialer campaign sequences.
[**getSequencesSequenceId**](OutboundApi.md#getSequencesSequenceId) | **GET** api/v2/outbound/sequences/{sequenceId} | Get a dialer campaign sequence.
[**getWrapupcodemappings**](OutboundApi.md#getWrapupcodemappings) | **GET** api/v2/outbound/wrapupcodemappings | Get the Dialer wrap up code mapping.
[**postAudits**](OutboundApi.md#postAudits) | **POST** api/v2/outbound/audits | Retrieves audits for dialer.
[**postCallabletimesets**](OutboundApi.md#postCallabletimesets) | **POST** api/v2/outbound/callabletimesets | Create callable time set
[**postCallanalysisresponsesets**](OutboundApi.md#postCallanalysisresponsesets) | **POST** api/v2/outbound/callanalysisresponsesets | Create a dialer call analysis response set.
[**postCampaigns**](OutboundApi.md#postCampaigns) | **POST** api/v2/outbound/campaigns | Create a campaign.
[**postCampaignsCampaignIdCallbackSchedule**](OutboundApi.md#postCampaignsCampaignIdCallbackSchedule) | **POST** api/v2/outbound/campaigns/{campaignId}/callback/schedule | Schedule a Callback for a Dialer Campaign
[**postCampaignsProgress**](OutboundApi.md#postCampaignsProgress) | **POST** api/v2/outbound/campaigns/progress | Get progress for a list of campaigns
[**postContactlists**](OutboundApi.md#postContactlists) | **POST** api/v2/outbound/contactlists | Create a contact List.
[**postContactlistsContactlistIdContacts**](OutboundApi.md#postContactlistsContactlistIdContacts) | **POST** api/v2/outbound/contactlists/{contactListId}/contacts | Add contacts to a contact list.
[**postContactlistsContactlistIdExport**](OutboundApi.md#postContactlistsContactlistIdExport) | **POST** api/v2/outbound/contactlists/{contactListId}/export | Initiate the export of a contact list.
[**postConversationsConversationIdDnc**](OutboundApi.md#postConversationsConversationIdDnc) | **POST** api/v2/outbound/conversations/{conversationId}/dnc | Add phone numbers to a Dialer DNC list.
[**postDnclists**](OutboundApi.md#postDnclists) | **POST** api/v2/outbound/dnclists | Create dialer DNC list
[**postDnclistsDnclistIdExport**](OutboundApi.md#postDnclistsDnclistIdExport) | **POST** api/v2/outbound/dnclists/{dncListId}/export | Initiate the export of a dnc list.
[**postDnclistsDnclistIdPhonenumbers**](OutboundApi.md#postDnclistsDnclistIdPhonenumbers) | **POST** api/v2/outbound/dnclists/{dncListId}/phonenumbers | Add phone numbers to a Dialer DNC list.
[**postRulesets**](OutboundApi.md#postRulesets) | **POST** api/v2/outbound/rulesets | Create a Dialer Call Analysis Response Set.
[**postSequences**](OutboundApi.md#postSequences) | **POST** api/v2/outbound/sequences | Create a new campaign sequence.
[**putCallabletimesetsCallabletimesetId**](OutboundApi.md#putCallabletimesetsCallabletimesetId) | **PUT** api/v2/outbound/callabletimesets/{callableTimeSetId} | Update callable time set
[**putCallanalysisresponsesetsCallanalysissetId**](OutboundApi.md#putCallanalysisresponsesetsCallanalysissetId) | **PUT** api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId} | Update a dialer call analysis response set.
[**putCampaignsCampaignId**](OutboundApi.md#putCampaignsCampaignId) | **PUT** api/v2/outbound/campaigns/{campaignId} | Update a campaign.
[**putCampaignsCampaignIdAgentsUserId**](OutboundApi.md#putCampaignsCampaignIdAgentsUserId) | **PUT** api/v2/outbound/campaigns/{campaignId}/agents/{userId} | Send notification that an agent&#39;s state changed 
[**putContactlistsContactlistId**](OutboundApi.md#putContactlistsContactlistId) | **PUT** api/v2/outbound/contactlists/{contactListId} | Update a contact list.
[**putContactlistsContactlistIdContactsContactId**](OutboundApi.md#putContactlistsContactlistIdContactsContactId) | **PUT** api/v2/outbound/contactlists/{contactListId}/contacts/{contactId} | Update a contact.
[**putDnclistsDnclistId**](OutboundApi.md#putDnclistsDnclistId) | **PUT** api/v2/outbound/dnclists/{dncListId} | Update dialer DNC list
[**putRulesetsRulesetId**](OutboundApi.md#putRulesetsRulesetId) | **PUT** api/v2/outbound/rulesets/{ruleSetId} | Update a RuleSet.
[**putSchedulesCampaignsCampaignId**](OutboundApi.md#putSchedulesCampaignsCampaignId) | **PUT** api/v2/outbound/schedules/campaigns/{campaignId} | Update a new campaign schedule.
[**putSchedulesSequencesSequenceId**](OutboundApi.md#putSchedulesSequencesSequenceId) | **PUT** api/v2/outbound/schedules/sequences/{sequenceId} | Update a new sequence schedule.
[**putSequencesSequenceId**](OutboundApi.md#putSequencesSequenceId) | **PUT** api/v2/outbound/sequences/{sequenceId} | Update a new campaign sequence.
[**putWrapupcodemappings**](OutboundApi.md#putWrapupcodemappings) | **PUT** api/v2/outbound/wrapupcodemappings | Update the Dialer wrap up code mapping.


<a name="deleteCallabletimesetsCallabletimesetId"></a>
# **deleteCallabletimesetsCallabletimesetId**
> String deleteCallabletimesetsCallabletimesetId(callableTimeSetId)

Delete callable time set



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callableTimeSetId = "callableTimeSetId_example"; // String | Callable Time Set ID
try {
    String result = apiInstance.deleteCallabletimesetsCallabletimesetId(callableTimeSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteCallabletimesetsCallabletimesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callableTimeSetId** | **String**| Callable Time Set ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCallanalysisresponsesetsCallanalysissetId"></a>
# **deleteCallanalysisresponsesetsCallanalysissetId**
> String deleteCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId)

Delete a dialer call analysis response set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callAnalysisSetId = "callAnalysisSetId_example"; // String | Call Analysis Response Set ID
try {
    String result = apiInstance.deleteCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteCallanalysisresponsesetsCallanalysissetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callAnalysisSetId** | **String**| Call Analysis Response Set ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignsCampaignId"></a>
# **deleteCampaignsCampaignId**
> String deleteCampaignsCampaignId(campaignId)

Delete a campaign.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    String result = apiInstance.deleteCampaignsCampaignId(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignsCampaignIdProgress"></a>
# **deleteCampaignsCampaignIdProgress**
> String deleteCampaignsCampaignIdProgress(campaignId)

Reset campaign progress and recycle the campaign



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    String result = apiInstance.deleteCampaignsCampaignIdProgress(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteCampaignsCampaignIdProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactlistsContactlistId"></a>
# **deleteContactlistsContactlistId**
> String deleteContactlistsContactlistId(contactListId)

Delete a contact list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
try {
    String result = apiInstance.deleteContactlistsContactlistId(contactListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteContactlistsContactlistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactlistsContactlistIdContactsContactId"></a>
# **deleteContactlistsContactlistIdContactsContactId**
> String deleteContactlistsContactlistIdContactsContactId(contactListId, contactId)

Delete a contact.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | Contact List ID
String contactId = "contactId_example"; // String | Contact ID
try {
    String result = apiInstance.deleteContactlistsContactlistIdContactsContactId(contactListId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteContactlistsContactlistIdContactsContactId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| Contact List ID |
 **contactId** | **String**| Contact ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDnclistsDnclistId"></a>
# **deleteDnclistsDnclistId**
> String deleteDnclistsDnclistId(dncListId)

Delete dialer DNC list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
try {
    String result = apiInstance.deleteDnclistsDnclistId(dncListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteDnclistsDnclistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRulesetsRulesetId"></a>
# **deleteRulesetsRulesetId**
> String deleteRulesetsRulesetId(ruleSetId)

Delete a Rule set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String ruleSetId = "ruleSetId_example"; // String | Rule Set ID
try {
    String result = apiInstance.deleteRulesetsRulesetId(ruleSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteRulesetsRulesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleSetId** | **String**| Rule Set ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSchedulesCampaignsCampaignId"></a>
# **deleteSchedulesCampaignsCampaignId**
> String deleteSchedulesCampaignsCampaignId(campaignId)

Delete a dialer campaign schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    String result = apiInstance.deleteSchedulesCampaignsCampaignId(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteSchedulesCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSchedulesSequencesSequenceId"></a>
# **deleteSchedulesSequencesSequenceId**
> String deleteSchedulesSequencesSequenceId(sequenceId)

Delete a dialer sequence schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Sequence ID
try {
    String result = apiInstance.deleteSchedulesSequencesSequenceId(sequenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteSchedulesSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Sequence ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSequencesSequenceId"></a>
# **deleteSequencesSequenceId**
> String deleteSequencesSequenceId(sequenceId)

Delete a dialer campaign sequence.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Campaign Sequence ID
try {
    String result = apiInstance.deleteSequencesSequenceId(sequenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#deleteSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Campaign Sequence ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallabletimesets"></a>
# **getCallabletimesets**
> CallableTimeSetEntityListing getCallabletimesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query callable time set list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    CallableTimeSetEntityListing result = apiInstance.getCallabletimesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCallabletimesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**CallableTimeSetEntityListing**](CallableTimeSetEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallabletimesetsCallabletimesetId"></a>
# **getCallabletimesetsCallabletimesetId**
> CallableTimeSet getCallabletimesetsCallabletimesetId(callableTimeSetId)

Get callable time set



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callableTimeSetId = "callableTimeSetId_example"; // String | Callable Time Set ID
try {
    CallableTimeSet result = apiInstance.getCallabletimesetsCallabletimesetId(callableTimeSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCallabletimesetsCallabletimesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callableTimeSetId** | **String**| Callable Time Set ID |

### Return type

[**CallableTimeSet**](CallableTimeSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallanalysisresponsesets"></a>
# **getCallanalysisresponsesets**
> ResponseSetEntityListing getCallanalysisresponsesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query a list of dialer call analysis response sets.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    ResponseSetEntityListing result = apiInstance.getCallanalysisresponsesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCallanalysisresponsesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**ResponseSetEntityListing**](ResponseSetEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCallanalysisresponsesetsCallanalysissetId"></a>
# **getCallanalysisresponsesetsCallanalysissetId**
> ResponseSet getCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId)

Get a dialer call analysis response set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callAnalysisSetId = "callAnalysisSetId_example"; // String | Call Analysis Response Set ID
try {
    ResponseSet result = apiInstance.getCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCallanalysisresponsesetsCallanalysissetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callAnalysisSetId** | **String**| Call Analysis Response Set ID |

### Return type

[**ResponseSet**](ResponseSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaigns"></a>
# **getCampaigns**
> CampaignEntityListing getCampaigns(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder)

Query a list of dialer campaigns.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String contactListId = "contactListId_example"; // String | Contact List ID
String dncListId = "dncListId_example"; // String | DNC list ID
String distributionQueueId = "distributionQueueId_example"; // String | Distribution queue ID
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
String callAnalysisResponseSetId = "callAnalysisResponseSetId_example"; // String | Call analysis response set ID
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    CampaignEntityListing result = apiInstance.getCampaigns(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **contactListId** | **String**| Contact List ID | [optional]
 **dncListId** | **String**| DNC list ID | [optional]
 **distributionQueueId** | **String**| Distribution queue ID | [optional]
 **edgeGroupId** | **String**| Edge group ID | [optional]
 **callAnalysisResponseSetId** | **String**| Call analysis response set ID | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**CampaignEntityListing**](CampaignEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsCampaignId"></a>
# **getCampaignsCampaignId**
> Campaign getCampaignsCampaignId(campaignId)

Get dialer campaign.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    Campaign result = apiInstance.getCampaignsCampaignId(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsCampaignIdDiagnostics"></a>
# **getCampaignsCampaignIdDiagnostics**
> CampaignDiagnostics getCampaignsCampaignIdDiagnostics(campaignId)

Get campaign diagnostics



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    CampaignDiagnostics result = apiInstance.getCampaignsCampaignIdDiagnostics(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCampaignsCampaignIdDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

[**CampaignDiagnostics**](CampaignDiagnostics.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsCampaignIdProgress"></a>
# **getCampaignsCampaignIdProgress**
> CampaignProgress getCampaignsCampaignIdProgress(campaignId)

Get campaign progress



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    CampaignProgress result = apiInstance.getCampaignsCampaignIdProgress(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCampaignsCampaignIdProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

[**CampaignProgress**](CampaignProgress.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsCampaignIdStats"></a>
# **getCampaignsCampaignIdStats**
> CampaignStats getCampaignsCampaignIdStats(campaignId)

Get statistics about a Dialer Campaign



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    CampaignStats result = apiInstance.getCampaignsCampaignIdStats(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getCampaignsCampaignIdStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

[**CampaignStats**](CampaignStats.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactlists"></a>
# **getContactlists**
> ContactListEntityListing getContactlists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query a list of contact lists.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Boolean includeImportStatus = false; // Boolean | Include import status
Boolean includeSize = false; // Boolean | Include size
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    ContactListEntityListing result = apiInstance.getContactlists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getContactlists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeImportStatus** | **Boolean**| Include import status | [optional] [default to false]
 **includeSize** | **Boolean**| Include size | [optional] [default to false]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**ContactListEntityListing**](ContactListEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactlistsContactlistId"></a>
# **getContactlistsContactlistId**
> ContactList getContactlistsContactlistId(contactListId, includeImportStatus, includeSize)

Get a dialer contact list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
Boolean includeImportStatus = false; // Boolean | Import status
Boolean includeSize = false; // Boolean | Include size
try {
    ContactList result = apiInstance.getContactlistsContactlistId(contactListId, includeImportStatus, includeSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getContactlistsContactlistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |
 **includeImportStatus** | **Boolean**| Import status | [optional] [default to false]
 **includeSize** | **Boolean**| Include size | [optional] [default to false]

### Return type

[**ContactList**](ContactList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactlistsContactlistIdContactsContactId"></a>
# **getContactlistsContactlistIdContactsContactId**
> DialerContact getContactlistsContactlistIdContactsContactId(contactListId, contactId)

Get a contact.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | Contact List ID
String contactId = "contactId_example"; // String | Contact ID
try {
    DialerContact result = apiInstance.getContactlistsContactlistIdContactsContactId(contactListId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getContactlistsContactlistIdContactsContactId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| Contact List ID |
 **contactId** | **String**| Contact ID |

### Return type

[**DialerContact**](DialerContact.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactlistsContactlistIdExport"></a>
# **getContactlistsContactlistIdExport**
> ExportUri getContactlistsContactlistIdExport(contactListId, download)

Get the URI of a contact list export.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
String download = "false"; // String | Redirect to download uri
try {
    ExportUri result = apiInstance.getContactlistsContactlistIdExport(contactListId, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getContactlistsContactlistIdExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |
 **download** | **String**| Redirect to download uri | [optional] [default to false]

### Return type

[**ExportUri**](ExportUri.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactlistsContactlistIdImportstatus"></a>
# **getContactlistsContactlistIdImportstatus**
> ImportStatus getContactlistsContactlistIdImportstatus(contactListId)

Get dialer contactList import status.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
try {
    ImportStatus result = apiInstance.getContactlistsContactlistIdImportstatus(contactListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getContactlistsContactlistIdImportstatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |

### Return type

[**ImportStatus**](ImportStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnclists"></a>
# **getDnclists**
> DncListEntityListing getDnclists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query dialer DNC lists



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Boolean includeImportStatus = false; // Boolean | Import status
Boolean includeSize = false; // Boolean | Include size
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "sortOrder_example"; // String | Sort order
try {
    DncListEntityListing result = apiInstance.getDnclists(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getDnclists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeImportStatus** | **Boolean**| Import status | [optional] [default to false]
 **includeSize** | **Boolean**| Include size | [optional] [default to false]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [enum: ascending, descending]

### Return type

[**DncListEntityListing**](DncListEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnclistsDnclistId"></a>
# **getDnclistsDnclistId**
> DncList getDnclistsDnclistId(dncListId, includeImportStatus, includeSize)

Get dialer DNC list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
Boolean includeImportStatus = false; // Boolean | Import status
Boolean includeSize = false; // Boolean | Include size
try {
    DncList result = apiInstance.getDnclistsDnclistId(dncListId, includeImportStatus, includeSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getDnclistsDnclistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |
 **includeImportStatus** | **Boolean**| Import status | [optional] [default to false]
 **includeSize** | **Boolean**| Include size | [optional] [default to false]

### Return type

[**DncList**](DncList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnclistsDnclistIdExport"></a>
# **getDnclistsDnclistIdExport**
> ExportUri getDnclistsDnclistIdExport(dncListId, download)

Get the URI of a DNC list export.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
String download = "false"; // String | Redirect to download uri
try {
    ExportUri result = apiInstance.getDnclistsDnclistIdExport(dncListId, download);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getDnclistsDnclistIdExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |
 **download** | **String**| Redirect to download uri | [optional] [default to false]

### Return type

[**ExportUri**](ExportUri.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnclistsDnclistIdImportstatus"></a>
# **getDnclistsDnclistIdImportstatus**
> ImportStatus getDnclistsDnclistIdImportstatus(dncListId)

Get dialer dncList import status.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
try {
    ImportStatus result = apiInstance.getDnclistsDnclistIdImportstatus(dncListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getDnclistsDnclistIdImportstatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |

### Return type

[**ImportStatus**](ImportStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRulesets"></a>
# **getRulesets**
> RuleSetEntityListing getRulesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query a list of Rule Sets.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    RuleSetEntityListing result = apiInstance.getRulesets(pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getRulesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**RuleSetEntityListing**](RuleSetEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRulesetsRulesetId"></a>
# **getRulesetsRulesetId**
> RuleSet getRulesetsRulesetId(ruleSetId)

Get a Rule Set by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String ruleSetId = "ruleSetId_example"; // String | Rule Set ID
try {
    RuleSet result = apiInstance.getRulesetsRulesetId(ruleSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getRulesetsRulesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleSetId** | **String**| Rule Set ID |

### Return type

[**RuleSet**](RuleSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchedulesCampaigns"></a>
# **getSchedulesCampaigns**
> List&lt;CampaignSchedule&gt; getSchedulesCampaigns()

Query for a list of dialer campaign schedules.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
try {
    List<CampaignSchedule> result = apiInstance.getSchedulesCampaigns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSchedulesCampaigns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CampaignSchedule&gt;**](CampaignSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchedulesCampaignsCampaignId"></a>
# **getSchedulesCampaignsCampaignId**
> CampaignSchedule getSchedulesCampaignsCampaignId(campaignId)

Get a dialer campaign schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
try {
    CampaignSchedule result = apiInstance.getSchedulesCampaignsCampaignId(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSchedulesCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |

### Return type

[**CampaignSchedule**](CampaignSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchedulesSequences"></a>
# **getSchedulesSequences**
> List&lt;SequenceSchedule&gt; getSchedulesSequences()

Query for a list of dialer sequence schedules.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
try {
    List<SequenceSchedule> result = apiInstance.getSchedulesSequences();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSchedulesSequences");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SequenceSchedule&gt;**](SequenceSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchedulesSequencesSequenceId"></a>
# **getSchedulesSequencesSequenceId**
> SequenceSchedule getSchedulesSequencesSequenceId(sequenceId)

Get a dialer sequence schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Sequence ID
try {
    SequenceSchedule result = apiInstance.getSchedulesSequencesSequenceId(sequenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSchedulesSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Sequence ID |

### Return type

[**SequenceSchedule**](SequenceSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSequences"></a>
# **getSequences**
> CampaignSequenceEntityListing getSequences(pageSize, pageNumber, filterType, name, sortBy, sortOrder)

Query a list of dialer campaign sequences.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String filterType = "PREFIX"; // String | Filter type
String name = "name_example"; // String | Name
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "a"; // String | Sort order
try {
    CampaignSequenceEntityListing result = apiInstance.getSequences(pageSize, pageNumber, filterType, name, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSequences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **filterType** | **String**| Filter type | [optional] [default to PREFIX] [enum: EQUALS, REGEX, CONTAINS, PREFIX, LESSTHAN, LESSTHANEQUALTO, GREATERTHAN, GREATERTHANEQUALTO, BEGINSWITH, ENDSWITH]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to a] [enum: ascending, descending]

### Return type

[**CampaignSequenceEntityListing**](CampaignSequenceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSequencesSequenceId"></a>
# **getSequencesSequenceId**
> CampaignSequence getSequencesSequenceId(sequenceId)

Get a dialer campaign sequence.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Campaign Sequence ID
try {
    CampaignSequence result = apiInstance.getSequencesSequenceId(sequenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Campaign Sequence ID |

### Return type

[**CampaignSequence**](CampaignSequence.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWrapupcodemappings"></a>
# **getWrapupcodemappings**
> WrapUpCodeMapping getWrapupcodemappings()

Get the Dialer wrap up code mapping.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
try {
    WrapUpCodeMapping result = apiInstance.getWrapupcodemappings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#getWrapupcodemappings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WrapUpCodeMapping**](WrapUpCodeMapping.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAudits"></a>
# **postAudits**
> AuditSearchResult postAudits(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly)

Retrieves audits for dialer.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
DialerAuditRequest body = new DialerAuditRequest(); // DialerAuditRequest | AuditSearch
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "entity.name"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
Boolean facetsOnly = false; // Boolean | Facets only
try {
    AuditSearchResult result = apiInstance.postAudits(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postAudits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DialerAuditRequest**](DialerAuditRequest.md)| AuditSearch |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to entity.name]
 **sortOrder** | **String**| Sort order | [optional] [default to ascending]
 **facetsOnly** | **Boolean**| Facets only | [optional] [default to false]

### Return type

[**AuditSearchResult**](AuditSearchResult.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallabletimesets"></a>
# **postCallabletimesets**
> CallableTimeSet postCallabletimesets(body)

Create callable time set



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
CallableTimeSet body = new CallableTimeSet(); // CallableTimeSet | DialerCallableTimeSet
try {
    CallableTimeSet result = apiInstance.postCallabletimesets(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postCallabletimesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CallableTimeSet**](CallableTimeSet.md)| DialerCallableTimeSet |

### Return type

[**CallableTimeSet**](CallableTimeSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCallanalysisresponsesets"></a>
# **postCallanalysisresponsesets**
> ResponseSet postCallanalysisresponsesets(body)

Create a dialer call analysis response set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
ResponseSet body = new ResponseSet(); // ResponseSet | ResponseSet
try {
    ResponseSet result = apiInstance.postCallanalysisresponsesets(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postCallanalysisresponsesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResponseSet**](ResponseSet.md)| ResponseSet |

### Return type

[**ResponseSet**](ResponseSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaigns"></a>
# **postCampaigns**
> Campaign postCampaigns(body)

Create a campaign.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
Campaign body = new Campaign(); // Campaign | Campaign
try {
    Campaign result = apiInstance.postCampaigns(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Campaign**](Campaign.md)| Campaign |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaignsCampaignIdCallbackSchedule"></a>
# **postCampaignsCampaignIdCallbackSchedule**
> ContactCallbackRequest postCampaignsCampaignIdCallbackSchedule(campaignId, body)

Schedule a Callback for a Dialer Campaign



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
ContactCallbackRequest body = new ContactCallbackRequest(); // ContactCallbackRequest | ContactCallbackRequest
try {
    ContactCallbackRequest result = apiInstance.postCampaignsCampaignIdCallbackSchedule(campaignId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postCampaignsCampaignIdCallbackSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |
 **body** | [**ContactCallbackRequest**](ContactCallbackRequest.md)| ContactCallbackRequest |

### Return type

[**ContactCallbackRequest**](ContactCallbackRequest.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaignsProgress"></a>
# **postCampaignsProgress**
> List&lt;CampaignProgress&gt; postCampaignsProgress(body)

Get progress for a list of campaigns



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | Campaign IDs
try {
    List<CampaignProgress> result = apiInstance.postCampaignsProgress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postCampaignsProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| Campaign IDs |

### Return type

[**List&lt;CampaignProgress&gt;**](CampaignProgress.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postContactlists"></a>
# **postContactlists**
> ContactList postContactlists(body)

Create a contact List.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
ContactList body = new ContactList(); // ContactList | ContactList
try {
    ContactList result = apiInstance.postContactlists(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postContactlists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactList**](ContactList.md)| ContactList |

### Return type

[**ContactList**](ContactList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postContactlistsContactlistIdContacts"></a>
# **postContactlistsContactlistIdContacts**
> List&lt;DialerContact&gt; postContactlistsContactlistIdContacts(contactListId, body, priority)

Add contacts to a contact list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | Contact List ID
List<DialerContact> body = Arrays.asList(new DialerContact()); // List<DialerContact> | Contact
Boolean priority = true; // Boolean | Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end.
try {
    List<DialerContact> result = apiInstance.postContactlistsContactlistIdContacts(contactListId, body, priority);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postContactlistsContactlistIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| Contact List ID |
 **body** | [**List&lt;DialerContact&gt;**](DialerContact.md)| Contact |
 **priority** | **Boolean**| Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. | [optional]

### Return type

[**List&lt;DialerContact&gt;**](DialerContact.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postContactlistsContactlistIdExport"></a>
# **postContactlistsContactlistIdExport**
> String postContactlistsContactlistIdExport(contactListId)

Initiate the export of a contact list.

Returns 200 if received OK.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
try {
    String result = apiInstance.postContactlistsContactlistIdExport(contactListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postContactlistsContactlistIdExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsConversationIdDnc"></a>
# **postConversationsConversationIdDnc**
> Void postConversationsConversationIdDnc(conversationId)

Add phone numbers to a Dialer DNC list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    Void result = apiInstance.postConversationsConversationIdDnc(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postConversationsConversationIdDnc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnclists"></a>
# **postDnclists**
> DncList postDnclists(body)

Create dialer DNC list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
DncList body = new DncList(); // DncList | DncList
try {
    DncList result = apiInstance.postDnclists(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postDnclists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DncList**](DncList.md)| DncList |

### Return type

[**DncList**](DncList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnclistsDnclistIdExport"></a>
# **postDnclistsDnclistIdExport**
> String postDnclistsDnclistIdExport(dncListId)

Initiate the export of a dnc list.

Returns 200 if received OK.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
try {
    String result = apiInstance.postDnclistsDnclistIdExport(dncListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postDnclistsDnclistIdExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDnclistsDnclistIdPhonenumbers"></a>
# **postDnclistsDnclistIdPhonenumbers**
> Void postDnclistsDnclistIdPhonenumbers(dncListId, body)

Add phone numbers to a Dialer DNC list.

Only Internal DNC lists may be appended to

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | DNC Phone Numbers
try {
    Void result = apiInstance.postDnclistsDnclistIdPhonenumbers(dncListId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postDnclistsDnclistIdPhonenumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |
 **body** | **List&lt;String&gt;**| DNC Phone Numbers |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRulesets"></a>
# **postRulesets**
> RuleSet postRulesets(body)

Create a Dialer Call Analysis Response Set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
RuleSet body = new RuleSet(); // RuleSet | RuleSet
try {
    RuleSet result = apiInstance.postRulesets(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postRulesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RuleSet**](RuleSet.md)| RuleSet |

### Return type

[**RuleSet**](RuleSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSequences"></a>
# **postSequences**
> CampaignSequence postSequences(body)

Create a new campaign sequence.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
CampaignSequence body = new CampaignSequence(); // CampaignSequence | Organization
try {
    CampaignSequence result = apiInstance.postSequences(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#postSequences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignSequence**](CampaignSequence.md)| Organization |

### Return type

[**CampaignSequence**](CampaignSequence.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCallabletimesetsCallabletimesetId"></a>
# **putCallabletimesetsCallabletimesetId**
> CallableTimeSet putCallabletimesetsCallabletimesetId(callableTimeSetId, body)

Update callable time set



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callableTimeSetId = "callableTimeSetId_example"; // String | Callable Time Set ID
CallableTimeSet body = new CallableTimeSet(); // CallableTimeSet | DialerCallableTimeSet
try {
    CallableTimeSet result = apiInstance.putCallabletimesetsCallabletimesetId(callableTimeSetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putCallabletimesetsCallabletimesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callableTimeSetId** | **String**| Callable Time Set ID |
 **body** | [**CallableTimeSet**](CallableTimeSet.md)| DialerCallableTimeSet |

### Return type

[**CallableTimeSet**](CallableTimeSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCallanalysisresponsesetsCallanalysissetId"></a>
# **putCallanalysisresponsesetsCallanalysissetId**
> ResponseSet putCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId, body)

Update a dialer call analysis response set.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String callAnalysisSetId = "callAnalysisSetId_example"; // String | Call Analysis Response Set ID
ResponseSet body = new ResponseSet(); // ResponseSet | ResponseSet
try {
    ResponseSet result = apiInstance.putCallanalysisresponsesetsCallanalysissetId(callAnalysisSetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putCallanalysisresponsesetsCallanalysissetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callAnalysisSetId** | **String**| Call Analysis Response Set ID |
 **body** | [**ResponseSet**](ResponseSet.md)| ResponseSet |

### Return type

[**ResponseSet**](ResponseSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCampaignsCampaignId"></a>
# **putCampaignsCampaignId**
> Campaign putCampaignsCampaignId(campaignId, body)

Update a campaign.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
Campaign body = new Campaign(); // Campaign | Campaign
try {
    Campaign result = apiInstance.putCampaignsCampaignId(campaignId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |
 **body** | [**Campaign**](Campaign.md)| Campaign |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCampaignsCampaignIdAgentsUserId"></a>
# **putCampaignsCampaignIdAgentsUserId**
> String putCampaignsCampaignIdAgentsUserId(campaignId, userId, body)

Send notification that an agent&#39;s state changed 

New agent state.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
String userId = "userId_example"; // String | Agent's user ID
Agent body = new Agent(); // Agent | agent
try {
    String result = apiInstance.putCampaignsCampaignIdAgentsUserId(campaignId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putCampaignsCampaignIdAgentsUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |
 **userId** | **String**| Agent&#39;s user ID |
 **body** | [**Agent**](Agent.md)| agent |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putContactlistsContactlistId"></a>
# **putContactlistsContactlistId**
> ContactList putContactlistsContactlistId(contactListId, body)

Update a contact list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | ContactList ID
ContactList body = new ContactList(); // ContactList | ContactList
try {
    ContactList result = apiInstance.putContactlistsContactlistId(contactListId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putContactlistsContactlistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| ContactList ID |
 **body** | [**ContactList**](ContactList.md)| ContactList |

### Return type

[**ContactList**](ContactList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putContactlistsContactlistIdContactsContactId"></a>
# **putContactlistsContactlistIdContactsContactId**
> DialerContact putContactlistsContactlistIdContactsContactId(contactListId, contactId, body)

Update a contact.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String contactListId = "contactListId_example"; // String | Contact List ID
String contactId = "contactId_example"; // String | Contact ID
DialerContact body = new DialerContact(); // DialerContact | Contact
try {
    DialerContact result = apiInstance.putContactlistsContactlistIdContactsContactId(contactListId, contactId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putContactlistsContactlistIdContactsContactId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactListId** | **String**| Contact List ID |
 **contactId** | **String**| Contact ID |
 **body** | [**DialerContact**](DialerContact.md)| Contact |

### Return type

[**DialerContact**](DialerContact.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDnclistsDnclistId"></a>
# **putDnclistsDnclistId**
> DncList putDnclistsDnclistId(dncListId, body)

Update dialer DNC list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String dncListId = "dncListId_example"; // String | DncList ID
DncList body = new DncList(); // DncList | DncList
try {
    DncList result = apiInstance.putDnclistsDnclistId(dncListId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putDnclistsDnclistId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dncListId** | **String**| DncList ID |
 **body** | [**DncList**](DncList.md)| DncList |

### Return type

[**DncList**](DncList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRulesetsRulesetId"></a>
# **putRulesetsRulesetId**
> RuleSet putRulesetsRulesetId(ruleSetId, body)

Update a RuleSet.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String ruleSetId = "ruleSetId_example"; // String | Rule Set ID
RuleSet body = new RuleSet(); // RuleSet | RuleSet
try {
    RuleSet result = apiInstance.putRulesetsRulesetId(ruleSetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putRulesetsRulesetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleSetId** | **String**| Rule Set ID |
 **body** | [**RuleSet**](RuleSet.md)| RuleSet |

### Return type

[**RuleSet**](RuleSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSchedulesCampaignsCampaignId"></a>
# **putSchedulesCampaignsCampaignId**
> CampaignSchedule putSchedulesCampaignsCampaignId(campaignId, body)

Update a new campaign schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String campaignId = "campaignId_example"; // String | Campaign ID
CampaignSchedule body = new CampaignSchedule(); // CampaignSchedule | CampaignSchedule
try {
    CampaignSchedule result = apiInstance.putSchedulesCampaignsCampaignId(campaignId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putSchedulesCampaignsCampaignId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign ID |
 **body** | [**CampaignSchedule**](CampaignSchedule.md)| CampaignSchedule |

### Return type

[**CampaignSchedule**](CampaignSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSchedulesSequencesSequenceId"></a>
# **putSchedulesSequencesSequenceId**
> SequenceSchedule putSchedulesSequencesSequenceId(sequenceId, body)

Update a new sequence schedule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Sequence ID
SequenceSchedule body = new SequenceSchedule(); // SequenceSchedule | SequenceSchedule
try {
    SequenceSchedule result = apiInstance.putSchedulesSequencesSequenceId(sequenceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putSchedulesSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Sequence ID |
 **body** | [**SequenceSchedule**](SequenceSchedule.md)| SequenceSchedule |

### Return type

[**SequenceSchedule**](SequenceSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSequencesSequenceId"></a>
# **putSequencesSequenceId**
> CampaignSequence putSequencesSequenceId(sequenceId, body)

Update a new campaign sequence.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
String sequenceId = "sequenceId_example"; // String | Campaign Sequence ID
CampaignSequence body = new CampaignSequence(); // CampaignSequence | Organization
try {
    CampaignSequence result = apiInstance.putSequencesSequenceId(sequenceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putSequencesSequenceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequenceId** | **String**| Campaign Sequence ID |
 **body** | [**CampaignSequence**](CampaignSequence.md)| Organization |

### Return type

[**CampaignSequence**](CampaignSequence.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWrapupcodemappings"></a>
# **putWrapupcodemappings**
> WrapUpCodeMapping putWrapupcodemappings(body)

Update the Dialer wrap up code mapping.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OutboundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OutboundApi apiInstance = new OutboundApi();
WrapUpCodeMapping body = new WrapUpCodeMapping(); // WrapUpCodeMapping | wrapUpCodeMapping
try {
    WrapUpCodeMapping result = apiInstance.putWrapupcodemappings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutboundApi#putWrapupcodemappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrapUpCodeMapping**](WrapUpCodeMapping.md)| wrapUpCodeMapping |

### Return type

[**WrapUpCodeMapping**](WrapUpCodeMapping.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

