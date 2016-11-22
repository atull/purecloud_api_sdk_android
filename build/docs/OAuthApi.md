# OAuthApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteClientsClientId**](OAuthApi.md#deleteClientsClientId) | **DELETE** api/v2/oauth/clients/{clientId} | Delete OAuth Client
[**getClients**](OAuthApi.md#getClients) | **GET** api/v2/oauth/clients | The list of OAuth clients
[**getClientsClientId**](OAuthApi.md#getClientsClientId) | **GET** api/v2/oauth/clients/{clientId} | Get OAuth Client
[**postClients**](OAuthApi.md#postClients) | **POST** api/v2/oauth/clients | Create OAuth client
[**postClientsClientIdSecret**](OAuthApi.md#postClientsClientIdSecret) | **POST** api/v2/oauth/clients/{clientId}/secret | Regenerate Client Secret
[**putClientsClientId**](OAuthApi.md#putClientsClientId) | **PUT** api/v2/oauth/clients/{clientId} | Update OAuth Client


<a name="deleteClientsClientId"></a>
# **deleteClientsClientId**
> Void deleteClientsClientId(clientId)

Delete OAuth Client



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    Void result = apiInstance.deleteClientsClientId(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#deleteClientsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClients"></a>
# **getClients**
> OAuthClientEntityListing getClients()

The list of OAuth clients



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
try {
    OAuthClientEntityListing result = apiInstance.getClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuthClientEntityListing**](OAuthClientEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientsClientId"></a>
# **getClientsClientId**
> OAuthClient getClientsClientId(clientId)

Get OAuth Client



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    OAuthClient result = apiInstance.getClientsClientId(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getClientsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID |

### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClients"></a>
# **postClients**
> OAuthClient postClients(body)

Create OAuth client

The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
OAuthClient body = new OAuthClient(); // OAuthClient | Client
try {
    OAuthClient result = apiInstance.postClients(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OAuthClient**](OAuthClient.md)| Client |

### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClientsClientIdSecret"></a>
# **postClientsClientIdSecret**
> Void postClientsClientIdSecret(clientId)

Regenerate Client Secret

This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    Void result = apiInstance.postClientsClientIdSecret(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postClientsClientIdSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putClientsClientId"></a>
# **putClientsClientId**
> OAuthClient putClientsClientId(clientId, body)

Update OAuth Client



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
OAuthClient body = new OAuthClient(); // OAuthClient | Client
try {
    OAuthClient result = apiInstance.putClientsClientId(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#putClientsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID |
 **body** | [**OAuthClient**](OAuthClient.md)| Client |

### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

