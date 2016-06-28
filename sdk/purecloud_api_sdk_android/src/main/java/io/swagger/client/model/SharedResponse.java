package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Document;
import io.swagger.client.model.Share;

import com.google.gson.annotations.SerializedName;





public class SharedResponse   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("downloadUri")
  private String downloadUri = null;

  @SerializedName("viewUri")
  private String viewUri = null;

  @SerializedName("document")
  private Document document = null;

  @SerializedName("share")
  private Share share = null;

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
  public String getDownloadUri() {
    return downloadUri;
  }
  public void setDownloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getViewUri() {
    return viewUri;
  }
  public void setViewUri(String viewUri) {
    this.viewUri = viewUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Share getShare() {
    return share;
  }
  public void setShare(Share share) {
    this.share = share;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedResponse sharedResponse = (SharedResponse) o;
    return Objects.equals(id, sharedResponse.id) &&
        Objects.equals(downloadUri, sharedResponse.downloadUri) &&
        Objects.equals(viewUri, sharedResponse.viewUri) &&
        Objects.equals(document, sharedResponse.document) &&
        Objects.equals(share, sharedResponse.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUri, viewUri, document, share);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    viewUri: ").append(toIndentedString(viewUri)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
