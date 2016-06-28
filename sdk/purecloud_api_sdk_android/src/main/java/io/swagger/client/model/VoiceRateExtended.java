package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class VoiceRateExtended   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("amendmentId")
  private String amendmentId = null;


  /**
   * The voice rate type.
   */
  public enum TypeEnum {
    @SerializedName("RATE_TOLL_FREE")
    RATE_TOLL_FREE("RATE_TOLL_FREE"),

    @SerializedName("RATE_TOLLED")
    RATE_TOLLED("RATE_TOLLED"),

    @SerializedName("OUTBOUND_INTERSTATE")
    OUTBOUND_INTERSTATE("OUTBOUND_INTERSTATE"),

    @SerializedName("OUTBOUND_INTRASTATE")
    OUTBOUND_INTRASTATE("OUTBOUND_INTRASTATE"),

    @SerializedName("OUTBOUND_LOCAL")
    OUTBOUND_LOCAL("OUTBOUND_LOCAL"),

    @SerializedName("EXTENDED")
    EXTENDED("EXTENDED");

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

  @SerializedName("effectiveDate")
  private Date effectiveDate = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("areaCode")
  private String areaCode = null;

  @SerializedName("deletionMarker")
  private Boolean deletionMarker = false;

  @SerializedName("outboundRate")
  private BigDecimal outboundRate = null;

  @SerializedName("outboundDurationMinimumSeconds")
  private Integer outboundDurationMinimumSeconds = null;

  @SerializedName("outboundDurationIncrementSeconds")
  private Integer outboundDurationIncrementSeconds = null;

  @SerializedName("inboundTolledRate")
  private BigDecimal inboundTolledRate = null;

  @SerializedName("inboundTolledDurationMinimumSeconds")
  private Integer inboundTolledDurationMinimumSeconds = null;

  @SerializedName("inboundTolledDurationIncrementSeconds")
  private Integer inboundTolledDurationIncrementSeconds = null;

  @SerializedName("inboundTollFreeRate")
  private BigDecimal inboundTollFreeRate = null;

  @SerializedName("inboundTollFreeDurationMinimumSeconds")
  private Integer inboundTollFreeDurationMinimumSeconds = null;

  @SerializedName("inboundTollFreeDurationIncrementSeconds")
  private Integer inboundTollFreeDurationIncrementSeconds = null;

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
   * The amendment Id of the voice rate.
   **/
  @ApiModelProperty(required = true, value = "The amendment Id of the voice rate.")
  public String getAmendmentId() {
    return amendmentId;
  }
  public void setAmendmentId(String amendmentId) {
    this.amendmentId = amendmentId;
  }

  /**
   * The voice rate type.
   **/
  @ApiModelProperty(required = true, value = "The voice rate type.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The effective date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The effective date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(Date effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  /**
   * The group containing this area code.
   **/
  @ApiModelProperty(required = true, value = "The group containing this area code.")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * The area code.
   **/
  @ApiModelProperty(required = true, value = "The area code.")
  public String getAreaCode() {
    return areaCode;
  }
  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  /**
   * The deletion marker.
   **/
  @ApiModelProperty(required = true, value = "The deletion marker.")
  public Boolean getDeletionMarker() {
    return deletionMarker;
  }
  public void setDeletionMarker(Boolean deletionMarker) {
    this.deletionMarker = deletionMarker;
  }

  /**
   * The outbound extended rate.
   **/
  @ApiModelProperty(required = true, value = "The outbound extended rate.")
  public BigDecimal getOutboundRate() {
    return outboundRate;
  }
  public void setOutboundRate(BigDecimal outboundRate) {
    this.outboundRate = outboundRate;
  }

  /**
   * The minimum duration charged in seconds.
   **/
  @ApiModelProperty(required = true, value = "The minimum duration charged in seconds.")
  public Integer getOutboundDurationMinimumSeconds() {
    return outboundDurationMinimumSeconds;
  }
  public void setOutboundDurationMinimumSeconds(Integer outboundDurationMinimumSeconds) {
    this.outboundDurationMinimumSeconds = outboundDurationMinimumSeconds;
  }

  /**
   * The billing duration increment in seconds.
   **/
  @ApiModelProperty(required = true, value = "The billing duration increment in seconds.")
  public Integer getOutboundDurationIncrementSeconds() {
    return outboundDurationIncrementSeconds;
  }
  public void setOutboundDurationIncrementSeconds(Integer outboundDurationIncrementSeconds) {
    this.outboundDurationIncrementSeconds = outboundDurationIncrementSeconds;
  }

  /**
   * The inbound tolled rate.
   **/
  @ApiModelProperty(required = true, value = "The inbound tolled rate.")
  public BigDecimal getInboundTolledRate() {
    return inboundTolledRate;
  }
  public void setInboundTolledRate(BigDecimal inboundTolledRate) {
    this.inboundTolledRate = inboundTolledRate;
  }

  /**
   * The minimum duration charged in seconds.
   **/
  @ApiModelProperty(required = true, value = "The minimum duration charged in seconds.")
  public Integer getInboundTolledDurationMinimumSeconds() {
    return inboundTolledDurationMinimumSeconds;
  }
  public void setInboundTolledDurationMinimumSeconds(Integer inboundTolledDurationMinimumSeconds) {
    this.inboundTolledDurationMinimumSeconds = inboundTolledDurationMinimumSeconds;
  }

  /**
   * The billing duration increment in seconds.
   **/
  @ApiModelProperty(required = true, value = "The billing duration increment in seconds.")
  public Integer getInboundTolledDurationIncrementSeconds() {
    return inboundTolledDurationIncrementSeconds;
  }
  public void setInboundTolledDurationIncrementSeconds(Integer inboundTolledDurationIncrementSeconds) {
    this.inboundTolledDurationIncrementSeconds = inboundTolledDurationIncrementSeconds;
  }

  /**
   * The inbound toll-free rate.
   **/
  @ApiModelProperty(required = true, value = "The inbound toll-free rate.")
  public BigDecimal getInboundTollFreeRate() {
    return inboundTollFreeRate;
  }
  public void setInboundTollFreeRate(BigDecimal inboundTollFreeRate) {
    this.inboundTollFreeRate = inboundTollFreeRate;
  }

  /**
   * The minimum duration charged in seconds.
   **/
  @ApiModelProperty(required = true, value = "The minimum duration charged in seconds.")
  public Integer getInboundTollFreeDurationMinimumSeconds() {
    return inboundTollFreeDurationMinimumSeconds;
  }
  public void setInboundTollFreeDurationMinimumSeconds(Integer inboundTollFreeDurationMinimumSeconds) {
    this.inboundTollFreeDurationMinimumSeconds = inboundTollFreeDurationMinimumSeconds;
  }

  /**
   * The billing duration increment in seconds.
   **/
  @ApiModelProperty(required = true, value = "The billing duration increment in seconds.")
  public Integer getInboundTollFreeDurationIncrementSeconds() {
    return inboundTollFreeDurationIncrementSeconds;
  }
  public void setInboundTollFreeDurationIncrementSeconds(Integer inboundTollFreeDurationIncrementSeconds) {
    this.inboundTollFreeDurationIncrementSeconds = inboundTollFreeDurationIncrementSeconds;
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
    VoiceRateExtended voiceRateExtended = (VoiceRateExtended) o;
    return Objects.equals(id, voiceRateExtended.id) &&
        Objects.equals(name, voiceRateExtended.name) &&
        Objects.equals(currency, voiceRateExtended.currency) &&
        Objects.equals(amendmentId, voiceRateExtended.amendmentId) &&
        Objects.equals(type, voiceRateExtended.type) &&
        Objects.equals(effectiveDate, voiceRateExtended.effectiveDate) &&
        Objects.equals(groupName, voiceRateExtended.groupName) &&
        Objects.equals(areaCode, voiceRateExtended.areaCode) &&
        Objects.equals(deletionMarker, voiceRateExtended.deletionMarker) &&
        Objects.equals(outboundRate, voiceRateExtended.outboundRate) &&
        Objects.equals(outboundDurationMinimumSeconds, voiceRateExtended.outboundDurationMinimumSeconds) &&
        Objects.equals(outboundDurationIncrementSeconds, voiceRateExtended.outboundDurationIncrementSeconds) &&
        Objects.equals(inboundTolledRate, voiceRateExtended.inboundTolledRate) &&
        Objects.equals(inboundTolledDurationMinimumSeconds, voiceRateExtended.inboundTolledDurationMinimumSeconds) &&
        Objects.equals(inboundTolledDurationIncrementSeconds, voiceRateExtended.inboundTolledDurationIncrementSeconds) &&
        Objects.equals(inboundTollFreeRate, voiceRateExtended.inboundTollFreeRate) &&
        Objects.equals(inboundTollFreeDurationMinimumSeconds, voiceRateExtended.inboundTollFreeDurationMinimumSeconds) &&
        Objects.equals(inboundTollFreeDurationIncrementSeconds, voiceRateExtended.inboundTollFreeDurationIncrementSeconds) &&
        Objects.equals(selfUri, voiceRateExtended.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, amendmentId, type, effectiveDate, groupName, areaCode, deletionMarker, outboundRate, outboundDurationMinimumSeconds, outboundDurationIncrementSeconds, inboundTolledRate, inboundTolledDurationMinimumSeconds, inboundTolledDurationIncrementSeconds, inboundTollFreeRate, inboundTollFreeDurationMinimumSeconds, inboundTollFreeDurationIncrementSeconds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceRateExtended {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amendmentId: ").append(toIndentedString(amendmentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    deletionMarker: ").append(toIndentedString(deletionMarker)).append("\n");
    sb.append("    outboundRate: ").append(toIndentedString(outboundRate)).append("\n");
    sb.append("    outboundDurationMinimumSeconds: ").append(toIndentedString(outboundDurationMinimumSeconds)).append("\n");
    sb.append("    outboundDurationIncrementSeconds: ").append(toIndentedString(outboundDurationIncrementSeconds)).append("\n");
    sb.append("    inboundTolledRate: ").append(toIndentedString(inboundTolledRate)).append("\n");
    sb.append("    inboundTolledDurationMinimumSeconds: ").append(toIndentedString(inboundTolledDurationMinimumSeconds)).append("\n");
    sb.append("    inboundTolledDurationIncrementSeconds: ").append(toIndentedString(inboundTolledDurationIncrementSeconds)).append("\n");
    sb.append("    inboundTollFreeRate: ").append(toIndentedString(inboundTollFreeRate)).append("\n");
    sb.append("    inboundTollFreeDurationMinimumSeconds: ").append(toIndentedString(inboundTollFreeDurationMinimumSeconds)).append("\n");
    sb.append("    inboundTollFreeDurationIncrementSeconds: ").append(toIndentedString(inboundTollFreeDurationIncrementSeconds)).append("\n");
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
