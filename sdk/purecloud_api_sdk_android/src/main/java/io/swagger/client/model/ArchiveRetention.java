package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ArchiveRetention   {
  
  @SerializedName("days")
  private Integer days = null;


  /**
   * Gets or Sets storageMedium
   */
  public enum StorageMediumEnum {
    @SerializedName("CLOUDARCHIVE")
    CLOUDARCHIVE("CLOUDARCHIVE");

    private String value;

    StorageMediumEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("storageMedium")
  private StorageMediumEnum storageMedium = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StorageMediumEnum getStorageMedium() {
    return storageMedium;
  }
  public void setStorageMedium(StorageMediumEnum storageMedium) {
    this.storageMedium = storageMedium;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveRetention archiveRetention = (ArchiveRetention) o;
    return Objects.equals(days, archiveRetention.days) &&
        Objects.equals(storageMedium, archiveRetention.storageMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, storageMedium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveRetention {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    storageMedium: ").append(toIndentedString(storageMedium)).append("\n");
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
