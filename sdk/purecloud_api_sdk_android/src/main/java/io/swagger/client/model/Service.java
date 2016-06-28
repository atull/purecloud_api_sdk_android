package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Carrier;
import io.swagger.client.model.Dns;
import io.swagger.client.model.Gateway;
import io.swagger.client.model.ServiceType;
import io.swagger.client.model.Vpn;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Service   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("domains")
  private List<String> domains = new ArrayList<String>();

  @SerializedName("serviceTypes")
  private List<ServiceType> serviceTypes = new ArrayList<ServiceType>();

  @SerializedName("gateways")
  private List<Gateway> gateways = new ArrayList<Gateway>();

  @SerializedName("dns")
  private Dns dns = null;

  @SerializedName("vpn")
  private Vpn vpn = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * An inbound carrier specific domain (i.e. lb.domain.com)
   **/
  @ApiModelProperty(value = "An inbound carrier specific domain (i.e. lb.domain.com)")
  public List<String> getDomains() {
    return domains;
  }
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ServiceType> getServiceTypes() {
    return serviceTypes;
  }
  public void setServiceTypes(List<ServiceType> serviceTypes) {
    this.serviceTypes = serviceTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Gateway> getGateways() {
    return gateways;
  }
  public void setGateways(List<Gateway> gateways) {
    this.gateways = gateways;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Dns getDns() {
    return dns;
  }
  public void setDns(Dns dns) {
    this.dns = dns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Vpn getVpn() {
    return vpn;
  }
  public void setVpn(Vpn vpn) {
    this.vpn = vpn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Carrier getCarrier() {
    return carrier;
  }
  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(id, service.id) &&
        Objects.equals(name, service.name) &&
        Objects.equals(status, service.status) &&
        Objects.equals(domains, service.domains) &&
        Objects.equals(serviceTypes, service.serviceTypes) &&
        Objects.equals(gateways, service.gateways) &&
        Objects.equals(dns, service.dns) &&
        Objects.equals(vpn, service.vpn) &&
        Objects.equals(carrier, service.carrier) &&
        Objects.equals(selfUri, service.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, domains, serviceTypes, gateways, dns, vpn, carrier, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
    sb.append("    gateways: ").append(toIndentedString(gateways)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    vpn: ").append(toIndentedString(vpn)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
