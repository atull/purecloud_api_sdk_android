package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.PermissionCollectionEntityListing;
import io.swagger.client.model.OrganizationProductEntityListing;
import io.swagger.client.model.OrganizationRoleEntityListing;
import io.swagger.client.model.DomainOrgRoleDifference;
import io.swagger.client.model.DomainOrganizationRole;
import io.swagger.client.model.UserAuthorization;
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
    public void deleteAuthorizationRolesRoleIdTest() {
        String roleId = null;
        // Void response = api.deleteAuthorizationRolesRoleId(roleId);

        // TODO: test validations
    }
    
    /**
     * Removes all the roles from the user.
     *
     * 
     */
    @Test
    public void deleteUsersUserIdRolesTest() {
        String userId = null;
        // Void response = api.deleteUsersUserIdRoles(userId);

        // TODO: test validations
    }
    
    /**
     * Get all permissions.
     *
     * Retrieve a list of all permission defined in the system.
     */
    @Test
    public void getAuthorizationPermissionsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // PermissionCollectionEntityListing response = api.getAuthorizationPermissions(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get the list of enabled products
     *
     * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
     */
    @Test
    public void getAuthorizationProductsTest() {
        // OrganizationProductEntityListing response = api.getAuthorizationProducts();

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of all roles defined for the organization
     *
     * 
     */
    @Test
    public void getAuthorizationRolesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        List<String> expand = null;
        String nextPage = null;
        String previousPage = null;
        List<String> permission = null;
        Boolean userCount = null;
        // OrganizationRoleEntityListing response = api.getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount);

        // TODO: test validations
    }
    
    /**
     * Get an org role to default role comparison comparison
     *
     * Compares any organization role to a default role id and show differences
     */
    @Test
    public void getAuthorizationRolesLeftroleIdComparedefaultRightroleIdTest() {
        String leftRoleId = null;
        String rightRoleId = null;
        // DomainOrgRoleDifference response = api.getAuthorizationRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId);

        // TODO: test validations
    }
    
    /**
     * Get a single organization role.
     *
     * Get the organization role specified by its ID.
     */
    @Test
    public void getAuthorizationRolesRoleIdTest() {
        String roleId = null;
        // DomainOrganizationRole response = api.getAuthorizationRolesRoleId(roleId);

        // TODO: test validations
    }
    
    /**
     * Returns a listing of roles and permissions for a user.
     *
     * 
     */
    @Test
    public void getUsersUserIdRolesTest() {
        String userId = null;
        // UserAuthorization response = api.getUsersUserIdRoles(userId);

        // TODO: test validations
    }
    
    /**
     * Patch Organization Role for needsUpdate Field
     *
     * Patch Organization Role for needsUpdate Field
     */
    @Test
    public void patchAuthorizationRolesRoleIdTest() {
        String roleId = null;
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.patchAuthorizationRolesRoleId(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Create an organization role.
     *
     * 
     */
    @Test
    public void postAuthorizationRolesTest() {
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.postAuthorizationRoles(body);

        // TODO: test validations
    }
    
    /**
     * Restores all default roles
     *
     * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
     */
    @Test
    public void postAuthorizationRolesDefaultTest() {
        Boolean force = null;
        // OrganizationRoleEntityListing response = api.postAuthorizationRolesDefault(force);

        // TODO: test validations
    }
    
    /**
     *  Get an unsaved org role to default role comparison
     *
     * Allows users to compare their existing roles in an unsaved state to its default role
     */
    @Test
    public void postAuthorizationRolesLeftroleIdComparedefaultRightroleIdTest() {
        String leftRoleId = null;
        String rightRoleId = null;
        DomainOrganizationRole body = null;
        // DomainOrgRoleDifference response = api.postAuthorizationRolesLeftroleIdComparedefaultRightroleId(leftRoleId, rightRoleId, body);

        // TODO: test validations
    }
    
    /**
     * Restore specified default roles
     *
     * 
     */
    @Test
    public void putAuthorizationRolesDefaultTest() {
        List<DomainOrganizationRole> body = null;
        // OrganizationRoleEntityListing response = api.putAuthorizationRolesDefault(body);

        // TODO: test validations
    }
    
    /**
     * Update an organization role.
     *
     * Update
     */
    @Test
    public void putAuthorizationRolesRoleIdTest() {
        String roleId = null;
        DomainOrganizationRole body = null;
        // DomainOrganizationRole response = api.putAuthorizationRolesRoleId(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the users for the role
     *
     * 
     */
    @Test
    public void putAuthorizationRolesRoleIdUsersAddTest() {
        String roleId = null;
        List<String> body = null;
        // List<String> response = api.putAuthorizationRolesRoleIdUsersAdd(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Removes the users from the role
     *
     * 
     */
    @Test
    public void putAuthorizationRolesRoleIdUsersRemoveTest() {
        String roleId = null;
        List<String> body = null;
        // List<String> response = api.putAuthorizationRolesRoleIdUsersRemove(roleId, body);

        // TODO: test validations
    }
    
    /**
     * Sets the user&#39;s roles
     *
     * 
     */
    @Test
    public void putUsersUserIdRolesTest() {
        String userId = null;
        List<String> body = null;
        // UserAuthorization response = api.putUsersUserIdRoles(userId, body);

        // TODO: test validations
    }
    
}
