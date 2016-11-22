# GroupsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGroupIdMembers**](GroupsApi.md#deleteGroupIdMembers) | **DELETE** api/v2/groups/{groupId}/members | Remove members
[**getGroupId**](GroupsApi.md#getGroupId) | **GET** api/v2/groups/{groupId} | Get group
[**getGroupIdMembers**](GroupsApi.md#getGroupIdMembers) | **GET** api/v2/groups/{groupId}/members | Get group members
[**getGroups**](GroupsApi.md#getGroups) | **GET** api/v2/groups | Get a group list
[**getSearch**](GroupsApi.md#getSearch) | **GET** api/v2/groups/search | Search using q64
[**postGroupIdMembers**](GroupsApi.md#postGroupIdMembers) | **POST** api/v2/groups/{groupId}/members | Add members
[**postGroups**](GroupsApi.md#postGroups) | **POST** api/v2/groups | Create a group
[**postSearch**](GroupsApi.md#postSearch) | **POST** api/v2/groups/search | Search


<a name="deleteGroupIdMembers"></a>
# **deleteGroupIdMembers**
> Void deleteGroupIdMembers(groupId, ids)

Remove members



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
String ids = "ids_example"; // String | Comma separated list of userIds to remove
try {
    Void result = apiInstance.deleteGroupIdMembers(groupId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#deleteGroupIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Group ID |
 **ids** | **String**| Comma separated list of userIds to remove |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupId"></a>
# **getGroupId**
> Group getGroupId(groupId)

Get group



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
try {
    Group result = apiInstance.getGroupId(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Group ID |

### Return type

[**Group**](Group.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupIdMembers"></a>
# **getGroupIdMembers**
> UserEntityListing getGroupIdMembers(groupId, pageSize, pageNumber, sortOrder)

Get group members



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserEntityListing result = apiInstance.getGroupIdMembers(groupId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Group ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]

### Return type

[**UserEntityListing**](UserEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> GroupEntityListing getGroups(pageSize, pageNumber, sortOrder)

Get a group list



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    GroupEntityListing result = apiInstance.getGroups(pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]

### Return type

[**GroupEntityListing**](GroupEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getSearch");
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

<a name="postGroupIdMembers"></a>
# **postGroupIdMembers**
> Void postGroupIdMembers(groupId, body)

Add members



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
String groupId = "groupId_example"; // String | Group ID
GroupMembersUpdate body = new GroupMembersUpdate(); // GroupMembersUpdate | Add members
try {
    Void result = apiInstance.postGroupIdMembers(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroupIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Group ID |
 **body** | [**GroupMembersUpdate**](GroupMembersUpdate.md)| Add members |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGroups"></a>
# **postGroups**
> Group postGroups(body)

Create a group



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
Group body = new Group(); // Group | Group
try {
    Group result = apiInstance.postGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Group |

### Return type

[**Group**](Group.md)

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
//import com.mypurecloud.sdk.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

GroupsApi apiInstance = new GroupsApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postSearch");
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

