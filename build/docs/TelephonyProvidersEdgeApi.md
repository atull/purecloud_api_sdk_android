# TelephonyProvidersEdgeApi

All URIs are relative to *https://api.mypurecloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProvidersEdgesCertificateauthoritiesCertificateId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesCertificateauthoritiesCertificateId) | **DELETE** api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Delete a certificate authority.
[**deleteProvidersEdgesDidpoolsDidpoolId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesDidpoolsDidpoolId) | **DELETE** api/v2/telephony/providers/edges/didpools/{didPoolId} | Delete a DID Pool by ID.
[**deleteProvidersEdgesEdgeId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesEdgeId) | **DELETE** api/v2/telephony/providers/edges/{edgeId} | Delete a edge.
[**deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId) | **DELETE** api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Delete an edge logical interface
[**deleteProvidersEdgesEdgeIdSoftwareupdate**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesEdgeIdSoftwareupdate) | **DELETE** api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Cancels any in-progress update for this edge.
[**deleteProvidersEdgesEdgegroupsEdgegroupId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesEdgegroupsEdgegroupId) | **DELETE** api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Delete an edge group.
[**deleteProvidersEdgesEndpointsEndpointId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesEndpointsEndpointId) | **DELETE** api/v2/telephony/providers/edges/endpoints/{endpointId} | Delete endpoint
[**deleteProvidersEdgesExtensionpoolsExtensionpoolId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesExtensionpoolsExtensionpoolId) | **DELETE** api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Delete an extension pool by ID
[**deleteProvidersEdgesOutboundroutesOutboundrouteId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesOutboundroutesOutboundrouteId) | **DELETE** api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Delete Outbound Route
[**deleteProvidersEdgesPhonebasesettingsPhonebaseId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesPhonebasesettingsPhonebaseId) | **DELETE** api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Delete a Phone Base Settings by ID
[**deleteProvidersEdgesPhonesPhoneId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesPhonesPhoneId) | **DELETE** api/v2/telephony/providers/edges/phones/{phoneId} | Delete a Phone by ID
[**deleteProvidersEdgesSitesSiteId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesSitesSiteId) | **DELETE** api/v2/telephony/providers/edges/sites/{siteId} | Delete a Site by ID
[**deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**](TelephonyProvidersEdgeApi.md#deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId) | **DELETE** api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Delete a Trunk Base Settings object by ID
[**getProvidersEdges**](TelephonyProvidersEdgeApi.md#getProvidersEdges) | **GET** api/v2/telephony/providers/edges | Get the list of edges.
[**getProvidersEdgesAvailablelanguages**](TelephonyProvidersEdgeApi.md#getProvidersEdgesAvailablelanguages) | **GET** api/v2/telephony/providers/edges/availablelanguages | Get the list of available languages.
[**getProvidersEdgesCertificateauthorities**](TelephonyProvidersEdgeApi.md#getProvidersEdgesCertificateauthorities) | **GET** api/v2/telephony/providers/edges/certificateauthorities | Get the list of certificate authorities.
[**getProvidersEdgesCertificateauthoritiesCertificateId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesCertificateauthoritiesCertificateId) | **GET** api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Get a certificate authority.
[**getProvidersEdgesDidpools**](TelephonyProvidersEdgeApi.md#getProvidersEdgesDidpools) | **GET** api/v2/telephony/providers/edges/didpools | Get a listing of DID Pools
[**getProvidersEdgesDidpoolsDidpoolId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesDidpoolsDidpoolId) | **GET** api/v2/telephony/providers/edges/didpools/{didPoolId} | Get a DID Pool by ID.
[**getProvidersEdgesDids**](TelephonyProvidersEdgeApi.md#getProvidersEdgesDids) | **GET** api/v2/telephony/providers/edges/dids | Get a listing of DIDs
[**getProvidersEdgesDidsDidId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesDidsDidId) | **GET** api/v2/telephony/providers/edges/dids/{didId} | Get a DID by ID.
[**getProvidersEdgesEdgeId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeId) | **GET** api/v2/telephony/providers/edges/{edgeId} | Get edge.
[**getProvidersEdgesEdgeIdLines**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdLines) | **GET** api/v2/telephony/providers/edges/{edgeId}/lines | Get the list of lines.
[**getProvidersEdgesEdgeIdLinesLineId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdLinesLineId) | **GET** api/v2/telephony/providers/edges/{edgeId}/lines/{lineId} | Get line
[**getProvidersEdgesEdgeIdLogicalinterfaces**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdLogicalinterfaces) | **GET** api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces | Get edge logical interfaces.
[**getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId) | **GET** api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Get an edge logical interface
[**getProvidersEdgesEdgeIdLogsJobsJobId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdLogsJobsJobId) | **GET** api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId} | Get an Edge logs job.
[**getProvidersEdgesEdgeIdPhysicalinterfaces**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdPhysicalinterfaces) | **GET** api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces | Retrieve a list of all configured physical interfaces from a specific edge.
[**getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId) | **GET** api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces/{interfaceId} | Get edge physical interface.
[**getProvidersEdgesEdgeIdSoftwareupdate**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdSoftwareupdate) | **GET** api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Gets software update status information about any edge.
[**getProvidersEdgesEdgeIdSoftwareversions**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeIdSoftwareversions) | **GET** api/v2/telephony/providers/edges/{edgeId}/softwareversions | Gets all the available software versions for this edge.
[**getProvidersEdgesEdgegroups**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgegroups) | **GET** api/v2/telephony/providers/edges/edgegroups | Get the list of edge groups.
[**getProvidersEdgesEdgegroupsEdgegroupId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgegroupsEdgegroupId) | **GET** api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Get edge group.
[**getProvidersEdgesEdgeversionreport**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEdgeversionreport) | **GET** api/v2/telephony/providers/edges/edgeversionreport | Get the edge version report.
[**getProvidersEdgesEndpoints**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEndpoints) | **GET** api/v2/telephony/providers/edges/endpoints | Get endpoints
[**getProvidersEdgesEndpointsEndpointId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesEndpointsEndpointId) | **GET** api/v2/telephony/providers/edges/endpoints/{endpointId} | Get endpoint
[**getProvidersEdgesExtensionpools**](TelephonyProvidersEdgeApi.md#getProvidersEdgesExtensionpools) | **GET** api/v2/telephony/providers/edges/extensionpools | Get a listing of extension pools
[**getProvidersEdgesExtensionpoolsExtensionpoolId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesExtensionpoolsExtensionpoolId) | **GET** api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Get an extension pool by ID
[**getProvidersEdgesExtensions**](TelephonyProvidersEdgeApi.md#getProvidersEdgesExtensions) | **GET** api/v2/telephony/providers/edges/extensions | Get a listing of extensions
[**getProvidersEdgesExtensionsExtensionId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesExtensionsExtensionId) | **GET** api/v2/telephony/providers/edges/extensions/{extensionId} | Get an extension by ID.
[**getProvidersEdgesLinebasesettings**](TelephonyProvidersEdgeApi.md#getProvidersEdgesLinebasesettings) | **GET** api/v2/telephony/providers/edges/linebasesettings | Get a listing of line base settings objects
[**getProvidersEdgesLinebasesettingsLinebaseId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesLinebasesettingsLinebaseId) | **GET** api/v2/telephony/providers/edges/linebasesettings/{lineBaseId} | Get a line base settings object by ID
[**getProvidersEdgesLines**](TelephonyProvidersEdgeApi.md#getProvidersEdgesLines) | **GET** api/v2/telephony/providers/edges/lines | Get a list of Lines
[**getProvidersEdgesLinesLineId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesLinesLineId) | **GET** api/v2/telephony/providers/edges/lines/{lineId} | Get a Line by ID
[**getProvidersEdgesLinesTemplate**](TelephonyProvidersEdgeApi.md#getProvidersEdgesLinesTemplate) | **GET** api/v2/telephony/providers/edges/lines/template | Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
[**getProvidersEdgesOutboundroutes**](TelephonyProvidersEdgeApi.md#getProvidersEdgesOutboundroutes) | **GET** api/v2/telephony/providers/edges/outboundroutes | Get outbound routes
[**getProvidersEdgesOutboundroutesOutboundrouteId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesOutboundroutesOutboundrouteId) | **GET** api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Get outbound route
[**getProvidersEdgesPhonebasesettings**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonebasesettings) | **GET** api/v2/telephony/providers/edges/phonebasesettings | Get a list of Phone Base Settings objects
[**getProvidersEdgesPhonebasesettingsAvailablemetabases**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonebasesettingsAvailablemetabases) | **GET** api/v2/telephony/providers/edges/phonebasesettings/availablemetabases | Get a list of available makes and models to create a new Phone Base Settings
[**getProvidersEdgesPhonebasesettingsPhonebaseId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonebasesettingsPhonebaseId) | **GET** api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Get a Phone Base Settings object by ID
[**getProvidersEdgesPhonebasesettingsTemplate**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonebasesettingsTemplate) | **GET** api/v2/telephony/providers/edges/phonebasesettings/template | Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
[**getProvidersEdgesPhones**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhones) | **GET** api/v2/telephony/providers/edges/phones | Get a list of Phone Instances
[**getProvidersEdgesPhonesPhoneId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonesPhoneId) | **GET** api/v2/telephony/providers/edges/phones/{phoneId} | Get a Phone by ID
[**getProvidersEdgesPhonesTemplate**](TelephonyProvidersEdgeApi.md#getProvidersEdgesPhonesTemplate) | **GET** api/v2/telephony/providers/edges/phones/template | Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
[**getProvidersEdgesSites**](TelephonyProvidersEdgeApi.md#getProvidersEdgesSites) | **GET** api/v2/telephony/providers/edges/sites | Get the list of Sites.
[**getProvidersEdgesSitesSiteId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesSitesSiteId) | **GET** api/v2/telephony/providers/edges/sites/{siteId} | Get a Site by ID.
[**getProvidersEdgesSitesSiteIdNumberplans**](TelephonyProvidersEdgeApi.md#getProvidersEdgesSitesSiteIdNumberplans) | **GET** api/v2/telephony/providers/edges/sites/{siteId}/numberplans | Get the list of Number Plans for this Site.
[**getProvidersEdgesSitesSiteIdNumberplansClassifications**](TelephonyProvidersEdgeApi.md#getProvidersEdgesSitesSiteIdNumberplansClassifications) | **GET** api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications | Get a list of Classifications for this Site
[**getProvidersEdgesSitesSiteIdNumberplansNumberplanId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesSitesSiteIdNumberplansNumberplanId) | **GET** api/v2/telephony/providers/edges/sites/{siteId}/numberplans/{numberPlanId} | Get a Number Plan by ID.
[**getProvidersEdgesTimezones**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTimezones) | **GET** api/v2/telephony/providers/edges/timezones | Get a list of Edge-compatible time zones
[**getProvidersEdgesTrunkbasesettings**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunkbasesettings) | **GET** api/v2/telephony/providers/edges/trunkbasesettings | Get Trunk Base Settings listing
[**getProvidersEdgesTrunkbasesettingsAvailablemetabases**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunkbasesettingsAvailablemetabases) | **GET** api/v2/telephony/providers/edges/trunkbasesettings/availablemetabases | Get a list of available makes and models to create a new Trunk Base Settings
[**getProvidersEdgesTrunkbasesettingsTemplate**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunkbasesettingsTemplate) | **GET** api/v2/telephony/providers/edges/trunkbasesettings/template | Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
[**getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId) | **GET** api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Get a Trunk Base Settings object by ID
[**getProvidersEdgesTrunks**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunks) | **GET** api/v2/telephony/providers/edges/trunks | Get the list of available trunks.
[**getProvidersEdgesTrunksTrunkId**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunksTrunkId) | **GET** api/v2/telephony/providers/edges/trunks/{trunkId} | Get a Trunk by ID
[**getProvidersEdgesTrunkswithrecording**](TelephonyProvidersEdgeApi.md#getProvidersEdgesTrunkswithrecording) | **GET** api/v2/telephony/providers/edges/trunkswithrecording | Get Counts of trunks that have recording disabled or enabled
[**getSchemasEdgesVnext**](TelephonyProvidersEdgeApi.md#getSchemasEdgesVnext) | **GET** api/v2/configuration/schemas/edges/vnext | Lists available schema categories
[**getSchemasEdgesVnextSchemacategory**](TelephonyProvidersEdgeApi.md#getSchemasEdgesVnextSchemacategory) | **GET** api/v2/configuration/schemas/edges/vnext/{schemaCategory} | List schemas of a specific category
[**getSchemasEdgesVnextSchemacategorySchematype**](TelephonyProvidersEdgeApi.md#getSchemasEdgesVnextSchemacategorySchematype) | **GET** api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType} | List schemas of a specific category
[**getSchemasEdgesVnextSchemacategorySchematypeSchemaId**](TelephonyProvidersEdgeApi.md#getSchemasEdgesVnextSchemacategorySchematypeSchemaId) | **GET** api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId} | Get a json schema
[**getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId**](TelephonyProvidersEdgeApi.md#getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId) | **GET** api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId} | Get metadata for a schema
[**postProvidersEdges**](TelephonyProvidersEdgeApi.md#postProvidersEdges) | **POST** api/v2/telephony/providers/edges | Create an edge.
[**postProvidersEdgesAddressvalidation**](TelephonyProvidersEdgeApi.md#postProvidersEdgesAddressvalidation) | **POST** api/v2/telephony/providers/edges/addressvalidation | Validates a street address
[**postProvidersEdgesCertificateauthorities**](TelephonyProvidersEdgeApi.md#postProvidersEdgesCertificateauthorities) | **POST** api/v2/telephony/providers/edges/certificateauthorities | Create a certificate authority.
[**postProvidersEdgesDidpools**](TelephonyProvidersEdgeApi.md#postProvidersEdgesDidpools) | **POST** api/v2/telephony/providers/edges/didpools | Create a new DID pool
[**postProvidersEdgesEdgeIdLogicalinterfaces**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdLogicalinterfaces) | **POST** api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces | Create an edge logical interface.
[**postProvidersEdgesEdgeIdLogsJobs**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdLogsJobs) | **POST** api/v2/telephony/providers/edges/{edgeId}/logs/jobs | Create a job to upload a list of Edge logs.
[**postProvidersEdgesEdgeIdLogsJobsJobIdUpload**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdLogsJobsJobIdUpload) | **POST** api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload | Request that the specified fileIds be uploaded from the Edge.
[**postProvidersEdgesEdgeIdReboot**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdReboot) | **POST** api/v2/telephony/providers/edges/{edgeId}/reboot | Reboot an Edge
[**postProvidersEdgesEdgeIdSoftwareupdate**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdSoftwareupdate) | **POST** api/v2/telephony/providers/edges/{edgeId}/softwareupdate | Starts a software update for this edge.
[**postProvidersEdgesEdgeIdUnpair**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgeIdUnpair) | **POST** api/v2/telephony/providers/edges/{edgeId}/unpair | Unpair an Edge
[**postProvidersEdgesEdgegroups**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEdgegroups) | **POST** api/v2/telephony/providers/edges/edgegroups | Create an edge group.
[**postProvidersEdgesEndpoints**](TelephonyProvidersEdgeApi.md#postProvidersEdgesEndpoints) | **POST** api/v2/telephony/providers/edges/endpoints | Create endpoint
[**postProvidersEdgesExtensionpools**](TelephonyProvidersEdgeApi.md#postProvidersEdgesExtensionpools) | **POST** api/v2/telephony/providers/edges/extensionpools | Create a new extension pool
[**postProvidersEdgesOutboundroutes**](TelephonyProvidersEdgeApi.md#postProvidersEdgesOutboundroutes) | **POST** api/v2/telephony/providers/edges/outboundroutes | Create outbound rule
[**postProvidersEdgesPhonebasesettings**](TelephonyProvidersEdgeApi.md#postProvidersEdgesPhonebasesettings) | **POST** api/v2/telephony/providers/edges/phonebasesettings | Create a new Phone Base Settings object
[**postProvidersEdgesPhones**](TelephonyProvidersEdgeApi.md#postProvidersEdgesPhones) | **POST** api/v2/telephony/providers/edges/phones | Create a new Phone
[**postProvidersEdgesPhonesPhoneIdReboot**](TelephonyProvidersEdgeApi.md#postProvidersEdgesPhonesPhoneIdReboot) | **POST** api/v2/telephony/providers/edges/phones/{phoneId}/reboot | Reboot a Phone
[**postProvidersEdgesPhonesReboot**](TelephonyProvidersEdgeApi.md#postProvidersEdgesPhonesReboot) | **POST** api/v2/telephony/providers/edges/phones/reboot | Reboot Multiple Phones
[**postProvidersEdgesSites**](TelephonyProvidersEdgeApi.md#postProvidersEdgesSites) | **POST** api/v2/telephony/providers/edges/sites | Create a Site.
[**postProvidersEdgesSitesSiteIdRebalance**](TelephonyProvidersEdgeApi.md#postProvidersEdgesSitesSiteIdRebalance) | **POST** api/v2/telephony/providers/edges/sites/{siteId}/rebalance | Triggers the rebalance operation.
[**postProvidersEdgesTrunkbasesettings**](TelephonyProvidersEdgeApi.md#postProvidersEdgesTrunkbasesettings) | **POST** api/v2/telephony/providers/edges/trunkbasesettings | Create a Trunk Base Settings object
[**putProvidersEdgesCertificateauthoritiesCertificateId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesCertificateauthoritiesCertificateId) | **PUT** api/v2/telephony/providers/edges/certificateauthorities/{certificateId} | Update a certificate authority.
[**putProvidersEdgesDidpoolsDidpoolId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesDidpoolsDidpoolId) | **PUT** api/v2/telephony/providers/edges/didpools/{didPoolId} | Update a DID Pool by ID.
[**putProvidersEdgesDidsDidId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesDidsDidId) | **PUT** api/v2/telephony/providers/edges/dids/{didId} | Update a DID by ID.
[**putProvidersEdgesEdgeId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesEdgeId) | **PUT** api/v2/telephony/providers/edges/{edgeId} | Update a edge.
[**putProvidersEdgesEdgeIdLinesLineId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesEdgeIdLinesLineId) | **PUT** api/v2/telephony/providers/edges/{edgeId}/lines/{lineId} | Update a line.
[**putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId) | **PUT** api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId} | Update an edge logical interface.
[**putProvidersEdgesEdgegroupsEdgegroupId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesEdgegroupsEdgegroupId) | **PUT** api/v2/telephony/providers/edges/edgegroups/{edgeGroupId} | Update an edge group.
[**putProvidersEdgesEndpointsEndpointId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesEndpointsEndpointId) | **PUT** api/v2/telephony/providers/edges/endpoints/{endpointId} | Update endpoint
[**putProvidersEdgesExtensionpoolsExtensionpoolId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesExtensionpoolsExtensionpoolId) | **PUT** api/v2/telephony/providers/edges/extensionpools/{extensionPoolId} | Update an extension pool by ID
[**putProvidersEdgesExtensionsExtensionId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesExtensionsExtensionId) | **PUT** api/v2/telephony/providers/edges/extensions/{extensionId} | Update an extension by ID.
[**putProvidersEdgesOutboundroutesOutboundrouteId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesOutboundroutesOutboundrouteId) | **PUT** api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId} | Update outbound route
[**putProvidersEdgesPhonebasesettingsPhonebaseId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesPhonebasesettingsPhonebaseId) | **PUT** api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId} | Update a Phone Base Settings by ID
[**putProvidersEdgesPhonesPhoneId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesPhonesPhoneId) | **PUT** api/v2/telephony/providers/edges/phones/{phoneId} | Update a Phone by ID
[**putProvidersEdgesSitesSiteId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesSitesSiteId) | **PUT** api/v2/telephony/providers/edges/sites/{siteId} | Update a Site by ID.
[**putProvidersEdgesSitesSiteIdNumberplans**](TelephonyProvidersEdgeApi.md#putProvidersEdgesSitesSiteIdNumberplans) | **PUT** api/v2/telephony/providers/edges/sites/{siteId}/numberplans | Update the list of Number Plans.
[**putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**](TelephonyProvidersEdgeApi.md#putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId) | **PUT** api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId} | Update a Trunk Base Settings object by ID


<a name="deleteProvidersEdgesCertificateauthoritiesCertificateId"></a>
# **deleteProvidersEdgesCertificateauthoritiesCertificateId**
> String deleteProvidersEdgesCertificateauthoritiesCertificateId(certificateId)

Delete a certificate authority.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    String result = apiInstance.deleteProvidersEdgesCertificateauthoritiesCertificateId(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesCertificateauthoritiesCertificateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesDidpoolsDidpoolId"></a>
# **deleteProvidersEdgesDidpoolsDidpoolId**
> String deleteProvidersEdgesDidpoolsDidpoolId(didPoolId)

Delete a DID Pool by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
try {
    String result = apiInstance.deleteProvidersEdgesDidpoolsDidpoolId(didPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesDidpoolsDidpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didPoolId** | **String**| DID pool ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesEdgeId"></a>
# **deleteProvidersEdgesEdgeId**
> String deleteProvidersEdgesEdgeId(edgeId)

Delete a edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    String result = apiInstance.deleteProvidersEdgesEdgeId(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesEdgeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId"></a>
# **deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**
> Void deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId)

Delete an edge logical interface



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
try {
    Void result = apiInstance.deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesEdgeIdLogicalinterfacesInterfaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **interfaceId** | **String**| Interface ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesEdgeIdSoftwareupdate"></a>
# **deleteProvidersEdgesEdgeIdSoftwareupdate**
> String deleteProvidersEdgesEdgeIdSoftwareupdate(edgeId)

Cancels any in-progress update for this edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    String result = apiInstance.deleteProvidersEdgesEdgeIdSoftwareupdate(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesEdgeIdSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesEdgegroupsEdgegroupId"></a>
# **deleteProvidersEdgesEdgegroupsEdgegroupId**
> String deleteProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId)

Delete an edge group.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
try {
    String result = apiInstance.deleteProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesEdgegroupsEdgegroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeGroupId** | **String**| Edge group ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesEndpointsEndpointId"></a>
# **deleteProvidersEdgesEndpointsEndpointId**
> String deleteProvidersEdgesEndpointsEndpointId(endpointId)

Delete endpoint



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String endpointId = "endpointId_example"; // String | Endpoint ID
try {
    String result = apiInstance.deleteProvidersEdgesEndpointsEndpointId(endpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesEndpointsEndpointId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **String**| Endpoint ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesExtensionpoolsExtensionpoolId"></a>
# **deleteProvidersEdgesExtensionpoolsExtensionpoolId**
> String deleteProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId)

Delete an extension pool by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
try {
    String result = apiInstance.deleteProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesExtensionpoolsExtensionpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionPoolId** | **String**| Extension pool ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesOutboundroutesOutboundrouteId"></a>
# **deleteProvidersEdgesOutboundroutesOutboundrouteId**
> String deleteProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId)

Delete Outbound Route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    String result = apiInstance.deleteProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesOutboundroutesOutboundrouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outboundRouteId** | **String**| Outbound route ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesPhonebasesettingsPhonebaseId"></a>
# **deleteProvidersEdgesPhonebasesettingsPhonebaseId**
> String deleteProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId)

Delete a Phone Base Settings by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
try {
    String result = apiInstance.deleteProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesPhonebasesettingsPhonebaseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneBaseId** | **String**| Phone base ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesPhonesPhoneId"></a>
# **deleteProvidersEdgesPhonesPhoneId**
> String deleteProvidersEdgesPhonesPhoneId(phoneId)

Delete a Phone by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
try {
    String result = apiInstance.deleteProvidersEdgesPhonesPhoneId(phoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesPhonesPhoneId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneId** | **String**| Phone ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesSitesSiteId"></a>
# **deleteProvidersEdgesSitesSiteId**
> String deleteProvidersEdgesSitesSiteId(siteId)

Delete a Site by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    String result = apiInstance.deleteProvidersEdgesSitesSiteId(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesSitesSiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId"></a>
# **deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**
> String deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId)

Delete a Trunk Base Settings object by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
try {
    String result = apiInstance.deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteProvidersEdgesTrunkbasesettingsTrunkbasesettingsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkBaseSettingsId** | **String**| Trunk Base ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdges"></a>
# **getProvidersEdges**
> EdgeEntityListing getProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy)

Get the list of edges.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String siteId = "siteId_example"; // String | Filter by site.id
String edgeGroupId = "edgeGroupId_example"; // String | Filter by edgeGroup.id
String sortBy = "name"; // String | Sort by
try {
    EdgeEntityListing result = apiInstance.getProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]
 **siteId** | **String**| Filter by site.id | [optional]
 **edgeGroupId** | **String**| Filter by edgeGroup.id | [optional]
 **sortBy** | **String**| Sort by | [optional] [default to name]

### Return type

[**EdgeEntityListing**](EdgeEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesAvailablelanguages"></a>
# **getProvidersEdgesAvailablelanguages**
> AvailableLanguageList getProvidersEdgesAvailablelanguages()

Get the list of available languages.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    AvailableLanguageList result = apiInstance.getProvidersEdgesAvailablelanguages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesAvailablelanguages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AvailableLanguageList**](AvailableLanguageList.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesCertificateauthorities"></a>
# **getProvidersEdgesCertificateauthorities**
> CertificateAuthorityEntityListing getProvidersEdgesCertificateauthorities()

Get the list of certificate authorities.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    CertificateAuthorityEntityListing result = apiInstance.getProvidersEdgesCertificateauthorities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesCertificateauthorities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CertificateAuthorityEntityListing**](CertificateAuthorityEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesCertificateauthoritiesCertificateId"></a>
# **getProvidersEdgesCertificateauthoritiesCertificateId**
> DomainCertificateAuthority getProvidersEdgesCertificateauthoritiesCertificateId(certificateId)

Get a certificate authority.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    DomainCertificateAuthority result = apiInstance.getProvidersEdgesCertificateauthoritiesCertificateId(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesCertificateauthoritiesCertificateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesDidpools"></a>
# **getProvidersEdgesDidpools**
> DIDPoolEntityListing getProvidersEdgesDidpools(pageSize, pageNumber, sortBy)

Get a listing of DID Pools



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
try {
    DIDPoolEntityListing result = apiInstance.getProvidersEdgesDidpools(pageSize, pageNumber, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesDidpools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to number]

### Return type

[**DIDPoolEntityListing**](DIDPoolEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesDidpoolsDidpoolId"></a>
# **getProvidersEdgesDidpoolsDidpoolId**
> DIDPool getProvidersEdgesDidpoolsDidpoolId(didPoolId)

Get a DID Pool by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
try {
    DIDPool result = apiInstance.getProvidersEdgesDidpoolsDidpoolId(didPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesDidpoolsDidpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didPoolId** | **String**| DID pool ID |

### Return type

[**DIDPool**](DIDPool.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesDids"></a>
# **getProvidersEdgesDids**
> DIDEntityListing getProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber)

Get a listing of DIDs



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String phoneNumber = "phoneNumber_example"; // String | Filter by phoneNumber
try {
    DIDEntityListing result = apiInstance.getProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesDids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to number]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **phoneNumber** | **String**| Filter by phoneNumber | [optional]

### Return type

[**DIDEntityListing**](DIDEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesDidsDidId"></a>
# **getProvidersEdgesDidsDidId**
> DID getProvidersEdgesDidsDidId(didId)

Get a DID by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didId = "didId_example"; // String | DID ID
try {
    DID result = apiInstance.getProvidersEdgesDidsDidId(didId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesDidsDidId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didId** | **String**| DID ID |

### Return type

[**DID**](DID.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeId"></a>
# **getProvidersEdgesEdgeId**
> Edge getProvidersEdgesEdgeId(edgeId)

Get edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    Edge result = apiInstance.getProvidersEdgesEdgeId(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

[**Edge**](Edge.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdLines"></a>
# **getProvidersEdgesEdgeIdLines**
> EdgeLineEntityListing getProvidersEdgesEdgeIdLines(edgeId, pageSize, pageNumber)

Get the list of lines.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EdgeLineEntityListing result = apiInstance.getProvidersEdgesEdgeIdLines(edgeId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdLines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**EdgeLineEntityListing**](EdgeLineEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdLinesLineId"></a>
# **getProvidersEdgesEdgeIdLinesLineId**
> EdgeLine getProvidersEdgesEdgeIdLinesLineId(edgeId, lineId)

Get line



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String lineId = "lineId_example"; // String | Line ID
try {
    EdgeLine result = apiInstance.getProvidersEdgesEdgeIdLinesLineId(edgeId, lineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdLinesLineId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **lineId** | **String**| Line ID |

### Return type

[**EdgeLine**](EdgeLine.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdLogicalinterfaces"></a>
# **getProvidersEdgesEdgeIdLogicalinterfaces**
> LogicalInterfaceEntityListing getProvidersEdgesEdgeIdLogicalinterfaces(edgeId, expand)

Get edge logical interfaces.

Retrieve a list of all configured logical interfaces from a specific edge.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Field to expand in the response
try {
    LogicalInterfaceEntityListing result = apiInstance.getProvidersEdgesEdgeIdLogicalinterfaces(edgeId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdLogicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **expand** | [**List&lt;String&gt;**](String.md)| Field to expand in the response | [optional]

### Return type

[**LogicalInterfaceEntityListing**](LogicalInterfaceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId"></a>
# **getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**
> DomainLogicalInterface getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, expand)

Get an edge logical interface



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Field to expand in the response
try {
    DomainLogicalInterface result = apiInstance.getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdLogicalinterfacesInterfaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **interfaceId** | **String**| Interface ID |
 **expand** | [**List&lt;String&gt;**](String.md)| Field to expand in the response | [optional]

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdLogsJobsJobId"></a>
# **getProvidersEdgesEdgeIdLogsJobsJobId**
> EdgeLogsJob getProvidersEdgesEdgeIdLogsJobsJobId(edgeId, jobId)

Get an Edge logs job.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String jobId = "jobId_example"; // String | Job ID
try {
    EdgeLogsJob result = apiInstance.getProvidersEdgesEdgeIdLogsJobsJobId(edgeId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdLogsJobsJobId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **jobId** | **String**| Job ID |

### Return type

[**EdgeLogsJob**](EdgeLogsJob.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdPhysicalinterfaces"></a>
# **getProvidersEdgesEdgeIdPhysicalinterfaces**
> PhysicalInterfaceEntityListing getProvidersEdgesEdgeIdPhysicalinterfaces(edgeId)

Retrieve a list of all configured physical interfaces from a specific edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    PhysicalInterfaceEntityListing result = apiInstance.getProvidersEdgesEdgeIdPhysicalinterfaces(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdPhysicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

[**PhysicalInterfaceEntityListing**](PhysicalInterfaceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId"></a>
# **getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId**
> DomainPhysicalInterface getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(edgeId, interfaceId)

Get edge physical interface.

Retrieve a physical interface from a specific edge.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
try {
    DomainPhysicalInterface result = apiInstance.getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId(edgeId, interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdPhysicalinterfacesInterfaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **interfaceId** | **String**| Interface ID |

### Return type

[**DomainPhysicalInterface**](DomainPhysicalInterface.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdSoftwareupdate"></a>
# **getProvidersEdgesEdgeIdSoftwareupdate**
> DomainEdgeSoftwareUpdateDto getProvidersEdgesEdgeIdSoftwareupdate(edgeId)

Gets software update status information about any edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    DomainEdgeSoftwareUpdateDto result = apiInstance.getProvidersEdgesEdgeIdSoftwareupdate(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

[**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeIdSoftwareversions"></a>
# **getProvidersEdgesEdgeIdSoftwareversions**
> DomainEdgeSoftwareVersionDto getProvidersEdgesEdgeIdSoftwareversions(edgeId)

Gets all the available software versions for this edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    DomainEdgeSoftwareVersionDto result = apiInstance.getProvidersEdgesEdgeIdSoftwareversions(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeIdSoftwareversions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

[**DomainEdgeSoftwareVersionDto**](DomainEdgeSoftwareVersionDto.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgegroups"></a>
# **getProvidersEdgesEdgegroups**
> EdgeGroupEntityListing getProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy)

Get the list of edge groups.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String sortBy = "name"; // String | Sort by
try {
    EdgeGroupEntityListing result = apiInstance.getProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgegroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional] [default to name]

### Return type

[**EdgeGroupEntityListing**](EdgeGroupEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgegroupsEdgegroupId"></a>
# **getProvidersEdgesEdgegroupsEdgegroupId**
> EdgeGroup getProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, expand)

Get edge group.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response
try {
    EdgeGroup result = apiInstance.getProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgegroupsEdgegroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeGroupId** | **String**| Edge group ID |
 **expand** | [**List&lt;String&gt;**](String.md)| Fields to expand in the response | [optional]

### Return type

[**EdgeGroup**](EdgeGroup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEdgeversionreport"></a>
# **getProvidersEdgesEdgeversionreport**
> EdgeVersionReport getProvidersEdgesEdgeversionreport()

Get the edge version report.

The report will not have consistent data about the edge version(s) until all edges have been reset.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    EdgeVersionReport result = apiInstance.getProvidersEdgesEdgeversionreport();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEdgeversionreport");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EdgeVersionReport**](EdgeVersionReport.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEndpoints"></a>
# **getProvidersEdgesEndpoints**
> EndpointEntityListing getProvidersEdgesEndpoints(pageSize, pageNumber, name, sortBy)

Get endpoints



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String sortBy = "name"; // String | Sort by
try {
    EndpointEntityListing result = apiInstance.getProvidersEdgesEndpoints(pageSize, pageNumber, name, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Sort by | [optional] [default to name]

### Return type

[**EndpointEntityListing**](EndpointEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesEndpointsEndpointId"></a>
# **getProvidersEdgesEndpointsEndpointId**
> Endpoint getProvidersEdgesEndpointsEndpointId(endpointId)

Get endpoint



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String endpointId = "endpointId_example"; // String | Endpoint ID
try {
    Endpoint result = apiInstance.getProvidersEdgesEndpointsEndpointId(endpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesEndpointsEndpointId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **String**| Endpoint ID |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesExtensionpools"></a>
# **getProvidersEdgesExtensionpools**
> ExtensionPoolEntityListing getProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number)

Get a listing of extension pools



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "startNumber"; // String | Sort by
String number = "number_example"; // String | Number
try {
    ExtensionPoolEntityListing result = apiInstance.getProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesExtensionpools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to startNumber]
 **number** | **String**| Number | [optional]

### Return type

[**ExtensionPoolEntityListing**](ExtensionPoolEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesExtensionpoolsExtensionpoolId"></a>
# **getProvidersEdgesExtensionpoolsExtensionpoolId**
> ExtensionPool getProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId)

Get an extension pool by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
try {
    ExtensionPool result = apiInstance.getProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesExtensionpoolsExtensionpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionPoolId** | **String**| Extension pool ID |

### Return type

[**ExtensionPool**](ExtensionPool.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesExtensions"></a>
# **getProvidersEdgesExtensions**
> ExtensionEntityListing getProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number)

Get a listing of extensions



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String number = "number_example"; // String | Filter by number
try {
    ExtensionEntityListing result = apiInstance.getProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesExtensions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to number]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **number** | **String**| Filter by number | [optional]

### Return type

[**ExtensionEntityListing**](ExtensionEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesExtensionsExtensionId"></a>
# **getProvidersEdgesExtensionsExtensionId**
> Extension getProvidersEdgesExtensionsExtensionId(extensionId)

Get an extension by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionId = "extensionId_example"; // String | Extension ID
try {
    Extension result = apiInstance.getProvidersEdgesExtensionsExtensionId(extensionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesExtensionsExtensionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **String**| Extension ID |

### Return type

[**Extension**](Extension.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesLinebasesettings"></a>
# **getProvidersEdgesLinebasesettings**
> LineBaseEntityListing getProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder)

Get a listing of line base settings objects



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
try {
    LineBaseEntityListing result = apiInstance.getProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesLinebasesettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]

### Return type

[**LineBaseEntityListing**](LineBaseEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesLinebasesettingsLinebaseId"></a>
# **getProvidersEdgesLinebasesettingsLinebaseId**
> LineBase getProvidersEdgesLinebasesettingsLinebaseId(lineBaseId)

Get a line base settings object by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineBaseId = "lineBaseId_example"; // String | Line base ID
try {
    LineBase result = apiInstance.getProvidersEdgesLinebasesettingsLinebaseId(lineBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesLinebasesettingsLinebaseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineBaseId** | **String**| Line base ID |

### Return type

[**LineBase**](LineBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesLines"></a>
# **getProvidersEdgesLines**
> LineEntityListing getProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand)

Get a list of Lines



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String sortBy = "name"; // String | Value by which to sort
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
try {
    LineEntityListing result = apiInstance.getProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesLines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **expand** | [**List&lt;String&gt;**](String.md)| Fields to expand in the response, comma-separated | [optional]

### Return type

[**LineEntityListing**](LineEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesLinesLineId"></a>
# **getProvidersEdgesLinesLineId**
> Line getProvidersEdgesLinesLineId(lineId)

Get a Line by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineId = "lineId_example"; // String | Line ID
try {
    Line result = apiInstance.getProvidersEdgesLinesLineId(lineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesLinesLineId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineId** | **String**| Line ID |

### Return type

[**Line**](Line.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesLinesTemplate"></a>
# **getProvidersEdgesLinesTemplate**
> Line getProvidersEdgesLinesTemplate(lineBaseSettingsId)

Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineBaseSettingsId = "lineBaseSettingsId_example"; // String | The id of a Line Base Settings object upon which to base this Line
try {
    Line result = apiInstance.getProvidersEdgesLinesTemplate(lineBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesLinesTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineBaseSettingsId** | **String**| The id of a Line Base Settings object upon which to base this Line |

### Return type

[**Line**](Line.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesOutboundroutes"></a>
# **getProvidersEdgesOutboundroutes**
> OutboundRouteEntityListing getProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, sortBy)

Get outbound routes



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String siteId = "siteId_example"; // String | Filter by site.id
String sortBy = "name"; // String | Sort by
try {
    OutboundRouteEntityListing result = apiInstance.getProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **name** | **String**| Name | [optional]
 **siteId** | **String**| Filter by site.id | [optional]
 **sortBy** | **String**| Sort by | [optional] [default to name]

### Return type

[**OutboundRouteEntityListing**](OutboundRouteEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesOutboundroutesOutboundrouteId"></a>
# **getProvidersEdgesOutboundroutesOutboundrouteId**
> OutboundRoute getProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId)

Get outbound route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    OutboundRoute result = apiInstance.getProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesOutboundroutesOutboundrouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outboundRouteId** | **String**| Outbound route ID |

### Return type

[**OutboundRoute**](OutboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonebasesettings"></a>
# **getProvidersEdgesPhonebasesettings**
> PhoneBaseEntityListing getProvidersEdgesPhonebasesettings(pageNumber, pageSize, sortBy, sortOrder)

Get a list of Phone Base Settings objects



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
try {
    PhoneBaseEntityListing result = apiInstance.getProvidersEdgesPhonebasesettings(pageNumber, pageSize, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonebasesettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]

### Return type

[**PhoneBaseEntityListing**](PhoneBaseEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonebasesettingsAvailablemetabases"></a>
# **getProvidersEdgesPhonebasesettingsAvailablemetabases**
> PhoneMetaBaseEntityListing getProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber)

Get a list of available makes and models to create a new Phone Base Settings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PhoneMetaBaseEntityListing result = apiInstance.getProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonebasesettingsAvailablemetabases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**PhoneMetaBaseEntityListing**](PhoneMetaBaseEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonebasesettingsPhonebaseId"></a>
# **getProvidersEdgesPhonebasesettingsPhonebaseId**
> PhoneBase getProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId)

Get a Phone Base Settings object by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
try {
    PhoneBase result = apiInstance.getProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonebasesettingsPhonebaseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneBaseId** | **String**| Phone base ID |

### Return type

[**PhoneBase**](PhoneBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonebasesettingsTemplate"></a>
# **getProvidersEdgesPhonebasesettingsTemplate**
> PhoneBase getProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId)

Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneMetabaseId = "phoneMetabaseId_example"; // String | The id of a metabase object upon which to base this Phone Base Settings
try {
    PhoneBase result = apiInstance.getProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonebasesettingsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneMetabaseId** | **String**| The id of a metabase object upon which to base this Phone Base Settings |

### Return type

[**PhoneBase**](PhoneBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhones"></a>
# **getProvidersEdgesPhones**
> PhoneEntityListing getProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, expand, fields)

Get a list of Phone Instances



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
String siteId = "siteId_example"; // String | Filter by site.id
String webRtcUserId = "webRtcUserId_example"; // String | Filter by webRtcUser.id
String phoneBaseSettingsId = "phoneBaseSettingsId_example"; // String | Filter by phoneBaseSettings.id
String linesLoggedInUserId = "linesLoggedInUserId_example"; // String | Filter by lines.loggedInUser.id
String linesDefaultForUserId = "linesDefaultForUserId_example"; // String | Filter by lines.defaultForUser.id
String phoneHardwareId = "phoneHardwareId_example"; // String | Filter by phone_hardwareId
String linesId = "linesId_example"; // String | Filter by lines.id
String linesName = "linesName_example"; // String | Filter by lines.name
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields and properties to get, comma-separated
try {
    PhoneEntityListing result = apiInstance.getProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, expand, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **siteId** | **String**| Filter by site.id | [optional]
 **webRtcUserId** | **String**| Filter by webRtcUser.id | [optional]
 **phoneBaseSettingsId** | **String**| Filter by phoneBaseSettings.id | [optional]
 **linesLoggedInUserId** | **String**| Filter by lines.loggedInUser.id | [optional]
 **linesDefaultForUserId** | **String**| Filter by lines.defaultForUser.id | [optional]
 **phoneHardwareId** | **String**| Filter by phone_hardwareId | [optional]
 **linesId** | **String**| Filter by lines.id | [optional]
 **linesName** | **String**| Filter by lines.name | [optional]
 **expand** | [**List&lt;String&gt;**](String.md)| Fields to expand in the response, comma-separated | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Fields and properties to get, comma-separated | [optional]

### Return type

[**PhoneEntityListing**](PhoneEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonesPhoneId"></a>
# **getProvidersEdgesPhonesPhoneId**
> Phone getProvidersEdgesPhonesPhoneId(phoneId)

Get a Phone by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
try {
    Phone result = apiInstance.getProvidersEdgesPhonesPhoneId(phoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonesPhoneId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneId** | **String**| Phone ID |

### Return type

[**Phone**](Phone.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesPhonesTemplate"></a>
# **getProvidersEdgesPhonesTemplate**
> Phone getProvidersEdgesPhonesTemplate(phoneBaseSettingsId)

Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseSettingsId = "phoneBaseSettingsId_example"; // String | The id of a Phone Base Settings object upon which to base this Phone
try {
    Phone result = apiInstance.getProvidersEdgesPhonesTemplate(phoneBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesPhonesTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneBaseSettingsId** | **String**| The id of a Phone Base Settings object upon which to base this Phone |

### Return type

[**Phone**](Phone.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesSites"></a>
# **getProvidersEdgesSites**
> SiteEntityListing getProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId)

Get the list of Sites.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name
String locationId = "locationId_example"; // String | Location Id
try {
    SiteEntityListing result = apiInstance.getProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesSites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **sortBy** | **String**| Sort by | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **name** | **String**| Name | [optional]
 **locationId** | **String**| Location Id | [optional]

### Return type

[**SiteEntityListing**](SiteEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesSitesSiteId"></a>
# **getProvidersEdgesSitesSiteId**
> Site getProvidersEdgesSitesSiteId(siteId)

Get a Site by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    Site result = apiInstance.getProvidersEdgesSitesSiteId(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesSitesSiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |

### Return type

[**Site**](Site.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesSitesSiteIdNumberplans"></a>
# **getProvidersEdgesSitesSiteIdNumberplans**
> List&lt;NumberPlan&gt; getProvidersEdgesSitesSiteIdNumberplans(siteId)

Get the list of Number Plans for this Site.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    List<NumberPlan> result = apiInstance.getProvidersEdgesSitesSiteIdNumberplans(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesSitesSiteIdNumberplans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |

### Return type

[**List&lt;NumberPlan&gt;**](NumberPlan.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesSitesSiteIdNumberplansClassifications"></a>
# **getProvidersEdgesSitesSiteIdNumberplansClassifications**
> List&lt;String&gt; getProvidersEdgesSitesSiteIdNumberplansClassifications(siteId, classification)

Get a list of Classifications for this Site



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String classification = "classification_example"; // String | Classification
try {
    List<String> result = apiInstance.getProvidersEdgesSitesSiteIdNumberplansClassifications(siteId, classification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesSitesSiteIdNumberplansClassifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |
 **classification** | **String**| Classification | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesSitesSiteIdNumberplansNumberplanId"></a>
# **getProvidersEdgesSitesSiteIdNumberplansNumberplanId**
> NumberPlan getProvidersEdgesSitesSiteIdNumberplansNumberplanId(siteId, numberPlanId)

Get a Number Plan by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String numberPlanId = "numberPlanId_example"; // String | Number Plan ID
try {
    NumberPlan result = apiInstance.getProvidersEdgesSitesSiteIdNumberplansNumberplanId(siteId, numberPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesSitesSiteIdNumberplansNumberplanId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |
 **numberPlanId** | **String**| Number Plan ID |

### Return type

[**NumberPlan**](NumberPlan.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTimezones"></a>
# **getProvidersEdgesTimezones**
> TimeZoneEntityListing getProvidersEdgesTimezones(pageSize, pageNumber)

Get a list of Edge-compatible time zones



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 1000; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TimeZoneEntityListing result = apiInstance.getProvidersEdgesTimezones(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTimezones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 1000]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**TimeZoneEntityListing**](TimeZoneEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunkbasesettings"></a>
# **getProvidersEdgesTrunkbasesettings**
> TrunkBase getProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled)

Get Trunk Base Settings listing



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
Boolean recordingEnabled = true; // Boolean | Filter trunks by recording enabled
try {
    TrunkBase result = apiInstance.getProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunkbasesettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **recordingEnabled** | **Boolean**| Filter trunks by recording enabled | [optional]

### Return type

[**TrunkBase**](TrunkBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunkbasesettingsAvailablemetabases"></a>
# **getProvidersEdgesTrunkbasesettingsAvailablemetabases**
> TrunkMetabaseEntityListing getProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber)

Get a list of available makes and models to create a new Trunk Base Settings



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String type = "type_example"; // String | 
Integer pageSize = 25; // Integer | 
Integer pageNumber = 1; // Integer | 
try {
    TrunkMetabaseEntityListing result = apiInstance.getProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunkbasesettingsAvailablemetabases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [optional] [enum: EXTERNAL, PHONE, EDGE]
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **pageNumber** | **Integer**|  | [optional] [default to 1]

### Return type

[**TrunkMetabaseEntityListing**](TrunkMetabaseEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunkbasesettingsTemplate"></a>
# **getProvidersEdgesTrunkbasesettingsTemplate**
> TrunkBase getProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId)

Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkMetabaseId = "trunkMetabaseId_example"; // String | The id of a metabase object upon which to base this Trunk Base Settings
try {
    TrunkBase result = apiInstance.getProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunkbasesettingsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkMetabaseId** | **String**| The id of a metabase object upon which to base this Trunk Base Settings |

### Return type

[**TrunkBase**](TrunkBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId"></a>
# **getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**
> TrunkBase getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId)

Get a Trunk Base Settings object by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
try {
    TrunkBase result = apiInstance.getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunkbasesettingsTrunkbasesettingsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkBaseSettingsId** | **String**| Trunk Base ID |

### Return type

[**TrunkBase**](TrunkBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunks"></a>
# **getProvidersEdgesTrunks**
> TrunkEntityListing getProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType)

Get the list of available trunks.

Trunks are created by assigning trunk base settings to an Edge or Edge Group.

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
String edgeId = "edgeId_example"; // String | Filter by Edge Ids
String trunkBaseId = "trunkBaseId_example"; // String | Filter by Trunk Base Ids
String trunkType = "trunkType_example"; // String | Filter by a Trunk type
try {
    TrunkEntityListing result = apiInstance.getProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **sortBy** | **String**| Value by which to sort | [optional] [default to name]
 **sortOrder** | **String**| Sort order | [optional] [default to ASC]
 **edgeId** | **String**| Filter by Edge Ids | [optional]
 **trunkBaseId** | **String**| Filter by Trunk Base Ids | [optional]
 **trunkType** | **String**| Filter by a Trunk type | [optional] [enum: EXTERNAL, PHONE, EDGE]

### Return type

[**TrunkEntityListing**](TrunkEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunksTrunkId"></a>
# **getProvidersEdgesTrunksTrunkId**
> Trunk getProvidersEdgesTrunksTrunkId(trunkId)

Get a Trunk by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkId = "trunkId_example"; // String | Trunk ID
try {
    Trunk result = apiInstance.getProvidersEdgesTrunksTrunkId(trunkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunksTrunkId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkId** | **String**| Trunk ID |

### Return type

[**Trunk**](Trunk.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersEdgesTrunkswithrecording"></a>
# **getProvidersEdgesTrunkswithrecording**
> TrunkRecordingEnabledCount getProvidersEdgesTrunkswithrecording(trunkType)

Get Counts of trunks that have recording disabled or enabled



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkType = "trunkType_example"; // String | The type of this trunk base.
try {
    TrunkRecordingEnabledCount result = apiInstance.getProvidersEdgesTrunkswithrecording(trunkType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getProvidersEdgesTrunkswithrecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkType** | **String**| The type of this trunk base. | [optional] [enum: EXTERNAL, PHONE, EDGE]

### Return type

[**TrunkRecordingEnabledCount**](TrunkRecordingEnabledCount.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemasEdgesVnext"></a>
# **getSchemasEdgesVnext**
> SchemaCategoryEntityListing getSchemasEdgesVnext(pageSize, pageNumber)

Lists available schema categories



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaCategoryEntityListing result = apiInstance.getSchemasEdgesVnext(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getSchemasEdgesVnext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**SchemaCategoryEntityListing**](SchemaCategoryEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemasEdgesVnextSchemacategory"></a>
# **getSchemasEdgesVnextSchemacategory**
> SchemaReferenceEntityListing getSchemasEdgesVnextSchemacategory(schemaCategory, pageSize, pageNumber)

List schemas of a specific category



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaReferenceEntityListing result = apiInstance.getSchemasEdgesVnextSchemacategory(schemaCategory, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getSchemasEdgesVnextSchemacategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemaCategory** | **String**| Schema category |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**SchemaReferenceEntityListing**](SchemaReferenceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemasEdgesVnextSchemacategorySchematype"></a>
# **getSchemasEdgesVnextSchemacategorySchematype**
> SchemaReferenceEntityListing getSchemasEdgesVnextSchemacategorySchematype(schemaCategory, schemaType, pageSize, pageNumber)

List schemas of a specific category



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaReferenceEntityListing result = apiInstance.getSchemasEdgesVnextSchemacategorySchematype(schemaCategory, schemaType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getSchemasEdgesVnextSchemacategorySchematype");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemaCategory** | **String**| Schema category |
 **schemaType** | **String**| Schema type |
 **pageSize** | **Integer**| Page size | [optional] [default to 25]
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**SchemaReferenceEntityListing**](SchemaReferenceEntityListing.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemasEdgesVnextSchemacategorySchematypeSchemaId"></a>
# **getSchemasEdgesVnextSchemacategorySchematypeSchemaId**
> Organization getSchemasEdgesVnextSchemacategorySchematypeSchemaId(schemaCategory, schemaType, schemaId)

Get a json schema



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
String schemaId = "schemaId_example"; // String | Schema ID
try {
    Organization result = apiInstance.getSchemasEdgesVnextSchemacategorySchematypeSchemaId(schemaCategory, schemaType, schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getSchemasEdgesVnextSchemacategorySchematypeSchemaId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemaCategory** | **String**| Schema category |
 **schemaType** | **String**| Schema type |
 **schemaId** | **String**| Schema ID |

### Return type

[**Organization**](Organization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId"></a>
# **getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId**
> Organization getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type)

Get metadata for a schema



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
String schemaId = "schemaId_example"; // String | Schema ID
String extensionType = "extensionType_example"; // String | extension
String metadataId = "metadataId_example"; // String | Metadata ID
String type = "type_example"; // String | Type
try {
    Organization result = apiInstance.getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getSchemasEdgesVnextSchemacategorySchematypeSchemaIdExtensiontypeMetadataId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemaCategory** | **String**| Schema category |
 **schemaType** | **String**| Schema type |
 **schemaId** | **String**| Schema ID |
 **extensionType** | **String**| extension |
 **metadataId** | **String**| Metadata ID |
 **type** | **String**| Type | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdges"></a>
# **postProvidersEdges**
> Edge postProvidersEdges(body)

Create an edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Edge body = new Edge(); // Edge | Edge
try {
    Edge result = apiInstance.postProvidersEdges(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Edge**](Edge.md)| Edge |

### Return type

[**Edge**](Edge.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesAddressvalidation"></a>
# **postProvidersEdgesAddressvalidation**
> ValidateAddressResponse postProvidersEdgesAddressvalidation(body)

Validates a street address



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
ValidateAddressRequest body = new ValidateAddressRequest(); // ValidateAddressRequest | Address
try {
    ValidateAddressResponse result = apiInstance.postProvidersEdgesAddressvalidation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesAddressvalidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidateAddressRequest**](ValidateAddressRequest.md)| Address |

### Return type

[**ValidateAddressResponse**](ValidateAddressResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesCertificateauthorities"></a>
# **postProvidersEdgesCertificateauthorities**
> DomainCertificateAuthority postProvidersEdgesCertificateauthorities(body)

Create a certificate authority.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
DomainCertificateAuthority body = new DomainCertificateAuthority(); // DomainCertificateAuthority | CertificateAuthority
try {
    DomainCertificateAuthority result = apiInstance.postProvidersEdgesCertificateauthorities(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesCertificateauthorities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainCertificateAuthority**](DomainCertificateAuthority.md)| CertificateAuthority |

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesDidpools"></a>
# **postProvidersEdgesDidpools**
> DIDPool postProvidersEdgesDidpools(body)

Create a new DID pool



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
DIDPool body = new DIDPool(); // DIDPool | DID pool
try {
    DIDPool result = apiInstance.postProvidersEdgesDidpools(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesDidpools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DIDPool**](DIDPool.md)| DID pool |

### Return type

[**DIDPool**](DIDPool.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdLogicalinterfaces"></a>
# **postProvidersEdgesEdgeIdLogicalinterfaces**
> DomainLogicalInterface postProvidersEdgesEdgeIdLogicalinterfaces(edgeId, body)

Create an edge logical interface.

Create

### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
DomainLogicalInterface body = new DomainLogicalInterface(); // DomainLogicalInterface | Logical interface
try {
    DomainLogicalInterface result = apiInstance.postProvidersEdgesEdgeIdLogicalinterfaces(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdLogicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **body** | [**DomainLogicalInterface**](DomainLogicalInterface.md)| Logical interface |

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdLogsJobs"></a>
# **postProvidersEdgesEdgeIdLogsJobs**
> EdgeLogsJobResponse postProvidersEdgesEdgeIdLogsJobs(edgeId, body)

Create a job to upload a list of Edge logs.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
EdgeLogsJobRequest body = new EdgeLogsJobRequest(); // EdgeLogsJobRequest | EdgeLogsJobRequest
try {
    EdgeLogsJobResponse result = apiInstance.postProvidersEdgesEdgeIdLogsJobs(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdLogsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **body** | [**EdgeLogsJobRequest**](EdgeLogsJobRequest.md)| EdgeLogsJobRequest |

### Return type

[**EdgeLogsJobResponse**](EdgeLogsJobResponse.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdLogsJobsJobIdUpload"></a>
# **postProvidersEdgesEdgeIdLogsJobsJobIdUpload**
> Void postProvidersEdgesEdgeIdLogsJobsJobIdUpload(edgeId, jobId, body)

Request that the specified fileIds be uploaded from the Edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String jobId = "jobId_example"; // String | Job ID
EdgeLogsJobUploadRequest body = new EdgeLogsJobUploadRequest(); // EdgeLogsJobUploadRequest | Log upload request
try {
    Void result = apiInstance.postProvidersEdgesEdgeIdLogsJobsJobIdUpload(edgeId, jobId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdLogsJobsJobIdUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **jobId** | **String**| Job ID |
 **body** | [**EdgeLogsJobUploadRequest**](EdgeLogsJobUploadRequest.md)| Log upload request |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdReboot"></a>
# **postProvidersEdgesEdgeIdReboot**
> String postProvidersEdgesEdgeIdReboot(edgeId)

Reboot an Edge



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    String result = apiInstance.postProvidersEdgesEdgeIdReboot(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdReboot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdSoftwareupdate"></a>
# **postProvidersEdgesEdgeIdSoftwareupdate**
> DomainEdgeSoftwareUpdateDto postProvidersEdgesEdgeIdSoftwareupdate(edgeId, body)

Starts a software update for this edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
DomainEdgeSoftwareUpdateDto body = new DomainEdgeSoftwareUpdateDto(); // DomainEdgeSoftwareUpdateDto | Software update request
try {
    DomainEdgeSoftwareUpdateDto result = apiInstance.postProvidersEdgesEdgeIdSoftwareupdate(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **body** | [**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md)| Software update request |

### Return type

[**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgeIdUnpair"></a>
# **postProvidersEdgesEdgeIdUnpair**
> String postProvidersEdgesEdgeIdUnpair(edgeId)

Unpair an Edge



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    String result = apiInstance.postProvidersEdgesEdgeIdUnpair(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgeIdUnpair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge Id |

### Return type

**String**

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEdgegroups"></a>
# **postProvidersEdgesEdgegroups**
> EdgeGroup postProvidersEdgesEdgegroups(body)

Create an edge group.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
EdgeGroup body = new EdgeGroup(); // EdgeGroup | EdgeGroup
try {
    EdgeGroup result = apiInstance.postProvidersEdgesEdgegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEdgegroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EdgeGroup**](EdgeGroup.md)| EdgeGroup |

### Return type

[**EdgeGroup**](EdgeGroup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesEndpoints"></a>
# **postProvidersEdgesEndpoints**
> Endpoint postProvidersEdgesEndpoints(body)

Create endpoint



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Endpoint body = new Endpoint(); // Endpoint | EndpointTemplate
try {
    Endpoint result = apiInstance.postProvidersEdgesEndpoints(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Endpoint**](Endpoint.md)| EndpointTemplate |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesExtensionpools"></a>
# **postProvidersEdgesExtensionpools**
> Extension postProvidersEdgesExtensionpools(body)

Create a new extension pool



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
ExtensionPool body = new ExtensionPool(); // ExtensionPool | ExtensionPool
try {
    Extension result = apiInstance.postProvidersEdgesExtensionpools(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesExtensionpools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExtensionPool**](ExtensionPool.md)| ExtensionPool |

### Return type

[**Extension**](Extension.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesOutboundroutes"></a>
# **postProvidersEdgesOutboundroutes**
> OutboundRoute postProvidersEdgesOutboundroutes(body)

Create outbound rule



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
OutboundRoute body = new OutboundRoute(); // OutboundRoute | OutboundRoute
try {
    OutboundRoute result = apiInstance.postProvidersEdgesOutboundroutes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OutboundRoute**](OutboundRoute.md)| OutboundRoute |

### Return type

[**OutboundRoute**](OutboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesPhonebasesettings"></a>
# **postProvidersEdgesPhonebasesettings**
> PhoneBase postProvidersEdgesPhonebasesettings(body)

Create a new Phone Base Settings object



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
PhoneBase body = new PhoneBase(); // PhoneBase | Phone base settings
try {
    PhoneBase result = apiInstance.postProvidersEdgesPhonebasesettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesPhonebasesettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PhoneBase**](PhoneBase.md)| Phone base settings |

### Return type

[**PhoneBase**](PhoneBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesPhones"></a>
# **postProvidersEdgesPhones**
> Phone postProvidersEdgesPhones(body)

Create a new Phone



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Phone body = new Phone(); // Phone | Phone
try {
    Phone result = apiInstance.postProvidersEdgesPhones(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesPhones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Phone**](Phone.md)| Phone |

### Return type

[**Phone**](Phone.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesPhonesPhoneIdReboot"></a>
# **postProvidersEdgesPhonesPhoneIdReboot**
> Void postProvidersEdgesPhonesPhoneIdReboot(phoneId)

Reboot a Phone



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone Id
try {
    Void result = apiInstance.postProvidersEdgesPhonesPhoneIdReboot(phoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesPhonesPhoneIdReboot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneId** | **String**| Phone Id |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesPhonesReboot"></a>
# **postProvidersEdgesPhonesReboot**
> Void postProvidersEdgesPhonesReboot(body)

Reboot Multiple Phones



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
PhonesReboot body = new PhonesReboot(); // PhonesReboot | Phones
try {
    Void result = apiInstance.postProvidersEdgesPhonesReboot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesPhonesReboot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PhonesReboot**](PhonesReboot.md)| Phones |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesSites"></a>
# **postProvidersEdgesSites**
> Site postProvidersEdgesSites(body)

Create a Site.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Site body = new Site(); // Site | Site
try {
    Site result = apiInstance.postProvidersEdgesSites(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesSites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Site**](Site.md)| Site |

### Return type

[**Site**](Site.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesSitesSiteIdRebalance"></a>
# **postProvidersEdgesSitesSiteIdRebalance**
> Void postProvidersEdgesSitesSiteIdRebalance(siteId)

Triggers the rebalance operation.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    Void result = apiInstance.postProvidersEdgesSitesSiteIdRebalance(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesSitesSiteIdRebalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |

### Return type

[**Void**](.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProvidersEdgesTrunkbasesettings"></a>
# **postProvidersEdgesTrunkbasesettings**
> TrunkBase postProvidersEdgesTrunkbasesettings(body)

Create a Trunk Base Settings object



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
TrunkBase body = new TrunkBase(); // TrunkBase | Trunk base settings
try {
    TrunkBase result = apiInstance.postProvidersEdgesTrunkbasesettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postProvidersEdgesTrunkbasesettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TrunkBase**](TrunkBase.md)| Trunk base settings |

### Return type

[**TrunkBase**](TrunkBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesCertificateauthoritiesCertificateId"></a>
# **putProvidersEdgesCertificateauthoritiesCertificateId**
> DomainCertificateAuthority putProvidersEdgesCertificateauthoritiesCertificateId(certificateId, body)

Update a certificate authority.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
DomainCertificateAuthority body = new DomainCertificateAuthority(); // DomainCertificateAuthority | Certificate authority
try {
    DomainCertificateAuthority result = apiInstance.putProvidersEdgesCertificateauthoritiesCertificateId(certificateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesCertificateauthoritiesCertificateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |
 **body** | [**DomainCertificateAuthority**](DomainCertificateAuthority.md)| Certificate authority |

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesDidpoolsDidpoolId"></a>
# **putProvidersEdgesDidpoolsDidpoolId**
> DIDPool putProvidersEdgesDidpoolsDidpoolId(didPoolId, body)

Update a DID Pool by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
DIDPool body = new DIDPool(); // DIDPool | DID pool
try {
    DIDPool result = apiInstance.putProvidersEdgesDidpoolsDidpoolId(didPoolId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesDidpoolsDidpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didPoolId** | **String**| DID pool ID |
 **body** | [**DIDPool**](DIDPool.md)| DID pool |

### Return type

[**DIDPool**](DIDPool.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesDidsDidId"></a>
# **putProvidersEdgesDidsDidId**
> DID putProvidersEdgesDidsDidId(didId, body)

Update a DID by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didId = "didId_example"; // String | DID ID
DID body = new DID(); // DID | DID
try {
    DID result = apiInstance.putProvidersEdgesDidsDidId(didId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesDidsDidId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didId** | **String**| DID ID |
 **body** | [**DID**](DID.md)| DID |

### Return type

[**DID**](DID.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesEdgeId"></a>
# **putProvidersEdgesEdgeId**
> Edge putProvidersEdgesEdgeId(edgeId, body)

Update a edge.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
Edge body = new Edge(); // Edge | Edge
try {
    Edge result = apiInstance.putProvidersEdgesEdgeId(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesEdgeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **body** | [**Edge**](Edge.md)| Edge |

### Return type

[**Edge**](Edge.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesEdgeIdLinesLineId"></a>
# **putProvidersEdgesEdgeIdLinesLineId**
> EdgeLine putProvidersEdgesEdgeIdLinesLineId(edgeId, lineId, body)

Update a line.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String lineId = "lineId_example"; // String | Line ID
EdgeLine body = new EdgeLine(); // EdgeLine | Line
try {
    EdgeLine result = apiInstance.putProvidersEdgesEdgeIdLinesLineId(edgeId, lineId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesEdgeIdLinesLineId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **lineId** | **String**| Line ID |
 **body** | [**EdgeLine**](EdgeLine.md)| Line |

### Return type

[**EdgeLine**](EdgeLine.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId"></a>
# **putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId**
> DomainLogicalInterface putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, body)

Update an edge logical interface.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
DomainLogicalInterface body = new DomainLogicalInterface(); // DomainLogicalInterface | Logical interface
try {
    DomainLogicalInterface result = apiInstance.putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId(edgeId, interfaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesEdgeIdLogicalinterfacesInterfaceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **String**| Edge ID |
 **interfaceId** | **String**| Interface ID |
 **body** | [**DomainLogicalInterface**](DomainLogicalInterface.md)| Logical interface |

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesEdgegroupsEdgegroupId"></a>
# **putProvidersEdgesEdgegroupsEdgegroupId**
> EdgeGroup putProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, body)

Update an edge group.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
EdgeGroup body = new EdgeGroup(); // EdgeGroup | EdgeGroup
try {
    EdgeGroup result = apiInstance.putProvidersEdgesEdgegroupsEdgegroupId(edgeGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesEdgegroupsEdgegroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeGroupId** | **String**| Edge group ID |
 **body** | [**EdgeGroup**](EdgeGroup.md)| EdgeGroup |

### Return type

[**EdgeGroup**](EdgeGroup.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesEndpointsEndpointId"></a>
# **putProvidersEdgesEndpointsEndpointId**
> Endpoint putProvidersEdgesEndpointsEndpointId(endpointId, body)

Update endpoint



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String endpointId = "endpointId_example"; // String | Endpoint ID
Endpoint body = new Endpoint(); // Endpoint | EndpointTemplate
try {
    Endpoint result = apiInstance.putProvidersEdgesEndpointsEndpointId(endpointId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesEndpointsEndpointId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **String**| Endpoint ID |
 **body** | [**Endpoint**](Endpoint.md)| EndpointTemplate |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesExtensionpoolsExtensionpoolId"></a>
# **putProvidersEdgesExtensionpoolsExtensionpoolId**
> ExtensionPool putProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId, body)

Update an extension pool by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
ExtensionPool body = new ExtensionPool(); // ExtensionPool | ExtensionPool
try {
    ExtensionPool result = apiInstance.putProvidersEdgesExtensionpoolsExtensionpoolId(extensionPoolId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesExtensionpoolsExtensionpoolId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionPoolId** | **String**| Extension pool ID |
 **body** | [**ExtensionPool**](ExtensionPool.md)| ExtensionPool |

### Return type

[**ExtensionPool**](ExtensionPool.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesExtensionsExtensionId"></a>
# **putProvidersEdgesExtensionsExtensionId**
> Extension putProvidersEdgesExtensionsExtensionId(extensionId, body)

Update an extension by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionId = "extensionId_example"; // String | Extension ID
Extension body = new Extension(); // Extension | Extension
try {
    Extension result = apiInstance.putProvidersEdgesExtensionsExtensionId(extensionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesExtensionsExtensionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **String**| Extension ID |
 **body** | [**Extension**](Extension.md)| Extension |

### Return type

[**Extension**](Extension.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesOutboundroutesOutboundrouteId"></a>
# **putProvidersEdgesOutboundroutesOutboundrouteId**
> OutboundRoute putProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId, body)

Update outbound route



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
OutboundRoute body = new OutboundRoute(); // OutboundRoute | OutboundRoute
try {
    OutboundRoute result = apiInstance.putProvidersEdgesOutboundroutesOutboundrouteId(outboundRouteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesOutboundroutesOutboundrouteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outboundRouteId** | **String**| Outbound route ID |
 **body** | [**OutboundRoute**](OutboundRoute.md)| OutboundRoute |

### Return type

[**OutboundRoute**](OutboundRoute.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesPhonebasesettingsPhonebaseId"></a>
# **putProvidersEdgesPhonebasesettingsPhonebaseId**
> PhoneBase putProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId, body)

Update a Phone Base Settings by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
PhoneBase body = new PhoneBase(); // PhoneBase | Phone base settings
try {
    PhoneBase result = apiInstance.putProvidersEdgesPhonebasesettingsPhonebaseId(phoneBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesPhonebasesettingsPhonebaseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneBaseId** | **String**| Phone base ID |
 **body** | [**PhoneBase**](PhoneBase.md)| Phone base settings |

### Return type

[**PhoneBase**](PhoneBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesPhonesPhoneId"></a>
# **putProvidersEdgesPhonesPhoneId**
> Phone putProvidersEdgesPhonesPhoneId(phoneId, body)

Update a Phone by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
Phone body = new Phone(); // Phone | Phone
try {
    Phone result = apiInstance.putProvidersEdgesPhonesPhoneId(phoneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesPhonesPhoneId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneId** | **String**| Phone ID |
 **body** | [**Phone**](Phone.md)| Phone |

### Return type

[**Phone**](Phone.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesSitesSiteId"></a>
# **putProvidersEdgesSitesSiteId**
> Site putProvidersEdgesSitesSiteId(siteId, body)

Update a Site by ID.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
Site body = new Site(); // Site | Site
try {
    Site result = apiInstance.putProvidersEdgesSitesSiteId(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesSitesSiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |
 **body** | [**Site**](Site.md)| Site |

### Return type

[**Site**](Site.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesSitesSiteIdNumberplans"></a>
# **putProvidersEdgesSitesSiteIdNumberplans**
> List&lt;NumberPlan&gt; putProvidersEdgesSitesSiteIdNumberplans(siteId, body)

Update the list of Number Plans.



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
List<NumberPlan> body = Arrays.asList(new NumberPlan()); // List<NumberPlan> | List of number plans
try {
    List<NumberPlan> result = apiInstance.putProvidersEdgesSitesSiteIdNumberplans(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesSitesSiteIdNumberplans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| Site ID |
 **body** | [**List&lt;NumberPlan&gt;**](NumberPlan.md)| List of number plans |

### Return type

[**List&lt;NumberPlan&gt;**](NumberPlan.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId"></a>
# **putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId**
> TrunkBase putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId, body)

Update a Trunk Base Settings object by ID



### Example
```java
// Import classes:
//import com.mypurecloud.sdk.ApiClient;
//import com.mypurecloud.sdk.ApiException;
//import com.mypurecloud.sdk.Configuration;
//import com.mypurecloud.sdk.auth.*;
//import com.mypurecloud.sdk.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
TrunkBase body = new TrunkBase(); // TrunkBase | Trunk base settings
try {
    TrunkBase result = apiInstance.putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId(trunkBaseSettingsId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putProvidersEdgesTrunkbasesettingsTrunkbasesettingsId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trunkBaseSettingsId** | **String**| Trunk Base ID |
 **body** | [**TrunkBase**](TrunkBase.md)| Trunk base settings |

### Return type

[**TrunkBase**](TrunkBase.md)

### Authorization

[PureCloud Auth](../README.md#PureCloud Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

