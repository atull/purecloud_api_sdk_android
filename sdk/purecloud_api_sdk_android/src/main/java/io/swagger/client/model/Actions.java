package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SkillsToRemove;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Actions   {
  
  @SerializedName("skillsToRemove")
  private List<SkillsToRemove> skillsToRemove = new ArrayList<SkillsToRemove>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SkillsToRemove> getSkillsToRemove() {
    return skillsToRemove;
  }
  public void setSkillsToRemove(List<SkillsToRemove> skillsToRemove) {
    this.skillsToRemove = skillsToRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actions actions = (Actions) o;
    return Objects.equals(skillsToRemove, actions.skillsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillsToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actions {\n");
    
    sb.append("    skillsToRemove: ").append(toIndentedString(skillsToRemove)).append("\n");
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
