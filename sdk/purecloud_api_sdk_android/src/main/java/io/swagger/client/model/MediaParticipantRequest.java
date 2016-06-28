package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Wrapup;

import com.google.gson.annotations.SerializedName;





public class MediaParticipantRequest   {
  
  @SerializedName("wrapup")
  private Wrapup wrapup = null;


  /**
   * The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.
   */
  public enum StateEnum {
    @SerializedName("ALERTING")
    ALERTING("ALERTING"),

    @SerializedName("DIALING")
    DIALING("DIALING"),

    @SerializedName("CONTACTING")
    CONTACTING("CONTACTING"),

    @SerializedName("OFFERING")
    OFFERING("OFFERING"),

    @SerializedName("CONNECTED")
    CONNECTED("CONNECTED"),

    @SerializedName("DISCONNECTED")
    DISCONNECTED("DISCONNECTED"),

    @SerializedName("TERMINATED")
    TERMINATED("TERMINATED"),

    @SerializedName("CONVERTING")
    CONVERTING("CONVERTING"),

    @SerializedName("UPLOADING")
    UPLOADING("UPLOADING"),

    @SerializedName("TRANSMITTING")
    TRANSMITTING("TRANSMITTING"),

    @SerializedName("NONE")
    NONE("NONE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("recording")
  private Boolean recording = false;

  @SerializedName("muted")
  private Boolean muted = false;

  @SerializedName("confined")
  private Boolean confined = false;

  @SerializedName("held")
  private Boolean held = false;

  @SerializedName("wrapupSkipped")
  private Boolean wrapupSkipped = false;

  /**
   * Wrap-up to assign to this participant.
   **/
  @ApiModelProperty(value = "Wrap-up to assign to this participant.")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
    this.wrapup = wrapup;
  }

  /**
   * The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.
   **/
  @ApiModelProperty(value = "The state to update to set for this participant's communications.  Possible values are: 'connected' and 'disconnected'.")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * True to enable recording of this participant, otherwise false to disable recording.
   **/
  @ApiModelProperty(value = "True to enable recording of this participant, otherwise false to disable recording.")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  /**
   * True to mute this conversation participant.
   **/
  @ApiModelProperty(value = "True to mute this conversation participant.")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  /**
   * True to confine this conversation participant.  Should only be used for ad-hoc conferences
   **/
  @ApiModelProperty(value = "True to confine this conversation participant.  Should only be used for ad-hoc conferences")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  /**
   * True to hold this conversation participant.
   **/
  @ApiModelProperty(value = "True to hold this conversation participant.")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  /**
   * True to skip wrap-up for this participant.
   **/
  @ApiModelProperty(value = "True to skip wrap-up for this participant.")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaParticipantRequest mediaParticipantRequest = (MediaParticipantRequest) o;
    return Objects.equals(wrapup, mediaParticipantRequest.wrapup) &&
        Objects.equals(state, mediaParticipantRequest.state) &&
        Objects.equals(recording, mediaParticipantRequest.recording) &&
        Objects.equals(muted, mediaParticipantRequest.muted) &&
        Objects.equals(confined, mediaParticipantRequest.confined) &&
        Objects.equals(held, mediaParticipantRequest.held) &&
        Objects.equals(wrapupSkipped, mediaParticipantRequest.wrapupSkipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrapup, state, recording, muted, confined, held, wrapupSkipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaParticipantRequest {\n");
    
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
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
