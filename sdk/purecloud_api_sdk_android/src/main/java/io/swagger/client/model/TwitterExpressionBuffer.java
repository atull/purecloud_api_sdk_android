package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TwitterExpression;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TwitterExpressionBuffer   {
  
  @SerializedName("bufferContent")
  private List<TwitterExpression> bufferContent = new ArrayList<TwitterExpression>();

  /**
   * The list of TwitterExpressions currently in the buffer.
   **/
  @ApiModelProperty(value = "The list of TwitterExpressions currently in the buffer.")
  public List<TwitterExpression> getBufferContent() {
    return bufferContent;
  }
  public void setBufferContent(List<TwitterExpression> bufferContent) {
    this.bufferContent = bufferContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterExpressionBuffer twitterExpressionBuffer = (TwitterExpressionBuffer) o;
    return Objects.equals(bufferContent, twitterExpressionBuffer.bufferContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufferContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterExpressionBuffer {\n");
    
    sb.append("    bufferContent: ").append(toIndentedString(bufferContent)).append("\n");
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
