package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class SortField   {
  
  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets sortType
   */
  public enum SortTypeEnum {
    @SerializedName("ASCENDING")
    ASCENDING("ASCENDING"),

    @SerializedName("DESCENDING")
    DESCENDING("DESCENDING");

    private String value;

    SortTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sortType")
  private SortTypeEnum sortType = null;

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
  public SortTypeEnum getSortType() {
    return sortType;
  }
  public void setSortType(SortTypeEnum sortType) {
    this.sortType = sortType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortField sortField = (SortField) o;
    return Objects.equals(name, sortField.name) &&
        Objects.equals(sortType, sortField.sortType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sortType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
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
