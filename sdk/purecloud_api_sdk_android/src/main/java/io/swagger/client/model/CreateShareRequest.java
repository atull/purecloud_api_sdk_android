package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CreateShareRequestMember;
import io.swagger.client.model.SharedEntity;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class CreateShareRequest   {
  

  /**
   * Gets or Sets sharedEntityType
   */
  public enum SharedEntityTypeEnum {
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
  private SharedEntity sharedEntity = null;


  /**
   * Gets or Sets memberType
   */
  public enum MemberTypeEnum {
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
  private SharedEntity member = null;

  @SerializedName("members")
  private List<CreateShareRequestMember> members = new ArrayList<CreateShareRequestMember>();

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
  public SharedEntity getSharedEntity() {
    return sharedEntity;
  }
  public void setSharedEntity(SharedEntity sharedEntity) {
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
  public SharedEntity getMember() {
    return member;
  }
  public void setMember(SharedEntity member) {
    this.member = member;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CreateShareRequestMember> getMembers() {
    return members;
  }
  public void setMembers(List<CreateShareRequestMember> members) {
    this.members = members;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShareRequest createShareRequest = (CreateShareRequest) o;
    return Objects.equals(sharedEntityType, createShareRequest.sharedEntityType) &&
        Objects.equals(sharedEntity, createShareRequest.sharedEntity) &&
        Objects.equals(memberType, createShareRequest.memberType) &&
        Objects.equals(member, createShareRequest.member) &&
        Objects.equals(members, createShareRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedEntityType, sharedEntity, memberType, member, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShareRequest {\n");
    
    sb.append("    sharedEntityType: ").append(toIndentedString(sharedEntityType)).append("\n");
    sb.append("    sharedEntity: ").append(toIndentedString(sharedEntity)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
