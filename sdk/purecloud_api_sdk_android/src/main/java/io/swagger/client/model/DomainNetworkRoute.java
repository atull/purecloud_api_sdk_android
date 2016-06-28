package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DomainNetworkRoute   {
  
  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("nexthop")
  private String nexthop = null;

  @SerializedName("persistent")
  private Boolean persistent = false;

  @SerializedName("metric")
  private Integer metric = null;

  @SerializedName("family")
  private Integer family = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNexthop() {
    return nexthop;
  }
  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPersistent() {
    return persistent;
  }
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMetric() {
    return metric;
  }
  public void setMetric(Integer metric) {
    this.metric = metric;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFamily() {
    return family;
  }
  public void setFamily(Integer family) {
    this.family = family;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainNetworkRoute domainNetworkRoute = (DomainNetworkRoute) o;
    return Objects.equals(prefix, domainNetworkRoute.prefix) &&
        Objects.equals(nexthop, domainNetworkRoute.nexthop) &&
        Objects.equals(persistent, domainNetworkRoute.persistent) &&
        Objects.equals(metric, domainNetworkRoute.metric) &&
        Objects.equals(family, domainNetworkRoute.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, nexthop, persistent, metric, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkRoute {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
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
