# GreetingsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGreetingId**](GreetingsApi.md#deleteGreetingId) | **DELETE** api/v2/greetings/{greetingId} | Deletes a Greeting with the given GreetingId
[**getDefaults**](GreetingsApi.md#getDefaults) | **GET** api/v2/greetings/defaults | Get an Organization&#39;s DefaultGreetingList
[**getGreetingId**](GreetingsApi.md#getGreetingId) | **GET** api/v2/greetings/{greetingId} | Get a Greeting with the given GreetingId
[**getGreetingIdMedia**](GreetingsApi.md#getGreetingIdMedia) | **GET** api/v2/greetings/{greetingId}/media | Get media playback URI for this greeting
[**getGreetings**](GreetingsApi.md#getGreetings) | **GET** api/v2/greetings | Gets an Organization&#39;s Greetings
[**getUserIdGreetings**](GreetingsApi.md#getUserIdGreetings) | **GET** api/v2/users/{userId}/greetings | Get a list of the User&#39;s Greetings
[**getUserIdGreetingsDefaults**](GreetingsApi.md#getUserIdGreetingsDefaults) | **GET** api/v2/users/{userId}/greetings/defaults | Grabs the list of Default Greetings given a User&#39;s ID
[**postGreetings**](GreetingsApi.md#postGreetings) | **POST** api/v2/greetings | Create a Greeting for an Organization
[**postUserIdGreetings**](GreetingsApi.md#postUserIdGreetings) | **POST** api/v2/users/{userId}/greetings | Creates a Greeting for a User
[**putDefaults**](GreetingsApi.md#putDefaults) | **PUT** api/v2/greetings/defaults | Update an Organization&#39;s DefaultGreetingList
[**putGreetingId**](GreetingsApi.md#putGreetingId) | **PUT** api/v2/greetings/{greetingId} | Updates the Greeting with the given GreetingId
[**putUserIdGreetingsDefaults**](GreetingsApi.md#putUserIdGreetingsDefaults) | **PUT** api/v2/users/{userId}/greetings/defaults | Updates the DefaultGreetingList of the specified User


<a name="deleteGreetingId"></a>
# **deleteGreetingId**
> Greeting deleteGreetingId(greetingId)

Deletes a Greeting with the given GreetingId



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
try {
    Greeting result = apiInstance.deleteGreetingId(greetingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#deleteGreetingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingId** | **String**| Greeting ID |

### Return type

[**Greeting**](Greeting.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDefaults"></a>
# **getDefaults**
> DefaultGreetingList getDefaults()

Get an Organization&#39;s DefaultGreetingList



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
try {
    DefaultGreetingList result = apiInstance.getDefaults();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getDefaults");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefaultGreetingList**](DefaultGreetingList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGreetingId"></a>
# **getGreetingId**
> Greeting getGreetingId(greetingId)

Get a Greeting with the given GreetingId



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
try {
    Greeting result = apiInstance.getGreetingId(greetingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingId** | **String**| Greeting ID |

### Return type

[**Greeting**](Greeting.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGreetingIdMedia"></a>
# **getGreetingIdMedia**
> GreetingMediaInfo getGreetingIdMedia(greetingId, formatId)

Get media playback URI for this greeting



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
String formatId = "WAV"; // String | The desired media format.
try {
    GreetingMediaInfo result = apiInstance.getGreetingIdMedia(greetingId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetingIdMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingId** | **String**| Greeting ID |
 **formatId** | **String**| The desired media format. | [optional] [default to WAV] [enum: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, NONE]

### Return type

[**GreetingMediaInfo**](GreetingMediaInfo.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGreetings"></a>
# **getGreetings**
> DomainEntityListing getGreetings(pageSize, pageNumber)

Gets an Organization&#39;s Greetings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    DomainEntityListing result = apiInstance.getGreetings(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getGreetings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**DomainEntityListing**](DomainEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdGreetings"></a>
# **getUserIdGreetings**
> DomainEntityListing getUserIdGreetings(userId, pageSize, pageNumber)

Get a list of the User&#39;s Greetings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    DomainEntityListing result = apiInstance.getUserIdGreetings(userId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getUserIdGreetings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**DomainEntityListing**](DomainEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdGreetingsDefaults"></a>
# **getUserIdGreetingsDefaults**
> DefaultGreetingList getUserIdGreetingsDefaults(userId)

Grabs the list of Default Greetings given a User&#39;s ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
try {
    DefaultGreetingList result = apiInstance.getUserIdGreetingsDefaults(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#getUserIdGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**DefaultGreetingList**](DefaultGreetingList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGreetings"></a>
# **postGreetings**
> DefaultGreetingList postGreetings(body)

Create a Greeting for an Organization



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
Greeting body = new Greeting(); // Greeting | The Greeting to create
try {
    DefaultGreetingList result = apiInstance.postGreetings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#postGreetings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Greeting**](Greeting.md)| The Greeting to create |

### Return type

[**DefaultGreetingList**](DefaultGreetingList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUserIdGreetings"></a>
# **postUserIdGreetings**
> Greeting postUserIdGreetings(userId, body)

Creates a Greeting for a User



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
Greeting body = new Greeting(); // Greeting | The Greeting to create
try {
    Greeting result = apiInstance.postUserIdGreetings(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#postUserIdGreetings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**Greeting**](Greeting.md)| The Greeting to create |

### Return type

[**Greeting**](Greeting.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDefaults"></a>
# **putDefaults**
> DefaultGreetingList putDefaults(body)

Update an Organization&#39;s DefaultGreetingList



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
DefaultGreetingList body = new DefaultGreetingList(); // DefaultGreetingList | The updated defaultGreetingList
try {
    DefaultGreetingList result = apiInstance.putDefaults(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putDefaults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DefaultGreetingList**](DefaultGreetingList.md)| The updated defaultGreetingList |

### Return type

[**DefaultGreetingList**](DefaultGreetingList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putGreetingId"></a>
# **putGreetingId**
> Greeting putGreetingId(greetingId, body)

Updates the Greeting with the given GreetingId



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String greetingId = "greetingId_example"; // String | Greeting ID
Greeting body = new Greeting(); // Greeting | The updated Greeting
try {
    Greeting result = apiInstance.putGreetingId(greetingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putGreetingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingId** | **String**| Greeting ID |
 **body** | [**Greeting**](Greeting.md)| The updated Greeting |

### Return type

[**Greeting**](Greeting.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdGreetingsDefaults"></a>
# **putUserIdGreetingsDefaults**
> DefaultGreetingList putUserIdGreetingsDefaults(userId, body)

Updates the DefaultGreetingList of the specified User



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GreetingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GreetingsApi apiInstance = new GreetingsApi();
String userId = "userId_example"; // String | User ID
DefaultGreetingList body = new DefaultGreetingList(); // DefaultGreetingList | The updated defaultGreetingList
try {
    DefaultGreetingList result = apiInstance.putUserIdGreetingsDefaults(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GreetingsApi#putUserIdGreetingsDefaults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**DefaultGreetingList**](DefaultGreetingList.md)| The updated defaultGreetingList |

### Return type

[**DefaultGreetingList**](DefaultGreetingList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

