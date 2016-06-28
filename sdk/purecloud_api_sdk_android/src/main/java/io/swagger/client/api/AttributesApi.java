package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AttributeEntityListing;
import io.swagger.client.model.Attribute;
import io.swagger.client.model.AttributeQueryRequest;

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
  Call<Void> deleteAttributesAttributeId(
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
   * Get details about an existing attribute.
   * 
   * @param attributeId Attribute ID (required)
   * @return Call<Attribute>
   */
  
  @GET("api/v2/attributes/{attributeId}")
  Call<Attribute> getAttributesAttributeId(
    @Path("attributeId") String attributeId
  );

  /**
   * Create an attribute.
   * 
   * @param body Attribute (optional)
   * @return Call<Attribute>
   */
  
  @POST("api/v2/attributes")
  Call<Attribute> postAttributes(
    @Body Attribute body
  );

  /**
   * Query attributes
   * 
   * @param body query (optional)
   * @return Call<AttributeEntityListing>
   */
  
  @POST("api/v2/attributes/query")
  Call<AttributeEntityListing> postAttributesQuery(
    @Body AttributeQueryRequest body
  );

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @param attributeId Attribute ID (required)
   * @param body Attribute (optional)
   * @return Call<Attribute>
   */
  
  @PUT("api/v2/attributes/{attributeId}")
  Call<Attribute> putAttributesAttributeId(
    @Path("attributeId") String attributeId, @Body Attribute body
  );

}
