package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ChatMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ChatConversation  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("participants")
  private List<ChatMediaParticipant> participants = new ArrayList<ChatMediaParticipant>();

  @SerializedName("otherMediaUris")
  private List<String> otherMediaUris = new ArrayList<String>();

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
   * The list of participants involved in the conversation.
   **/
  @ApiModelProperty(value = "The list of participants involved in the conversation.")
  public List<ChatMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ChatMediaParticipant> participants) {
    this.participants = participants;
  }

  /**
   * The list of other media channels involved in the conversation.
   **/
  @ApiModelProperty(value = "The list of other media channels involved in the conversation.")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
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
    ChatConversation chatConversation = (ChatConversation) o;
    return Objects.equals(id, chatConversation.id) &&
        Objects.equals(name, chatConversation.name) &&
        Objects.equals(participants, chatConversation.participants) &&
        Objects.equals(otherMediaUris, chatConversation.otherMediaUris) &&
        Objects.equals(selfUri, chatConversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
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
