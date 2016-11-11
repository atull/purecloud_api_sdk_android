package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.MediaPolicies;
import com.mypurecloud.sdk.model.PolicyActions;
import com.mypurecloud.sdk.model.PolicyConditions;
import com.mypurecloud.sdk.model.PolicyErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Policy  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("mediaPolicies")
  private MediaPolicies mediaPolicies = null;

  @SerializedName("conditions")
  private PolicyConditions conditions = null;

  @SerializedName("actions")
  private PolicyActions actions = null;

  @SerializedName("policyErrors")
  private PolicyErrors policyErrors = null;

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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Conditions and actions per media type
   **/
  @ApiModelProperty(value = "Conditions and actions per media type")
  public MediaPolicies getMediaPolicies() {
    return mediaPolicies;
  }
  public void setMediaPolicies(MediaPolicies mediaPolicies) {
    this.mediaPolicies = mediaPolicies;
  }

  /**
   * Conditions
   **/
  @ApiModelProperty(value = "Conditions")
  public PolicyConditions getConditions() {
    return conditions;
  }
  public void setConditions(PolicyConditions conditions) {
    this.conditions = conditions;
  }

  /**
   * Actions
   **/
  @ApiModelProperty(value = "Actions")
  public PolicyActions getActions() {
    return actions;
  }
  public void setActions(PolicyActions actions) {
    this.actions = actions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PolicyErrors getPolicyErrors() {
    return policyErrors;
  }
  public void setPolicyErrors(PolicyErrors policyErrors) {
    this.policyErrors = policyErrors;
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
    Policy policy = (Policy) o;
    return Objects.equals(id, policy.id) &&
        Objects.equals(name, policy.name) &&
        Objects.equals(modifiedDate, policy.modifiedDate) &&
        Objects.equals(createdDate, policy.createdDate) &&
        Objects.equals(order, policy.order) &&
        Objects.equals(description, policy.description) &&
        Objects.equals(enabled, policy.enabled) &&
        Objects.equals(mediaPolicies, policy.mediaPolicies) &&
        Objects.equals(conditions, policy.conditions) &&
        Objects.equals(actions, policy.actions) &&
        Objects.equals(policyErrors, policy.policyErrors) &&
        Objects.equals(selfUri, policy.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, createdDate, order, description, enabled, mediaPolicies, conditions, actions, policyErrors, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mediaPolicies: ").append(toIndentedString(mediaPolicies)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    policyErrors: ").append(toIndentedString(policyErrors)).append("\n");
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
