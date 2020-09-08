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
 * A client host assigned to a Signin
 **/
@ApiModel(description = "A client host assigned to a Signin")
public class Host {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("profile_pic_url")
  private String profilePicUrl = null;
  @SerializedName("department")
  private String department = null;
  @SerializedName("mobile_number")
  private String mobileNumber = null;

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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePicUrl() {
    return profilePicUrl;
  }
  public void setProfilePicUrl(String profilePicUrl) {
    this.profilePicUrl = profilePicUrl;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Host host = (Host) o;
    return (this.id == null ? host.id == null : this.id.equals(host.id)) &&
        (this.email == null ? host.email == null : this.email.equals(host.email)) &&
        (this.firstName == null ? host.firstName == null : this.firstName.equals(host.firstName)) &&
        (this.lastName == null ? host.lastName == null : this.lastName.equals(host.lastName)) &&
        (this.profilePicUrl == null ? host.profilePicUrl == null : this.profilePicUrl.equals(host.profilePicUrl)) &&
        (this.department == null ? host.department == null : this.department.equals(host.department)) &&
        (this.mobileNumber == null ? host.mobileNumber == null : this.mobileNumber.equals(host.mobileNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.profilePicUrl == null ? 0: this.profilePicUrl.hashCode());
    result = 31 * result + (this.department == null ? 0: this.department.hashCode());
    result = 31 * result + (this.mobileNumber == null ? 0: this.mobileNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Host {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  profilePicUrl: ").append(profilePicUrl).append("\n");
    sb.append("  department: ").append(department).append("\n");
    sb.append("  mobileNumber: ").append(mobileNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}