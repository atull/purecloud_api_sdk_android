package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class GroupMembersUpdate  implements Serializable {
  
  @SerializedName("memberIds")
  private List<String> memberIds = new ArrayList<String>();

  @SerializedName("version")
  private Integer version = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMemberIds() {
    return memberIds;
  }
  public void setMemberIds(List<String> memberIds) {
    this.memberIds = memberIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMembersUpdate groupMembersUpdate = (GroupMembersUpdate) o;
    return Objects.equals(memberIds, groupMembersUpdate.memberIds) &&
        Objects.equals(version, groupMembersUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMembersUpdate {\n");
    
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
