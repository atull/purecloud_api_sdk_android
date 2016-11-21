package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Attachment;
import com.mypurecloud.sdk.model.EmailAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EmailMessage  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("to")
  private List<EmailAddress> to = new ArrayList<EmailAddress>();

  @SerializedName("cc")
  private List<EmailAddress> cc = new ArrayList<EmailAddress>();

  @SerializedName("bcc")
  private List<EmailAddress> bcc = new ArrayList<EmailAddress>();

  @SerializedName("from")
  private EmailAddress from = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  @SerializedName("textBody")
  private String textBody = null;

  @SerializedName("htmlBody")
  private String htmlBody = null;

  @SerializedName("time")
  private Date time = null;

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
   * The recipients of the email message.
   **/
  @ApiModelProperty(value = "The recipients of the email message.")
  public List<EmailAddress> getTo() {
    return to;
  }
  public void setTo(List<EmailAddress> to) {
    this.to = to;
  }

  /**
   * The recipients that were copied on the email message.
   **/
  @ApiModelProperty(value = "The recipients that were copied on the email message.")
  public List<EmailAddress> getCc() {
    return cc;
  }
  public void setCc(List<EmailAddress> cc) {
    this.cc = cc;
  }

  /**
   * The recipients that were blind copied on the email message.
   **/
  @ApiModelProperty(value = "The recipients that were blind copied on the email message.")
  public List<EmailAddress> getBcc() {
    return bcc;
  }
  public void setBcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
  }

  /**
   * The sender of the email message.
   **/
  @ApiModelProperty(value = "The sender of the email message.")
  public EmailAddress getFrom() {
    return from;
  }
  public void setFrom(EmailAddress from) {
    this.from = from;
  }

  /**
   * The subject of the email message.
   **/
  @ApiModelProperty(value = "The subject of the email message.")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * The attachments of the email message.
   **/
  @ApiModelProperty(value = "The attachments of the email message.")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * The text body of the email message.
   **/
  @ApiModelProperty(value = "The text body of the email message.")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  /**
   * The html body of the email message.
   **/
  @ApiModelProperty(value = "The html body of the email message.")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  /**
   * The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
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
    EmailMessage emailMessage = (EmailMessage) o;
    return Objects.equals(id, emailMessage.id) &&
        Objects.equals(name, emailMessage.name) &&
        Objects.equals(to, emailMessage.to) &&
        Objects.equals(cc, emailMessage.cc) &&
        Objects.equals(bcc, emailMessage.bcc) &&
        Objects.equals(from, emailMessage.from) &&
        Objects.equals(subject, emailMessage.subject) &&
        Objects.equals(attachments, emailMessage.attachments) &&
        Objects.equals(textBody, emailMessage.textBody) &&
        Objects.equals(htmlBody, emailMessage.htmlBody) &&
        Objects.equals(time, emailMessage.time) &&
        Objects.equals(selfUri, emailMessage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, to, cc, bcc, from, subject, attachments, textBody, htmlBody, time, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
