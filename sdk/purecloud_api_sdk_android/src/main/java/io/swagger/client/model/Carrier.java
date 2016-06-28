package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AccountManager;
import io.swagger.client.model.CarrierAddress;
import io.swagger.client.model.NocSupport;
import io.swagger.client.model.Service;
import io.swagger.client.model.Support;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Carrier   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accountManager")
  private AccountManager accountManager = null;

  @SerializedName("support")
  private Support support = null;

  @SerializedName("nocSupport")
  private NocSupport nocSupport = null;

  @SerializedName("services")
  private List<Service> services = new ArrayList<Service>();

  @SerializedName("selfUri")
  private String selfUri = null;

  @SerializedName("address")
  private CarrierAddress address = null;

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
  public AccountManager getAccountManager() {
    return accountManager;
  }
  public void setAccountManager(AccountManager accountManager) {
    this.accountManager = accountManager;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Support getSupport() {
    return support;
  }
  public void setSupport(Support support) {
    this.support = support;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NocSupport getNocSupport() {
    return nocSupport;
  }
  public void setNocSupport(NocSupport nocSupport) {
    this.nocSupport = nocSupport;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CarrierAddress getAddress() {
    return address;
  }
  public void setAddress(CarrierAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrier carrier = (Carrier) o;
    return Objects.equals(id, carrier.id) &&
        Objects.equals(name, carrier.name) &&
        Objects.equals(accountManager, carrier.accountManager) &&
        Objects.equals(support, carrier.support) &&
        Objects.equals(nocSupport, carrier.nocSupport) &&
        Objects.equals(services, carrier.services) &&
        Objects.equals(selfUri, carrier.selfUri) &&
        Objects.equals(address, carrier.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accountManager, support, nocSupport, services, selfUri, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountManager: ").append(toIndentedString(accountManager)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    nocSupport: ").append(toIndentedString(nocSupport)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
