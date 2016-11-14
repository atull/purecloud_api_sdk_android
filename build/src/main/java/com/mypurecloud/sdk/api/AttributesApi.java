package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Attribute;
import com.mypurecloud.sdk.model.AttributeEntityListing;
import com.mypurecloud.sdk.model.AttributeQueryRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AttributesApi {
  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @param attributeId Attribute ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/attributes/{attributeId}")
  Call<Void> deleteAttributeId(
    @Path("attributeId") String attributeId
  );

  /**
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Call<Attribute>
   */
  
  @GET("api/v2/attributes/{attributeId}")
  Call<Attribute> getAttributeId(
    @Path("attributeId") String attributeId
  );

  /**
   * Gets a list of existing attributes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return Call<AttributeEntityListing>
   */
  
  @GET("api/v2/attributes")
  Call<AttributeEntityListing> getAttributes(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize
  );

  /**
   * Create an attribute.
   * 
   * @param body Attribute (required)
   * @return Call<Attribute>
   */
  
  @POST("api/v2/attributes")
  Call<Attribute> postAttributes(
    @Body Attribute body
  );

  /**
   * Query attributes
   * 
   * @param body query (required)
   * @return Call<AttributeEntityListing>
   */
  
  @POST("api/v2/attributes/query")
  Call<AttributeEntityListing> postQuery(
    @Body AttributeQueryRequest body
  );

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (required)
   * @return Call<Attribute>
   */
  
  @PUT("api/v2/attributes/{attributeId}")
  Call<Attribute> putAttributeId(
    @Path("attributeId") String attributeId, @Body Attribute body
  );

}
