package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class FacetTerm   {
  
  @SerializedName("term")
  private String term = null;

  @SerializedName("key")
  private Long key = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("time")
  private Date time = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getKey() {
    return key;
  }
  public void setKey(Long key) {
    this.key = key;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

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
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetTerm facetTerm = (FacetTerm) o;
    return Objects.equals(term, facetTerm.term) &&
        Objects.equals(key, facetTerm.key) &&
        Objects.equals(id, facetTerm.id) &&
        Objects.equals(name, facetTerm.name) &&
        Objects.equals(count, facetTerm.count) &&
        Objects.equals(time, facetTerm.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, key, id, name, count, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetTerm {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
