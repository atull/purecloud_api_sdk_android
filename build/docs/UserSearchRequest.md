
# UserSearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sortOrder** | [**SortOrderEnum**](#SortOrderEnum) |  |  [optional]
**sortBy** | **String** |  |  [optional]
**pageSize** | **Integer** |  |  [optional]
**pageNumber** | **Integer** |  |  [optional]
**returnFields** | **List&lt;String&gt;** |  |  [optional]
**expand** | **List&lt;String&gt;** |  |  [optional]
**query** | [**List&lt;UserSearchCriteria&gt;**](UserSearchCriteria.md) |  |  [optional]


<a name="SortOrderEnum"></a>
## Enum: SortOrderEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ASC | &quot;ASC&quot;
DESC | &quot;DESC&quot;
SCORE | &quot;SCORE&quot;



