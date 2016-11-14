# AttributesApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAttributeId**](AttributesApi.md#deleteAttributeId) | **DELETE** api/v2/attributes/{attributeId} | Delete an existing Attribute.
[**getAttributeId**](AttributesApi.md#getAttributeId) | **GET** api/v2/attributes/{attributeId} | Get details about an existing attribute.
[**getAttributes**](AttributesApi.md#getAttributes) | **GET** api/v2/attributes | Gets a list of existing attributes.
[**postAttributes**](AttributesApi.md#postAttributes) | **POST** api/v2/attributes | Create an attribute.
[**postQuery**](AttributesApi.md#postQuery) | **POST** api/v2/attributes/query | Query attributes
[**putAttributeId**](AttributesApi.md#putAttributeId) | **PUT** api/v2/attributes/{attributeId} | Update an existing attribute.


<a name="deleteAttributeId"></a>
# **deleteAttributeId**
> Void deleteAttributeId(attributeId)

Delete an existing Attribute.

This will remove attribute.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
try {
    Void result = apiInstance.deleteAttributeId(attributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#deleteAttributeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **String**| Attribute ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAttributeId"></a>
# **getAttributeId**
> Attribute getAttributeId(attributeId)

Get details about an existing attribute.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
try {
    Attribute result = apiInstance.getAttributeId(attributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#getAttributeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **String**| Attribute ID |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAttributes"></a>
# **getAttributes**
> AttributeEntityListing getAttributes(pageNumber, pageSize)

Gets a list of existing attributes.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AttributeEntityListing result = apiInstance.getAttributes(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#getAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]

### Return type

[**AttributeEntityListing**](AttributeEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAttributes"></a>
# **postAttributes**
> Attribute postAttributes(body)

Create an attribute.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
Attribute body = new Attribute(); // Attribute | Attribute
try {
    Attribute result = apiInstance.postAttributes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#postAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Attribute**](Attribute.md)| Attribute |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQuery"></a>
# **postQuery**
> AttributeEntityListing postQuery(body)

Query attributes



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
AttributeQueryRequest body = new AttributeQueryRequest(); // AttributeQueryRequest | query
try {
    AttributeEntityListing result = apiInstance.postQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#postQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AttributeQueryRequest**](AttributeQueryRequest.md)| query |

### Return type

[**AttributeEntityListing**](AttributeEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAttributeId"></a>
# **putAttributeId**
> Attribute putAttributeId(attributeId, body)

Update an existing attribute.

Fields that can be updated: name, description. The most recent version is required for updates.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AttributesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AttributesApi apiInstance = new AttributesApi();
String attributeId = "attributeId_example"; // String | Attribute ID
Attribute body = new Attribute(); // Attribute | Attribute
try {
    Attribute result = apiInstance.putAttributeId(attributeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributesApi#putAttributeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **String**| Attribute ID |
 **body** | [**Attribute**](Attribute.md)| Attribute |

### Return type

[**Attribute**](Attribute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

