package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AvailableTopic  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("schema")
  private Map<String, Object> schema = new HashMap<String, Object>();

  @SerializedName("requiresPermissions")
  private List<String> requiresPermissions = new ArrayList<String>();

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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequiresPermissions() {
    return requiresPermissions;
  }
  public void setRequiresPermissions(List<String> requiresPermissions) {
    this.requiresPermissions = requiresPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTopic availableTopic = (AvailableTopic) o;
    return Objects.equals(id, availableTopic.id) &&
        Objects.equals(description, availableTopic.description) &&
        Objects.equals(schema, availableTopic.schema) &&
        Objects.equals(requiresPermissions, availableTopic.requiresPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schema, requiresPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTopic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    requiresPermissions: ").append(toIndentedString(requiresPermissions)).append("\n");
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
