package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ConsultTransferUpdate   {
  

  /**
   * Determines to whom the initiating participant is speaking.
   */
  public enum SpeakToEnum {
    @SerializedName("DESTINATION")
    DESTINATION("DESTINATION"),

    @SerializedName("OBJECT")
    OBJECT("OBJECT"),

    @SerializedName("BOTH")
    BOTH("BOTH");

    private String value;

    SpeakToEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("speakTo")
  private SpeakToEnum speakTo = null;

  /**
   * Determines to whom the initiating participant is speaking.
   **/
  @ApiModelProperty(required = true, value = "Determines to whom the initiating participant is speaking.")
  public SpeakToEnum getSpeakTo() {
    return speakTo;
  }
  public void setSpeakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferUpdate consultTransferUpdate = (ConsultTransferUpdate) o;
    return Objects.equals(speakTo, consultTransferUpdate.speakTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferUpdate {\n");
    
    sb.append("    speakTo: ").append(toIndentedString(speakTo)).append("\n");
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
