package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainEntityListingEvaluationForm;
import com.mypurecloud.sdk.model.QuestionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EvaluationForm  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("published")
  private Boolean published = false;

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("questionGroups")
  private List<QuestionGroup> questionGroups = new ArrayList<QuestionGroup>();

  @SerializedName("publishedVersions")
  private DomainEntityListingEvaluationForm publishedVersions = null;

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
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<QuestionGroup> getQuestionGroups() {
    return questionGroups;
  }
  public void setQuestionGroups(List<QuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainEntityListingEvaluationForm getPublishedVersions() {
    return publishedVersions;
  }
  public void setPublishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
    this.publishedVersions = publishedVersions;
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
    EvaluationForm evaluationForm = (EvaluationForm) o;
    return Objects.equals(id, evaluationForm.id) &&
        Objects.equals(name, evaluationForm.name) &&
        Objects.equals(type, evaluationForm.type) &&
        Objects.equals(modifiedDate, evaluationForm.modifiedDate) &&
        Objects.equals(published, evaluationForm.published) &&
        Objects.equals(contextId, evaluationForm.contextId) &&
        Objects.equals(questionGroups, evaluationForm.questionGroups) &&
        Objects.equals(publishedVersions, evaluationForm.publishedVersions) &&
        Objects.equals(selfUri, evaluationForm.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, modifiedDate, published, contextId, questionGroups, publishedVersions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    questionGroups: ").append(toIndentedString(questionGroups)).append("\n");
    sb.append("    publishedVersions: ").append(toIndentedString(publishedVersions)).append("\n");
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
