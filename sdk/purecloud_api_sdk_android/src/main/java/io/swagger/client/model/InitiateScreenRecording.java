package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ArchiveRetention;
import io.swagger.client.model.DeleteRetention;

import com.google.gson.annotations.SerializedName;





public class InitiateScreenRecording   {
  
  @SerializedName("recordACW")
  private Boolean recordACW = false;

  @SerializedName("archiveRetention")
  private ArchiveRetention archiveRetention = null;

  @SerializedName("deleteRetention")
  private DeleteRetention deleteRetention = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRecordACW() {
    return recordACW;
  }
  public void setRecordACW(Boolean recordACW) {
    this.recordACW = recordACW;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ArchiveRetention getArchiveRetention() {
    return archiveRetention;
  }
  public void setArchiveRetention(ArchiveRetention archiveRetention) {
    this.archiveRetention = archiveRetention;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DeleteRetention getDeleteRetention() {
    return deleteRetention;
  }
  public void setDeleteRetention(DeleteRetention deleteRetention) {
    this.deleteRetention = deleteRetention;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateScreenRecording initiateScreenRecording = (InitiateScreenRecording) o;
    return Objects.equals(recordACW, initiateScreenRecording.recordACW) &&
        Objects.equals(archiveRetention, initiateScreenRecording.archiveRetention) &&
        Objects.equals(deleteRetention, initiateScreenRecording.deleteRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordACW, archiveRetention, deleteRetention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateScreenRecording {\n");
    
    sb.append("    recordACW: ").append(toIndentedString(recordACW)).append("\n");
    sb.append("    archiveRetention: ").append(toIndentedString(archiveRetention)).append("\n");
    sb.append("    deleteRetention: ").append(toIndentedString(deleteRetention)).append("\n");
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
