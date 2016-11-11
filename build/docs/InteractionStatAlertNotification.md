
# InteractionStatAlertNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**ruleId** | **String** |  |  [optional]
**dimension** | [**DimensionEnum**](#DimensionEnum) |  |  [optional]
**dimensionValue** | **String** |  |  [optional]
**dimensionValueName** | **String** |  |  [optional]
**metric** | [**MetricEnum**](#MetricEnum) |  |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional]
**numericRange** | [**NumericRangeEnum**](#NumericRangeEnum) |  |  [optional]
**statistic** | [**StatisticEnum**](#StatisticEnum) |  |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**unread** | **Boolean** |  |  [optional]
**startDate** | **Integer** |  |  [optional]
**endDate** | **Integer** |  |  [optional]
**notificationUsers** | [**List&lt;InteractionStatAlertNotificationNotificationUsers&gt;**](InteractionStatAlertNotificationNotificationUsers.md) |  |  [optional]
**alertTypes** | **List&lt;String&gt;** |  |  [optional]


<a name="DimensionEnum"></a>
## Enum: DimensionEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
QUEUEID | &quot;queueId&quot;
USERID | &quot;userId&quot;


<a name="MetricEnum"></a>
## Enum: MetricEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
TABANDON | &quot;tAbandon&quot;
TANSWERED | &quot;tAnswered&quot;
TTALK | &quot;tTalk&quot;
NOFFERED | &quot;nOffered&quot;
THANDLE | &quot;tHandle&quot;
NTRANSFERRED | &quot;nTransferred&quot;
OSERVICELEVEL | &quot;oServiceLevel&quot;
TWAIT | &quot;tWait&quot;
THELD | &quot;tHeld&quot;
TACW | &quot;tAcw&quot;


<a name="MediaTypeEnum"></a>
## Enum: MediaTypeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
VOICE | &quot;voice&quot;
CHAT | &quot;chat&quot;
EMAIL | &quot;email&quot;


<a name="NumericRangeEnum"></a>
## Enum: NumericRangeEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
GT | &quot;gt&quot;
GTE | &quot;gte&quot;
LT | &quot;lt&quot;
LTE | &quot;lte&quot;
EQ | &quot;eq&quot;
NE | &quot;ne&quot;


<a name="StatisticEnum"></a>
## Enum: StatisticEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
COUNT | &quot;count&quot;
MIN | &quot;min&quot;
RATIO | &quot;ratio&quot;
MAX | &quot;max&quot;



