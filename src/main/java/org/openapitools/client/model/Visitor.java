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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Visitor information
 **/
@ApiModel(description = "Visitor information")
public class Visitor {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("created_via")
  private String createdVia = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("mobile")
  private String mobile = null;
  @SerializedName("note")
  private String note = null;
  @SerializedName("profile_pic_content_type")
  private String profilePicContentType = null;
  @SerializedName("profile_pic_file_name")
  private String profilePicFileName = null;
  @SerializedName("profile_pic_file_size")
  private String profilePicFileSize = null;
  @SerializedName("profile_pic_updated_at")
  private String profilePicUpdatedAt = null;
  @SerializedName("watchlist_level")
  private String watchlistLevel = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;

  /**
   * UUID
   **/
  @ApiModelProperty(value = "UUID")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedVia() {
    return createdVia;
  }
  public void setCreatedVia(String createdVia) {
    this.createdVia = createdVia;
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
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePicContentType() {
    return profilePicContentType;
  }
  public void setProfilePicContentType(String profilePicContentType) {
    this.profilePicContentType = profilePicContentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePicFileName() {
    return profilePicFileName;
  }
  public void setProfilePicFileName(String profilePicFileName) {
    this.profilePicFileName = profilePicFileName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePicFileSize() {
    return profilePicFileSize;
  }
  public void setProfilePicFileSize(String profilePicFileSize) {
    this.profilePicFileSize = profilePicFileSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePicUpdatedAt() {
    return profilePicUpdatedAt;
  }
  public void setProfilePicUpdatedAt(String profilePicUpdatedAt) {
    this.profilePicUpdatedAt = profilePicUpdatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWatchlistLevel() {
    return watchlistLevel;
  }
  public void setWatchlistLevel(String watchlistLevel) {
    this.watchlistLevel = watchlistLevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Visitor visitor = (Visitor) o;
    return (this.id == null ? visitor.id == null : this.id.equals(visitor.id)) &&
        (this.active == null ? visitor.active == null : this.active.equals(visitor.active)) &&
        (this.company == null ? visitor.company == null : this.company.equals(visitor.company)) &&
        (this.createdVia == null ? visitor.createdVia == null : this.createdVia.equals(visitor.createdVia)) &&
        (this.email == null ? visitor.email == null : this.email.equals(visitor.email)) &&
        (this.firstName == null ? visitor.firstName == null : this.firstName.equals(visitor.firstName)) &&
        (this.lastName == null ? visitor.lastName == null : this.lastName.equals(visitor.lastName)) &&
        (this.mobile == null ? visitor.mobile == null : this.mobile.equals(visitor.mobile)) &&
        (this.note == null ? visitor.note == null : this.note.equals(visitor.note)) &&
        (this.profilePicContentType == null ? visitor.profilePicContentType == null : this.profilePicContentType.equals(visitor.profilePicContentType)) &&
        (this.profilePicFileName == null ? visitor.profilePicFileName == null : this.profilePicFileName.equals(visitor.profilePicFileName)) &&
        (this.profilePicFileSize == null ? visitor.profilePicFileSize == null : this.profilePicFileSize.equals(visitor.profilePicFileSize)) &&
        (this.profilePicUpdatedAt == null ? visitor.profilePicUpdatedAt == null : this.profilePicUpdatedAt.equals(visitor.profilePicUpdatedAt)) &&
        (this.watchlistLevel == null ? visitor.watchlistLevel == null : this.watchlistLevel.equals(visitor.watchlistLevel)) &&
        (this.createdAt == null ? visitor.createdAt == null : this.createdAt.equals(visitor.createdAt)) &&
        (this.updatedAt == null ? visitor.updatedAt == null : this.updatedAt.equals(visitor.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.createdVia == null ? 0: this.createdVia.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.mobile == null ? 0: this.mobile.hashCode());
    result = 31 * result + (this.note == null ? 0: this.note.hashCode());
    result = 31 * result + (this.profilePicContentType == null ? 0: this.profilePicContentType.hashCode());
    result = 31 * result + (this.profilePicFileName == null ? 0: this.profilePicFileName.hashCode());
    result = 31 * result + (this.profilePicFileSize == null ? 0: this.profilePicFileSize.hashCode());
    result = 31 * result + (this.profilePicUpdatedAt == null ? 0: this.profilePicUpdatedAt.hashCode());
    result = 31 * result + (this.watchlistLevel == null ? 0: this.watchlistLevel.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visitor {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  createdVia: ").append(createdVia).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  mobile: ").append(mobile).append("\n");
    sb.append("  note: ").append(note).append("\n");
    sb.append("  profilePicContentType: ").append(profilePicContentType).append("\n");
    sb.append("  profilePicFileName: ").append(profilePicFileName).append("\n");
    sb.append("  profilePicFileSize: ").append(profilePicFileSize).append("\n");
    sb.append("  profilePicUpdatedAt: ").append(profilePicUpdatedAt).append("\n");
    sb.append("  watchlistLevel: ").append(watchlistLevel).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
