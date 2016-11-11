
# SequenceSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**intervals** | [**List&lt;ScheduleInterval&gt;**](ScheduleInterval.md) | a list of start and end times | 
**timeZone** | **String** | time zone identifier to be applied to the intervals; for example Africa/Abidjan | 
**sequence** | [**UriReference**](UriReference.md) | identifier of the sequence to be scheduled | 
**selfUri** | **String** | The URI for this object |  [optional]



