package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContractJob;
import io.swagger.client.model.Quote;

import com.google.gson.annotations.SerializedName;





public class Contract   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("quote")
  private Quote quote = null;

  @SerializedName("signerUrl")
  private String signerUrl = null;

  @SerializedName("job")
  private ContractJob job = null;

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
  public Quote getQuote() {
    return quote;
  }
  public void setQuote(Quote quote) {
    this.quote = quote;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSignerUrl() {
    return signerUrl;
  }
  public void setSignerUrl(String signerUrl) {
    this.signerUrl = signerUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ContractJob getJob() {
    return job;
  }
  public void setJob(ContractJob job) {
    this.job = job;
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
    Contract contract = (Contract) o;
    return Objects.equals(id, contract.id) &&
        Objects.equals(name, contract.name) &&
        Objects.equals(quote, contract.quote) &&
        Objects.equals(signerUrl, contract.signerUrl) &&
        Objects.equals(job, contract.job) &&
        Objects.equals(selfUri, contract.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quote, signerUrl, job, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    signerUrl: ").append(toIndentedString(signerUrl)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
