package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Used as the body to the transferWorkItem request.
 **/
@ApiModel(description = "Used as the body to the transferWorkItem request.")
public class WorkItemTransferRequest   {
  

  /**
   * The type of the transferTarget, indicating whether you want to transfer to a User, or a Queue, etc.
   */
  public enum TransferTargetTypeEnum {
    @SerializedName("USER")
    USER("USER"),

    @SerializedName("QUEUE")
    QUEUE("QUEUE");

    private String value;

    TransferTargetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transferTargetType")
  private TransferTargetTypeEnum transferTargetType = null;

  @SerializedName("transferTarget")
  private String transferTarget = null;

  /**
   * The type of the transferTarget, indicating whether you want to transfer to a User, or a Queue, etc.
   **/
  @ApiModelProperty(required = true, value = "The type of the transferTarget, indicating whether you want to transfer to a User, or a Queue, etc.")
  public TransferTargetTypeEnum getTransferTargetType() {
    return transferTargetType;
  }
  public void setTransferTargetType(TransferTargetTypeEnum transferTargetType) {
    this.transferTargetType = transferTargetType;
  }

  /**
   * The destination to where the work item should be transferred.
   **/
  @ApiModelProperty(required = true, value = "The destination to where the work item should be transferred.")
  public String getTransferTarget() {
    return transferTarget;
  }
  public void setTransferTarget(String transferTarget) {
    this.transferTarget = transferTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemTransferRequest workItemTransferRequest = (WorkItemTransferRequest) o;
    return Objects.equals(transferTargetType, workItemTransferRequest.transferTargetType) &&
        Objects.equals(transferTarget, workItemTransferRequest.transferTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferTargetType, transferTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemTransferRequest {\n");
    
    sb.append("    transferTargetType: ").append(toIndentedString(transferTargetType)).append("\n");
    sb.append("    transferTarget: ").append(toIndentedString(transferTarget)).append("\n");
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
