
# CreateCallbackCommand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scriptId** | **String** | The identifier of the script to be used for the callback |  [optional]
**queueId** | **String** | The identifier of the queue to be used for the callback. Either queueId or routingData is required. |  [optional]
**routingData** | [**RoutingData**](RoutingData.md) | The routing data to be used for the callback. Either queueId or routingData is required. |  [optional]
**callbackUserName** | **String** | The name of the party to be called back. |  [optional]
**callbackNumbers** | **List&lt;String&gt;** | A list of phone numbers for the callback. | 
**callbackScheduledTime** | [**Date**](Date.md) | The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**countryCode** | **String** | The country code to be associated with the callback numbers. |  [optional]
**isAutomated** | **Boolean** | Whether or not to automatically place a call for this callback. |  [optional]
**automatedCallbackConfigId** | **String** | The id of the configuration to handle the response (e.g. live voice, machine) from automatically placing a call for a callback. |  [optional]
**data** | **Map&lt;String, String&gt;** | A map of key-value pairs containing additional data that can be associated to the callback. These could be set up for instance to be used in a customized script shown during the call. Example: { \&quot;notes\&quot;: \&quot;ready to close the deal!\&quot;, \&quot;customerPreferredName\&quot;: \&quot;Doc\&quot; } |  [optional]



