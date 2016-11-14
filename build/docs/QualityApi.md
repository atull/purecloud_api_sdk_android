# QualityApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCalibrationsCalibrationId**](QualityApi.md#deleteCalibrationsCalibrationId) | **DELETE** api/v2/quality/calibrations/{calibrationId} | Delete a calibration by id.
[**deleteConversationsConversationIdEvaluationsEvaluationId**](QualityApi.md#deleteConversationsConversationIdEvaluationsEvaluationId) | **DELETE** api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Delete an evaluation
[**deleteFormsFormId**](QualityApi.md#deleteFormsFormId) | **DELETE** api/v2/quality/forms/{formId} | Delete an evaluation form.
[**deleteKeywordsets**](QualityApi.md#deleteKeywordsets) | **DELETE** api/v2/quality/keywordsets | Delete keyword sets
[**deleteKeywordsetsKeywordsetId**](QualityApi.md#deleteKeywordsetsKeywordsetId) | **DELETE** api/v2/quality/keywordsets/{keywordSetId} | Delete a keywordSet by id.
[**getAgentsActivity**](QualityApi.md#getAgentsActivity) | **GET** api/v2/quality/agents/activity | Gets a list of Agent Activities
[**getCalibrations**](QualityApi.md#getCalibrations) | **GET** api/v2/quality/calibrations | Get the list of calibrations
[**getCalibrationsCalibrationId**](QualityApi.md#getCalibrationsCalibrationId) | **GET** api/v2/quality/calibrations/{calibrationId} | Get a calibration by id.
[**getConversationsConversationIdAudits**](QualityApi.md#getConversationsConversationIdAudits) | **GET** api/v2/quality/conversations/{conversationId}/audits | Get audits for conversation or recording
[**getConversationsConversationIdEvaluationsEvaluationId**](QualityApi.md#getConversationsConversationIdEvaluationsEvaluationId) | **GET** api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Get an evaluation
[**getEvaluationsQuery**](QualityApi.md#getEvaluationsQuery) | **GET** api/v2/quality/evaluations/query | Queries Evaluations and returns a paged list
[**getEvaluatorsActivity**](QualityApi.md#getEvaluatorsActivity) | **GET** api/v2/quality/evaluators/activity | Get an evaluator activity
[**getForms**](QualityApi.md#getForms) | **GET** api/v2/quality/forms | Get the list of evaluation forms
[**getFormsFormId**](QualityApi.md#getFormsFormId) | **GET** api/v2/quality/forms/{formId} | Get an evaluation form
[**getFormsFormIdVersions**](QualityApi.md#getFormsFormIdVersions) | **GET** api/v2/quality/forms/{formId}/versions | Gets all the revisions for a specific evaluation.
[**getKeywordsets**](QualityApi.md#getKeywordsets) | **GET** api/v2/quality/keywordsets | Get the list of keyword sets
[**getKeywordsetsKeywordsetId**](QualityApi.md#getKeywordsetsKeywordsetId) | **GET** api/v2/quality/keywordsets/{keywordSetId} | Get a keywordSet by id.
[**getPublishedforms**](QualityApi.md#getPublishedforms) | **GET** api/v2/quality/publishedforms | Get the published evaluation forms.
[**getPublishedformsFormId**](QualityApi.md#getPublishedformsFormId) | **GET** api/v2/quality/publishedforms/{formId} | Get the published evaluation forms.
[**postCalibrations**](QualityApi.md#postCalibrations) | **POST** api/v2/quality/calibrations | Create a calibration
[**postConversationsConversationIdEvaluations**](QualityApi.md#postConversationsConversationIdEvaluations) | **POST** api/v2/quality/conversations/{conversationId}/evaluations | Create an evaluation
[**postEvaluationsAggregatesQuery**](QualityApi.md#postEvaluationsAggregatesQuery) | **POST** api/v2/analytics/evaluations/aggregates/query | Query for evaluation aggregates
[**postEvaluationsScoring**](QualityApi.md#postEvaluationsScoring) | **POST** api/v2/quality/evaluations/scoring | Score evaluation
[**postForms**](QualityApi.md#postForms) | **POST** api/v2/quality/forms | Create an evaluation form.
[**postKeywordsets**](QualityApi.md#postKeywordsets) | **POST** api/v2/quality/keywordsets | Create a Keyword Set
[**postPublishedforms**](QualityApi.md#postPublishedforms) | **POST** api/v2/quality/publishedforms | Publish an evaluation form.
[**postSpotability**](QualityApi.md#postSpotability) | **POST** api/v2/quality/spotability | Retrieve the spotability statistic
[**putCalibrationsCalibrationId**](QualityApi.md#putCalibrationsCalibrationId) | **PUT** api/v2/quality/calibrations/{calibrationId} | Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
[**putConversationsConversationIdEvaluationsEvaluationId**](QualityApi.md#putConversationsConversationIdEvaluationsEvaluationId) | **PUT** api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId} | Update an evaluation
[**putFormsFormId**](QualityApi.md#putFormsFormId) | **PUT** api/v2/quality/forms/{formId} | Update an evaluation form.
[**putKeywordsetsKeywordsetId**](QualityApi.md#putKeywordsetsKeywordsetId) | **PUT** api/v2/quality/keywordsets/{keywordSetId} | Update a keywordSet to the specified keywordSet via PUT.


<a name="deleteCalibrationsCalibrationId"></a>
# **deleteCalibrationsCalibrationId**
> Calibration deleteCalibrationsCalibrationId(calibrationId, calibratorId)

Delete a calibration by id.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
try {
    Calibration result = apiInstance.deleteCalibrationsCalibrationId(calibrationId, calibratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteCalibrationsCalibrationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calibrationId** | **String**| Calibration ID |
 **calibratorId** | **String**| calibratorId |

### Return type

[**Calibration**](Calibration.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConversationsConversationIdEvaluationsEvaluationId"></a>
# **deleteConversationsConversationIdEvaluationsEvaluationId**
> Evaluation deleteConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand)

Delete an evaluation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.deleteConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteConversationsConversationIdEvaluationsEvaluationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **evaluationId** | **String**| evaluationId |
 **expand** | **String**| evaluatorId | [optional]

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFormsFormId"></a>
# **deleteFormsFormId**
> String deleteFormsFormId(formId)

Delete an evaluation form.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    String result = apiInstance.deleteFormsFormId(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteFormsFormId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| Form ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKeywordsets"></a>
# **deleteKeywordsets**
> String deleteKeywordsets(ids)

Delete keyword sets

Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String ids = "ids_example"; // String | A comma-delimited list of valid KeywordSet ids
try {
    String result = apiInstance.deleteKeywordsets(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteKeywordsets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| A comma-delimited list of valid KeywordSet ids |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKeywordsetsKeywordsetId"></a>
# **deleteKeywordsetsKeywordsetId**
> Void deleteKeywordsetsKeywordsetId(keywordSetId)

Delete a keywordSet by id.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
try {
    Void result = apiInstance.deleteKeywordsetsKeywordsetId(keywordSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteKeywordsetsKeywordsetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordSetId** | **String**| KeywordSet ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentsActivity"></a>
# **getAgentsActivity**
> AgentActivityEntityListing getAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group)

Gets a list of Agent Activities

Including the number of evaluations and average evaluation score

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
List<Object> agentUserId = null; // List<Object> | user id of agent requested
String evaluatorUserId = "evaluatorUserId_example"; // String | user id of the evaluator
String name = "name_example"; // String | name
String group = "group_example"; // String | group id
try {
    AgentActivityEntityListing result = apiInstance.getAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getAgentsActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **startTime** | **Date**| Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]
 **endTime** | **Date**| End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]
 **agentUserId** | [**List&lt;Object&gt;**](Object.md)| user id of agent requested | [optional]
 **evaluatorUserId** | **String**| user id of the evaluator | [optional]
 **name** | **String**| name | [optional]
 **group** | **String**| group id | [optional]

### Return type

[**AgentActivityEntityListing**](AgentActivityEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCalibrations"></a>
# **getCalibrations**
> CalibrationEntityListing getCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime)

Get the list of calibrations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String calibratorId = "calibratorId_example"; // String | user id of calibrator
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversation id
Date startTime = new Date(); // Date | Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
try {
    CalibrationEntityListing result = apiInstance.getCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getCalibrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calibratorId** | **String**| user id of calibrator |
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **conversationId** | **String**| conversation id | [optional]
 **startTime** | **Date**| Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]
 **endTime** | **Date**| end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]

### Return type

[**CalibrationEntityListing**](CalibrationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCalibrationsCalibrationId"></a>
# **getCalibrationsCalibrationId**
> Calibration getCalibrationsCalibrationId(calibrationId, calibratorId)

Get a calibration by id.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
try {
    Calibration result = apiInstance.getCalibrationsCalibrationId(calibrationId, calibratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getCalibrationsCalibrationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calibrationId** | **String**| Calibration ID |
 **calibratorId** | **String**| calibratorId |

### Return type

[**Calibration**](Calibration.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsConversationIdAudits"></a>
# **getConversationsConversationIdAudits**
> QualityAuditPage getConversationsConversationIdAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType)

Get audits for conversation or recording



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | Conversation ID
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String recordingId = "recordingId_example"; // String | id of the recording
String entityType = "RECORDING"; // String | entity type options: Recording, Calibration, Evaluation, Annotation
try {
    QualityAuditPage result = apiInstance.getConversationsConversationIdAudits(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getConversationsConversationIdAudits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **recordingId** | **String**| id of the recording | [optional]
 **entityType** | **String**| entity type options: Recording, Calibration, Evaluation, Annotation | [optional] [default to RECORDING]

### Return type

[**QualityAuditPage**](QualityAuditPage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsConversationIdEvaluationsEvaluationId"></a>
# **getConversationsConversationIdEvaluationsEvaluationId**
> Evaluation getConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand)

Get an evaluation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | agent, evaluator, evaluationForm
try {
    Evaluation result = apiInstance.getConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getConversationsConversationIdEvaluationsEvaluationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **evaluationId** | **String**| evaluationId |
 **expand** | **String**| agent, evaluator, evaluationForm | [optional]

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEvaluationsQuery"></a>
# **getEvaluationsQuery**
> EvaluationEntityListing getEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum)

Queries Evaluations and returns a paged list

Query params must include one of conversationId, evaluatorUserId, or agentUserId

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversationId specified
String agentUserId = "agentUserId_example"; // String | user id of the agent
String evaluatorUserId = "evaluatorUserId_example"; // String | evaluator user id
String queueId = "queueId_example"; // String | queue id
String startTime = "startTime_example"; // String | start time of the evaluation query
String endTime = "endTime_example"; // String | end time of the evaluation query
List<Object> evaluationState = null; // List<Object> | evaluation state options: Pending, InProgress, Finished
Boolean isReleased = true; // Boolean | the evaluation has been released
Boolean agentHasRead = true; // Boolean | agent has the evaluation
Boolean expandAnswerTotalScores = true; // Boolean | get the total scores for evaluations
Integer maximum = 56; // Integer | maximum
try {
    EvaluationEntityListing result = apiInstance.getEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getEvaluationsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **conversationId** | **String**| conversationId specified | [optional]
 **agentUserId** | **String**| user id of the agent | [optional]
 **evaluatorUserId** | **String**| evaluator user id | [optional]
 **queueId** | **String**| queue id | [optional]
 **startTime** | **String**| start time of the evaluation query | [optional]
 **endTime** | **String**| end time of the evaluation query | [optional]
 **evaluationState** | [**List&lt;Object&gt;**](Object.md)| evaluation state options: Pending, InProgress, Finished | [optional]
 **isReleased** | **Boolean**| the evaluation has been released | [optional]
 **agentHasRead** | **Boolean**| agent has the evaluation | [optional]
 **expandAnswerTotalScores** | **Boolean**| get the total scores for evaluations | [optional]
 **maximum** | **Integer**| maximum | [optional]

### Return type

[**EvaluationEntityListing**](EvaluationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEvaluatorsActivity"></a>
# **getEvaluatorsActivity**
> EvaluatorActivityEntityListing getEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group)

Get an evaluator activity



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
Date endTime = new Date(); // Date | The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
String name = "name_example"; // String | Evaluator name
List<Object> permission = null; // List<Object> | permission strings
String group = "group_example"; // String | group id
try {
    EvaluatorActivityEntityListing result = apiInstance.getEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getEvaluatorsActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **startTime** | **Date**| The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]
 **endTime** | **Date**| The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ | [optional]
 **name** | **String**| Evaluator name | [optional]
 **permission** | [**List&lt;Object&gt;**](Object.md)| permission strings | [optional]
 **group** | **String**| group id | [optional]

### Return type

[**EvaluatorActivityEntityListing**](EvaluatorActivityEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getForms"></a>
# **getForms**
> EvaluationFormEntityListing getForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name)

Get the list of evaluation forms



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
try {
    EvaluationFormEntityListing result = apiInstance.getForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getForms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **expand** | **String**| Expand | [optional]
 **name** | **String**| Name | [optional]

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFormsFormId"></a>
# **getFormsFormId**
> EvaluationForm getFormsFormId(formId)

Get an evaluation form



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getFormsFormId(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getFormsFormId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| Form ID |

### Return type

[**EvaluationForm**](EvaluationForm.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFormsFormIdVersions"></a>
# **getFormsFormIdVersions**
> EvaluationFormEntityListing getFormsFormIdVersions(formId, pageSize, pageNumber)

Gets all the revisions for a specific evaluation.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EvaluationFormEntityListing result = apiInstance.getFormsFormIdVersions(formId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getFormsFormIdVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| Form ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKeywordsets"></a>
# **getKeywordsets**
> KeywordSetEntityListing getKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name)

Get the list of keyword sets



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the keyword set name - used for filtering results in searches.
try {
    KeywordSetEntityListing result = apiInstance.getKeywordsets(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getKeywordsets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **name** | **String**| the keyword set name - used for filtering results in searches. | [optional]

### Return type

[**KeywordSetEntityListing**](KeywordSetEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKeywordsetsKeywordsetId"></a>
# **getKeywordsetsKeywordsetId**
> KeywordSet getKeywordsetsKeywordsetId(keywordSetId)

Get a keywordSet by id.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
try {
    KeywordSet result = apiInstance.getKeywordsetsKeywordsetId(keywordSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getKeywordsetsKeywordsetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordSetId** | **String**| KeywordSet ID |

### Return type

[**KeywordSet**](KeywordSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublishedforms"></a>
# **getPublishedforms**
> EvaluationFormEntityListing getPublishedforms(pageSize, pageNumber, name)

Get the published evaluation forms.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
try {
    EvaluationFormEntityListing result = apiInstance.getPublishedforms(pageSize, pageNumber, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getPublishedforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublishedformsFormId"></a>
# **getPublishedformsFormId**
> EvaluationForm getPublishedformsFormId(formId)

Get the published evaluation forms.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getPublishedformsFormId(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getPublishedformsFormId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| Form ID |

### Return type

[**EvaluationForm**](EvaluationForm.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCalibrations"></a>
# **postCalibrations**
> Calibration postCalibrations(body, expand)

Create a calibration



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
Calibration body = new Calibration(); // Calibration | calibration
String expand = "expand_example"; // String | calibratorId
try {
    Calibration result = apiInstance.postCalibrations(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postCalibrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Calibration**](Calibration.md)| calibration |
 **expand** | **String**| calibratorId | [optional]

### Return type

[**Calibration**](Calibration.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationsConversationIdEvaluations"></a>
# **postConversationsConversationIdEvaluations**
> Evaluation postConversationsConversationIdEvaluations(conversationId, body, expand)

Create an evaluation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
Evaluation body = new Evaluation(); // Evaluation | evaluation
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.postConversationsConversationIdEvaluations(conversationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postConversationsConversationIdEvaluations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **body** | [**Evaluation**](Evaluation.md)| evaluation |
 **expand** | **String**| evaluatorId | [optional]

### Return type

[**Evaluation**](Evaluation.md)

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
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    AggregateQueryResponse result = apiInstance.postEvaluationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postEvaluationsAggregatesQuery");
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

<a name="postEvaluationsScoring"></a>
# **postEvaluationsScoring**
> EvaluationScoringSet postEvaluationsScoring(body)

Score evaluation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
EvaluationFormAndScoringSet body = new EvaluationFormAndScoringSet(); // EvaluationFormAndScoringSet | evaluationAndScoringSet
try {
    EvaluationScoringSet result = apiInstance.postEvaluationsScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postEvaluationsScoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluationFormAndScoringSet**](EvaluationFormAndScoringSet.md)| evaluationAndScoringSet |

### Return type

[**EvaluationScoringSet**](EvaluationScoringSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postForms"></a>
# **postForms**
> EvaluationForm postForms(body)

Create an evaluation form.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.postForms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postForms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluationForm**](EvaluationForm.md)| Evaluation form |

### Return type

[**EvaluationForm**](EvaluationForm.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postKeywordsets"></a>
# **postKeywordsets**
> KeywordSet postKeywordsets(body, expand)

Create a Keyword Set



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
KeywordSet body = new KeywordSet(); // KeywordSet | keywordSet
String expand = "expand_example"; // String | queueId
try {
    KeywordSet result = apiInstance.postKeywordsets(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postKeywordsets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeywordSet**](KeywordSet.md)| keywordSet |
 **expand** | **String**| queueId | [optional]

### Return type

[**KeywordSet**](KeywordSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPublishedforms"></a>
# **postPublishedforms**
> EvaluationForm postPublishedforms(body)

Publish an evaluation form.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.postPublishedforms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postPublishedforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluationForm**](EvaluationForm.md)| Evaluation form |

### Return type

[**EvaluationForm**](EvaluationForm.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSpotability"></a>
# **postSpotability**
> KeywordSet postSpotability(body)

Retrieve the spotability statistic



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
KeywordSet body = new KeywordSet(); // KeywordSet | Keyword Set
try {
    KeywordSet result = apiInstance.postSpotability(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postSpotability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeywordSet**](KeywordSet.md)| Keyword Set | [optional]

### Return type

[**KeywordSet**](KeywordSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCalibrationsCalibrationId"></a>
# **putCalibrationsCalibrationId**
> Calibration putCalibrationsCalibrationId(calibrationId, body)

Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
Calibration body = new Calibration(); // Calibration | Calibration
try {
    Calibration result = apiInstance.putCalibrationsCalibrationId(calibrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putCalibrationsCalibrationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calibrationId** | **String**| Calibration ID |
 **body** | [**Calibration**](Calibration.md)| Calibration |

### Return type

[**Calibration**](Calibration.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putConversationsConversationIdEvaluationsEvaluationId"></a>
# **putConversationsConversationIdEvaluationsEvaluationId**
> Evaluation putConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, body, expand)

Update an evaluation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
Evaluation body = new Evaluation(); // Evaluation | evaluation
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.putConversationsConversationIdEvaluationsEvaluationId(conversationId, evaluationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putConversationsConversationIdEvaluationsEvaluationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| conversationId |
 **evaluationId** | **String**| evaluationId |
 **body** | [**Evaluation**](Evaluation.md)| evaluation |
 **expand** | **String**| evaluatorId | [optional]

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFormsFormId"></a>
# **putFormsFormId**
> EvaluationForm putFormsFormId(formId, body)

Update an evaluation form.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.putFormsFormId(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putFormsFormId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| Form ID |
 **body** | [**EvaluationForm**](EvaluationForm.md)| Evaluation form |

### Return type

[**EvaluationForm**](EvaluationForm.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putKeywordsetsKeywordsetId"></a>
# **putKeywordsetsKeywordsetId**
> KeywordSet putKeywordsetsKeywordsetId(keywordSetId, body)

Update a keywordSet to the specified keywordSet via PUT.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

QualityApi apiInstance = new QualityApi();
String keywordSetId = "keywordSetId_example"; // String | KeywordSet ID
KeywordSet body = new KeywordSet(); // KeywordSet | keywordSet
try {
    KeywordSet result = apiInstance.putKeywordsetsKeywordsetId(keywordSetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putKeywordsetsKeywordsetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordSetId** | **String**| KeywordSet ID |
 **body** | [**KeywordSet**](KeywordSet.md)| keywordSet |

### Return type

[**KeywordSet**](KeywordSet.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

