package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AuditChange;
import com.mypurecloud.sdk.model.AuditEntityReference;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DocumentAudit  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private UriReference user = null;

  @SerializedName("workspace")
  private UriReference workspace = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("transactionInitiator")
  private Boolean transactionInitiator = false;

  @SerializedName("application")
  private String application = null;

  @SerializedName("serviceName")
  private String serviceName = null;


  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("SYSTEM")
    SYSTEM("SYSTEM");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  @SerializedName("timestamp")
  private Date timestamp = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),

    @SerializedName("FAILURE")
    FAILURE("FAILURE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;


  /**
   * Gets or Sets actionContext
   */
  public enum ActionContextEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("CREATE")
    CREATE("CREATE"),

    @SerializedName("READ")
    READ("READ"),

    @SerializedName("UPDATE")
    UPDATE("UPDATE"),

    @SerializedName("DELETE")
    DELETE("DELETE"),

    @SerializedName("DOWNLOAD")
    DOWNLOAD("DOWNLOAD"),

    @SerializedName("VIEW")
    VIEW("VIEW"),

    @SerializedName("UPLOAD")
    UPLOAD("UPLOAD"),

    @SerializedName("SAVE")
    SAVE("SAVE"),

    @SerializedName("MOVE")
    MOVE("MOVE"),

    @SerializedName("COPY")
    COPY("COPY"),

    @SerializedName("ADD")
    ADD("ADD"),

    @SerializedName("REMOVE")
    REMOVE("REMOVE"),

    @SerializedName("RECEIVE")
    RECEIVE("RECEIVE"),

    @SerializedName("CONVERT")
    CONVERT("CONVERT"),

    @SerializedName("FAX")
    FAX("FAX"),

    @SerializedName("CREATE_COVERPAGE")
    CREATE_COVERPAGE("CREATE_COVERPAGE"),

    @SerializedName("USER_ADD")
    USER_ADD("USER_ADD"),

    @SerializedName("USER_REMOVE")
    USER_REMOVE("USER_REMOVE"),

    @SerializedName("MEMBER_ADD")
    MEMBER_ADD("MEMBER_ADD"),

    @SerializedName("MEMBER_REMOVE")
    MEMBER_REMOVE("MEMBER_REMOVE"),

    @SerializedName("MEMBER_UPDATE")
    MEMBER_UPDATE("MEMBER_UPDATE"),

    @SerializedName("TAG_ADD")
    TAG_ADD("TAG_ADD"),

    @SerializedName("TAG_REMOVE")
    TAG_REMOVE("TAG_REMOVE"),

    @SerializedName("TAG_UPDATE")
    TAG_UPDATE("TAG_UPDATE"),

    @SerializedName("ATTRIBUTE_ADD")
    ATTRIBUTE_ADD("ATTRIBUTE_ADD"),

    @SerializedName("ATTRIBUTE_REMOVE")
    ATTRIBUTE_REMOVE("ATTRIBUTE_REMOVE"),

    @SerializedName("ATTRIBUTE_UPDATE")
    ATTRIBUTE_UPDATE("ATTRIBUTE_UPDATE"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_ADD")
    ATTRIBUTE_GROUP_INSTANCE_ADD("ATTRIBUTE_GROUP_INSTANCE_ADD"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_REMOVE")
    ATTRIBUTE_GROUP_INSTANCE_REMOVE("ATTRIBUTE_GROUP_INSTANCE_REMOVE"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_UPDATE")
    ATTRIBUTE_GROUP_INSTANCE_UPDATE("ATTRIBUTE_GROUP_INSTANCE_UPDATE"),

    @SerializedName("INDEX_SAVE")
    INDEX_SAVE("INDEX_SAVE"),

    @SerializedName("INDEX_DELETE")
    INDEX_DELETE("INDEX_DELETE"),

    @SerializedName("INDEX_CREATE")
    INDEX_CREATE("INDEX_CREATE"),

    @SerializedName("FILE_SAVE")
    FILE_SAVE("FILE_SAVE"),

    @SerializedName("FILE_DELETE")
    FILE_DELETE("FILE_DELETE"),

    @SerializedName("FILE_READ")
    FILE_READ("FILE_READ"),

    @SerializedName("THUMBNAIL_CREATE")
    THUMBNAIL_CREATE("THUMBNAIL_CREATE"),

    @SerializedName("TEXT_EXTRACT")
    TEXT_EXTRACT("TEXT_EXTRACT"),

    @SerializedName("SHARE_ADD")
    SHARE_ADD("SHARE_ADD"),

    @SerializedName("SHARE_REMOVE")
    SHARE_REMOVE("SHARE_REMOVE"),

    @SerializedName("VERSION_CREATE")
    VERSION_CREATE("VERSION_CREATE");

    private String value;

    ActionContextEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("actionContext")
  private ActionContextEnum actionContext = null;


  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("CREATE")
    CREATE("CREATE"),

    @SerializedName("READ")
    READ("READ"),

    @SerializedName("UPDATE")
    UPDATE("UPDATE"),

    @SerializedName("DELETE")
    DELETE("DELETE"),

    @SerializedName("DOWNLOAD")
    DOWNLOAD("DOWNLOAD"),

    @SerializedName("VIEW")
    VIEW("VIEW"),

    @SerializedName("UPLOAD")
    UPLOAD("UPLOAD"),

    @SerializedName("SAVE")
    SAVE("SAVE"),

    @SerializedName("MOVE")
    MOVE("MOVE"),

    @SerializedName("COPY")
    COPY("COPY"),

    @SerializedName("ADD")
    ADD("ADD"),

    @SerializedName("REMOVE")
    REMOVE("REMOVE"),

    @SerializedName("RECEIVE")
    RECEIVE("RECEIVE"),

    @SerializedName("CONVERT")
    CONVERT("CONVERT"),

    @SerializedName("FAX")
    FAX("FAX"),

    @SerializedName("CREATE_COVERPAGE")
    CREATE_COVERPAGE("CREATE_COVERPAGE"),

    @SerializedName("USER_ADD")
    USER_ADD("USER_ADD"),

    @SerializedName("USER_REMOVE")
    USER_REMOVE("USER_REMOVE"),

    @SerializedName("MEMBER_ADD")
    MEMBER_ADD("MEMBER_ADD"),

    @SerializedName("MEMBER_REMOVE")
    MEMBER_REMOVE("MEMBER_REMOVE"),

    @SerializedName("MEMBER_UPDATE")
    MEMBER_UPDATE("MEMBER_UPDATE"),

    @SerializedName("TAG_ADD")
    TAG_ADD("TAG_ADD"),

    @SerializedName("TAG_REMOVE")
    TAG_REMOVE("TAG_REMOVE"),

    @SerializedName("TAG_UPDATE")
    TAG_UPDATE("TAG_UPDATE"),

    @SerializedName("ATTRIBUTE_ADD")
    ATTRIBUTE_ADD("ATTRIBUTE_ADD"),

    @SerializedName("ATTRIBUTE_REMOVE")
    ATTRIBUTE_REMOVE("ATTRIBUTE_REMOVE"),

    @SerializedName("ATTRIBUTE_UPDATE")
    ATTRIBUTE_UPDATE("ATTRIBUTE_UPDATE"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_ADD")
    ATTRIBUTE_GROUP_INSTANCE_ADD("ATTRIBUTE_GROUP_INSTANCE_ADD"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_REMOVE")
    ATTRIBUTE_GROUP_INSTANCE_REMOVE("ATTRIBUTE_GROUP_INSTANCE_REMOVE"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE_UPDATE")
    ATTRIBUTE_GROUP_INSTANCE_UPDATE("ATTRIBUTE_GROUP_INSTANCE_UPDATE"),

    @SerializedName("INDEX_SAVE")
    INDEX_SAVE("INDEX_SAVE"),

    @SerializedName("INDEX_DELETE")
    INDEX_DELETE("INDEX_DELETE"),

    @SerializedName("INDEX_CREATE")
    INDEX_CREATE("INDEX_CREATE"),

    @SerializedName("FILE_SAVE")
    FILE_SAVE("FILE_SAVE"),

    @SerializedName("FILE_DELETE")
    FILE_DELETE("FILE_DELETE"),

    @SerializedName("FILE_READ")
    FILE_READ("FILE_READ"),

    @SerializedName("THUMBNAIL_CREATE")
    THUMBNAIL_CREATE("THUMBNAIL_CREATE"),

    @SerializedName("TEXT_EXTRACT")
    TEXT_EXTRACT("TEXT_EXTRACT"),

    @SerializedName("SHARE_ADD")
    SHARE_ADD("SHARE_ADD"),

    @SerializedName("SHARE_REMOVE")
    SHARE_REMOVE("SHARE_REMOVE"),

    @SerializedName("VERSION_CREATE")
    VERSION_CREATE("VERSION_CREATE");

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

  @SerializedName("entity")
  private AuditEntityReference entity = null;

  @SerializedName("changes")
  private List<AuditChange> changes = new ArrayList<AuditChange>();

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
  public UriReference getUser() {
    return user;
  }
  public void setUser(UriReference user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
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
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
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
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActionContextEnum getActionContext() {
    return actionContext;
  }
  public void setActionContext(ActionContextEnum actionContext) {
    this.actionContext = actionContext;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AuditEntityReference getEntity() {
    return entity;
  }
  public void setEntity(AuditEntityReference entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AuditChange> getChanges() {
    return changes;
  }
  public void setChanges(List<AuditChange> changes) {
    this.changes = changes;
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
    DocumentAudit documentAudit = (DocumentAudit) o;
    return Objects.equals(id, documentAudit.id) &&
        Objects.equals(name, documentAudit.name) &&
        Objects.equals(user, documentAudit.user) &&
        Objects.equals(workspace, documentAudit.workspace) &&
        Objects.equals(transactionId, documentAudit.transactionId) &&
        Objects.equals(transactionInitiator, documentAudit.transactionInitiator) &&
        Objects.equals(application, documentAudit.application) &&
        Objects.equals(serviceName, documentAudit.serviceName) &&
        Objects.equals(level, documentAudit.level) &&
        Objects.equals(timestamp, documentAudit.timestamp) &&
        Objects.equals(status, documentAudit.status) &&
        Objects.equals(actionContext, documentAudit.actionContext) &&
        Objects.equals(action, documentAudit.action) &&
        Objects.equals(entity, documentAudit.entity) &&
        Objects.equals(changes, documentAudit.changes) &&
        Objects.equals(selfUri, documentAudit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, workspace, transactionId, transactionInitiator, application, serviceName, level, timestamp, status, actionContext, action, entity, changes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAudit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInitiator: ").append(toIndentedString(transactionInitiator)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
