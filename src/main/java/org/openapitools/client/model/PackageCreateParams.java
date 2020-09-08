/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.14.0
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
 * A [base64_image] string is provided as an encoded image of a shipping label. The image will be processed to determine the package&#39;s intended recipient. If a match is found between the recipient and an existing host, they&#39;ll be notified about the arrival of their package at the [location_id] specified.
 **/
@ApiModel(description = "A [base64_image] string is provided as an encoded image of a shipping label. The image will be processed to determine the package's intended recipient. If a match is found between the recipient and an existing host, they'll be notified about the arrival of their package at the [location_id] specified.")
public class PackageCreateParams {
  
  @SerializedName("base64_image")
  private byte[] base64Image = null;
  @SerializedName("location_id")
  private Integer locationId = null;

  /**
   * Base64 encoded image on which to perform processing
   **/
  @ApiModelProperty(required = true, value = "Base64 encoded image on which to perform processing")
  public byte[] getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(byte[] base64Image) {
    this.base64Image = base64Image;
  }

  /**
   * Location id for where the package was delivered
   **/
  @ApiModelProperty(required = true, value = "Location id for where the package was delivered")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageCreateParams packageCreateParams = (PackageCreateParams) o;
    return (this.base64Image == null ? packageCreateParams.base64Image == null : this.base64Image.equals(packageCreateParams.base64Image)) &&
        (this.locationId == null ? packageCreateParams.locationId == null : this.locationId.equals(packageCreateParams.locationId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.base64Image == null ? 0: this.base64Image.hashCode());
    result = 31 * result + (this.locationId == null ? 0: this.locationId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageCreateParams {\n");
    
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  locationId: ").append(locationId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
