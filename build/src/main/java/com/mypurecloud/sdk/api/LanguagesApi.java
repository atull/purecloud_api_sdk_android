package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.Language;
import com.mypurecloud.sdk.model.LanguageEntityListing;

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
  Call<Void> deleteLanguageId(
    @Path("languageId") String languageId
  );

  /**
   * Get language
   * 
   * @param languageId Language ID (required)
   * @return Call<Language>
   */
  
  @GET("api/v2/languages/{languageId}")
  Call<Language> getLanguageId(
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
   * Create Language
   * 
   * @param body Language (required)
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
   * @param body Language (required)
   * @return Call<Language>
   */
  
  @PUT("api/v2/languages/{languageId}")
  Call<Language> putLanguageId(
    @Path("languageId") String languageId, @Body Language body
  );

}
