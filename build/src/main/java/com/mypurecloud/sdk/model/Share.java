package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Group;
import com.mypurecloud.sdk.model.UriReference;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Share  implements Serializable {
  
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

  @SerializedName("user")
  private User user = null;

  @SerializedName("group")
  private Group group = null;

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
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
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
    Share share = (Share) o;
    return Objects.equals(id, share.id) &&
        Objects.equals(name, share.name) &&
        Objects.equals(sharedEntityType, share.sharedEntityType) &&
        Objects.equals(sharedEntity, share.sharedEntity) &&
        Objects.equals(memberType, share.memberType) &&
        Objects.equals(member, share.member) &&
        Objects.equals(sharedBy, share.sharedBy) &&
        Objects.equals(workspace, share.workspace) &&
        Objects.equals(user, share.user) &&
        Objects.equals(group, share.group) &&
        Objects.equals(selfUri, share.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sharedEntityType, sharedEntity, memberType, member, sharedBy, workspace, user, group, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Share {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
