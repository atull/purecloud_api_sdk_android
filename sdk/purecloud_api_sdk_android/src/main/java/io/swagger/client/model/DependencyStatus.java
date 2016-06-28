package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FailedObject;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class DependencyStatus   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("buildId")
  private String buildId = null;

  @SerializedName("dateStarted")
  private Date dateStarted = null;

  @SerializedName("dateCompleted")
  private Date dateCompleted = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("BUILDINITIALIZING")
    BUILDINITIALIZING("BUILDINITIALIZING"),

    @SerializedName("BUILDINPROGRESS")
    BUILDINPROGRESS("BUILDINPROGRESS"),

    @SerializedName("NOTBUILT")
    NOTBUILT("NOTBUILT"),

    @SerializedName("OPERATIONAL")
    OPERATIONAL("OPERATIONAL"),

    @SerializedName("OPERATIONALNEEDSREBUILD")
    OPERATIONALNEEDSREBUILD("OPERATIONALNEEDSREBUILD");

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

  @SerializedName("failedObjects")
  private List<FailedObject> failedObjects = new ArrayList<FailedObject>();

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
  public String getBuildId() {
    return buildId;
  }
  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateStarted() {
    return dateStarted;
  }
  public void setDateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
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
  public List<FailedObject> getFailedObjects() {
    return failedObjects;
  }
  public void setFailedObjects(List<FailedObject> failedObjects) {
    this.failedObjects = failedObjects;
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
    DependencyStatus dependencyStatus = (DependencyStatus) o;
    return Objects.equals(id, dependencyStatus.id) &&
        Objects.equals(name, dependencyStatus.name) &&
        Objects.equals(user, dependencyStatus.user) &&
        Objects.equals(buildId, dependencyStatus.buildId) &&
        Objects.equals(dateStarted, dependencyStatus.dateStarted) &&
        Objects.equals(dateCompleted, dependencyStatus.dateCompleted) &&
        Objects.equals(status, dependencyStatus.status) &&
        Objects.equals(failedObjects, dependencyStatus.failedObjects) &&
        Objects.equals(selfUri, dependencyStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, buildId, dateStarted, dateCompleted, status, failedObjects, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failedObjects: ").append(toIndentedString(failedObjects)).append("\n");
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
