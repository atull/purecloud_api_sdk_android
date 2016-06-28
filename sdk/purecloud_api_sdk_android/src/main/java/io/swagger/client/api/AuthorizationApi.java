package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.PermissionCollectionEntityListing;
import io.swagger.client.model.OrganizationProductEntityListing;
import io.swagger.client.model.OrganizationRoleEntityListing;
import io.swagger.client.model.DomainOrgRoleDifference;
import io.swagger.client.model.DomainOrganizationRole;
import io.swagger.client.model.UserAuthorization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuthorizationApi {
  /**
   * Delete an organization role.
   * 
   * @param roleId Role ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/authorization/roles/{roleId}")
  Call<Void> deleteAuthorizationRolesRoleId(
    @Path("roleId") String roleId
  );

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/users/{userId}/roles")
  Call<Void> deleteUsersUserIdRoles(
    @Path("userId") String userId
  );

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<PermissionCollectionEntityListing>
   */
  
  @GET("api/v2/authorization/permissions")
  Call<PermissionCollectionEntityListing> getAuthorizationPermissions(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @return Call<OrganizationProductEntityListing>
   */
  
  @GET("api/v2/authorization/products")
  Call<OrganizationProductEntityListing> getAuthorizationProducts();
    

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param permission  (optional)
   * @param userCount  (optional, default to true)
   * @return Call<OrganizationRoleEntityListing>
   */
  
  @GET("api/v2/authorization/roles")
  Call<OrganizationRoleEntityListing> getAuthorizationRoles(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("expand") List<String> expand, @Query("nextPage") String nextPage, @Query("previousPage") String previousPage, @Query("permission") List<String> permission, @Query("userCount") Boolean userCount
  );

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @return Call<DomainOrgRoleDifference>
   */
  
  @GET("api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}")
  Call<DomainOrgRoleDifference> getAuthorizationRolesLeftroleIdComparedefaultRightroleId(
    @Path("leftRoleId") String leftRoleId, @Path("rightRoleId") String rightRoleId
  );

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @return Call<DomainOrganizationRole>
   */
  
  @GET("api/v2/authorization/roles/{roleId}")
  Call<DomainOrganizationRole> getAuthorizationRolesRoleId(
    @Path("roleId") String roleId
  );

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return Call<UserAuthorization>
   */
  
  @GET("api/v2/users/{userId}/roles")
  Call<UserAuthorization> getUsersUserIdRoles(
    @Path("userId") String userId
  );

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param roleId Role ID (required)
   * @param body  (optional)
   * @return Call<DomainOrganizationRole>
   */
  
  @PATCH("api/v2/authorization/roles/{roleId}")
  Call<DomainOrganizationRole> patchAuthorizationRolesRoleId(
    @Path("roleId") String roleId, @Body DomainOrganizationRole body
  );

  /**
   * Create an organization role.
   * 
   * @param body  (optional)
   * @return Call<DomainOrganizationRole>
   */
  
  @POST("api/v2/authorization/roles")
  Call<DomainOrganizationRole> postAuthorizationRoles(
    @Body DomainOrganizationRole body
  );

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param force Restore default roles (optional, default to false)
   * @return Call<OrganizationRoleEntityListing>
   */
  
  @POST("api/v2/authorization/roles/default")
  Call<OrganizationRoleEntityListing> postAuthorizationRolesDefault(
    @Query("force") Boolean force
  );

  /**
   *  Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @param body  (optional)
   * @return Call<DomainOrgRoleDifference>
   */
  
  @POST("api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}")
  Call<DomainOrgRoleDifference> postAuthorizationRolesLeftroleIdComparedefaultRightroleId(
    @Path("leftRoleId") String leftRoleId, @Path("rightRoleId") String rightRoleId, @Body DomainOrganizationRole body
  );

  /**
   * Restore specified default roles
   * 
   * @param body  (optional)
   * @return Call<OrganizationRoleEntityListing>
   */
  
  @PUT("api/v2/authorization/roles/default")
  Call<OrganizationRoleEntityListing> putAuthorizationRolesDefault(
    @Body List<DomainOrganizationRole> body
  );

  /**
   * Update an organization role.
   * Update
   * @param roleId Role ID (required)
   * @param body  (optional)
   * @return Call<DomainOrganizationRole>
   */
  
  @PUT("api/v2/authorization/roles/{roleId}")
  Call<DomainOrganizationRole> putAuthorizationRolesRoleId(
    @Path("roleId") String roleId, @Body DomainOrganizationRole body
  );

  /**
   * Sets the users for the role
   * 
   * @param roleId Role ID (required)
   * @param body  (optional)
   * @return Call<List<String>>
   */
  
  @PUT("api/v2/authorization/roles/{roleId}/users/add")
  Call<List<String>> putAuthorizationRolesRoleIdUsersAdd(
    @Path("roleId") String roleId, @Body List<String> body
  );

  /**
   * Removes the users from the role
   * 
   * @param roleId Role ID (required)
   * @param body  (optional)
   * @return Call<List<String>>
   */
  
  @PUT("api/v2/authorization/roles/{roleId}/users/remove")
  Call<List<String>> putAuthorizationRolesRoleIdUsersRemove(
    @Path("roleId") String roleId, @Body List<String> body
  );

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body  (optional)
   * @return Call<UserAuthorization>
   */
  
  @PUT("api/v2/users/{userId}/roles")
  Call<UserAuthorization> putUsersUserIdRoles(
    @Path("userId") String userId, @Body List<String> body
  );

}
