package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Greeting;
import io.swagger.client.model.GreetingOwner;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class DefaultGreetingList   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private GreetingOwner owner = null;


  /**
   * Gets or Sets ownerType
   */
  public enum OwnerTypeEnum {
    @SerializedName("USER")
    USER("USER"),

    @SerializedName("ORGANIZATION")
    ORGANIZATION("ORGANIZATION"),

    @SerializedName("GROUP")
    GROUP("GROUP");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ownerType")
  private OwnerTypeEnum ownerType = null;

  @SerializedName("greetings")
  private Map<String, Greeting> greetings = new HashMap<String, Greeting>();

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

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
   **/
  @ApiModelProperty(value = "")
  public GreetingOwner getOwner() {
    return owner;
  }
  public void setOwner(GreetingOwner owner) {
    this.owner = owner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Greeting> getGreetings() {
    return greetings;
  }
  public void setGreetings(Map<String, Greeting> greetings) {
    this.greetings = greetings;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
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
    DefaultGreetingList defaultGreetingList = (DefaultGreetingList) o;
    return Objects.equals(id, defaultGreetingList.id) &&
        Objects.equals(name, defaultGreetingList.name) &&
        Objects.equals(owner, defaultGreetingList.owner) &&
        Objects.equals(ownerType, defaultGreetingList.ownerType) &&
        Objects.equals(greetings, defaultGreetingList.greetings) &&
        Objects.equals(createdDate, defaultGreetingList.createdDate) &&
        Objects.equals(createdBy, defaultGreetingList.createdBy) &&
        Objects.equals(modifiedDate, defaultGreetingList.modifiedDate) &&
        Objects.equals(modifiedBy, defaultGreetingList.modifiedBy) &&
        Objects.equals(selfUri, defaultGreetingList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, ownerType, greetings, createdDate, createdBy, modifiedDate, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultGreetingList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    greetings: ").append(toIndentedString(greetings)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
