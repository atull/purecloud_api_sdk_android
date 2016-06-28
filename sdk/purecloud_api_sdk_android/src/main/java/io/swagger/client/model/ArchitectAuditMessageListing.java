package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ArchitectAuditMessage;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ArchitectAuditMessageListing   {
  
  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("entities")
  private List<ArchitectAuditMessage> entities = new ArrayList<ArchitectAuditMessage>();

  @SerializedName("pageCount")
  private Integer pageCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ArchitectAuditMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<ArchitectAuditMessage> entities) {
    this.entities = entities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectAuditMessageListing architectAuditMessageListing = (ArchitectAuditMessageListing) o;
    return Objects.equals(pageSize, architectAuditMessageListing.pageSize) &&
        Objects.equals(pageNumber, architectAuditMessageListing.pageNumber) &&
        Objects.equals(total, architectAuditMessageListing.total) &&
        Objects.equals(entities, architectAuditMessageListing.entities) &&
        Objects.equals(pageCount, architectAuditMessageListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, total, entities, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectAuditMessageListing {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
