package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Chat   {
  
  @SerializedName("jabberId")
  private String jabberId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getJabberId() {
    return jabberId;
  }
  public void setJabberId(String jabberId) {
    this.jabberId = jabberId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chat chat = (Chat) o;
    return Objects.equals(jabberId, chat.jabberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jabberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("    jabberId: ").append(toIndentedString(jabberId)).append("\n");
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
