package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Document;

import com.google.gson.annotations.SerializedName;




/**
 * Contains information about the Document associated with a workItem
 **/
@ApiModel(description = "Contains information about the Document associated with a workItem")
public class AssociatedDocument   {
  
  @SerializedName("document")
  private Document document = null;


  /**
   * the document association type
   */
  public enum DocumentAssociationTypeEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("MAIN")
    MAIN("MAIN"),

    @SerializedName("SECONDARY")
    SECONDARY("SECONDARY");

    private String value;

    DocumentAssociationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("documentAssociationType")
  private DocumentAssociationTypeEnum documentAssociationType = null;

  /**
   * the document associated with the workitem
   **/
  @ApiModelProperty(required = true, value = "the document associated with the workitem")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  /**
   * the document association type
   **/
  @ApiModelProperty(value = "the document association type")
  public DocumentAssociationTypeEnum getDocumentAssociationType() {
    return documentAssociationType;
  }
  public void setDocumentAssociationType(DocumentAssociationTypeEnum documentAssociationType) {
    this.documentAssociationType = documentAssociationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedDocument associatedDocument = (AssociatedDocument) o;
    return Objects.equals(document, associatedDocument.document) &&
        Objects.equals(documentAssociationType, associatedDocument.documentAssociationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, documentAssociationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedDocument {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentAssociationType: ").append(toIndentedString(documentAssociationType)).append("\n");
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
