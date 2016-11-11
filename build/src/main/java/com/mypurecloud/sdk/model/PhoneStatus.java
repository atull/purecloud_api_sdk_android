package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.LineStatus;
import com.mypurecloud.sdk.model.ProvisionInfo;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PhoneStatus  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * The Operational Status of this phone
   */
  public enum OperationalStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("OPERATIONAL")
    OPERATIONAL("OPERATIONAL"),

    @SerializedName("DEGRADED")
    DEGRADED("DEGRADED"),

    @SerializedName("OFFLINE")
    OFFLINE("OFFLINE");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("operationalStatus")
  private OperationalStatusEnum operationalStatus = null;


  /**
   * The status of the primary or secondary Edges assigned to the phone lines.
   */
  public enum EdgesStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("IN_SERVICE")
    IN_SERVICE("IN_SERVICE"),

    @SerializedName("MIXED_SERVICE")
    MIXED_SERVICE("MIXED_SERVICE"),

    @SerializedName("OUT_OF_SERVICE")
    OUT_OF_SERVICE("OUT_OF_SERVICE"),

    @SerializedName("NO_EDGES")
    NO_EDGES("NO_EDGES");

    private String value;

    EdgesStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("edgesStatus")
  private EdgesStatusEnum edgesStatus = null;

  @SerializedName("provision")
  private ProvisionInfo provision = null;

  @SerializedName("lineStatuses")
  private List<LineStatus> lineStatuses = new ArrayList<LineStatus>();


  /**
   * The phone status's edge assignment type.
   */
  public enum PhoneAssignmentToEdgeTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("PRIMARY")
    PRIMARY("PRIMARY"),

    @SerializedName("SECONDARY")
    SECONDARY("SECONDARY");

    private String value;

    PhoneAssignmentToEdgeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("phoneAssignmentToEdgeType")
  private PhoneAssignmentToEdgeTypeEnum phoneAssignmentToEdgeType = null;

  @SerializedName("edge")
  private UriReference edge = null;

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
   * The Operational Status of this phone
   **/
  @ApiModelProperty(value = "The Operational Status of this phone")
  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }
  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  /**
   * The status of the primary or secondary Edges assigned to the phone lines.
   **/
  @ApiModelProperty(value = "The status of the primary or secondary Edges assigned to the phone lines.")
  public EdgesStatusEnum getEdgesStatus() {
    return edgesStatus;
  }
  public void setEdgesStatus(EdgesStatusEnum edgesStatus) {
    this.edgesStatus = edgesStatus;
  }

  /**
   * Provision information for this phone
   **/
  @ApiModelProperty(value = "Provision information for this phone")
  public ProvisionInfo getProvision() {
    return provision;
  }
  public void setProvision(ProvisionInfo provision) {
    this.provision = provision;
  }

  /**
   * A list of LineStatus information for each of the lines of this phone
   **/
  @ApiModelProperty(value = "A list of LineStatus information for each of the lines of this phone")
  public List<LineStatus> getLineStatuses() {
    return lineStatuses;
  }
  public void setLineStatuses(List<LineStatus> lineStatuses) {
    this.lineStatuses = lineStatuses;
  }

  /**
   * The phone status's edge assignment type.
   **/
  @ApiModelProperty(value = "The phone status's edge assignment type.")
  public PhoneAssignmentToEdgeTypeEnum getPhoneAssignmentToEdgeType() {
    return phoneAssignmentToEdgeType;
  }
  public void setPhoneAssignmentToEdgeType(PhoneAssignmentToEdgeTypeEnum phoneAssignmentToEdgeType) {
    this.phoneAssignmentToEdgeType = phoneAssignmentToEdgeType;
  }

  /**
   * The URI of the edge that provided this status information.
   **/
  @ApiModelProperty(value = "The URI of the edge that provided this status information.")
  public UriReference getEdge() {
    return edge;
  }
  public void setEdge(UriReference edge) {
    this.edge = edge;
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
    PhoneStatus phoneStatus = (PhoneStatus) o;
    return Objects.equals(id, phoneStatus.id) &&
        Objects.equals(name, phoneStatus.name) &&
        Objects.equals(operationalStatus, phoneStatus.operationalStatus) &&
        Objects.equals(edgesStatus, phoneStatus.edgesStatus) &&
        Objects.equals(provision, phoneStatus.provision) &&
        Objects.equals(lineStatuses, phoneStatus.lineStatuses) &&
        Objects.equals(phoneAssignmentToEdgeType, phoneStatus.phoneAssignmentToEdgeType) &&
        Objects.equals(edge, phoneStatus.edge) &&
        Objects.equals(selfUri, phoneStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, operationalStatus, edgesStatus, provision, lineStatuses, phoneAssignmentToEdgeType, edge, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    edgesStatus: ").append(toIndentedString(edgesStatus)).append("\n");
    sb.append("    provision: ").append(toIndentedString(provision)).append("\n");
    sb.append("    lineStatuses: ").append(toIndentedString(lineStatuses)).append("\n");
    sb.append("    phoneAssignmentToEdgeType: ").append(toIndentedString(phoneAssignmentToEdgeType)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
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
