package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DomainCapabilities   {
  
  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("dhcp")
  private Boolean dhcp = false;

  @SerializedName("metric")
  private Integer metric = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDhcp() {
    return dhcp;
  }
  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainCapabilities domainCapabilities = (DomainCapabilities) o;
    return Objects.equals(enabled, domainCapabilities.enabled) &&
        Objects.equals(dhcp, domainCapabilities.dhcp) &&
        Objects.equals(metric, domainCapabilities.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, dhcp, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainCapabilities {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
