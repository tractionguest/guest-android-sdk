/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.15.0
 * Contact: support@tractionguest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the CapacityByHour&#39;s schema.
 **/
@ApiModel(description = "The root of the CapacityByHour's schema.")
public class CapacityByHourResponse {
  
  @SerializedName("range_start")
  private Date rangeStart = null;
  @SerializedName("range_end")
  private Date rangeEnd = null;
  @SerializedName("expected_visitors")
  private Integer expectedVisitors = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRangeStart() {
    return rangeStart;
  }
  public void setRangeStart(Date rangeStart) {
    this.rangeStart = rangeStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRangeEnd() {
    return rangeEnd;
  }
  public void setRangeEnd(Date rangeEnd) {
    this.rangeEnd = rangeEnd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getExpectedVisitors() {
    return expectedVisitors;
  }
  public void setExpectedVisitors(Integer expectedVisitors) {
    this.expectedVisitors = expectedVisitors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityByHourResponse capacityByHourResponse = (CapacityByHourResponse) o;
    return (this.rangeStart == null ? capacityByHourResponse.rangeStart == null : this.rangeStart.equals(capacityByHourResponse.rangeStart)) &&
        (this.rangeEnd == null ? capacityByHourResponse.rangeEnd == null : this.rangeEnd.equals(capacityByHourResponse.rangeEnd)) &&
        (this.expectedVisitors == null ? capacityByHourResponse.expectedVisitors == null : this.expectedVisitors.equals(capacityByHourResponse.expectedVisitors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rangeStart == null ? 0: this.rangeStart.hashCode());
    result = 31 * result + (this.rangeEnd == null ? 0: this.rangeEnd.hashCode());
    result = 31 * result + (this.expectedVisitors == null ? 0: this.expectedVisitors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityByHourResponse {\n");
    
    sb.append("  rangeStart: ").append(rangeStart).append("\n");
    sb.append("  rangeEnd: ").append(rangeEnd).append("\n");
    sb.append("  expectedVisitors: ").append(expectedVisitors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
