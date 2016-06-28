package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class FaxSummary   {
  
  @SerializedName("readCount")
  private Integer readCount = null;

  @SerializedName("unreadCount")
  private Integer unreadCount = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReadCount() {
    return readCount;
  }
  public void setReadCount(Integer readCount) {
    this.readCount = readCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUnreadCount() {
    return unreadCount;
  }
  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxSummary faxSummary = (FaxSummary) o;
    return Objects.equals(readCount, faxSummary.readCount) &&
        Objects.equals(unreadCount, faxSummary.unreadCount) &&
        Objects.equals(totalCount, faxSummary.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readCount, unreadCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSummary {\n");
    
    sb.append("    readCount: ").append(toIndentedString(readCount)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
