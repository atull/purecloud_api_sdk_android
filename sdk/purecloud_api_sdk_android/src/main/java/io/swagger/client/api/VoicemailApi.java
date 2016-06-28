package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.VoicemailMailboxInfo;
import io.swagger.client.model.VoicemailMessageEntityListing;
import io.swagger.client.model.VoicemailMessage;
import io.swagger.client.model.VoicemailMediaInfo;
import io.swagger.client.model.VoicemailOrganizationPolicy;
import io.swagger.client.model.VoicemailUserPolicy;

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
  Call<String> deleteVoicemailMessages();
    

  /**
   * Delete a message.
   * 
   * @param messageId Message ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/voicemail/messages/{messageId}")
  Call<String> deleteVoicemailMessagesMessageId(
    @Path("messageId") String messageId
  );

  /**
   * Get mailbox information
   * 
   * @return Call<VoicemailMailboxInfo>
   */
  
  @GET("api/v2/voicemail/mailbox")
  Call<VoicemailMailboxInfo> getVoicemailMailbox();
    

  /**
   * List voicemail messages
   * 
   * @return Call<VoicemailMessageEntityListing>
   */
  
  @GET("api/v2/voicemail/messages")
  Call<VoicemailMessageEntityListing> getVoicemailMessages();
    

  /**
   * Get message.
   * 
   * @param messageId Message ID (required)
   * @return Call<VoicemailMessage>
   */
  
  @GET("api/v2/voicemail/messages/{messageId}")
  Call<VoicemailMessage> getVoicemailMessagesMessageId(
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
  Call<VoicemailMediaInfo> getVoicemailMessagesMessageIdMedia(
    @Path("messageId") String messageId, @Query("formatId") String formatId
  );

  /**
   * Get a policy
   * 
   * @return Call<VoicemailOrganizationPolicy>
   */
  
  @GET("api/v2/voicemail/policy")
  Call<VoicemailOrganizationPolicy> getVoicemailPolicy();
    

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @param userId User ID (required)
   * @return Call<VoicemailUserPolicy>
   */
  
  @GET("api/v2/voicemail/userpolicies/{userId}")
  Call<VoicemailUserPolicy> getVoicemailUserpoliciesUserId(
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
  Call<VoicemailUserPolicy> patchVoicemailUserpoliciesUserId(
    @Path("userId") String userId, @Body VoicemailUserPolicy body
  );

  /**
   * Update a message.
   * 
   * @param messageId Message ID (required)
   * @param body VoicemailMessage (optional)
   * @return Call<VoicemailMessage>
   */
  
  @PUT("api/v2/voicemail/messages/{messageId}")
  Call<VoicemailMessage> putVoicemailMessagesMessageId(
    @Path("messageId") String messageId, @Body VoicemailMessage body
  );

  /**
   * Update a policy
   * 
   * @param body Policy (optional)
   * @return Call<VoicemailOrganizationPolicy>
   */
  
  @PUT("api/v2/voicemail/policy")
  Call<VoicemailOrganizationPolicy> putVoicemailPolicy(
    @Body VoicemailOrganizationPolicy body
  );

}
