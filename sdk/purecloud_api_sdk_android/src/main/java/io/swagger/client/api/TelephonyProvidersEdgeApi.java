package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TelephonyProvidersEdgeApi {
  /**
   * Delete a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/certificateauthorities/{certificateId}")
  Call<String> deleteTelephonyProvidersEdgesCertificateauthoritiesCertificateId(
    @Path("certificateId") String certificateId
  );

  /**
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<String> deleteTelephonyProvidersEdgesDidpoolsDidpoolId(
    @Path("didPoolId") String didPoolId
  );

  /**
   * Delete a edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/{edgeId}")
  Call<String> deleteTelephonyProvidersEdgesEdgeId(
    @Path("edgeId") String edgeId
  );

  /**
   * Delete an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return Call<Void>
   */
  
  @DELETE("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}")
  Call<Void> deleteTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId
  );

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<String> deleteTelephonyProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId
  );

  /**
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<String> deleteTelephonyProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId
  );

  /**
   * Delete endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<String> deleteTelephonyProvidersEdgesEndpointsEndpointId(
    @Path("endpointId") String endpointId
  );

  /**
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<String> deleteTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(
    @Path("extensionPoolId") String extensionPoolId
  );

  /**
   * Delete Outbound Route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<String> deleteTelephonyProvidersEdgesOutboundroutesOutboundrouteId(
    @Path("outboundRouteId") String outboundRouteId
  );

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<String> deleteTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId
  );

  /**
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<String> deleteTelephonyProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId
  );

  /**
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<String> deleteTelephonyProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId
  );

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<String> deleteTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
    @Path("trunkBaseSettingsId") String trunkBaseSettingsId
  );

  /**
   * Lists available schema categories
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<SchemaCategoryEntityListing>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext")
  Call<SchemaCategoryEntityListing> getConfigurationSchemasEdgesVnext(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * List schemas of a specific category
   * 
   * @param schemaCategory Schema category (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<SchemaReferenceEntityListing>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext/{schemaCategory}")
  Call<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemacategory(
    @Path("schemaCategory") String schemaCategory, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * List schemas of a specific category
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<SchemaReferenceEntityListing>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}")
  Call<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemacategorySchematype(
    @Path("schemaCategory") String schemaCategory, @Path("schemaType") String schemaType, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a json schema
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @return Call<Organization>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}")
  Call<Organization> getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaId(
    @Path("schemaCategory") String schemaCategory, @Path("schemaType") String schemaType, @Path("schemaId") String schemaId
  );

  /**
   * Get metadata for a schema
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @param extensionType extension (required)
   * @param metadataId Metadata ID (required)
   * @param type Type (optional)
   * @return Call<Organization>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId}")
  Call<Organization> getConfigurationSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(
    @Path("schemaCategory") String schemaCategory, @Path("schemaType") String schemaType, @Path("schemaId") String schemaId, @Path("extensionType") String extensionType, @Path("metadataId") String metadataId, @Query("type") String type
  );

  /**
   * Get the list of edges.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param edgeGroupId Filter by edgeGroup.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<EdgeEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges")
  Call<EdgeEntityListing> getTelephonyProvidersEdges(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("site.id") String siteId, @Query("edgeGroup.id") String edgeGroupId, @Query("sortBy") String sortBy
  );

  /**
   * Get the list of available languages.
   * 
   * @return Call<AvailableLanguageList>
   */
  
  @GET("api/v2/telephony/providers/edges/availablelanguages")
  Call<AvailableLanguageList> getTelephonyProvidersEdgesAvailablelanguages();
    

  /**
   * Get the list of certificate authorities.
   * 
   * @return Call<CertificateAuthorityEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/certificateauthorities")
  Call<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthorities();
    

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return Call<DomainCertificateAuthority>
   */
  
  @GET("api/v2/telephony/providers/edges/certificateauthorities/{certificateId}")
  Call<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthoritiesCertificateId(
    @Path("certificateId") String certificateId
  );

  /**
   * Get a listing of DID Pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @return Call<DIDPoolEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/didpools")
  Call<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpools(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy
  );

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return Call<DIDPool>
   */
  
  @GET("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<DIDPool> getTelephonyProvidersEdgesDidpoolsDidpoolId(
    @Path("didPoolId") String didPoolId
  );

  /**
   * Get a listing of DIDs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param phoneNumber Filter by phoneNumber (optional)
   * @return Call<DIDEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/dids")
  Call<DIDEntityListing> getTelephonyProvidersEdgesDids(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("phoneNumber") String phoneNumber
  );

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return Call<DID>
   */
  
  @GET("api/v2/telephony/providers/edges/dids/{didId}")
  Call<DID> getTelephonyProvidersEdgesDidsDidId(
    @Path("didId") String didId
  );

  /**
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<Edge>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}")
  Call<Edge> getTelephonyProvidersEdgesEdgeId(
    @Path("edgeId") String edgeId
  );

  /**
   * Get the list of lines.
   * 
   * @param edgeId Edge ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<EdgeLineEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/lines")
  Call<EdgeLineEntityListing> getTelephonyProvidersEdgesEdgeIdLines(
    @Path("edgeId") String edgeId, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get line
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @return Call<EdgeLine>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}")
  Call<EdgeLine> getTelephonyProvidersEdgesEdgeIdLinesLineId(
    @Path("edgeId") String edgeId, @Path("lineId") String lineId
  );

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @return Call<LogicalInterfaceEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces")
  Call<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesEdgeIdLogicalinterfaces(
    @Path("edgeId") String edgeId
  );

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return Call<DomainLogicalInterface>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}")
  Call<DomainLogicalInterface> getTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId
  );

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return Call<EdgeLogsJob>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}")
  Call<EdgeLogsJob> getTelephonyProvidersEdgesEdgeIdLogsJobsJobId(
    @Path("edgeId") String edgeId, @Path("jobId") String jobId
  );

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<PhysicalInterfaceEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces")
  Call<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgesEdgeIdPhysicalinterfaces(
    @Path("edgeId") String edgeId
  );

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return Call<DomainPhysicalInterface>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces/{interfaceId}")
  Call<DomainPhysicalInterface> getTelephonyProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId
  );

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<DomainEdgeSoftwareUpdateDto>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId
  );

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<DomainEdgeSoftwareVersionDto>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/softwareversions")
  Call<DomainEdgeSoftwareVersionDto> getTelephonyProvidersEdgesEdgeIdSoftwareversions(
    @Path("edgeId") String edgeId
  );

  /**
   * Get the list of edge groups.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<EdgeGroupEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/edgegroups")
  Call<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroups(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy
  );

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @return Call<EdgeGroup>
   */
  
  @GET("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<EdgeGroup> getTelephonyProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId
  );

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return Call<EdgeVersionReport>
   */
  
  @GET("api/v2/telephony/providers/edges/edgeversionreport")
  Call<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreport();
    

  /**
   * Get endpoints
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<EndpointEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/endpoints")
  Call<EndpointEntityListing> getTelephonyProvidersEdgesEndpoints(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy
  );

  /**
   * Get endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Call<Endpoint>
   */
  
  @GET("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<Endpoint> getTelephonyProvidersEdgesEndpointsEndpointId(
    @Path("endpointId") String endpointId
  );

  /**
   * Get a listing of extension pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to startNumber)
   * @param number Number (optional)
   * @return Call<ExtensionPoolEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/extensionpools")
  Call<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpools(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("number") String number
  );

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return Call<ExtensionPool>
   */
  
  @GET("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<ExtensionPool> getTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(
    @Path("extensionPoolId") String extensionPoolId
  );

  /**
   * Get a listing of extensions
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param number Filter by number (optional)
   * @return Call<ExtensionEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/extensions")
  Call<ExtensionEntityListing> getTelephonyProvidersEdgesExtensions(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("number") String number
  );

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Call<Extension>
   */
  
  @GET("api/v2/telephony/providers/edges/extensions/{extensionId}")
  Call<Extension> getTelephonyProvidersEdgesExtensionsExtensionId(
    @Path("extensionId") String extensionId
  );

  /**
   * Get a listing of line base settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @return Call<LineBaseEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/linebasesettings")
  Call<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettings(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return Call<LineBase>
   */
  
  @GET("api/v2/telephony/providers/edges/linebasesettings/{lineBaseId}")
  Call<LineBase> getTelephonyProvidersEdgesLinebasesettingsLinebaseId(
    @Path("lineBaseId") String lineBaseId
  );

  /**
   * Get a list of Lines
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return Call<LineEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/lines")
  Call<LineEntityListing> getTelephonyProvidersEdgesLines(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy, @Query("expand") List<String> expand
  );

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Call<Line>
   */
  
  @GET("api/v2/telephony/providers/edges/lines/{lineId}")
  Call<Line> getTelephonyProvidersEdgesLinesLineId(
    @Path("lineId") String lineId
  );

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Call<Line>
   */
  
  @GET("api/v2/telephony/providers/edges/lines/template")
  Call<Line> getTelephonyProvidersEdgesLinesTemplate(
    @Query("lineBaseSettingsId") String lineBaseSettingsId
  );

  /**
   * Get outbound routes
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return Call<OutboundRouteEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/outboundroutes")
  Call<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutes(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("site.id") String siteId, @Query("sortBy") String sortBy
  );

  /**
   * Get outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return Call<OutboundRoute>
   */
  
  @GET("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<OutboundRoute> getTelephonyProvidersEdgesOutboundroutesOutboundrouteId(
    @Path("outboundRouteId") String outboundRouteId
  );

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @return Call<PhoneBaseEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings")
  Call<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettings(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<PhoneMetaBaseEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings/availablemetabases")
  Call<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return Call<PhoneBase>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId
  );

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return Call<PhoneBase>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings/template")
  Call<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplate(
    @Query("phoneMetabaseId") String phoneMetabaseId
  );

  /**
   * Get a list of Phone Instances
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param siteId Filter by site.id (optional)
   * @param webRtcUserId Filter by webRtcUser.id (optional)
   * @param phoneBaseSettingsId Filter by phoneBaseSettings.id (optional)
   * @param linesLoggedInUserId Filter by lines.loggedInUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return Call<PhoneEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/phones")
  Call<PhoneEntityListing> getTelephonyProvidersEdgesPhones(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("site.id") String siteId, @Query("webRtcUser.id") String webRtcUserId, @Query("phoneBaseSettings.id") String phoneBaseSettingsId, @Query("lines.loggedInUser.id") String linesLoggedInUserId, @Query("phone_hardwareId") String phoneHardwareId, @Query("expand") List<String> expand, @Query("fields") List<String> fields
  );

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Call<Phone>
   */
  
  @GET("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<Phone> getTelephonyProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId
  );

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Call<Phone>
   */
  
  @GET("api/v2/telephony/providers/edges/phones/template")
  Call<Phone> getTelephonyProvidersEdgesPhonesTemplate(
    @Query("phoneBaseSettingsId") String phoneBaseSettingsId
  );

  /**
   * Get the list of Sites.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name (optional)
   * @param locationId Location Id (optional)
   * @return Call<SiteEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/sites")
  Call<SiteEntityListing> getTelephonyProvidersEdgesSites(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("name") String name, @Query("location.id") String locationId
  );

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Call<Site>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<Site> getTelephonyProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId
  );

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param siteId Site ID (required)
   * @return Call<List<NumberPlan>>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}/numberplans")
  Call<List<NumberPlan>> getTelephonyProvidersEdgesSitesSiteIdNumberplans(
    @Path("siteId") String siteId
  );

  /**
   * Get a list of Classifications for this Site
   * 
   * @param siteId Site ID (required)
   * @param classification Classification (optional)
   * @return Call<List<String>>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications")
  Call<List<String>> getTelephonyProvidersEdgesSitesSiteIdNumberplansClassifications(
    @Path("siteId") String siteId, @Query("classification") String classification
  );

  /**
   * Get a Number Plan by ID.
   * 
   * @param siteId Site ID (required)
   * @param numberPlanId Number Plan ID (required)
   * @return Call<NumberPlan>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}/numberplans/{numberPlanId}")
  Call<NumberPlan> getTelephonyProvidersEdgesSitesSiteIdNumberplansNumberplanId(
    @Path("siteId") String siteId, @Path("numberPlanId") String numberPlanId
  );

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param pageSize Page size (optional, default to 1000)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<TimeZoneEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/timezones")
  Call<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezones(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get Trunk Base Settings listing
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param recordingEnabled Filter trunks by recording enabled (optional)
   * @return Call<TrunkBase>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings")
  Call<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettings(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("recordingEnabled") Boolean recordingEnabled
  );

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param type  (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return Call<TrunkMetabaseEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings/availablemetabases")
  Call<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(
    @Query("type") String type, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return Call<TrunkBase>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings/template")
  Call<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplate(
    @Query("trunkMetabaseId") String trunkMetabaseId
  );

  /**
   * Get a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return Call<TrunkBase>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
    @Path("trunkBaseSettingsId") String trunkBaseSettingsId
  );

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param edgeId Filter by Edge Ids (optional)
   * @param trunkBaseId Filter by Trunk Base Ids (optional)
   * @param trunkType Filter by a Trunk type (optional)
   * @return Call<TrunkEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/trunks")
  Call<TrunkEntityListing> getTelephonyProvidersEdgesTrunks(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("edge.id") String edgeId, @Query("trunkBase.id") String trunkBaseId, @Query("trunkType") String trunkType
  );

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Call<Trunk>
   */
  
  @GET("api/v2/telephony/providers/edges/trunks/{trunkId}")
  Call<Trunk> getTelephonyProvidersEdgesTrunksTrunkId(
    @Path("trunkId") String trunkId
  );

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return Call<TrunkRecordingEnabledCount>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkswithrecording")
  Call<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecording(
    @Query("trunkType") String trunkType
  );

  /**
   * Create a edge.
   * 
   * @param body Edge (optional)
   * @return Call<Edge>
   */
  
  @POST("api/v2/telephony/providers/edges")
  Call<Edge> postTelephonyProvidersEdges(
    @Body Edge body
  );

  /**
   * Validates a street address
   * 
   * @param body  (optional)
   * @return Call<ValidateAddressResponse>
   */
  
  @POST("api/v2/telephony/providers/edges/addressvalidation")
  Call<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidation(
    @Body ValidateAddressRequest body
  );

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (optional)
   * @return Call<DomainCertificateAuthority>
   */
  
  @POST("api/v2/telephony/providers/edges/certificateauthorities")
  Call<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthorities(
    @Body DomainCertificateAuthority body
  );

  /**
   * Create a new DID pool
   * 
   * @param body  (optional)
   * @return Call<DIDPool>
   */
  
  @POST("api/v2/telephony/providers/edges/didpools")
  Call<DIDPool> postTelephonyProvidersEdgesDidpools(
    @Body DIDPool body
  );

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body  (optional)
   * @return Call<DomainLogicalInterface>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces")
  Call<DomainLogicalInterface> postTelephonyProvidersEdgesEdgeIdLogicalinterfaces(
    @Path("edgeId") String edgeId, @Body DomainLogicalInterface body
  );

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (optional)
   * @return Call<EdgeLogsJobResponse>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logs/jobs")
  Call<EdgeLogsJobResponse> postTelephonyProvidersEdgesEdgeIdLogsJobs(
    @Path("edgeId") String edgeId, @Body EdgeLogsJobRequest body
  );

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body  (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload")
  Call<Void> postTelephonyProvidersEdgesEdgeIdLogsJobsJobIdUpload(
    @Path("edgeId") String edgeId, @Path("jobId") String jobId, @Body EdgeLogsJobUploadRequest body
  );

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/reboot")
  Call<String> postTelephonyProvidersEdgesEdgeIdReboot(
    @Path("edgeId") String edgeId
  );

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body  (optional)
   * @return Call<DomainEdgeSoftwareUpdateDto>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId, @Body DomainEdgeSoftwareUpdateDto body
  );

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return Call<String>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/unpair")
  Call<String> postTelephonyProvidersEdgesEdgeIdUnpair(
    @Path("edgeId") String edgeId
  );

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (optional)
   * @return Call<EdgeGroup>
   */
  
  @POST("api/v2/telephony/providers/edges/edgegroups")
  Call<EdgeGroup> postTelephonyProvidersEdgesEdgegroups(
    @Body EdgeGroup body
  );

  /**
   * Create endpoint
   * 
   * @param body EndpointTemplate (optional)
   * @return Call<Endpoint>
   */
  
  @POST("api/v2/telephony/providers/edges/endpoints")
  Call<Endpoint> postTelephonyProvidersEdgesEndpoints(
    @Body Endpoint body
  );

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (optional)
   * @return Call<Extension>
   */
  
  @POST("api/v2/telephony/providers/edges/extensionpools")
  Call<Extension> postTelephonyProvidersEdgesExtensionpools(
    @Body ExtensionPool body
  );

  /**
   * Create outbound rule
   * 
   * @param body OutboundRoute (optional)
   * @return Call<OutboundRoute>
   */
  
  @POST("api/v2/telephony/providers/edges/outboundroutes")
  Call<OutboundRoute> postTelephonyProvidersEdgesOutboundroutes(
    @Body OutboundRoute body
  );

  /**
   * Create a new Phone Base Settings object
   * 
   * @param body  (optional)
   * @return Call<PhoneBase>
   */
  
  @POST("api/v2/telephony/providers/edges/phonebasesettings")
  Call<PhoneBase> postTelephonyProvidersEdgesPhonebasesettings(
    @Body PhoneBase body
  );

  /**
   * Create a new Phone
   * 
   * @param body  (optional)
   * @return Call<Phone>
   */
  
  @POST("api/v2/telephony/providers/edges/phones")
  Call<Phone> postTelephonyProvidersEdgesPhones(
    @Body Phone body
  );

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/phones/{phoneId}/reboot")
  Call<Void> postTelephonyProvidersEdgesPhonesPhoneIdReboot(
    @Path("phoneId") String phoneId
  );

  /**
   * Reboot Multiple Phones
   * 
   * @param body body (optional)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/phones/reboot")
  Call<Void> postTelephonyProvidersEdgesPhonesReboot(
    @Body PhonesReboot body
  );

  /**
   * Create a Site.
   * 
   * @param body Site (optional)
   * @return Call<Site>
   */
  
  @POST("api/v2/telephony/providers/edges/sites")
  Call<Site> postTelephonyProvidersEdgesSites(
    @Body Site body
  );

  /**
   * Triggers the rebalance operation.
   * 
   * @param siteId Site ID (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/sites/{siteId}/rebalance")
  Call<Void> postTelephonyProvidersEdgesSitesSiteIdRebalance(
    @Path("siteId") String siteId
  );

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body  (optional)
   * @return Call<TrunkBase>
   */
  
  @POST("api/v2/telephony/providers/edges/trunkbasesettings")
  Call<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettings(
    @Body TrunkBase body
  );

  /**
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body  (optional)
   * @return Call<DomainCertificateAuthority>
   */
  
  @PUT("api/v2/telephony/providers/edges/certificateauthorities/{certificateId}")
  Call<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthoritiesCertificateId(
    @Path("certificateId") String certificateId, @Body DomainCertificateAuthority body
  );

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body  (optional)
   * @return Call<DIDPool>
   */
  
  @PUT("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<DIDPool> putTelephonyProvidersEdgesDidpoolsDidpoolId(
    @Path("didPoolId") String didPoolId, @Body DIDPool body
  );

  /**
   * Update a DID by ID.
   * 
   * @param didId DID ID (required)
   * @param body  (optional)
   * @return Call<DID>
   */
  
  @PUT("api/v2/telephony/providers/edges/dids/{didId}")
  Call<DID> putTelephonyProvidersEdgesDidsDidId(
    @Path("didId") String didId, @Body DID body
  );

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (optional)
   * @return Call<Edge>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}")
  Call<Edge> putTelephonyProvidersEdgesEdgeId(
    @Path("edgeId") String edgeId, @Body Edge body
  );

  /**
   * Update a line.
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @param body Line (optional)
   * @return Call<EdgeLine>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}")
  Call<EdgeLine> putTelephonyProvidersEdgesEdgeIdLinesLineId(
    @Path("edgeId") String edgeId, @Path("lineId") String lineId, @Body EdgeLine body
  );

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body  (optional)
   * @return Call<DomainLogicalInterface>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}")
  Call<DomainLogicalInterface> putTelephonyProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId, @Body DomainLogicalInterface body
  );

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (optional)
   * @return Call<EdgeGroup>
   */
  
  @PUT("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<EdgeGroup> putTelephonyProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId, @Body EdgeGroup body
  );

  /**
   * Update endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @param body EndpointTemplate (optional)
   * @return Call<Endpoint>
   */
  
  @PUT("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<Endpoint> putTelephonyProvidersEdgesEndpointsEndpointId(
    @Path("endpointId") String endpointId, @Body Endpoint body
  );

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (optional)
   * @return Call<ExtensionPool>
   */
  
  @PUT("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<ExtensionPool> putTelephonyProvidersEdgesExtensionpoolsExtensionpoolId(
    @Path("extensionPoolId") String extensionPoolId, @Body ExtensionPool body
  );

  /**
   * Update an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @param body  (optional)
   * @return Call<Extension>
   */
  
  @PUT("api/v2/telephony/providers/edges/extensions/{extensionId}")
  Call<Extension> putTelephonyProvidersEdgesExtensionsExtensionId(
    @Path("extensionId") String extensionId, @Body Extension body
  );

  /**
   * Update outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (optional)
   * @return Call<OutboundRoute>
   */
  
  @PUT("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<OutboundRoute> putTelephonyProvidersEdgesOutboundroutesOutboundrouteId(
    @Path("outboundRouteId") String outboundRouteId, @Body OutboundRoute body
  );

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body  (optional)
   * @return Call<PhoneBase>
   */
  
  @PUT("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<PhoneBase> putTelephonyProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId, @Body PhoneBase body
  );

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body  (optional)
   * @return Call<Phone>
   */
  
  @PUT("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<Phone> putTelephonyProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId, @Body Phone body
  );

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (optional)
   * @return Call<Site>
   */
  
  @PUT("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<Site> putTelephonyProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId, @Body Site body
  );

  /**
   * Update the list of Number Plans.
   * 
   * @param siteId Site ID (required)
   * @param body  (optional)
   * @return Call<List<NumberPlan>>
   */
  
  @PUT("api/v2/telephony/providers/edges/sites/{siteId}/numberplans")
  Call<List<NumberPlan>> putTelephonyProvidersEdgesSitesSiteIdNumberplans(
    @Path("siteId") String siteId, @Body List<NumberPlan> body
  );

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body  (optional)
   * @return Call<TrunkBase>
   */
  
  @PUT("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<TrunkBase> putTelephonyProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
    @Path("trunkBaseSettingsId") String trunkBaseSettingsId, @Body TrunkBase body
  );

}
