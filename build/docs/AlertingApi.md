# AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInteractionstatsAlertsAlertId**](AlertingApi.md#deleteInteractionstatsAlertsAlertId) | **DELETE** api/v2/alerting/interactionstats/alerts/{alertId} | Delete an interaction stats alert
[**deleteInteractionstatsRulesRuleId**](AlertingApi.md#deleteInteractionstatsRulesRuleId) | **DELETE** api/v2/alerting/interactionstats/rules/{ruleId} | Delete an interaction stats rule.
[**getInteractionstatsAlerts**](AlertingApi.md#getInteractionstatsAlerts) | **GET** api/v2/alerting/interactionstats/alerts | Get interaction stats alert list.
[**getInteractionstatsAlertsAlertId**](AlertingApi.md#getInteractionstatsAlertsAlertId) | **GET** api/v2/alerting/interactionstats/alerts/{alertId} | Get an interaction stats alert
[**getInteractionstatsAlertsUnread**](AlertingApi.md#getInteractionstatsAlertsUnread) | **GET** api/v2/alerting/interactionstats/alerts/unread | Gets user unread count of interaction stats alerts.
[**getInteractionstatsRules**](AlertingApi.md#getInteractionstatsRules) | **GET** api/v2/alerting/interactionstats/rules | Get an interaction stats rule list.
[**getInteractionstatsRulesRuleId**](AlertingApi.md#getInteractionstatsRulesRuleId) | **GET** api/v2/alerting/interactionstats/rules/{ruleId} | Get an interaction stats rule.
[**postInteractionstatsRules**](AlertingApi.md#postInteractionstatsRules) | **POST** api/v2/alerting/interactionstats/rules | Create an interaction stats rule.
[**putInteractionstatsAlertsAlertId**](AlertingApi.md#putInteractionstatsAlertsAlertId) | **PUT** api/v2/alerting/interactionstats/alerts/{alertId} | Update an interaction stats alert read status
[**putInteractionstatsRulesRuleId**](AlertingApi.md#putInteractionstatsRulesRuleId) | **PUT** api/v2/alerting/interactionstats/rules/{ruleId} | Update an interaction stats rule


<a name="deleteInteractionstatsAlertsAlertId"></a>
# **deleteInteractionstatsAlertsAlertId**
> Void deleteInteractionstatsAlertsAlertId(alertId)

Delete an interaction stats alert



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    Void result = apiInstance.deleteInteractionstatsAlertsAlertId(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteInteractionstatsAlertsAlertId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **String**| Alert ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInteractionstatsRulesRuleId"></a>
# **deleteInteractionstatsRulesRuleId**
> Void deleteInteractionstatsRulesRuleId(ruleId)

Delete an interaction stats rule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    Void result = apiInstance.deleteInteractionstatsRulesRuleId(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteInteractionstatsRulesRuleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionstatsAlerts"></a>
# **getInteractionstatsAlerts**
> InteractionStatsAlertContainer getInteractionstatsAlerts()

Get interaction stats alert list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
try {
    InteractionStatsAlertContainer result = apiInstance.getInteractionstatsAlerts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getInteractionstatsAlerts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InteractionStatsAlertContainer**](InteractionStatsAlertContainer.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionstatsAlertsAlertId"></a>
# **getInteractionstatsAlertsAlertId**
> InteractionStatsAlert getInteractionstatsAlertsAlertId(alertId)

Get an interaction stats alert



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    InteractionStatsAlert result = apiInstance.getInteractionstatsAlertsAlertId(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getInteractionstatsAlertsAlertId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **String**| Alert ID |

### Return type

[**InteractionStatsAlert**](InteractionStatsAlert.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionstatsAlertsUnread"></a>
# **getInteractionstatsAlertsUnread**
> UnreadMetric getInteractionstatsAlertsUnread()

Gets user unread count of interaction stats alerts.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
try {
    UnreadMetric result = apiInstance.getInteractionstatsAlertsUnread();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getInteractionstatsAlertsUnread");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnreadMetric**](UnreadMetric.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionstatsRules"></a>
# **getInteractionstatsRules**
> InteractionStatsRuleContainer getInteractionstatsRules()

Get an interaction stats rule list.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
try {
    InteractionStatsRuleContainer result = apiInstance.getInteractionstatsRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InteractionStatsRuleContainer**](InteractionStatsRuleContainer.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInteractionstatsRulesRuleId"></a>
# **getInteractionstatsRulesRuleId**
> InteractionStatsRule getInteractionstatsRulesRuleId(ruleId)

Get an interaction stats rule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    InteractionStatsRule result = apiInstance.getInteractionstatsRulesRuleId(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getInteractionstatsRulesRuleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID |

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postInteractionstatsRules"></a>
# **postInteractionstatsRules**
> InteractionStatsRule postInteractionstatsRules(body)

Create an interaction stats rule.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
try {
    InteractionStatsRule result = apiInstance.postInteractionstatsRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InteractionStatsRule**](InteractionStatsRule.md)| AlertingRule |

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putInteractionstatsAlertsAlertId"></a>
# **putInteractionstatsAlertsAlertId**
> UnreadStatus putInteractionstatsAlertsAlertId(alertId, body)

Update an interaction stats alert read status



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
UnreadStatus body = new UnreadStatus(); // UnreadStatus | InteractionStatsAlert
try {
    UnreadStatus result = apiInstance.putInteractionstatsAlertsAlertId(alertId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putInteractionstatsAlertsAlertId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **String**| Alert ID |
 **body** | [**UnreadStatus**](UnreadStatus.md)| InteractionStatsAlert |

### Return type

[**UnreadStatus**](UnreadStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putInteractionstatsRulesRuleId"></a>
# **putInteractionstatsRulesRuleId**
> InteractionStatsRule putInteractionstatsRulesRuleId(ruleId, body)

Update an interaction stats rule



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
try {
    InteractionStatsRule result = apiInstance.putInteractionstatsRulesRuleId(ruleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putInteractionstatsRulesRuleId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Rule ID |
 **body** | [**InteractionStatsRule**](InteractionStatsRule.md)| AlertingRule |

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

