package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Share;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CreateShareResponse  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets sharedEntityType
   */
  public enum SharedEntityTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT");

    private String value;

    SharedEntityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sharedEntityType")
  private SharedEntityTypeEnum sharedEntityType = null;

  @SerializedName("sharedEntity")
  private UriReference sharedEntity = null;


  /**
   * Gets or Sets memberType
   */
  public enum MemberTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("GROUP")
    GROUP("GROUP"),

    @SerializedName("PUBLIC")
    PUBLIC("PUBLIC");

    private String value;

    MemberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("memberType")
  private MemberTypeEnum memberType = null;

  @SerializedName("member")
  private UriReference member = null;

  @SerializedName("sharedBy")
  private UriReference sharedBy = null;

  @SerializedName("workspace")
  private UriReference workspace = null;

  @SerializedName("succeeded")
  private List<Share> succeeded = new ArrayList<Share>();

  @SerializedName("failed")
  private List<Share> failed = new ArrayList<Share>();

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
  public SharedEntityTypeEnum getSharedEntityType() {
    return sharedEntityType;
  }
  public void setSharedEntityType(SharedEntityTypeEnum sharedEntityType) {
    this.sharedEntityType = sharedEntityType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getSharedEntity() {
    return sharedEntity;
  }
  public void setSharedEntity(UriReference sharedEntity) {
    this.sharedEntity = sharedEntity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MemberTypeEnum getMemberType() {
    return memberType;
  }
  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getMember() {
    return member;
  }
  public void setMember(UriReference member) {
    this.member = member;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getSharedBy() {
    return sharedBy;
  }
  public void setSharedBy(UriReference sharedBy) {
    this.sharedBy = sharedBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Share> getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(List<Share> succeeded) {
    this.succeeded = succeeded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Share> getFailed() {
    return failed;
  }
  public void setFailed(List<Share> failed) {
    this.failed = failed;
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
    CreateShareResponse createShareResponse = (CreateShareResponse) o;
    return Objects.equals(id, createShareResponse.id) &&
        Objects.equals(name, createShareResponse.name) &&
        Objects.equals(sharedEntityType, createShareResponse.sharedEntityType) &&
        Objects.equals(sharedEntity, createShareResponse.sharedEntity) &&
        Objects.equals(memberType, createShareResponse.memberType) &&
        Objects.equals(member, createShareResponse.member) &&
        Objects.equals(sharedBy, createShareResponse.sharedBy) &&
        Objects.equals(workspace, createShareResponse.workspace) &&
        Objects.equals(succeeded, createShareResponse.succeeded) &&
        Objects.equals(failed, createShareResponse.failed) &&
        Objects.equals(selfUri, createShareResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sharedEntityType, sharedEntity, memberType, member, sharedBy, workspace, succeeded, failed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
