package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class PhoneNumber   {
  
  @SerializedName("display")
  private String display = null;

  @SerializedName("extension")
  private Long extension = null;

  @SerializedName("acceptsSMS")
  private Boolean acceptsSMS = false;

  @SerializedName("userInput")
  private String userInput = null;

  @SerializedName("e164")
  private String e164 = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExtension() {
    return extension;
  }
  public void setExtension(Long extension) {
    this.extension = extension;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAcceptsSMS() {
    return acceptsSMS;
  }
  public void setAcceptsSMS(Boolean acceptsSMS) {
    this.acceptsSMS = acceptsSMS;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserInput() {
    return userInput;
  }
  public void setUserInput(String userInput) {
    this.userInput = userInput;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getE164() {
    return e164;
  }
  public void setE164(String e164) {
    this.e164 = e164;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(display, phoneNumber.display) &&
        Objects.equals(extension, phoneNumber.extension) &&
        Objects.equals(acceptsSMS, phoneNumber.acceptsSMS) &&
        Objects.equals(userInput, phoneNumber.userInput) &&
        Objects.equals(e164, phoneNumber.e164) &&
        Objects.equals(countryCode, phoneNumber.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, extension, acceptsSMS, userInput, e164, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    acceptsSMS: ").append(toIndentedString(acceptsSMS)).append("\n");
    sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
