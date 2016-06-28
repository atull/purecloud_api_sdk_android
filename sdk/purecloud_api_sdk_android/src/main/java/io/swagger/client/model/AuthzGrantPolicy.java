package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AuthzGrantPolicy   {
  
  @SerializedName("actions")
  private List<String> actions = new ArrayList<String>();

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("entityName")
  private String entityName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getActions() {
    return actions;
  }
  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCondition() {
    return condition;
  }
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzGrantPolicy authzGrantPolicy = (AuthzGrantPolicy) o;
    return Objects.equals(actions, authzGrantPolicy.actions) &&
        Objects.equals(condition, authzGrantPolicy.condition) &&
        Objects.equals(domain, authzGrantPolicy.domain) &&
        Objects.equals(entityName, authzGrantPolicy.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, domain, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzGrantPolicy {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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
