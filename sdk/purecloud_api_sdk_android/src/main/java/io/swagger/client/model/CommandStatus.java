package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Document;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class CommandStatus   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("expiration")
  private Date expiration = null;

  @SerializedName("userId")
  private String userId = null;


  /**
   * Gets or Sets statusCode
   */
  public enum StatusCodeEnum {
    @SerializedName("INPROGRESS")
    INPROGRESS("INPROGRESS"),

    @SerializedName("COMPLETE")
    COMPLETE("COMPLETE"),

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("CANCELING")
    CANCELING("CANCELING"),

    @SerializedName("CANCELED")
    CANCELED("CANCELED");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statusCode")
  private StatusCodeEnum statusCode = null;


  /**
   * Gets or Sets commandType
   */
  public enum CommandTypeEnum {
    @SerializedName("UPLOAD")
    UPLOAD("UPLOAD"),

    @SerializedName("COPYDOCUMENT")
    COPYDOCUMENT("COPYDOCUMENT"),

    @SerializedName("MOVEDOCUMENT")
    MOVEDOCUMENT("MOVEDOCUMENT"),

    @SerializedName("DELETEWORKSPACE")
    DELETEWORKSPACE("DELETEWORKSPACE"),

    @SerializedName("DELETEDOCUMENT")
    DELETEDOCUMENT("DELETEDOCUMENT"),

    @SerializedName("DELETETAG")
    DELETETAG("DELETETAG"),

    @SerializedName("UPDATETAG")
    UPDATETAG("UPDATETAG"),

    @SerializedName("REINDEX")
    REINDEX("REINDEX"),

    @SerializedName("CLEANUP")
    CLEANUP("CLEANUP"),

    @SerializedName("REPLACEDOCUMENT")
    REPLACEDOCUMENT("REPLACEDOCUMENT");

    private String value;

    CommandTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("commandType")
  private CommandTypeEnum commandType = null;

  @SerializedName("document")
  private Document document = null;

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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
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
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommandTypeEnum getCommandType() {
    return commandType;
  }
  public void setCommandType(CommandTypeEnum commandType) {
    this.commandType = commandType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
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
    CommandStatus commandStatus = (CommandStatus) o;
    return Objects.equals(id, commandStatus.id) &&
        Objects.equals(name, commandStatus.name) &&
        Objects.equals(expiration, commandStatus.expiration) &&
        Objects.equals(userId, commandStatus.userId) &&
        Objects.equals(statusCode, commandStatus.statusCode) &&
        Objects.equals(commandType, commandStatus.commandType) &&
        Objects.equals(document, commandStatus.document) &&
        Objects.equals(selfUri, commandStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, expiration, userId, statusCode, commandType, document, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
