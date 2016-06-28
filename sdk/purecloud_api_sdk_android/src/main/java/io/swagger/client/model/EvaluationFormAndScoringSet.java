package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EvaluationForm;
import io.swagger.client.model.EvaluationScoringSet;

import com.google.gson.annotations.SerializedName;





public class EvaluationFormAndScoringSet   {
  
  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("answers")
  private EvaluationScoringSet answers = null;

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
  public EvaluationScoringSet getAnswers() {
    return answers;
  }
  public void setAnswers(EvaluationScoringSet answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationFormAndScoringSet evaluationFormAndScoringSet = (EvaluationFormAndScoringSet) o;
    return Objects.equals(evaluationForm, evaluationFormAndScoringSet.evaluationForm) &&
        Objects.equals(answers, evaluationFormAndScoringSet.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationForm, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationFormAndScoringSet {\n");
    
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
