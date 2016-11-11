
# ModelCase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**title** | **String** | Brief title for the Case | 
**status** | [**CaseStatus**](CaseStatus.md) | Predefined status to be assigned to a case. A list of case statuses will be managed by Case Admin | 
**type** | [**CaseType**](CaseType.md) | Predefined type to be assigned to a case. A list of case types will be managed by Case Admin | 
**description** | **String** | Detailed description of the case | 
**dateCreated** | [**Date**](Date.md) | Date when case is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date when case is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]



