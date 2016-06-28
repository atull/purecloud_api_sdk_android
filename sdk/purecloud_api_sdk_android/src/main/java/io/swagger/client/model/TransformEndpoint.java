package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class TransformEndpoint   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("swaggerUrl")
  private String swaggerUrl = null;

  @SerializedName("route")
  private String route = null;

  @SerializedName("entity")
  private String entity = null;

  @SerializedName("apiFunction")
  private String apiFunction = null;

  @SerializedName("ready")
  private Boolean ready = false;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("batchSize")
  private Integer batchSize = null;

  @SerializedName("parallelism")
  private Integer parallelism = null;

  @SerializedName("updateProgressEvery")
  private Integer updateProgressEvery = null;

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
   * The Url to the swagger documentation of the endpoint where parsed entities will be posted
   **/
  @ApiModelProperty(value = "The Url to the swagger documentation of the endpoint where parsed entities will be posted")
  public String getSwaggerUrl() {
    return swaggerUrl;
  }
  public void setSwaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
  }

  /**
   * The swagger route to use
   **/
  @ApiModelProperty(value = "The swagger route to use")
  public String getRoute() {
    return route;
  }
  public void setRoute(String route) {
    this.route = route;
  }

  /**
   * The entity type being posted
   **/
  @ApiModelProperty(value = "The entity type being posted")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * The swagger function being called
   **/
  @ApiModelProperty(value = "The swagger function being called")
  public String getApiFunction() {
    return apiFunction;
  }
  public void setApiFunction(String apiFunction) {
    this.apiFunction = apiFunction;
  }

  /**
   * Whether this TransformEndpoint has been configured to work (security groups, permissions, etc)
   **/
  @ApiModelProperty(required = true, value = "Whether this TransformEndpoint has been configured to work (security groups, permissions, etc)")
  public Boolean getReady() {
    return ready;
  }
  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  /**
   * Whether this TransformEndpoint is currently active and accepting transformation operations
   **/
  @ApiModelProperty(value = "Whether this TransformEndpoint is currently active and accepting transformation operations")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The number of entities to send in an array for batch POSTs, or 0 for unbatched POSTs
   **/
  @ApiModelProperty(value = "The number of entities to send in an array for batch POSTs, or 0 for unbatched POSTs")
  public Integer getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  /**
   * The number of parallel POSTs to allow at once
   **/
  @ApiModelProperty(value = "The number of parallel POSTs to allow at once")
  public Integer getParallelism() {
    return parallelism;
  }
  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  /**
   * The swagger route to use
   **/
  @ApiModelProperty(value = "The swagger route to use")
  public Integer getUpdateProgressEvery() {
    return updateProgressEvery;
  }
  public void setUpdateProgressEvery(Integer updateProgressEvery) {
    this.updateProgressEvery = updateProgressEvery;
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
    TransformEndpoint transformEndpoint = (TransformEndpoint) o;
    return Objects.equals(id, transformEndpoint.id) &&
        Objects.equals(name, transformEndpoint.name) &&
        Objects.equals(swaggerUrl, transformEndpoint.swaggerUrl) &&
        Objects.equals(route, transformEndpoint.route) &&
        Objects.equals(entity, transformEndpoint.entity) &&
        Objects.equals(apiFunction, transformEndpoint.apiFunction) &&
        Objects.equals(ready, transformEndpoint.ready) &&
        Objects.equals(active, transformEndpoint.active) &&
        Objects.equals(batchSize, transformEndpoint.batchSize) &&
        Objects.equals(parallelism, transformEndpoint.parallelism) &&
        Objects.equals(updateProgressEvery, transformEndpoint.updateProgressEvery) &&
        Objects.equals(selfUri, transformEndpoint.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, swaggerUrl, route, entity, apiFunction, ready, active, batchSize, parallelism, updateProgressEvery, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformEndpoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    apiFunction: ").append(toIndentedString(apiFunction)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    updateProgressEvery: ").append(toIndentedString(updateProgressEvery)).append("\n");
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
