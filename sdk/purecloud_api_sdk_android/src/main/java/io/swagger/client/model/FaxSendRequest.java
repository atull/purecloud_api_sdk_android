package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CoverSheet;
import io.swagger.client.model.Workspace;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class FaxSendRequest   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("addresses")
  private List<String> addresses = new ArrayList<String>();

  @SerializedName("documentId")
  private String documentId = null;


  /**
   * The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored
   */
  public enum ContentTypeEnum {
    @SerializedName("application/pdf")
    APPLICATION_PDF("application/pdf"),

    @SerializedName("image/tiff")
    IMAGE_TIFF("image/tiff"),

    @SerializedName("application/msword")
    APPLICATION_MSWORD("application/msword"),

    @SerializedName("application/vnd.oasis.opendocument.text")
    APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT("application/vnd.oasis.opendocument.text"),

    @SerializedName("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT("application/vnd.openxmlformats-officedocument.wordprocessingml.document");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("contentType")
  private ContentTypeEnum contentType = null;

  @SerializedName("workspace")
  private Workspace workspace = null;

  @SerializedName("coverSheet")
  private CoverSheet coverSheet = null;

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
   * A list of outbound fax dialing addresses. E.g. +13175555555 or 3175555555
   **/
  @ApiModelProperty(required = true, value = "A list of outbound fax dialing addresses. E.g. +13175555555 or 3175555555")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  /**
   * DocumentId of Content Management artifact. If Content Management document is not used for faxing, documentId should be null
   **/
  @ApiModelProperty(value = "DocumentId of Content Management artifact. If Content Management document is not used for faxing, documentId should be null")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   * The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored
   **/
  @ApiModelProperty(value = "The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   * Workspace in which the document should be stored. If Content Management document is used for faxing, workspace will be ignored
   **/
  @ApiModelProperty(value = "Workspace in which the document should be stored. If Content Management document is used for faxing, workspace will be ignored")
  public Workspace getWorkspace() {
    return workspace;
  }
  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }

  /**
   * Data for coversheet generation.
   **/
  @ApiModelProperty(value = "Data for coversheet generation.")
  public CoverSheet getCoverSheet() {
    return coverSheet;
  }
  public void setCoverSheet(CoverSheet coverSheet) {
    this.coverSheet = coverSheet;
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
    FaxSendRequest faxSendRequest = (FaxSendRequest) o;
    return Objects.equals(id, faxSendRequest.id) &&
        Objects.equals(name, faxSendRequest.name) &&
        Objects.equals(addresses, faxSendRequest.addresses) &&
        Objects.equals(documentId, faxSendRequest.documentId) &&
        Objects.equals(contentType, faxSendRequest.contentType) &&
        Objects.equals(workspace, faxSendRequest.workspace) &&
        Objects.equals(coverSheet, faxSendRequest.coverSheet) &&
        Objects.equals(selfUri, faxSendRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addresses, documentId, contentType, workspace, coverSheet, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSendRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    coverSheet: ").append(toIndentedString(coverSheet)).append("\n");
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
