# LanguagesApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLanguageId**](LanguagesApi.md#deleteLanguageId) | **DELETE** api/v2/languages/{languageId} | Delete Language
[**getLanguageId**](LanguagesApi.md#getLanguageId) | **GET** api/v2/languages/{languageId} | Get language
[**getLanguages**](LanguagesApi.md#getLanguages) | **GET** api/v2/languages | Get the list of supported languages.
[**postLanguages**](LanguagesApi.md#postLanguages) | **POST** api/v2/languages | Create Language
[**putLanguageId**](LanguagesApi.md#putLanguageId) | **PUT** api/v2/languages/{languageId} | Update Language


<a name="deleteLanguageId"></a>
# **deleteLanguageId**
> Void deleteLanguageId(languageId)

Delete Language



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    Void result = apiInstance.deleteLanguageId(languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#deleteLanguageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **languageId** | **String**| Language ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLanguageId"></a>
# **getLanguageId**
> Language getLanguageId(languageId)

Get language



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
try {
    Language result = apiInstance.getLanguageId(languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **languageId** | **String**| Language ID |

### Return type

[**Language**](Language.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLanguages"></a>
# **getLanguages**
> LanguageEntityListing getLanguages(pageSize, pageNumber, sortOrder, name)

Get the list of supported languages.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LanguagesApi apiInstance = new LanguagesApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
String name = "name_example"; // String | Name
try {
    LanguageEntityListing result = apiInstance.getLanguages(pageSize, pageNumber, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]
 **name** | **String**| Name | [optional]

### Return type

[**LanguageEntityListing**](LanguageEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLanguages"></a>
# **postLanguages**
> Language postLanguages(body)

Create Language



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LanguagesApi apiInstance = new LanguagesApi();
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.postLanguages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#postLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Language**](Language.md)| Language |

### Return type

[**Language**](Language.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLanguageId"></a>
# **putLanguageId**
> Language putLanguageId(languageId, body)

Update Language



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LanguagesApi apiInstance = new LanguagesApi();
String languageId = "languageId_example"; // String | Language ID
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.putLanguageId(languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#putLanguageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **languageId** | **String**| Language ID |
 **body** | [**Language**](Language.md)| Language |

### Return type

[**Language**](Language.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

