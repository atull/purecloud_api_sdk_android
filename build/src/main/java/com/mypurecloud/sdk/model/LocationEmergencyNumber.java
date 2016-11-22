package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class LocationEmergencyNumber  implements Serializable {
  
  @SerializedName("e164")
  private String e164 = null;

  @SerializedName("number")
  private String number = null;


  /**
   * The type of emergency number.
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("elin")
    ELIN("elin");

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
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The type of emergency number.
   **/
  @ApiModelProperty(value = "The type of emergency number.")
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
    LocationEmergencyNumber locationEmergencyNumber = (LocationEmergencyNumber) o;
    return Objects.equals(e164, locationEmergencyNumber.e164) &&
        Objects.equals(number, locationEmergencyNumber.number) &&
        Objects.equals(type, locationEmergencyNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e164, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationEmergencyNumber {\n");
    
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
