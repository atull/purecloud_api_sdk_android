# UtilitiesApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDate**](UtilitiesApi.md#getDate) | **GET** api/v2/date | Get the current system date/time
[**getTimezones**](UtilitiesApi.md#getTimezones) | **GET** api/v2/timezones | Get time zones list
[**postDetails**](UtilitiesApi.md#postDetails) | **POST** api/v2/certificate/details | Returns the information about an X509 PEM encoded certificate or certificate chain.


<a name="getDate"></a>
# **getDate**
> ServerDate getDate()

Get the current system date/time



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
try {
    ServerDate result = apiInstance.getDate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getDate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerDate**](ServerDate.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimezones"></a>
# **getTimezones**
> TimeZoneEntityListing getTimezones(pageSize, pageNumber)

Get time zones list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TimeZoneEntityListing result = apiInstance.getTimezones(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#getTimezones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**TimeZoneEntityListing**](TimeZoneEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDetails"></a>
# **postDetails**
> ParsedCertificate postDetails(body)

Returns the information about an X509 PEM encoded certificate or certificate chain.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UtilitiesApi apiInstance = new UtilitiesApi();
Certificate body = new Certificate(); // Certificate | Certificate
try {
    ParsedCertificate result = apiInstance.postDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#postDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Certificate**](Certificate.md)| Certificate |

### Return type

[**ParsedCertificate**](ParsedCertificate.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

