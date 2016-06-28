package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DiagnosticEmail   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("subject")
  private String subject = null;


  /**
   * Functional Area of Issue
   */
  public enum TopicEnum {
    @SerializedName("Admin")
    ADMIN("Admin"),

    @SerializedName("Documents")
    DOCUMENTS("Documents"),

    @SerializedName("Chat")
    CHAT("Chat"),

    @SerializedName("Video Chat")
    VIDEO_CHAT("Video Chat"),

    @SerializedName("Login")
    LOGIN("Login"),

    @SerializedName("Slowness")
    SLOWNESS("Slowness"),

    @SerializedName("Other")
    OTHER("Other");

    private String value;

    TopicEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("topic")
  private TopicEnum topic = null;

  @SerializedName("description")
  private String description = null;


  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    @SerializedName("LOW")
    LOW("LOW"),

    @SerializedName("MEDIUM")
    MEDIUM("MEDIUM"),

    @SerializedName("HIGH")
    HIGH("HIGH"),

    @SerializedName("CRITICAL")
    CRITICAL("CRITICAL");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("priority")
  private PriorityEnum priority = null;


  /**
   * Type of Issue
   */
  public enum TypeEnum {
    @SerializedName("Problem")
    PROBLEM("Problem"),

    @SerializedName("Question")
    QUESTION("Question"),

    @SerializedName("Enhancement Request")
    ENHANCEMENT_REQUEST("Enhancement Request");

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

  @SerializedName("data")
  private Object data = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   * Subject of Issue Report
   **/
  @ApiModelProperty(value = "Subject of Issue Report")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Functional Area of Issue
   **/
  @ApiModelProperty(value = "Functional Area of Issue")
  public TopicEnum getTopic() {
    return topic;
  }
  public void setTopic(TopicEnum topic) {
    this.topic = topic;
  }

  /**
   * Detailed Description of Issue
   **/
  @ApiModelProperty(value = "Detailed Description of Issue")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  /**
   * Type of Issue
   **/
  @ApiModelProperty(value = "Type of Issue")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Json blob of data to be included with this report.
   **/
  @ApiModelProperty(value = "Json blob of data to be included with this report.")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticEmail diagnosticEmail = (DiagnosticEmail) o;
    return Objects.equals(id, diagnosticEmail.id) &&
        Objects.equals(subject, diagnosticEmail.subject) &&
        Objects.equals(topic, diagnosticEmail.topic) &&
        Objects.equals(description, diagnosticEmail.description) &&
        Objects.equals(priority, diagnosticEmail.priority) &&
        Objects.equals(type, diagnosticEmail.type) &&
        Objects.equals(data, diagnosticEmail.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subject, topic, description, priority, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticEmail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
