package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DocusignTemplateMapping;
import io.swagger.client.model.Organization;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class SignatureDocumentInfo   {
  
  @SerializedName("org")
  private Organization org = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("returnUrl")
  private String returnUrl = null;

  @SerializedName("template")
  private DocusignTemplateMapping template = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Organization getOrg() {
    return org;
  }
  public void setOrg(Organization org) {
    this.org = org;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  /**
   * Template ID alias for the ESignature template you would like to retrieve.
   **/
  @ApiModelProperty(value = "Template ID alias for the ESignature template you would like to retrieve.")
  public DocusignTemplateMapping getTemplate() {
    return template;
  }
  public void setTemplate(DocusignTemplateMapping template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureDocumentInfo signatureDocumentInfo = (SignatureDocumentInfo) o;
    return Objects.equals(org, signatureDocumentInfo.org) &&
        Objects.equals(user, signatureDocumentInfo.user) &&
        Objects.equals(returnUrl, signatureDocumentInfo.returnUrl) &&
        Objects.equals(template, signatureDocumentInfo.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, user, returnUrl, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureDocumentInfo {\n");
    
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
