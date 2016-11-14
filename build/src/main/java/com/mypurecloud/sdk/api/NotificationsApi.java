package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.model.ChannelEntityListing;
import com.mypurecloud.sdk.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.model.Channel;
import com.mypurecloud.sdk.model.ChannelTopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotificationsApi {
  /**
   * Remove all subscriptions
   * 
   * @param channelId Channel ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<String> deleteChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId
  );

  /**
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<AvailableTopicEntityListing>
   */
  
  @GET("api/v2/notifications/availabletopics")
  Call<AvailableTopicEntityListing> getAvailabletopics(
    @Query("expand") List<String> expand
  );

  /**
   * The list of existing channels
   * 
   * @return Call<ChannelEntityListing>
   */
  
  @GET("api/v2/notifications/channels")
  Call<ChannelEntityListing> getChannels();
    

  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @GET("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> getChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId
  );

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @return Call<Channel>
   */
  
  @POST("api/v2/notifications/channels")
  Call<Channel> postChannels();
    

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Topic (required)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @POST("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> postChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId, @Body List<ChannelTopic> body
  );

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Topic (required)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @PUT("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> putChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId, @Body List<ChannelTopic> body
  );

}
