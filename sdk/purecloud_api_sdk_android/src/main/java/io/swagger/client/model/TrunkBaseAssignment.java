package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class TrunkBaseAssignment   {
  
  @SerializedName("family")
  private Integer family = null;

  @SerializedName("trunkBase")
  private UriReference trunkBase = null;

  /**
   * The address family to use with the trunk base settings. 2=IPv4, 23=IPv6
   **/
  @ApiModelProperty(value = "The address family to use with the trunk base settings. 2=IPv4, 23=IPv6")
  public Integer getFamily() {
    return family;
  }
  public void setFamily(Integer family) {
    this.family = family;
  }

  /**
   * A trunk base settings reference.
   **/
  @ApiModelProperty(value = "A trunk base settings reference.")
  public UriReference getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(UriReference trunkBase) {
    this.trunkBase = trunkBase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkBaseAssignment trunkBaseAssignment = (TrunkBaseAssignment) o;
    return Objects.equals(family, trunkBaseAssignment.family) &&
        Objects.equals(trunkBase, trunkBaseAssignment.trunkBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, trunkBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkBaseAssignment {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
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
