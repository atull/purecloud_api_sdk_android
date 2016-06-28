package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class FaxSendResponse   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uploadDestinationUri")
  private String uploadDestinationUri = null;


  /**
   * Gets or Sets uploadMethodType
   */
  public enum UploadMethodTypeEnum {
    @SerializedName("SINGLE_PUT")
    SINGLE_PUT("SINGLE_PUT"),

    @SerializedName("MULTIPART_POST")
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("uploadMethodType")
  private UploadMethodTypeEnum uploadMethodType = null;

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
  public String getUploadDestinationUri() {
    return uploadDestinationUri;
  }
  public void setUploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UploadMethodTypeEnum getUploadMethodType() {
    return uploadMethodType;
  }
  public void setUploadMethodType(UploadMethodTypeEnum uploadMethodType) {
    this.uploadMethodType = uploadMethodType;
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
    FaxSendResponse faxSendResponse = (FaxSendResponse) o;
    return Objects.equals(id, faxSendResponse.id) &&
        Objects.equals(name, faxSendResponse.name) &&
        Objects.equals(uploadDestinationUri, faxSendResponse.uploadDestinationUri) &&
        Objects.equals(uploadMethodType, faxSendResponse.uploadMethodType) &&
        Objects.equals(selfUri, faxSendResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uploadDestinationUri, uploadMethodType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSendResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethodType: ").append(toIndentedString(uploadMethodType)).append("\n");
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
