package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SocializeEntityFilter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class SocializeFilterRequest   {
  
  @SerializedName("filters")
  private List<SocializeEntityFilter> filters = new ArrayList<SocializeEntityFilter>();

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("sortBy")
  private String sortBy = null;


  /**
   * Gets or Sets sortOrder
   */
  public enum SortOrderEnum {
    @SerializedName("ascending")
    ASCENDING("ascending"),

    @SerializedName("descending")
    DESCENDING("descending");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sortOrder")
  private SortOrderEnum sortOrder = null;

  /**
   * The list of filters used to narrow the return.
   **/
  @ApiModelProperty(required = true, value = "The list of filters used to narrow the return.")
  public List<SocializeEntityFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<SocializeEntityFilter> filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocializeFilterRequest socializeFilterRequest = (SocializeFilterRequest) o;
    return Objects.equals(filters, socializeFilterRequest.filters) &&
        Objects.equals(pageSize, socializeFilterRequest.pageSize) &&
        Objects.equals(pageNumber, socializeFilterRequest.pageNumber) &&
        Objects.equals(sortBy, socializeFilterRequest.sortBy) &&
        Objects.equals(sortOrder, socializeFilterRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, pageSize, pageNumber, sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocializeFilterRequest {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
