package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UsageItem  implements Serializable {
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("RECORDING")
    RECORDING("RECORDING"),

    @SerializedName("FAX")
    FAX("FAX"),

    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT"),

    @SerializedName("ALL")
    ALL("ALL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("totalDocumentByteCount")
  private Long totalDocumentByteCount = null;

  @SerializedName("totalDocumentCount")
  private Long totalDocumentCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalDocumentByteCount() {
    return totalDocumentByteCount;
  }
  public void setTotalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalDocumentCount() {
    return totalDocumentCount;
  }
  public void setTotalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageItem usageItem = (UsageItem) o;
    return Objects.equals(type, usageItem.type) &&
        Objects.equals(totalDocumentByteCount, usageItem.totalDocumentByteCount) &&
        Objects.equals(totalDocumentCount, usageItem.totalDocumentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, totalDocumentByteCount, totalDocumentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalDocumentByteCount: ").append(toIndentedString(totalDocumentByteCount)).append("\n");
    sb.append("    totalDocumentCount: ").append(toIndentedString(totalDocumentCount)).append("\n");
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
