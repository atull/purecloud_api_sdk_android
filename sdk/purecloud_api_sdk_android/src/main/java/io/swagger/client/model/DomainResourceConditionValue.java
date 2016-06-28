package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Queue;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class DomainResourceConditionValue   {
  
  @SerializedName("user")
  private User user = null;

  @SerializedName("queue")
  private Queue queue = null;

  @SerializedName("value")
  private String value = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("SCALAR")
    SCALAR("SCALAR"),

    @SerializedName("VARIABLE")
    VARIABLE("VARIABLE"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("QUEUE")
    QUEUE("QUEUE");

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
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainResourceConditionValue domainResourceConditionValue = (DomainResourceConditionValue) o;
    return Objects.equals(user, domainResourceConditionValue.user) &&
        Objects.equals(queue, domainResourceConditionValue.queue) &&
        Objects.equals(value, domainResourceConditionValue.value) &&
        Objects.equals(type, domainResourceConditionValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, queue, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainResourceConditionValue {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
