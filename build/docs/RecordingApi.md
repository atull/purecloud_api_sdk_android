# RecordingApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId**](RecordingApi.md#deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId) | **DELETE** api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Delete annotation
[**deleteMediaretentionpolicies**](RecordingApi.md#deleteMediaretentionpolicies) | **DELETE** api/v2/recording/mediaretentionpolicies | Delete media retention policies
[**deleteMediaretentionpoliciesPolicyId**](RecordingApi.md#deleteMediaretentionpoliciesPolicyId) | **DELETE** api/v2/recording/mediaretentionpolicies/{policyId} | Delete a media retention policy
[**deleteOrphanId**](RecordingApi.md#deleteOrphanId) | **DELETE** api/v2/orphanrecordings/{orphanId} |  deletes a single orphan recording
[**getConversationIdRecordings**](RecordingApi.md#getConversationIdRecordings) | **GET** api/v2/conversations/{conversationId}/recordings | Get all of a Conversation&#39;s Recordings.
[**getConversationIdRecordingsRecordingId**](RecordingApi.md#getConversationIdRecordingsRecordingId) | **GET** api/v2/conversations/{conversationId}/recordings/{recordingId} | Gets a specific recording.
[**getConversationIdRecordingsRecordingIdAnnotations**](RecordingApi.md#getConversationIdRecordingsRecordingIdAnnotations) | **GET** api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations | Get annotations for recording
[**getConversationIdRecordingsRecordingIdAnnotationsAnnotationId**](RecordingApi.md#getConversationIdRecordingsRecordingIdAnnotationsAnnotationId) | **GET** api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Get annotation
[**getMediaretentionpolicies**](RecordingApi.md#getMediaretentionpolicies) | **GET** api/v2/recording/mediaretentionpolicies | Gets media retention policy list with query options to filter on name and enabled.
[**getMediaretentionpoliciesPolicyId**](RecordingApi.md#getMediaretentionpoliciesPolicyId) | **GET** api/v2/recording/mediaretentionpolicies/{policyId} | Get a media retention policy
[**getOrphanId**](RecordingApi.md#getOrphanId) | **GET** api/v2/orphanrecordings/{orphanId} | Gets a single orphan recording
[**getOrphanrecordings**](RecordingApi.md#getOrphanrecordings) | **GET** api/v2/orphanrecordings | Gets all orphan recordings
[**getSettings**](RecordingApi.md#getSettings) | **GET** api/v2/recording/settings | Get the Recording Settings for the Organization
[**getsScreensessions**](RecordingApi.md#getsScreensessions) | **GET** api/v2/recordings/screensessions | Retrieves a paged listing of screen recording sessions
[**patchMediaretentionpoliciesPolicyId**](RecordingApi.md#patchMediaretentionpoliciesPolicyId) | **PATCH** api/v2/recording/mediaretentionpolicies/{policyId} | Patch a media retention policy
[**postConversationIdRecordingsRecordingIdAnnotations**](RecordingApi.md#postConversationIdRecordingsRecordingIdAnnotations) | **POST** api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations | Create annotation
[**postMediaretentionpolicies**](RecordingApi.md#postMediaretentionpolicies) | **POST** api/v2/recording/mediaretentionpolicies | Create media retention policy
[**putConversationIdRecordingsRecordingId**](RecordingApi.md#putConversationIdRecordingsRecordingId) | **PUT** api/v2/conversations/{conversationId}/recordings/{recordingId} | Updates the retention records on a recording.
[**putConversationIdRecordingsRecordingIdAnnotationsAnnotationId**](RecordingApi.md#putConversationIdRecordingsRecordingIdAnnotationsAnnotationId) | **PUT** api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId} | Update annotation
[**putMediaretentionpoliciesPolicyId**](RecordingApi.md#putMediaretentionpoliciesPolicyId) | **PUT** api/v2/recording/mediaretentionpolicies/{policyId} | Update a media retention policy
[**putSettings**](RecordingApi.md#putSettings) | **PUT** api/v2/recording/settings | Update the Recording Settings for the Organization


<a name="deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId"></a>
# **deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId**
> Void deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId)

Delete annotation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    Void result = apiInstance.deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteConversationIdRecordingsRecordingIdAnnotationsAnnotationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **annotationId** | **String**| Annotation ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMediaretentionpolicies"></a>
# **deleteMediaretentionpolicies**
> String deleteMediaretentionpolicies(ids)

Delete media retention policies

Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String ids = "ids_example"; // String | 
try {
    String result = apiInstance.deleteMediaretentionpolicies(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMediaretentionpoliciesPolicyId"></a>
# **deleteMediaretentionpoliciesPolicyId**
> String deleteMediaretentionpoliciesPolicyId(policyId)

Delete a media retention policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    String result = apiInstance.deleteMediaretentionpoliciesPolicyId(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteMediaretentionpoliciesPolicyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Policy ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrphanId"></a>
# **deleteOrphanId**
> OrphanRecording deleteOrphanId(orphanId)

 deletes a single orphan recording



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.deleteOrphanId(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteOrphanId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orphanId** | **String**| Orphan ID |

### Return type

[**OrphanRecording**](OrphanRecording.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdRecordings"></a>
# **getConversationIdRecordings**
> List&lt;Recording&gt; getConversationIdRecordings(conversationId, maxWaitMs, formatId)

Get all of a Conversation&#39;s Recordings.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
Integer maxWaitMs = 5000; // Integer | The maximum number of milliseconds to wait for the recording to be ready.
String formatId = "WEBM"; // String | The desired media format
try {
    List<Recording> result = apiInstance.getConversationIdRecordings(conversationId, maxWaitMs, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationIdRecordings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **maxWaitMs** | **Integer**| The maximum number of milliseconds to wait for the recording to be ready. | [optional] [default to 5000]
 **formatId** | **String**| The desired media format | [optional] [default to WEBM] [enum: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, NONE]

### Return type

[**List&lt;Recording&gt;**](Recording.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdRecordingsRecordingId"></a>
# **getConversationIdRecordingsRecordingId**
> Void getConversationIdRecordingsRecordingId(conversationId, recordingId, formatId, download, fileName)

Gets a specific recording.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String formatId = "WEBM"; // String | The desired media format.
Boolean download = false; // Boolean | requesting a download format of the recording
String fileName = "fileName_example"; // String | the name of the downloaded fileName
try {
    Void result = apiInstance.getConversationIdRecordingsRecordingId(conversationId, recordingId, formatId, download, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationIdRecordingsRecordingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **formatId** | **String**| The desired media format. | [optional] [default to WEBM] [enum: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, NONE]
 **download** | **Boolean**| requesting a download format of the recording | [optional] [default to false]
 **fileName** | **String**| the name of the downloaded fileName | [optional]

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdRecordingsRecordingIdAnnotations"></a>
# **getConversationIdRecordingsRecordingIdAnnotations**
> List&lt;Annotation&gt; getConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId)

Get annotations for recording



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
try {
    List<Annotation> result = apiInstance.getConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationIdRecordingsRecordingIdAnnotations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |

### Return type

[**List&lt;Annotation&gt;**](Annotation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationIdRecordingsRecordingIdAnnotationsAnnotationId"></a>
# **getConversationIdRecordingsRecordingIdAnnotationsAnnotationId**
> Annotation getConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId)

Get annotation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    Annotation result = apiInstance.getConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationIdRecordingsRecordingIdAnnotationsAnnotationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **annotationId** | **String**| Annotation ID |

### Return type

[**Annotation**](Annotation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMediaretentionpolicies"></a>
# **getMediaretentionpolicies**
> PolicyEntityListing getMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors)

Gets media retention policy list with query options to filter on name and enabled.

for a less verbose response, add summary&#x3D;true to this endpoint

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the policy name - used for filtering results in searches.
Boolean enabled = true; // Boolean | checks to see if policy is enabled - use enabled = true or enabled = false
Boolean summary = false; // Boolean | provides a less verbose response of policy lists.
Boolean hasErrors = true; // Boolean | provides a way to fetch all policies with errors or policies that do not have errors
try {
    PolicyEntityListing result = apiInstance.getMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getMediaretentionpolicies");
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
 **name** | **String**| the policy name - used for filtering results in searches. | [optional]
 **enabled** | **Boolean**| checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false | [optional]
 **summary** | **Boolean**| provides a less verbose response of policy lists. | [optional] [default to false]
 **hasErrors** | **Boolean**| provides a way to fetch all policies with errors or policies that do not have errors | [optional]

### Return type

[**PolicyEntityListing**](PolicyEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMediaretentionpoliciesPolicyId"></a>
# **getMediaretentionpoliciesPolicyId**
> Policy getMediaretentionpoliciesPolicyId(policyId)

Get a media retention policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    Policy result = apiInstance.getMediaretentionpoliciesPolicyId(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getMediaretentionpoliciesPolicyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Policy ID |

### Return type

[**Policy**](Policy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrphanId"></a>
# **getOrphanId**
> OrphanRecording getOrphanId(orphanId)

Gets a single orphan recording



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.getOrphanId(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orphanId** | **String**| Orphan ID |

### Return type

[**OrphanRecording**](OrphanRecording.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrphanrecordings"></a>
# **getOrphanrecordings**
> OrphanRecordingListing getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Gets all orphan recordings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    OrphanRecordingListing result = apiInstance.getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecordings");
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

### Return type

[**OrphanRecordingListing**](OrphanRecordingListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettings"></a>
# **getSettings**
> RecordingSettings getSettings(createDefault)

Get the Recording Settings for the Organization



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
Boolean createDefault = false; // Boolean | If no settings are found, a new one is created with default values
try {
    RecordingSettings result = apiInstance.getSettings(createDefault);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDefault** | **Boolean**| If no settings are found, a new one is created with default values | [optional] [default to false]

### Return type

[**RecordingSettings**](RecordingSettings.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getsScreensessions"></a>
# **getsScreensessions**
> ScreenRecordingSessionListing getsScreensessions(pageSize, pageNumber)

Retrieves a paged listing of screen recording sessions



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ScreenRecordingSessionListing result = apiInstance.getsScreensessions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getsScreensessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**ScreenRecordingSessionListing**](ScreenRecordingSessionListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchMediaretentionpoliciesPolicyId"></a>
# **patchMediaretentionpoliciesPolicyId**
> Policy patchMediaretentionpoliciesPolicyId(policyId, body)

Patch a media retention policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
Policy body = new Policy(); // Policy | Policy
try {
    Policy result = apiInstance.patchMediaretentionpoliciesPolicyId(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchMediaretentionpoliciesPolicyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Policy ID |
 **body** | [**Policy**](Policy.md)| Policy |

### Return type

[**Policy**](Policy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConversationIdRecordingsRecordingIdAnnotations"></a>
# **postConversationIdRecordingsRecordingIdAnnotations**
> Annotation postConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId, body)

Create annotation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.postConversationIdRecordingsRecordingIdAnnotations(conversationId, recordingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postConversationIdRecordingsRecordingIdAnnotations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **body** | [**Annotation**](Annotation.md)| annotation |

### Return type

[**Annotation**](Annotation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMediaretentionpolicies"></a>
# **postMediaretentionpolicies**
> Policy postMediaretentionpolicies(body)

Create media retention policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
Policy body = new Policy(); // Policy | Policy
try {
    Policy result = apiInstance.postMediaretentionpolicies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Policy**](Policy.md)| Policy |

### Return type

[**Policy**](Policy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putConversationIdRecordingsRecordingId"></a>
# **putConversationIdRecordingsRecordingId**
> Void putConversationIdRecordingsRecordingId(conversationId, recordingId, body)

Updates the retention records on a recording.

Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. Use of the query parameter &#39;restoreDays&#39; is deprecated and will be removed in the next major version release. If &#39;restoreDays&#39; is provided, no attempt at updating other retention data will be made. To migrate to the new usage, issuing a request with restoreDays&#x3D;10 would instead set the archiveDate&#39;s time stamp in the PUT body to 10 days in the future.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Recording body = new Recording(); // Recording | recording
try {
    Void result = apiInstance.putConversationIdRecordingsRecordingId(conversationId, recordingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationIdRecordingsRecordingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **body** | [**Recording**](Recording.md)| recording |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putConversationIdRecordingsRecordingIdAnnotationsAnnotationId"></a>
# **putConversationIdRecordingsRecordingIdAnnotationsAnnotationId**
> Annotation putConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId, body)

Update annotation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.putConversationIdRecordingsRecordingIdAnnotationsAnnotationId(conversationId, recordingId, annotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationIdRecordingsRecordingIdAnnotationsAnnotationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **recordingId** | **String**| Recording ID |
 **annotationId** | **String**| Annotation ID |
 **body** | [**Annotation**](Annotation.md)| annotation |

### Return type

[**Annotation**](Annotation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMediaretentionpoliciesPolicyId"></a>
# **putMediaretentionpoliciesPolicyId**
> Policy putMediaretentionpoliciesPolicyId(policyId, body)

Update a media retention policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
Policy body = new Policy(); // Policy | Policy
try {
    Policy result = apiInstance.putMediaretentionpoliciesPolicyId(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putMediaretentionpoliciesPolicyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Policy ID |
 **body** | [**Policy**](Policy.md)| Policy |

### Return type

[**Policy**](Policy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSettings"></a>
# **putSettings**
> RecordingSettings putSettings(body)

Update the Recording Settings for the Organization



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

RecordingApi apiInstance = new RecordingApi();
RecordingSettings body = new RecordingSettings(); // RecordingSettings | Recording settings
try {
    RecordingSettings result = apiInstance.putSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordingSettings**](RecordingSettings.md)| Recording settings |

### Return type

[**RecordingSettings**](RecordingSettings.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

