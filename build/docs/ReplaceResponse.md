
# ReplaceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**changeNumber** | **Integer** |  |  [optional]
**uploadStatus** | [**UriReference**](UriReference.md) |  |  [optional]
**uploadDestinationUri** | **String** |  |  [optional]
**uploadMethod** | [**UploadMethodEnum**](#UploadMethodEnum) |  |  [optional]


<a name="UploadMethodEnum"></a>
## Enum: UploadMethodEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
SINGLE_PUT | &quot;SINGLE_PUT&quot;
MULTIPART_POST | &quot;MULTIPART_POST&quot;



