package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Control;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Form   {
  
  @SerializedName("controls")
  private List<Control> controls = new ArrayList<Control>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Control> getControls() {
    return controls;
  }
  public void setControls(List<Control> controls) {
    this.controls = controls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(controls, form.controls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
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
