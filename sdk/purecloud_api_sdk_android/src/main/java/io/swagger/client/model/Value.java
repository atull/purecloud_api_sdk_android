package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Queue;
import io.swagger.client.model.SubDataItem;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Value   {
  
  @SerializedName("stringItems")
  private List<String> stringItems = new ArrayList<String>();

  @SerializedName("integerItems")
  private List<String> integerItems = new ArrayList<String>();

  @SerializedName("realItems")
  private List<String> realItems = new ArrayList<String>();

  @SerializedName("dateItems")
  private List<Date> dateItems = new ArrayList<Date>();

  @SerializedName("userItems")
  private List<User> userItems = new ArrayList<User>();

  @SerializedName("queueItems")
  private List<Queue> queueItems = new ArrayList<Queue>();

  @SerializedName("dataItems")
  private List<SubDataItem> dataItems = new ArrayList<SubDataItem>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getStringItems() {
    return stringItems;
  }
  public void setStringItems(List<String> stringItems) {
    this.stringItems = stringItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getIntegerItems() {
    return integerItems;
  }
  public void setIntegerItems(List<String> integerItems) {
    this.integerItems = integerItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRealItems() {
    return realItems;
  }
  public void setRealItems(List<String> realItems) {
    this.realItems = realItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Date> getDateItems() {
    return dateItems;
  }
  public void setDateItems(List<Date> dateItems) {
    this.dateItems = dateItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getUserItems() {
    return userItems;
  }
  public void setUserItems(List<User> userItems) {
    this.userItems = userItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Queue> getQueueItems() {
    return queueItems;
  }
  public void setQueueItems(List<Queue> queueItems) {
    this.queueItems = queueItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SubDataItem> getDataItems() {
    return dataItems;
  }
  public void setDataItems(List<SubDataItem> dataItems) {
    this.dataItems = dataItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Value value = (Value) o;
    return Objects.equals(stringItems, value.stringItems) &&
        Objects.equals(integerItems, value.integerItems) &&
        Objects.equals(realItems, value.realItems) &&
        Objects.equals(dateItems, value.dateItems) &&
        Objects.equals(userItems, value.userItems) &&
        Objects.equals(queueItems, value.queueItems) &&
        Objects.equals(dataItems, value.dataItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItems, integerItems, realItems, dateItems, userItems, queueItems, dataItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    stringItems: ").append(toIndentedString(stringItems)).append("\n");
    sb.append("    integerItems: ").append(toIndentedString(integerItems)).append("\n");
    sb.append("    realItems: ").append(toIndentedString(realItems)).append("\n");
    sb.append("    dateItems: ").append(toIndentedString(dateItems)).append("\n");
    sb.append("    userItems: ").append(toIndentedString(userItems)).append("\n");
    sb.append("    queueItems: ").append(toIndentedString(queueItems)).append("\n");
    sb.append("    dataItems: ").append(toIndentedString(dataItems)).append("\n");
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
