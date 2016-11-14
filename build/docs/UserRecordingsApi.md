# UserRecordingsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRecordingId**](UserRecordingsApi.md#deleteRecordingId) | **DELETE** api/v2/userrecordings/{recordingId} | Delete a user recording.
[**getRecordingId**](UserRecordingsApi.md#getRecordingId) | **GET** api/v2/userrecordings/{recordingId} | Get a user recording.
[**getRecordingIdMedia**](UserRecordingsApi.md#getRecordingIdMedia) | **GET** api/v2/userrecordings/{recordingId}/media | Download a user recording.
[**getSummary**](UserRecordingsApi.md#getSummary) | **GET** api/v2/userrecordings/summary | Get user recording summary
[**getUserrecordings**](UserRecordingsApi.md#getUserrecordings) | **GET** api/v2/userrecordings | Get a list of user recordings.
[**putRecordingId**](UserRecordingsApi.md#putRecordingId) | **PUT** api/v2/userrecordings/{recordingId} | Update a user recording.


<a name="deleteRecordingId"></a>
# **deleteRecordingId**
> Void deleteRecordingId(recordingId)

Delete a user recording.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
try {
    Void result = apiInstance.deleteRecordingId(recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#deleteRecordingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| User Recording ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecordingId"></a>
# **getRecordingId**
> UserRecording getRecordingId(recordingId, expand)

Get a user recording.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
String expand = "expand_example"; // String | conversation
try {
    UserRecording result = apiInstance.getRecordingId(recordingId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getRecordingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| User Recording ID |
 **expand** | **String**| conversation | [optional]

### Return type

[**UserRecording**](UserRecording.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecordingIdMedia"></a>
# **getRecordingIdMedia**
> DownloadResponse getRecordingIdMedia(recordingId, formatId)

Download a user recording.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
String formatId = "WEBM"; // String | The desired media format.
try {
    DownloadResponse result = apiInstance.getRecordingIdMedia(recordingId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getRecordingIdMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| User Recording ID |
 **formatId** | **String**| The desired media format. | [optional] [default to WEBM] [enum: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, NONE]

### Return type

[**DownloadResponse**](DownloadResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummary"></a>
# **getSummary**
> FaxSummary getSummary()

Get user recording summary



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
try {
    FaxSummary result = apiInstance.getSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FaxSummary**](FaxSummary.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserrecordings"></a>
# **getUserrecordings**
> UserRecordingEntityListing getUserrecordings(pageSize, pageNumber, expand)

Get a list of user recordings.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | conversation
try {
    UserRecordingEntityListing result = apiInstance.getUserrecordings(pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecordings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **expand** | **String**| conversation | [optional]

### Return type

[**UserRecordingEntityListing**](UserRecordingEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRecordingId"></a>
# **putRecordingId**
> UserRecording putRecordingId(recordingId, body, expand)

Update a user recording.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
UserRecording body = new UserRecording(); // UserRecording | UserRecording
String expand = "expand_example"; // String | conversation
try {
    UserRecording result = apiInstance.putRecordingId(recordingId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#putRecordingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| User Recording ID |
 **body** | [**UserRecording**](UserRecording.md)| UserRecording |
 **expand** | **String**| conversation | [optional]

### Return type

[**UserRecording**](UserRecording.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

