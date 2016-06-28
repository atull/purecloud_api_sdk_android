package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AssociatedDocument;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.FlowConfigId;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Details about the current state of a Flow Instance
 **/
@ApiModel(description = "Details about the current state of a Flow Instance")
public class FlowDetails   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("flowConfigId")
  private FlowConfigId flowConfigId = null;

  @SerializedName("launchTime")
  private Date launchTime = null;


  /**
   * The launch mode for this flow instance.
   */
  public enum LaunchTypeEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("NORMAL")
    NORMAL("NORMAL"),

    @SerializedName("TEST")
    TEST("TEST"),

    @SerializedName("AUTOMATIC")
    AUTOMATIC("AUTOMATIC");

    private String value;

    LaunchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("launchType")
  private LaunchTypeEnum launchType = null;

  @SerializedName("launchedBy")
  private User launchedBy = null;


  /**
   * The flow's running status, which indicates whether the flow is running normally or completed, etc.
   */
  public enum StatusEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("RUNNING")
    RUNNING("RUNNING"),

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("TERMINATED")
    TERMINATED("TERMINATED"),

    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED");

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

  @SerializedName("associatedDocuments")
  private List<AssociatedDocument> associatedDocuments = new ArrayList<AssociatedDocument>();

  @SerializedName("flowCompletionTime")
  private Date flowCompletionTime = null;

  @SerializedName("flowCompletionReason")
  private String flowCompletionReason = null;

  @SerializedName("flowErrorInfo")
  private ErrorBody flowErrorInfo = null;

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
   * The FlowConfigId that was used to launch this flow.
   **/
  @ApiModelProperty(required = true, value = "The FlowConfigId that was used to launch this flow.")
  public FlowConfigId getFlowConfigId() {
    return flowConfigId;
  }
  public void setFlowConfigId(FlowConfigId flowConfigId) {
    this.flowConfigId = flowConfigId;
  }

  /**
   * The time the flow was launched. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time the flow was launched. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLaunchTime() {
    return launchTime;
  }
  public void setLaunchTime(Date launchTime) {
    this.launchTime = launchTime;
  }

  /**
   * The launch mode for this flow instance.
   **/
  @ApiModelProperty(required = true, value = "The launch mode for this flow instance.")
  public LaunchTypeEnum getLaunchType() {
    return launchType;
  }
  public void setLaunchType(LaunchTypeEnum launchType) {
    this.launchType = launchType;
  }

  /**
   * The user who launched the flow, if the flow was launched as the result of that user's action.
   **/
  @ApiModelProperty(value = "The user who launched the flow, if the flow was launched as the result of that user's action.")
  public User getLaunchedBy() {
    return launchedBy;
  }
  public void setLaunchedBy(User launchedBy) {
    this.launchedBy = launchedBy;
  }

  /**
   * The flow's running status, which indicates whether the flow is running normally or completed, etc.
   **/
  @ApiModelProperty(value = "The flow's running status, which indicates whether the flow is running normally or completed, etc.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The documents associated with this flow.
   **/
  @ApiModelProperty(value = "The documents associated with this flow.")
  public List<AssociatedDocument> getAssociatedDocuments() {
    return associatedDocuments;
  }
  public void setAssociatedDocuments(List<AssociatedDocument> associatedDocuments) {
    this.associatedDocuments = associatedDocuments;
  }

  /**
   * The time the flow completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time the flow completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getFlowCompletionTime() {
    return flowCompletionTime;
  }
  public void setFlowCompletionTime(Date flowCompletionTime) {
    this.flowCompletionTime = flowCompletionTime;
  }

  /**
   * The completion reason set at the flow completion time, if applicable.
   **/
  @ApiModelProperty(value = "The completion reason set at the flow completion time, if applicable.")
  public String getFlowCompletionReason() {
    return flowCompletionReason;
  }
  public void setFlowCompletionReason(String flowCompletionReason) {
    this.flowCompletionReason = flowCompletionReason;
  }

  /**
   * Additional information if the flow is in error
   **/
  @ApiModelProperty(value = "Additional information if the flow is in error")
  public ErrorBody getFlowErrorInfo() {
    return flowErrorInfo;
  }
  public void setFlowErrorInfo(ErrorBody flowErrorInfo) {
    this.flowErrorInfo = flowErrorInfo;
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
    FlowDetails flowDetails = (FlowDetails) o;
    return Objects.equals(id, flowDetails.id) &&
        Objects.equals(name, flowDetails.name) &&
        Objects.equals(flowConfigId, flowDetails.flowConfigId) &&
        Objects.equals(launchTime, flowDetails.launchTime) &&
        Objects.equals(launchType, flowDetails.launchType) &&
        Objects.equals(launchedBy, flowDetails.launchedBy) &&
        Objects.equals(status, flowDetails.status) &&
        Objects.equals(associatedDocuments, flowDetails.associatedDocuments) &&
        Objects.equals(flowCompletionTime, flowDetails.flowCompletionTime) &&
        Objects.equals(flowCompletionReason, flowDetails.flowCompletionReason) &&
        Objects.equals(flowErrorInfo, flowDetails.flowErrorInfo) &&
        Objects.equals(selfUri, flowDetails.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flowConfigId, launchTime, launchType, launchedBy, status, associatedDocuments, flowCompletionTime, flowCompletionReason, flowErrorInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowConfigId: ").append(toIndentedString(flowConfigId)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    launchedBy: ").append(toIndentedString(launchedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    associatedDocuments: ").append(toIndentedString(associatedDocuments)).append("\n");
    sb.append("    flowCompletionTime: ").append(toIndentedString(flowCompletionTime)).append("\n");
    sb.append("    flowCompletionReason: ").append(toIndentedString(flowCompletionReason)).append("\n");
    sb.append("    flowErrorInfo: ").append(toIndentedString(flowErrorInfo)).append("\n");
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
