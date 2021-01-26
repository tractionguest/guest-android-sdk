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
 * The root of the SigninAcknowledgement type&#39;s schema.
 **/
@ApiModel(description = "The root of the SigninAcknowledgement type's schema.")
public class SigninAcknowledgement {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("acknowledged_at")
  private Date acknowledgedAt = null;
  @SerializedName("id")
  private Integer id = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getAcknowledgedAt() {
    return acknowledgedAt;
  }
  public void setAcknowledgedAt(Date acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninAcknowledgement signinAcknowledgement = (SigninAcknowledgement) o;
    return (this.code == null ? signinAcknowledgement.code == null : this.code.equals(signinAcknowledgement.code)) &&
        (this.acknowledgedAt == null ? signinAcknowledgement.acknowledgedAt == null : this.acknowledgedAt.equals(signinAcknowledgement.acknowledgedAt)) &&
        (this.id == null ? signinAcknowledgement.id == null : this.id.equals(signinAcknowledgement.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.acknowledgedAt == null ? 0: this.acknowledgedAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninAcknowledgement {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  acknowledgedAt: ").append(acknowledgedAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
