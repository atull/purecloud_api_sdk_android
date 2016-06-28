package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ArchiveRetention;
import io.swagger.client.model.DeleteRetention;

import com.google.gson.annotations.SerializedName;





public class RetentionDuration   {
  
  @SerializedName("archiveRetention")
  private ArchiveRetention archiveRetention = null;

  @SerializedName("deleteRetention")
  private DeleteRetention deleteRetention = null;

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
    RetentionDuration retentionDuration = (RetentionDuration) o;
    return Objects.equals(archiveRetention, retentionDuration.archiveRetention) &&
        Objects.equals(deleteRetention, retentionDuration.deleteRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveRetention, deleteRetention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionDuration {\n");
    
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
