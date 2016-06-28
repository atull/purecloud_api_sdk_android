package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Destination;

import com.google.gson.annotations.SerializedName;





public class ConsultTransfer   {
  

  /**
   * Determines to whom the initiating participant is speaking. Defaults to DESTINATION
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

  @SerializedName("destination")
  private Destination destination = null;

  /**
   * Determines to whom the initiating participant is speaking. Defaults to DESTINATION
   **/
  @ApiModelProperty(value = "Determines to whom the initiating participant is speaking. Defaults to DESTINATION")
  public SpeakToEnum getSpeakTo() {
    return speakTo;
  }
  public void setSpeakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
  }

  /**
   * Destination phone number and name.
   **/
  @ApiModelProperty(required = true, value = "Destination phone number and name.")
  public Destination getDestination() {
    return destination;
  }
  public void setDestination(Destination destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransfer consultTransfer = (ConsultTransfer) o;
    return Objects.equals(speakTo, consultTransfer.speakTo) &&
        Objects.equals(destination, consultTransfer.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakTo, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransfer {\n");
    
    sb.append("    speakTo: ").append(toIndentedString(speakTo)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
