# AuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRolesRoleId**](AuthorizationApi.md#deleteRolesRoleId) | **DELETE** api/v2/authorization/roles/{roleId} | Delete an organization role.
[**deleteUserIdRoles**](AuthorizationApi.md#deleteUserIdRoles) | **DELETE** api/v2/users/{userId}/roles | Removes all the roles from the user.
[**getPermissions**](AuthorizationApi.md#getPermissions) | **GET** api/v2/authorization/permissions | Get all permissions.
[**getProducts**](AuthorizationApi.md#getProducts) | **GET** api/v2/authorization/products | Get the list of enabled products
[**getRoles**](AuthorizationApi.md#getRoles) | **GET** api/v2/authorization/roles | Retrieve a list of all roles defined for the organization
[**getRolesLeftroleIdComparedefaultRightroleId**](AuthorizationApi.md#getRolesLeftroleIdComparedefaultRightroleId) | **GET** api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId} | Get an org role to default role comparison comparison
[**getRolesRoleId**](AuthorizationApi.md#getRolesRoleId) | **GET** api/v2/authorization/roles/{roleId} | Get a single organization role.
[**getUserIdRoles**](AuthorizationApi.md#getUserIdRoles) | **GET** api/v2/users/{userId}/roles | Returns a listing of roles and permissions for a user.
[**patchRolesRoleId**](AuthorizationApi.md#patchRolesRoleId) | **PATCH** api/v2/authorization/roles/{roleId} | Patch Organization Role for needsUpdate Field
[**postRoles**](AuthorizationApi.md#postRoles) | **POST** api/v2/authorization/roles | Create an organization role.
[**postRolesDefault**](AuthorizationApi.md#postRolesDefault) | **POST** api/v2/authorization/roles/default | Restores all default roles
[**postRolesLeftroleIdComparedefaultRightroleId**](AuthorizationApi.md#postRolesLeftroleIdComparedefaultRightroleId) | **POST** api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId} | Get an unsaved org role to default role comparison
[**putRolesDefault**](AuthorizationApi.md#putRolesDefault) | **PUT** api/v2/authorization/roles/default | Restore specified default roles
[**putRolesRoleId**](AuthorizationApi.md#putRolesRoleId) | **PUT** api/v2/authorization/roles/{roleId} | Update an organization role.
[**putRolesRoleIdUsersAdd**](AuthorizationApi.md#putRolesRoleIdUsersAdd) | **PUT** api/v2/authorization/roles/{roleId}/users/add | Sets the users for the role
[**putRolesRoleIdUsersRemove**](AuthorizationApi.md#putRolesRoleIdUsersRemove) | **PUT** api/v2/authorization/roles/{roleId}/users/remove | Removes the users from the role
[**putUserIdRoles**](AuthorizationApi.md#putUserIdRoles) | **PUT** api/v2/users/{userId}/roles | Sets the user&#39;s roles


<a name="deleteRolesRoleId"></a>
# **deleteRolesRoleId**
> Void deleteRolesRoleId(roleId)

Delete an organization role.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    Void result = apiInstance.deleteRolesRoleId(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteRolesRoleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserIdRoles"></a>
# **deleteUserIdRoles**
> Void deleteUserIdRoles(userId)

Removes all the roles from the user.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    Void result = apiInstance.deleteUserIdRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteUserIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPermissions"></a>
# **getPermissions**
> PermissionCollectionEntityListing getPermissions(pageSize, pageNumber)

Get all permissions.

Retrieve a list of all permission defined in the system.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PermissionCollectionEntityListing result = apiInstance.getPermissions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**PermissionCollectionEntityListing**](PermissionCollectionEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> OrganizationProductEntityListing getProducts()

Get the list of enabled products

Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    OrganizationProductEntityListing result = apiInstance.getProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationProductEntityListing**](OrganizationProductEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> OrganizationRoleEntityListing getRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount)

Retrieve a list of all roles defined for the organization



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<Object> expand = null; // List<Object> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
List<Object> permission = null; // List<Object> | 
Boolean userCount = true; // Boolean | 
try {
    OrganizationRoleEntityListing result = apiInstance.getRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The total page size requested | [optional] [default to 25]
 **pageNumber** | **Integer**| The page number requested | [optional] [default to 1]
 **sortBy** | **String**| variable name requested to sort by | [optional]
 **expand** | [**List&lt;Object&gt;**](Object.md)| variable name requested by expand list | [optional]
 **nextPage** | **String**| next page token | [optional]
 **previousPage** | **String**| Previous page token | [optional]
 **permission** | [**List&lt;Object&gt;**](Object.md)|  | [optional]
 **userCount** | **Boolean**|  | [optional] [default to true]

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRolesLeftroleIdComparedefaultRightroleId"></a>
# **getRolesLeftroleIdComparedefaultRightroleId**
> DomainOrgRoleDifference getRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId)

Get an org role to default role comparison comparison

Compares any organization role to a default role id and show differences

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
try {
    DomainOrgRoleDifference result = apiInstance.getRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getRolesLeftroleIdComparedefaultRightroleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leftRoleId** | **String**| Left Role ID |
 **rightRoleId** | **String**| Right Role id |

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRolesRoleId"></a>
# **getRolesRoleId**
> DomainOrganizationRole getRolesRoleId(roleId)

Get a single organization role.

Get the organization role specified by its ID.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    DomainOrganizationRole result = apiInstance.getRolesRoleId(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getRolesRoleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdRoles"></a>
# **getUserIdRoles**
> UserAuthorization getUserIdRoles(userId)

Returns a listing of roles and permissions for a user.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserIdRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getUserIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**UserAuthorization**](UserAuthorization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchRolesRoleId"></a>
# **patchRolesRoleId**
> DomainOrganizationRole patchRolesRoleId(roleId, body)

Patch Organization Role for needsUpdate Field

Patch Organization Role for needsUpdate Field

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.patchRolesRoleId(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#patchRolesRoleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **body** | [**DomainOrganizationRole**](DomainOrganizationRole.md)| Organization role |

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRoles"></a>
# **postRoles**
> DomainOrganizationRole postRoles(body)

Create an organization role.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.postRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainOrganizationRole**](DomainOrganizationRole.md)| Organization role |

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRolesDefault"></a>
# **postRolesDefault**
> OrganizationRoleEntityListing postRolesDefault(force)

Restores all default roles

This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean force = false; // Boolean | Restore default roles
try {
    OrganizationRoleEntityListing result = apiInstance.postRolesDefault(force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postRolesDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **force** | **Boolean**| Restore default roles | [optional] [default to false]

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRolesLeftroleIdComparedefaultRightroleId"></a>
# **postRolesLeftroleIdComparedefaultRightroleId**
> DomainOrgRoleDifference postRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId, body)

Get an unsaved org role to default role comparison

Allows users to compare their existing roles in an unsaved state to its default role

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrgRoleDifference result = apiInstance.postRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postRolesLeftroleIdComparedefaultRightroleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leftRoleId** | **String**| Left Role ID |
 **rightRoleId** | **String**| Right Role id |
 **body** | [**DomainOrganizationRole**](DomainOrganizationRole.md)| Organization role |

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRolesDefault"></a>
# **putRolesDefault**
> OrganizationRoleEntityListing putRolesDefault(body)

Restore specified default roles



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
List<DomainOrganizationRole> body = Arrays.asList(new DomainOrganizationRole()); // List<DomainOrganizationRole> | Organization roles list
try {
    OrganizationRoleEntityListing result = apiInstance.putRolesDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putRolesDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole.md)| Organization roles list |

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRolesRoleId"></a>
# **putRolesRoleId**
> DomainOrganizationRole putRolesRoleId(roleId, body)

Update an organization role.

Update

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.putRolesRoleId(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putRolesRoleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **body** | [**DomainOrganizationRole**](DomainOrganizationRole.md)| Organization role |

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRolesRoleIdUsersAdd"></a>
# **putRolesRoleIdUsersAdd**
> List&lt;String&gt; putRolesRoleIdUsersAdd(roleId, body)

Sets the users for the role



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putRolesRoleIdUsersAdd(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putRolesRoleIdUsersAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **body** | **List&lt;String&gt;**| List of user IDs |

### Return type

**List&lt;String&gt;**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRolesRoleIdUsersRemove"></a>
# **putRolesRoleIdUsersRemove**
> List&lt;String&gt; putRolesRoleIdUsersRemove(roleId, body)

Removes the users from the role



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putRolesRoleIdUsersRemove(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putRolesRoleIdUsersRemove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **body** | **List&lt;String&gt;**| List of user IDs |

### Return type

**List&lt;String&gt;**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdRoles"></a>
# **putUserIdRoles**
> UserAuthorization putUserIdRoles(userId, body)

Sets the user&#39;s roles



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserIdRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putUserIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | **List&lt;String&gt;**| List of roles |

### Return type

[**UserAuthorization**](UserAuthorization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

