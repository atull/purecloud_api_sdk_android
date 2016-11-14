
# UserMe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The globally unique identifier for the object. |  [optional]
**name** | **String** |  |  [optional]
**chat** | [**Chat**](Chat.md) |  |  [optional]
**department** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**primaryContactInfo** | [**List&lt;Contact&gt;**](Contact.md) | Auto populated from addresses. |  [optional]
**addresses** | [**List&lt;Contact&gt;**](Contact.md) | Email addresses and phone numbers for this user |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state for this user. |  [optional]
**title** | **String** |  |  [optional]
**username** | **String** |  |  [optional]
**images** | [**List&lt;UserImage&gt;**](UserImage.md) |  |  [optional]
**version** | **Integer** | Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH. | 
**routingStatus** | [**RoutingStatus**](RoutingStatus.md) | ACD routing status |  [optional]
**presence** | [**UserPresence**](UserPresence.md) | Active presence |  [optional]
**conversationSummary** | [**UserConversationSummary**](UserConversationSummary.md) | Summary of conversion statistics for conversation types. |  [optional]
**outOfOffice** | [**OutOfOffice**](OutOfOffice.md) | Determine if out of office is enabled |  [optional]
**geolocation** | [**Geolocation**](Geolocation.md) | Current geolocation position |  [optional]
**station** | [**UserStations**](UserStations.md) | Effective, default, and last station information |  [optional]
**authorization** | [**UserAuthorization**](UserAuthorization.md) | Roles and permissions assigned to the user |  [optional]
**profileSkills** | **List&lt;String&gt;** | Skills possessed by the user |  [optional]
**date** | [**ServerDate**](ServerDate.md) | The PureCloud system date time. |  [optional]
**geolocationSettings** | [**GeolocationSettings**](GeolocationSettings.md) | Geolocation settings for user&#39;s organization. |  [optional]
**organization** | [**Organization**](Organization.md) | Organization details for this user. |  [optional]
**presenceDefinitions** | [**List&lt;OrganizationPresence&gt;**](OrganizationPresence.md) | The first 100 presence definitions for user&#39;s organization. |  [optional]
**locations** | [**List&lt;Location&gt;**](Location.md) | The first 100 locations for user&#39;s organization |  [optional]
**selfUri** | **String** | The URI for this object |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;



