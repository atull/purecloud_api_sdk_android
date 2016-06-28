package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class BillingTaskResult   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets taskType
   */
  public enum TaskTypeEnum {
    @SerializedName("GENERATE_PCV_USAGE_REPORT")
    GENERATE_PCV_USAGE_REPORT("GENERATE_PCV_USAGE_REPORT"),

    @SerializedName("GENERATE_BILLABLE_USAGE_REPORT")
    GENERATE_BILLABLE_USAGE_REPORT("GENERATE_BILLABLE_USAGE_REPORT"),

    @SerializedName("GENERATE_CONCURRENT_USAGE_REPORT")
    GENERATE_CONCURRENT_USAGE_REPORT("GENERATE_CONCURRENT_USAGE_REPORT"),

    @SerializedName("CREATE_QUOTE")
    CREATE_QUOTE("CREATE_QUOTE"),

    @SerializedName("CREATE_SALESFORCE_ACCOUNT")
    CREATE_SALESFORCE_ACCOUNT("CREATE_SALESFORCE_ACCOUNT"),

    @SerializedName("SUBMIT_QUOTE")
    SUBMIT_QUOTE("SUBMIT_QUOTE"),

    @SerializedName("GENERATE_CONTRACT")
    GENERATE_CONTRACT("GENERATE_CONTRACT"),

    @SerializedName("OTHER")
    OTHER("OTHER");

    private String value;

    TaskTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("taskType")
  private TaskTypeEnum taskType = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),

    @SerializedName("SUCCEEDED")
    SUCCEEDED("SUCCEEDED"),

    @SerializedName("FAILED")
    FAILED("FAILED");

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

  @SerializedName("resultId")
  private String resultId = null;

  @SerializedName("resultUri")
  private String resultUri = null;

  @SerializedName("resultDownloadUrl")
  private String resultDownloadUrl = null;

  @SerializedName("errorCode")
  private String errorCode = null;

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
  public TaskTypeEnum getTaskType() {
    return taskType;
  }
  public void setTaskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
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
  public String getResultId() {
    return resultId;
  }
  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResultUri() {
    return resultUri;
  }
  public void setResultUri(String resultUri) {
    this.resultUri = resultUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResultDownloadUrl() {
    return resultDownloadUrl;
  }
  public void setResultDownloadUrl(String resultDownloadUrl) {
    this.resultDownloadUrl = resultDownloadUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
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
    BillingTaskResult billingTaskResult = (BillingTaskResult) o;
    return Objects.equals(id, billingTaskResult.id) &&
        Objects.equals(name, billingTaskResult.name) &&
        Objects.equals(taskType, billingTaskResult.taskType) &&
        Objects.equals(status, billingTaskResult.status) &&
        Objects.equals(resultId, billingTaskResult.resultId) &&
        Objects.equals(resultUri, billingTaskResult.resultUri) &&
        Objects.equals(resultDownloadUrl, billingTaskResult.resultDownloadUrl) &&
        Objects.equals(errorCode, billingTaskResult.errorCode) &&
        Objects.equals(selfUri, billingTaskResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, taskType, status, resultId, resultUri, resultDownloadUrl, errorCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingTaskResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    resultUri: ").append(toIndentedString(resultUri)).append("\n");
    sb.append("    resultDownloadUrl: ").append(toIndentedString(resultDownloadUrl)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
