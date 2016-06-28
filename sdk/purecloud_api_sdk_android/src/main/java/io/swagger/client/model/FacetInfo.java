package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Entry;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class FacetInfo   {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("entries")
  private List<Entry> entries = new ArrayList<Entry>();

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
   **/
  @ApiModelProperty(value = "")
  public List<Entry> getEntries() {
    return entries;
  }
  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetInfo facetInfo = (FacetInfo) o;
    return Objects.equals(name, facetInfo.name) &&
        Objects.equals(entries, facetInfo.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
