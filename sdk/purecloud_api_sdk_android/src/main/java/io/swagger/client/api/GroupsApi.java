package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.GroupEntityListing;
import io.swagger.client.model.Group;
import io.swagger.client.model.UserEntityListing;
import io.swagger.client.model.GroupsSearchResponse;
import io.swagger.client.model.GroupMembersUpdate;
import io.swagger.client.model.GroupSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GroupsApi {
  /**
   * Remove members
   * 
   * @param groupId Group ID (required)
   * @param ids Comma separated list of userIds to remove (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/groups/{groupId}/members")
  Call<Void> deleteGroupsGroupIdMembers(
    @Path("groupId") String groupId, @Query("ids") String ids
  );

  /**
   * Get a group list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return Call<GroupEntityListing>
   */
  
  @GET("api/v2/groups")
  Call<GroupEntityListing> getGroups(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
  );

  /**
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Call<Group>
   */
  
  @GET("api/v2/groups/{groupId}")
  Call<Group> getGroupsGroupId(
    @Path("groupId") String groupId
  );

  /**
   * Get group members
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return Call<UserEntityListing>
   */
  
  @GET("api/v2/groups/{groupId}/members")
  Call<UserEntityListing> getGroupsGroupIdMembers(
    @Path("groupId") String groupId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
  );

  /**
   * Search using q64
   * 
   * @param q64  (required)
   * @param expand  (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @GET("api/v2/groups/search")
  Call<GroupsSearchResponse> getGroupsSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Create a group
   * 
   * @param body  (optional)
   * @return Call<Group>
   */
  
  @POST("api/v2/groups")
  Call<Group> postGroups(
    @Body Group body
  );

  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/groups/{groupId}/members")
  Call<Void> postGroupsGroupIdMembers(
    @Path("groupId") String groupId, @Body GroupMembersUpdate body
  );

  /**
   * Search
   * 
   * @param body Search request options (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @POST("api/v2/groups/search")
  Call<GroupsSearchResponse> postGroupsSearch(
    @Body GroupSearchRequest body
  );

}
