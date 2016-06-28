package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.FaxDocumentEntityListing;
import io.swagger.client.model.FaxDocument;
import io.swagger.client.model.DownloadResponse;
import io.swagger.client.model.FaxSummary;

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
  Call<Void> deleteFaxDocumentsDocumentId(
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
  Call<FaxDocumentEntityListing> getFaxDocuments(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return Call<FaxDocument>
   */
  
  @GET("api/v2/fax/documents/{documentId}")
  Call<FaxDocument> getFaxDocumentsDocumentId(
    @Path("documentId") String documentId
  );

  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return Call<DownloadResponse>
   */
  
  @GET("api/v2/fax/documents/{documentId}/content")
  Call<DownloadResponse> getFaxDocumentsDocumentIdContent(
    @Path("documentId") String documentId
  );

  /**
   * Get fax summary
   * 
   * @return Call<FaxSummary>
   */
  
  @GET("api/v2/fax/summary")
  Call<FaxSummary> getFaxSummary();
    

  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (optional)
   * @return Call<FaxDocument>
   */
  
  @PUT("api/v2/fax/documents/{documentId}")
  Call<FaxDocument> putFaxDocumentsDocumentId(
    @Path("documentId") String documentId, @Body FaxDocument body
  );

}
