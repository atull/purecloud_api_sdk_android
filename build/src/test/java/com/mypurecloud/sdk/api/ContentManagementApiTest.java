package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.DocumentEntityListing;
import com.mypurecloud.sdk.model.Document;
import com.mypurecloud.sdk.model.DocumentAuditEntityListing;
import com.mypurecloud.sdk.model.DownloadResponse;
import com.mypurecloud.sdk.model.QueryResults;
import com.mypurecloud.sdk.model.SecurityProfileEntityListing;
import com.mypurecloud.sdk.model.SecurityProfile;
import com.mypurecloud.sdk.model.ShareEntityListing;
import com.mypurecloud.sdk.model.Share;
import com.mypurecloud.sdk.model.CommandStatusEntityListing;
import com.mypurecloud.sdk.model.CommandStatus;
import com.mypurecloud.sdk.model.Usage;
import com.mypurecloud.sdk.model.WorkspaceEntityListing;
import com.mypurecloud.sdk.model.Workspace;
import com.mypurecloud.sdk.model.WorkspaceMemberEntityListing;
import com.mypurecloud.sdk.model.WorkspaceMember;
import com.mypurecloud.sdk.model.TagValueEntityListing;
import com.mypurecloud.sdk.model.TagValue;
import com.mypurecloud.sdk.model.ContentQueryRequest;
import com.mypurecloud.sdk.model.DocumentUpload;
import com.mypurecloud.sdk.model.DocumentUpdate;
import com.mypurecloud.sdk.model.ReplaceRequest;
import com.mypurecloud.sdk.model.ReplaceResponse;
import com.mypurecloud.sdk.model.QueryRequest;
import com.mypurecloud.sdk.model.CreateShareRequest;
import com.mypurecloud.sdk.model.CreateShareResponse;
import com.mypurecloud.sdk.model.WorkspaceCreate;
import com.mypurecloud.sdk.model.TagQueryRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentManagementApi
 */
public class ContentManagementApiTest {

