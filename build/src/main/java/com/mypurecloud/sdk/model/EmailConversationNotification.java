package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.EmailConversationNotificationParticipants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EmailConversationNotification  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("participants")
  private List<EmailConversationNotificationParticipants> participants = new ArrayList<EmailConversationNotificationParticipants>();

  @SerializedName("otherMediaUris")
  private List<String> otherMediaUris = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  public List<EmailConversationNotificationParticipants> getParticipants() {
    return participants;
  }
  public void setParticipants(List<EmailConversationNotificationParticipants> participants) {
    this.participants = participants;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConversationNotification emailConversationNotification = (EmailConversationNotification) o;
    return Objects.equals(id, emailConversationNotification.id) &&
        Objects.equals(name, emailConversationNotification.name) &&
        Objects.equals(participants, emailConversationNotification.participants) &&
        Objects.equals(otherMediaUris, emailConversationNotification.otherMediaUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConversationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
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
