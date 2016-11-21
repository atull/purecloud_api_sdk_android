# StationsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteStationIdAssociateduser**](StationsApi.md#deleteStationIdAssociateduser) | **DELETE** api/v2/stations/{stationId}/associateduser | Unassigns the user assigned to this station
[**getStationId**](StationsApi.md#getStationId) | **GET** api/v2/stations/{stationId} | Get station.
[**getStations**](StationsApi.md#getStations) | **GET** api/v2/stations | Get the list of available stations.


<a name="deleteStationIdAssociateduser"></a>
# **deleteStationIdAssociateduser**
> String deleteStationIdAssociateduser(stationId)

Unassigns the user assigned to this station



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    String result = apiInstance.deleteStationIdAssociateduser(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#deleteStationIdAssociateduser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **String**| Station ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStationId"></a>
# **getStationId**
> Station getStationId(stationId)

Get station.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    Station result = apiInstance.getStationId(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **String**| Station ID |

### Return type

[**Station**](Station.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStations"></a>
# **getStations**
> StationEntityListing getStations(pageSize, pageNumber, sortBy, name, lineAppearanceId)

Get the list of available stations.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

StationsApi apiInstance = new StationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
String lineAppearanceId = "lineAppearanceId_example"; // String | lineAppearanceId
try {
    StationEntityListing result = apiInstance.getStations(pageSize, pageNumber, sortBy, name, lineAppearanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStations");
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
 **lineAppearanceId** | **String**| lineAppearanceId | [optional]

### Return type

[**StationEntityListing**](StationEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

