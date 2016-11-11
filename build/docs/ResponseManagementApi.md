# ResponseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLibrariesLibraryId**](ResponseManagementApi.md#deleteLibrariesLibraryId) | **DELETE** api/v2/responsemanagement/libraries/{libraryId} | Delete an existing response library.
[**deleteResponsesResponseId**](ResponseManagementApi.md#deleteResponsesResponseId) | **DELETE** api/v2/responsemanagement/responses/{responseId} | Delete an existing response.
[**getLibraries**](ResponseManagementApi.md#getLibraries) | **GET** api/v2/responsemanagement/libraries | Gets a list of existing response libraries.
[**getLibrariesLibraryId**](ResponseManagementApi.md#getLibrariesLibraryId) | **GET** api/v2/responsemanagement/libraries/{libraryId} | Get details about an existing response library.
[**getResponses**](ResponseManagementApi.md#getResponses) | **GET** api/v2/responsemanagement/responses | Gets a list of existing responses.
[**getResponsesResponseId**](ResponseManagementApi.md#getResponsesResponseId) | **GET** api/v2/responsemanagement/responses/{responseId} | Get details about an existing response.
[**postLibraries**](ResponseManagementApi.md#postLibraries) | **POST** api/v2/responsemanagement/libraries | Create a response library.
[**postResponses**](ResponseManagementApi.md#postResponses) | **POST** api/v2/responsemanagement/responses | Create a response.
[**postResponsesQuery**](ResponseManagementApi.md#postResponsesQuery) | **POST** api/v2/responsemanagement/responses/query | Query responses
[**putLibrariesLibraryId**](ResponseManagementApi.md#putLibrariesLibraryId) | **PUT** api/v2/responsemanagement/libraries/{libraryId} | Update an existing response library.
[**putResponsesResponseId**](ResponseManagementApi.md#putResponsesResponseId) | **PUT** api/v2/responsemanagement/responses/{responseId} | Update an existing response.


<a name="deleteLibrariesLibraryId"></a>
# **deleteLibrariesLibraryId**
> Void deleteLibrariesLibraryId(libraryId)

Delete an existing response library.

This will remove any responses associated with the library.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    Void result = apiInstance.deleteLibrariesLibraryId(libraryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteLibrariesLibraryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryId** | **String**| Library ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResponsesResponseId"></a>
# **deleteResponsesResponseId**
> Void deleteResponsesResponseId(responseId)

Delete an existing response.

This will remove the response from any libraries associated with it.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
try {
    Void result = apiInstance.deleteResponsesResponseId(responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsesResponseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **String**| Response ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLibraries"></a>
# **getLibraries**
> LibraryEntityListing getLibraries(pageNumber, pageSize)

Gets a list of existing response libraries.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    LibraryEntityListing result = apiInstance.getLibraries(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getLibraries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]

### Return type

[**LibraryEntityListing**](LibraryEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLibrariesLibraryId"></a>
# **getLibrariesLibraryId**
> Library getLibrariesLibraryId(libraryId)

Get details about an existing response library.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    Library result = apiInstance.getLibrariesLibraryId(libraryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getLibrariesLibraryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryId** | **String**| Library ID |

### Return type

[**Library**](Library.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResponses"></a>
# **getResponses**
> ResponseEntityListing getResponses(libraryId, pageNumber, pageSize)

Gets a list of existing responses.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ResponseEntityListing result = apiInstance.getResponses(libraryId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryId** | **String**| Library ID |
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]

### Return type

[**ResponseEntityListing**](ResponseEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResponsesResponseId"></a>
# **getResponsesResponseId**
> Response getResponsesResponseId(responseId)

Get details about an existing response.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
try {
    Response result = apiInstance.getResponsesResponseId(responseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsesResponseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **String**| Response ID |

### Return type

[**Response**](Response.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLibraries"></a>
# **postLibraries**
> Library postLibraries(body)

Create a response library.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.postLibraries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postLibraries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Library**](Library.md)| Library |

### Return type

[**Library**](Library.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postResponses"></a>
# **postResponses**
> Response postResponses(body)

Create a response.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
Response body = new Response(); // Response | Response
try {
    Response result = apiInstance.postResponses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Response**](Response.md)| Response |

### Return type

[**Response**](Response.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postResponsesQuery"></a>
# **postResponsesQuery**
> ResponseQueryResults postResponsesQuery(body)

Query responses



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
ResponseQueryRequest body = new ResponseQueryRequest(); // ResponseQueryRequest | Response
try {
    ResponseQueryResults result = apiInstance.postResponsesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResponseQueryRequest**](ResponseQueryRequest.md)| Response |

### Return type

[**ResponseQueryResults**](ResponseQueryResults.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLibrariesLibraryId"></a>
# **putLibrariesLibraryId**
> Library putLibrariesLibraryId(libraryId, body)

Update an existing response library.

Fields that can be updated: name. The most recent version is required for updates.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.putLibrariesLibraryId(libraryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putLibrariesLibraryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryId** | **String**| Library ID |
 **body** | [**Library**](Library.md)| Library |

### Return type

[**Library**](Library.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putResponsesResponseId"></a>
# **putResponsesResponseId**
> Response putResponsesResponseId(responseId, body)

Update an existing response.

Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
Response body = new Response(); // Response | Response
try {
    Response result = apiInstance.putResponsesResponseId(responseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsesResponseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseId** | **String**| Response ID |
 **body** | [**Response**](Response.md)| Response |

### Return type

[**Response**](Response.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

