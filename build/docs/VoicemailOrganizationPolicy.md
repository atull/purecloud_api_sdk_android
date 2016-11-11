
# VoicemailOrganizationPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  |  [optional]
**retentionTimeDays** | **Integer** |  |  [optional]
**alertTimeoutSeconds** | **Integer** |  |  [optional]
**minimumRecordingTimeSeconds** | **Integer** |  |  [optional]
**maximumRecordingTimeSeconds** | **Integer** |  |  [optional]
**unavailableMessageUri** | **String** |  |  [optional]
**namePromptMessageUri** | **String** |  |  [optional]
**fullMessageUri** | **String** |  |  [optional]
**compressSilence** | **Boolean** |  |  [optional]
**pinConfiguration** | [**PINConfiguration**](PINConfiguration.md) |  |  [optional]
**quotaSizeBytes** | **Long** |  |  [optional]
**createdDate** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**modifiedDate** | [**Date**](Date.md) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**voicemailExtension** | **String** | The extension for voicemail retrieval.  The default value is *86. |  [optional]
**pinRequired** | **Boolean** | If this is true, a PIN is required when accessing a user&#39;s voicemail from a phone. |  [optional]



