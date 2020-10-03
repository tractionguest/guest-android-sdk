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

@ApiModel(description = "")
public class SigninUpdateParams {
  
  @SerializedName("is_signed_out")
  private Boolean isSignedOut = null;
  @SerializedName("is_acknowledged")
  private Boolean isAcknowledged = null;
  @SerializedName("is_accounted_for")
  private Boolean isAccountedFor = null;

  /**
   * Used to sign out the `Signin`, can only be set to `true`.
   **/
  @ApiModelProperty(value = "Used to sign out the `Signin`, can only be set to `true`.")
  public Boolean getIsSignedOut() {
    return isSignedOut;
  }
  public void setIsSignedOut(Boolean isSignedOut) {
    this.isSignedOut = isSignedOut;
  }

  /**
   * Used to acknowledge the `Signin`, can only be set to `true`.
   **/
  @ApiModelProperty(value = "Used to acknowledge the `Signin`, can only be set to `true`.")
  public Boolean getIsAcknowledged() {
    return isAcknowledged;
  }
  public void setIsAcknowledged(Boolean isAcknowledged) {
    this.isAcknowledged = isAcknowledged;
  }

  /**
   * Used when keeping track of people in emergency situations
   **/
  @ApiModelProperty(value = "Used when keeping track of people in emergency situations")
  public Boolean getIsAccountedFor() {
    return isAccountedFor;
  }
  public void setIsAccountedFor(Boolean isAccountedFor) {
    this.isAccountedFor = isAccountedFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninUpdateParams signinUpdateParams = (SigninUpdateParams) o;
    return (this.isSignedOut == null ? signinUpdateParams.isSignedOut == null : this.isSignedOut.equals(signinUpdateParams.isSignedOut)) &&
        (this.isAcknowledged == null ? signinUpdateParams.isAcknowledged == null : this.isAcknowledged.equals(signinUpdateParams.isAcknowledged)) &&
        (this.isAccountedFor == null ? signinUpdateParams.isAccountedFor == null : this.isAccountedFor.equals(signinUpdateParams.isAccountedFor));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.isSignedOut == null ? 0: this.isSignedOut.hashCode());
    result = 31 * result + (this.isAcknowledged == null ? 0: this.isAcknowledged.hashCode());
    result = 31 * result + (this.isAccountedFor == null ? 0: this.isAccountedFor.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninUpdateParams {\n");
    
    sb.append("  isSignedOut: ").append(isSignedOut).append("\n");
    sb.append("  isAcknowledged: ").append(isAcknowledged).append("\n");
    sb.append("  isAccountedFor: ").append(isAccountedFor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
