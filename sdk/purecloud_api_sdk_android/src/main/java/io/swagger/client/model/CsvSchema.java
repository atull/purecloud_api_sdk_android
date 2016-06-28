package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class CsvSchema   {
  
  @SerializedName("CarrierId")
  private String carrierId = null;

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

  @SerializedName("Name")
  private String name = null;

  @SerializedName("DateFormat")
  private String dateFormat = null;

  /**
   * Carrier ID associated with this CSV schema.
   **/
  @ApiModelProperty(value = "Carrier ID associated with this CSV schema.")
  public String getCarrierId() {
    return carrierId;
  }

  /**
   * Row number for the CSV's headers.  This is zero indexed (i.e. 0 is row 1).
   **/
  @ApiModelProperty(required = true, value = "Row number for the CSV's headers.  This is zero indexed (i.e. 0 is row 1).")
  public Integer getHeaderRow() {
    return headerRow;
  }
  public void setHeaderRow(Integer headerRow) {
    this.headerRow = headerRow;
  }

  /**
   * Row number of the first line of data.  This is zero indexed (i.e. 0 is row 1).
   **/
  @ApiModelProperty(required = true, value = "Row number of the first line of data.  This is zero indexed (i.e. 0 is row 1).")
  public Integer getDataRow() {
    return dataRow;
  }
  public void setDataRow(Integer dataRow) {
    this.dataRow = dataRow;
  }

  /**
   * CSV header name to object name mappings. For example, \"ROUTE_TEL_PREFIX\" to \"Prefix\" might be one such mapping.
   **/
  @ApiModelProperty(required = true, value = "CSV header name to object name mappings. For example, \"ROUTE_TEL_PREFIX\" to \"Prefix\" might be one such mapping.")
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
    CsvSchema csvSchema = (CsvSchema) o;
    return Objects.equals(carrierId, csvSchema.carrierId) &&
        Objects.equals(headerRow, csvSchema.headerRow) &&
        Objects.equals(dataRow, csvSchema.dataRow) &&
        Objects.equals(headerMappings, csvSchema.headerMappings) &&
        Objects.equals(rateType, csvSchema.rateType) &&
        Objects.equals(name, csvSchema.name) &&
        Objects.equals(dateFormat, csvSchema.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, headerRow, dataRow, headerMappings, rateType, name, dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvSchema {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    headerRow: ").append(toIndentedString(headerRow)).append("\n");
    sb.append("    dataRow: ").append(toIndentedString(dataRow)).append("\n");
    sb.append("    headerMappings: ").append(toIndentedString(headerMappings)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
