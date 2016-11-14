
# InboundDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**mxRecordStatus** | [**MxRecordStatusEnum**](#MxRecordStatusEnum) | Mx Record Status | 
**subDomain** | **Boolean** | Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email. |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="MxRecordStatusEnum"></a>
## Enum: MxRecordStatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot;



