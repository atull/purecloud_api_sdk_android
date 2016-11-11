
# PolicyActions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retainRecording** | **Boolean** | true to retain the recording associated with the conversation. Default &#x3D; true |  [optional]
**deleteRecording** | **Boolean** | true to delete the recording associated with the conversation. If retainRecording &#x3D; true, this will be ignored. Default &#x3D; false |  [optional]
**alwaysDelete** | **Boolean** | true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default &#x3D; false |  [optional]
**assignEvaluations** | [**List&lt;EvaluationAssignment&gt;**](EvaluationAssignment.md) |  |  [optional]
**assignMeteredEvaluations** | [**List&lt;MeteredEvaluationAssignment&gt;**](MeteredEvaluationAssignment.md) |  |  [optional]
**assignCalibrations** | [**List&lt;CalibrationAssignment&gt;**](CalibrationAssignment.md) |  |  [optional]
**retentionDuration** | [**RetentionDuration**](RetentionDuration.md) |  |  [optional]
**initiateScreenRecording** | [**InitiateScreenRecording**](InitiateScreenRecording.md) |  |  [optional]



