package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Rate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AvailableAdditionalService   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("partNumber")
  private String partNumber = null;

  @SerializedName("requiredForProducts")
  private List<String> requiredForProducts = new ArrayList<String>();

  @SerializedName("availableForProducts")
  private List<String> availableForProducts = new ArrayList<String>();

  @SerializedName("defaultForProducts")
  private List<String> defaultForProducts = new ArrayList<String>();

  @SerializedName("exclusiveFromProducts")
  private List<String> exclusiveFromProducts = new ArrayList<String>();

  @SerializedName("rate")
  private Rate rate = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
   * The description of this additional service.
   **/
  @ApiModelProperty(required = true, value = "The description of this additional service.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The part number of this additional service.
   **/
  @ApiModelProperty(required = true, value = "The part number of this additional service.")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * The list of products which require this additional service.
   **/
  @ApiModelProperty(required = true, value = "The list of products which require this additional service.")
  public List<String> getRequiredForProducts() {
    return requiredForProducts;
  }
  public void setRequiredForProducts(List<String> requiredForProducts) {
    this.requiredForProducts = requiredForProducts;
  }

  /**
   * The list of products for which this additional service is available.
   **/
  @ApiModelProperty(required = true, value = "The list of products for which this additional service is available.")
  public List<String> getAvailableForProducts() {
    return availableForProducts;
  }
  public void setAvailableForProducts(List<String> availableForProducts) {
    this.availableForProducts = availableForProducts;
  }

  /**
   * The list of products which have this additional service by default.
   **/
  @ApiModelProperty(required = true, value = "The list of products which have this additional service by default.")
  public List<String> getDefaultForProducts() {
    return defaultForProducts;
  }
  public void setDefaultForProducts(List<String> defaultForProducts) {
    this.defaultForProducts = defaultForProducts;
  }

  /**
   * The list of additional services which are not compatible with this additional service.
   **/
  @ApiModelProperty(required = true, value = "The list of additional services which are not compatible with this additional service.")
  public List<String> getExclusiveFromProducts() {
    return exclusiveFromProducts;
  }
  public void setExclusiveFromProducts(List<String> exclusiveFromProducts) {
    this.exclusiveFromProducts = exclusiveFromProducts;
  }

  /**
   * The rate of this additional service.
   **/
  @ApiModelProperty(required = true, value = "The rate of this additional service.")
  public Rate getRate() {
    return rate;
  }
  public void setRate(Rate rate) {
    this.rate = rate;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableAdditionalService availableAdditionalService = (AvailableAdditionalService) o;
    return Objects.equals(id, availableAdditionalService.id) &&
        Objects.equals(name, availableAdditionalService.name) &&
        Objects.equals(description, availableAdditionalService.description) &&
        Objects.equals(partNumber, availableAdditionalService.partNumber) &&
        Objects.equals(requiredForProducts, availableAdditionalService.requiredForProducts) &&
        Objects.equals(availableForProducts, availableAdditionalService.availableForProducts) &&
        Objects.equals(defaultForProducts, availableAdditionalService.defaultForProducts) &&
        Objects.equals(exclusiveFromProducts, availableAdditionalService.exclusiveFromProducts) &&
        Objects.equals(rate, availableAdditionalService.rate) &&
        Objects.equals(selfUri, availableAdditionalService.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, partNumber, requiredForProducts, availableForProducts, defaultForProducts, exclusiveFromProducts, rate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableAdditionalService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    requiredForProducts: ").append(toIndentedString(requiredForProducts)).append("\n");
    sb.append("    availableForProducts: ").append(toIndentedString(availableForProducts)).append("\n");
    sb.append("    defaultForProducts: ").append(toIndentedString(defaultForProducts)).append("\n");
    sb.append("    exclusiveFromProducts: ").append(toIndentedString(exclusiveFromProducts)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
