package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalyticsSession;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AnalyticsParticipant   {
  
  @SerializedName("participantId")
  private String participantId = null;

  @SerializedName("participantName")
  private String participantName = null;

  @SerializedName("userId")
  private String userId = null;


  /**
   * Gets or Sets purpose
   */
  public enum PurposeEnum {
    @SerializedName("manual")
    MANUAL("manual"),

    @SerializedName("dialer")
    DIALER("dialer"),

    @SerializedName("inbound")
    INBOUND("inbound"),

    @SerializedName("acd")
    ACD("acd"),

    @SerializedName("ivr")
    IVR("ivr"),

    @SerializedName("voicemail")
    VOICEMAIL("voicemail"),

    @SerializedName("outbound")
    OUTBOUND("outbound"),

    @SerializedName("agent")
    AGENT("agent"),

    @SerializedName("user")
    USER("user"),

    @SerializedName("station")
    STATION("station"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("customer")
    CUSTOMER("customer"),

    @SerializedName("external")
    EXTERNAL("external");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("purpose")
  private PurposeEnum purpose = null;

  @SerializedName("sessions")
  private List<AnalyticsSession> sessions = new ArrayList<AnalyticsSession>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getParticipantName() {
    return participantName;
  }
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AnalyticsSession> getSessions() {
    return sessions;
  }
  public void setSessions(List<AnalyticsSession> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsParticipant analyticsParticipant = (AnalyticsParticipant) o;
    return Objects.equals(participantId, analyticsParticipant.participantId) &&
        Objects.equals(participantName, analyticsParticipant.participantName) &&
        Objects.equals(userId, analyticsParticipant.userId) &&
        Objects.equals(purpose, analyticsParticipant.purpose) &&
        Objects.equals(sessions, analyticsParticipant.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantId, participantName, userId, purpose, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsParticipant {\n");
    
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
