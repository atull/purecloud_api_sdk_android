package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BatchReplyItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class BatchReply   {
  
  @SerializedName("items")
  private List<BatchReplyItem> items = new ArrayList<BatchReplyItem>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BatchReplyItem> getItems() {
    return items;
  }
  public void setItems(List<BatchReplyItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchReply batchReply = (BatchReply) o;
    return Objects.equals(items, batchReply.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReply {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
