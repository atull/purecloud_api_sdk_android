
# EdgeLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** | The name of the entity. | 
**description** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedBy** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**modifiedByApp** | **String** |  |  [optional]
**createdByApp** | **String** |  |  [optional]
**schema** | [**UriReference**](UriReference.md) |  |  [optional]
**properties** | **Map&lt;String, Object&gt;** |  |  [optional]
**edge** | [**Edge**](Edge.md) |  |  [optional]
**edgeGroup** | [**EdgeGroup**](EdgeGroup.md) |  |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) |  |  [optional]
**endpoint** | [**Endpoint**](Endpoint.md) |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**logicalInterfaceId** | **String** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;


<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
TIE | &quot;TIE&quot;
NETWORK | &quot;NETWORK&quot;
TRUNK | &quot;TRUNK&quot;
STATION | &quot;STATION&quot;



