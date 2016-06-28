package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SheetSchema;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class XlsxSchema   {
  
  @SerializedName("SheetSchemas")
  private List<SheetSchema> sheetSchemas = new ArrayList<SheetSchema>();

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CarrierId")
  private String carrierId = null;

  /**
   * A list of all the schemas for a XLSX file. Each schema represents a different sheet's schema.
   **/
  @ApiModelProperty(required = true, value = "A list of all the schemas for a XLSX file. Each schema represents a different sheet's schema.")
  public List<SheetSchema> getSheetSchemas() {
    return sheetSchemas;
  }
  public void setSheetSchemas(List<SheetSchema> sheetSchemas) {
    this.sheetSchemas = sheetSchemas;
  }

  /**
   * Human readable name for schema.
   **/
  @ApiModelProperty(required = true, value = "Human readable name for schema.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Carrier ID associated with this CSV schema.
   **/
  @ApiModelProperty(value = "Carrier ID associated with this CSV schema.")
  public String getCarrierId() {
    return carrierId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSchema xlsxSchema = (XlsxSchema) o;
    return Objects.equals(sheetSchemas, xlsxSchema.sheetSchemas) &&
        Objects.equals(name, xlsxSchema.name) &&
        Objects.equals(carrierId, xlsxSchema.carrierId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sheetSchemas, name, carrierId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSchema {\n");
    
    sb.append("    sheetSchemas: ").append(toIndentedString(sheetSchemas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
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
