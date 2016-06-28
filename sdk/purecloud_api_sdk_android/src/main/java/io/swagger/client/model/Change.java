package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuditEntity;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Change   {
  
  @SerializedName("entity")
  private AuditEntity entity = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("oldValues")
  private List<String> oldValues = new ArrayList<String>();

  @SerializedName("newValues")
  private List<String> newValues = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(value = "")
  public AuditEntity getEntity() {
    return entity;
  }
  public void setEntity(AuditEntity entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getOldValues() {
    return oldValues;
  }
  public void setOldValues(List<String> oldValues) {
    this.oldValues = oldValues;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getNewValues() {
    return newValues;
  }
  public void setNewValues(List<String> newValues) {
    this.newValues = newValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Change change = (Change) o;
    return Objects.equals(entity, change.entity) &&
        Objects.equals(property, change.property) &&
        Objects.equals(oldValues, change.oldValues) &&
        Objects.equals(newValues, change.newValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, property, oldValues, newValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Change {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    oldValues: ").append(toIndentedString(oldValues)).append("\n");
    sb.append("    newValues: ").append(toIndentedString(newValues)).append("\n");
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
