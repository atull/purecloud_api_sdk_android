
# ContactList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**dateCreated** | [**Date**](Date.md) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**dateModified** | [**Date**](Date.md) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional]
**version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional]
**columnNames** | **List&lt;String&gt;** | the contact column names | 
**phoneColumns** | [**List&lt;ContactPhoneNumberColumn&gt;**](ContactPhoneNumberColumn.md) | the columns containing phone numbers | 
**importStatus** | [**ImportStatus**](ImportStatus.md) | the status of the import process |  [optional]
**previewModeColumnName** | **String** | the name of the column that holds the indicators for contacts that are to be dialed in preview mode only |  [optional]
**previewModeAcceptedValues** | **List&lt;String&gt;** | list of user-defined values indicating the contact is to be dialed in preview mode only |  [optional]
**size** | **Long** | the number of contacts in the contact list |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]



