# IdentityProviderApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAdfs**](IdentityProviderApi.md#deleteAdfs) | **DELETE** api/v2/identityproviders/adfs | Delete ADFS Identity Provider
[**deleteCic**](IdentityProviderApi.md#deleteCic) | **DELETE** api/v2/identityproviders/cic | Delete Customer Interaction Center (CIC) Identity Provider
[**deleteOkta**](IdentityProviderApi.md#deleteOkta) | **DELETE** api/v2/identityproviders/okta | Delete Okta Identity Provider
[**deleteOnelogin**](IdentityProviderApi.md#deleteOnelogin) | **DELETE** api/v2/identityproviders/onelogin | Delete OneLogin Identity Provider
[**deleteProviderId**](IdentityProviderApi.md#deleteProviderId) | **DELETE** api/v2/identityproviders/{providerId} | Delete an identity provider
[**deletePurecloud**](IdentityProviderApi.md#deletePurecloud) | **DELETE** api/v2/identityproviders/purecloud | Delete PureCloud Identity Provider
[**deleteSalesforce**](IdentityProviderApi.md#deleteSalesforce) | **DELETE** api/v2/identityproviders/salesforce | Delete Salesforce Identity Provider
[**getAdfs**](IdentityProviderApi.md#getAdfs) | **GET** api/v2/identityproviders/adfs | Get ADFS Identity Provider
[**getCic**](IdentityProviderApi.md#getCic) | **GET** api/v2/identityproviders/cic | Get Customer Interaction Center (CIC) Identity Provider
[**getIdentityproviders**](IdentityProviderApi.md#getIdentityproviders) | **GET** api/v2/identityproviders | The list of identity providers
[**getOkta**](IdentityProviderApi.md#getOkta) | **GET** api/v2/identityproviders/okta | Get Okta Identity Provider
[**getOnelogin**](IdentityProviderApi.md#getOnelogin) | **GET** api/v2/identityproviders/onelogin | Get OneLogin Identity Provider
[**getProviderId**](IdentityProviderApi.md#getProviderId) | **GET** api/v2/identityproviders/{providerId} | Get an identity provider
[**getPurecloud**](IdentityProviderApi.md#getPurecloud) | **GET** api/v2/identityproviders/purecloud | Get PureCloud Identity Provider
[**getSalesforce**](IdentityProviderApi.md#getSalesforce) | **GET** api/v2/identityproviders/salesforce | Get Salesforce Identity Provider
[**putAdfs**](IdentityProviderApi.md#putAdfs) | **PUT** api/v2/identityproviders/adfs | Update/Create ADFS Identity Provider
[**putCic**](IdentityProviderApi.md#putCic) | **PUT** api/v2/identityproviders/cic | Update/Create Customer Interaction Center (CIC) Identity Provider
[**putOkta**](IdentityProviderApi.md#putOkta) | **PUT** api/v2/identityproviders/okta | Update/Create Okta Identity Provider
[**putOnelogin**](IdentityProviderApi.md#putOnelogin) | **PUT** api/v2/identityproviders/onelogin | Update/Create OneLogin Identity Provider
[**putProviderId**](IdentityProviderApi.md#putProviderId) | **PUT** api/v2/identityproviders/{providerId} | Update an identity provider
[**putPurecloud**](IdentityProviderApi.md#putPurecloud) | **PUT** api/v2/identityproviders/purecloud | Update/Create PureCloud Identity Provider
[**putSalesforce**](IdentityProviderApi.md#putSalesforce) | **PUT** api/v2/identityproviders/salesforce | Update/Create Salesforce Identity Provider


<a name="deleteAdfs"></a>
# **deleteAdfs**
> Void deleteAdfs()

Delete ADFS Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteAdfs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCic"></a>
# **deleteCic**
> Void deleteCic()

Delete Customer Interaction Center (CIC) Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteCic");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOkta"></a>
# **deleteOkta**
> Void deleteOkta()

Delete Okta Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteOkta");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOnelogin"></a>
# **deleteOnelogin**
> Void deleteOnelogin()

Delete OneLogin Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteOnelogin");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProviderId"></a>
# **deleteProviderId**
> Void deleteProviderId()

Delete an identity provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteProviderId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteProviderId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePurecloud"></a>
# **deletePurecloud**
> Void deletePurecloud()

Delete PureCloud Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deletePurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deletePurecloud");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSalesforce"></a>
# **deleteSalesforce**
> Void deleteSalesforce()

Delete Salesforce Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Void result = apiInstance.deleteSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteSalesforce");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdfs"></a>
# **getAdfs**
> ADFS getAdfs()

Get ADFS Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    ADFS result = apiInstance.getAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getAdfs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ADFS**](ADFS.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCic"></a>
# **getCic**
> CustomerInteractionCenter getCic()

Get Customer Interaction Center (CIC) Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    CustomerInteractionCenter result = apiInstance.getCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getCic");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomerInteractionCenter**](CustomerInteractionCenter.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityproviders"></a>
# **getIdentityproviders**
> OAuthProviderEntityListing getIdentityproviders()

The list of identity providers



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OAuthProviderEntityListing result = apiInstance.getIdentityproviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityproviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuthProviderEntityListing**](OAuthProviderEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOkta"></a>
# **getOkta**
> Okta getOkta()

Get Okta Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Okta result = apiInstance.getOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getOkta");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Okta**](Okta.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOnelogin"></a>
# **getOnelogin**
> OneLogin getOnelogin()

Get OneLogin Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OneLogin result = apiInstance.getOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getOnelogin");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OneLogin**](OneLogin.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProviderId"></a>
# **getProviderId**
> OAuthProvider getProviderId()

Get an identity provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OAuthProvider result = apiInstance.getProviderId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getProviderId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuthProvider**](OAuthProvider.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPurecloud"></a>
# **getPurecloud**
> PureCloud getPurecloud()

Get PureCloud Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureCloud result = apiInstance.getPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getPurecloud");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PureCloud**](PureCloud.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSalesforce"></a>
# **getSalesforce**
> Salesforce getSalesforce()

Get Salesforce Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Salesforce result = apiInstance.getSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getSalesforce");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Salesforce**](Salesforce.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAdfs"></a>
# **putAdfs**
> Void putAdfs(body)

Update/Create ADFS Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
ADFS body = new ADFS(); // ADFS | Provider
try {
    Void result = apiInstance.putAdfs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putAdfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ADFS**](ADFS.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCic"></a>
# **putCic**
> Void putCic(body)

Update/Create Customer Interaction Center (CIC) Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
CustomerInteractionCenter body = new CustomerInteractionCenter(); // CustomerInteractionCenter | Provider
try {
    Void result = apiInstance.putCic(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putCic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerInteractionCenter**](CustomerInteractionCenter.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOkta"></a>
# **putOkta**
> Void putOkta(body)

Update/Create Okta Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
Okta body = new Okta(); // Okta | Provider
try {
    Void result = apiInstance.putOkta(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putOkta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Okta**](Okta.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnelogin"></a>
# **putOnelogin**
> Void putOnelogin(body)

Update/Create OneLogin Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
OneLogin body = new OneLogin(); // OneLogin | Provider
try {
    Void result = apiInstance.putOnelogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putOnelogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OneLogin**](OneLogin.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProviderId"></a>
# **putProviderId**
> Void putProviderId(body)

Update an identity provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
OAuthProvider body = new OAuthProvider(); // OAuthProvider | Provider
try {
    Void result = apiInstance.putProviderId(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putProviderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OAuthProvider**](OAuthProvider.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPurecloud"></a>
# **putPurecloud**
> Void putPurecloud(body)

Update/Create PureCloud Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureCloud body = new PureCloud(); // PureCloud | Provider
try {
    Void result = apiInstance.putPurecloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putPurecloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PureCloud**](PureCloud.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSalesforce"></a>
# **putSalesforce**
> Void putSalesforce(body)

Update/Create Salesforce Identity Provider



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

IdentityProviderApi apiInstance = new IdentityProviderApi();
Salesforce body = new Salesforce(); // Salesforce | Provider
try {
    Void result = apiInstance.putSalesforce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putSalesforce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Salesforce**](Salesforce.md)| Provider |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

