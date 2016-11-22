# RoutingApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEmailDomainsDomainId**](RoutingApi.md#deleteEmailDomainsDomainId) | **DELETE** api/v2/routing/email/domains/{domainId} | Delete a domain
[**deleteEmailDomainsDomainnameRoutesRouteId**](RoutingApi.md#deleteEmailDomainsDomainnameRoutesRouteId) | **DELETE** api/v2/routing/email/domains/{domainName}/routes/{routeId} | Delete a route
[**deleteQueuesQueueId**](RoutingApi.md#deleteQueuesQueueId) | **DELETE** api/v2/routing/queues/{queueId} | Delete a queue
[**deleteQueuesQueueIdUsersMemberId**](RoutingApi.md#deleteQueuesQueueIdUsersMemberId) | **DELETE** api/v2/routing/queues/{queueId}/users/{memberId} | Delete queue member
[**deleteQueuesQueueIdWrapupcodesCodeId**](RoutingApi.md#deleteQueuesQueueIdWrapupcodesCodeId) | **DELETE** api/v2/routing/queues/{queueId}/wrapupcodes/{codeId} | Delete a wrap-up code from a queue
[**deleteSkillsSkillId**](RoutingApi.md#deleteSkillsSkillId) | **DELETE** api/v2/routing/skills/{skillId} | Delete Routing Skill
[**deleteUserIdRoutingskillsSkillId**](RoutingApi.md#deleteUserIdRoutingskillsSkillId) | **DELETE** api/v2/users/{userId}/routingskills/{skillId} | Remove routing skill from user
[**deleteUtilization**](RoutingApi.md#deleteUtilization) | **DELETE** api/v2/routing/utilization | Delete utilization settings and revert to system defaults.
[**deleteWrapupcodesCodeId**](RoutingApi.md#deleteWrapupcodesCodeId) | **DELETE** api/v2/routing/wrapupcodes/{codeId} | Delete wrap-up code
[**getEmailDomains**](RoutingApi.md#getEmailDomains) | **GET** api/v2/routing/email/domains | Get domains
[**getEmailDomainsDomainnameRoutes**](RoutingApi.md#getEmailDomainsDomainnameRoutes) | **GET** api/v2/routing/email/domains/{domainName}/routes | Get routes
[**getEmailDomainsDomainnameRoutesRouteId**](RoutingApi.md#getEmailDomainsDomainnameRoutesRouteId) | **GET** api/v2/routing/email/domains/{domainName}/routes/{routeId} | Get a route
[**getEmailSetup**](RoutingApi.md#getEmailSetup) | **GET** api/v2/routing/email/setup | Get email setup
[**getQueues**](RoutingApi.md#getQueues) | **GET** api/v2/routing/queues | Get list of queues.
[**getQueuesQueueId**](RoutingApi.md#getQueuesQueueId) | **GET** api/v2/routing/queues/{queueId} | Get details about this queue.
[**getQueuesQueueIdConversations**](RoutingApi.md#getQueuesQueueIdConversations) | **GET** api/v2/routing/queues/{queueId}/conversations | Get recent conversations that are still active
[**getQueuesQueueIdConversationsCallbacks**](RoutingApi.md#getQueuesQueueIdConversationsCallbacks) | **GET** api/v2/routing/queues/{queueId}/conversations/callbacks | Get recent callback conversations that are still active
[**getQueuesQueueIdConversationsCalls**](RoutingApi.md#getQueuesQueueIdConversationsCalls) | **GET** api/v2/routing/queues/{queueId}/conversations/calls | Get recent call conversations that are still active
[**getQueuesQueueIdConversationsChats**](RoutingApi.md#getQueuesQueueIdConversationsChats) | **GET** api/v2/routing/queues/{queueId}/conversations/chats | Get recent chat conversations that are still active
[**getQueuesQueueIdConversationsEmails**](RoutingApi.md#getQueuesQueueIdConversationsEmails) | **GET** api/v2/routing/queues/{queueId}/conversations/emails | Get recent email conversations that are still active
[**getQueuesQueueIdEstimatedwaittime**](RoutingApi.md#getQueuesQueueIdEstimatedwaittime) | **GET** api/v2/routing/queues/{queueId}/estimatedwaittime | Get Estimated Wait Time
[**getQueuesQueueIdUsers**](RoutingApi.md#getQueuesQueueIdUsers) | **GET** api/v2/routing/queues/{queueId}/users | Get the members of this queue
[**getQueuesQueueIdWrapupcodes**](RoutingApi.md#getQueuesQueueIdWrapupcodes) | **GET** api/v2/routing/queues/{queueId}/wrapupcodes | Get the wrap-up codes for a queue
[**getSkills**](RoutingApi.md#getSkills) | **GET** api/v2/routing/skills | Get the list of routing skills.
[**getSkillsSkillId**](RoutingApi.md#getSkillsSkillId) | **GET** api/v2/routing/skills/{skillId} | Get Routing Skill
[**getUserIdRoutingskills**](RoutingApi.md#getUserIdRoutingskills) | **GET** api/v2/users/{userId}/routingskills | List routing skills for user
[**getUtilization**](RoutingApi.md#getUtilization) | **GET** api/v2/routing/utilization | Get the utilization settings.
[**getWrapupcodes**](RoutingApi.md#getWrapupcodes) | **GET** api/v2/routing/wrapupcodes | Get list of wrapup codes.
[**getWrapupcodesCodeId**](RoutingApi.md#getWrapupcodesCodeId) | **GET** api/v2/routing/wrapupcodes/{codeId} | Get details about this wrap-up code.
[**patchQueuesQueueIdUsers**](RoutingApi.md#patchQueuesQueueIdUsers) | **PATCH** api/v2/routing/queues/{queueId}/users | Join or unjoin a set of users for a queue
[**patchQueuesQueueIdUsersMemberId**](RoutingApi.md#patchQueuesQueueIdUsersMemberId) | **PATCH** api/v2/routing/queues/{queueId}/users/{memberId} | Update the ring number of joined status for a User in a Queue
[**postEmailDomains**](RoutingApi.md#postEmailDomains) | **POST** api/v2/routing/email/domains | Create a domain
[**postEmailDomainsDomainnameRoutes**](RoutingApi.md#postEmailDomainsDomainnameRoutes) | **POST** api/v2/routing/email/domains/{domainName}/routes | Create a route
[**postQueues**](RoutingApi.md#postQueues) | **POST** api/v2/routing/queues | Create queue
[**postQueuesObservationsQuery**](RoutingApi.md#postQueuesObservationsQuery) | **POST** api/v2/analytics/queues/observations/query | Query for queue observations
[**postQueuesQueueIdUsers**](RoutingApi.md#postQueuesQueueIdUsers) | **POST** api/v2/routing/queues/{queueId}/users | Bulk add or delete up to 100 queue members
[**postQueuesQueueIdWrapupcodes**](RoutingApi.md#postQueuesQueueIdWrapupcodes) | **POST** api/v2/routing/queues/{queueId}/wrapupcodes | Add up to 100 wrap-up codes to a queue
[**postSkills**](RoutingApi.md#postSkills) | **POST** api/v2/routing/skills | Create Skill
[**postUserIdRoutingskills**](RoutingApi.md#postUserIdRoutingskills) | **POST** api/v2/users/{userId}/routingskills | Add routing skill to user
[**postWrapupcodes**](RoutingApi.md#postWrapupcodes) | **POST** api/v2/routing/wrapupcodes | Create a wrap-up code
[**putEmailDomainsDomainnameRoutesRouteId**](RoutingApi.md#putEmailDomainsDomainnameRoutesRouteId) | **PUT** api/v2/routing/email/domains/{domainName}/routes/{routeId} | Update a route
[**putQueuesQueueId**](RoutingApi.md#putQueuesQueueId) | **PUT** api/v2/routing/queues/{queueId} | Update a queue
[**putUserIdRoutingskillsSkillId**](RoutingApi.md#putUserIdRoutingskillsSkillId) | **PUT** api/v2/users/{userId}/routingskills/{skillId} | Update routing skill proficiency or state.
[**putUtilization**](RoutingApi.md#putUtilization) | **PUT** api/v2/routing/utilization | Update the utilization settings.
[**putWrapupcodesCodeId**](RoutingApi.md#putWrapupcodesCodeId) | **PUT** api/v2/routing/wrapupcodes/{codeId} | Update wrap-up code


<a name="deleteEmailDomainsDomainId"></a>
# **deleteEmailDomainsDomainId**
> String deleteEmailDomainsDomainId(domainId)

Delete a domain



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    String result = apiInstance.deleteEmailDomainsDomainId(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteEmailDomainsDomainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | **String**| domain ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailDomainsDomainnameRoutesRouteId"></a>
# **deleteEmailDomainsDomainnameRoutesRouteId**
> String deleteEmailDomainsDomainnameRoutesRouteId(domainName, routeId)

Delete a route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    String result = apiInstance.deleteEmailDomainsDomainnameRoutesRouteId(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteEmailDomainsDomainnameRoutesRouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | **String**| email domain |
 **routeId** | **String**| route ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQueuesQueueId"></a>
# **deleteQueuesQueueId**
> String deleteQueuesQueueId(queueId, forceDelete)

Delete a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Boolean forceDelete = true; // Boolean | forceDelete
try {
    String result = apiInstance.deleteQueuesQueueId(queueId, forceDelete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteQueuesQueueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **forceDelete** | **Boolean**| forceDelete | [optional]

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQueuesQueueIdUsersMemberId"></a>
# **deleteQueuesQueueIdUsersMemberId**
> String deleteQueuesQueueIdUsersMemberId(queueId, memberId)

Delete queue member



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    String result = apiInstance.deleteQueuesQueueIdUsersMemberId(queueId, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteQueuesQueueIdUsersMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **memberId** | **String**| Member ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQueuesQueueIdWrapupcodesCodeId"></a>
# **deleteQueuesQueueIdWrapupcodesCodeId**
> String deleteQueuesQueueIdWrapupcodesCodeId(queueId, codeId)

Delete a wrap-up code from a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
try {
    String result = apiInstance.deleteQueuesQueueIdWrapupcodesCodeId(queueId, codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteQueuesQueueIdWrapupcodesCodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **codeId** | **String**| Code ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSkillsSkillId"></a>
# **deleteSkillsSkillId**
> String deleteSkillsSkillId(skillId)

Delete Routing Skill



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    String result = apiInstance.deleteSkillsSkillId(skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteSkillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skillId** | **String**| Skill ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserIdRoutingskillsSkillId"></a>
# **deleteUserIdRoutingskillsSkillId**
> String deleteUserIdRoutingskillsSkillId(userId, skillId)

Remove routing skill from user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    String result = apiInstance.deleteUserIdRoutingskillsSkillId(userId, skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserIdRoutingskillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **skillId** | **String**| skillId |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUtilization"></a>
# **deleteUtilization**
> String deleteUtilization()

Delete utilization settings and revert to system defaults.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
try {
    String result = apiInstance.deleteUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUtilization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWrapupcodesCodeId"></a>
# **deleteWrapupcodesCodeId**
> String deleteWrapupcodesCodeId(codeId)

Delete wrap-up code



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    String result = apiInstance.deleteWrapupcodesCodeId(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteWrapupcodesCodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **String**| Wrapup Code ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailDomains"></a>
# **getEmailDomains**
> InboundDomainEntityListing getEmailDomains()

Get domains



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
try {
    InboundDomainEntityListing result = apiInstance.getEmailDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getEmailDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InboundDomainEntityListing**](InboundDomainEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailDomainsDomainnameRoutes"></a>
# **getEmailDomainsDomainnameRoutes**
> InboundRouteEntityListing getEmailDomainsDomainnameRoutes(domainName)

Get routes



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
try {
    InboundRouteEntityListing result = apiInstance.getEmailDomainsDomainnameRoutes(domainName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getEmailDomainsDomainnameRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | **String**| email domain |

### Return type

[**InboundRouteEntityListing**](InboundRouteEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailDomainsDomainnameRoutesRouteId"></a>
# **getEmailDomainsDomainnameRoutesRouteId**
> InboundRoute getEmailDomainsDomainnameRoutesRouteId(domainName, routeId)

Get a route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    InboundRoute result = apiInstance.getEmailDomainsDomainnameRoutesRouteId(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getEmailDomainsDomainnameRoutesRouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | **String**| email domain |
 **routeId** | **String**| route ID |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSetup"></a>
# **getEmailSetup**
> EmailSetup getEmailSetup()

Get email setup



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
try {
    EmailSetup result = apiInstance.getEmailSetup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getEmailSetup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailSetup**](EmailSetup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueues"></a>
# **getQueues**
> QueueEntityListing getQueues(pageSize, pageNumber, sortBy, name, active)

Get list of queues.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
Boolean active = true; // Boolean | Active
try {
    QueueEntityListing result = apiInstance.getQueues(pageSize, pageNumber, sortBy, name, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to name]
 **name** | **String**| Name | [optional]
 **active** | **Boolean**| Active | [optional]

### Return type

[**QueueEntityListing**](QueueEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueId"></a>
# **getQueuesQueueId**
> Queue getQueuesQueueId(queueId)

Get details about this queue.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
try {
    Queue result = apiInstance.getQueuesQueueId(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |

### Return type

[**Queue**](Queue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdConversations"></a>
# **getQueuesQueueIdConversations**
> CallConversationEntityListing getQueuesQueueIdConversations(queueId, pageSize, pageNumber)

Get recent conversations that are still active



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    CallConversationEntityListing result = apiInstance.getQueuesQueueIdConversations(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdConversationsCallbacks"></a>
# **getQueuesQueueIdConversationsCallbacks**
> CallbackConversationEntityListing getQueuesQueueIdConversationsCallbacks(queueId, pageSize, pageNumber)

Get recent callback conversations that are still active



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    CallbackConversationEntityListing result = apiInstance.getQueuesQueueIdConversationsCallbacks(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**CallbackConversationEntityListing**](CallbackConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdConversationsCalls"></a>
# **getQueuesQueueIdConversationsCalls**
> CallConversationEntityListing getQueuesQueueIdConversationsCalls(queueId, pageSize, pageNumber)

Get recent call conversations that are still active



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    CallConversationEntityListing result = apiInstance.getQueuesQueueIdConversationsCalls(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdConversationsCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdConversationsChats"></a>
# **getQueuesQueueIdConversationsChats**
> ChatConversationEntityListing getQueuesQueueIdConversationsChats(queueId, pageSize, pageNumber)

Get recent chat conversations that are still active



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ChatConversationEntityListing result = apiInstance.getQueuesQueueIdConversationsChats(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdConversationsChats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**ChatConversationEntityListing**](ChatConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdConversationsEmails"></a>
# **getQueuesQueueIdConversationsEmails**
> EmailConversationEntityListing getQueuesQueueIdConversationsEmails(queueId, pageSize, pageNumber)

Get recent email conversations that are still active



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EmailConversationEntityListing result = apiInstance.getQueuesQueueIdConversationsEmails(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdConversationsEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**EmailConversationEntityListing**](EmailConversationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdEstimatedwaittime"></a>
# **getQueuesQueueIdEstimatedwaittime**
> EstimatedWaitTimePredictions getQueuesQueueIdEstimatedwaittime(queueId, conversationId)

Get Estimated Wait Time



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String conversationId = "conversationId_example"; // String | conversationId
try {
    EstimatedWaitTimePredictions result = apiInstance.getQueuesQueueIdEstimatedwaittime(queueId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| queueId |
 **conversationId** | **String**| conversationId | [optional]

### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdUsers"></a>
# **getQueuesQueueIdUsers**
> QueueMemberEntityListing getQueuesQueueIdUsers(queueId, pageSize, pageNumber, sortBy, expand, directMembers)

Get the members of this queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String expand = "expand_example"; // String | expand
Boolean directMembers = false; // Boolean | Only get users that are direct members of the queue
try {
    QueueMemberEntityListing result = apiInstance.getQueuesQueueIdUsers(queueId, pageSize, pageNumber, sortBy, expand, directMembers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to name]
 **expand** | **String**| expand | [optional]
 **directMembers** | **Boolean**| Only get users that are direct members of the queue | [optional] [default to false]

### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueuesQueueIdWrapupcodes"></a>
# **getQueuesQueueIdWrapupcodes**
> WrapupCodeEntityListing getQueuesQueueIdWrapupcodes(queueId, codeId)

Get the wrap-up codes for a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
try {
    WrapupCodeEntityListing result = apiInstance.getQueuesQueueIdWrapupcodes(queueId, codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getQueuesQueueIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **codeId** | **String**| Code ID |

### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSkills"></a>
# **getSkills**
> SkillEntityListing getSkills(pageSize, pageNumber)

Get the list of routing skills.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SkillEntityListing result = apiInstance.getSkills(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getSkills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**SkillEntityListing**](SkillEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSkillsSkillId"></a>
# **getSkillsSkillId**
> RoutingSkill getSkillsSkillId(skillId)

Get Routing Skill



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    RoutingSkill result = apiInstance.getSkillsSkillId(skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getSkillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skillId** | **String**| Skill ID |

### Return type

[**RoutingSkill**](RoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdRoutingskills"></a>
# **getUserIdRoutingskills**
> UserSkillEntityListing getUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserIdRoutingskills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUtilization"></a>
# **getUtilization**
> Utilization getUtilization()

Get the utilization settings.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
try {
    Utilization result = apiInstance.getUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUtilization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Utilization**](Utilization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWrapupcodes"></a>
# **getWrapupcodes**
> WrapupCodeEntityListing getWrapupcodes(pageSize, pageNumber, sortBy)

Get list of wrapup codes.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
try {
    WrapupCodeEntityListing result = apiInstance.getWrapupcodes(pageSize, pageNumber, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to name]

### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWrapupcodesCodeId"></a>
# **getWrapupcodesCodeId**
> WrapupCode getWrapupcodesCodeId(codeId)

Get details about this wrap-up code.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    WrapupCode result = apiInstance.getWrapupcodesCodeId(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getWrapupcodesCodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **String**| Wrapup Code ID |

### Return type

[**WrapupCode**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchQueuesQueueIdUsers"></a>
# **patchQueuesQueueIdUsers**
> QueueMemberEntityListing patchQueuesQueueIdUsers(queueId, body)

Join or unjoin a set of users for a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListing result = apiInstance.patchQueuesQueueIdUsers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchQueuesQueueIdUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **body** | [**List&lt;QueueMember&gt;**](QueueMember.md)| Queue Members |

### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchQueuesQueueIdUsersMemberId"></a>
# **patchQueuesQueueIdUsersMemberId**
> QueueMember patchQueuesQueueIdUsersMemberId(queueId, memberId, body)

Update the ring number of joined status for a User in a Queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    QueueMember result = apiInstance.patchQueuesQueueIdUsersMemberId(queueId, memberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchQueuesQueueIdUsersMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **memberId** | **String**| Member ID |
 **body** | [**QueueMember**](QueueMember.md)| Queue Member |

### Return type

[**QueueMember**](QueueMember.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEmailDomains"></a>
# **postEmailDomains**
> InboundDomain postEmailDomains(body)

Create a domain



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
InboundDomain body = new InboundDomain(); // InboundDomain | Domain
try {
    InboundDomain result = apiInstance.postEmailDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postEmailDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InboundDomain**](InboundDomain.md)| Domain |

### Return type

[**InboundDomain**](InboundDomain.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEmailDomainsDomainnameRoutes"></a>
# **postEmailDomainsDomainnameRoutes**
> InboundRoute postEmailDomainsDomainnameRoutes(domainName, body)

Create a route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.postEmailDomainsDomainnameRoutes(domainName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postEmailDomainsDomainnameRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | **String**| email domain |
 **body** | [**InboundRoute**](InboundRoute.md)| Route |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQueues"></a>
# **postQueues**
> Queue postQueues(body)

Create queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
CreateQueueRequest body = new CreateQueueRequest(); // CreateQueueRequest | Queue
try {
    Queue result = apiInstance.postQueues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postQueues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateQueueRequest**](CreateQueueRequest.md)| Queue |

### Return type

[**Queue**](Queue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQueuesObservationsQuery"></a>
# **postQueuesObservationsQuery**
> QualifierMappingObservationQueryResponse postQueuesObservationsQuery(body)

Query for queue observations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    QualifierMappingObservationQueryResponse result = apiInstance.postQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postQueuesObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObservationQuery**](ObservationQuery.md)| query |

### Return type

[**QualifierMappingObservationQueryResponse**](QualifierMappingObservationQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQueuesQueueIdUsers"></a>
# **postQueuesQueueIdUsers**
> String postQueuesQueueIdUsers(queueId, body, delete)

Bulk add or delete up to 100 queue members



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    String result = apiInstance.postQueuesQueueIdUsers(queueId, body, delete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postQueuesQueueIdUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **body** | [**List&lt;QueueMember&gt;**](QueueMember.md)| Queue Members |
 **delete** | **Boolean**| True to delete queue members | [optional] [default to false]

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQueuesQueueIdWrapupcodes"></a>
# **postQueuesQueueIdWrapupcodes**
> List&lt;WrapupCode&gt; postQueuesQueueIdWrapupcodes(queueId, codeId, body)

Add up to 100 wrap-up codes to a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
List<WrapupCode> body = Arrays.asList(new WrapupCode()); // List<WrapupCode> | List of wrapup codes
try {
    List<WrapupCode> result = apiInstance.postQueuesQueueIdWrapupcodes(queueId, codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postQueuesQueueIdWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **codeId** | **String**| Code ID |
 **body** | [**List&lt;WrapupCode&gt;**](WrapupCode.md)| List of wrapup codes |

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSkills"></a>
# **postSkills**
> RoutingSkill postSkills(body)

Create Skill



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
RoutingSkill body = new RoutingSkill(); // RoutingSkill | Skill
try {
    RoutingSkill result = apiInstance.postSkills(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postSkills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoutingSkill**](RoutingSkill.md)| Skill |

### Return type

[**RoutingSkill**](RoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUserIdRoutingskills"></a>
# **postUserIdRoutingskills**
> UserRoutingSkill postUserIdRoutingskills(userId, body)

Add routing skill to user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.postUserIdRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserIdRoutingskills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**UserRoutingSkill**](UserRoutingSkill.md)| Skill |

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWrapupcodes"></a>
# **postWrapupcodes**
> CallableTimeSet postWrapupcodes(body)

Create a wrap-up code



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    CallableTimeSet result = apiInstance.postWrapupcodes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WrapupCode**](WrapupCode.md)| WrapupCode |

### Return type

[**CallableTimeSet**](CallableTimeSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putEmailDomainsDomainnameRoutesRouteId"></a>
# **putEmailDomainsDomainnameRoutesRouteId**
> InboundRoute putEmailDomainsDomainnameRoutesRouteId(domainName, routeId, body)

Update a route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.putEmailDomainsDomainnameRoutesRouteId(domainName, routeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putEmailDomainsDomainnameRoutesRouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | **String**| email domain |
 **routeId** | **String**| route ID |
 **body** | [**InboundRoute**](InboundRoute.md)| Route |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putQueuesQueueId"></a>
# **putQueuesQueueId**
> Queue putQueuesQueueId(queueId, body)

Update a queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Queue body = new Queue(); // Queue | Queue
try {
    Queue result = apiInstance.putQueuesQueueId(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putQueuesQueueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **body** | [**Queue**](Queue.md)| Queue |

### Return type

[**Queue**](Queue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdRoutingskillsSkillId"></a>
# **putUserIdRoutingskillsSkillId**
> UserRoutingSkill putUserIdRoutingskillsSkillId(userId, skillId, body)

Update routing skill proficiency or state.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserIdRoutingskillsSkillId(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserIdRoutingskillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **skillId** | **String**| skillId |
 **body** | [**UserRoutingSkill**](UserRoutingSkill.md)| Skill |

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUtilization"></a>
# **putUtilization**
> Utilization putUtilization(body)

Update the utilization settings.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
Utilization body = new Utilization(); // Utilization | utilization
try {
    Utilization result = apiInstance.putUtilization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUtilization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Utilization**](Utilization.md)| utilization |

### Return type

[**Utilization**](Utilization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWrapupcodesCodeId"></a>
# **putWrapupcodesCodeId**
> WrapupCode putWrapupcodesCodeId(codeId, body)

Update wrap-up code



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.putWrapupcodesCodeId(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putWrapupcodesCodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **String**| Wrapup Code ID |
 **body** | [**WrapupCode**](WrapupCode.md)| WrapupCode |

### Return type

[**WrapupCode**](WrapupCode.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