    private ContentManagementApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContentManagementApi.class);
    }

    
    /**
     * Delete a document.
     *
     * 
     */
    @Test
    public void deleteDocumentsDocumentIdTest() {
        String documentId = null;
        Boolean override = null;
        // Void response = api.deleteDocumentsDocumentId(documentId, override);

        // TODO: test validations
    }
    
    /**
     * Deletes an existing share.
     *
     * This revokes sharing rights specified in the share record
     */
    @Test
    public void deleteSharesShareIdTest() {
        String shareId = null;
        // Void response = api.deleteSharesShareId(shareId);

        // TODO: test validations
    }
    
    /**
     * Cancel the command for this status
     *
     * 
     */
    @Test
    public void deleteStatusStatusIdTest() {
        String statusId = null;
        // Void response = api.deleteStatusStatusId(statusId);

        // TODO: test validations
    }
    
    /**
     * Delete a workspace
     *
     * 
     */
    @Test
    public void deleteWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        String moveChildrenToWorkspaceId = null;
        // Void response = api.deleteWorkspacesWorkspaceId(workspaceId, moveChildrenToWorkspaceId);

        // TODO: test validations
    }
    
    /**
     * Delete a member from a workspace
     *
     * 
     */
    @Test
    public void deleteWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        // Void response = api.deleteWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId);

        // TODO: test validations
    }
    
    /**
     * Delete workspace tag
     *
     * Delete a tag from a workspace. Will remove this tag from all documents.
     */
    @Test
    public void deleteWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        // Void response = api.deleteWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId);

        // TODO: test validations
    }
    
    /**
     * Get a list of documents.
     *
     * 
     */
    @Test
    public void getDocumentsTest() {
        String workspaceId = null;
        String name = null;
        String expand = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        // DocumentEntityListing response = api.getDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a document.
     *
     * 
     */
    @Test
    public void getDocumentsDocumentIdTest() {
        String documentId = null;
        String expand = null;
        // Document response = api.getDocumentsDocumentId(documentId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of audits for a document.
     *
     * 
     */
    @Test
    public void getDocumentsDocumentIdAuditsTest() {
        String documentId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String transactionFilter = null;
        String level = null;
        String sortBy = null;
        String sortOrder = null;
        // DocumentAuditEntityListing response = api.getDocumentsDocumentIdAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Download a document.
     *
     * 
     */
    @Test
    public void getDocumentsDocumentIdContentTest() {
        String documentId = null;
        String disposition = null;
        String contentType = null;
        // DownloadResponse response = api.getDocumentsDocumentIdContent(documentId, disposition, contentType);

        // TODO: test validations
    }
    
    /**
     * Query content
     *
     * 
     */
    @Test
    public void getQueryTest() {
        String queryPhrase = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String expand = null;
        // QueryResults response = api.getQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand);

        // TODO: test validations
    }
    
    /**
     * Get a List of Security Profiles
     *
     * 
     */
    @Test
    public void getSecurityprofilesTest() {
        // SecurityProfileEntityListing response = api.getSecurityprofiles();

        // TODO: test validations
    }
    
    /**
     * Get a Security Profile
     *
     * 
     */
    @Test
    public void getSecurityprofilesSecurityprofileIdTest() {
        String securityProfileId = null;
        // SecurityProfile response = api.getSecurityprofilesSecurityprofileId(securityProfileId);

        // TODO: test validations
    }
    
    /**
     * Get shared documents. Securely download a shared document.
     *
     * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
     */
    @Test
    public void getSharedSharedIdTest() {
        String sharedId = null;
        Boolean redirect = null;
        String disposition = null;
        String contentType = null;
        String expand = null;
        // Void response = api.getSharedSharedId(sharedId, redirect, disposition, contentType, expand);

        // TODO: test validations
    }
    
    /**
     * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
     *
     * Failing to specify a filter will return 400.
     */
    @Test
    public void getSharesTest() {
        String entityId = null;
        String expand = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // ShareEntityListing response = api.getShares(entityId, expand, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve details about an existing share.
     *
     * 
     */
    @Test
    public void getSharesShareIdTest() {
        String shareId = null;
        String expand = null;
        // Share response = api.getSharesShareId(shareId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of statuses for pending operations
     *
     * 
     */
    @Test
    public void getStatusTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // CommandStatusEntityListing response = api.getStatus(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a status.
     *
     * 
     */
    @Test
    public void getStatusStatusIdTest() {
        String statusId = null;
        // CommandStatus response = api.getStatusStatusId(statusId);

        // TODO: test validations
    }
    
    /**
     * Get usage details.
     *
     * 
     */
    @Test
    public void getUsageTest() {
        // Usage response = api.getUsage();

        // TODO: test validations
    }
    
    /**
     * Get a list of workspaces.
     *
     * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
     */
    @Test
    public void getWorkspacesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String access = null;
        String expand = null;
        // WorkspaceEntityListing response = api.getWorkspaces(pageSize, pageNumber, access, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace.
     *
     * 
     */
    @Test
    public void getWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        String expand = null;
        // Workspace response = api.getWorkspacesWorkspaceId(workspaceId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list workspace members
     *
     * 
     */
    @Test
    public void getWorkspacesWorkspaceIdMembersTest() {
        String workspaceId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String expand = null;
        // WorkspaceMemberEntityListing response = api.getWorkspacesWorkspaceIdMembers(workspaceId, pageSize, pageNumber, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace member
     *
     * 
     */
    @Test
    public void getWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        String expand = null;
        // WorkspaceMember response = api.getWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of workspace tags
     *
     * 
     */
    @Test
    public void getWorkspacesWorkspaceIdTagvaluesTest() {
        String workspaceId = null;
        String value = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String expand = null;
        // TagValueEntityListing response = api.getWorkspacesWorkspaceIdTagvalues(workspaceId, value, pageSize, pageNumber, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace tag
     *
     * 
     */
    @Test
    public void getWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        String expand = null;
        // TagValue response = api.getWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, expand);

        // TODO: test validations
    }
    
    /**
     * Query audits
     *
     * 
     */
    @Test
    public void postAuditqueryTest() {
        ContentQueryRequest body = null;
        // QueryResults response = api.postAuditquery(body);

        // TODO: test validations
    }
    
    /**
     * Add a document.
     *
     * 
     */
    @Test
    public void postDocumentsTest() {
        DocumentUpload body = null;
        String copySource = null;
        String moveSource = null;
        Boolean override = null;
        // Document response = api.postDocuments(body, copySource, moveSource, override);

        // TODO: test validations
    }
    
    /**
     * Update a document.
     *
     * 
     */
    @Test
    public void postDocumentsDocumentIdTest() {
        String documentId = null;
        DocumentUpdate body = null;
        String expand = null;
        Boolean override = null;
        // Document response = api.postDocumentsDocumentId(documentId, body, expand, override);

        // TODO: test validations
    }
    
    /**
     * Replace the contents of a document.
     *
     * 
     */
    @Test
    public void postDocumentsDocumentIdContentTest() {
        String documentId = null;
        ReplaceRequest body = null;
        Boolean override = null;
        // ReplaceResponse response = api.postDocumentsDocumentIdContent(documentId, body, override);

        // TODO: test validations
    }
    
    /**
     * Query content
     *
     * 
     */
    @Test
    public void postQueryTest() {
        QueryRequest body = null;
        String expand = null;
        // QueryResults response = api.postQuery(body, expand);

        // TODO: test validations
    }
    
    /**
     * Creates a new share or updates an existing share if the entity has already been shared
     *
     * 
     */
    @Test
    public void postSharesTest() {
        CreateShareRequest body = null;
        // CreateShareResponse response = api.postShares(body);

        // TODO: test validations
    }
    
    /**
     * Create a group workspace
     *
     * 
     */
    @Test
    public void postWorkspacesTest() {
        WorkspaceCreate body = null;
        // Workspace response = api.postWorkspaces(body);

        // TODO: test validations
    }
    
    /**
     * Create a workspace tag
     *
     * 
     */
    @Test
    public void postWorkspacesWorkspaceIdTagvaluesTest() {
        String workspaceId = null;
        TagValue body = null;
        // TagValue response = api.postWorkspacesWorkspaceIdTagvalues(workspaceId, body);

        // TODO: test validations
    }
    
    /**
     * Perform a prefix query on tags in the workspace
     *
     * 
     */
    @Test
    public void postWorkspacesWorkspaceIdTagvaluesQueryTest() {
        String workspaceId = null;
        TagQueryRequest body = null;
        String expand = null;
        // TagValueEntityListing response = api.postWorkspacesWorkspaceIdTagvaluesQuery(workspaceId, body, expand);

        // TODO: test validations
    }
    
    /**
     * Update a workspace
     *
     * 
     */
    @Test
    public void putWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        Workspace body = null;
        // Workspace response = api.putWorkspacesWorkspaceId(workspaceId, body);

        // TODO: test validations
    }
    
    /**
     * Add a member to a workspace
     *
     * 
     */
    @Test
    public void putWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        WorkspaceMember body = null;
        // WorkspaceMember response = api.putWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, body);

        // TODO: test validations
    }
    
    /**
     * Update a workspace tag. Will update all documents with the new tag value.
     *
     * 
     */
    @Test
    public void putWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        TagValue body = null;
        // TagValue response = api.putWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, body);

        // TODO: test validations
    }
    
}
