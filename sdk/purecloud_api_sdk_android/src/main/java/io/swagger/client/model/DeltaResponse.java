package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DeltaDocument;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class DeltaResponse   {
  
  @SerializedName("contextToken")
  private String contextToken = null;

  @SerializedName("documents")
  private List<DeltaDocument> documents = new ArrayList<DeltaDocument>();

  @SerializedName("hasMore")
  private Boolean hasMore = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextToken() {
    return contextToken;
  }
  public void setContextToken(String contextToken) {
    this.contextToken = contextToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DeltaDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<DeltaDocument> documents) {
    this.documents = documents;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaResponse deltaResponse = (DeltaResponse) o;
    return Objects.equals(contextToken, deltaResponse.contextToken) &&
        Objects.equals(documents, deltaResponse.documents) &&
        Objects.equals(hasMore, deltaResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextToken, documents, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaResponse {\n");
    
    sb.append("    contextToken: ").append(toIndentedString(contextToken)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
