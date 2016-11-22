
# Phone

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
**site** | [**UriReference**](UriReference.md) | The site associated to the phone. | 
**phoneBaseSettings** | [**UriReference**](UriReference.md) | Phone Base Settings | 
**lineBaseSettings** | [**UriReference**](UriReference.md) |  |  [optional]
**phoneMetaBase** | [**UriReference**](UriReference.md) |  |  [optional]
**lines** | [**List&lt;Line&gt;**](Line.md) | Lines | 
**status** | [**PhoneStatus**](PhoneStatus.md) | The status of the phone and lines from the primary Edge. |  [optional]
**secondaryStatus** | [**PhoneStatus**](PhoneStatus.md) | The status of the phone and lines from the secondary Edge. |  [optional]
**properties** | **Map&lt;String, Object&gt;** |  |  [optional]
**capabilities** | [**PhoneCapabilities**](PhoneCapabilities.md) |  |  [optional]
**webRtcUser** | [**UriReference**](UriReference.md) | This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



