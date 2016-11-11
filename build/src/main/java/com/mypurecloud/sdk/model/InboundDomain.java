package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InboundDomain  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Mx Record Status
   */
  public enum MxRecordStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("VALID")
    VALID("VALID"),

    @SerializedName("INVALID")
    INVALID("INVALID"),

    @SerializedName("NOT_AVAILABLE")
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    MxRecordStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mxRecordStatus")
  private MxRecordStatusEnum mxRecordStatus = null;

  @SerializedName("subDomain")
  private Boolean subDomain = false;

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
   * Mx Record Status
   **/
  @ApiModelProperty(required = true, value = "Mx Record Status")
  public MxRecordStatusEnum getMxRecordStatus() {
    return mxRecordStatus;
  }
  public void setMxRecordStatus(MxRecordStatusEnum mxRecordStatus) {
    this.mxRecordStatus = mxRecordStatus;
  }

  /**
   * Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.
   **/
  @ApiModelProperty(value = "Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.")
  public Boolean getSubDomain() {
    return subDomain;
  }
  public void setSubDomain(Boolean subDomain) {
    this.subDomain = subDomain;
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
    InboundDomain inboundDomain = (InboundDomain) o;
    return Objects.equals(id, inboundDomain.id) &&
        Objects.equals(name, inboundDomain.name) &&
        Objects.equals(mxRecordStatus, inboundDomain.mxRecordStatus) &&
        Objects.equals(subDomain, inboundDomain.subDomain) &&
        Objects.equals(selfUri, inboundDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mxRecordStatus, subDomain, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mxRecordStatus: ").append(toIndentedString(mxRecordStatus)).append("\n");
    sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
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
