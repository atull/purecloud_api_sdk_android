package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ConversationAssociation   {
  
  @SerializedName("conversationId")
  private String conversationId = null;

  @SerializedName("communicationId")
  private String communicationId = null;


  /**
   * Media type
   */
  public enum MediaTypeEnum {
    @SerializedName("CALL")
    CALL("CALL"),

    @SerializedName("CALLBACK")
    CALLBACK("CALLBACK"),

    @SerializedName("CHAT")
    CHAT("CHAT"),

    @SerializedName("EMAIL")
    EMAIL("EMAIL"),

    @SerializedName("SOCIAL_EXPRESSION")
    SOCIAL_EXPRESSION("SOCIAL_EXPRESSION"),

    @SerializedName("VIDEO")
    VIDEO("VIDEO");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;

  /**
   * Conversation ID
   **/
  @ApiModelProperty(required = true, value = "Conversation ID")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  /**
   * Communication ID
   **/
  @ApiModelProperty(required = true, value = "Communication ID")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }

  /**
   * Media type
   **/
  @ApiModelProperty(required = true, value = "Media type")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAssociation conversationAssociation = (ConversationAssociation) o;
    return Objects.equals(conversationId, conversationAssociation.conversationId) &&
        Objects.equals(communicationId, conversationAssociation.communicationId) &&
        Objects.equals(mediaType, conversationAssociation.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, communicationId, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAssociation {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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
