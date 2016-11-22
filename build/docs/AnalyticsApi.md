# AnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteReportingSchedulesScheduleId**](AnalyticsApi.md#deleteReportingSchedulesScheduleId) | **DELETE** api/v2/analytics/reporting/schedules/{scheduleId} | Delete a scheduled report job.
[**getConversationsConversationIdDetails**](AnalyticsApi.md#getConversationsConversationIdDetails) | **GET** api/v2/analytics/conversations/{conversationId}/details | Get a conversation by id
[**getReportingMetadata**](AnalyticsApi.md#getReportingMetadata) | **GET** api/v2/analytics/reporting/metadata | Get list of reporting metadata.
[**getReportingReportIdMetadata**](AnalyticsApi.md#getReportingReportIdMetadata) | **GET** api/v2/analytics/reporting/{reportId}/metadata | Get a reporting metadata.
[**getReportingReportformats**](AnalyticsApi.md#getReportingReportformats) | **GET** api/v2/analytics/reporting/reportformats | Get a list of report formats
[**getReportingSchedules**](AnalyticsApi.md#getReportingSchedules) | **GET** api/v2/analytics/reporting/schedules | Get a list of scheduled report jobs
[**getReportingSchedulesScheduleId**](AnalyticsApi.md#getReportingSchedulesScheduleId) | **GET** api/v2/analytics/reporting/schedules/{scheduleId} | Get a scheduled report job.
[**getReportingSchedulesScheduleIdHistory**](AnalyticsApi.md#getReportingSchedulesScheduleIdHistory) | **GET** api/v2/analytics/reporting/schedules/{scheduleId}/history | Get list of completed scheduled report jobs.
[**getReportingSchedulesScheduleIdHistoryLatest**](AnalyticsApi.md#getReportingSchedulesScheduleIdHistoryLatest) | **GET** api/v2/analytics/reporting/schedules/{scheduleId}/history/latest | Get most recently completed scheduled report job.
[**getReportingSchedulesScheduleIdHistoryRunId**](AnalyticsApi.md#getReportingSchedulesScheduleIdHistoryRunId) | **GET** api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId} | A completed scheduled report job
[**getReportingTimeperiods**](AnalyticsApi.md#getReportingTimeperiods) | **GET** api/v2/analytics/reporting/timeperiods | Get a list of report time periods.
[**postConversationsAggregatesQuery**](AnalyticsApi.md#postConversationsAggregatesQuery) | **POST** api/v2/analytics/conversations/aggregates/query | Query for conversation aggregates
[**postConversationsConversationIdDetailsProperties**](AnalyticsApi.md#postConversationsConversationIdDetailsProperties) | **POST** api/v2/analytics/conversations/{conversationId}/details/properties | Index conversation properties
[**postConversationsDetailsQuery**](AnalyticsApi.md#postConversationsDetailsQuery) | **POST** api/v2/analytics/conversations/details/query | Query for conversation details
[**postEvaluationsAggregatesQuery**](AnalyticsApi.md#postEvaluationsAggregatesQuery) | **POST** api/v2/analytics/evaluations/aggregates/query | Query for evaluation aggregates
[**postQueuesObservationsQuery**](AnalyticsApi.md#postQueuesObservationsQuery) | **POST** api/v2/analytics/queues/observations/query | Query for queue observations
[**postReportingSchedules**](AnalyticsApi.md#postReportingSchedules) | **POST** api/v2/analytics/reporting/schedules | Create a scheduled report job
[**postReportingSchedulesScheduleIdRunreport**](AnalyticsApi.md#postReportingSchedulesScheduleIdRunreport) | **POST** api/v2/analytics/reporting/schedules/{scheduleId}/runreport | Place a scheduled report immediately into the reporting queue
[**postUsersAggregatesQuery**](AnalyticsApi.md#postUsersAggregatesQuery) | **POST** api/v2/analytics/users/aggregates/query | Query for user aggregates
[**postUsersObservationsQuery**](AnalyticsApi.md#postUsersObservationsQuery) | **POST** api/v2/analytics/users/observations/query | Query for user observations
[**putReportingSchedulesScheduleId**](AnalyticsApi.md#putReportingSchedulesScheduleId) | **PUT** api/v2/analytics/reporting/schedules/{scheduleId} | Update a scheduled report job.


<a name="deleteReportingSchedulesScheduleId"></a>
# **deleteReportingSchedulesScheduleId**
> String deleteReportingSchedulesScheduleId(scheduleId)

Delete a scheduled report job.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    String result = apiInstance.deleteReportingSchedulesScheduleId(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#deleteReportingSchedulesScheduleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsConversationIdDetails"></a>
# **getConversationsConversationIdDetails**
> AnalyticsConversation getConversationsConversationIdDetails(conversationId)

Get a conversation by id



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversation result = apiInstance.getConversationsConversationIdDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getConversationsConversationIdDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |

### Return type

[**AnalyticsConversation**](AnalyticsConversation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingMetadata"></a>
# **getReportingMetadata**
> ReportMetaDataEntityListing getReportingMetadata(pageNumber, pageSize, locale)

Get list of reporting metadata.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String locale = "locale_example"; // String | Locale
try {
    ReportMetaDataEntityListing result = apiInstance.getReportingMetadata(pageNumber, pageSize, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **locale** | **String**| Locale | [optional]

### Return type

[**ReportMetaDataEntityListing**](ReportMetaDataEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingReportIdMetadata"></a>
# **getReportingReportIdMetadata**
> ReportMetaData getReportingReportIdMetadata(reportId, locale)

Get a reporting metadata.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String reportId = "reportId_example"; // String | Report ID
String locale = "locale_example"; // String | Locale
try {
    ReportMetaData result = apiInstance.getReportingReportIdMetadata(reportId, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingReportIdMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| Report ID |
 **locale** | **String**| Locale | [optional]

### Return type

[**ReportMetaData**](ReportMetaData.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingReportformats"></a>
# **getReportingReportformats**
> List&lt;String&gt; getReportingReportformats()

Get a list of report formats

Get a list of report formats.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    List<String> result = apiInstance.getReportingReportformats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingReportformats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingSchedules"></a>
# **getReportingSchedules**
> ReportScheduleEntityListing getReportingSchedules(pageNumber, pageSize)

Get a list of scheduled report jobs

Get a list of scheduled report jobs.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ReportScheduleEntityListing result = apiInstance.getReportingSchedules(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]

### Return type

[**ReportScheduleEntityListing**](ReportScheduleEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingSchedulesScheduleId"></a>
# **getReportingSchedulesScheduleId**
> ReportSchedule getReportingSchedulesScheduleId(scheduleId)

Get a scheduled report job.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportSchedule result = apiInstance.getReportingSchedulesScheduleId(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingSchedulesScheduleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |

### Return type

[**ReportSchedule**](ReportSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingSchedulesScheduleIdHistory"></a>
# **getReportingSchedulesScheduleIdHistory**
> ReportRunEntryEntityDomainListing getReportingSchedulesScheduleIdHistory(scheduleId, pageNumber, pageSize)

Get list of completed scheduled report jobs.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
Integer pageNumber = 1; // Integer | 
Integer pageSize = 25; // Integer | 
try {
    ReportRunEntryEntityDomainListing result = apiInstance.getReportingSchedulesScheduleIdHistory(scheduleId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingSchedulesScheduleIdHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 25]

### Return type

[**ReportRunEntryEntityDomainListing**](ReportRunEntryEntityDomainListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingSchedulesScheduleIdHistoryLatest"></a>
# **getReportingSchedulesScheduleIdHistoryLatest**
> ReportRunEntry getReportingSchedulesScheduleIdHistoryLatest(scheduleId)

Get most recently completed scheduled report job.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportRunEntry result = apiInstance.getReportingSchedulesScheduleIdHistoryLatest(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingSchedulesScheduleIdHistoryLatest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |

### Return type

[**ReportRunEntry**](ReportRunEntry.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingSchedulesScheduleIdHistoryRunId"></a>
# **getReportingSchedulesScheduleIdHistoryRunId**
> ReportRunEntry getReportingSchedulesScheduleIdHistoryRunId(runId, scheduleId)

A completed scheduled report job

A completed scheduled report job.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String runId = "runId_example"; // String | Run ID
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportRunEntry result = apiInstance.getReportingSchedulesScheduleIdHistoryRunId(runId, scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingSchedulesScheduleIdHistoryRunId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**| Run ID |
 **scheduleId** | **String**| Schedule ID |

### Return type

[**ReportRunEntry**](ReportRunEntry.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportingTimeperiods"></a>
# **getReportingTimeperiods**
> List&lt;String&gt; getReportingTimeperiods()

Get a list of report time periods.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    List<String> result = apiInstance.getReportingTimeperiods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getReportingTimeperiods");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsAggregatesQuery"></a>
# **postConversationsAggregatesQuery**
> AggregateQueryResponse postConversationsAggregatesQuery(body)

Query for conversation aggregates



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postConversationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AggregationQuery**](AggregationQuery.md)| query |

### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsConversationIdDetailsProperties"></a>
# **postConversationsConversationIdDetailsProperties**
> PropertyIndexRequest postConversationsConversationIdDetailsProperties(conversationId, body)

Index conversation properties



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postConversationsConversationIdDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postConversationsConversationIdDetailsProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **body** | [**PropertyIndexRequest**](PropertyIndexRequest.md)| request |

### Return type

[**PropertyIndexRequest**](PropertyIndexRequest.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsDetailsQuery"></a>
# **postConversationsDetailsQuery**
> AnalyticsConversationQueryResponse postConversationsDetailsQuery(body)

Query for conversation details



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postConversationsDetailsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConversationQuery**](ConversationQuery.md)| query |

### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEvaluationsAggregatesQuery"></a>
# **postEvaluationsAggregatesQuery**
> AggregateQueryResponse postEvaluationsAggregatesQuery(body)

Query for evaluation aggregates



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postEvaluationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postEvaluationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AggregationQuery**](AggregationQuery.md)| query |

### Return type

[**AggregateQueryResponse**](AggregateQueryResponse.md)

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
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    QualifierMappingObservationQueryResponse result = apiInstance.postQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postQueuesObservationsQuery");
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

<a name="postReportingSchedules"></a>
# **postReportingSchedules**
> ReportSchedule postReportingSchedules(body)

Create a scheduled report job

Create a scheduled report job.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
ReportSchedule body = new ReportSchedule(); // ReportSchedule | ReportSchedule
try {
    ReportSchedule result = apiInstance.postReportingSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postReportingSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportSchedule**](ReportSchedule.md)| ReportSchedule |

### Return type

[**ReportSchedule**](ReportSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postReportingSchedulesScheduleIdRunreport"></a>
# **postReportingSchedulesScheduleIdRunreport**
> RunNowResponse postReportingSchedulesScheduleIdRunreport(scheduleId)

Place a scheduled report immediately into the reporting queue



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    RunNowResponse result = apiInstance.postReportingSchedulesScheduleIdRunreport(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postReportingSchedulesScheduleIdRunreport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |

### Return type

[**RunNowResponse**](RunNowResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAggregatesQuery"></a>
# **postUsersAggregatesQuery**
> PresenceQueryResponse postUsersAggregatesQuery(body)

Query for user aggregates



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    PresenceQueryResponse result = apiInstance.postUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postUsersAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AggregationQuery**](AggregationQuery.md)| query |

### Return type

[**PresenceQueryResponse**](PresenceQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersObservationsQuery"></a>
# **postUsersObservationsQuery**
> ObservationQueryResponse postUsersObservationsQuery(body)

Query for user observations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    ObservationQueryResponse result = apiInstance.postUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postUsersObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObservationQuery**](ObservationQuery.md)| query |

### Return type

[**ObservationQueryResponse**](ObservationQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putReportingSchedulesScheduleId"></a>
# **putReportingSchedulesScheduleId**
> ReportSchedule putReportingSchedulesScheduleId(scheduleId, body)

Update a scheduled report job.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
ReportSchedule body = new ReportSchedule(); // ReportSchedule | ReportSchedule
try {
    ReportSchedule result = apiInstance.putReportingSchedulesScheduleId(scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#putReportingSchedulesScheduleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | **String**| Schedule ID |
 **body** | [**ReportSchedule**](ReportSchedule.md)| ReportSchedule |

### Return type

[**ReportSchedule**](ReportSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

