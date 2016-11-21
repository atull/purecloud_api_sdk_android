# ContentManagementApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocumentsDocumentId**](ContentManagementApi.md#deleteDocumentsDocumentId) | **DELETE** api/v2/contentmanagement/documents/{documentId} | Delete a document.
[**deleteSharesShareId**](ContentManagementApi.md#deleteSharesShareId) | **DELETE** api/v2/contentmanagement/shares/{shareId} | Deletes an existing share.
[**deleteStatusStatusId**](ContentManagementApi.md#deleteStatusStatusId) | **DELETE** api/v2/contentmanagement/status/{statusId} | Cancel the command for this status
[**deleteWorkspacesWorkspaceId**](ContentManagementApi.md#deleteWorkspacesWorkspaceId) | **DELETE** api/v2/contentmanagement/workspaces/{workspaceId} | Delete a workspace
[**deleteWorkspacesWorkspaceIdMembersMemberId**](ContentManagementApi.md#deleteWorkspacesWorkspaceIdMembersMemberId) | **DELETE** api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Delete a member from a workspace
[**deleteWorkspacesWorkspaceIdTagvaluesTagId**](ContentManagementApi.md#deleteWorkspacesWorkspaceIdTagvaluesTagId) | **DELETE** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Delete workspace tag
[**getDocuments**](ContentManagementApi.md#getDocuments) | **GET** api/v2/contentmanagement/documents | Get a list of documents.
[**getDocumentsDocumentId**](ContentManagementApi.md#getDocumentsDocumentId) | **GET** api/v2/contentmanagement/documents/{documentId} | Get a document.
[**getDocumentsDocumentIdAudits**](ContentManagementApi.md#getDocumentsDocumentIdAudits) | **GET** api/v2/contentmanagement/documents/{documentId}/audits | Get a list of audits for a document.
[**getDocumentsDocumentIdContent**](ContentManagementApi.md#getDocumentsDocumentIdContent) | **GET** api/v2/contentmanagement/documents/{documentId}/content | Download a document.
[**getQuery**](ContentManagementApi.md#getQuery) | **GET** api/v2/contentmanagement/query | Query content
[**getSecurityprofiles**](ContentManagementApi.md#getSecurityprofiles) | **GET** api/v2/contentmanagement/securityprofiles | Get a List of Security Profiles
[**getSecurityprofilesSecurityprofileId**](ContentManagementApi.md#getSecurityprofilesSecurityprofileId) | **GET** api/v2/contentmanagement/securityprofiles/{securityProfileId} | Get a Security Profile
[**getSharedSharedId**](ContentManagementApi.md#getSharedSharedId) | **GET** api/v2/contentmanagement/shared/{sharedId} | Get shared documents. Securely download a shared document.
[**getShares**](ContentManagementApi.md#getShares) | **GET** api/v2/contentmanagement/shares | Gets a list of shares.  You must specify at least one filter (e.g. entityId).
[**getSharesShareId**](ContentManagementApi.md#getSharesShareId) | **GET** api/v2/contentmanagement/shares/{shareId} | Retrieve details about an existing share.
[**getStatus**](ContentManagementApi.md#getStatus) | **GET** api/v2/contentmanagement/status | Get a list of statuses for pending operations
[**getStatusStatusId**](ContentManagementApi.md#getStatusStatusId) | **GET** api/v2/contentmanagement/status/{statusId} | Get a status.
[**getUsage**](ContentManagementApi.md#getUsage) | **GET** api/v2/contentmanagement/usage | Get usage details.
[**getWorkspaces**](ContentManagementApi.md#getWorkspaces) | **GET** api/v2/contentmanagement/workspaces | Get a list of workspaces.
[**getWorkspacesWorkspaceId**](ContentManagementApi.md#getWorkspacesWorkspaceId) | **GET** api/v2/contentmanagement/workspaces/{workspaceId} | Get a workspace.
[**getWorkspacesWorkspaceIdMembers**](ContentManagementApi.md#getWorkspacesWorkspaceIdMembers) | **GET** api/v2/contentmanagement/workspaces/{workspaceId}/members | Get a list workspace members
[**getWorkspacesWorkspaceIdMembersMemberId**](ContentManagementApi.md#getWorkspacesWorkspaceIdMembersMemberId) | **GET** api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Get a workspace member
[**getWorkspacesWorkspaceIdTagvalues**](ContentManagementApi.md#getWorkspacesWorkspaceIdTagvalues) | **GET** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues | Get a list of workspace tags
[**getWorkspacesWorkspaceIdTagvaluesTagId**](ContentManagementApi.md#getWorkspacesWorkspaceIdTagvaluesTagId) | **GET** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Get a workspace tag
[**postAuditquery**](ContentManagementApi.md#postAuditquery) | **POST** api/v2/contentmanagement/auditquery | Query audits
[**postDocuments**](ContentManagementApi.md#postDocuments) | **POST** api/v2/contentmanagement/documents | Add a document.
[**postDocumentsDocumentId**](ContentManagementApi.md#postDocumentsDocumentId) | **POST** api/v2/contentmanagement/documents/{documentId} | Update a document.
[**postDocumentsDocumentIdContent**](ContentManagementApi.md#postDocumentsDocumentIdContent) | **POST** api/v2/contentmanagement/documents/{documentId}/content | Replace the contents of a document.
[**postQuery**](ContentManagementApi.md#postQuery) | **POST** api/v2/contentmanagement/query | Query content
[**postShares**](ContentManagementApi.md#postShares) | **POST** api/v2/contentmanagement/shares | Creates a new share or updates an existing share if the entity has already been shared
[**postWorkspaces**](ContentManagementApi.md#postWorkspaces) | **POST** api/v2/contentmanagement/workspaces | Create a group workspace
[**postWorkspacesWorkspaceIdTagvalues**](ContentManagementApi.md#postWorkspacesWorkspaceIdTagvalues) | **POST** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues | Create a workspace tag
[**postWorkspacesWorkspaceIdTagvaluesQuery**](ContentManagementApi.md#postWorkspacesWorkspaceIdTagvaluesQuery) | **POST** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/query | Perform a prefix query on tags in the workspace
[**putWorkspacesWorkspaceId**](ContentManagementApi.md#putWorkspacesWorkspaceId) | **PUT** api/v2/contentmanagement/workspaces/{workspaceId} | Update a workspace
[**putWorkspacesWorkspaceIdMembersMemberId**](ContentManagementApi.md#putWorkspacesWorkspaceIdMembersMemberId) | **PUT** api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId} | Add a member to a workspace
[**putWorkspacesWorkspaceIdTagvaluesTagId**](ContentManagementApi.md#putWorkspacesWorkspaceIdTagvaluesTagId) | **PUT** api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId} | Update a workspace tag. Will update all documents with the new tag value.


<a name="deleteDocumentsDocumentId"></a>
# **deleteDocumentsDocumentId**
> Void deleteDocumentsDocumentId(documentId, override)

Delete a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
Boolean override = true; // Boolean | Override any lock on the document
try {
    Void result = apiInstance.deleteDocumentsDocumentId(documentId, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **override** | **Boolean**| Override any lock on the document | [optional]

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSharesShareId"></a>
# **deleteSharesShareId**
> Void deleteSharesShareId(shareId)

Deletes an existing share.

This revokes sharing rights specified in the share record

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String shareId = "shareId_example"; // String | Share ID
try {
    Void result = apiInstance.deleteSharesShareId(shareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteSharesShareId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareId** | **String**| Share ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStatusStatusId"></a>
# **deleteStatusStatusId**
> Void deleteStatusStatusId(statusId)

Cancel the command for this status



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String statusId = "statusId_example"; // String | Status ID
try {
    Void result = apiInstance.deleteStatusStatusId(statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteStatusStatusId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusId** | **String**| Status ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkspacesWorkspaceId"></a>
# **deleteWorkspacesWorkspaceId**
> Void deleteWorkspacesWorkspaceId(workspaceId, moveChildrenToWorkspaceId)

Delete a workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String moveChildrenToWorkspaceId = "moveChildrenToWorkspaceId_example"; // String | New location for objects in deleted workspace.
try {
    Void result = apiInstance.deleteWorkspacesWorkspaceId(workspaceId, moveChildrenToWorkspaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteWorkspacesWorkspaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **moveChildrenToWorkspaceId** | **String**| New location for objects in deleted workspace. | [optional]

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkspacesWorkspaceIdMembersMemberId"></a>
# **deleteWorkspacesWorkspaceIdMembersMemberId**
> Void deleteWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId)

Delete a member from a workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
try {
    Void result = apiInstance.deleteWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteWorkspacesWorkspaceIdMembersMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **memberId** | **String**| Member ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkspacesWorkspaceIdTagvaluesTagId"></a>
# **deleteWorkspacesWorkspaceIdTagvaluesTagId**
> Void deleteWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId)

Delete workspace tag

Delete a tag from a workspace. Will remove this tag from all documents.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
try {
    Void result = apiInstance.deleteWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#deleteWorkspacesWorkspaceIdTagvaluesTagId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **tagId** | **String**| Tag ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> DocumentEntityListing getDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder)

Get a list of documents.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String name = "name_example"; // String | Name
String expand = "expand_example"; // String | Expand some document fields
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | name or dateCreated
String sortOrder = "ascending"; // String | ascending or descending
try {
    DocumentEntityListing result = apiInstance.getDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **name** | **String**| Name | [optional]
 **expand** | **String**| Expand some document fields | [optional] [enum: acl, workspace]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| name or dateCreated | [optional]
 **sortOrder** | **String**| ascending or descending | [optional] [default to ascending]

### Return type

[**DocumentEntityListing**](DocumentEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentsDocumentId"></a>
# **getDocumentsDocumentId**
> Document getDocumentsDocumentId(documentId, expand)

Get a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
String expand = "expand_example"; // String | Expand some document fields
try {
    Document result = apiInstance.getDocumentsDocumentId(documentId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **expand** | **String**| Expand some document fields | [optional] [enum: lockInfo, acl, workspace]

### Return type

[**Document**](Document.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentsDocumentIdAudits"></a>
# **getDocumentsDocumentIdAudits**
> DocumentAuditEntityListing getDocumentsDocumentIdAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder)

Get a list of audits for a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String transactionFilter = "transactionFilter_example"; // String | Transaction filter
String level = "USER"; // String | level
String sortBy = "sortBy_example"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
try {
    DocumentAuditEntityListing result = apiInstance.getDocumentsDocumentIdAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getDocumentsDocumentIdAudits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **transactionFilter** | **String**| Transaction filter | [optional]
 **level** | **String**| level | [optional] [default to USER]
 **sortBy** | **String**| Sort by | [optional]
 **sortOrder** | **String**| Sort order | [optional] [default to ascending]

### Return type

[**DocumentAuditEntityListing**](DocumentAuditEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentsDocumentIdContent"></a>
# **getDocumentsDocumentIdContent**
> DownloadResponse getDocumentsDocumentIdContent(documentId, disposition, contentType)

Download a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
String disposition = "disposition_example"; // String | Request how the content will be downloaded: attached as a file or inline. Default is attachment.
String contentType = "contentType_example"; // String | The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav
try {
    DownloadResponse result = apiInstance.getDocumentsDocumentIdContent(documentId, disposition, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getDocumentsDocumentIdContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **disposition** | **String**| Request how the content will be downloaded: attached as a file or inline. Default is attachment. | [optional] [enum: attachment, inline]
 **contentType** | **String**| The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav | [optional]

### Return type

[**DownloadResponse**](DownloadResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> QueryResults getQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand)

Query content



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String queryPhrase = "queryPhrase_example"; // String | Phrase tokens are ANDed together over all searchable fields
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | name or dateCreated
String sortOrder = "ascending"; // String | ascending or descending
String expand = "expand_example"; // String | Expand some document fields
try {
    QueryResults result = apiInstance.getQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryPhrase** | **String**| Phrase tokens are ANDed together over all searchable fields |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| name or dateCreated | [optional] [default to name]
 **sortOrder** | **String**| ascending or descending | [optional] [default to ascending]
 **expand** | **String**| Expand some document fields | [optional] [enum: acl, workspace]

### Return type

[**QueryResults**](QueryResults.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityprofiles"></a>
# **getSecurityprofiles**
> SecurityProfileEntityListing getSecurityprofiles()

Get a List of Security Profiles



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
try {
    SecurityProfileEntityListing result = apiInstance.getSecurityprofiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getSecurityprofiles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecurityProfileEntityListing**](SecurityProfileEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityprofilesSecurityprofileId"></a>
# **getSecurityprofilesSecurityprofileId**
> SecurityProfile getSecurityprofilesSecurityprofileId(securityProfileId)

Get a Security Profile



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String securityProfileId = "securityProfileId_example"; // String | Security Profile Id
try {
    SecurityProfile result = apiInstance.getSecurityprofilesSecurityprofileId(securityProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getSecurityprofilesSecurityprofileId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityProfileId** | **String**| Security Profile Id |

### Return type

[**SecurityProfile**](SecurityProfile.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSharedSharedId"></a>
# **getSharedSharedId**
> Void getSharedSharedId(sharedId, redirect, disposition, contentType, expand)

Get shared documents. Securely download a shared document.

This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String sharedId = "sharedId_example"; // String | Shared ID
Boolean redirect = true; // Boolean | Turn on or off redirect
String disposition = "attachment"; // String | Request how the share content will be downloaded: attached as a file or inline. Default is attachment.
String contentType = "contentType_example"; // String | The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav
String expand = "expand_example"; // String | Expand some document fields
try {
    Void result = apiInstance.getSharedSharedId(sharedId, redirect, disposition, contentType, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getSharedSharedId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sharedId** | **String**| Shared ID |
 **redirect** | **Boolean**| Turn on or off redirect | [optional] [default to true]
 **disposition** | **String**| Request how the share content will be downloaded: attached as a file or inline. Default is attachment. | [optional] [default to attachment] [enum: attachment, inline, none]
 **contentType** | **String**| The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav | [optional]
 **expand** | **String**| Expand some document fields | [optional] [enum: document.acl]

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShares"></a>
# **getShares**
> ShareEntityListing getShares(entityId, expand, pageSize, pageNumber)

Gets a list of shares.  You must specify at least one filter (e.g. entityId).

Failing to specify a filter will return 400.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String entityId = "entityId_example"; // String | Filters the shares returned to only the entity specified by the value of this parameter.
String expand = "expand_example"; // String | Expand share fields
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ShareEntityListing result = apiInstance.getShares(entityId, expand, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| Filters the shares returned to only the entity specified by the value of this parameter. | [optional]
 **expand** | **String**| Expand share fields | [optional] [enum: member]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**ShareEntityListing**](ShareEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSharesShareId"></a>
# **getSharesShareId**
> Share getSharesShareId(shareId, expand)

Retrieve details about an existing share.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String shareId = "shareId_example"; // String | Share ID
String expand = "expand_example"; // String | Expand share fields
try {
    Share result = apiInstance.getSharesShareId(shareId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getSharesShareId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareId** | **String**| Share ID |
 **expand** | **String**| Expand share fields | [optional] [enum: member]

### Return type

[**Share**](Share.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> CommandStatusEntityListing getStatus(pageSize, pageNumber)

Get a list of statuses for pending operations



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    CommandStatusEntityListing result = apiInstance.getStatus(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**CommandStatusEntityListing**](CommandStatusEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatusStatusId"></a>
# **getStatusStatusId**
> CommandStatus getStatusStatusId(statusId)

Get a status.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String statusId = "statusId_example"; // String | Status ID
try {
    CommandStatus result = apiInstance.getStatusStatusId(statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getStatusStatusId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statusId** | **String**| Status ID |

### Return type

[**CommandStatus**](CommandStatus.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsage"></a>
# **getUsage**
> Usage getUsage()

Get usage details.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
try {
    Usage result = apiInstance.getUsage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getUsage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Usage**](Usage.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspaces"></a>
# **getWorkspaces**
> WorkspaceEntityListing getWorkspaces(pageSize, pageNumber, access, expand)

Get a list of workspaces.

Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String access = "document:viewmetadata"; // String | Requested access level
String expand = "expand_example"; // String | Expand some workspace fields
try {
    WorkspaceEntityListing result = apiInstance.getWorkspaces(pageSize, pageNumber, access, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **access** | **String**| Requested access level | [optional] [default to document:viewmetadata] [enum: content, admin, document:create, document:viewContent, document:viewMetadata, document:download, document:delete, document:update, document:share, document:shareView, document:email, document:print, document:auditView, document:replace, document:tag, tag:create, tag:view, tag:update, tag:apply, tag:remove, tag:delete]
 **expand** | **String**| Expand some workspace fields | [optional] [enum: summary, acl]

### Return type

[**WorkspaceEntityListing**](WorkspaceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspacesWorkspaceId"></a>
# **getWorkspacesWorkspaceId**
> Workspace getWorkspacesWorkspaceId(workspaceId, expand)

Get a workspace.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String expand = "expand_example"; // String | Expand some workspace fields
try {
    Workspace result = apiInstance.getWorkspacesWorkspaceId(workspaceId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspacesWorkspaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **expand** | **String**| Expand some workspace fields | [optional] [enum: summary, acl]

### Return type

[**Workspace**](Workspace.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspacesWorkspaceIdMembers"></a>
# **getWorkspacesWorkspaceIdMembers**
> WorkspaceMemberEntityListing getWorkspacesWorkspaceIdMembers(workspaceId, pageSize, pageNumber, expand)

Get a list workspace members



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand workspace member fields
try {
    WorkspaceMemberEntityListing result = apiInstance.getWorkspacesWorkspaceIdMembers(workspaceId, pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspacesWorkspaceIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **expand** | **String**| Expand workspace member fields | [optional] [enum: member]

### Return type

[**WorkspaceMemberEntityListing**](WorkspaceMemberEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspacesWorkspaceIdMembersMemberId"></a>
# **getWorkspacesWorkspaceIdMembersMemberId**
> WorkspaceMember getWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, expand)

Get a workspace member



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
String expand = "expand_example"; // String | Expand workspace member fields
try {
    WorkspaceMember result = apiInstance.getWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspacesWorkspaceIdMembersMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **memberId** | **String**| Member ID |
 **expand** | **String**| Expand workspace member fields | [optional] [enum: member]

### Return type

[**WorkspaceMember**](WorkspaceMember.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspacesWorkspaceIdTagvalues"></a>
# **getWorkspacesWorkspaceIdTagvalues**
> TagValueEntityListing getWorkspacesWorkspaceIdTagvalues(workspaceId, value, pageSize, pageNumber, expand)

Get a list of workspace tags



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String value = "value_example"; // String | filter the list of tags returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand some document fields
try {
    TagValueEntityListing result = apiInstance.getWorkspacesWorkspaceIdTagvalues(workspaceId, value, pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspacesWorkspaceIdTagvalues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **value** | **String**| filter the list of tags returned | [optional]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **expand** | **String**| Expand some document fields | [optional] [enum: acl]

### Return type

[**TagValueEntityListing**](TagValueEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkspacesWorkspaceIdTagvaluesTagId"></a>
# **getWorkspacesWorkspaceIdTagvaluesTagId**
> TagValue getWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, expand)

Get a workspace tag



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
String expand = "expand_example"; // String | Expand some document fields
try {
    TagValue result = apiInstance.getWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#getWorkspacesWorkspaceIdTagvaluesTagId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **tagId** | **String**| Tag ID |
 **expand** | **String**| Expand some document fields | [optional] [enum: acl]

### Return type

[**TagValue**](TagValue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAuditquery"></a>
# **postAuditquery**
> QueryResults postAuditquery(body)

Query audits



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
ContentQueryRequest body = new ContentQueryRequest(); // ContentQueryRequest | Allows for a filtered query returning facet information
try {
    QueryResults result = apiInstance.postAuditquery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postAuditquery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentQueryRequest**](ContentQueryRequest.md)| Allows for a filtered query returning facet information |

### Return type

[**QueryResults**](QueryResults.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocuments"></a>
# **postDocuments**
> Document postDocuments(body, copySource, moveSource, override)

Add a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
DocumentUpload body = new DocumentUpload(); // DocumentUpload | Document
String copySource = "copySource_example"; // String | Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source.
String moveSource = "moveSource_example"; // String | Move a document to a new workspace. Provide a document ID as the move source.
Boolean override = true; // Boolean | Override any lock on the source document
try {
    Document result = apiInstance.postDocuments(body, copySource, moveSource, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocumentUpload**](DocumentUpload.md)| Document |
 **copySource** | **String**| Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. | [optional]
 **moveSource** | **String**| Move a document to a new workspace. Provide a document ID as the move source. | [optional]
 **override** | **Boolean**| Override any lock on the source document | [optional]

### Return type

[**Document**](Document.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentsDocumentId"></a>
# **postDocumentsDocumentId**
> Document postDocumentsDocumentId(documentId, body, expand, override)

Update a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
DocumentUpdate body = new DocumentUpdate(); // DocumentUpdate | Document
String expand = "expand_example"; // String | Expand some document fields
Boolean override = true; // Boolean | Override any lock on the document
try {
    Document result = apiInstance.postDocumentsDocumentId(documentId, body, expand, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postDocumentsDocumentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **body** | [**DocumentUpdate**](DocumentUpdate.md)| Document |
 **expand** | **String**| Expand some document fields | [optional] [enum: acl]
 **override** | **Boolean**| Override any lock on the document | [optional]

### Return type

[**Document**](Document.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentsDocumentIdContent"></a>
# **postDocumentsDocumentIdContent**
> ReplaceResponse postDocumentsDocumentIdContent(documentId, body, override)

Replace the contents of a document.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String documentId = "documentId_example"; // String | Document ID
ReplaceRequest body = new ReplaceRequest(); // ReplaceRequest | Replace Request
Boolean override = true; // Boolean | Override any lock on the document
try {
    ReplaceResponse result = apiInstance.postDocumentsDocumentIdContent(documentId, body, override);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postDocumentsDocumentIdContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document ID |
 **body** | [**ReplaceRequest**](ReplaceRequest.md)| Replace Request |
 **override** | **Boolean**| Override any lock on the document | [optional]

### Return type

[**ReplaceResponse**](ReplaceResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQuery"></a>
# **postQuery**
> QueryResults postQuery(body, expand)

Query content



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
QueryRequest body = new QueryRequest(); // QueryRequest | Allows for a filtered query returning facet information
String expand = "expand_example"; // String | Expand some document fields
try {
    QueryResults result = apiInstance.postQuery(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryRequest**](QueryRequest.md)| Allows for a filtered query returning facet information |
 **expand** | **String**| Expand some document fields | [optional] [enum: acl, workspace]

### Return type

[**QueryResults**](QueryResults.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postShares"></a>
# **postShares**
> CreateShareResponse postShares(body)

Creates a new share or updates an existing share if the entity has already been shared



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
CreateShareRequest body = new CreateShareRequest(); // CreateShareRequest | CreateShareRequest - entity id and type and a single member or list of members are required
try {
    CreateShareResponse result = apiInstance.postShares(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateShareRequest**](CreateShareRequest.md)| CreateShareRequest - entity id and type and a single member or list of members are required |

### Return type

[**CreateShareResponse**](CreateShareResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWorkspaces"></a>
# **postWorkspaces**
> Workspace postWorkspaces(body)

Create a group workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
WorkspaceCreate body = new WorkspaceCreate(); // WorkspaceCreate | Workspace
try {
    Workspace result = apiInstance.postWorkspaces(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postWorkspaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkspaceCreate**](WorkspaceCreate.md)| Workspace |

### Return type

[**Workspace**](Workspace.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWorkspacesWorkspaceIdTagvalues"></a>
# **postWorkspacesWorkspaceIdTagvalues**
> TagValue postWorkspacesWorkspaceIdTagvalues(workspaceId, body)

Create a workspace tag



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
TagValue body = new TagValue(); // TagValue | tag
try {
    TagValue result = apiInstance.postWorkspacesWorkspaceIdTagvalues(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postWorkspacesWorkspaceIdTagvalues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **body** | [**TagValue**](TagValue.md)| tag |

### Return type

[**TagValue**](TagValue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWorkspacesWorkspaceIdTagvaluesQuery"></a>
# **postWorkspacesWorkspaceIdTagvaluesQuery**
> TagValueEntityListing postWorkspacesWorkspaceIdTagvaluesQuery(workspaceId, body, expand)

Perform a prefix query on tags in the workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
TagQueryRequest body = new TagQueryRequest(); // TagQueryRequest | query
String expand = "expand_example"; // String | Expand some document fields
try {
    TagValueEntityListing result = apiInstance.postWorkspacesWorkspaceIdTagvaluesQuery(workspaceId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#postWorkspacesWorkspaceIdTagvaluesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **body** | [**TagQueryRequest**](TagQueryRequest.md)| query |
 **expand** | **String**| Expand some document fields | [optional] [enum: acl]

### Return type

[**TagValueEntityListing**](TagValueEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWorkspacesWorkspaceId"></a>
# **putWorkspacesWorkspaceId**
> Workspace putWorkspacesWorkspaceId(workspaceId, body)

Update a workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
Workspace body = new Workspace(); // Workspace | Workspace
try {
    Workspace result = apiInstance.putWorkspacesWorkspaceId(workspaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putWorkspacesWorkspaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **body** | [**Workspace**](Workspace.md)| Workspace |

### Return type

[**Workspace**](Workspace.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWorkspacesWorkspaceIdMembersMemberId"></a>
# **putWorkspacesWorkspaceIdMembersMemberId**
> WorkspaceMember putWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, body)

Add a member to a workspace



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String memberId = "memberId_example"; // String | Member ID
WorkspaceMember body = new WorkspaceMember(); // WorkspaceMember | Workspace
try {
    WorkspaceMember result = apiInstance.putWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putWorkspacesWorkspaceIdMembersMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **memberId** | **String**| Member ID |
 **body** | [**WorkspaceMember**](WorkspaceMember.md)| Workspace |

### Return type

[**WorkspaceMember**](WorkspaceMember.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWorkspacesWorkspaceIdTagvaluesTagId"></a>
# **putWorkspacesWorkspaceIdTagvaluesTagId**
> TagValue putWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, body)

Update a workspace tag. Will update all documents with the new tag value.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.ContentManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ContentManagementApi apiInstance = new ContentManagementApi();
String workspaceId = "workspaceId_example"; // String | Workspace ID
String tagId = "tagId_example"; // String | Tag ID
TagValue body = new TagValue(); // TagValue | Workspace
try {
    TagValue result = apiInstance.putWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentManagementApi#putWorkspacesWorkspaceIdTagvaluesTagId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **tagId** | **String**| Tag ID |
 **body** | [**TagValue**](TagValue.md)| Workspace |

### Return type

[**TagValue**](TagValue.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

