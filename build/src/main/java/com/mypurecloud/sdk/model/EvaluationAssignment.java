package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.EvaluationForm;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EvaluationAssignment  implements Serializable {
  
  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("user")
  private User user = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationAssignment evaluationAssignment = (EvaluationAssignment) o;
    return Objects.equals(evaluationForm, evaluationAssignment.evaluationForm) &&
        Objects.equals(user, evaluationAssignment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationForm, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationAssignment {\n");
    
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
