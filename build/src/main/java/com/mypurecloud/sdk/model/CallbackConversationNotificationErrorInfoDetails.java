package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallbackConversationNotificationErrorInfoDetails  implements Serializable {
  
  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("entityId")
  private String entityId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackConversationNotificationErrorInfoDetails callbackConversationNotificationErrorInfoDetails = (CallbackConversationNotificationErrorInfoDetails) o;
    return Objects.equals(errorCode, callbackConversationNotificationErrorInfoDetails.errorCode) &&
        Objects.equals(fieldName, callbackConversationNotificationErrorInfoDetails.fieldName) &&
        Objects.equals(entityId, callbackConversationNotificationErrorInfoDetails.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, fieldName, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackConversationNotificationErrorInfoDetails {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
