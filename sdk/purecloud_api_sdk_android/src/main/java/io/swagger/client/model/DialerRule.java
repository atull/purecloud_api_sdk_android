package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Condition;
import io.swagger.client.model.DialerAction;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class DialerRule   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;


  /**
   * The category of the rule
   */
  public enum CategoryEnum {
    @SerializedName("DIALER_PRECALL")
    PRECALL("DIALER_PRECALL"),

    @SerializedName("DIALER_WRAPUP")
    WRAPUP("DIALER_WRAPUP");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("conditions")
  private List<Condition> conditions = new ArrayList<Condition>();

  @SerializedName("actions")
  private List<DialerAction> actions = new ArrayList<DialerAction>();

  /**
   * The identifier of the rule
   **/
  @ApiModelProperty(value = "The identifier of the rule")
  public String getId() {
    return id;
  }

  /**
   * The name of the rule
   **/
  @ApiModelProperty(required = true, value = "The name of the rule")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ranked order of the rule; rules are processed from lowest number to highest
   **/
  @ApiModelProperty(value = "The ranked order of the rule; rules are processed from lowest number to highest")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The category of the rule
   **/
  @ApiModelProperty(required = true, value = "The category of the rule")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * The list of rule conditions; all must evaluate to true to trigger the rule actions
   **/
  @ApiModelProperty(required = true, value = "The list of rule conditions; all must evaluate to true to trigger the rule actions")
  public List<Condition> getConditions() {
    return conditions;
  }
  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }

  /**
   * The list of rule actions to be taken if the conditions are true
   **/
  @ApiModelProperty(value = "The list of rule actions to be taken if the conditions are true")
  public List<DialerAction> getActions() {
    return actions;
  }
  public void setActions(List<DialerAction> actions) {
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
    DialerRule dialerRule = (DialerRule) o;
    return Objects.equals(id, dialerRule.id) &&
        Objects.equals(name, dialerRule.name) &&
        Objects.equals(order, dialerRule.order) &&
        Objects.equals(category, dialerRule.category) &&
        Objects.equals(conditions, dialerRule.conditions) &&
        Objects.equals(actions, dialerRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, category, conditions, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
