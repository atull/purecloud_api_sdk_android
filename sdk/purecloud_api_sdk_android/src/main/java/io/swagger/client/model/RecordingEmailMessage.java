package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EmailAddress;
import io.swagger.client.model.EmailAttachment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class RecordingEmailMessage   {
  
  @SerializedName("htmlBody")
  private String htmlBody = null;

  @SerializedName("textBody")
  private String textBody = null;

  @SerializedName("id")
  private String id = null;

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
  private List<EmailAttachment> attachments = new ArrayList<EmailAttachment>();

  @SerializedName("time")
  private Date time = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EmailAddress> getTo() {
    return to;
  }
  public void setTo(List<EmailAddress> to) {
    this.to = to;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EmailAddress> getCc() {
    return cc;
  }
  public void setCc(List<EmailAddress> cc) {
    this.cc = cc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EmailAddress> getBcc() {
    return bcc;
  }
  public void setBcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EmailAddress getFrom() {
    return from;
  }
  public void setFrom(EmailAddress from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EmailAttachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingEmailMessage recordingEmailMessage = (RecordingEmailMessage) o;
    return Objects.equals(htmlBody, recordingEmailMessage.htmlBody) &&
        Objects.equals(textBody, recordingEmailMessage.textBody) &&
        Objects.equals(id, recordingEmailMessage.id) &&
        Objects.equals(to, recordingEmailMessage.to) &&
        Objects.equals(cc, recordingEmailMessage.cc) &&
        Objects.equals(bcc, recordingEmailMessage.bcc) &&
        Objects.equals(from, recordingEmailMessage.from) &&
        Objects.equals(subject, recordingEmailMessage.subject) &&
        Objects.equals(attachments, recordingEmailMessage.attachments) &&
        Objects.equals(time, recordingEmailMessage.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlBody, textBody, id, to, cc, bcc, from, subject, attachments, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingEmailMessage {\n");
    
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
