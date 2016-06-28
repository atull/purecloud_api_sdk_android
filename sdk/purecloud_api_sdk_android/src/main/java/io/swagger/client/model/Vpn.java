package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Vpn   {
  
  @SerializedName("type")
  private String type = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("psk")
  private String psk = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPsk() {
    return psk;
  }
  public void setPsk(String psk) {
    this.psk = psk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vpn vpn = (Vpn) o;
    return Objects.equals(type, vpn.type) &&
        Objects.equals(ip, vpn.ip) &&
        Objects.equals(psk, vpn.psk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ip, psk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vpn {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
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
