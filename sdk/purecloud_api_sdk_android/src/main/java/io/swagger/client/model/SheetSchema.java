package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class SheetSchema   {
  
  @SerializedName("HeaderRow")
  private Integer headerRow = null;

  @SerializedName("DataRow")
  private Integer dataRow = null;

  @SerializedName("HeaderMappings")
  private Map<String, String> headerMappings = new HashMap<String, String>();


  /**
   * Rate type for the sheet.
   */
  public enum RateTypeEnum {
    @SerializedName("INTRASTATE")
    INTRASTATE("INTRASTATE"),

    @SerializedName("INTERSTATE")
    INTERSTATE("INTERSTATE"),

    @SerializedName("INTERNATIONAL")
    INTERNATIONAL("INTERNATIONAL");

    private String value;

    RateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("RateType")
  private RateTypeEnum rateType = null;

  @SerializedName("SheetNumber")
  private Integer sheetNumber = null;

  @SerializedName("DateFormat")
  private String dateFormat = null;

  /**
   * Row number for the XLSX sheet's headers.  This is zero indexed (i.e. 0 is row 1).
   **/
  @ApiModelProperty(required = true, value = "Row number for the XLSX sheet's headers.  This is zero indexed (i.e. 0 is row 1).")
  public Integer getHeaderRow() {
    return headerRow;
  }
  public void setHeaderRow(Integer headerRow) {
    this.headerRow = headerRow;
  }

  /**
   * Row number of the first line of data in the sheet.  This is zero indexed (i.e. 0 is row 1)
   **/
  @ApiModelProperty(required = true, value = "Row number of the first line of data in the sheet.  This is zero indexed (i.e. 0 is row 1)")
  public Integer getDataRow() {
    return dataRow;
  }
  public void setDataRow(Integer dataRow) {
    this.dataRow = dataRow;
  }

  /**
   * XLSX sheet header name to object name mappings. For example, \"ROUTE_TEL_PREFIX\" to \"Prefix\" might be one such mapping.
   **/
  @ApiModelProperty(required = true, value = "XLSX sheet header name to object name mappings. For example, \"ROUTE_TEL_PREFIX\" to \"Prefix\" might be one such mapping.")
  public Map<String, String> getHeaderMappings() {
    return headerMappings;
  }
  public void setHeaderMappings(Map<String, String> headerMappings) {
    this.headerMappings = headerMappings;
  }

  /**
   * Rate type for the sheet.
   **/
  @ApiModelProperty(required = true, value = "Rate type for the sheet.")
  public RateTypeEnum getRateType() {
    return rateType;
  }
  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  /**
   * Sheet number within the XLSX file.  This is zero indexed (i.e. 0 is page 1).
   **/
  @ApiModelProperty(required = true, value = "Sheet number within the XLSX file.  This is zero indexed (i.e. 0 is page 1).")
  public Integer getSheetNumber() {
    return sheetNumber;
  }
  public void setSheetNumber(Integer sheetNumber) {
    this.sheetNumber = sheetNumber;
  }

  /**
   * A date format that represents the date time stamp you want to parse. This is based on the reference time of Mon Jan 2 15:04:05 MST 2006. For example, if you had the date 13-OCT-2015, this parameter should be 02-Jan-2006. As another example, if you have the date 2014-09-20, this parameter should be 2006-01-02.
   **/
  @ApiModelProperty(value = "A date format that represents the date time stamp you want to parse. This is based on the reference time of Mon Jan 2 15:04:05 MST 2006. For example, if you had the date 13-OCT-2015, this parameter should be 02-Jan-2006. As another example, if you have the date 2014-09-20, this parameter should be 2006-01-02.")
  public String getDateFormat() {
    return dateFormat;
  }
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SheetSchema sheetSchema = (SheetSchema) o;
    return Objects.equals(headerRow, sheetSchema.headerRow) &&
        Objects.equals(dataRow, sheetSchema.dataRow) &&
        Objects.equals(headerMappings, sheetSchema.headerMappings) &&
        Objects.equals(rateType, sheetSchema.rateType) &&
        Objects.equals(sheetNumber, sheetSchema.sheetNumber) &&
        Objects.equals(dateFormat, sheetSchema.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRow, dataRow, headerMappings, rateType, sheetNumber, dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SheetSchema {\n");
    
    sb.append("    headerRow: ").append(toIndentedString(headerRow)).append("\n");
    sb.append("    dataRow: ").append(toIndentedString(dataRow)).append("\n");
    sb.append("    headerMappings: ").append(toIndentedString(headerMappings)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    sheetNumber: ").append(toIndentedString(sheetNumber)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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
