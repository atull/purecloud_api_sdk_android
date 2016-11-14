
# Document

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**changeNumber** | **Integer** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateUploaded** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**contentUri** | **String** |  |  [optional]
**workspace** | [**UriReference**](UriReference.md) |  |  [optional]
**createdBy** | [**UriReference**](UriReference.md) |  |  [optional]
**uploadedBy** | [**UriReference**](UriReference.md) |  |  [optional]
**contentType** | **String** |  |  [optional]
**contentLength** | **Long** |  |  [optional]
**systemType** | [**SystemTypeEnum**](#SystemTypeEnum) |  |  [optional]
**filename** | **String** |  |  [optional]
**pageCount** | **Long** |  |  [optional]
**read** | **Boolean** |  |  [optional]
**callerAddress** | **String** |  |  [optional]
**receiverAddress** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**tagValues** | [**List&lt;TagValue&gt;**](TagValue.md) |  |  [optional]
**attributes** | [**List&lt;DocumentAttribute&gt;**](DocumentAttribute.md) |  |  [optional]
**thumbnails** | [**List&lt;DocumentThumbnail&gt;**](DocumentThumbnail.md) |  |  [optional]
**uploadStatus** | [**UriReference**](UriReference.md) |  |  [optional]
**uploadDestinationUri** | **String** |  |  [optional]
**uploadMethod** | [**UploadMethodEnum**](#UploadMethodEnum) |  |  [optional]
**lockInfo** | [**LockInfo**](LockInfo.md) |  |  [optional]
**acl** | **List&lt;String&gt;** | A list of permitted action rights for the user making the request |  [optional]
**sharingStatus** | [**SharingStatusEnum**](#SharingStatusEnum) |  |  [optional]
**sharingUri** | **String** |  |  [optional]
**downloadSharingUri** | **String** |  |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="SystemTypeEnum"></a>
## Enum: SystemTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
DOCUMENT | &quot;DOCUMENT&quot;
FAX | &quot;FAX&quot;
RECORDING | &quot;RECORDING&quot;


<a name="UploadMethodEnum"></a>
## Enum: UploadMethodEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
SINGLE_PUT | &quot;SINGLE_PUT&quot;
MULTIPART_POST | &quot;MULTIPART_POST&quot;


<a name="SharingStatusEnum"></a>
## Enum: SharingStatusEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
NONE | &quot;NONE&quot;
LIMITED | &quot;LIMITED&quot;
PUBLIC | &quot;PUBLIC&quot;



