package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.VoiceRate;
import io.swagger.client.model.VoiceRateExtended;
import io.swagger.client.model.VoiceRateInternational;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class VoiceRateUpdate   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("inboundTollFree")
  private VoiceRate inboundTollFree = null;

  @SerializedName("extended")
  private List<VoiceRateExtended> extended = new ArrayList<VoiceRateExtended>();

  @SerializedName("inboundTolled")
  private VoiceRate inboundTolled = null;

  @SerializedName("outboundLocal")
  private VoiceRate outboundLocal = null;

  @SerializedName("outboundIntraState")
  private VoiceRate outboundIntraState = null;

  @SerializedName("outboundInterState")
  private VoiceRate outboundInterState = null;

  @SerializedName("outboundInternational")
  private List<VoiceRateInternational> outboundInternational = new ArrayList<VoiceRateInternational>();

  @SerializedName("amendmentDate")
  private Date amendmentDate = null;

  @SerializedName("effectiveDate")
  private Date effectiveDate = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ISO 4217 currency code of the voice rate.
   **/
  @ApiModelProperty(required = true, value = "The ISO 4217 currency code of the voice rate.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The inbound toll free rate.
   **/
  @ApiModelProperty(value = "The inbound toll free rate.")
  public VoiceRate getInboundTollFree() {
    return inboundTollFree;
  }
  public void setInboundTollFree(VoiceRate inboundTollFree) {
    this.inboundTollFree = inboundTollFree;
  }

  /**
   * The domestic extended rates.
   **/
  @ApiModelProperty(value = "The domestic extended rates.")
  public List<VoiceRateExtended> getExtended() {
    return extended;
  }
  public void setExtended(List<VoiceRateExtended> extended) {
    this.extended = extended;
  }

  /**
   * The inbound tolled rate.
   **/
  @ApiModelProperty(value = "The inbound tolled rate.")
  public VoiceRate getInboundTolled() {
    return inboundTolled;
  }
  public void setInboundTolled(VoiceRate inboundTolled) {
    this.inboundTolled = inboundTolled;
  }

  /**
   * The outbound local rate.
   **/
  @ApiModelProperty(value = "The outbound local rate.")
  public VoiceRate getOutboundLocal() {
    return outboundLocal;
  }
  public void setOutboundLocal(VoiceRate outboundLocal) {
    this.outboundLocal = outboundLocal;
  }

  /**
   * The outbound intra-state rate.
   **/
  @ApiModelProperty(value = "The outbound intra-state rate.")
  public VoiceRate getOutboundIntraState() {
    return outboundIntraState;
  }
  public void setOutboundIntraState(VoiceRate outboundIntraState) {
    this.outboundIntraState = outboundIntraState;
  }

  /**
   * The outbound inter-state rate.
   **/
  @ApiModelProperty(value = "The outbound inter-state rate.")
  public VoiceRate getOutboundInterState() {
    return outboundInterState;
  }
  public void setOutboundInterState(VoiceRate outboundInterState) {
    this.outboundInterState = outboundInterState;
  }

  /**
   * The outbound international rates.
   **/
  @ApiModelProperty(value = "The outbound international rates.")
  public List<VoiceRateInternational> getOutboundInternational() {
    return outboundInternational;
  }
  public void setOutboundInternational(List<VoiceRateInternational> outboundInternational) {
    this.outboundInternational = outboundInternational;
  }

  /**
   * The date of the rate amendment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The date of the rate amendment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getAmendmentDate() {
    return amendmentDate;
  }
  public void setAmendmentDate(Date amendmentDate) {
    this.amendmentDate = amendmentDate;
  }

  /**
   * The effective date of the rate amendment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The effective date of the rate amendment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(Date effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceRateUpdate voiceRateUpdate = (VoiceRateUpdate) o;
    return Objects.equals(id, voiceRateUpdate.id) &&
        Objects.equals(name, voiceRateUpdate.name) &&
        Objects.equals(currency, voiceRateUpdate.currency) &&
        Objects.equals(inboundTollFree, voiceRateUpdate.inboundTollFree) &&
        Objects.equals(extended, voiceRateUpdate.extended) &&
        Objects.equals(inboundTolled, voiceRateUpdate.inboundTolled) &&
        Objects.equals(outboundLocal, voiceRateUpdate.outboundLocal) &&
        Objects.equals(outboundIntraState, voiceRateUpdate.outboundIntraState) &&
        Objects.equals(outboundInterState, voiceRateUpdate.outboundInterState) &&
        Objects.equals(outboundInternational, voiceRateUpdate.outboundInternational) &&
        Objects.equals(amendmentDate, voiceRateUpdate.amendmentDate) &&
        Objects.equals(effectiveDate, voiceRateUpdate.effectiveDate) &&
        Objects.equals(selfUri, voiceRateUpdate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, inboundTollFree, extended, inboundTolled, outboundLocal, outboundIntraState, outboundInterState, outboundInternational, amendmentDate, effectiveDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceRateUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    inboundTollFree: ").append(toIndentedString(inboundTollFree)).append("\n");
    sb.append("    extended: ").append(toIndentedString(extended)).append("\n");
    sb.append("    inboundTolled: ").append(toIndentedString(inboundTolled)).append("\n");
    sb.append("    outboundLocal: ").append(toIndentedString(outboundLocal)).append("\n");
    sb.append("    outboundIntraState: ").append(toIndentedString(outboundIntraState)).append("\n");
    sb.append("    outboundInterState: ").append(toIndentedString(outboundInterState)).append("\n");
    sb.append("    outboundInternational: ").append(toIndentedString(outboundInternational)).append("\n");
    sb.append("    amendmentDate: ").append(toIndentedString(amendmentDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
