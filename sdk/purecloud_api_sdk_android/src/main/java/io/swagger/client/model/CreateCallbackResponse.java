package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallbackIdentifier;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class CreateCallbackResponse   {
  
  @SerializedName("conversation")
  private UriReference conversation = null;

  @SerializedName("callbackIdentifiers")
  private List<CallbackIdentifier> callbackIdentifiers = new ArrayList<CallbackIdentifier>();

  /**
   * The conversation associated with the callback
   **/
  @ApiModelProperty(required = true, value = "The conversation associated with the callback")
  public UriReference getConversation() {
    return conversation;
  }
  public void setConversation(UriReference conversation) {
    this.conversation = conversation;
  }

  /**
   * The list of communication identifiers for the callback participants
   **/
  @ApiModelProperty(required = true, value = "The list of communication identifiers for the callback participants")
  public List<CallbackIdentifier> getCallbackIdentifiers() {
    return callbackIdentifiers;
  }
  public void setCallbackIdentifiers(List<CallbackIdentifier> callbackIdentifiers) {
    this.callbackIdentifiers = callbackIdentifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallbackResponse createCallbackResponse = (CreateCallbackResponse) o;
    return Objects.equals(conversation, createCallbackResponse.conversation) &&
        Objects.equals(callbackIdentifiers, createCallbackResponse.callbackIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, callbackIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallbackResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    callbackIdentifiers: ").append(toIndentedString(callbackIdentifiers)).append("\n");
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
