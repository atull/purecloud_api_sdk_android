package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuditEntity;
import io.swagger.client.model.Change;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class QualityAudit   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("entity")
  private AuditEntity entity = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("changes")
  private List<Change> changes = new ArrayList<Change>();

  @SerializedName("entityType")
  private String entityType = null;

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
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
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
    QualityAudit qualityAudit = (QualityAudit) o;
    return Objects.equals(id, qualityAudit.id) &&
        Objects.equals(name, qualityAudit.name) &&
        Objects.equals(user, qualityAudit.user) &&
        Objects.equals(timestamp, qualityAudit.timestamp) &&
        Objects.equals(entity, qualityAudit.entity) &&
        Objects.equals(level, qualityAudit.level) &&
        Objects.equals(action, qualityAudit.action) &&
        Objects.equals(status, qualityAudit.status) &&
        Objects.equals(changes, qualityAudit.changes) &&
        Objects.equals(entityType, qualityAudit.entityType) &&
        Objects.equals(selfUri, qualityAudit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, timestamp, entity, level, action, status, changes, entityType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityAudit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
