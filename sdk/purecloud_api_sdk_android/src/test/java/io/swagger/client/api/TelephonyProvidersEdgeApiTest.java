package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.SchemaCategoryEntityListing;
import io.swagger.client.model.SchemaReferenceEntityListing;
import io.swagger.client.model.Organization;
import io.swagger.client.model.EdgeEntityListing;
import io.swagger.client.model.AvailableLanguageList;
import io.swagger.client.model.CertificateAuthorityEntityListing;
import io.swagger.client.model.DomainCertificateAuthority;
import io.swagger.client.model.DIDPoolEntityListing;
import io.swagger.client.model.DIDPool;
import io.swagger.client.model.DIDEntityListing;
import io.swagger.client.model.DID;
import io.swagger.client.model.Edge;
import io.swagger.client.model.EdgeLineEntityListing;
import io.swagger.client.model.EdgeLine;
import io.swagger.client.model.LogicalInterfaceEntityListing;
import io.swagger.client.model.DomainLogicalInterface;
import io.swagger.client.model.EdgeLogsJob;
import io.swagger.client.model.PhysicalInterfaceEntityListing;
import io.swagger.client.model.DomainPhysicalInterface;
import io.swagger.client.model.DomainEdgeSoftwareUpdateDto;
import io.swagger.client.model.DomainEdgeSoftwareVersionDto;
import io.swagger.client.model.EdgeGroupEntityListing;
import io.swagger.client.model.EdgeGroup;
import io.swagger.client.model.EdgeVersionReport;
import io.swagger.client.model.EndpointEntityListing;
import io.swagger.client.model.Endpoint;
import io.swagger.client.model.ExtensionPoolEntityListing;
import io.swagger.client.model.ExtensionPool;
import io.swagger.client.model.ExtensionEntityListing;
import io.swagger.client.model.Extension;
import io.swagger.client.model.LineBaseEntityListing;
import io.swagger.client.model.LineBase;
import io.swagger.client.model.LineEntityListing;
import io.swagger.client.model.Line;
import io.swagger.client.model.OutboundRouteEntityListing;
import io.swagger.client.model.OutboundRoute;
import io.swagger.client.model.PhoneBaseEntityListing;
import io.swagger.client.model.PhoneMetaBaseEntityListing;
import io.swagger.client.model.PhoneBase;
import io.swagger.client.model.PhoneEntityListing;
import io.swagger.client.model.Phone;
import io.swagger.client.model.SiteEntityListing;
import io.swagger.client.model.Site;
import io.swagger.client.model.NumberPlan;
import io.swagger.client.model.TimeZoneEntityListing;
import io.swagger.client.model.TrunkBase;
import io.swagger.client.model.TrunkMetabaseEntityListing;
import io.swagger.client.model.TrunkEntityListing;
import io.swagger.client.model.Trunk;
import io.swagger.client.model.TrunkRecordingEnabledCount;
import io.swagger.client.model.ValidateAddressRequest;
import io.swagger.client.model.ValidateAddressResponse;
import io.swagger.client.model.EdgeLogsJobResponse;
import io.swagger.client.model.EdgeLogsJobRequest;
import io.swagger.client.model.EdgeLogsJobUploadRequest;
import io.swagger.client.model.PhonesReboot;
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
    public void deleteTelephonyProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        // String response = api.deleteTelephonyProvidersEdgesCertificateauthoritiesCertificateId(certificateId);

        // TODO: test validations
    }
    
    /**
     * Delete a DID Pool by ID.
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        // String response = api.deleteTelephonyProvidersEdgesDidpoolsDidpoolId(didPoolId);

        // TODO: test validations
    }
    
    /**
     * Delete a edge.
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        // String response = api.deleteTelephonyProvidersEdgesEdgeId(edgeId);

        // TODO: test validations
    }
    
    /**
     * Delete an edge logical interface
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        // Void response = api.deleteTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId);

        // TODO: test validations
    }
    
    /**
     * Cancels any in-progress update for this edge.
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        // String response = api.deleteTelephonyProvidersEdgesEdgeIdSoftwareupdate(edgeId);

        // TODO: test validations
    }
    
    /**
     * Delete an edge group.
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        // String response = api.deleteTelephonyProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId);

        // TODO: test validations
    }
    
    /**
     * Delete endpoint
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        // String response = api.deleteTelephonyProvidersEdgesEndpointsEndpointId(endpointId);

        // TODO: test validations
    }
    
    /**
     * Delete an extension pool by ID
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        // String response = api.deleteTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);

        // TODO: test validations
    }
    
    /**
     * Delete Outbound Route
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        // String response = api.deleteTelephonyProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);

        // TODO: test validations
    }
    
    /**
     * Delete a Phone Base Settings by ID
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        // String response = api.deleteTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);

        // TODO: test validations
    }
    
    /**
     * Delete a Phone by ID
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        // String response = api.deleteTelephonyProvidersEdgesPhonesPhoneId(phoneId);

        // TODO: test validations
    }
    
    /**
     * Delete a Site by ID
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        // String response = api.deleteTelephonyProvidersEdgesSitesSiteId(siteId);

        // TODO: test validations
    }
    
    /**
     * Delete a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void deleteTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        // String response = api.deleteTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Lists available schema categories
     *
     * 
     */
    @Test
    public void getConfigurationSchemasEdgesVnextTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaCategoryEntityListing response = api.getConfigurationSchemasEdgesVnext(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * List schemas of a specific category
     *
     * 
     */
    @Test
    public void getConfigurationSchemasEdgesVnextSchemacategoryTest() {
        String schemaCategory = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaReferenceEntityListing response = api.getConfigurationSchemasEdgesVnextSchemacategory(schemaCategory, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * List schemas of a specific category
     *
     * 
     */
    @Test
    public void getConfigurationSchemasEdgesVnextSchemacategorySchematypeTest() {
        String schemaCategory = null;
        String schemaType = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // SchemaReferenceEntityListing response = api.getConfigurationSchemasEdgesVnextSchemacategorySchematype(schemaCategory, schemaType, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a json schema
     *
     * 
     */
    @Test
    public void getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaIdTest() {
        String schemaCategory = null;
        String schemaType = null;
        String schemaId = null;
        // Organization response = api.getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaId(schemaCategory, schemaType, schemaId);

        // TODO: test validations
    }
    
    /**
     * Get metadata for a schema
     *
     * 
     */
    @Test
    public void getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataIdTest() {
        String schemaCategory = null;
        String schemaType = null;
        String schemaId = null;
        String extensionType = null;
        String metadataId = null;
        String type = null;
        // Organization response = api.getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type);

        // TODO: test validations
    }
    
    /**
     * Get the list of edges.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String siteId = null;
        String edgeGroupId = null;
        String sortBy = null;
        // EdgeEntityListing response = api.getTelephonyProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get the list of available languages.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesAvailablelanguagesTest() {
        // AvailableLanguageList response = api.getTelephonyProvidersEdgesAvailablelanguages();

        // TODO: test validations
    }
    
    /**
     * Get the list of certificate authorities.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesCertificateauthoritiesTest() {
        // CertificateAuthorityEntityListing response = api.getTelephonyProvidersEdgesCertificateauthorities();

        // TODO: test validations
    }
    
    /**
     * Get a certificate authority.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        // DomainCertificateAuthority response = api.getTelephonyProvidersEdgesCertificateauthoritiesCertificateId(certificateId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of DID Pools
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesDidpoolsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        // DIDPoolEntityListing response = api.getTelephonyProvidersEdgesDidpools(pageSize, pageNumber, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get a DID Pool by ID.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        // DIDPool response = api.getTelephonyProvidersEdgesDidpoolsDidpoolId(didPoolId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of DIDs
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesDidsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String phoneNumber = null;
        // DIDEntityListing response = api.getTelephonyProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber);

        // TODO: test validations
    }
    
    /**
     * Get a DID by ID.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesDidsDidIdTest() {
        String didId = null;
        // DID response = api.getTelephonyProvidersEdgesDidsDidId(didId);

        // TODO: test validations
    }
    
    /**
     * Get edge.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        // Edge response = api.getTelephonyProvidersEdgesEdgeId(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of lines.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdLinesTest() {
        String edgeId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // EdgeLineEntityListing response = api.getTelephonyProvidersEdgesEdgeIdLines(edgeId, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get line
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdLinesLineIdTest() {
        String edgeId = null;
        String lineId = null;
        // EdgeLine response = api.getTelephonyProvidersEdgesEdgeIdLinesLineId(edgeId, lineId);

        // TODO: test validations
    }
    
    /**
     * Get edge logical interfaces.
     *
     * Retrieve a list of all configured logical interfaces from a specific edge.
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdLogicalinterfacesTest() {
        String edgeId = null;
        // LogicalInterfaceEntityListing response = api.getTelephonyProvidersEdgesEdgeIdLogicalinterfaces(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get an edge logical interface
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        // DomainLogicalInterface response = api.getTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId);

        // TODO: test validations
    }
    
    /**
     * Get an Edge logs job.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdLogsJobsJobIdTest() {
        String edgeId = null;
        String jobId = null;
        // EdgeLogsJob response = api.getTelephonyProvidersEdgesEdgeIdLogsJobsJobId(edgeId, jobId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of all configured physical interfaces from a specific edge.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdPhysicalinterfacesTest() {
        String edgeId = null;
        // PhysicalInterfaceEntityListing response = api.getTelephonyProvidersEdgesEdgeIdPhysicalinterfaces(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get edge physical interface.
     *
     * Retrieve a physical interface from a specific edge.
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdPhysicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        // DomainPhysicalInterface response = api.getTelephonyProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(edgeId, interfaceId);

        // TODO: test validations
    }
    
    /**
     * Gets software update status information about any edge.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        // DomainEdgeSoftwareUpdateDto response = api.getTelephonyProvidersEdgesEdgeIdSoftwareupdate(edgeId);

        // TODO: test validations
    }
    
    /**
     * Gets all the available software versions for this edge.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeIdSoftwareversionsTest() {
        String edgeId = null;
        // DomainEdgeSoftwareVersionDto response = api.getTelephonyProvidersEdgesEdgeIdSoftwareversions(edgeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of edge groups.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgegroupsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        // EdgeGroupEntityListing response = api.getTelephonyProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get edge group.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        // EdgeGroup response = api.getTelephonyProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId);

        // TODO: test validations
    }
    
    /**
     * Get the edge version report.
     *
     * The report will not have consistent data about the edge version(s) until all edges have been reset.
     */
    @Test
    public void getTelephonyProvidersEdgesEdgeversionreportTest() {
        // EdgeVersionReport response = api.getTelephonyProvidersEdgesEdgeversionreport();

        // TODO: test validations
    }
    
    /**
     * Get endpoints
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEndpointsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        // EndpointEntityListing response = api.getTelephonyProvidersEdgesEndpoints(pageSize, pageNumber, name, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get endpoint
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        // Endpoint response = api.getTelephonyProvidersEdgesEndpointsEndpointId(endpointId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of extension pools
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesExtensionpoolsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String number = null;
        // ExtensionPoolEntityListing response = api.getTelephonyProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number);

        // TODO: test validations
    }
    
    /**
     * Get an extension pool by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        // ExtensionPool response = api.getTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of extensions
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesExtensionsTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String number = null;
        // ExtensionEntityListing response = api.getTelephonyProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number);

        // TODO: test validations
    }
    
    /**
     * Get an extension by ID.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesExtensionsExtensionIdTest() {
        String extensionId = null;
        // Extension response = api.getTelephonyProvidersEdgesExtensionsExtensionId(extensionId);

        // TODO: test validations
    }
    
    /**
     * Get a listing of line base settings objects
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesLinebasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        // LineBaseEntityListing response = api.getTelephonyProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a line base settings object by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesLinebasesettingsLinebaseIdTest() {
        String lineBaseId = null;
        // LineBase response = api.getTelephonyProvidersEdgesLinebasesettingsLinebaseId(lineBaseId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Lines
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesLinesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String sortBy = null;
        List<String> expand = null;
        // LineEntityListing response = api.getTelephonyProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand);

        // TODO: test validations
    }
    
    /**
     * Get a Line by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesLinesLineIdTest() {
        String lineId = null;
        // Line response = api.getTelephonyProvidersEdgesLinesLineId(lineId);

        // TODO: test validations
    }
    
    /**
     * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesLinesTemplateTest() {
        String lineBaseSettingsId = null;
        // Line response = api.getTelephonyProvidersEdgesLinesTemplate(lineBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get outbound routes
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesOutboundroutesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String name = null;
        String siteId = null;
        String sortBy = null;
        // OutboundRouteEntityListing response = api.getTelephonyProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, sortBy);

        // TODO: test validations
    }
    
    /**
     * Get outbound route
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        // OutboundRoute response = api.getTelephonyProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Phone Base Settings objects
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonebasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        // PhoneBaseEntityListing response = api.getTelephonyProvidersEdgesPhonebasesettings(pageNumber, pageSize, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Get a list of available makes and models to create a new Phone Base Settings
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // PhoneMetaBaseEntityListing response = api.getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a Phone Base Settings object by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        // PhoneBase response = api.getTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);

        // TODO: test validations
    }
    
    /**
     * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonebasesettingsTemplateTest() {
        String phoneMetabaseId = null;
        // PhoneBase response = api.getTelephonyProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Phone Instances
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonesTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        String siteId = null;
        String webRtcUserId = null;
        String phoneBaseSettingsId = null;
        String linesLoggedInUserId = null;
        String phoneHardwareId = null;
        List<String> expand = null;
        List<String> fields = null;
        // PhoneEntityListing response = api.getTelephonyProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, phoneHardwareId, expand, fields);

        // TODO: test validations
    }
    
    /**
     * Get a Phone by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        // Phone response = api.getTelephonyProvidersEdgesPhonesPhoneId(phoneId);

        // TODO: test validations
    }
    
    /**
     * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesPhonesTemplateTest() {
        String phoneBaseSettingsId = null;
        // Phone response = api.getTelephonyProvidersEdgesPhonesTemplate(phoneBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get the list of Sites.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesSitesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        String sortBy = null;
        String sortOrder = null;
        String name = null;
        String locationId = null;
        // SiteEntityListing response = api.getTelephonyProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId);

        // TODO: test validations
    }
    
    /**
     * Get a Site by ID.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        // Site response = api.getTelephonyProvidersEdgesSitesSiteId(siteId);

        // TODO: test validations
    }
    
    /**
     * Get the list of Number Plans for this Site.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesSitesSiteIdNumberplansTest() {
        String siteId = null;
        // List<NumberPlan> response = api.getTelephonyProvidersEdgesSitesSiteIdNumberplans(siteId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Classifications for this Site
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesSitesSiteIdNumberplansClassificationsTest() {
        String siteId = null;
        String classification = null;
        // List<String> response = api.getTelephonyProvidersEdgesSitesSiteIdNumberplansClassifications(siteId, classification);

        // TODO: test validations
    }
    
    /**
     * Get a Number Plan by ID.
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesSitesSiteIdNumberplansNumberplanIdTest() {
        String siteId = null;
        String numberPlanId = null;
        // NumberPlan response = api.getTelephonyProvidersEdgesSitesSiteIdNumberplansNumberplanId(siteId, numberPlanId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Edge-compatible time zones
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTimezonesTest() {
        Integer pageSize = null;
        Integer pageNumber = null;
        // TimeZoneEntityListing response = api.getTelephonyProvidersEdgesTimezones(pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get Trunk Base Settings listing
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunkbasesettingsTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        Boolean recordingEnabled = null;
        // TrunkBase response = api.getTelephonyProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled);

        // TODO: test validations
    }
    
    /**
     * Get a list of available makes and models to create a new Trunk Base Settings
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesTest() {
        String type = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        // TrunkMetabaseEntityListing response = api.getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunkbasesettingsTemplateTest() {
        String trunkMetabaseId = null;
        // TrunkBase response = api.getTelephonyProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        // TrunkBase response = api.getTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);

        // TODO: test validations
    }
    
    /**
     * Get the list of available trunks.
     *
     * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
     */
    @Test
    public void getTelephonyProvidersEdgesTrunksTest() {
        Integer pageNumber = null;
        Integer pageSize = null;
        String sortBy = null;
        String sortOrder = null;
        String edgeId = null;
        String trunkBaseId = null;
        String trunkType = null;
        // TrunkEntityListing response = api.getTelephonyProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType);

        // TODO: test validations
    }
    
    /**
     * Get a Trunk by ID
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunksTrunkIdTest() {
        String trunkId = null;
        // Trunk response = api.getTelephonyProvidersEdgesTrunksTrunkId(trunkId);

        // TODO: test validations
    }
    
    /**
     * Get Counts of trunks that have recording disabled or enabled
     *
     * 
     */
    @Test
    public void getTelephonyProvidersEdgesTrunkswithrecordingTest() {
        String trunkType = null;
        // TrunkRecordingEnabledCount response = api.getTelephonyProvidersEdgesTrunkswithrecording(trunkType);

        // TODO: test validations
    }
    
    /**
     * Create a edge.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesTest() {
        Edge body = null;
        // Edge response = api.postTelephonyProvidersEdges(body);

        // TODO: test validations
    }
    
    /**
     * Validates a street address
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesAddressvalidationTest() {
        ValidateAddressRequest body = null;
        // ValidateAddressResponse response = api.postTelephonyProvidersEdgesAddressvalidation(body);

        // TODO: test validations
    }
    
    /**
     * Create a certificate authority.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesCertificateauthoritiesTest() {
        DomainCertificateAuthority body = null;
        // DomainCertificateAuthority response = api.postTelephonyProvidersEdgesCertificateauthorities(body);

        // TODO: test validations
    }
    
    /**
     * Create a new DID pool
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesDidpoolsTest() {
        DIDPool body = null;
        // DIDPool response = api.postTelephonyProvidersEdgesDidpools(body);

        // TODO: test validations
    }
    
    /**
     * Create an edge logical interface.
     *
     * Create
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdLogicalinterfacesTest() {
        String edgeId = null;
        DomainLogicalInterface body = null;
        // DomainLogicalInterface response = api.postTelephonyProvidersEdgesEdgeIdLogicalinterfaces(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Create a job to upload a list of Edge logs.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdLogsJobsTest() {
        String edgeId = null;
        EdgeLogsJobRequest body = null;
        // EdgeLogsJobResponse response = api.postTelephonyProvidersEdgesEdgeIdLogsJobs(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Request that the specified fileIds be uploaded from the Edge.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdLogsJobsJobIdUploadTest() {
        String edgeId = null;
        String jobId = null;
        EdgeLogsJobUploadRequest body = null;
        // Void response = api.postTelephonyProvidersEdgesEdgeIdLogsJobsJobIdUpload(edgeId, jobId, body);

        // TODO: test validations
    }
    
    /**
     * Reboot an Edge
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdRebootTest() {
        String edgeId = null;
        // String response = api.postTelephonyProvidersEdgesEdgeIdReboot(edgeId);

        // TODO: test validations
    }
    
    /**
     * Starts a software update for this edge.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdSoftwareupdateTest() {
        String edgeId = null;
        DomainEdgeSoftwareUpdateDto body = null;
        // DomainEdgeSoftwareUpdateDto response = api.postTelephonyProvidersEdgesEdgeIdSoftwareupdate(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Unpair an Edge
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgeIdUnpairTest() {
        String edgeId = null;
        // String response = api.postTelephonyProvidersEdgesEdgeIdUnpair(edgeId);

        // TODO: test validations
    }
    
    /**
     * Create an edge group.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEdgegroupsTest() {
        EdgeGroup body = null;
        // EdgeGroup response = api.postTelephonyProvidersEdgesEdgegroups(body);

        // TODO: test validations
    }
    
    /**
     * Create endpoint
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesEndpointsTest() {
        Endpoint body = null;
        // Endpoint response = api.postTelephonyProvidersEdgesEndpoints(body);

        // TODO: test validations
    }
    
    /**
     * Create a new extension pool
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesExtensionpoolsTest() {
        ExtensionPool body = null;
        // Extension response = api.postTelephonyProvidersEdgesExtensionpools(body);

        // TODO: test validations
    }
    
    /**
     * Create outbound rule
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesOutboundroutesTest() {
        OutboundRoute body = null;
        // OutboundRoute response = api.postTelephonyProvidersEdgesOutboundroutes(body);

        // TODO: test validations
    }
    
    /**
     * Create a new Phone Base Settings object
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesPhonebasesettingsTest() {
        PhoneBase body = null;
        // PhoneBase response = api.postTelephonyProvidersEdgesPhonebasesettings(body);

        // TODO: test validations
    }
    
    /**
     * Create a new Phone
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesPhonesTest() {
        Phone body = null;
        // Phone response = api.postTelephonyProvidersEdgesPhones(body);

        // TODO: test validations
    }
    
    /**
     * Reboot a Phone
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesPhonesPhoneIdRebootTest() {
        String phoneId = null;
        // Void response = api.postTelephonyProvidersEdgesPhonesPhoneIdReboot(phoneId);

        // TODO: test validations
    }
    
    /**
     * Reboot Multiple Phones
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesPhonesRebootTest() {
        PhonesReboot body = null;
        // Void response = api.postTelephonyProvidersEdgesPhonesReboot(body);

        // TODO: test validations
    }
    
    /**
     * Create a Site.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesSitesTest() {
        Site body = null;
        // Site response = api.postTelephonyProvidersEdgesSites(body);

        // TODO: test validations
    }
    
    /**
     * Triggers the rebalance operation.
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesSitesSiteIdRebalanceTest() {
        String siteId = null;
        // Void response = api.postTelephonyProvidersEdgesSitesSiteIdRebalance(siteId);

        // TODO: test validations
    }
    
    /**
     * Create a Trunk Base Settings object
     *
     * 
     */
    @Test
    public void postTelephonyProvidersEdgesTrunkbasesettingsTest() {
        TrunkBase body = null;
        // TrunkBase response = api.postTelephonyProvidersEdgesTrunkbasesettings(body);

        // TODO: test validations
    }
    
    /**
     * Update a certificate authority.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesCertificateauthoritiesCertificateIdTest() {
        String certificateId = null;
        DomainCertificateAuthority body = null;
        // DomainCertificateAuthority response = api.putTelephonyProvidersEdgesCertificateauthoritiesCertificateId(certificateId, body);

        // TODO: test validations
    }
    
    /**
     * Update a DID Pool by ID.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesDidpoolsDidpoolIdTest() {
        String didPoolId = null;
        DIDPool body = null;
        // DIDPool response = api.putTelephonyProvidersEdgesDidpoolsDidpoolId(didPoolId, body);

        // TODO: test validations
    }
    
    /**
     * Update a DID by ID.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesDidsDidIdTest() {
        String didId = null;
        DID body = null;
        // DID response = api.putTelephonyProvidersEdgesDidsDidId(didId, body);

        // TODO: test validations
    }
    
    /**
     * Update a edge.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesEdgeIdTest() {
        String edgeId = null;
        Edge body = null;
        // Edge response = api.putTelephonyProvidersEdgesEdgeId(edgeId, body);

        // TODO: test validations
    }
    
    /**
     * Update a line.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesEdgeIdLinesLineIdTest() {
        String edgeId = null;
        String lineId = null;
        EdgeLine body = null;
        // EdgeLine response = api.putTelephonyProvidersEdgesEdgeIdLinesLineId(edgeId, lineId, body);

        // TODO: test validations
    }
    
    /**
     * Update an edge logical interface.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceIdTest() {
        String edgeId = null;
        String interfaceId = null;
        DomainLogicalInterface body = null;
        // DomainLogicalInterface response = api.putTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, body);

        // TODO: test validations
    }
    
    /**
     * Update an edge group.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesEdgegroupsEdgegroupIdTest() {
        String edgeGroupId = null;
        EdgeGroup body = null;
        // EdgeGroup response = api.putTelephonyProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, body);

        // TODO: test validations
    }
    
    /**
     * Update endpoint
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesEndpointsEndpointIdTest() {
        String endpointId = null;
        Endpoint body = null;
        // Endpoint response = api.putTelephonyProvidersEdgesEndpointsEndpointId(endpointId, body);

        // TODO: test validations
    }
    
    /**
     * Update an extension pool by ID
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesExtensionpoolsExtensionpoolIdTest() {
        String extensionPoolId = null;
        ExtensionPool body = null;
        // ExtensionPool response = api.putTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId, body);

        // TODO: test validations
    }
    
    /**
     * Update an extension by ID.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesExtensionsExtensionIdTest() {
        String extensionId = null;
        Extension body = null;
        // Extension response = api.putTelephonyProvidersEdgesExtensionsExtensionId(extensionId, body);

        // TODO: test validations
    }
    
    /**
     * Update outbound route
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesOutboundroutesOutboundrouteIdTest() {
        String outboundRouteId = null;
        OutboundRoute body = null;
        // OutboundRoute response = api.putTelephonyProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Phone Base Settings by ID
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesPhonebasesettingsPhonebaseIdTest() {
        String phoneBaseId = null;
        PhoneBase body = null;
        // PhoneBase response = api.putTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Phone by ID
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesPhonesPhoneIdTest() {
        String phoneId = null;
        Phone body = null;
        // Phone response = api.putTelephonyProvidersEdgesPhonesPhoneId(phoneId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Site by ID.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesSitesSiteIdTest() {
        String siteId = null;
        Site body = null;
        // Site response = api.putTelephonyProvidersEdgesSitesSiteId(siteId, body);

        // TODO: test validations
    }
    
    /**
     * Update the list of Number Plans.
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesSitesSiteIdNumberplansTest() {
        String siteId = null;
        List<NumberPlan> body = null;
        // List<NumberPlan> response = api.putTelephonyProvidersEdgesSitesSiteIdNumberplans(siteId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Trunk Base Settings object by ID
     *
     * 
     */
    @Test
    public void putTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsIdTest() {
        String trunkBaseSettingsId = null;
        TrunkBase body = null;
        // TrunkBase response = api.putTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId, body);

        // TODO: test validations
    }
    
}
