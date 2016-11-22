# NotificationsApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChannelsChannelIdSubscriptions**](NotificationsApi.md#deleteChannelsChannelIdSubscriptions) | **DELETE** api/v2/notifications/channels/{channelId}/subscriptions | Remove all subscriptions
[**getAvailabletopics**](NotificationsApi.md#getAvailabletopics) | **GET** api/v2/notifications/availabletopics | Get available notification topics.
[**getChannels**](NotificationsApi.md#getChannels) | **GET** api/v2/notifications/channels | The list of existing channels
[**getChannelsChannelIdSubscriptions**](NotificationsApi.md#getChannelsChannelIdSubscriptions) | **GET** api/v2/notifications/channels/{channelId}/subscriptions | The list of all subscriptions for this channel
[**postChannels**](NotificationsApi.md#postChannels) | **POST** api/v2/notifications/channels | Create a new channel
[**postChannelsChannelIdSubscriptions**](NotificationsApi.md#postChannelsChannelIdSubscriptions) | **POST** api/v2/notifications/channels/{channelId}/subscriptions | Add a list of subscriptions to the existing list of subscriptions
[**putChannelsChannelIdSubscriptions**](NotificationsApi.md#putChannelsChannelIdSubscriptions) | **PUT** api/v2/notifications/channels/{channelId}/subscriptions | Replace the current list of subscriptions with a new list.


<a name="deleteChannelsChannelIdSubscriptions"></a>
# **deleteChannelsChannelIdSubscriptions**
> String deleteChannelsChannelIdSubscriptions(channelId)

Remove all subscriptions



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
try {
    String result = apiInstance.deleteChannelsChannelIdSubscriptions(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#deleteChannelsChannelIdSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvailabletopics"></a>
# **getAvailabletopics**
> AvailableTopicEntityListing getAvailabletopics(expand)

Get available notification topics.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    AvailableTopicEntityListing result = apiInstance.getAvailabletopics(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getAvailabletopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | [**List&lt;String&gt;**](String.md)| Which fields, if any, to expand | [optional]

### Return type

[**AvailableTopicEntityListing**](AvailableTopicEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannels"></a>
# **getChannels**
> ChannelEntityListing getChannels()

The list of existing channels



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
try {
    ChannelEntityListing result = apiInstance.getChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChannelEntityListing**](ChannelEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelsChannelIdSubscriptions"></a>
# **getChannelsChannelIdSubscriptions**
> ChannelTopicEntityListing getChannelsChannelIdSubscriptions(channelId)

The list of all subscriptions for this channel



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
try {
    ChannelTopicEntityListing result = apiInstance.getChannelsChannelIdSubscriptions(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getChannelsChannelIdSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel ID |

### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChannels"></a>
# **postChannels**
> Channel postChannels()

Create a new channel

There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
try {
    Channel result = apiInstance.postChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#postChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Channel**](Channel.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChannelsChannelIdSubscriptions"></a>
# **postChannelsChannelIdSubscriptions**
> ChannelTopicEntityListing postChannelsChannelIdSubscriptions(channelId, body)

Add a list of subscriptions to the existing list of subscriptions



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
List<ChannelTopic> body = Arrays.asList(new ChannelTopic()); // List<ChannelTopic> | Topic
try {
    ChannelTopicEntityListing result = apiInstance.postChannelsChannelIdSubscriptions(channelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#postChannelsChannelIdSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel ID |
 **body** | [**List&lt;ChannelTopic&gt;**](ChannelTopic.md)| Topic |

### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putChannelsChannelIdSubscriptions"></a>
# **putChannelsChannelIdSubscriptions**
> ChannelTopicEntityListing putChannelsChannelIdSubscriptions(channelId, body)

Replace the current list of subscriptions with a new list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String channelId = "channelId_example"; // String | Channel ID
List<ChannelTopic> body = Arrays.asList(new ChannelTopic()); // List<ChannelTopic> | Topic
try {
    ChannelTopicEntityListing result = apiInstance.putChannelsChannelIdSubscriptions(channelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#putChannelsChannelIdSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel ID |
 **body** | [**List&lt;ChannelTopic&gt;**](ChannelTopic.md)| Topic |

### Return type

[**ChannelTopicEntityListing**](ChannelTopicEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

