# SearchApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearch**](SearchApi.md#getSearch) | **GET** api/v2/groups/search | Search using q64
[**getSearch_0**](SearchApi.md#getSearch_0) | **GET** api/v2/locations/search | Search using q64
[**getSearch_1**](SearchApi.md#getSearch_1) | **GET** api/v2/search | Search using q64
[**getSearch_2**](SearchApi.md#getSearch_2) | **GET** api/v2/users/search | Search using q64
[**getSuggest**](SearchApi.md#getSuggest) | **GET** api/v2/search/suggest | Suggest using q64
[**postSearch**](SearchApi.md#postSearch) | **POST** api/v2/groups/search | Search
[**postSearch_0**](SearchApi.md#postSearch_0) | **POST** api/v2/locations/search | Search
[**postSearch_1**](SearchApi.md#postSearch_1) | **POST** api/v2/search | Search
[**postSearch_2**](SearchApi.md#postSearch_2) | **POST** api/v2/users/search | Search
[**postSuggest**](SearchApi.md#postSuggest) | **POST** api/v2/search/suggest | Suggest


<a name="getSearch"></a>
# **getSearch**
> GroupsSearchResponse getSearch(q64, expand)

Search using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q64** | **String**| q64 |
 **expand** | [**List&lt;String&gt;**](String.md)| expand | [optional]

### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearch_0"></a>
# **getSearch_0**
> LocationsSearchResponse getSearch_0(q64, expand)

Search using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    LocationsSearchResponse result = apiInstance.getSearch_0(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q64** | **String**| q64 |
 **expand** | [**List&lt;String&gt;**](String.md)| expand | [optional]

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearch_1"></a>
# **getSearch_1**
> JsonNodeSearchResponse getSearch_1(q64, expand, profile)

Search using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearch_1(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q64** | **String**| q64 |
 **expand** | [**List&lt;String&gt;**](String.md)| expand | [optional]
 **profile** | **Boolean**| profile | [optional] [default to true]

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearch_2"></a>
# **getSearch_2**
> UsersSearchResponse getSearch_2(q64, expand)

Search using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    UsersSearchResponse result = apiInstance.getSearch_2(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q64** | **String**| q64 |
 **expand** | [**List&lt;String&gt;**](String.md)| expand | [optional]

### Return type

[**UsersSearchResponse**](UsersSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSuggest"></a>
# **getSuggest**
> JsonNodeSearchResponse getSuggest(q64, profile)

Suggest using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSuggest(q64, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSuggest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q64** | **String**| q64 |
 **profile** | **Boolean**| profile | [optional] [default to true]

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch"></a>
# **postSearch**
> GroupsSearchResponse postSearch(body)

Search



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupSearchRequest**](GroupSearchRequest.md)| Search request options |

### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch_0"></a>
# **postSearch_0**
> LocationsSearchResponse postSearch_0(body)

Search



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postSearch_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationSearchRequest**](LocationSearchRequest.md)| Search request options |

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch_1"></a>
# **postSearch_1**
> JsonNodeSearchResponse postSearch_1(body, profile)

Search



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
SearchRequest body = new SearchRequest(); // SearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearch_1(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| Search request options |
 **profile** | **Boolean**| profile | [optional] [default to true]

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch_2"></a>
# **postSearch_2**
> UsersSearchResponse postSearch_2(body)

Search



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postSearch_2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserSearchRequest**](UserSearchRequest.md)| Search request options |

### Return type

[**UsersSearchResponse**](UsersSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSuggest"></a>
# **postSuggest**
> JsonNodeSearchResponse postSuggest(body, profile)

Suggest



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
SuggestSearchRequest body = new SuggestSearchRequest(); // SuggestSearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSuggest(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSuggest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SuggestSearchRequest**](SuggestSearchRequest.md)| Search request options |
 **profile** | **Boolean**| profile | [optional] [default to true]

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

