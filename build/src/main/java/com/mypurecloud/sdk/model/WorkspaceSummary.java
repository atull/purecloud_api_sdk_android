package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class WorkspaceSummary  implements Serializable {
  
  @SerializedName("totalDocumentCount")
  private Long totalDocumentCount = null;

  @SerializedName("totalDocumentByteCount")
  private Long totalDocumentByteCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalDocumentCount() {
    return totalDocumentCount;
  }
  public void setTotalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalDocumentByteCount() {
    return totalDocumentByteCount;
  }
  public void setTotalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSummary workspaceSummary = (WorkspaceSummary) o;
    return Objects.equals(totalDocumentCount, workspaceSummary.totalDocumentCount) &&
        Objects.equals(totalDocumentByteCount, workspaceSummary.totalDocumentByteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDocumentCount, totalDocumentByteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSummary {\n");
    
    sb.append("    totalDocumentCount: ").append(toIndentedString(totalDocumentCount)).append("\n");
    sb.append("    totalDocumentByteCount: ").append(toIndentedString(totalDocumentByteCount)).append("\n");
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
