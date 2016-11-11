package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.ApiClient;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.EdgeEntityListing;
import com.mypurecloud.sdk.model.AvailableLanguageList;
import com.mypurecloud.sdk.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.model.DIDPool;
import com.mypurecloud.sdk.model.DIDEntityListing;
import com.mypurecloud.sdk.model.DID;
import com.mypurecloud.sdk.model.Edge;
import com.mypurecloud.sdk.model.EdgeLineEntityListing;
import com.mypurecloud.sdk.model.EdgeLine;
import com.mypurecloud.sdk.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.model.DomainLogicalInterface;
import com.mypurecloud.sdk.model.EdgeLogsJob;
import com.mypurecloud.sdk.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.model.DomainEdgeSoftwareVersionDto;
import com.mypurecloud.sdk.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.model.EdgeGroup;
import com.mypurecloud.sdk.model.EdgeVersionReport;
import com.mypurecloud.sdk.model.EndpointEntityListing;
import com.mypurecloud.sdk.model.Endpoint;
import com.mypurecloud.sdk.model.ExtensionPoolEntityListing;
import com.mypurecloud.sdk.model.ExtensionPool;
import com.mypurecloud.sdk.model.ExtensionEntityListing;
import com.mypurecloud.sdk.model.Extension;
import com.mypurecloud.sdk.model.LineBaseEntityListing;
import com.mypurecloud.sdk.model.LineBase;
import com.mypurecloud.sdk.model.LineEntityListing;
import com.mypurecloud.sdk.model.Line;
import com.mypurecloud.sdk.model.OutboundRouteEntityListing;
import com.mypurecloud.sdk.model.OutboundRoute;
import com.mypurecloud.sdk.model.PhoneBaseEntityListing;
import com.mypurecloud.sdk.model.PhoneMetaBaseEntityListing;
import com.mypurecloud.sdk.model.PhoneBase;
import com.mypurecloud.sdk.model.PhoneEntityListing;
import com.mypurecloud.sdk.model.Phone;
import com.mypurecloud.sdk.model.SiteEntityListing;
import com.mypurecloud.sdk.model.Site;
import com.mypurecloud.sdk.model.NumberPlan;
import com.mypurecloud.sdk.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.model.TrunkBase;
import com.mypurecloud.sdk.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.model.TrunkEntityListing;
import com.mypurecloud.sdk.model.Trunk;
import com.mypurecloud.sdk.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.model.SchemaCategoryEntityListing;
import com.mypurecloud.sdk.model.SchemaReferenceEntityListing;
import com.mypurecloud.sdk.model.Organization;
import com.mypurecloud.sdk.model.ValidateAddressRequest;
import com.mypurecloud.sdk.model.ValidateAddressResponse;
import com.mypurecloud.sdk.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.model.PhonesReboot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TelephonyProvidersEdgeApi
 */
public class TelephonyProvidersEdgeApiTest {

    private TelephonyProvidersEdgeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TelephonyProvidersEdgeApi.class);
    }

    
    /**
     * Delete a certificate authority.
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        // String response = api.deleteProvidersEdgesCertificateauthoritiesCertificateId(certificateId);

        // TODO: test validations
    }
    
    /**
     * Delete a DID Pool by ID.
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        // String response = api.deleteProvidersEdgesDidpoolsDidpoolId(didPoolId);

        // TODO: test validations
    }
    
    /**
     * Delete a edge.
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        // String response = api.deleteProvidersEdgesEdgeId(edgeId);

        // TODO: test validations
    }
    
    /**
     * Delete an edge logical interface
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        // Void response = api.deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId);

        // TODO: test validations
    }
    
    /**
     * Cancels any in-progress update for this edge.
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        // String response = api.deleteProvidersEdgesEdgeIdSoftwareupdate(edgeId);

        // TODO: test validations
    }
    
    /**
     * Delete an edge group.
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        // String response = api.deleteProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId);

        // TODO: test validations
    }
    
    /**
     * Delete endpoint
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        // String response = api.deleteProvidersEdgesEndpointsEndpointId(endpointId);

        // TODO: test validations
    }
    
    /**
     * Delete an extension pool by ID
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        // String response = api.deleteProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);

        // TODO: test validations
    }
    
    /**
     * Delete Outbound Route
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        // String response = api.deleteProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);

        // TODO: test validations
    }
    
    /**
     * Delete a Phone Base Settings by ID
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        // String response = api.deleteProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);

        // TODO: test validations
    }
    
    /**
     * Delete a Phone by ID
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        // String response = api.deleteProvidersEdgesPhonesPhoneId(phoneId);

        // TODO: test validations
    }
    
    /**
     * Delete a Site by ID
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        // String response = api.deleteProvidersEdgesSitesSiteId(siteId);

        // TODO: test validations
    }
    
    /**
     * Delete a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        // String response = api.deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get the list of edges.
     *
     * 
     */
    @Test
    public void getProvidersEdgesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String siteId = null;
        String edgeGroupId = null;
        String sortBy = null;
        // EdgeEntityListing response = api.getProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get the list of available languages.
     *
     * 
     */
    @Test
    public void getProvidersEdgesAvailablelanguagesTest() {
        // AvailableLanguageList response = api.getProvidersEdgesAvailablelanguages();

        // TODO: test validations
    }
    
    /**
     * Get the list of certificate authorities.
     *
     * 
     */
    @Test
    public void getProvidersEdgesCertificateauthoritiesTest() {
        // CertificateAuthorityEntityListing response = api.getProvidersEdgesCertificateauthorities();

        // TODO: test validations
    }
    
    /**
     * Get a certificate authority.
     *
     * 
     */
    @Test
    public void getProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        // DomainCertificateAuthority response = api.getProvidersEdgesCertificateauthoritiesCertificateId(certificateId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of DID Pools
     *
     * 
     */
    @Test
    public void getProvidersEdgesDidpoolsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        // DIDPoolEntityListing response = api.getProvidersEdgesDidpools(pageSize, pageNumber, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get a DID Pool by ID.
     *
     * 
     */
    @Test
    public void getProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        // DIDPool response = api.getProvidersEdgesDidpoolsDidpoolId(didPoolId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of DIDs
     *
     * 
     */
    @Test
    public void getProvidersEdgesDidsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String phoneNumber = null;
        // DIDEntityListing response = api.getProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber);

        // TODO: test validations
    }
    
    /**
     * Get a DID by ID.
     *
     * 
     */
    @Test
    public void getProvidersEdgesDidsDidIdTest() {
        String didId = null;
        // DID response = api.getProvidersEdgesDidsDidId(didId);

        // TODO: test validations
    }
    
    /**
     * Get edge.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        // Edge response = api.getProvidersEdgesEdgeId(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of lines.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdLinesTest() {
        String edgeId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // EdgeLineEntityListing response = api.getProvidersEdgesEdgeIdLines(edgeId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get line
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdLinesLineIdTest() {
        String edgeId = null;
        String lineId = null;
        // EdgeLine response = api.getProvidersEdgesEdgeIdLinesLineId(edgeId, lineId);

        // TODO: test validations
    }
    
    /**
     * Get edge logical interfaces.
     *
     * Retrieve a list of all configured logical interfaces from a specific edge.
     */
    @Test
    public void getProvidersEdgesEdgeIdLogicalinterfacesTest() {
        String edgeId = null;
        List<String> expand = null;
        // LogicalInterfaceEntityListing response = api.getProvidersEdgesEdgeIdLogicalinterfaces(edgeId, expand);

        // TODO: test validations
    }
    
    /**
     * Get an edge logical interface
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        List<String> expand = null;
        // DomainLogicalInterface response = api.getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, expand);

        // TODO: test validations
    }
    
    /**
     * Get an Edge logs job.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdLogsJobsJobIdTest() {
        String edgeId = null;
        String jobId = null;
        // EdgeLogsJob response = api.getProvidersEdgesEdgeIdLogsJobsJobId(edgeId, jobId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of all configured physical interfaces from a specific edge.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdPhysicalinterfacesTest() {
        String edgeId = null;
        // PhysicalInterfaceEntityListing response = api.getProvidersEdgesEdgeIdPhysicalinterfaces(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get edge physical interface.
     *
     * Retrieve a physical interface from a specific edge.
     */
    @Test
    public void getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        // DomainPhysicalInterface response = api.getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(edgeId, interfaceId);

        // TODO: test validations
    }
    
    /**
     * Gets software update status information about any edge.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        // DomainEdgeSoftwareUpdateDto response = api.getProvidersEdgesEdgeIdSoftwareupdate(edgeId);

        // TODO: test validations
    }
    
    /**
     * Gets all the available software versions for this edge.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgeIdSoftwareversionsTest() {
        String edgeId = null;
        // DomainEdgeSoftwareVersionDto response = api.getProvidersEdgesEdgeIdSoftwareversions(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of edge groups.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgegroupsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        // EdgeGroupEntityListing response = api.getProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get edge group.
     *
     * 
     */
    @Test
    public void getProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        List<String> expand = null;
        // EdgeGroup response = api.getProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, expand);

        // TODO: test validations
    }
    
    /**
     * Get the edge version report.
     *
     * The report will not have consistent data about the edge version(s) until all edges have been reset.
     */
    @Test
    public void getProvidersEdgesEdgeversionreportTest() {
        // EdgeVersionReport response = api.getProvidersEdgesEdgeversionreport();

        // TODO: test validations
    }
    
    /**
     * Get endpoints
     *
     * 
     */
    @Test
    public void getProvidersEdgesEndpointsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        // EndpointEntityListing response = api.getProvidersEdgesEndpoints(pageSize, pageNumber, name, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get endpoint
     *
     * 
     */
    @Test
    public void getProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        // Endpoint response = api.getProvidersEdgesEndpointsEndpointId(endpointId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of extension pools
     *
     * 
     */
    @Test
    public void getProvidersEdgesExtensionpoolsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String number = null;
        // ExtensionPoolEntityListing response = api.getProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number);

        // TODO: test validations
    }
    
    /**
     * Get an extension pool by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        // ExtensionPool response = api.getProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of extensions
     *
     * 
     */
    @Test
    public void getProvidersEdgesExtensionsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String number = null;
        // ExtensionEntityListing response = api.getProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number);

        // TODO: test validations
    }
    
    /**
     * Get an extension by ID.
     *
     * 
     */
    @Test
    public void getProvidersEdgesExtensionsExtensionIdTest() {
        String extensionId = null;
        // Extension response = api.getProvidersEdgesExtensionsExtensionId(extensionId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of line base settings objects
     *
     * 
     */
    @Test
    public void getProvidersEdgesLinebasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        // LineBaseEntityListing response = api.getProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a line base settings object by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesLinebasesettingsLinebaseIdTest() {
        String lineBaseId = null;
        // LineBase response = api.getProvidersEdgesLinebasesettingsLinebaseId(lineBaseId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Lines
     *
     * 
     */
    @Test
    public void getProvidersEdgesLinesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        List<String> expand = null;
        // LineEntityListing response = api.getProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand);

        // TODO: test validations
    }
    
    /**
     * Get a Line by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesLinesLineIdTest() {
        String lineId = null;
        // Line response = api.getProvidersEdgesLinesLineId(lineId);

        // TODO: test validations
    }
    
    /**
     * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
     *
     * 
     */
    @Test
    public void getProvidersEdgesLinesTemplateTest() {
        String lineBaseSettingsId = null;
        // Line response = api.getProvidersEdgesLinesTemplate(lineBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get outbound routes
     *
     * 
     */
    @Test
    public void getProvidersEdgesOutboundroutesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String siteId = null;
        String sortBy = null;
        // OutboundRouteEntityListing response = api.getProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get outbound route
     *
     * 
     */
    @Test
    public void getProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        // OutboundRoute response = api.getProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Phone Base Settings objects
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonebasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        // PhoneBaseEntityListing response = api.getProvidersEdgesPhonebasesettings(pageNumber, pageSize, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a list of available makes and models to create a new Phone Base Settings
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonebasesettingsAvailablemetabasesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // PhoneMetaBaseEntityListing response = api.getProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a Phone Base Settings object by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        // PhoneBase response = api.getProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);

        // TODO: test validations
    }
    
    /**
     * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonebasesettingsTemplateTest() {
        String phoneMetabaseId = null;
        // PhoneBase response = api.getProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Phone Instances
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        String siteId = null;
        String webRtcUserId = null;
        String phoneBaseSettingsId = null;
        String linesLoggedInUserId = null;
        String linesDefaultForUserId = null;
        String phoneHardwareId = null;
        String linesId = null;
        String linesName = null;
        List<String> expand = null;
        List<String> fields = null;
        // PhoneEntityListing response = api.getProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, expand, fields);

        // TODO: test validations
    }
    
    /**
     * Get a Phone by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        // Phone response = api.getProvidersEdgesPhonesPhoneId(phoneId);

        // TODO: test validations
    }
    
    /**
     * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
     *
     * 
     */
    @Test
    public void getProvidersEdgesPhonesTemplateTest() {
        String phoneBaseSettingsId = null;
        // Phone response = api.getProvidersEdgesPhonesTemplate(phoneBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get the list of Sites.
     *
     * 
     */
    @Test
    public void getProvidersEdgesSitesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String name = null;
        String locationId = null;
        // SiteEntityListing response = api.getProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId);

        // TODO: test validations
    }
    
    /**
     * Get a Site by ID.
     *
     * 
     */
    @Test
    public void getProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        // Site response = api.getProvidersEdgesSitesSiteId(siteId);

        // TODO: test validations
    }
    
    /**
     * Get the list of Number Plans for this Site.
     *
     * 
     */
    @Test
    public void getProvidersEdgesSitesSiteIdNumberplansTest() {
        String siteId = null;
        // List<NumberPlan> response = api.getProvidersEdgesSitesSiteIdNumberplans(siteId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Classifications for this Site
     *
     * 
     */
    @Test
    public void getProvidersEdgesSitesSiteIdNumberplansClassificationsTest() {
        String siteId = null;
        String classification = null;
        // List<String> response = api.getProvidersEdgesSitesSiteIdNumberplansClassifications(siteId, classification);

        // TODO: test validations
    }
    
    /**
     * Get a Number Plan by ID.
     *
     * 
     */
    @Test
    public void getProvidersEdgesSitesSiteIdNumberplansNumberplanIdTest() {
        String siteId = null;
        String numberPlanId = null;
        // NumberPlan response = api.getProvidersEdgesSitesSiteIdNumberplansNumberplanId(siteId, numberPlanId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Edge-compatible time zones
     *
     * 
     */
    @Test
    public void getProvidersEdgesTimezonesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // TimeZoneEntityListing response = api.getProvidersEdgesTimezones(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get Trunk Base Settings listing
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunkbasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        Boolean recordingEnabled = null;
        // TrunkBase response = api.getProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled);

        // TODO: test validations
    }
    
    /**
     * Get a list of available makes and models to create a new Trunk Base Settings
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunkbasesettingsAvailablemetabasesTest() {
        String type = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // TrunkMetabaseEntityListing response = api.getProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunkbasesettingsTemplateTest() {
        String trunkMetabaseId = null;
        // TrunkBase response = api.getProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        // TrunkBase response = api.getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get the list of available trunks.
     *
     * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
     */
    @Test
    public void getProvidersEdgesTrunksTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        String edgeId = null;
        String trunkBaseId = null;
        String trunkType = null;
        // TrunkEntityListing response = api.getProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk by ID
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunksTrunkIdTest() {
        String trunkId = null;
        // Trunk response = api.getProvidersEdgesTrunksTrunkId(trunkId);

        // TODO: test validations
    }
    
    /**
     * Get Counts of trunks that have recording disabled or enabled
     *
     * 
     */
    @Test
    public void getProvidersEdgesTrunkswithrecordingTest() {
        String trunkType = null;
        // TrunkRecordingEnabledCount response = api.getProvidersEdgesTrunkswithrecording(trunkType);

        // TODO: test validations
    }
    
    /**
     * Lists available schema categories
     *
     * 
     */
    @Test
    public void getSchemasEdgesVnextTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaCategoryEntityListing response = api.getSchemasEdgesVnext(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * List schemas of a specific category
     *
     * 
     */
    @Test
    public void getSchemasEdgesVnextSchemacategoryTest() {
        String schemaCategory = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaReferenceEntityListing response = api.getSchemasEdgesVnextSchemacategory(schemaCategory, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * List schemas of a specific category
     *
     * 
     */
    @Test
    public void getSchemasEdgesVnextSchemacategorySchematypeTest() {
        String schemaCategory = null;
        String schemaType = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaReferenceEntityListing response = api.getSchemasEdgesVnextSchemacategorySchematype(schemaCategory, schemaType, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a json schema
     *
     * 
     */
    @Test
    public void getSchemasEdgesVnextSchemacategorySchematypeSchemaIdTest() {
        String schemaCategory = null;
        String schemaType = null;
        String schemaId = null;
        // Organization response = api.getSchemasEdgesVnextSchemacategorySchematypeSchemaId(schemaCategory, schemaType, schemaId);

        // TODO: test validations
    }
    
    /**
     * Get metadata for a schema
     *
     * 
     */
    @Test
    public void getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataIdTest() {
        String schemaCategory = null;
        String schemaType = null;
        String schemaId = null;
        String extensionType = null;
        String metadataId = null;
        String type = null;
        // Organization response = api.getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type);

        // TODO: test validations
    }
    
    /**
     * Create an edge.
     *
     * 
     */
    @Test
    public void postProvidersEdgesTest() {
        Edge body = null;
        // Edge response = api.postProvidersEdges(body);

        // TODO: test validations
    }
    
    /**
     * Validates a street address
     *
     * 
     */
    @Test
    public void postProvidersEdgesAddressvalidationTest() {
        ValidateAddressRequest body = null;
        // ValidateAddressResponse response = api.postProvidersEdgesAddressvalidation(body);

        // TODO: test validations
    }
    
    /**
     * Create a certificate authority.
     *
     * 
     */
    @Test
    public void postProvidersEdgesCertificateauthoritiesTest() {
        DomainCertificateAuthority body = null;
        // DomainCertificateAuthority response = api.postProvidersEdgesCertificateauthorities(body);

        // TODO: test validations
    }
    
    /**
     * Create a new DID pool
     *
     * 
     */
    @Test
    public void postProvidersEdgesDidpoolsTest() {
        DIDPool body = null;
        // DIDPool response = api.postProvidersEdgesDidpools(body);

        // TODO: test validations
    }
    
    /**
     * Create an edge logical interface.
     *
     * Create
     */
    @Test
    public void postProvidersEdgesEdgeIdLogicalinterfacesTest() {
        String edgeId = null;
        DomainLogicalInterface body = null;
        // DomainLogicalInterface response = api.postProvidersEdgesEdgeIdLogicalinterfaces(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Create a job to upload a list of Edge logs.
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgeIdLogsJobsTest() {
        String edgeId = null;
        EdgeLogsJobRequest body = null;
        // EdgeLogsJobResponse response = api.postProvidersEdgesEdgeIdLogsJobs(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Request that the specified fileIds be uploaded from the Edge.
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgeIdLogsJobsJobIdUploadTest() {
        String edgeId = null;
        String jobId = null;
        EdgeLogsJobUploadRequest body = null;
        // Void response = api.postProvidersEdgesEdgeIdLogsJobsJobIdUpload(edgeId, jobId, body);

        // TODO: test validations
    }
    
    /**
     * Reboot an Edge
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgeIdRebootTest() {
        String edgeId = null;
        // String response = api.postProvidersEdgesEdgeIdReboot(edgeId);

        // TODO: test validations
    }
    
    /**
     * Starts a software update for this edge.
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        DomainEdgeSoftwareUpdateDto body = null;
        // DomainEdgeSoftwareUpdateDto response = api.postProvidersEdgesEdgeIdSoftwareupdate(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Unpair an Edge
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgeIdUnpairTest() {
        String edgeId = null;
        // String response = api.postProvidersEdgesEdgeIdUnpair(edgeId);

        // TODO: test validations
    }
    
    /**
     * Create an edge group.
     *
     * 
     */
    @Test
    public void postProvidersEdgesEdgegroupsTest() {
        EdgeGroup body = null;
        // EdgeGroup response = api.postProvidersEdgesEdgegroups(body);

        // TODO: test validations
    }
    
    /**
     * Create endpoint
     *
     * 
     */
    @Test
    public void postProvidersEdgesEndpointsTest() {
        Endpoint body = null;
        // Endpoint response = api.postProvidersEdgesEndpoints(body);

        // TODO: test validations
    }
    
    /**
     * Create a new extension pool
     *
     * 
     */
    @Test
    public void postProvidersEdgesExtensionpoolsTest() {
        ExtensionPool body = null;
        // Extension response = api.postProvidersEdgesExtensionpools(body);

        // TODO: test validations
    }
    
    /**
     * Create outbound rule
     *
     * 
     */
    @Test
    public void postProvidersEdgesOutboundroutesTest() {
        OutboundRoute body = null;
        // OutboundRoute response = api.postProvidersEdgesOutboundroutes(body);

        // TODO: test validations
    }
    
    /**
     * Create a new Phone Base Settings object
     *
     * 
     */
    @Test
    public void postProvidersEdgesPhonebasesettingsTest() {
        PhoneBase body = null;
        // PhoneBase response = api.postProvidersEdgesPhonebasesettings(body);

        // TODO: test validations
    }
    
    /**
     * Create a new Phone
     *
     * 
     */
    @Test
    public void postProvidersEdgesPhonesTest() {
        Phone body = null;
        // Phone response = api.postProvidersEdgesPhones(body);

        // TODO: test validations
    }
    
    /**
     * Reboot a Phone
     *
     * 
     */
    @Test
    public void postProvidersEdgesPhonesPhoneIdRebootTest() {
        String phoneId = null;
        // Void response = api.postProvidersEdgesPhonesPhoneIdReboot(phoneId);

        // TODO: test validations
    }
    
    /**
     * Reboot Multiple Phones
     *
     * 
     */
    @Test
    public void postProvidersEdgesPhonesRebootTest() {
        PhonesReboot body = null;
        // Void response = api.postProvidersEdgesPhonesReboot(body);

        // TODO: test validations
    }
    
    /**
     * Create a Site.
     *
     * 
     */
    @Test
    public void postProvidersEdgesSitesTest() {
        Site body = null;
        // Site response = api.postProvidersEdgesSites(body);

        // TODO: test validations
    }
    
    /**
     * Triggers the rebalance operation.
     *
     * 
     */
    @Test
    public void postProvidersEdgesSitesSiteIdRebalanceTest() {
        String siteId = null;
        // Void response = api.postProvidersEdgesSitesSiteIdRebalance(siteId);

        // TODO: test validations
    }
    
    /**
     * Create a Trunk Base Settings object
     *
     * 
     */
    @Test
    public void postProvidersEdgesTrunkbasesettingsTest() {
        TrunkBase body = null;
        // TrunkBase response = api.postProvidersEdgesTrunkbasesettings(body);

        // TODO: test validations
    }
    
    /**
     * Update a certificate authority.
     *
     * 
     */
    @Test
    public void putProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        DomainCertificateAuthority body = null;
        // DomainCertificateAuthority response = api.putProvidersEdgesCertificateauthoritiesCertificateId(certificateId, body);

        // TODO: test validations
    }
    
    /**
     * Update a DID Pool by ID.
     *
     * 
     */
    @Test
    public void putProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        DIDPool body = null;
        // DIDPool response = api.putProvidersEdgesDidpoolsDidpoolId(didPoolId, body);

        // TODO: test validations
    }
    
    /**
     * Update a DID by ID.
     *
     * 
     */
    @Test
    public void putProvidersEdgesDidsDidIdTest() {
        String didId = null;
        DID body = null;
        // DID response = api.putProvidersEdgesDidsDidId(didId, body);

        // TODO: test validations
    }
    
    /**
     * Update a edge.
     *
     * 
     */
    @Test
    public void putProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        Edge body = null;
        // Edge response = api.putProvidersEdgesEdgeId(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Update a line.
     *
     * 
     */
    @Test
    public void putProvidersEdgesEdgeIdLinesLineIdTest() {
        String edgeId = null;
        String lineId = null;
        EdgeLine body = null;
        // EdgeLine response = api.putProvidersEdgesEdgeIdLinesLineId(edgeId, lineId, body);

        // TODO: test validations
    }
    
    /**
     * Update an edge logical interface.
     *
     * 
     */
    @Test
    public void putProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        DomainLogicalInterface body = null;
        // DomainLogicalInterface response = api.putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, body);

        // TODO: test validations
    }
    
    /**
     * Update an edge group.
     *
     * 
     */
    @Test
    public void putProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        EdgeGroup body = null;
        // EdgeGroup response = api.putProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, body);

        // TODO: test validations
    }
    
    /**
     * Update endpoint
     *
     * 
     */
    @Test
    public void putProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        Endpoint body = null;
        // Endpoint response = api.putProvidersEdgesEndpointsEndpointId(endpointId, body);

        // TODO: test validations
    }
    
    /**
     * Update an extension pool by ID
     *
     * 
     */
    @Test
    public void putProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        ExtensionPool body = null;
        // ExtensionPool response = api.putProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId, body);

        // TODO: test validations
    }
    
    /**
     * Update an extension by ID.
     *
     * 
     */
    @Test
    public void putProvidersEdgesExtensionsExtensionIdTest() {
        String extensionId = null;
        Extension body = null;
        // Extension response = api.putProvidersEdgesExtensionsExtensionId(extensionId, body);

        // TODO: test validations
    }
    
    /**
     * Update outbound route
     *
     * 
     */
    @Test
    public void putProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        OutboundRoute body = null;
        // OutboundRoute response = api.putProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Phone Base Settings by ID
     *
     * 
     */
    @Test
    public void putProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        PhoneBase body = null;
        // PhoneBase response = api.putProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Phone by ID
     *
     * 
     */
    @Test
    public void putProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        Phone body = null;
        // Phone response = api.putProvidersEdgesPhonesPhoneId(phoneId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Site by ID.
     *
     * 
     */
    @Test
    public void putProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        Site body = null;
        // Site response = api.putProvidersEdgesSitesSiteId(siteId, body);

        // TODO: test validations
    }
    
    /**
     * Update the list of Number Plans.
     *
     * 
     */
    @Test
    public void putProvidersEdgesSitesSiteIdNumberplansTest() {
        String siteId = null;
        List<NumberPlan> body = null;
        // List<NumberPlan> response = api.putProvidersEdgesSitesSiteIdNumberplans(siteId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void putProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        TrunkBase body = null;
        // TrunkBase response = api.putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId, body);

        // TODO: test validations
    }
    
}
