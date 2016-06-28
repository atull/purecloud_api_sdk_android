package io.swagger.client.api;

import io.swagger.client.ApiClient;
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
    public void deleteContentmanagementDocumentsDocumentIdTest() {
        String documentId = null;
        Boolean override = null;
        // Void response = api.deleteContentmanagementDocumentsDocumentId(documentId, override);

        // TODO: test validations
    }
    
    /**
     * Deletes an existing share.
     *
     * This revokes sharing rights specified in the share record
     */
    @Test
    public void deleteContentmanagementSharesShareIdTest() {
        String shareId = null;
        // Void response = api.deleteContentmanagementSharesShareId(shareId);

        // TODO: test validations
    }
    
    /**
     * Cancel the command for this status
     *
     * 
     */
    @Test
    public void deleteContentmanagementStatusStatusIdTest() {
        String statusId = null;
        // Void response = api.deleteContentmanagementStatusStatusId(statusId);

        // TODO: test validations
    }
    
    /**
     * Delete a workspace
     *
     * 
     */
    @Test
    public void deleteContentmanagementWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        String moveChildrenToWorkspaceId = null;
        // Void response = api.deleteContentmanagementWorkspacesWorkspaceId(workspaceId, moveChildrenToWorkspaceId);

        // TODO: test validations
    }
    
    /**
     * Delete a member from a workspace
     *
     * 
     */
    @Test
    public void deleteContentmanagementWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        // Void response = api.deleteContentmanagementWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId);

        // TODO: test validations
    }
    
    /**
     * Delete workspace tag
     *
     * Delete a tag from a workspace. Will remove this tag from all documents.
     */
    @Test
    public void deleteContentmanagementWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        // Void response = api.deleteContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId);

        // TODO: test validations
    }
    
    /**
     * Get a list of documents.
     *
     * 
     */
    @Test
    public void getContentmanagementDocumentsTest() {
        String workspaceId = null;
        String name = null;
        String expand = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        // DocumentEntityListing response = api.getContentmanagementDocuments(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a document.
     *
     * 
     */
    @Test
    public void getContentmanagementDocumentsDocumentIdTest() {
        String documentId = null;
        String expand = null;
        // Document response = api.getContentmanagementDocumentsDocumentId(documentId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of audits for a document.
     *
     * 
     */
    @Test
    public void getContentmanagementDocumentsDocumentIdAuditsTest() {
        String documentId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String transactionFilter = null;
        String level = null;
        String sortBy = null;
        String sortOrder = null;
        // DocumentAuditEntityListing response = api.getContentmanagementDocumentsDocumentIdAudits(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Download a document.
     *
     * 
     */
    @Test
    public void getContentmanagementDocumentsDocumentIdContentTest() {
        String documentId = null;
        String disposition = null;
        String contentType = null;
        // Void response = api.getContentmanagementDocumentsDocumentIdContent(documentId, disposition, contentType);

        // TODO: test validations
    }
    
    /**
     * Query content
     *
     * 
     */
    @Test
    public void getContentmanagementQueryTest() {
        String queryPhrase = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String expand = null;
        // QueryResults response = api.getContentmanagementQuery(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand);

        // TODO: test validations
    }
    
    /**
     * Get a List of Security Profiles
     *
     * 
     */
    @Test
    public void getContentmanagementSecurityprofilesTest() {
        // SecurityProfileEntityListing response = api.getContentmanagementSecurityprofiles();

        // TODO: test validations
    }
    
    /**
     * Get a Security Profile
     *
     * 
     */
    @Test
    public void getContentmanagementSecurityprofilesSecurityprofileIdTest() {
        String securityProfileId = null;
        // SecurityProfile response = api.getContentmanagementSecurityprofilesSecurityprofileId(securityProfileId);

        // TODO: test validations
    }
    
    /**
     * Get shared documents. Securely download a shared document.
     *
     * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
     */
    @Test
    public void getContentmanagementSharedSharedIdTest() {
        String sharedId = null;
        Boolean redirect = null;
        String disposition = null;
        String contentType = null;
        String expand = null;
        // Void response = api.getContentmanagementSharedSharedId(sharedId, redirect, disposition, contentType, expand);

        // TODO: test validations
    }
    
    /**
     * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
     *
     * Failing to specify a filter will return 400.
     */
    @Test
    public void getContentmanagementSharesTest() {
        String entityId = null;
        String expand = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // ShareEntityListing response = api.getContentmanagementShares(entityId, expand, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve details about an existing share.
     *
     * 
     */
    @Test
    public void getContentmanagementSharesShareIdTest() {
        String shareId = null;
        String expand = null;
        // Share response = api.getContentmanagementSharesShareId(shareId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of statuses for pending operations
     *
     * 
     */
    @Test
    public void getContentmanagementStatusTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // CommandStatusEntityListing response = api.getContentmanagementStatus(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a status.
     *
     * 
     */
    @Test
    public void getContentmanagementStatusStatusIdTest() {
        String statusId = null;
        // CommandStatus response = api.getContentmanagementStatusStatusId(statusId);

        // TODO: test validations
    }
    
    /**
     * Get usage details.
     *
     * 
     */
    @Test
    public void getContentmanagementUsageTest() {
        // Usage response = api.getContentmanagementUsage();

        // TODO: test validations
    }
    
    /**
     * Get a list of workspaces.
     *
     * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
     */
    @Test
    public void getContentmanagementWorkspacesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String access = null;
        String expand = null;
        // WorkspaceEntityListing response = api.getContentmanagementWorkspaces(pageSize, pageNumber, access, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace.
     *
     * 
     */
    @Test
    public void getContentmanagementWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        String expand = null;
        // Workspace response = api.getContentmanagementWorkspacesWorkspaceId(workspaceId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list workspace members
     *
     * 
     */
    @Test
    public void getContentmanagementWorkspacesWorkspaceIdMembersTest() {
        String workspaceId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String expand = null;
        // WorkspaceMemberEntityListing response = api.getContentmanagementWorkspacesWorkspaceIdMembers(workspaceId, pageSize, pageNumber, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace member
     *
     * 
     */
    @Test
    public void getContentmanagementWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        String expand = null;
        // WorkspaceMember response = api.getContentmanagementWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, expand);

        // TODO: test validations
    }
    
    /**
     * Get a list of workspace tags
     *
     * 
     */
    @Test
    public void getContentmanagementWorkspacesWorkspaceIdTagvaluesTest() {
        String workspaceId = null;
        String value = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String expand = null;
        // TagValueEntityListing response = api.getContentmanagementWorkspacesWorkspaceIdTagvalues(workspaceId, value, pageSize, pageNumber, expand);

        // TODO: test validations
    }
    
    /**
     * Get a workspace tag
     *
     * 
     */
    @Test
    public void getContentmanagementWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        String expand = null;
        // TagValue response = api.getContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, expand);

        // TODO: test validations
    }
    
    /**
     * Query audits
     *
     * 
     */
    @Test
    public void postContentmanagementAuditqueryTest() {
        ContentQueryRequest body = null;
        // QueryResults response = api.postContentmanagementAuditquery(body);

        // TODO: test validations
    }
    
    /**
     * Add a document.
     *
     * 
     */
    @Test
    public void postContentmanagementDocumentsTest() {
        DocumentUpload body = null;
        String copySource = null;
        String moveSource = null;
        Boolean override = null;
        // Document response = api.postContentmanagementDocuments(body, copySource, moveSource, override);

        // TODO: test validations
    }
    
    /**
     * Update a document.
     *
     * 
     */
    @Test
    public void postContentmanagementDocumentsDocumentIdTest() {
        String documentId = null;
        DocumentUpdate body = null;
        String expand = null;
        Boolean override = null;
        // Document response = api.postContentmanagementDocumentsDocumentId(documentId, body, expand, override);

        // TODO: test validations
    }
    
    /**
     * Replace the contents of a document.
     *
     * 
     */
    @Test
    public void postContentmanagementDocumentsDocumentIdContentTest() {
        String documentId = null;
        ReplaceRequest body = null;
        Boolean override = null;
        // ReplaceResponse response = api.postContentmanagementDocumentsDocumentIdContent(documentId, body, override);

        // TODO: test validations
    }
    
    /**
     * Query content
     *
     * 
     */
    @Test
    public void postContentmanagementQueryTest() {
        QueryRequest body = null;
        String expand = null;
        // QueryResults response = api.postContentmanagementQuery(body, expand);

        // TODO: test validations
    }
    
    /**
     * Creates a new share or updates an existing share if the entity has already been shared
     *
     * 
     */
    @Test
    public void postContentmanagementSharesTest() {
        CreateShareRequest body = null;
        // CreateShareResponse response = api.postContentmanagementShares(body);

        // TODO: test validations
    }
    
    /**
     * Create a group workspace
     *
     * 
     */
    @Test
    public void postContentmanagementWorkspacesTest() {
        WorkspaceCreate body = null;
        // Workspace response = api.postContentmanagementWorkspaces(body);

        // TODO: test validations
    }
    
    /**
     * Create a workspace tag
     *
     * 
     */
    @Test
    public void postContentmanagementWorkspacesWorkspaceIdTagvaluesTest() {
        String workspaceId = null;
        TagValue body = null;
        // TagValue response = api.postContentmanagementWorkspacesWorkspaceIdTagvalues(workspaceId, body);

        // TODO: test validations
    }
    
    /**
     * Perform a prefix query on tags in the workspace
     *
     * 
     */
    @Test
    public void postContentmanagementWorkspacesWorkspaceIdTagvaluesQueryTest() {
        String workspaceId = null;
        TagQueryRequest body = null;
        String expand = null;
        // TagValueEntityListing response = api.postContentmanagementWorkspacesWorkspaceIdTagvaluesQuery(workspaceId, body, expand);

        // TODO: test validations
    }
    
    /**
     * Update a workspace
     *
     * 
     */
    @Test
    public void putContentmanagementWorkspacesWorkspaceIdTest() {
        String workspaceId = null;
        Workspace body = null;
        // Workspace response = api.putContentmanagementWorkspacesWorkspaceId(workspaceId, body);

        // TODO: test validations
    }
    
    /**
     * Add a member to a workspace
     *
     * 
     */
    @Test
    public void putContentmanagementWorkspacesWorkspaceIdMembersMemberIdTest() {
        String workspaceId = null;
        String memberId = null;
        WorkspaceMember body = null;
        // WorkspaceMember response = api.putContentmanagementWorkspacesWorkspaceIdMembersMemberId(workspaceId, memberId, body);

        // TODO: test validations
    }
    
    /**
     * Update a workspace tag. Will update all documents with the new tag value.
     *
     * 
     */
    @Test
    public void putContentmanagementWorkspacesWorkspaceIdTagvaluesTagIdTest() {
        String workspaceId = null;
        String tagId = null;
        TagValue body = null;
        // TagValue response = api.putContentmanagementWorkspacesWorkspaceIdTagvaluesTagId(workspaceId, tagId, body);

        // TODO: test validations
    }
    
}
