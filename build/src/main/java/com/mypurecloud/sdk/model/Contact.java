package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Contact  implements Serializable {
  
  @SerializedName("address")
  private String address = null;

  @SerializedName("display")
  private String display = null;


  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("PHONE")
    PHONE("PHONE"),

    @SerializedName("EMAIL")
    EMAIL("EMAIL"),

    @SerializedName("SMS")
    SMS("SMS");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("PRIMARY")
    PRIMARY("PRIMARY"),

    @SerializedName("WORK")
    WORK("WORK"),

    @SerializedName("WORK2")
    WORK2("WORK2"),

    @SerializedName("WORK3")
    WORK3("WORK3"),

    @SerializedName("WORK4")
    WORK4("WORK4"),

    @SerializedName("HOME")
    HOME("HOME"),

    @SerializedName("MOBILE")
    MOBILE("MOBILE"),

    @SerializedName("MAIN")
    MAIN("MAIN");

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

  /**
   * Email address or phone number for this contact type
   **/
  @ApiModelProperty(value = "Email address or phone number for this contact type")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Formatted version of the address property
   **/
  @ApiModelProperty(value = "Formatted version of the address property")
  public String getDisplay() {
    return display;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(address, contact.address) &&
        Objects.equals(display, contact.display) &&
        Objects.equals(mediaType, contact.mediaType) &&
        Objects.equals(type, contact.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, display, mediaType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
