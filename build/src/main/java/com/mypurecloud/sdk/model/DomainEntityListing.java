package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainEntityListing  implements Serializable {
  
  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("entities")
  private List<DomainEntity> entities = new ArrayList<DomainEntity>();

  @SerializedName("selfUri")
  private String selfUri = null;

  @SerializedName("firstUri")
  private String firstUri = null;

  @SerializedName("previousUri")
  private String previousUri = null;

  @SerializedName("nextUri")
  private String nextUri = null;

  @SerializedName("lastUri")
  private String lastUri = null;

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
  public List<DomainEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<DomainEntity> entities) {
    this.entities = entities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstUri() {
    return firstUri;
  }
  public void setFirstUri(String firstUri) {
    this.firstUri = firstUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastUri() {
    return lastUri;
  }
  public void setLastUri(String lastUri) {
    this.lastUri = lastUri;
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
    DomainEntityListing domainEntityListing = (DomainEntityListing) o;
    return Objects.equals(pageSize, domainEntityListing.pageSize) &&
        Objects.equals(pageNumber, domainEntityListing.pageNumber) &&
        Objects.equals(total, domainEntityListing.total) &&
        Objects.equals(entities, domainEntityListing.entities) &&
        Objects.equals(selfUri, domainEntityListing.selfUri) &&
        Objects.equals(firstUri, domainEntityListing.firstUri) &&
        Objects.equals(previousUri, domainEntityListing.previousUri) &&
        Objects.equals(nextUri, domainEntityListing.nextUri) &&
        Objects.equals(lastUri, domainEntityListing.lastUri) &&
        Objects.equals(pageCount, domainEntityListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, total, entities, selfUri, firstUri, previousUri, nextUri, lastUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEntityListing {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
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
