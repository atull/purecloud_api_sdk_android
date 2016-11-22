
# Station

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userId** | **String** |  |  [optional]
**primaryEdge** | [**UriReference**](UriReference.md) |  |  [optional]
**secondaryEdge** | [**UriReference**](UriReference.md) |  |  [optional]
**type** | **String** |  |  [optional]
**lineAppearanceId** | **String** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
AVAILABLE | &quot;AVAILABLE&quot;
ASSOCIATED | &quot;ASSOCIATED&quot;



