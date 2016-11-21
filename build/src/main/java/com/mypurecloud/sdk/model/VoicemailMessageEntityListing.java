package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.VoicemailMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class VoicemailMessageEntityListing  implements Serializable {
  
  @SerializedName("total")
  private Long total = null;

  @SerializedName("entities")
  private List<VoicemailMessage> entities = new ArrayList<VoicemailMessage>();

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VoicemailMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<VoicemailMessage> entities) {
    this.entities = entities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMessageEntityListing voicemailMessageEntityListing = (VoicemailMessageEntityListing) o;
    return Objects.equals(total, voicemailMessageEntityListing.total) &&
        Objects.equals(entities, voicemailMessageEntityListing.entities) &&
        Objects.equals(selfUri, voicemailMessageEntityListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMessageEntityListing {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
