package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WorkItemCommand;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class WorkItemCommandGroup   {
  
  @SerializedName("category")
  private String category = null;

  @SerializedName("defaultCommandId")
  private String defaultCommandId = null;

  @SerializedName("commands")
  private List<WorkItemCommand> commands = new ArrayList<WorkItemCommand>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDefaultCommandId() {
    return defaultCommandId;
  }
  public void setDefaultCommandId(String defaultCommandId) {
    this.defaultCommandId = defaultCommandId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<WorkItemCommand> getCommands() {
    return commands;
  }
  public void setCommands(List<WorkItemCommand> commands) {
    this.commands = commands;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemCommandGroup workItemCommandGroup = (WorkItemCommandGroup) o;
    return Objects.equals(category, workItemCommandGroup.category) &&
        Objects.equals(defaultCommandId, workItemCommandGroup.defaultCommandId) &&
        Objects.equals(commands, workItemCommandGroup.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, defaultCommandId, commands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemCommandGroup {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    defaultCommandId: ").append(toIndentedString(defaultCommandId)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
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
