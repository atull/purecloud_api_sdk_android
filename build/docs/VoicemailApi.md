# VoicemailApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessages**](VoicemailApi.md#deleteMessages) | **DELETE** api/v2/voicemail/messages | Delete all voicemail messages
[**deleteMessagesMessageId**](VoicemailApi.md#deleteMessagesMessageId) | **DELETE** api/v2/voicemail/messages/{messageId} | Delete a message.
[**getMailbox**](VoicemailApi.md#getMailbox) | **GET** api/v2/voicemail/mailbox | Get mailbox information
[**getMessages**](VoicemailApi.md#getMessages) | **GET** api/v2/voicemail/messages | List voicemail messages
[**getMessagesMessageId**](VoicemailApi.md#getMessagesMessageId) | **GET** api/v2/voicemail/messages/{messageId} | Get message.
[**getMessagesMessageIdMedia**](VoicemailApi.md#getMessagesMessageIdMedia) | **GET** api/v2/voicemail/messages/{messageId}/media | Get media playback URI for this message
[**getPolicy**](VoicemailApi.md#getPolicy) | **GET** api/v2/voicemail/policy | Get a policy
[**getUserpoliciesUserId**](VoicemailApi.md#getUserpoliciesUserId) | **GET** api/v2/voicemail/userpolicies/{userId} | Get a user&#39;s voicemail policy
[**patchUserpoliciesUserId**](VoicemailApi.md#patchUserpoliciesUserId) | **PATCH** api/v2/voicemail/userpolicies/{userId} | Update a user&#39;s voicemail policy
[**putMessagesMessageId**](VoicemailApi.md#putMessagesMessageId) | **PUT** api/v2/voicemail/messages/{messageId} | Update a message.
[**putPolicy**](VoicemailApi.md#putPolicy) | **PUT** api/v2/voicemail/policy | Update a policy


<a name="deleteMessages"></a>
# **deleteMessages**
> String deleteMessages()

Delete all voicemail messages



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
try {
    String result = apiInstance.deleteMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteMessages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMessagesMessageId"></a>
# **deleteMessagesMessageId**
> String deleteMessagesMessageId(messageId)

Delete a message.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
try {
    String result = apiInstance.deleteMessagesMessageId(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteMessagesMessageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailbox"></a>
# **getMailbox**
> VoicemailMailboxInfo getMailbox()

Get mailbox information



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMailboxInfo result = apiInstance.getMailbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getMailbox");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> VoicemailMessageEntityListing getMessages()

List voicemail messages



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMessageEntityListing result = apiInstance.getMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getMessages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagesMessageId"></a>
# **getMessagesMessageId**
> VoicemailMessage getMessagesMessageId(messageId)

Get message.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
try {
    VoicemailMessage result = apiInstance.getMessagesMessageId(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getMessagesMessageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message ID |

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagesMessageIdMedia"></a>
# **getMessagesMessageIdMedia**
> VoicemailMediaInfo getMessagesMessageIdMedia(messageId, formatId)

Get media playback URI for this message



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
String formatId = "WEBM"; // String | The desired media format.
try {
    VoicemailMediaInfo result = apiInstance.getMessagesMessageIdMedia(messageId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getMessagesMessageIdMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message ID |
 **formatId** | **String**| The desired media format. | [optional] [default to WEBM] [enum: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, NONE]

### Return type

[**VoicemailMediaInfo**](VoicemailMediaInfo.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPolicy"></a>
# **getPolicy**
> VoicemailOrganizationPolicy getPolicy()

Get a policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailOrganizationPolicy result = apiInstance.getPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getPolicy");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserpoliciesUserId"></a>
# **getUserpoliciesUserId**
> VoicemailUserPolicy getUserpoliciesUserId(userId)

Get a user&#39;s voicemail policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
try {
    VoicemailUserPolicy result = apiInstance.getUserpoliciesUserId(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getUserpoliciesUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUserpoliciesUserId"></a>
# **patchUserpoliciesUserId**
> VoicemailUserPolicy patchUserpoliciesUserId(userId, body)

Update a user&#39;s voicemail policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.patchUserpoliciesUserId(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchUserpoliciesUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **body** | [**VoicemailUserPolicy**](VoicemailUserPolicy.md)| The user&#39;s voicemail policy |

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMessagesMessageId"></a>
# **putMessagesMessageId**
> VoicemailMessage putMessagesMessageId(messageId, body)

Update a message.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
VoicemailMessage body = new VoicemailMessage(); // VoicemailMessage | VoicemailMessage
try {
    VoicemailMessage result = apiInstance.putMessagesMessageId(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putMessagesMessageId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message ID |
 **body** | [**VoicemailMessage**](VoicemailMessage.md)| VoicemailMessage |

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPolicy"></a>
# **putPolicy**
> VoicemailOrganizationPolicy putPolicy(body)

Update a policy



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

VoicemailApi apiInstance = new VoicemailApi();
VoicemailOrganizationPolicy body = new VoicemailOrganizationPolicy(); // VoicemailOrganizationPolicy | Policy
try {
    VoicemailOrganizationPolicy result = apiInstance.putPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md)| Policy |

### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

