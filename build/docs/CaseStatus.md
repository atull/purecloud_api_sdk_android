
# CaseStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** | Name of the case status | 
**description** | **String** | Detailed description of the case status |  [optional]
**order** | **Integer** | Display order of the case status. Possible values 1 - 1000. |  [optional]
**isActive** | **Boolean** | Active/Inactive flag of the case status |  [optional]
**isDefault** | **Boolean** | Default case status. An organization can have a set of default statuses which cannot be delete or modified. Only custom cases can be modified |  [optional]
**dateCreated** | [**Date**](Date.md) | Date when case status is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date when case status is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]



