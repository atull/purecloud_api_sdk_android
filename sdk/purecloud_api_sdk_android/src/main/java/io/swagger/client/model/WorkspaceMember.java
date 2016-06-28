package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Group;
import io.swagger.client.model.SecurityProfile;
import io.swagger.client.model.UriReference;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class WorkspaceMember   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("workspace")
  private UriReference workspace = null;


  /**
   * Gets or Sets memberType
   */
  public enum MemberTypeEnum {
    @SerializedName("USER")
    USER("USER"),

    @SerializedName("GROUP")
    GROUP("GROUP");

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

  @SerializedName("user")
  private User user = null;

  @SerializedName("group")
  private Group group = null;

  @SerializedName("securityProfile")
  private SecurityProfile securityProfile = null;

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
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
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
   **/
  @ApiModelProperty(value = "")
  public SecurityProfile getSecurityProfile() {
    return securityProfile;
  }
  public void setSecurityProfile(SecurityProfile securityProfile) {
    this.securityProfile = securityProfile;
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
    WorkspaceMember workspaceMember = (WorkspaceMember) o;
    return Objects.equals(id, workspaceMember.id) &&
        Objects.equals(name, workspaceMember.name) &&
        Objects.equals(workspace, workspaceMember.workspace) &&
        Objects.equals(memberType, workspaceMember.memberType) &&
        Objects.equals(member, workspaceMember.member) &&
        Objects.equals(user, workspaceMember.user) &&
        Objects.equals(group, workspaceMember.group) &&
        Objects.equals(securityProfile, workspaceMember.securityProfile) &&
        Objects.equals(selfUri, workspaceMember.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, workspace, memberType, member, user, group, securityProfile, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    securityProfile: ").append(toIndentedString(securityProfile)).append("\n");
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
