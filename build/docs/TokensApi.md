# TokensApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMe**](TokensApi.md#deleteMe) | **DELETE** api/v2/tokens/me | Delete  auth token used to make the request.


<a name="deleteMe"></a>
# **deleteMe**
> String deleteMe()

Delete  auth token used to make the request.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TokensApi apiInstance = new TokensApi();
try {
    String result = apiInstance.deleteMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteMe");
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

