package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.model.FaxDocument;
import com.mypurecloud.sdk.model.DownloadResponse;
import com.mypurecloud.sdk.model.FaxSummary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FaxApi {
  /**
   * Delete a fax document.
   * 
   * @param documentId Document ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/fax/documents/{documentId}")
  Call<Void> deleteDocumentsDocumentId(
    @Path("documentId") String documentId
  );

  /**
   * Get a list of fax documents.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<FaxDocumentEntityListing>
   */
  
  @GET("api/v2/fax/documents")
  Call<FaxDocumentEntityListing> getDocuments(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return Call<FaxDocument>
   */
  
  @GET("api/v2/fax/documents/{documentId}")
  Call<FaxDocument> getDocumentsDocumentId(
    @Path("documentId") String documentId
  );

  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return Call<DownloadResponse>
   */
  
  @GET("api/v2/fax/documents/{documentId}/content")
  Call<DownloadResponse> getDocumentsDocumentIdContent(
    @Path("documentId") String documentId
  );

  /**
   * Get fax summary
   * 
   * @return Call<FaxSummary>
   */
  
  @GET("api/v2/fax/summary")
  Call<FaxSummary> getSummary();
    

  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @return Call<FaxDocument>
   */
  
  @PUT("api/v2/fax/documents/{documentId}")
  Call<FaxDocument> putDocumentsDocumentId(
    @Path("documentId") String documentId, @Body FaxDocument body
  );

}
