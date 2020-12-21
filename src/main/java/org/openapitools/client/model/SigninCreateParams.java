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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SigninCreateParams {
  
  @SerializedName("registration_id")
  private String registrationId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("sms_message")
  private String smsMessage = null;
  @SerializedName("send_notifications")
  private Boolean sendNotifications = null;
  @SerializedName("location_id")
  private Integer locationId = null;
  @SerializedName("host_ids")
  private List<Integer> hostIds = null;
  @SerializedName("host_email_template_id")
  private Integer hostEmailTemplateId = null;
  @SerializedName("guest_email_template_id")
  private Integer guestEmailTemplateId = null;

  /**
   * UUID of a Registration
   **/
  @ApiModelProperty(value = "UUID of a Registration")
  public String getRegistrationId() {
    return registrationId;
  }
  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  /**
   * E-mail, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "E-mail, ignored if `registration_id` is included")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Company name, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "Company name, ignored if `registration_id` is included")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * Last name, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "Last name, ignored if `registration_id` is included")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * First name, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "First name, ignored if `registration_id` is included")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSmsMessage() {
    return smsMessage;
  }
  public void setSmsMessage(String smsMessage) {
    this.smsMessage = smsMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSendNotifications() {
    return sendNotifications;
  }
  public void setSendNotifications(Boolean sendNotifications) {
    this.sendNotifications = sendNotifications;
  }

  /**
   * ID of the Location where the Signin happened, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "ID of the Location where the Signin happened, ignored if `registration_id` is included")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  /**
   * Array of Host ids, ignored if `registration_id` is included
   **/
  @ApiModelProperty(value = "Array of Host ids, ignored if `registration_id` is included")
  public List<Integer> getHostIds() {
    return hostIds;
  }
  public void setHostIds(List<Integer> hostIds) {
    this.hostIds = hostIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHostEmailTemplateId() {
    return hostEmailTemplateId;
  }
  public void setHostEmailTemplateId(Integer hostEmailTemplateId) {
    this.hostEmailTemplateId = hostEmailTemplateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGuestEmailTemplateId() {
    return guestEmailTemplateId;
  }
  public void setGuestEmailTemplateId(Integer guestEmailTemplateId) {
    this.guestEmailTemplateId = guestEmailTemplateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninCreateParams signinCreateParams = (SigninCreateParams) o;
    return (this.registrationId == null ? signinCreateParams.registrationId == null : this.registrationId.equals(signinCreateParams.registrationId)) &&
        (this.email == null ? signinCreateParams.email == null : this.email.equals(signinCreateParams.email)) &&
        (this.company == null ? signinCreateParams.company == null : this.company.equals(signinCreateParams.company)) &&
        (this.lastName == null ? signinCreateParams.lastName == null : this.lastName.equals(signinCreateParams.lastName)) &&
        (this.firstName == null ? signinCreateParams.firstName == null : this.firstName.equals(signinCreateParams.firstName)) &&
        (this.smsMessage == null ? signinCreateParams.smsMessage == null : this.smsMessage.equals(signinCreateParams.smsMessage)) &&
        (this.sendNotifications == null ? signinCreateParams.sendNotifications == null : this.sendNotifications.equals(signinCreateParams.sendNotifications)) &&
        (this.locationId == null ? signinCreateParams.locationId == null : this.locationId.equals(signinCreateParams.locationId)) &&
        (this.hostIds == null ? signinCreateParams.hostIds == null : this.hostIds.equals(signinCreateParams.hostIds)) &&
        (this.hostEmailTemplateId == null ? signinCreateParams.hostEmailTemplateId == null : this.hostEmailTemplateId.equals(signinCreateParams.hostEmailTemplateId)) &&
        (this.guestEmailTemplateId == null ? signinCreateParams.guestEmailTemplateId == null : this.guestEmailTemplateId.equals(signinCreateParams.guestEmailTemplateId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.registrationId == null ? 0: this.registrationId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.smsMessage == null ? 0: this.smsMessage.hashCode());
    result = 31 * result + (this.sendNotifications == null ? 0: this.sendNotifications.hashCode());
    result = 31 * result + (this.locationId == null ? 0: this.locationId.hashCode());
    result = 31 * result + (this.hostIds == null ? 0: this.hostIds.hashCode());
    result = 31 * result + (this.hostEmailTemplateId == null ? 0: this.hostEmailTemplateId.hashCode());
    result = 31 * result + (this.guestEmailTemplateId == null ? 0: this.guestEmailTemplateId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninCreateParams {\n");
    
    sb.append("  registrationId: ").append(registrationId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  smsMessage: ").append(smsMessage).append("\n");
    sb.append("  sendNotifications: ").append(sendNotifications).append("\n");
    sb.append("  locationId: ").append(locationId).append("\n");
    sb.append("  hostIds: ").append(hostIds).append("\n");
    sb.append("  hostEmailTemplateId: ").append(hostEmailTemplateId).append("\n");
    sb.append("  guestEmailTemplateId: ").append(guestEmailTemplateId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
