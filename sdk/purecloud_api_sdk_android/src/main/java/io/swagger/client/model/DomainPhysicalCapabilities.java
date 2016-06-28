package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DomainPhysicalCapabilities   {
  
  @SerializedName("vlan")
  private Boolean vlan = false;

  @SerializedName("team")
  private Boolean team = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVlan() {
    return vlan;
  }
  public void setVlan(Boolean vlan) {
    this.vlan = vlan;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTeam() {
    return team;
  }
  public void setTeam(Boolean team) {
    this.team = team;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPhysicalCapabilities domainPhysicalCapabilities = (DomainPhysicalCapabilities) o;
    return Objects.equals(vlan, domainPhysicalCapabilities.vlan) &&
        Objects.equals(team, domainPhysicalCapabilities.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlan, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPhysicalCapabilities {\n");
    
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
