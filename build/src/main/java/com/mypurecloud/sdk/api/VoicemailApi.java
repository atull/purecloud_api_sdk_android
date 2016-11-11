package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.model.VoicemailMessage;
import com.mypurecloud.sdk.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.model.VoicemailUserPolicy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VoicemailApi {
  /**
   * Delete all voicemail messages
   * 
   * @return Call<String>
   */
  
  @DELETE("api/v2/voicemail/messages")
  Call<String> deleteMessages();
    

  /**
   * Delete a message.
   * 
   * @param messageId Message ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/voicemail/messages/{messageId}")
  Call<String> deleteMessagesMessageId(
    @Path("messageId") String messageId
  );

  /**
   * Get mailbox information
   * 
   * @return Call<VoicemailMailboxInfo>
   */
  
  @GET("api/v2/voicemail/mailbox")
  Call<VoicemailMailboxInfo> getMailbox();
    

  /**
   * List voicemail messages
   * 
   * @return Call<VoicemailMessageEntityListing>
   */
  
  @GET("api/v2/voicemail/messages")
  Call<VoicemailMessageEntityListing> getMessages();
    

  /**
   * Get message.
   * 
   * @param messageId Message ID (required)
   * @return Call<VoicemailMessage>
   */
  
  @GET("api/v2/voicemail/messages/{messageId}")
  Call<VoicemailMessage> getMessagesMessageId(
    @Path("messageId") String messageId
  );

  /**
   * Get media playback URI for this message
   * 
   * @param messageId Message ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return Call<VoicemailMediaInfo>
   */
  
  @GET("api/v2/voicemail/messages/{messageId}/media")
  Call<VoicemailMediaInfo> getMessagesMessageIdMedia(
    @Path("messageId") String messageId, @Query("formatId") String formatId
  );

  /**
   * Get a policy
   * 
   * @return Call<VoicemailOrganizationPolicy>
   */
  
  @GET("api/v2/voicemail/policy")
  Call<VoicemailOrganizationPolicy> getPolicy();
    

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return Call<VoicemailUserPolicy>
   */
  
  @GET("api/v2/voicemail/userpolicies/{userId}")
  Call<VoicemailUserPolicy> getUserpoliciesUserId(
    @Path("userId") String userId
  );

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @param body The user&#39;s voicemail policy (required)
   * @return Call<VoicemailUserPolicy>
   */
  
  @PATCH("api/v2/voicemail/userpolicies/{userId}")
  Call<VoicemailUserPolicy> patchUserpoliciesUserId(
    @Path("userId") String userId, @Body VoicemailUserPolicy body
  );

  /**
   * Update a message.
   * 
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (required)
   * @return Call<VoicemailMessage>
   */
  
  @PUT("api/v2/voicemail/messages/{messageId}")
  Call<VoicemailMessage> putMessagesMessageId(
    @Path("messageId") String messageId, @Body VoicemailMessage body
  );

  /**
   * Update a policy
   * 
   * @param body Policy (required)
   * @return Call<VoicemailOrganizationPolicy>
   */
  
  @PUT("api/v2/voicemail/policy")
  Call<VoicemailOrganizationPolicy> putPolicy(
    @Body VoicemailOrganizationPolicy body
  );

}
