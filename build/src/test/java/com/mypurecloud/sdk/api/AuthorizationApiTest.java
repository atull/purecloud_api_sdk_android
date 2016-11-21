package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.model.DomainOrganizationRole;
import com.mypurecloud.sdk.model.UserAuthorization;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationApi
 */
public class AuthorizationApiTest {

    private AuthorizationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthorizationApi.class);
    }

    
    /**
     * Delete an organization role.
     *
     * 
     */
    @Test
    public void deleteRolesRoleIdTest() {
        String roleId = null;
        // Void response = api.deleteRolesRoleId(roleId);

        // TODO: test validations
    }
    
    /**
     * Removes all the roles from the user.
     *
     * 
     */
    @Test
    public void deleteUserIdRolesTest() {
        String userId = null;
        // Void response = api.deleteUserIdRoles(userId);

        // TODO: test validations
    }
    
    /**
     * Get all permissions.
     *
     * Retrieve a list of all permission defined in the system.
     */
    @Test
    public void getPermissionsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // PermissionCollectionEntityListing response = api.getPermissions(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get the list of enabled products
     *
     * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
     */
    @Test
    public void getProductsTest() {
        // OrganizationProductEntityListing response = api.getProducts();

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of all roles defined for the organization
     *
     * 
     */
    @Test
    public void getRolesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<Object> expand = null;
        String nextPage = null;
        String previousPage = null;
        List<Object> permission = null;
        Boolean userCount = null;
        // OrganizationRoleEntityListing response = api.getRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount);

        // TODO: test validations
    }
    
    /**
     * Get an org role to default role comparison comparison
     *
     * Compares any organization role to a default role id and show differences
     */
    @Test
    public void getRolesLeftroleIdComparedefaultRightroleIdTest() {
        String leftRoleId = null;
        String rightRoleId = null;
        // DomainOrgRoleDifference response = api.getRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId);

        // TODO: test validations
    }
    
    /**
     * Get a single organization role.
     *
     * Get the organization role specified by its ID.
     */
    @Test
    public void getRolesRoleIdTest() {
        String roleId = null;
        // DomainOrganizationRole response = api.getRolesRoleId(roleId);

        // TODO: test validations
    }
    
    /**
     * Returns a listing of roles and permissions for a user.
     *
     * 
     */
    @Test
    public void getUserIdRolesTest() {
        String userId = null;
        // UserAuthorization response = api.getUserIdRoles(userId);

        // TODO: test validations
    }
    
    /**
     * Patch Organization Role for needsUpdate Field
     *
     * Patch Organization Role for needsUpdate Field
     */
    @Test
    public void patchRolesRoleIdTest() {
        String roleId = null;
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.patchRolesRoleId(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Create an organization role.
     *
     * 
     */
    @Test
    public void postRolesTest() {
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.postRoles(body);

        // TODO: test validations
    }
    
    /**
     * Restores all default roles
     *
     * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
     */
    @Test
    public void postRolesDefaultTest() {
        Boolean force = null;
        // OrganizationRoleEntityListing response = api.postRolesDefault(force);

        // TODO: test validations
    }
    
    /**
     * Get an unsaved org role to default role comparison
     *
     * Allows users to compare their existing roles in an unsaved state to its default role
     */
    @Test
    public void postRolesLeftroleIdComparedefaultRightroleIdTest() {
        String leftRoleId = null;
        String rightRoleId = null;
        DomainOrganizationRole body = null;
        // DomainOrgRoleDifference response = api.postRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId, body);

        // TODO: test validations
    }
    
    /**
     * Restore specified default roles
     *
     * 
     */
    @Test
    public void putRolesDefaultTest() {
        List<DomainOrganizationRole> body = null;
        // OrganizationRoleEntityListing response = api.putRolesDefault(body);

        // TODO: test validations
    }
    
    /**
     * Update an organization role.
     *
     * Update
     */
    @Test
    public void putRolesRoleIdTest() {
        String roleId = null;
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.putRolesRoleId(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the users for the role
     *
     * 
     */
    @Test
    public void putRolesRoleIdUsersAddTest() {
        String roleId = null;
        List<String> body = null;
        // List<String> response = api.putRolesRoleIdUsersAdd(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Removes the users from the role
     *
     * 
     */
    @Test
    public void putRolesRoleIdUsersRemoveTest() {
        String roleId = null;
        List<String> body = null;
        // List<String> response = api.putRolesRoleIdUsersRemove(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the user&#39;s roles
     *
     * 
     */
    @Test
    public void putUserIdRolesTest() {
        String userId = null;
        List<String> body = null;
        // UserAuthorization response = api.putUserIdRoles(userId, body);

        // TODO: test validations
    }
    
}
