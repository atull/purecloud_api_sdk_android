package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ImportStatus  implements Serializable {
  

  /**
   * current status of the import
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),

    @SerializedName("FAILED")
    FAILED("FAILED");

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

  @SerializedName("totalRecords")
  private Long totalRecords = null;

  @SerializedName("completedRecords")
  private Long completedRecords = null;

  @SerializedName("percentComplete")
  private Integer percentComplete = null;

  @SerializedName("failureReason")
  private String failureReason = null;

  /**
   * current status of the import
   **/
  @ApiModelProperty(required = true, value = "current status of the import")
  public StateEnum getState() {
    return state;
  }

  /**
   * total number of records to be imported
   **/
  @ApiModelProperty(required = true, value = "total number of records to be imported")
  public Long getTotalRecords() {
    return totalRecords;
  }

  /**
   * number of records finished importing
   **/
  @ApiModelProperty(required = true, value = "number of records finished importing")
  public Long getCompletedRecords() {
    return completedRecords;
  }

  /**
   * percentage of records finished importing
   **/
  @ApiModelProperty(required = true, value = "percentage of records finished importing")
  public Integer getPercentComplete() {
    return percentComplete;
  }

  /**
   * if the import has failed, the reason for the failure
   **/
  @ApiModelProperty(value = "if the import has failed, the reason for the failure")
  public String getFailureReason() {
    return failureReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportStatus importStatus = (ImportStatus) o;
    return Objects.equals(state, importStatus.state) &&
        Objects.equals(totalRecords, importStatus.totalRecords) &&
        Objects.equals(completedRecords, importStatus.completedRecords) &&
        Objects.equals(percentComplete, importStatus.percentComplete) &&
        Objects.equals(failureReason, importStatus.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, totalRecords, completedRecords, percentComplete, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
