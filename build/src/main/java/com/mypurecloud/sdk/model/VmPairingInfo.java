package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.MetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class VmPairingInfo  implements Serializable {
  
  @SerializedName("meta-data")
  private MetaData metaData = null;

  @SerializedName("edge-id")
  private String edgeId = null;

  @SerializedName("auth-token")
  private String authToken = null;

  @SerializedName("org-id")
  private String orgId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public MetaData getMetaData() {
    return metaData;
  }
  public void setMetaData(MetaData metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrgId() {
    return orgId;
  }
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmPairingInfo vmPairingInfo = (VmPairingInfo) o;
    return Objects.equals(metaData, vmPairingInfo.metaData) &&
        Objects.equals(edgeId, vmPairingInfo.edgeId) &&
        Objects.equals(authToken, vmPairingInfo.authToken) &&
        Objects.equals(orgId, vmPairingInfo.orgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, edgeId, authToken, orgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmPairingInfo {\n");
    
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
