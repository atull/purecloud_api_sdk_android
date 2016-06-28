package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class PaymentMethod   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("CARD_TOKEN")
    TOKEN("CARD_TOKEN");

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

  @SerializedName("providerName")
  private String providerName = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("cardExpirationDate")
  private String cardExpirationDate = null;

  @SerializedName("cardLastFourDigits")
  private String cardLastFourDigits = null;


  /**
   * for payment methods of type CARD_TOKEN, the type of credit or debit card
   */
  public enum CardTypeEnum {
    @SerializedName("Visa")
    VISA("Visa"),

    @SerializedName("MasterCard")
    MASTERCARD("MasterCard"),

    @SerializedName("Discover")
    DISCOVER("Discover"),

    @SerializedName("American Express")
    AMERICAN_EXPRESS("American Express");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cardType")
  private CardTypeEnum cardType = null;

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
  public String getProviderName() {
    return providerName;
  }
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * for payment methods of type CARD_TOKEN, the card's expiration date in the format YYYY-MM.
   **/
  @ApiModelProperty(value = "for payment methods of type CARD_TOKEN, the card's expiration date in the format YYYY-MM.")
  public String getCardExpirationDate() {
    return cardExpirationDate;
  }
  public void setCardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCardLastFourDigits() {
    return cardLastFourDigits;
  }
  public void setCardLastFourDigits(String cardLastFourDigits) {
    this.cardLastFourDigits = cardLastFourDigits;
  }

  /**
   * for payment methods of type CARD_TOKEN, the type of credit or debit card
   **/
  @ApiModelProperty(value = "for payment methods of type CARD_TOKEN, the type of credit or debit card")
  public CardTypeEnum getCardType() {
    return cardType;
  }
  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
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
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(id, paymentMethod.id) &&
        Objects.equals(name, paymentMethod.name) &&
        Objects.equals(type, paymentMethod.type) &&
        Objects.equals(providerName, paymentMethod.providerName) &&
        Objects.equals(token, paymentMethod.token) &&
        Objects.equals(cardExpirationDate, paymentMethod.cardExpirationDate) &&
        Objects.equals(cardLastFourDigits, paymentMethod.cardLastFourDigits) &&
        Objects.equals(cardType, paymentMethod.cardType) &&
        Objects.equals(selfUri, paymentMethod.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, providerName, token, cardExpirationDate, cardLastFourDigits, cardType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
    sb.append("    cardLastFourDigits: ").append(toIndentedString(cardLastFourDigits)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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
