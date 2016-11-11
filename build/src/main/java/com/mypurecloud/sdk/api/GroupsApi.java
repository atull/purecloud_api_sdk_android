package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Group;
import com.mypurecloud.sdk.model.UserEntityListing;
import com.mypurecloud.sdk.model.GroupEntityListing;
import com.mypurecloud.sdk.model.GroupsSearchResponse;
import com.mypurecloud.sdk.model.GroupMembersUpdate;
import com.mypurecloud.sdk.model.GroupSearchRequest;

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
  Call<Void> deleteGroupIdMembers(
    @Path("groupId") String groupId, @Query("ids") String ids
  );

  /**
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Call<Group>
   */
  
  @GET("api/v2/groups/{groupId}")
  Call<Group> getGroupId(
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
  Call<UserEntityListing> getGroupIdMembers(
    @Path("groupId") String groupId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder
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
   * Search using q64
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return Call<GroupsSearchResponse>
   */
  
  @GET("api/v2/groups/search")
  Call<GroupsSearchResponse> getSearch(
    @Query("q64") String q64, @Query("expand") List<String> expand
  );

  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/groups/{groupId}/members")
  Call<Void> postGroupIdMembers(
    @Path("groupId") String groupId, @Body GroupMembersUpdate body
  );

  /**
   * Create a group
   * 
   * @param body Group (required)
   * @return Call<Group>
   */
  
  @POST("api/v2/groups")
  Call<Group> postGroups(
    @Body Group body
  );

  /**
   * Search
   * 
   * @param body Search request options (required)
   * @return Call<GroupsSearchResponse>
   */
  
  @POST("api/v2/groups/search")
  Call<GroupsSearchResponse> postSearch(
    @Body GroupSearchRequest body
  );

}
