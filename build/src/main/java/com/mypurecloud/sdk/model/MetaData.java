package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class MetaData  implements Serializable {
  
  @SerializedName("pairing-token")
  private String pairingToken = null;

  @SerializedName("pairing-trust")
  private String pairingTrust = null;

  @SerializedName("pairing-url")
  private String pairingUrl = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPairingToken() {
    return pairingToken;
  }
  public void setPairingToken(String pairingToken) {
    this.pairingToken = pairingToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPairingTrust() {
    return pairingTrust;
  }
  public void setPairingTrust(String pairingTrust) {
    this.pairingTrust = pairingTrust;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPairingUrl() {
    return pairingUrl;
  }
  public void setPairingUrl(String pairingUrl) {
    this.pairingUrl = pairingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaData metaData = (MetaData) o;
    return Objects.equals(pairingToken, metaData.pairingToken) &&
        Objects.equals(pairingTrust, metaData.pairingTrust) &&
        Objects.equals(pairingUrl, metaData.pairingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingToken, pairingTrust, pairingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");
    
    sb.append("    pairingToken: ").append(toIndentedString(pairingToken)).append("\n");
    sb.append("    pairingTrust: ").append(toIndentedString(pairingTrust)).append("\n");
    sb.append("    pairingUrl: ").append(toIndentedString(pairingUrl)).append("\n");
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
