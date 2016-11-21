package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.model.ChannelEntityListing;
import com.mypurecloud.sdk.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.model.Channel;
import com.mypurecloud.sdk.model.ChannelTopic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private NotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationsApi.class);
    }

    
    /**
     * Remove all subscriptions
     *
     * 
     */
    @Test
    public void deleteChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        // String response = api.deleteChannelsChannelIdSubscriptions(channelId);

        // TODO: test validations
    }
    
    /**
     * Get available notification topics.
     *
     * 
     */
    @Test
    public void getAvailabletopicsTest() {
        List<String> expand = null;
        // AvailableTopicEntityListing response = api.getAvailabletopics(expand);

        // TODO: test validations
    }
    
    /**
     * The list of existing channels
     *
     * 
     */
    @Test
    public void getChannelsTest() {
        // ChannelEntityListing response = api.getChannels();

        // TODO: test validations
    }
    
    /**
     * The list of all subscriptions for this channel
     *
     * 
     */
    @Test
    public void getChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        // ChannelTopicEntityListing response = api.getChannelsChannelIdSubscriptions(channelId);

        // TODO: test validations
    }
    
    /**
     * Create a new channel
     *
     * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
     */
    @Test
    public void postChannelsTest() {
        // Channel response = api.postChannels();

        // TODO: test validations
    }
    
    /**
     * Add a list of subscriptions to the existing list of subscriptions
     *
     * 
     */
    @Test
    public void postChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        List<ChannelTopic> body = null;
        // ChannelTopicEntityListing response = api.postChannelsChannelIdSubscriptions(channelId, body);

        // TODO: test validations
    }
    
    /**
     * Replace the current list of subscriptions with a new list.
     *
     * 
     */
    @Test
    public void putChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        List<ChannelTopic> body = null;
        // ChannelTopicEntityListing response = api.putChannelsChannelIdSubscriptions(channelId, body);

        // TODO: test validations
    }
    
}
