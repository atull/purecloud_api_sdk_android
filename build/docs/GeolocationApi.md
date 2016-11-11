# GeolocationApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSettings**](GeolocationApi.md#getSettings) | **GET** api/v2/geolocations/settings | Get a organization&#39;s GeolocationSettings
[**getUserIdGeolocationsClientId**](GeolocationApi.md#getUserIdGeolocationsClientId) | **GET** api/v2/users/{userId}/geolocations/{clientId} | Get a user&#39;s Geolocation
[**patchSettings**](GeolocationApi.md#patchSettings) | **PATCH** api/v2/geolocations/settings | Patch a organization&#39;s GeolocationSettings
[**patchUserIdGeolocationsClientId**](GeolocationApi.md#patchUserIdGeolocationsClientId) | **PATCH** api/v2/users/{userId}/geolocations/{clientId} | Patch a user&#39;s Geolocation


<a name="getSettings"></a>
# **getSettings**
> GeolocationSettings getSettings()

Get a organization&#39;s GeolocationSettings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
try {
    GeolocationSettings result = apiInstance.getSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#getSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GeolocationSettings**](GeolocationSettings.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdGeolocationsClientId"></a>
# **getUserIdGeolocationsClientId**
> Geolocation getUserIdGeolocationsClientId(userId, clientId)

Get a user&#39;s Geolocation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
try {
    Geolocation result = apiInstance.getUserIdGeolocationsClientId(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#getUserIdGeolocationsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Id |
 **clientId** | **String**| client Id |

### Return type

[**Geolocation**](Geolocation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchSettings"></a>
# **patchSettings**
> GeolocationSettings patchSettings(body)

Patch a organization&#39;s GeolocationSettings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
GeolocationSettings body = new GeolocationSettings(); // GeolocationSettings | Geolocation settings
try {
    GeolocationSettings result = apiInstance.patchSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#patchSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeolocationSettings**](GeolocationSettings.md)| Geolocation settings |

### Return type

[**GeolocationSettings**](GeolocationSettings.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserIdGeolocationsClientId"></a>
# **patchUserIdGeolocationsClientId**
> Geolocation patchUserIdGeolocationsClientId(userId, clientId, body)

Patch a user&#39;s Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
Geolocation body = new Geolocation(); // Geolocation | Geolocation
try {
    Geolocation result = apiInstance.patchUserIdGeolocationsClientId(userId, clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#patchUserIdGeolocationsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Id |
 **clientId** | **String**| client Id |
 **body** | [**Geolocation**](Geolocation.md)| Geolocation |

### Return type

[**Geolocation**](Geolocation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

