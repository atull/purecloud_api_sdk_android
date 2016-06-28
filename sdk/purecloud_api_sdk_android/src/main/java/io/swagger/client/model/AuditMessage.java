package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuditEntity;
import io.swagger.client.model.AuditUser;
import io.swagger.client.model.Change;
import io.swagger.client.model.ServiceContext;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AuditMessage   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("user")
  private AuditUser user = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("transactionInitiator")
  private Boolean transactionInitiator = false;

  @SerializedName("application")
  private String application = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("receivedTimestamp")
  private String receivedTimestamp = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("actionContext")
  private String actionContext = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("changes")
  private List<Change> changes = new ArrayList<Change>();

  @SerializedName("entity")
  private AuditEntity entity = null;

  @SerializedName("serviceContext")
  private ServiceContext serviceContext = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   **/
  @ApiModelProperty(value = "")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTransactionInitiator() {
    return transactionInitiator;
  }
  public void setTransactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
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
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceivedTimestamp() {
    return receivedTimestamp;
  }
  public void setReceivedTimestamp(String receivedTimestamp) {
    this.receivedTimestamp = receivedTimestamp;
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
  public String getActionContext() {
    return actionContext;
  }
  public void setActionContext(String actionContext) {
    this.actionContext = actionContext;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceContext getServiceContext() {
    return serviceContext;
  }
  public void setServiceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditMessage auditMessage = (AuditMessage) o;
    return Objects.equals(id, auditMessage.id) &&
        Objects.equals(user, auditMessage.user) &&
        Objects.equals(correlationId, auditMessage.correlationId) &&
        Objects.equals(transactionId, auditMessage.transactionId) &&
        Objects.equals(transactionInitiator, auditMessage.transactionInitiator) &&
        Objects.equals(application, auditMessage.application) &&
        Objects.equals(serviceName, auditMessage.serviceName) &&
        Objects.equals(level, auditMessage.level) &&
        Objects.equals(timestamp, auditMessage.timestamp) &&
        Objects.equals(receivedTimestamp, auditMessage.receivedTimestamp) &&
        Objects.equals(status, auditMessage.status) &&
        Objects.equals(actionContext, auditMessage.actionContext) &&
        Objects.equals(action, auditMessage.action) &&
        Objects.equals(changes, auditMessage.changes) &&
        Objects.equals(entity, auditMessage.entity) &&
        Objects.equals(serviceContext, auditMessage.serviceContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, correlationId, transactionId, transactionInitiator, application, serviceName, level, timestamp, receivedTimestamp, status, actionContext, action, changes, entity, serviceContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInitiator: ").append(toIndentedString(transactionInitiator)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    receivedTimestamp: ").append(toIndentedString(receivedTimestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    serviceContext: ").append(toIndentedString(serviceContext)).append("\n");
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
