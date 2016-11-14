# FaxApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocumentsDocumentId**](FaxApi.md#deleteDocumentsDocumentId) | **DELETE** api/v2/fax/documents/{documentId} | Delete a fax document.
[**getDocuments**](FaxApi.md#getDocuments) | **GET** api/v2/fax/documents | Get a list of fax documents.
[**getDocumentsDocumentId**](FaxApi.md#getDocumentsDocumentId) | **GET** api/v2/fax/documents/{documentId} | Get a document.
[**getDocumentsDocumentIdContent**](FaxApi.md#getDocumentsDocumentIdContent) | **GET** api/v2/fax/documents/{documentId}/content | Download a fax document.
[**getSummary**](FaxApi.md#getSummary) | **GET** api/v2/fax/summary | Get fax summary
[**putDocumentsDocumentId**](FaxApi.md#putDocumentsDocumentId) | **PUT** api/v2/fax/documents/{documentId} | Update a fax document.


<a name="deleteDocumentsDocumentId"></a>
# **deleteDocumentsDocumentId**
> Void deleteDocumentsDocumentId(documentId)

Delete a fax document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    Void result = apiInstance.deleteDocumentsDocumentId(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#deleteDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> FaxDocumentEntityListing getDocuments(pageSize, pageNumber)

Get a list of fax documents.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    FaxDocumentEntityListing result = apiInstance.getDocuments(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**FaxDocumentEntityListing**](FaxDocumentEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentsDocumentId"></a>
# **getDocumentsDocumentId**
> FaxDocument getDocumentsDocumentId(documentId)

Get a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    FaxDocument result = apiInstance.getDocumentsDocumentId(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |

### Return type

[**FaxDocument**](FaxDocument.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentsDocumentIdContent"></a>
# **getDocumentsDocumentIdContent**
> DownloadResponse getDocumentsDocumentIdContent(documentId)

Download a fax document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    DownloadResponse result = apiInstance.getDocumentsDocumentIdContent(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getDocumentsDocumentIdContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |

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

Get fax summary



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
try {
    FaxSummary result = apiInstance.getSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getSummary");
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

<a name="putDocumentsDocumentId"></a>
# **putDocumentsDocumentId**
> FaxDocument putDocumentsDocumentId(documentId, body)

Update a fax document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
FaxDocument body = new FaxDocument(); // FaxDocument | Document
try {
    FaxDocument result = apiInstance.putDocumentsDocumentId(documentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#putDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **body** | [**FaxDocument**](FaxDocument.md)| Document |

### Return type

[**FaxDocument**](FaxDocument.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

