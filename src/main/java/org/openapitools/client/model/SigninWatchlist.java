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
import org.openapitools.client.model.ExternalWatchlistResult;
import org.openapitools.client.model.InternalWatchlistResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the SigninWatchlist type&#39;s schema.
 **/
@ApiModel(description = "The root of the SigninWatchlist type's schema.")
public class SigninWatchlist {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("internal")
  private List<InternalWatchlistResult> internal = null;
  @SerializedName("external")
  private List<ExternalWatchlistResult> external = null;

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
  @ApiModelProperty(value = "")
  public List<InternalWatchlistResult> getInternal() {
    return internal;
  }
  public void setInternal(List<InternalWatchlistResult> internal) {
    this.internal = internal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ExternalWatchlistResult> getExternal() {
    return external;
  }
  public void setExternal(List<ExternalWatchlistResult> external) {
    this.external = external;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninWatchlist signinWatchlist = (SigninWatchlist) o;
    return (this.id == null ? signinWatchlist.id == null : this.id.equals(signinWatchlist.id)) &&
        (this.internal == null ? signinWatchlist.internal == null : this.internal.equals(signinWatchlist.internal)) &&
        (this.external == null ? signinWatchlist.external == null : this.external.equals(signinWatchlist.external));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.internal == null ? 0: this.internal.hashCode());
    result = 31 * result + (this.external == null ? 0: this.external.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninWatchlist {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  internal: ").append(internal).append("\n");
    sb.append("  external: ").append(external).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
