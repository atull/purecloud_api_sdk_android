package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Attribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DocumentAttribute  implements Serializable {
  
  @SerializedName("attribute")
  private Attribute attribute = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(value = "")
  public Attribute getAttribute() {
    return attribute;
  }
  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAttribute documentAttribute = (DocumentAttribute) o;
    return Objects.equals(attribute, documentAttribute.attribute) &&
        Objects.equals(values, documentAttribute.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAttribute {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
