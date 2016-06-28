package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.DocumentEntityListing;
import io.swagger.client.model.Document;
import io.swagger.client.model.DocumentAuditEntityListing;
import io.swagger.client.model.QueryResults;
import io.swagger.client.model.SecurityProfileEntityListing;
import io.swagger.client.model.SecurityProfile;
import io.swagger.client.model.ShareEntityListing;
import io.swagger.client.model.Share;
import io.swagger.client.model.CommandStatusEntityListing;
import io.swagger.client.model.CommandStatus;
import io.swagger.client.model.Usage;
import io.swagger.client.model.WorkspaceEntityListing;
import io.swagger.client.model.Workspace;
import io.swagger.client.model.WorkspaceMemberEntityListing;
import io.swagger.client.model.WorkspaceMember;
import io.swagger.client.model.TagValueEntityListing;
import io.swagger.client.model.TagValue;
import io.swagger.client.model.ContentQueryRequest;
import io.swagger.client.model.DocumentUpload;
import io.swagger.client.model.DocumentUpdate;
import io.swagger.client.model.ReplaceRequest;
import io.swagger.client.model.ReplaceResponse;
import io.swagger.client.model.QueryRequest;
import io.swagger.client.model.CreateShareRequest;
import io.swagger.client.model.CreateShareResponse;
import io.swagger.client.model.WorkspaceCreate;
import io.swagger.client.model.TagQueryRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContentManagementApi {
  /**
   * Delete a document.
   * 
   * @param documentId Document ID (required)
   * @param override Override any lock on the document (optional)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/documents/{documentId}")
  Call<Void> deleteContentmanagementDocumentsDocumentId(
    @Path("documentId") String documentId, @Query("override") Boolean override
  );

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param shareId Share ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/shares/{shareId}")
  Call<Void> deleteContentmanagementSharesShareId(
    @Path("shareId") String shareId
  );

  /**
   * Cancel the command for this status
   * 
   * @param statusId Status ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/status/{statusId}")
  Call<Void> deleteContentmanagementStatusStatusId(
    @Path("statusId") String statusId
  );

  /**
   * Delete a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param moveChildrenToWorkspaceId New location for objects in deleted workspace. (optional)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/workspaces/{workspaceId}")
  Call<Void> deleteContentmanagementWorkspacesWorkspaceId(
    @Path("workspaceId") String workspaceId, @Query("moveChildrenToWorkspaceId") String moveChildrenToWorkspaceId
  );

  /**
   * Delete a member from a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}")
  Call<Void> deleteContentmanagementWorkspacesWorkspaceIdMembersMemberId(
    @Path("workspaceId") String workspaceId, @Path("memberId") String memberId
  );

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}")
  Call<Void> deleteContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(
    @Path("workspaceId") String workspaceId, @Path("tagId") String tagId
  );

  /**
   * Get a list of documents.
   * 
   * @param workspaceId Workspace ID (required)
   * @param name Name (optional)
   * @param expand Expand some document fields (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @return Call<DocumentEntityListing>
   */
  
  @GET("api/v2/contentmanagement/documents")
  Call<DocumentEntityListing> getContentmanagementDocuments(
    @Query("workspaceId") String workspaceId, @Query("name") String name, @Query("expand") String expand, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @param expand Expand some document fields (optional)
   * @return Call<Document>
   */
  
  @GET("api/v2/contentmanagement/documents/{documentId}")
  Call<Document> getContentmanagementDocumentsDocumentId(
    @Path("documentId") String documentId, @Query("expand") String expand
  );

  /**
   * Get a list of audits for a document.
   * 
   * @param documentId Document ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param transactionFilter Transaction filter (optional)
   * @param level level (optional, default to USER)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return Call<DocumentAuditEntityListing>
   */
  
  @GET("api/v2/contentmanagement/documents/{documentId}/audits")
  Call<DocumentAuditEntityListing> getContentmanagementDocumentsDocumentIdAudits(
    @Path("documentId") String documentId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("transactionFilter") String transactionFilter, @Query("level") String level, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Download a document.
   * 
   * @param documentId Document ID (required)
   * @param disposition Request how the content will be downloaded: attached as a file or inline. Default is attachment. (optional)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @return Call<Void>
   */
  
  @GET("api/v2/contentmanagement/documents/{documentId}/content")
  Call<Void> getContentmanagementDocumentsDocumentIdContent(
    @Path("documentId") String documentId, @Query("disposition") String disposition, @Query("contentType") String contentType
  );

  /**
   * Query content
   * 
   * @param queryPhrase Phrase tokens are ANDed together over all searchable fields (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional, default to name)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @param expand Expand some document fields (optional)
   * @return Call<QueryResults>
   */
  
  @GET("api/v2/contentmanagement/query")
  Call<QueryResults> getContentmanagementQuery(
    @Query("queryPhrase") String queryPhrase, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("expand") String expand
  );

  /**
   * Get a List of Security Profiles
   * 
   * @return Call<SecurityProfileEntityListing>
   */
  
  @GET("api/v2/contentmanagement/securityprofiles")
  Call<SecurityProfileEntityListing> getContentmanagementSecurityprofiles();
    

  /**
   * Get a Security Profile
   * 
   * @param securityProfileId Security Profile Id (required)
   * @return Call<SecurityProfile>
   */
  
  @GET("api/v2/contentmanagement/securityprofiles/{securityProfileId}")
  Call<SecurityProfile> getContentmanagementSecurityprofilesSecurityprofileId(
    @Path("securityProfileId") String securityProfileId
  );

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param sharedId Shared ID (required)
   * @param redirect Turn on or off redirect (optional, default to true)
   * @param disposition Request how the share content will be downloaded: attached as a file or inline. Default is attachment. (optional, default to attachment)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @param expand Expand some document fields (optional)
   * @return Call<Void>
   */
  
  @GET("api/v2/contentmanagement/shared/{sharedId}")
  Call<Void> getContentmanagementSharedSharedId(
    @Path("sharedId") String sharedId, @Query("redirect") Boolean redirect, @Query("disposition") String disposition, @Query("contentType") String contentType, @Query("expand") String expand
  );

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param entityId Filters the shares returned to only the entity specified by the value of this parameter. (optional)
   * @param expand Expand share fields (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<ShareEntityListing>
   */
  
  @GET("api/v2/contentmanagement/shares")
  Call<ShareEntityListing> getContentmanagementShares(
    @Query("entityId") String entityId, @Query("expand") String expand, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Retrieve details about an existing share.
   * 
   * @param shareId Share ID (required)
   * @param expand Expand share fields (optional)
   * @return Call<Share>
   */
  
  @GET("api/v2/contentmanagement/shares/{shareId}")
  Call<Share> getContentmanagementSharesShareId(
    @Path("shareId") String shareId, @Query("expand") String expand
  );

  /**
   * Get a list of statuses for pending operations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<CommandStatusEntityListing>
   */
  
  @GET("api/v2/contentmanagement/status")
  Call<CommandStatusEntityListing> getContentmanagementStatus(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a status.
   * 
   * @param statusId Status ID (required)
   * @return Call<CommandStatus>
   */
  
  @GET("api/v2/contentmanagement/status/{statusId}")
  Call<CommandStatus> getContentmanagementStatusStatusId(
    @Path("statusId") String statusId
  );

  /**
   * Get usage details.
   * 
   * @return Call<Usage>
   */
  
  @GET("api/v2/contentmanagement/usage")
  Call<Usage> getContentmanagementUsage();
    

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param access Requested access level (optional, default to document:viewmetadata)
   * @param expand Expand some workspace fields (optional)
   * @return Call<WorkspaceEntityListing>
   */
  
  @GET("api/v2/contentmanagement/workspaces")
  Call<WorkspaceEntityListing> getContentmanagementWorkspaces(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("access") String access, @Query("expand") String expand
  );

  /**
   * Get a workspace.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Expand some workspace fields (optional)
   * @return Call<Workspace>
   */
  
  @GET("api/v2/contentmanagement/workspaces/{workspaceId}")
  Call<Workspace> getContentmanagementWorkspacesWorkspaceId(
    @Path("workspaceId") String workspaceId, @Query("expand") String expand
  );

  /**
   * Get a list workspace members
   * 
   * @param workspaceId Workspace ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand workspace member fields (optional)
   * @return Call<WorkspaceMemberEntityListing>
   */
  
  @GET("api/v2/contentmanagement/workspaces/{workspaceId}/members")
  Call<WorkspaceMemberEntityListing> getContentmanagementWorkspacesWorkspaceIdMembers(
    @Path("workspaceId") String workspaceId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("expand") String expand
  );

  /**
   * Get a workspace member
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param expand Expand workspace member fields (optional)
   * @return Call<WorkspaceMember>
   */
  
  @GET("api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}")
  Call<WorkspaceMember> getContentmanagementWorkspacesWorkspaceIdMembersMemberId(
    @Path("workspaceId") String workspaceId, @Path("memberId") String memberId, @Query("expand") String expand
  );

  /**
   * Get a list of workspace tags
   * 
   * @param workspaceId Workspace ID (required)
   * @param value filter the list of tags returned (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand some document fields (optional)
   * @return Call<TagValueEntityListing>
   */
  
  @GET("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues")
  Call<TagValueEntityListing> getContentmanagementWorkspacesWorkspaceIdTagvalues(
    @Path("workspaceId") String workspaceId, @Query("value") String value, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("expand") String expand
  );

  /**
   * Get a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param expand Expand some document fields (optional)
   * @return Call<TagValue>
   */
  
  @GET("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}")
  Call<TagValue> getContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(
    @Path("workspaceId") String workspaceId, @Path("tagId") String tagId, @Query("expand") String expand
  );

  /**
   * Query audits
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @return Call<QueryResults>
   */
  
  @POST("api/v2/contentmanagement/auditquery")
  Call<QueryResults> postContentmanagementAuditquery(
    @Body ContentQueryRequest body
  );

  /**
   * Add a document.
   * 
   * @param body Document (optional)
   * @param copySource Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. (optional)
   * @param moveSource Move a document to a new workspace. Provide a document ID as the move source. (optional)
   * @param override Override any lock on the source document (optional)
   * @return Call<Document>
   */
  
  @POST("api/v2/contentmanagement/documents")
  Call<Document> postContentmanagementDocuments(
    @Body DocumentUpload body, @Query("copySource") String copySource, @Query("moveSource") String moveSource, @Query("override") Boolean override
  );

  /**
   * Update a document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (optional)
   * @param expand Expand some document fields (optional)
   * @param override Override any lock on the document (optional)
   * @return Call<Document>
   */
  
  @POST("api/v2/contentmanagement/documents/{documentId}")
  Call<Document> postContentmanagementDocumentsDocumentId(
    @Path("documentId") String documentId, @Body DocumentUpdate body, @Query("expand") String expand, @Query("override") Boolean override
  );

  /**
   * Replace the contents of a document.
   * 
   * @param documentId Document ID (required)
   * @param body Replace Request (optional)
   * @param override Override any lock on the document (optional)
   * @return Call<ReplaceResponse>
   */
  
  @POST("api/v2/contentmanagement/documents/{documentId}/content")
  Call<ReplaceResponse> postContentmanagementDocumentsDocumentIdContent(
    @Path("documentId") String documentId, @Body ReplaceRequest body, @Query("override") Boolean override
  );

  /**
   * Query content
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @param expand Expand some document fields (optional)
   * @return Call<QueryResults>
   */
  
  @POST("api/v2/contentmanagement/query")
  Call<QueryResults> postContentmanagementQuery(
    @Body QueryRequest body, @Query("expand") String expand
  );

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param body CreateShareRequest - entity id and type and a single member or list of members are required (optional)
   * @return Call<CreateShareResponse>
   */
  
  @POST("api/v2/contentmanagement/shares")
  Call<CreateShareResponse> postContentmanagementShares(
    @Body CreateShareRequest body
  );

  /**
   * Create a group workspace
   * 
   * @param body Workspace (optional)
   * @return Call<Workspace>
   */
  
  @POST("api/v2/contentmanagement/workspaces")
  Call<Workspace> postContentmanagementWorkspaces(
    @Body WorkspaceCreate body
  );

  /**
   * Create a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param body tag (optional)
   * @return Call<TagValue>
   */
  
  @POST("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues")
  Call<TagValue> postContentmanagementWorkspacesWorkspaceIdTagvalues(
    @Path("workspaceId") String workspaceId, @Body TagValue body
  );

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body query (optional)
   * @param expand Expand some document fields (optional)
   * @return Call<TagValueEntityListing>
   */
  
  @POST("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/query")
  Call<TagValueEntityListing> postContentmanagementWorkspacesWorkspaceIdTagvaluesQuery(
    @Path("workspaceId") String workspaceId, @Body TagQueryRequest body, @Query("expand") String expand
  );

  /**
   * Update a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body Workspace (optional)
   * @return Call<Workspace>
   */
  
  @PUT("api/v2/contentmanagement/workspaces/{workspaceId}")
  Call<Workspace> putContentmanagementWorkspacesWorkspaceId(
    @Path("workspaceId") String workspaceId, @Body Workspace body
  );

  /**
   * Add a member to a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param body Workspace (optional)
   * @return Call<WorkspaceMember>
   */
  
  @PUT("api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}")
  Call<WorkspaceMember> putContentmanagementWorkspacesWorkspaceIdMembersMemberId(
    @Path("workspaceId") String workspaceId, @Path("memberId") String memberId, @Body WorkspaceMember body
  );

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param body Workspace (optional)
   * @return Call<TagValue>
   */
  
  @PUT("api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}")
  Call<TagValue> putContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(
    @Path("workspaceId") String workspaceId, @Path("tagId") String tagId, @Body TagValue body
  );

}
