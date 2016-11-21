package com.mypurecloud.sdk.api;

import com.mypurecloud.sdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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
  Call<String> deleteProvidersEdgesCertificateauthoritiesCertificateId(
    @Path("certificateId") String certificateId
  );

  /**
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<String> deleteProvidersEdgesDidpoolsDidpoolId(
    @Path("didPoolId") String didPoolId
  );

  /**
   * Delete a edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/{edgeId}")
  Call<String> deleteProvidersEdgesEdgeId(
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
  Call<Void> deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId
  );

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<String> deleteProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId
  );

  /**
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<String> deleteProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId
  );

  /**
   * Delete endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<String> deleteProvidersEdgesEndpointsEndpointId(
    @Path("endpointId") String endpointId
  );

  /**
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<String> deleteProvidersEdgesExtensionpoolsExtensionpoolId(
    @Path("extensionPoolId") String extensionPoolId
  );

  /**
   * Delete Outbound Route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<String> deleteProvidersEdgesOutboundroutesOutboundrouteId(
    @Path("outboundRouteId") String outboundRouteId
  );

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<String> deleteProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId
  );

  /**
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<String> deleteProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId
  );

  /**
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<String> deleteProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId
  );

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return Call<String>
   */
  
  @DELETE("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<String> deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
    @Path("trunkBaseSettingsId") String trunkBaseSettingsId
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
  Call<EdgeEntityListing> getProvidersEdges(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("site.id") String siteId, @Query("edgeGroup.id") String edgeGroupId, @Query("sortBy") String sortBy
  );

  /**
   * Get the list of available languages.
   * 
   * @return Call<AvailableLanguageList>
   */
  
  @GET("api/v2/telephony/providers/edges/availablelanguages")
  Call<AvailableLanguageList> getProvidersEdgesAvailablelanguages();
    

  /**
   * Get the list of certificate authorities.
   * 
   * @return Call<CertificateAuthorityEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/certificateauthorities")
  Call<CertificateAuthorityEntityListing> getProvidersEdgesCertificateauthorities();
    

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return Call<DomainCertificateAuthority>
   */
  
  @GET("api/v2/telephony/providers/edges/certificateauthorities/{certificateId}")
  Call<DomainCertificateAuthority> getProvidersEdgesCertificateauthoritiesCertificateId(
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
  Call<DIDPoolEntityListing> getProvidersEdgesDidpools(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy
  );

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return Call<DIDPool>
   */
  
  @GET("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<DIDPool> getProvidersEdgesDidpoolsDidpoolId(
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
  Call<DIDEntityListing> getProvidersEdgesDids(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("phoneNumber") String phoneNumber
  );

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return Call<DID>
   */
  
  @GET("api/v2/telephony/providers/edges/dids/{didId}")
  Call<DID> getProvidersEdgesDidsDidId(
    @Path("didId") String didId
  );

  /**
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<Edge>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}")
  Call<Edge> getProvidersEdgesEdgeId(
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
  Call<EdgeLineEntityListing> getProvidersEdgesEdgeIdLines(
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
  Call<EdgeLine> getProvidersEdgesEdgeIdLinesLineId(
    @Path("edgeId") String edgeId, @Path("lineId") String lineId
  );

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @param expand Field to expand in the response (optional)
   * @return Call<LogicalInterfaceEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces")
  Call<LogicalInterfaceEntityListing> getProvidersEdgesEdgeIdLogicalinterfaces(
    @Path("edgeId") String edgeId, @Query("expand") List<String> expand
  );

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param expand Field to expand in the response (optional)
   * @return Call<DomainLogicalInterface>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}")
  Call<DomainLogicalInterface> getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId, @Query("expand") List<String> expand
  );

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return Call<EdgeLogsJob>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}")
  Call<EdgeLogsJob> getProvidersEdgesEdgeIdLogsJobsJobId(
    @Path("edgeId") String edgeId, @Path("jobId") String jobId
  );

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<PhysicalInterfaceEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces")
  Call<PhysicalInterfaceEntityListing> getProvidersEdgesEdgeIdPhysicalinterfaces(
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
  Call<DomainPhysicalInterface> getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId
  );

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<DomainEdgeSoftwareUpdateDto>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<DomainEdgeSoftwareUpdateDto> getProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId
  );

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return Call<DomainEdgeSoftwareVersionDto>
   */
  
  @GET("api/v2/telephony/providers/edges/{edgeId}/softwareversions")
  Call<DomainEdgeSoftwareVersionDto> getProvidersEdgesEdgeIdSoftwareversions(
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
  Call<EdgeGroupEntityListing> getProvidersEdgesEdgegroups(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy
  );

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param expand Fields to expand in the response (optional)
   * @return Call<EdgeGroup>
   */
  
  @GET("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<EdgeGroup> getProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId, @Query("expand") List<String> expand
  );

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return Call<EdgeVersionReport>
   */
  
  @GET("api/v2/telephony/providers/edges/edgeversionreport")
  Call<EdgeVersionReport> getProvidersEdgesEdgeversionreport();
    

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
  Call<EndpointEntityListing> getProvidersEdgesEndpoints(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy
  );

  /**
   * Get endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Call<Endpoint>
   */
  
  @GET("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<Endpoint> getProvidersEdgesEndpointsEndpointId(
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
  Call<ExtensionPoolEntityListing> getProvidersEdgesExtensionpools(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("number") String number
  );

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return Call<ExtensionPool>
   */
  
  @GET("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<ExtensionPool> getProvidersEdgesExtensionpoolsExtensionpoolId(
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
  Call<ExtensionEntityListing> getProvidersEdgesExtensions(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("number") String number
  );

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Call<Extension>
   */
  
  @GET("api/v2/telephony/providers/edges/extensions/{extensionId}")
  Call<Extension> getProvidersEdgesExtensionsExtensionId(
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
  Call<LineBaseEntityListing> getProvidersEdgesLinebasesettings(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder
  );

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return Call<LineBase>
   */
  
  @GET("api/v2/telephony/providers/edges/linebasesettings/{lineBaseId}")
  Call<LineBase> getProvidersEdgesLinebasesettingsLinebaseId(
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
  Call<LineEntityListing> getProvidersEdgesLines(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("sortBy") String sortBy, @Query("expand") List<String> expand
  );

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Call<Line>
   */
  
  @GET("api/v2/telephony/providers/edges/lines/{lineId}")
  Call<Line> getProvidersEdgesLinesLineId(
    @Path("lineId") String lineId
  );

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Call<Line>
   */
  
  @GET("api/v2/telephony/providers/edges/lines/template")
  Call<Line> getProvidersEdgesLinesTemplate(
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
  Call<OutboundRouteEntityListing> getProvidersEdgesOutboundroutes(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("name") String name, @Query("site.id") String siteId, @Query("sortBy") String sortBy
  );

  /**
   * Get outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return Call<OutboundRoute>
   */
  
  @GET("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<OutboundRoute> getProvidersEdgesOutboundroutesOutboundrouteId(
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
  Call<PhoneBaseEntityListing> getProvidersEdgesPhonebasesettings(
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
  Call<PhoneMetaBaseEntityListing> getProvidersEdgesPhonebasesettingsAvailablemetabases(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return Call<PhoneBase>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<PhoneBase> getProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId
  );

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return Call<PhoneBase>
   */
  
  @GET("api/v2/telephony/providers/edges/phonebasesettings/template")
  Call<PhoneBase> getProvidersEdgesPhonebasesettingsTemplate(
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
   * @param linesDefaultForUserId Filter by lines.defaultForUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param linesId Filter by lines.id (optional)
   * @param linesName Filter by lines.name (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return Call<PhoneEntityListing>
   */
  
  @GET("api/v2/telephony/providers/edges/phones")
  Call<PhoneEntityListing> getProvidersEdgesPhones(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("site.id") String siteId, @Query("webRtcUser.id") String webRtcUserId, @Query("phoneBaseSettings.id") String phoneBaseSettingsId, @Query("lines.loggedInUser.id") String linesLoggedInUserId, @Query("lines.defaultForUser.id") String linesDefaultForUserId, @Query("phone_hardwareId") String phoneHardwareId, @Query("lines.id") String linesId, @Query("lines.name") String linesName, @Query("expand") List<String> expand, @Query("fields") List<String> fields
  );

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Call<Phone>
   */
  
  @GET("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<Phone> getProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId
  );

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Call<Phone>
   */
  
  @GET("api/v2/telephony/providers/edges/phones/template")
  Call<Phone> getProvidersEdgesPhonesTemplate(
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
  Call<SiteEntityListing> getProvidersEdgesSites(
    @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("name") String name, @Query("location.id") String locationId
  );

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Call<Site>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<Site> getProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId
  );

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param siteId Site ID (required)
   * @return Call<List<NumberPlan>>
   */
  
  @GET("api/v2/telephony/providers/edges/sites/{siteId}/numberplans")
  Call<List<NumberPlan>> getProvidersEdgesSitesSiteIdNumberplans(
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
  Call<List<String>> getProvidersEdgesSitesSiteIdNumberplansClassifications(
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
  Call<NumberPlan> getProvidersEdgesSitesSiteIdNumberplansNumberplanId(
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
  Call<TimeZoneEntityListing> getProvidersEdgesTimezones(
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
  Call<TrunkBase> getProvidersEdgesTrunkbasesettings(
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
  Call<TrunkMetabaseEntityListing> getProvidersEdgesTrunkbasesettingsAvailablemetabases(
    @Query("type") String type, @Query("pageSize") Integer pageSize, @Query("pageNumber") Integer pageNumber
  );

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return Call<TrunkBase>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings/template")
  Call<TrunkBase> getProvidersEdgesTrunkbasesettingsTemplate(
    @Query("trunkMetabaseId") String trunkMetabaseId
  );

  /**
   * Get a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return Call<TrunkBase>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<TrunkBase> getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
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
  Call<TrunkEntityListing> getProvidersEdgesTrunks(
    @Query("pageNumber") Integer pageNumber, @Query("pageSize") Integer pageSize, @Query("sortBy") String sortBy, @Query("sortOrder") String sortOrder, @Query("edge.id") String edgeId, @Query("trunkBase.id") String trunkBaseId, @Query("trunkType") String trunkType
  );

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Call<Trunk>
   */
  
  @GET("api/v2/telephony/providers/edges/trunks/{trunkId}")
  Call<Trunk> getProvidersEdgesTrunksTrunkId(
    @Path("trunkId") String trunkId
  );

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return Call<TrunkRecordingEnabledCount>
   */
  
  @GET("api/v2/telephony/providers/edges/trunkswithrecording")
  Call<TrunkRecordingEnabledCount> getProvidersEdgesTrunkswithrecording(
    @Query("trunkType") String trunkType
  );

  /**
   * Lists available schema categories
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return Call<SchemaCategoryEntityListing>
   */
  
  @GET("api/v2/configuration/schemas/edges/vnext")
  Call<SchemaCategoryEntityListing> getSchemasEdgesVnext(
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
  Call<SchemaReferenceEntityListing> getSchemasEdgesVnextSchemacategory(
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
  Call<SchemaReferenceEntityListing> getSchemasEdgesVnextSchemacategorySchematype(
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
  Call<Organization> getSchemasEdgesVnextSchemacategorySchematypeSchemaId(
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
  Call<Organization> getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(
    @Path("schemaCategory") String schemaCategory, @Path("schemaType") String schemaType, @Path("schemaId") String schemaId, @Path("extensionType") String extensionType, @Path("metadataId") String metadataId, @Query("type") String type
  );

  /**
   * Create an edge.
   * 
   * @param body Edge (required)
   * @return Call<Edge>
   */
  
  @POST("api/v2/telephony/providers/edges")
  Call<Edge> postProvidersEdges(
    @Body Edge body
  );

  /**
   * Validates a street address
   * 
   * @param body Address (required)
   * @return Call<ValidateAddressResponse>
   */
  
  @POST("api/v2/telephony/providers/edges/addressvalidation")
  Call<ValidateAddressResponse> postProvidersEdgesAddressvalidation(
    @Body ValidateAddressRequest body
  );

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (required)
   * @return Call<DomainCertificateAuthority>
   */
  
  @POST("api/v2/telephony/providers/edges/certificateauthorities")
  Call<DomainCertificateAuthority> postProvidersEdgesCertificateauthorities(
    @Body DomainCertificateAuthority body
  );

  /**
   * Create a new DID pool
   * 
   * @param body DID pool (required)
   * @return Call<DIDPool>
   */
  
  @POST("api/v2/telephony/providers/edges/didpools")
  Call<DIDPool> postProvidersEdgesDidpools(
    @Body DIDPool body
  );

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body Logical interface (required)
   * @return Call<DomainLogicalInterface>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces")
  Call<DomainLogicalInterface> postProvidersEdgesEdgeIdLogicalinterfaces(
    @Path("edgeId") String edgeId, @Body DomainLogicalInterface body
  );

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (required)
   * @return Call<EdgeLogsJobResponse>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logs/jobs")
  Call<EdgeLogsJobResponse> postProvidersEdgesEdgeIdLogsJobs(
    @Path("edgeId") String edgeId, @Body EdgeLogsJobRequest body
  );

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body Log upload request (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload")
  Call<Void> postProvidersEdgesEdgeIdLogsJobsJobIdUpload(
    @Path("edgeId") String edgeId, @Path("jobId") String jobId, @Body EdgeLogsJobUploadRequest body
  );

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @return Call<String>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/reboot")
  Call<String> postProvidersEdgesEdgeIdReboot(
    @Path("edgeId") String edgeId
  );

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Software update request (required)
   * @return Call<DomainEdgeSoftwareUpdateDto>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/softwareupdate")
  Call<DomainEdgeSoftwareUpdateDto> postProvidersEdgesEdgeIdSoftwareupdate(
    @Path("edgeId") String edgeId, @Body DomainEdgeSoftwareUpdateDto body
  );

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return Call<String>
   */
  
  @POST("api/v2/telephony/providers/edges/{edgeId}/unpair")
  Call<String> postProvidersEdgesEdgeIdUnpair(
    @Path("edgeId") String edgeId
  );

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (required)
   * @return Call<EdgeGroup>
   */
  
  @POST("api/v2/telephony/providers/edges/edgegroups")
  Call<EdgeGroup> postProvidersEdgesEdgegroups(
    @Body EdgeGroup body
  );

  /**
   * Create endpoint
   * 
   * @param body EndpointTemplate (required)
   * @return Call<Endpoint>
   */
  
  @POST("api/v2/telephony/providers/edges/endpoints")
  Call<Endpoint> postProvidersEdgesEndpoints(
    @Body Endpoint body
  );

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (required)
   * @return Call<Extension>
   */
  
  @POST("api/v2/telephony/providers/edges/extensionpools")
  Call<Extension> postProvidersEdgesExtensionpools(
    @Body ExtensionPool body
  );

  /**
   * Create outbound rule
   * 
   * @param body OutboundRoute (required)
   * @return Call<OutboundRoute>
   */
  
  @POST("api/v2/telephony/providers/edges/outboundroutes")
  Call<OutboundRoute> postProvidersEdgesOutboundroutes(
    @Body OutboundRoute body
  );

  /**
   * Create a new Phone Base Settings object
   * 
   * @param body Phone base settings (required)
   * @return Call<PhoneBase>
   */
  
  @POST("api/v2/telephony/providers/edges/phonebasesettings")
  Call<PhoneBase> postProvidersEdgesPhonebasesettings(
    @Body PhoneBase body
  );

  /**
   * Create a new Phone
   * 
   * @param body Phone (required)
   * @return Call<Phone>
   */
  
  @POST("api/v2/telephony/providers/edges/phones")
  Call<Phone> postProvidersEdgesPhones(
    @Body Phone body
  );

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/phones/{phoneId}/reboot")
  Call<Void> postProvidersEdgesPhonesPhoneIdReboot(
    @Path("phoneId") String phoneId
  );

  /**
   * Reboot Multiple Phones
   * 
   * @param body Phones (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/phones/reboot")
  Call<Void> postProvidersEdgesPhonesReboot(
    @Body PhonesReboot body
  );

  /**
   * Create a Site.
   * 
   * @param body Site (required)
   * @return Call<Site>
   */
  
  @POST("api/v2/telephony/providers/edges/sites")
  Call<Site> postProvidersEdgesSites(
    @Body Site body
  );

  /**
   * Triggers the rebalance operation.
   * 
   * @param siteId Site ID (required)
   * @return Call<Void>
   */
  
  @POST("api/v2/telephony/providers/edges/sites/{siteId}/rebalance")
  Call<Void> postProvidersEdgesSitesSiteIdRebalance(
    @Path("siteId") String siteId
  );

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body Trunk base settings (required)
   * @return Call<TrunkBase>
   */
  
  @POST("api/v2/telephony/providers/edges/trunkbasesettings")
  Call<TrunkBase> postProvidersEdgesTrunkbasesettings(
    @Body TrunkBase body
  );

  /**
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body Certificate authority (required)
   * @return Call<DomainCertificateAuthority>
   */
  
  @PUT("api/v2/telephony/providers/edges/certificateauthorities/{certificateId}")
  Call<DomainCertificateAuthority> putProvidersEdgesCertificateauthoritiesCertificateId(
    @Path("certificateId") String certificateId, @Body DomainCertificateAuthority body
  );

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body DID pool (required)
   * @return Call<DIDPool>
   */
  
  @PUT("api/v2/telephony/providers/edges/didpools/{didPoolId}")
  Call<DIDPool> putProvidersEdgesDidpoolsDidpoolId(
    @Path("didPoolId") String didPoolId, @Body DIDPool body
  );

  /**
   * Update a DID by ID.
   * 
   * @param didId DID ID (required)
   * @param body DID (required)
   * @return Call<DID>
   */
  
  @PUT("api/v2/telephony/providers/edges/dids/{didId}")
  Call<DID> putProvidersEdgesDidsDidId(
    @Path("didId") String didId, @Body DID body
  );

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (required)
   * @return Call<Edge>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}")
  Call<Edge> putProvidersEdgesEdgeId(
    @Path("edgeId") String edgeId, @Body Edge body
  );

  /**
   * Update a line.
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @param body Line (required)
   * @return Call<EdgeLine>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}")
  Call<EdgeLine> putProvidersEdgesEdgeIdLinesLineId(
    @Path("edgeId") String edgeId, @Path("lineId") String lineId, @Body EdgeLine body
  );

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body Logical interface (required)
   * @return Call<DomainLogicalInterface>
   */
  
  @PUT("api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}")
  Call<DomainLogicalInterface> putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(
    @Path("edgeId") String edgeId, @Path("interfaceId") String interfaceId, @Body DomainLogicalInterface body
  );

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (required)
   * @return Call<EdgeGroup>
   */
  
  @PUT("api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}")
  Call<EdgeGroup> putProvidersEdgesEdgegroupsEdgegroupId(
    @Path("edgeGroupId") String edgeGroupId, @Body EdgeGroup body
  );

  /**
   * Update endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @param body EndpointTemplate (required)
   * @return Call<Endpoint>
   */
  
  @PUT("api/v2/telephony/providers/edges/endpoints/{endpointId}")
  Call<Endpoint> putProvidersEdgesEndpointsEndpointId(
    @Path("endpointId") String endpointId, @Body Endpoint body
  );

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (required)
   * @return Call<ExtensionPool>
   */
  
  @PUT("api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}")
  Call<ExtensionPool> putProvidersEdgesExtensionpoolsExtensionpoolId(
    @Path("extensionPoolId") String extensionPoolId, @Body ExtensionPool body
  );

  /**
   * Update an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @param body Extension (required)
   * @return Call<Extension>
   */
  
  @PUT("api/v2/telephony/providers/edges/extensions/{extensionId}")
  Call<Extension> putProvidersEdgesExtensionsExtensionId(
    @Path("extensionId") String extensionId, @Body Extension body
  );

  /**
   * Update outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return Call<OutboundRoute>
   */
  
  @PUT("api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}")
  Call<OutboundRoute> putProvidersEdgesOutboundroutesOutboundrouteId(
    @Path("outboundRouteId") String outboundRouteId, @Body OutboundRoute body
  );

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body Phone base settings (required)
   * @return Call<PhoneBase>
   */
  
  @PUT("api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}")
  Call<PhoneBase> putProvidersEdgesPhonebasesettingsPhonebaseId(
    @Path("phoneBaseId") String phoneBaseId, @Body PhoneBase body
  );

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body Phone (required)
   * @return Call<Phone>
   */
  
  @PUT("api/v2/telephony/providers/edges/phones/{phoneId}")
  Call<Phone> putProvidersEdgesPhonesPhoneId(
    @Path("phoneId") String phoneId, @Body Phone body
  );

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return Call<Site>
   */
  
  @PUT("api/v2/telephony/providers/edges/sites/{siteId}")
  Call<Site> putProvidersEdgesSitesSiteId(
    @Path("siteId") String siteId, @Body Site body
  );

  /**
   * Update the list of Number Plans.
   * 
   * @param siteId Site ID (required)
   * @param body List of number plans (required)
   * @return Call<List<NumberPlan>>
   */
  
  @PUT("api/v2/telephony/providers/edges/sites/{siteId}/numberplans")
  Call<List<NumberPlan>> putProvidersEdgesSitesSiteIdNumberplans(
    @Path("siteId") String siteId, @Body List<NumberPlan> body
  );

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body Trunk base settings (required)
   * @return Call<TrunkBase>
   */
  
  @PUT("api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}")
  Call<TrunkBase> putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(
    @Path("trunkBaseSettingsId") String trunkBaseSettingsId, @Body TrunkBase body
  );

}
