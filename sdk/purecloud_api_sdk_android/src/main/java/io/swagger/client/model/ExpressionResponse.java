package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.SocialAccount;
import io.swagger.client.model.TwitterExpression;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class ExpressionResponse   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("socialHub")
  private String socialHub = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("twitterExpression")
  private TwitterExpression twitterExpression = null;

  @SerializedName("rawResponseText")
  private String rawResponseText = null;

  @SerializedName("socialAccount")
  private SocialAccount socialAccount = null;

  @SerializedName("socialHubResponseId")
  private String socialHubResponseId = null;

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
   * Creation date for the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Creation date for the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date the entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date the entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   * The name of the social hub.
   **/
  @ApiModelProperty(value = "The name of the social hub.")
  public String getSocialHub() {
    return socialHub;
  }
  public void setSocialHub(String socialHub) {
    this.socialHub = socialHub;
  }

  /**
   * The conversation that this response is a part of.
   **/
  @ApiModelProperty(value = "The conversation that this response is a part of.")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  /**
   * The twitter expression that this is in response to.
   **/
  @ApiModelProperty(value = "The twitter expression that this is in response to.")
  public TwitterExpression getTwitterExpression() {
    return twitterExpression;
  }
  public void setTwitterExpression(TwitterExpression twitterExpression) {
    this.twitterExpression = twitterExpression;
  }

  /**
   * The raw text of the response.
   **/
  @ApiModelProperty(value = "The raw text of the response.")
  public String getRawResponseText() {
    return rawResponseText;
  }
  public void setRawResponseText(String rawResponseText) {
    this.rawResponseText = rawResponseText;
  }

  /**
   * The Social Account used to publish this expression
   **/
  @ApiModelProperty(required = true, value = "The Social Account used to publish this expression")
  public SocialAccount getSocialAccount() {
    return socialAccount;
  }
  public void setSocialAccount(SocialAccount socialAccount) {
    this.socialAccount = socialAccount;
  }

  /**
   * The id given to this response from the social hub
   **/
  @ApiModelProperty(value = "The id given to this response from the social hub")
  public String getSocialHubResponseId() {
    return socialHubResponseId;
  }
  public void setSocialHubResponseId(String socialHubResponseId) {
    this.socialHubResponseId = socialHubResponseId;
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
    ExpressionResponse expressionResponse = (ExpressionResponse) o;
    return Objects.equals(id, expressionResponse.id) &&
        Objects.equals(name, expressionResponse.name) &&
        Objects.equals(dateCreated, expressionResponse.dateCreated) &&
        Objects.equals(dateModified, expressionResponse.dateModified) &&
        Objects.equals(socialHub, expressionResponse.socialHub) &&
        Objects.equals(conversation, expressionResponse.conversation) &&
        Objects.equals(twitterExpression, expressionResponse.twitterExpression) &&
        Objects.equals(rawResponseText, expressionResponse.rawResponseText) &&
        Objects.equals(socialAccount, expressionResponse.socialAccount) &&
        Objects.equals(socialHubResponseId, expressionResponse.socialHubResponseId) &&
        Objects.equals(selfUri, expressionResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, socialHub, conversation, twitterExpression, rawResponseText, socialAccount, socialHubResponseId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    socialHub: ").append(toIndentedString(socialHub)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    twitterExpression: ").append(toIndentedString(twitterExpression)).append("\n");
    sb.append("    rawResponseText: ").append(toIndentedString(rawResponseText)).append("\n");
    sb.append("    socialAccount: ").append(toIndentedString(socialAccount)).append("\n");
    sb.append("    socialHubResponseId: ").append(toIndentedString(socialHubResponseId)).append("\n");
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
