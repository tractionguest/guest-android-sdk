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

import java.util.*;
import org.openapitools.client.model.Pagination;
import org.openapitools.client.model.Registration;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PaginatedRegistrationsList {
  
  @SerializedName("registrations")
  private List<Registration> registrations = null;
  @SerializedName("pagination")
  private Pagination pagination = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Registration> getRegistrations() {
    return registrations;
  }
  public void setRegistrations(List<Registration> registrations) {
    this.registrations = registrations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedRegistrationsList paginatedRegistrationsList = (PaginatedRegistrationsList) o;
    return (this.registrations == null ? paginatedRegistrationsList.registrations == null : this.registrations.equals(paginatedRegistrationsList.registrations)) &&
        (this.pagination == null ? paginatedRegistrationsList.pagination == null : this.pagination.equals(paginatedRegistrationsList.pagination));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.registrations == null ? 0: this.registrations.hashCode());
    result = 31 * result + (this.pagination == null ? 0: this.pagination.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedRegistrationsList {\n");
    
    sb.append("  registrations: ").append(registrations).append("\n");
    sb.append("  pagination: ").append(pagination).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
