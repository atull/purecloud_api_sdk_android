package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class PaymentTokenProvider   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tokenCreationRequestEnvelope")
  private Map<String, String> tokenCreationRequestEnvelope = new HashMap<String, String>();

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
  public Map<String, String> getTokenCreationRequestEnvelope() {
    return tokenCreationRequestEnvelope;
  }
  public void setTokenCreationRequestEnvelope(Map<String, String> tokenCreationRequestEnvelope) {
    this.tokenCreationRequestEnvelope = tokenCreationRequestEnvelope;
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
    PaymentTokenProvider paymentTokenProvider = (PaymentTokenProvider) o;
    return Objects.equals(id, paymentTokenProvider.id) &&
        Objects.equals(name, paymentTokenProvider.name) &&
        Objects.equals(tokenCreationRequestEnvelope, paymentTokenProvider.tokenCreationRequestEnvelope) &&
        Objects.equals(selfUri, paymentTokenProvider.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tokenCreationRequestEnvelope, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenProvider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tokenCreationRequestEnvelope: ").append(toIndentedString(tokenCreationRequestEnvelope)).append("\n");
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
