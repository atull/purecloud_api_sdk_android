package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.AvailableTopicEntityListing;
import io.swagger.client.model.ChannelEntityListing;
import io.swagger.client.model.ChannelTopicEntityListing;
import io.swagger.client.model.Channel;
import io.swagger.client.model.ChannelTopic;
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
    public void deleteNotificationsChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        // String response = api.deleteNotificationsChannelsChannelIdSubscriptions(channelId);

        // TODO: test validations
    }
    
    /**
     * Get available notification topics.
     *
     * 
     */
    @Test
    public void getNotificationsAvailabletopicsTest() {
        List<String> expand = null;
        // AvailableTopicEntityListing response = api.getNotificationsAvailabletopics(expand);

        // TODO: test validations
    }
    
    /**
     * The list of existing channels
     *
     * 
     */
    @Test
    public void getNotificationsChannelsTest() {
        // ChannelEntityListing response = api.getNotificationsChannels();

        // TODO: test validations
    }
    
    /**
     * The list of all subscriptions for this channel
     *
     * 
     */
    @Test
    public void getNotificationsChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        // ChannelTopicEntityListing response = api.getNotificationsChannelsChannelIdSubscriptions(channelId);

        // TODO: test validations
    }
    
    /**
     * Create a new channel
     *
     * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
     */
    @Test
    public void postNotificationsChannelsTest() {
        // Channel response = api.postNotificationsChannels();

        // TODO: test validations
    }
    
    /**
     * Add a list of subscriptions to the existing list of subscriptions
     *
     * 
     */
    @Test
    public void postNotificationsChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        List<ChannelTopic> body = null;
        // ChannelTopicEntityListing response = api.postNotificationsChannelsChannelIdSubscriptions(channelId, body);

        // TODO: test validations
    }
    
    /**
     * Replace the current list of subscriptions with a new list.
     *
     * 
     */
    @Test
    public void putNotificationsChannelsChannelIdSubscriptionsTest() {
        String channelId = null;
        List<ChannelTopic> body = null;
        // ChannelTopicEntityListing response = api.putNotificationsChannelsChannelIdSubscriptions(channelId, body);

        // TODO: test validations
    }
    
}
