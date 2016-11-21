package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ChatMediaPolicyConditions;
import com.mypurecloud.sdk.model.PolicyActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ChatMediaPolicy  implements Serializable {
  
  @SerializedName("actions")
  private PolicyActions actions = null;

  @SerializedName("conditions")
  private ChatMediaPolicyConditions conditions = null;

  /**
   * Actions applied when specified conditions are met
   **/
  @ApiModelProperty(value = "Actions applied when specified conditions are met")
  public PolicyActions getActions() {
    return actions;
  }
  public void setActions(PolicyActions actions) {
    this.actions = actions;
  }

  /**
   * Conditions for when actions should be applied
   **/
  @ApiModelProperty(value = "Conditions for when actions should be applied")
  public ChatMediaPolicyConditions getConditions() {
    return conditions;
  }
  public void setConditions(ChatMediaPolicyConditions conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMediaPolicy chatMediaPolicy = (ChatMediaPolicy) o;
    return Objects.equals(actions, chatMediaPolicy.actions) &&
        Objects.equals(conditions, chatMediaPolicy.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMediaPolicy {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
