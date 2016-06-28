package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuditEntityReference;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AuditChange   {
  
  @SerializedName("property")
  private String property = null;

  @SerializedName("entity")
  private AuditEntityReference entity = null;

  @SerializedName("oldValues")
  private List<String> oldValues = new ArrayList<String>();

  @SerializedName("newValues")
  private List<String> newValues = new ArrayList<String>();

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
  public AuditEntityReference getEntity() {
    return entity;
  }
  public void setEntity(AuditEntityReference entity) {
    this.entity = entity;
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
    AuditChange auditChange = (AuditChange) o;
    return Objects.equals(property, auditChange.property) &&
        Objects.equals(entity, auditChange.entity) &&
        Objects.equals(oldValues, auditChange.oldValues) &&
        Objects.equals(newValues, auditChange.newValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, entity, oldValues, newValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditChange {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
