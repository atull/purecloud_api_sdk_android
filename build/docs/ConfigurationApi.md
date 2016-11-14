# ConfigurationApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProvidersEdgesEdgeIdSetuppackage**](ConfigurationApi.md#getProvidersEdgesEdgeIdSetuppackage) | **GET** api/v2/telephony/providers/edges/{edgeId}/setuppackage | Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
[**getRecordingkeys**](ConfigurationApi.md#getRecordingkeys) | **GET** api/v2/recording/recordingkeys | Get encryption key list
[**getRecordingkeysRotationschedule**](ConfigurationApi.md#getRecordingkeysRotationschedule) | **GET** api/v2/recording/recordingkeys/rotationschedule | Get key rotation schedule
[**postRecordingkeys**](ConfigurationApi.md#postRecordingkeys) | **POST** api/v2/recording/recordingkeys | Create encryption key
[**putRecordingkeysRotationschedule**](ConfigurationApi.md#putRecordingkeysRotationschedule) | **PUT** api/v2/recording/recordingkeys/rotationschedule | Update key rotation schedule


<a name="getProvidersEdgesEdgeIdSetuppackage"></a>
# **getProvidersEdgesEdgeIdSetuppackage**
> VirtualEdgeSetupPackage getProvidersEdgesEdgeIdSetuppackage(edgeId)

Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    VirtualEdgeSetupPackage result = apiInstance.getProvidersEdgesEdgeIdSetuppackage(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getProvidersEdgesEdgeIdSetuppackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

[**VirtualEdgeSetupPackage**](VirtualEdgeSetupPackage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecordingkeys"></a>
# **getRecordingkeys**
> EncryptionKeyEntityListing getRecordingkeys(pageSize, pageNumber)

Get encryption key list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EncryptionKeyEntityListing result = apiInstance.getRecordingkeys(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getRecordingkeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**EncryptionKeyEntityListing**](EncryptionKeyEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecordingkeysRotationschedule"></a>
# **getRecordingkeysRotationschedule**
> KeyRotationSchedule getRecordingkeysRotationschedule()

Get key rotation schedule



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
try {
    KeyRotationSchedule result = apiInstance.getRecordingkeysRotationschedule();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**KeyRotationSchedule**](KeyRotationSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRecordingkeys"></a>
# **postRecordingkeys**
> EncryptionKey postRecordingkeys()

Create encryption key



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
try {
    EncryptionKey result = apiInstance.postRecordingkeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#postRecordingkeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EncryptionKey**](EncryptionKey.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRecordingkeysRotationschedule"></a>
# **putRecordingkeysRotationschedule**
> KeyRotationSchedule putRecordingkeysRotationschedule(body)

Update key rotation schedule



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
KeyRotationSchedule body = new KeyRotationSchedule(); // KeyRotationSchedule | KeyRotationSchedule
try {
    KeyRotationSchedule result = apiInstance.putRecordingkeysRotationschedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#putRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyRotationSchedule**](KeyRotationSchedule.md)| KeyRotationSchedule |

### Return type

[**KeyRotationSchedule**](KeyRotationSchedule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

