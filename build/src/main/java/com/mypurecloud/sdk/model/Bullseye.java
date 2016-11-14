package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Ring;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Bullseye  implements Serializable {
  
  @SerializedName("rings")
  private List<Ring> rings = new ArrayList<Ring>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Ring> getRings() {
    return rings;
  }
  public void setRings(List<Ring> rings) {
    this.rings = rings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bullseye bullseye = (Bullseye) o;
    return Objects.equals(rings, bullseye.rings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bullseye {\n");
    
    sb.append("    rings: ").append(toIndentedString(rings)).append("\n");
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
