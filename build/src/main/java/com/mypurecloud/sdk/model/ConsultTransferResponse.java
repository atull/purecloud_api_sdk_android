package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConsultTransferResponse  implements Serializable {
  
  @SerializedName("destinationParticipantId")
  private String destinationParticipantId = null;

  /**
   * Participant ID to whom the call is being transferred.
   **/
  @ApiModelProperty(required = true, value = "Participant ID to whom the call is being transferred.")
  public String getDestinationParticipantId() {
    return destinationParticipantId;
  }
  public void setDestinationParticipantId(String destinationParticipantId) {
    this.destinationParticipantId = destinationParticipantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferResponse consultTransferResponse = (ConsultTransferResponse) o;
    return Objects.equals(destinationParticipantId, consultTransferResponse.destinationParticipantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationParticipantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferResponse {\n");
    
    sb.append("    destinationParticipantId: ").append(toIndentedString(destinationParticipantId)).append("\n");
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
