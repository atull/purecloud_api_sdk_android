package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserRoutingSkill;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class UserSkillEntityListing   {
  
  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("entities")
  private List<UserRoutingSkill> entities = new ArrayList<UserRoutingSkill>();

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
  public List<UserRoutingSkill> getEntities() {
    return entities;
  }
  public void setEntities(List<UserRoutingSkill> entities) {
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
    UserSkillEntityListing userSkillEntityListing = (UserSkillEntityListing) o;
    return Objects.equals(pageSize, userSkillEntityListing.pageSize) &&
        Objects.equals(pageNumber, userSkillEntityListing.pageNumber) &&
        Objects.equals(total, userSkillEntityListing.total) &&
        Objects.equals(entities, userSkillEntityListing.entities) &&
        Objects.equals(selfUri, userSkillEntityListing.selfUri) &&
        Objects.equals(firstUri, userSkillEntityListing.firstUri) &&
        Objects.equals(previousUri, userSkillEntityListing.previousUri) &&
        Objects.equals(nextUri, userSkillEntityListing.nextUri) &&
        Objects.equals(lastUri, userSkillEntityListing.lastUri) &&
        Objects.equals(pageCount, userSkillEntityListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, total, entities, selfUri, firstUri, previousUri, nextUri, lastUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSkillEntityListing {\n");
    
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
