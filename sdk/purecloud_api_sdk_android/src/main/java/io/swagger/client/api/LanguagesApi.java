package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.LanguageEntityListing;
import io.swagger.client.model.Language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LanguagesApi {
  /**
   * Delete Language
   * 
   * @param languageId Language ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/languages/{languageId}")
  Call<Void> deleteLanguagesLanguageId(
    @Path("languageId") String languageId
  );

  /**
   * Get the list of supported languages.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return Call<LanguageEntityListing>
   */
  
  @GET("api/v2/languages")
  Call<LanguageEntityListing> getLanguages(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortOrder") String sortOrder, @Query("name") String name
  );

  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Call<Language>
   */
  
  @GET("api/v2/languages/{languageId}")
  Call<Language> getLanguagesLanguageId(
    @Path("languageId") String languageId
  );

  /**
   * Create Language
   * 
   * @param body Language (optional)
   * @return Call<Language>
   */
  
  @POST("api/v2/languages")
  Call<Language> postLanguages(
    @Body Language body
  );

  /**
   * Update Language
   * 
   * @param languageId Language ID (required)
   * @param body Language (optional)
   * @return Call<Language>
   */
  
  @PUT("api/v2/languages/{languageId}")
  Call<Language> putLanguagesLanguageId(
    @Path("languageId") String languageId, @Body Language body
  );

}
