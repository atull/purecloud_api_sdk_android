# UsersApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserId**](UsersApi.md#deleteUserId) | **DELETE** api/v2/users/{userId} | Delete user
[**deleteUserIdRoles**](UsersApi.md#deleteUserIdRoles) | **DELETE** api/v2/users/{userId}/roles | Removes all the roles from the user.
[**deleteUserIdRoutingskillsSkillId**](UsersApi.md#deleteUserIdRoutingskillsSkillId) | **DELETE** api/v2/users/{userId}/routingskills/{skillId} | Remove routing skill from user
[**deleteUserIdStationAssociatedstation**](UsersApi.md#deleteUserIdStationAssociatedstation) | **DELETE** api/v2/users/{userId}/station/associatedstation | Clear associated station
[**deleteUserIdStationDefaultstation**](UsersApi.md#deleteUserIdStationDefaultstation) | **DELETE** api/v2/users/{userId}/station/defaultstation | Clear default station
[**getMe**](UsersApi.md#getMe) | **GET** api/v2/users/me | Get current user details.
[**getSearch**](UsersApi.md#getSearch) | **GET** api/v2/users/search | Search using q64
[**getUserId**](UsersApi.md#getUserId) | **GET** api/v2/users/{userId} | Get user.
[**getUserIdCallforwarding**](UsersApi.md#getUserIdCallforwarding) | **GET** api/v2/users/{userId}/callforwarding | Get a user&#39;s CallForwarding
[**getUserIdGeolocationsClientId**](UsersApi.md#getUserIdGeolocationsClientId) | **GET** api/v2/users/{userId}/geolocations/{clientId} | Get a user&#39;s Geolocation
[**getUserIdOutofoffice**](UsersApi.md#getUserIdOutofoffice) | **GET** api/v2/users/{userId}/outofoffice | Get a OutOfOffice
[**getUserIdQueues**](UsersApi.md#getUserIdQueues) | **GET** api/v2/users/{userId}/queues | Get queues for user
[**getUserIdRoles**](UsersApi.md#getUserIdRoles) | **GET** api/v2/users/{userId}/roles | Returns a listing of roles and permissions for a user.
[**getUserIdRoutingskills**](UsersApi.md#getUserIdRoutingskills) | **GET** api/v2/users/{userId}/routingskills | List routing skills for user
[**getUserIdRoutingstatus**](UsersApi.md#getUserIdRoutingstatus) | **GET** api/v2/users/{userId}/routingstatus | Fetch the routing status of a user
[**getUserIdStation**](UsersApi.md#getUserIdStation) | **GET** api/v2/users/{userId}/station | Get station information for user
[**getUsers**](UsersApi.md#getUsers) | **GET** api/v2/users | Get the list of available users.
[**patchUserId**](UsersApi.md#patchUserId) | **PATCH** api/v2/users/{userId} | Update user
[**patchUserIdCallforwarding**](UsersApi.md#patchUserIdCallforwarding) | **PATCH** api/v2/users/{userId}/callforwarding | Patch a user&#39;s CallForwarding
[**patchUserIdGeolocationsClientId**](UsersApi.md#patchUserIdGeolocationsClientId) | **PATCH** api/v2/users/{userId}/geolocations/{clientId} | Patch a user&#39;s Geolocation
[**patchUserIdQueues**](UsersApi.md#patchUserIdQueues) | **PATCH** api/v2/users/{userId}/queues | Join or unjoin a set of queues for a user
[**patchUserIdQueuesQueueId**](UsersApi.md#patchUserIdQueuesQueueId) | **PATCH** api/v2/users/{userId}/queues/{queueId} | Join or unjoin a queue for a user
[**postSearch**](UsersApi.md#postSearch) | **POST** api/v2/users/search | Search
[**postUserIdRoutingskills**](UsersApi.md#postUserIdRoutingskills) | **POST** api/v2/users/{userId}/routingskills | Add routing skill to user
[**postUsers**](UsersApi.md#postUsers) | **POST** api/v2/users | Create user
[**postUsersAggregatesQuery**](UsersApi.md#postUsersAggregatesQuery) | **POST** api/v2/analytics/users/aggregates/query | Query for user aggregates
[**postUsersObservationsQuery**](UsersApi.md#postUsersObservationsQuery) | **POST** api/v2/analytics/users/observations/query | Query for user observations
[**putUserIdCallforwarding**](UsersApi.md#putUserIdCallforwarding) | **PUT** api/v2/users/{userId}/callforwarding | Update a user&#39;s CallForwarding
[**putUserIdOutofoffice**](UsersApi.md#putUserIdOutofoffice) | **PUT** api/v2/users/{userId}/outofoffice | Update an OutOfOffice
[**putUserIdRoles**](UsersApi.md#putUserIdRoles) | **PUT** api/v2/users/{userId}/roles | Sets the user&#39;s roles
[**putUserIdRoutingskillsSkillId**](UsersApi.md#putUserIdRoutingskillsSkillId) | **PUT** api/v2/users/{userId}/routingskills/{skillId} | Update routing skill proficiency or state.
[**putUserIdRoutingstatus**](UsersApi.md#putUserIdRoutingstatus) | **PUT** api/v2/users/{userId}/routingstatus | Update the routing status of a user
[**putUserIdStationAssociatedstationStationId**](UsersApi.md#putUserIdStationAssociatedstationStationId) | **PUT** api/v2/users/{userId}/station/associatedstation/{stationId} | Set associated station
[**putUserIdStationDefaultstationStationId**](UsersApi.md#putUserIdStationDefaultstationStationId) | **PUT** api/v2/users/{userId}/station/defaultstation/{stationId} | Set default station


<a name="deleteUserId"></a>
# **deleteUserId**
> String deleteUserId(userId)

Delete user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    String result = apiInstance.deleteUserId(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

**String**

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
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Void result = apiInstance.deleteUserIdRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserIdRoles");
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

<a name="deleteUserIdRoutingskillsSkillId"></a>
# **deleteUserIdRoutingskillsSkillId**
> String deleteUserIdRoutingskillsSkillId(userId, skillId)

Remove routing skill from user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    String result = apiInstance.deleteUserIdRoutingskillsSkillId(userId, skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserIdRoutingskillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **skillId** | **String**| skillId |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserIdStationAssociatedstation"></a>
# **deleteUserIdStationAssociatedstation**
> Void deleteUserIdStationAssociatedstation(userId)

Clear associated station



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Void result = apiInstance.deleteUserIdStationAssociatedstation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserIdStationAssociatedstation");
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

<a name="deleteUserIdStationDefaultstation"></a>
# **deleteUserIdStationDefaultstation**
> Void deleteUserIdStationDefaultstation(userId)

Clear default station



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Void result = apiInstance.deleteUserIdStationDefaultstation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserIdStationDefaultstation");
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

<a name="getMe"></a>
# **getMe**
> UserMe getMe(expand)

Get current user details.

This request is not valid when using the Client Credentials OAuth grant.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    UserMe result = apiInstance.getMe(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getMe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | [**List&lt;String&gt;**](String.md)| Which fields, if any, to expand. | [optional]

### Return type

[**UserMe**](UserMe.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> UsersSearchResponse getSearch(q64, expand)

Search using q64



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    UsersSearchResponse result = apiInstance.getSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getSearch");
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

<a name="getUserId"></a>
# **getUserId**
> User getUserId(userId, expand)

Get user.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    User result = apiInstance.getUserId(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **expand** | [**List&lt;String&gt;**](String.md)| Which fields, if any, to expand | [optional]

### Return type

[**User**](User.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdCallforwarding"></a>
# **getUserIdCallforwarding**
> CallForwarding getUserIdCallforwarding(userId)

Get a user&#39;s CallForwarding



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    CallForwarding result = apiInstance.getUserIdCallforwarding(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdCallforwarding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**CallForwarding**](CallForwarding.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdGeolocationsClientId"></a>
# **getUserIdGeolocationsClientId**
> Geolocation getUserIdGeolocationsClientId(userId, clientId)

Get a user&#39;s Geolocation



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
try {
    Geolocation result = apiInstance.getUserIdGeolocationsClientId(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdGeolocationsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Id |
 **clientId** | **String**| client Id |

### Return type

[**Geolocation**](Geolocation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdOutofoffice"></a>
# **getUserIdOutofoffice**
> OutOfOffice getUserIdOutofoffice(userId)

Get a OutOfOffice



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    OutOfOffice result = apiInstance.getUserIdOutofoffice(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdOutofoffice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**OutOfOffice**](OutOfOffice.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdQueues"></a>
# **getUserIdQueues**
> UserQueueEntityListing getUserIdQueues(userId, pageSize, pageNumber, joined)

Get queues for user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
try {
    UserQueueEntityListing result = apiInstance.getUserIdQueues(userId, pageSize, pageNumber, joined);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdQueues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **joined** | **Boolean**| Is joined to the queue | [optional] [default to true]

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.md)

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
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserIdRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdRoles");
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

<a name="getUserIdRoutingskills"></a>
# **getUserIdRoutingskills**
> UserSkillEntityListing getUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserIdRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdRoutingskills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdRoutingstatus"></a>
# **getUserIdRoutingstatus**
> RoutingStatus getUserIdRoutingstatus(userId)

Fetch the routing status of a user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    RoutingStatus result = apiInstance.getUserIdRoutingstatus(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdRoutingstatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**RoutingStatus**](RoutingStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserIdStation"></a>
# **getUserIdStation**
> UserStations getUserIdStation(userId)

Get station information for user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserStations result = apiInstance.getUserIdStation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserIdStation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**UserStations**](UserStations.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UsersEntityListing getUsers(pageSize, pageNumber, id, sortOrder, expand)

Get the list of available users.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList("id_example"); // List<String> | id
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UsersEntityListing result = apiInstance.getUsers(pageSize, pageNumber, id, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **id** | [**List&lt;String&gt;**](String.md)| id | [optional]
 **sortOrder** | **String**| Ascending or descending sort order | [optional] [default to ASC] [enum: ascending, descending]
 **expand** | [**List&lt;String&gt;**](String.md)| Which fields, if any, to expand | [optional]

### Return type

[**UsersEntityListing**](UsersEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserId"></a>
# **patchUserId**
> User patchUserId(userId, body)

Update user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
User body = new User(); // User | User
try {
    User result = apiInstance.patchUserId(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**User**](User.md)| User |

### Return type

[**User**](User.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserIdCallforwarding"></a>
# **patchUserIdCallforwarding**
> CallForwarding patchUserIdCallforwarding(userId, body)

Patch a user&#39;s CallForwarding



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.patchUserIdCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserIdCallforwarding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**CallForwarding**](CallForwarding.md)| Call forwarding |

### Return type

[**CallForwarding**](CallForwarding.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserIdGeolocationsClientId"></a>
# **patchUserIdGeolocationsClientId**
> Geolocation patchUserIdGeolocationsClientId(userId, clientId, body)

Patch a user&#39;s Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
Geolocation body = new Geolocation(); // Geolocation | Geolocation
try {
    Geolocation result = apiInstance.patchUserIdGeolocationsClientId(userId, clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserIdGeolocationsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Id |
 **clientId** | **String**| client Id |
 **body** | [**Geolocation**](Geolocation.md)| Geolocation |

### Return type

[**Geolocation**](Geolocation.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserIdQueues"></a>
# **patchUserIdQueues**
> UserQueue patchUserIdQueues(userId, body)

Join or unjoin a set of queues for a user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
try {
    UserQueue result = apiInstance.patchUserIdQueues(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserIdQueues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**List&lt;UserQueue&gt;**](UserQueue.md)| User Queues |

### Return type

[**UserQueue**](UserQueue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserIdQueuesQueueId"></a>
# **patchUserIdQueuesQueueId**
> UserQueue patchUserIdQueuesQueueId(queueId, userId, body)

Join or unjoin a queue for a user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String queueId = "queueId_example"; // String | Queue ID
String userId = "userId_example"; // String | User ID
UserQueue body = new UserQueue(); // UserQueue | Queue Member
try {
    UserQueue result = apiInstance.patchUserIdQueuesQueueId(queueId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserIdQueuesQueueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| Queue ID |
 **userId** | **String**| User ID |
 **body** | [**UserQueue**](UserQueue.md)| Queue Member |

### Return type

[**UserQueue**](UserQueue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSearch"></a>
# **postSearch**
> UsersSearchResponse postSearch(body)

Search



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postSearch");
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

<a name="postUserIdRoutingskills"></a>
# **postUserIdRoutingskills**
> UserRoutingSkill postUserIdRoutingskills(userId, body)

Add routing skill to user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.postUserIdRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserIdRoutingskills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**UserRoutingSkill**](UserRoutingSkill.md)| Skill |

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsers"></a>
# **postUsers**
> User postUsers(body)

Create user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
CreateUser body = new CreateUser(); // CreateUser | User
try {
    User result = apiInstance.postUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUser**](CreateUser.md)| User |

### Return type

[**User**](User.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAggregatesQuery"></a>
# **postUsersAggregatesQuery**
> PresenceQueryResponse postUsersAggregatesQuery(body)

Query for user aggregates



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
AggregationQuery body = new AggregationQuery(); // AggregationQuery | query
try {
    PresenceQueryResponse result = apiInstance.postUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AggregationQuery**](AggregationQuery.md)| query |

### Return type

[**PresenceQueryResponse**](PresenceQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersObservationsQuery"></a>
# **postUsersObservationsQuery**
> ObservationQueryResponse postUsersObservationsQuery(body)

Query for user observations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
ObservationQuery body = new ObservationQuery(); // ObservationQuery | query
try {
    ObservationQueryResponse result = apiInstance.postUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObservationQuery**](ObservationQuery.md)| query |

### Return type

[**ObservationQueryResponse**](ObservationQueryResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdCallforwarding"></a>
# **putUserIdCallforwarding**
> CallForwarding putUserIdCallforwarding(userId, body)

Update a user&#39;s CallForwarding



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.putUserIdCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdCallforwarding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**CallForwarding**](CallForwarding.md)| Call forwarding |

### Return type

[**CallForwarding**](CallForwarding.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdOutofoffice"></a>
# **putUserIdOutofoffice**
> OutOfOffice putUserIdOutofoffice(userId, body)

Update an OutOfOffice



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
OutOfOffice body = new OutOfOffice(); // OutOfOffice | The updated UserPresence
try {
    OutOfOffice result = apiInstance.putUserIdOutofoffice(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdOutofoffice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**OutOfOffice**](OutOfOffice.md)| The updated UserPresence |

### Return type

[**OutOfOffice**](OutOfOffice.md)

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
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserIdRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdRoles");
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

<a name="putUserIdRoutingskillsSkillId"></a>
# **putUserIdRoutingskillsSkillId**
> UserRoutingSkill putUserIdRoutingskillsSkillId(userId, skillId, body)

Update routing skill proficiency or state.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserIdRoutingskillsSkillId(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdRoutingskillsSkillId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **skillId** | **String**| skillId |
 **body** | [**UserRoutingSkill**](UserRoutingSkill.md)| Skill |

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdRoutingstatus"></a>
# **putUserIdRoutingstatus**
> RoutingStatus putUserIdRoutingstatus(userId, body)

Update the routing status of a user



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
RoutingStatus body = new RoutingStatus(); // RoutingStatus | Routing Status
try {
    RoutingStatus result = apiInstance.putUserIdRoutingstatus(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdRoutingstatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**RoutingStatus**](RoutingStatus.md)| Routing Status |

### Return type

[**RoutingStatus**](RoutingStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdStationAssociatedstationStationId"></a>
# **putUserIdStationAssociatedstationStationId**
> Void putUserIdStationAssociatedstationStationId(userId, stationId)

Set associated station



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    Void result = apiInstance.putUserIdStationAssociatedstationStationId(userId, stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdStationAssociatedstationStationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **stationId** | **String**| stationId |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserIdStationDefaultstationStationId"></a>
# **putUserIdStationDefaultstationStationId**
> Void putUserIdStationDefaultstationStationId(userId, stationId)

Set default station



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    Void result = apiInstance.putUserIdStationDefaultstationStationId(userId, stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserIdStationDefaultstationStationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **stationId** | **String**| stationId |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

