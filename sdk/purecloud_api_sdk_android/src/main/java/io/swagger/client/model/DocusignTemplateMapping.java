package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DocusignTemplateMapping   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("docusignTemplateId")
  private String docusignTemplateId = null;

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
  public String getDocusignTemplateId() {
    return docusignTemplateId;
  }
  public void setDocusignTemplateId(String docusignTemplateId) {
    this.docusignTemplateId = docusignTemplateId;
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
    DocusignTemplateMapping docusignTemplateMapping = (DocusignTemplateMapping) o;
    return Objects.equals(id, docusignTemplateMapping.id) &&
        Objects.equals(name, docusignTemplateMapping.name) &&
        Objects.equals(docusignTemplateId, docusignTemplateMapping.docusignTemplateId) &&
        Objects.equals(selfUri, docusignTemplateMapping.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, docusignTemplateId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocusignTemplateMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    docusignTemplateId: ").append(toIndentedString(docusignTemplateId)).append("\n");
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
