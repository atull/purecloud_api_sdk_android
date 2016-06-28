package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class UploadProgress   {
  
  @SerializedName("CarrierId")
  private String carrierId = null;

  @SerializedName("SchemaName")
  private String schemaName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Filename")
  private String filename = null;

  @SerializedName("Filetype")
  private String filetype = null;

  @SerializedName("Created")
  private Date created = null;

  @SerializedName("Updated")
  private Date updated = null;

  /**
   * Carrier id associated with the ratesheet that was uploaded.
   **/
  @ApiModelProperty(value = "Carrier id associated with the ratesheet that was uploaded.")
  public String getCarrierId() {
    return carrierId;
  }

  /**
   * Human readable name for the schema that was used to parse the ratesheet.
   **/
  @ApiModelProperty(value = "Human readable name for the schema that was used to parse the ratesheet.")
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * Human readable status for progress of the ratesheet upload. This may be an error, the number of rates upload, or a completion message.
   **/
  @ApiModelProperty(value = "Human readable status for progress of the ratesheet upload. This may be an error, the number of rates upload, or a completion message.")
  public String getStatus() {
    return status;
  }

  /**
   * Filename of the ratesheet that was uploaded by the user.
   **/
  @ApiModelProperty(value = "Filename of the ratesheet that was uploaded by the user.")
  public String getFilename() {
    return filename;
  }

  /**
   * Media type of the file.
   **/
  @ApiModelProperty(value = "Media type of the file.")
  public String getFiletype() {
    return filetype;
  }

  /**
   * Time at which the uploaded ratesheet was started to be parsed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Time at which the uploaded ratesheet was started to be parsed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreated() {
    return created;
  }

  /**
   * Time at which the progress of the upload was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Time at which the progress of the upload was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getUpdated() {
    return updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadProgress uploadProgress = (UploadProgress) o;
    return Objects.equals(carrierId, uploadProgress.carrierId) &&
        Objects.equals(schemaName, uploadProgress.schemaName) &&
        Objects.equals(status, uploadProgress.status) &&
        Objects.equals(filename, uploadProgress.filename) &&
        Objects.equals(filetype, uploadProgress.filetype) &&
        Objects.equals(created, uploadProgress.created) &&
        Objects.equals(updated, uploadProgress.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, schemaName, status, filename, filetype, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadProgress {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    filetype: ").append(toIndentedString(filetype)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
