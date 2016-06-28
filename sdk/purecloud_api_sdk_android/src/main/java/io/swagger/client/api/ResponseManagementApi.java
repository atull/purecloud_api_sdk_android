package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LibraryEntityListing;
import io.swagger.client.model.Library;
import io.swagger.client.model.ResponseEntityListing;
import io.swagger.client.model.Response;
import io.swagger.client.model.ResponseQueryRequest;
import io.swagger.client.model.ResponseQueryResults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ResponseManagementApi {
  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param libraryId Library ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/responsemanagement/libraries/{libraryId}")
  Call<Void> deleteResponsemanagementLibrariesLibraryId(
    @Path("libraryId") String libraryId
  );

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param responseId Response ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/responsemanagement/responses/{responseId}")
  Call<Void> deleteResponsemanagementResponsesResponseId(
    @Path("responseId") String responseId
  );

  /**
   * Gets a list of existing response libraries.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<LibraryEntityListing>
   */
  
  @GET("api/v2/responsemanagement/libraries")
  Call<LibraryEntityListing> getResponsemanagementLibraries(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get details about an existing response library.
   * 
   * @param libraryId Library ID (required)
   * @return Call<Library>
   */
  
  @GET("api/v2/responsemanagement/libraries/{libraryId}")
  Call<Library> getResponsemanagementLibrariesLibraryId(
    @Path("libraryId") String libraryId
  );

  /**
   * Gets a list of existing responses.
   * 
   * @param libraryId Library ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<ResponseEntityListing>
   */
  
  @GET("api/v2/responsemanagement/responses")
  Call<ResponseEntityListing> getResponsemanagementResponses(
    @Query("libraryId") String libraryId, @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Get details about an existing response.
   * 
   * @param responseId Response ID (required)
   * @return Call<Response>
   */
  
  @GET("api/v2/responsemanagement/responses/{responseId}")
  Call<Response> getResponsemanagementResponsesResponseId(
    @Path("responseId") String responseId
  );

  /**
   * Create a response library.
   * 
   * @param body Library (optional)
   * @return Call<Library>
   */
  
  @POST("api/v2/responsemanagement/libraries")
  Call<Library> postResponsemanagementLibraries(
    @Body Library body
  );

  /**
   * Create a response.
   * 
   * @param body Response (optional)
   * @return Call<Response>
   */
  
  @POST("api/v2/responsemanagement/responses")
  Call<Response> postResponsemanagementResponses(
    @Body Response body
  );

  /**
   * Query responses
   * 
   * @param body Response (optional)
   * @return Call<ResponseQueryResults>
   */
  
  @POST("api/v2/responsemanagement/responses/query")
  Call<ResponseQueryResults> postResponsemanagementResponsesQuery(
    @Body ResponseQueryRequest body
  );

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param libraryId Library ID (required)
   * @param body Library (optional)
   * @return Call<Library>
   */
  
  @PUT("api/v2/responsemanagement/libraries/{libraryId}")
  Call<Library> putResponsemanagementLibrariesLibraryId(
    @Path("libraryId") String libraryId, @Body Library body
  );

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param responseId Response ID (required)
   * @param body Response (optional)
   * @return Call<Response>
   */
  
  @PUT("api/v2/responsemanagement/responses/{responseId}")
  Call<Response> putResponsemanagementResponsesResponseId(
    @Path("responseId") String responseId, @Body Response body
  );

}
