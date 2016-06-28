package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ExternalOrganization;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class Relationship   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("externalOrganization")
  private ExternalOrganization externalOrganization = null;

  @SerializedName("relationship")
  private String relationship = null;

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
   * The user associated with the external organization
   **/
  @ApiModelProperty(required = true, value = "The user associated with the external organization")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * The external organization this relationship is attached to
   **/
  @ApiModelProperty(required = true, value = "The external organization this relationship is attached to")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  /**
   * The relationship or role of the user to this external organization.Examples: Account Manager, Sales Engineer, Implementation Consultant
   **/
  @ApiModelProperty(required = true, value = "The relationship or role of the user to this external organization.Examples: Account Manager, Sales Engineer, Implementation Consultant")
  public String getRelationship() {
    return relationship;
  }
  public void setRelationship(String relationship) {
    this.relationship = relationship;
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
    Relationship relationship = (Relationship) o;
    return Objects.equals(id, relationship.id) &&
        Objects.equals(name, relationship.name) &&
        Objects.equals(user, relationship.user) &&
        Objects.equals(externalOrganization, relationship.externalOrganization) &&
        Objects.equals(relationship, relationship.relationship) &&
        Objects.equals(selfUri, relationship.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, externalOrganization, relationship, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
