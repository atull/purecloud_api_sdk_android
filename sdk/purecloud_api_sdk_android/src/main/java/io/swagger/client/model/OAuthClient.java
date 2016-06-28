package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class OAuthClient   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accessTokenValiditySeconds")
  private Long accessTokenValiditySeconds = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("registeredRedirectUri")
  private List<String> registeredRedirectUri = new ArrayList<String>();

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("roleIds")
  private List<String> roleIds = new ArrayList<String>();


  /**
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   */
  public enum AuthorizedGrantTypeEnum {
    @SerializedName("CODE")
    CODE("CODE"),

    @SerializedName("TOKEN")
    TOKEN("TOKEN"),

    @SerializedName("SAML2BEARER")
    SAML2BEARER("SAML2BEARER"),

    @SerializedName("PASSWORD")
    PASSWORD("PASSWORD"),

    @SerializedName("CLIENT_CREDENTIALS")
    CLIENT_CREDENTIALS("CLIENT_CREDENTIALS");

    private String value;

    AuthorizedGrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authorizedGrantType")
  private AuthorizedGrantTypeEnum authorizedGrantType = null;

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
   * The name of the OAuth client.
   **/
  @ApiModelProperty(required = true, value = "The name of the OAuth client.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of seconds, between 5mins and 48hrs, until tokens created with this client expire. If this field is omitted, a default of 24 hours will be applied.
   **/
  @ApiModelProperty(value = "The number of seconds, between 5mins and 48hrs, until tokens created with this client expire. If this field is omitted, a default of 24 hours will be applied.")
  public Long getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }
  public void setAccessTokenValiditySeconds(Long accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of allowed callbacks for this client. For example: https://myap.example.com/auth/callback
   **/
  @ApiModelProperty(required = true, value = "List of allowed callbacks for this client. For example: https://myap.example.com/auth/callback")
  public List<String> getRegisteredRedirectUri() {
    return registeredRedirectUri;
  }
  public void setRegisteredRedirectUri(List<String> registeredRedirectUri) {
    this.registeredRedirectUri = registeredRedirectUri;
  }

  /**
   * System created secret assigned to this client. Secrets are required for code authorization and client credential grants.
   **/
  @ApiModelProperty(value = "System created secret assigned to this client. Secrets are required for code authorization and client credential grants.")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   * Roles assigned to this client. Roles only apply to clients using the client_credential grant
   **/
  @ApiModelProperty(value = "Roles assigned to this client. Roles only apply to clients using the client_credential grant")
  public List<String> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  /**
   * The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. 
   **/
  @ApiModelProperty(value = "The OAuth Grant/Client type supported by this client. Code Authorization Grant/Client type - Preferred client type where the Client ID and Secret are required to create tokens. Used where the secret can be secured. Implicit grant type - Client ID only is required to create tokens. Used in browser and mobile apps where the secret can not be secured. SAML2-Bearer extension grant type - SAML2 assertion provider for user authentication at the token endpoint. Client Credential grant type - Used to created access tokens that are tied only to the client. ")
  public AuthorizedGrantTypeEnum getAuthorizedGrantType() {
    return authorizedGrantType;
  }
  public void setAuthorizedGrantType(AuthorizedGrantTypeEnum authorizedGrantType) {
    this.authorizedGrantType = authorizedGrantType;
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
    OAuthClient oAuthClient = (OAuthClient) o;
    return Objects.equals(id, oAuthClient.id) &&
        Objects.equals(name, oAuthClient.name) &&
        Objects.equals(accessTokenValiditySeconds, oAuthClient.accessTokenValiditySeconds) &&
        Objects.equals(description, oAuthClient.description) &&
        Objects.equals(registeredRedirectUri, oAuthClient.registeredRedirectUri) &&
        Objects.equals(secret, oAuthClient.secret) &&
        Objects.equals(roleIds, oAuthClient.roleIds) &&
        Objects.equals(authorizedGrantType, oAuthClient.authorizedGrantType) &&
        Objects.equals(selfUri, oAuthClient.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accessTokenValiditySeconds, description, registeredRedirectUri, secret, roleIds, authorizedGrantType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    registeredRedirectUri: ").append(toIndentedString(registeredRedirectUri)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    authorizedGrantType: ").append(toIndentedString(authorizedGrantType)).append("\n");
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
