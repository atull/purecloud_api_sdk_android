package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class ReplaceResponse   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("changeNumber")
  private Integer changeNumber = null;

  @SerializedName("uploadStatus")
  private UriReference uploadStatus = null;

  @SerializedName("uploadDestinationUri")
  private String uploadDestinationUri = null;


  /**
   * Gets or Sets uploadMethod
   */
  public enum UploadMethodEnum {
    @SerializedName("SINGLE_PUT")
    SINGLE_PUT("SINGLE_PUT"),

    @SerializedName("MULTIPART_POST")
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("uploadMethod")
  private UploadMethodEnum uploadMethod = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UriReference uploadStatus) {
    this.uploadStatus = uploadStatus;
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
  public UploadMethodEnum getUploadMethod() {
    return uploadMethod;
  }
  public void setUploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceResponse replaceResponse = (ReplaceResponse) o;
    return Objects.equals(id, replaceResponse.id) &&
        Objects.equals(name, replaceResponse.name) &&
        Objects.equals(changeNumber, replaceResponse.changeNumber) &&
        Objects.equals(uploadStatus, replaceResponse.uploadStatus) &&
        Objects.equals(uploadDestinationUri, replaceResponse.uploadDestinationUri) &&
        Objects.equals(uploadMethod, replaceResponse.uploadMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changeNumber, uploadStatus, uploadDestinationUri, uploadMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethod: ").append(toIndentedString(uploadMethod)).append("\n");
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
