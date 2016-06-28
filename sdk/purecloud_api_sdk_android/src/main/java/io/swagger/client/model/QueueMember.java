package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoutingStatus;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class QueueMember   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("ringNumber")
  private Integer ringNumber = null;

  @SerializedName("joined")
  private Boolean joined = false;

  @SerializedName("memberBy")
  private String memberBy = null;

  @SerializedName("routingStatus")
  private RoutingStatus routingStatus = null;

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
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRingNumber() {
    return ringNumber;
  }
  public void setRingNumber(Integer ringNumber) {
    this.ringNumber = ringNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getJoined() {
    return joined;
  }
  public void setJoined(Boolean joined) {
    this.joined = joined;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMemberBy() {
    return memberBy;
  }
  public void setMemberBy(String memberBy) {
    this.memberBy = memberBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
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
    QueueMember queueMember = (QueueMember) o;
    return Objects.equals(id, queueMember.id) &&
        Objects.equals(name, queueMember.name) &&
        Objects.equals(user, queueMember.user) &&
        Objects.equals(ringNumber, queueMember.ringNumber) &&
        Objects.equals(joined, queueMember.joined) &&
        Objects.equals(memberBy, queueMember.memberBy) &&
        Objects.equals(routingStatus, queueMember.routingStatus) &&
        Objects.equals(selfUri, queueMember.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, ringNumber, joined, memberBy, routingStatus, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ringNumber: ").append(toIndentedString(ringNumber)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
    sb.append("    memberBy: ").append(toIndentedString(memberBy)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
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
