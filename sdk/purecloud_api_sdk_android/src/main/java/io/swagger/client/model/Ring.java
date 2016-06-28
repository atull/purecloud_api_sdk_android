package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Actions;
import io.swagger.client.model.ExpansionCriterium;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Ring   {
  
  @SerializedName("expansionCriteria")
  private List<ExpansionCriterium> expansionCriteria = new ArrayList<ExpansionCriterium>();

  @SerializedName("actions")
  private Actions actions = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ExpansionCriterium> getExpansionCriteria() {
    return expansionCriteria;
  }
  public void setExpansionCriteria(List<ExpansionCriterium> expansionCriteria) {
    this.expansionCriteria = expansionCriteria;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Actions getActions() {
    return actions;
  }
  public void setActions(Actions actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ring ring = (Ring) o;
    return Objects.equals(expansionCriteria, ring.expansionCriteria) &&
        Objects.equals(actions, ring.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expansionCriteria, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ring {\n");
    
    sb.append("    expansionCriteria: ").append(toIndentedString(expansionCriteria)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
