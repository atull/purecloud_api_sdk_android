package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuditEntity;
import io.swagger.client.model.AuditUser;
import io.swagger.client.model.Change;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ArchitectAuditMessage   {
  

  /**
   * The audit action
   */
  public enum ActionEnum {
    @SerializedName("CHECKIN")
    CHECKIN("CHECKIN"),

    @SerializedName("PUBLISH")
    PUBLISH("PUBLISH"),

    @SerializedName("DELETE")
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("user")
  private AuditUser user = null;

  @SerializedName("timestamp")
  private Date timestamp = null;

  @SerializedName("changes")
  private List<Change> changes = new ArrayList<Change>();

  @SerializedName("entity")
  private AuditEntity entity = null;

  /**
   * The audit action
   **/
  @ApiModelProperty(value = "The audit action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AuditUser getUser() {
    return user;
  }
  public void setUser(AuditUser user) {
    this.user = user;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Change> getChanges() {
    return changes;
  }
  public void setChanges(List<Change> changes) {
    this.changes = changes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AuditEntity getEntity() {
    return entity;
  }
  public void setEntity(AuditEntity entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectAuditMessage architectAuditMessage = (ArchitectAuditMessage) o;
    return Objects.equals(action, architectAuditMessage.action) &&
        Objects.equals(user, architectAuditMessage.user) &&
        Objects.equals(timestamp, architectAuditMessage.timestamp) &&
        Objects.equals(changes, architectAuditMessage.changes) &&
        Objects.equals(entity, architectAuditMessage.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, user, timestamp, changes, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectAuditMessage {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
