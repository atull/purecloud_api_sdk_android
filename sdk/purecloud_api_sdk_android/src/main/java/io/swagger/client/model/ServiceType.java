package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ServiceType   {
  
  @SerializedName("type")
  private String type = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = new HashMap<String, String>();

  @SerializedName("codecs")
  private List<String> codecs = new ArrayList<String>();

  @SerializedName("strip")
  private String strip = null;

  @SerializedName("callingPartyId")
  private String callingPartyId = null;

  @SerializedName("callHistory")
  private String callHistory = null;

  @SerializedName("prefix")
  private String prefix = null;

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
  public Map<String, String> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCodecs() {
    return codecs;
  }
  public void setCodecs(List<String> codecs) {
    this.codecs = codecs;
  }

  /**
   * Prefix striping is a mechanism to remove digits from the beginning of a phone number before sending a call out to a carrier, such as international exit codes. This must be configurable on a per carrier basis as all carriers act differently.
   **/
  @ApiModelProperty(value = "Prefix striping is a mechanism to remove digits from the beginning of a phone number before sending a call out to a carrier, such as international exit codes. This must be configurable on a per carrier basis as all carriers act differently.")
  public String getStrip() {
    return strip;
  }
  public void setStrip(String strip) {
    this.strip = strip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallingPartyId() {
    return callingPartyId;
  }
  public void setCallingPartyId(String callingPartyId) {
    this.callingPartyId = callingPartyId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallHistory() {
    return callHistory;
  }
  public void setCallHistory(String callHistory) {
    this.callHistory = callHistory;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceType serviceType = (ServiceType) o;
    return Objects.equals(type, serviceType.type) &&
        Objects.equals(parameters, serviceType.parameters) &&
        Objects.equals(codecs, serviceType.codecs) &&
        Objects.equals(strip, serviceType.strip) &&
        Objects.equals(callingPartyId, serviceType.callingPartyId) &&
        Objects.equals(callHistory, serviceType.callHistory) &&
        Objects.equals(prefix, serviceType.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameters, codecs, strip, callingPartyId, callHistory, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
    sb.append("    strip: ").append(toIndentedString(strip)).append("\n");
    sb.append("    callingPartyId: ").append(toIndentedString(callingPartyId)).append("\n");
    sb.append("    callHistory: ").append(toIndentedString(callHistory)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
