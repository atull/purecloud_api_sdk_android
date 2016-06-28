package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ExpansionCriterium   {
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("TIMEOUT_SECONDS")
    SECONDS("TIMEOUT_SECONDS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("threshold")
  private Double threshold = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getThreshold() {
    return threshold;
  }
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpansionCriterium expansionCriterium = (ExpansionCriterium) o;
    return Objects.equals(type, expansionCriterium.type) &&
        Objects.equals(threshold, expansionCriterium.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpansionCriterium {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
