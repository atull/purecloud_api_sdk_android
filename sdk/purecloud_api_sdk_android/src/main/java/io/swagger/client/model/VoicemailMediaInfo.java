package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class VoicemailMediaInfo   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("mediaFileUri")
  private String mediaFileUri = null;

  @SerializedName("mediaImageUri")
  private String mediaImageUri = null;

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
  public String getMediaFileUri() {
    return mediaFileUri;
  }
  public void setMediaFileUri(String mediaFileUri) {
    this.mediaFileUri = mediaFileUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMediaImageUri() {
    return mediaImageUri;
  }
  public void setMediaImageUri(String mediaImageUri) {
    this.mediaImageUri = mediaImageUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailMediaInfo voicemailMediaInfo = (VoicemailMediaInfo) o;
    return Objects.equals(id, voicemailMediaInfo.id) &&
        Objects.equals(mediaFileUri, voicemailMediaInfo.mediaFileUri) &&
        Objects.equals(mediaImageUri, voicemailMediaInfo.mediaImageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaFileUri, mediaImageUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMediaInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaFileUri: ").append(toIndentedString(mediaFileUri)).append("\n");
    sb.append("    mediaImageUri: ").append(toIndentedString(mediaImageUri)).append("\n");
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
