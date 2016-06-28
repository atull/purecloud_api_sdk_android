package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Form;
import io.swagger.client.model.WorkItemCommandGroup;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class WorkItemDefinition   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("commandCategories")
  private List<WorkItemCommandGroup> commandCategories = new ArrayList<WorkItemCommandGroup>();

  @SerializedName("form")
  private Form form = null;

  /**
   * The configuration ID for this workItem
   **/
  @ApiModelProperty(required = true, value = "The configuration ID for this workItem")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * The commands that can be performed on this work item
   **/
  @ApiModelProperty(value = "The commands that can be performed on this work item")
  public List<WorkItemCommandGroup> getCommandCategories() {
    return commandCategories;
  }
  public void setCommandCategories(List<WorkItemCommandGroup> commandCategories) {
    this.commandCategories = commandCategories;
  }

  /**
   * The simple work item form containging the control to present for this work item
   **/
  @ApiModelProperty(value = "The simple work item form containging the control to present for this work item")
  public Form getForm() {
    return form;
  }
  public void setForm(Form form) {
    this.form = form;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemDefinition workItemDefinition = (WorkItemDefinition) o;
    return Objects.equals(id, workItemDefinition.id) &&
        Objects.equals(name, workItemDefinition.name) &&
        Objects.equals(commandCategories, workItemDefinition.commandCategories) &&
        Objects.equals(form, workItemDefinition.form);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, commandCategories, form);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commandCategories: ").append(toIndentedString(commandCategories)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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
