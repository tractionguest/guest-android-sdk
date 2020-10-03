/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.14.1
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
 * The root of the Capacity&#39;s schema.
 **/
@ApiModel(description = "The root of the Capacity's schema.")
public class Capacity {
  
  @SerializedName("signins_count")
  private Integer signinsCount = null;
  @SerializedName("invites_expected_next_hour")
  private Integer invitesExpectedNextHour = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSigninsCount() {
    return signinsCount;
  }
  public void setSigninsCount(Integer signinsCount) {
    this.signinsCount = signinsCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getInvitesExpectedNextHour() {
    return invitesExpectedNextHour;
  }
  public void setInvitesExpectedNextHour(Integer invitesExpectedNextHour) {
    this.invitesExpectedNextHour = invitesExpectedNextHour;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capacity capacity = (Capacity) o;
    return (this.signinsCount == null ? capacity.signinsCount == null : this.signinsCount.equals(capacity.signinsCount)) &&
        (this.invitesExpectedNextHour == null ? capacity.invitesExpectedNextHour == null : this.invitesExpectedNextHour.equals(capacity.invitesExpectedNextHour));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.signinsCount == null ? 0: this.signinsCount.hashCode());
    result = 31 * result + (this.invitesExpectedNextHour == null ? 0: this.invitesExpectedNextHour.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capacity {\n");
    
    sb.append("  signinsCount: ").append(signinsCount).append("\n");
    sb.append("  invitesExpectedNextHour: ").append(invitesExpectedNextHour).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
