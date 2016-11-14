package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AuditMessage;
import com.mypurecloud.sdk.model.FacetInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AuditSearchResult  implements Serializable {
  
  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("facetInfo")
  private List<FacetInfo> facetInfo = new ArrayList<FacetInfo>();

  @SerializedName("auditMessages")
  private List<AuditMessage> auditMessages = new ArrayList<AuditMessage>();

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
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FacetInfo> getFacetInfo() {
    return facetInfo;
  }
  public void setFacetInfo(List<FacetInfo> facetInfo) {
    this.facetInfo = facetInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AuditMessage> getAuditMessages() {
    return auditMessages;
  }
  public void setAuditMessages(List<AuditMessage> auditMessages) {
    this.auditMessages = auditMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditSearchResult auditSearchResult = (AuditSearchResult) o;
    return Objects.equals(pageNumber, auditSearchResult.pageNumber) &&
        Objects.equals(pageSize, auditSearchResult.pageSize) &&
        Objects.equals(total, auditSearchResult.total) &&
        Objects.equals(pageCount, auditSearchResult.pageCount) &&
        Objects.equals(facetInfo, auditSearchResult.facetInfo) &&
        Objects.equals(auditMessages, auditSearchResult.auditMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, total, pageCount, facetInfo, auditMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditSearchResult {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    facetInfo: ").append(toIndentedString(facetInfo)).append("\n");
    sb.append("    auditMessages: ").append(toIndentedString(auditMessages)).append("\n");
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
