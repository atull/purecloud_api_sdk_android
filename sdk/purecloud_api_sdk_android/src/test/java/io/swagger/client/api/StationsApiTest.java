package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.StationEntityListing;
import io.swagger.client.model.Station;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StationsApi
 */
public class StationsApiTest {

    private StationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StationsApi.class);
    }

    
    /**
     * Unassigns the user assigned to this station
     *
     * 
     */
    @Test
    public void deleteStationsStationIdAssociateduserTest() {
        String stationId = null;
        // String response = api.deleteStationsStationIdAssociateduser(stationId);

        // TODO: test validations
    }
    
    /**
     * Get the list of available stations.
     *
     * 
     */
    @Test
    public void getStationsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String name = null;
        String lineAppearanceId = null;
        // StationEntityListing response = api.getStations(pageSize, pageNumber, sortBy, name, lineAppearanceId);

        // TODO: test validations
    }
    
    /**
     * Get station.
     *
     * 
     */
    @Test
    public void getStationsStationIdTest() {
        String stationId = null;
        // Station response = api.getStationsStationId(stationId);

        // TODO: test validations
    }
    
}
