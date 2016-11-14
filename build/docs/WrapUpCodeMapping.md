
# WrapUpCodeMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**defaultSet** | **List&lt;String&gt;** | The default set of wrapup values |  [optional]
**mapping** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | A map from wrapup code identifiers to a set of wrapup values |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]



