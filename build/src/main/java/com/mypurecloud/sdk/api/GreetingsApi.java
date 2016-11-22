package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.Greeting;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.DefaultGreetingList;
import com.mypurecloud.sdk.model.GreetingMediaInfo;
import com.mypurecloud.sdk.model.DomainEntityListing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GreetingsApi {
  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Call<Greeting>
   */
  
  @DELETE("api/v2/greetings/{greetingId}")
  Call<Greeting> deleteGreetingId(
    @Path("greetingId") String greetingId
  );

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @return Call<DefaultGreetingList>
   */
  
  @GET("api/v2/greetings/defaults")
  Call<DefaultGreetingList> getDefaults();
    

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Call<Greeting>
   */
  
  @GET("api/v2/greetings/{greetingId}")
  Call<Greeting> getGreetingId(
    @Path("greetingId") String greetingId
  );

  /**
   * Get media playback URI for this greeting
   * 
   * @param greetingId Greeting ID (required)
   * @param formatId The desired media format. (optional, default to WAV)
   * @return Call<GreetingMediaInfo>
   */
  
  @GET("api/v2/greetings/{greetingId}/media")
  Call<GreetingMediaInfo> getGreetingIdMedia(
    @Path("greetingId") String greetingId, @Query("formatId") String formatId
  );

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<DomainEntityListing>
   */
  
  @GET("api/v2/greetings")
  Call<DomainEntityListing> getGreetings(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<DomainEntityListing>
   */
  
  @GET("api/v2/users/{userId}/greetings")
  Call<DomainEntityListing> getUserIdGreetings(
    @Path("userId") String userId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param userId User ID (required)
   * @return Call<DefaultGreetingList>
   */
  
  @GET("api/v2/users/{userId}/greetings/defaults")
  Call<DefaultGreetingList> getUserIdGreetingsDefaults(
    @Path("userId") String userId
  );

  /**
   * Create a Greeting for an Organization
   * 
   * @param body The Greeting to create (required)
   * @return Call<DefaultGreetingList>
   */
  
  @POST("api/v2/greetings")
  Call<DefaultGreetingList> postGreetings(
    @Body Greeting body
  );

  /**
   * Creates a Greeting for a User
   * 
   * @param userId User ID (required)
   * @param body The Greeting to create (required)
   * @return Call<Greeting>
   */
  
  @POST("api/v2/users/{userId}/greetings")
  Call<Greeting> postUserIdGreetings(
    @Path("userId") String userId, @Body Greeting body
  );

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param body The updated defaultGreetingList (required)
   * @return Call<DefaultGreetingList>
   */
  
  @PUT("api/v2/greetings/defaults")
  Call<DefaultGreetingList> putDefaults(
    @Body DefaultGreetingList body
  );

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @param body The updated Greeting (required)
   * @return Call<Greeting>
   */
  
  @PUT("api/v2/greetings/{greetingId}")
  Call<Greeting> putGreetingId(
    @Path("greetingId") String greetingId, @Body Greeting body
  );

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param userId User ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return Call<DefaultGreetingList>
   */
  
  @PUT("api/v2/users/{userId}/greetings/defaults")
  Call<DefaultGreetingList> putUserIdGreetingsDefaults(
    @Path("userId") String userId, @Body DefaultGreetingList body
  );

}
