
# CallableTimeSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**callableTimes** | [**List&lt;CallableTime&gt;**](CallableTime.md) | list of time/timezone groupings for which it is acceptable to place outbound calls | 
**selfUri** | **String** | The URI for this object |  [optional]



