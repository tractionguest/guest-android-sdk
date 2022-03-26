/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.18.0
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
 * The root of the Error type&#39;s schema.
 **/
@ApiModel(description = "The root of the Error type's schema.")
public class Error {
  
  @SerializedName("domain")
  private String domain = null;
  @SerializedName("attribute")
  private String attribute = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;

  /**
   * The name of the model with the error, or global if it is something outside a model
   **/
  @ApiModelProperty(required = true, value = "The name of the model with the error, or global if it is something outside a model")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * The model attribute where the error occured
   **/
  @ApiModelProperty(value = "The model attribute where the error occured")
  public String getAttribute() {
    return attribute;
  }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  /**
   * An error code reference for the specific error that occured
   **/
  @ApiModelProperty(required = true, value = "An error code reference for the specific error that occured")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human readable error message that can be discarded for internationalization purposes
   **/
  @ApiModelProperty(value = "A human readable error message that can be discarded for internationalization purposes")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return (this.domain == null ? error.domain == null : this.domain.equals(error.domain)) &&
        (this.attribute == null ? error.attribute == null : this.attribute.equals(error.attribute)) &&
        (this.code == null ? error.code == null : this.code.equals(error.code)) &&
        (this.message == null ? error.message == null : this.message.equals(error.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.domain == null ? 0: this.domain.hashCode());
    result = 31 * result + (this.attribute == null ? 0: this.attribute.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  attribute: ").append(attribute).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
