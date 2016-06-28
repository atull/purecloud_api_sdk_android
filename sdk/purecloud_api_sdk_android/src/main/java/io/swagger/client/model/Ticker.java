package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Ticker   {
  
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("exchange")
  private String exchange = null;

  /**
   * The ticker symbol for this organization. Example: ININ, AAPL, MSFT, etc.
   **/
  @ApiModelProperty(required = true, value = "The ticker symbol for this organization. Example: ININ, AAPL, MSFT, etc.")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * The exchange for this ticker symbol. Examples: NYSE, FTSE, NASDAQ, etc.
   **/
  @ApiModelProperty(required = true, value = "The exchange for this ticker symbol. Examples: NYSE, FTSE, NASDAQ, etc.")
  public String getExchange() {
    return exchange;
  }
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticker ticker = (Ticker) o;
    return Objects.equals(symbol, ticker.symbol) &&
        Objects.equals(exchange, ticker.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticker {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
