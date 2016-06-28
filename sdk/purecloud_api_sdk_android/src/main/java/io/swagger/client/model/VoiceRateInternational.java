package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class VoiceRateInternational   {
  
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

  @SerializedName("rate")
  private BigDecimal rate = null;

  @SerializedName("durationMinimumSeconds")
  private Integer durationMinimumSeconds = null;

  @SerializedName("durationIncrementSeconds")
  private Integer durationIncrementSeconds = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("destination")
  private String destination = null;

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
   * The rate.
   **/
  @ApiModelProperty(required = true, value = "The rate.")
  public BigDecimal getRate() {
    return rate;
  }
  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  /**
   * The minimum duration charged in seconds.
   **/
  @ApiModelProperty(required = true, value = "The minimum duration charged in seconds.")
  public Integer getDurationMinimumSeconds() {
    return durationMinimumSeconds;
  }
  public void setDurationMinimumSeconds(Integer durationMinimumSeconds) {
    this.durationMinimumSeconds = durationMinimumSeconds;
  }

  /**
   * The billing duration increment in seconds.
   **/
  @ApiModelProperty(required = true, value = "The billing duration increment in seconds.")
  public Integer getDurationIncrementSeconds() {
    return durationIncrementSeconds;
  }
  public void setDurationIncrementSeconds(Integer durationIncrementSeconds) {
    this.durationIncrementSeconds = durationIncrementSeconds;
  }

  /**
   * The origin.
   **/
  @ApiModelProperty(required = true, value = "The origin.")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * The destination.
   **/
  @ApiModelProperty(required = true, value = "The destination.")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
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
    VoiceRateInternational voiceRateInternational = (VoiceRateInternational) o;
    return Objects.equals(id, voiceRateInternational.id) &&
        Objects.equals(name, voiceRateInternational.name) &&
        Objects.equals(currency, voiceRateInternational.currency) &&
        Objects.equals(amendmentId, voiceRateInternational.amendmentId) &&
        Objects.equals(type, voiceRateInternational.type) &&
        Objects.equals(effectiveDate, voiceRateInternational.effectiveDate) &&
        Objects.equals(rate, voiceRateInternational.rate) &&
        Objects.equals(durationMinimumSeconds, voiceRateInternational.durationMinimumSeconds) &&
        Objects.equals(durationIncrementSeconds, voiceRateInternational.durationIncrementSeconds) &&
        Objects.equals(origin, voiceRateInternational.origin) &&
        Objects.equals(destination, voiceRateInternational.destination) &&
        Objects.equals(selfUri, voiceRateInternational.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, amendmentId, type, effectiveDate, rate, durationMinimumSeconds, durationIncrementSeconds, origin, destination, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceRateInternational {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amendmentId: ").append(toIndentedString(amendmentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    durationMinimumSeconds: ").append(toIndentedString(durationMinimumSeconds)).append("\n");
    sb.append("    durationIncrementSeconds: ").append(toIndentedString(durationIncrementSeconds)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
