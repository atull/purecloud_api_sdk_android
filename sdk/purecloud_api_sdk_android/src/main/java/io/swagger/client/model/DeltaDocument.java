package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class DeltaDocument   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentLengthBytes")
  private Long contentLengthBytes = null;


  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),

    @SerializedName("UPDATED")
    UPDATED("UPDATED"),

    @SerializedName("REPLACED")
    REPLACED("REPLACED"),

    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getContentLengthBytes() {
    return contentLengthBytes;
  }
  public void setContentLengthBytes(Long contentLengthBytes) {
    this.contentLengthBytes = contentLengthBytes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaDocument deltaDocument = (DeltaDocument) o;
    return Objects.equals(id, deltaDocument.id) &&
        Objects.equals(name, deltaDocument.name) &&
        Objects.equals(filename, deltaDocument.filename) &&
        Objects.equals(contentType, deltaDocument.contentType) &&
        Objects.equals(contentLengthBytes, deltaDocument.contentLengthBytes) &&
        Objects.equals(operation, deltaDocument.operation) &&
        Objects.equals(dateModified, deltaDocument.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, filename, contentType, contentLengthBytes, operation, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
