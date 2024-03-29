/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.17.0
 * Contact: support@tractionguest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the Location type&#39;s schema.
 **/
@ApiModel(description = "The root of the Location type's schema.")
public class Location {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("max_capacity")
  private Integer maxCapacity = null;
  @SerializedName("timezone")
  private String timezone = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Maximum capacity of a location
   **/
  @ApiModelProperty(value = "Maximum capacity of a location")
  public Integer getMaxCapacity() {
    return maxCapacity;
  }
  public void setMaxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  /**
   *  IANA timezone designations
   **/
  @ApiModelProperty(value = " IANA timezone designations")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return (this.id == null ? location.id == null : this.id.equals(location.id)) &&
        (this.name == null ? location.name == null : this.name.equals(location.name)) &&
        (this.maxCapacity == null ? location.maxCapacity == null : this.maxCapacity.equals(location.maxCapacity)) &&
        (this.timezone == null ? location.timezone == null : this.timezone.equals(location.timezone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.maxCapacity == null ? 0: this.maxCapacity.hashCode());
    result = 31 * result + (this.timezone == null ? 0: this.timezone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  maxCapacity: ").append(maxCapacity).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
