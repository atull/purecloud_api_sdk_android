package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AvailableTopicEntityListing;
import io.swagger.client.model.ChannelEntityListing;
import io.swagger.client.model.ChannelTopicEntityListing;
import io.swagger.client.model.Channel;
import io.swagger.client.model.ChannelTopic;

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
  Call<String> deleteNotificationsChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId
  );

  /**
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return Call<AvailableTopicEntityListing>
   */
  
  @GET("api/v2/notifications/availabletopics")
  Call<AvailableTopicEntityListing> getNotificationsAvailabletopics(
    @Query("expand") List<String> expand
  );

  /**
   * The list of existing channels
   * 
   * @return Call<ChannelEntityListing>
   */
  
  @GET("api/v2/notifications/channels")
  Call<ChannelEntityListing> getNotificationsChannels();
    

  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @GET("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> getNotificationsChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId
  );

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @return Call<Channel>
   */
  
  @POST("api/v2/notifications/channels")
  Call<Channel> postNotificationsChannels();
    

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Topic (optional)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @POST("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> postNotificationsChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId, @Body List<ChannelTopic> body
  );

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Topic (optional)
   * @return Call<ChannelTopicEntityListing>
   */
  
  @PUT("api/v2/notifications/channels/{channelId}/subscriptions")
  Call<ChannelTopicEntityListing> putNotificationsChannelsChannelIdSubscriptions(
    @Path("channelId") String channelId, @Body List<ChannelTopic> body
  );

}
