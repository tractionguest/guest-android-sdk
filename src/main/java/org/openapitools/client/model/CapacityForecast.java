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

import java.util.*;
import org.openapitools.client.model.CapacityByHourResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the CapacityForecast&#39;s schema.
 **/
@ApiModel(description = "The root of the CapacityForecast's schema.")
public class CapacityForecast {
  
  @SerializedName("invites_by_hour")
  private List<CapacityByHourResponse> invitesByHour = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CapacityByHourResponse> getInvitesByHour() {
    return invitesByHour;
  }
  public void setInvitesByHour(List<CapacityByHourResponse> invitesByHour) {
    this.invitesByHour = invitesByHour;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityForecast capacityForecast = (CapacityForecast) o;
    return (this.invitesByHour == null ? capacityForecast.invitesByHour == null : this.invitesByHour.equals(capacityForecast.invitesByHour));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invitesByHour == null ? 0: this.invitesByHour.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityForecast {\n");
    
    sb.append("  invitesByHour: ").append(invitesByHour).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
