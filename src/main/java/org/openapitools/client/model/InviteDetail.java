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
import java.util.Date;
import org.openapitools.client.model.CustomField;
import org.openapitools.client.model.EmailTemplate;
import org.openapitools.client.model.GroupVisit;
import org.openapitools.client.model.Host;
import org.openapitools.client.model.InviteWatchlist;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.NotificationTrigger;
import org.openapitools.client.model.Registration;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the InviteDetail type&#39;s schema.
 **/
@ApiModel(description = "The root of the InviteDetail type's schema.")
public class InviteDetail {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("registration")
  private Registration registration = null;
  @SerializedName("mobile_number")
  private String mobileNumber = null;
  @SerializedName("email_template")
  private EmailTemplate emailTemplate = null;
  @SerializedName("invite_watchlist")
  private InviteWatchlist inviteWatchlist = null;
  @SerializedName("notification_triggers")
  private List<NotificationTrigger> notificationTriggers = null;
  @SerializedName("custom_fields")
  private List<CustomField> customFields = null;
  public enum WatchlistColourEnum {
     RED,  GREEN,  YELLOW,  ORANGE, 
  };
  @SerializedName("watchlist_colour")
  private WatchlistColourEnum watchlistColour = null;
  @SerializedName("location")
  private Location location = null;
  @SerializedName("hosts")
  private List<Host> hosts = null;
  @SerializedName("start_date")
  private Date startDate = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("end_date")
  private Date endDate = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("checked_in")
  private Boolean checkedIn = null;
  @SerializedName("group_visit")
  private GroupVisit groupVisit = null;

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
  public Registration getRegistration() {
    return registration;
  }
  public void setRegistration(Registration registration) {
    this.registration = registration;
  }

  /**
   * Phone number
   **/
  @ApiModelProperty(value = "Phone number")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EmailTemplate getEmailTemplate() {
    return emailTemplate;
  }
  public void setEmailTemplate(EmailTemplate emailTemplate) {
    this.emailTemplate = emailTemplate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InviteWatchlist getInviteWatchlist() {
    return inviteWatchlist;
  }
  public void setInviteWatchlist(InviteWatchlist inviteWatchlist) {
    this.inviteWatchlist = inviteWatchlist;
  }

  /**
   * List of scheduled notifications for an invite
   **/
  @ApiModelProperty(value = "List of scheduled notifications for an invite")
  public List<NotificationTrigger> getNotificationTriggers() {
    return notificationTriggers;
  }
  public void setNotificationTriggers(List<NotificationTrigger> notificationTriggers) {
    this.notificationTriggers = notificationTriggers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomField> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public WatchlistColourEnum getWatchlistColour() {
    return watchlistColour;
  }
  public void setWatchlistColour(WatchlistColourEnum watchlistColour) {
    this.watchlistColour = watchlistColour;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Host> getHosts() {
    return hosts;
  }
  public void setHosts(List<Host> hosts) {
    this.hosts = hosts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCheckedIn() {
    return checkedIn;
  }
  public void setCheckedIn(Boolean checkedIn) {
    this.checkedIn = checkedIn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GroupVisit getGroupVisit() {
    return groupVisit;
  }
  public void setGroupVisit(GroupVisit groupVisit) {
    this.groupVisit = groupVisit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteDetail inviteDetail = (InviteDetail) o;
    return (this.id == null ? inviteDetail.id == null : this.id.equals(inviteDetail.id)) &&
        (this.registration == null ? inviteDetail.registration == null : this.registration.equals(inviteDetail.registration)) &&
        (this.mobileNumber == null ? inviteDetail.mobileNumber == null : this.mobileNumber.equals(inviteDetail.mobileNumber)) &&
        (this.emailTemplate == null ? inviteDetail.emailTemplate == null : this.emailTemplate.equals(inviteDetail.emailTemplate)) &&
        (this.inviteWatchlist == null ? inviteDetail.inviteWatchlist == null : this.inviteWatchlist.equals(inviteDetail.inviteWatchlist)) &&
        (this.notificationTriggers == null ? inviteDetail.notificationTriggers == null : this.notificationTriggers.equals(inviteDetail.notificationTriggers)) &&
        (this.customFields == null ? inviteDetail.customFields == null : this.customFields.equals(inviteDetail.customFields)) &&
        (this.watchlistColour == null ? inviteDetail.watchlistColour == null : this.watchlistColour.equals(inviteDetail.watchlistColour)) &&
        (this.location == null ? inviteDetail.location == null : this.location.equals(inviteDetail.location)) &&
        (this.hosts == null ? inviteDetail.hosts == null : this.hosts.equals(inviteDetail.hosts)) &&
        (this.startDate == null ? inviteDetail.startDate == null : this.startDate.equals(inviteDetail.startDate)) &&
        (this.lastName == null ? inviteDetail.lastName == null : this.lastName.equals(inviteDetail.lastName)) &&
        (this.firstName == null ? inviteDetail.firstName == null : this.firstName.equals(inviteDetail.firstName)) &&
        (this.endDate == null ? inviteDetail.endDate == null : this.endDate.equals(inviteDetail.endDate)) &&
        (this.email == null ? inviteDetail.email == null : this.email.equals(inviteDetail.email)) &&
        (this.createdAt == null ? inviteDetail.createdAt == null : this.createdAt.equals(inviteDetail.createdAt)) &&
        (this.company == null ? inviteDetail.company == null : this.company.equals(inviteDetail.company)) &&
        (this.checkedIn == null ? inviteDetail.checkedIn == null : this.checkedIn.equals(inviteDetail.checkedIn)) &&
        (this.groupVisit == null ? inviteDetail.groupVisit == null : this.groupVisit.equals(inviteDetail.groupVisit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.registration == null ? 0: this.registration.hashCode());
    result = 31 * result + (this.mobileNumber == null ? 0: this.mobileNumber.hashCode());
    result = 31 * result + (this.emailTemplate == null ? 0: this.emailTemplate.hashCode());
    result = 31 * result + (this.inviteWatchlist == null ? 0: this.inviteWatchlist.hashCode());
    result = 31 * result + (this.notificationTriggers == null ? 0: this.notificationTriggers.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    result = 31 * result + (this.watchlistColour == null ? 0: this.watchlistColour.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.hosts == null ? 0: this.hosts.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.checkedIn == null ? 0: this.checkedIn.hashCode());
    result = 31 * result + (this.groupVisit == null ? 0: this.groupVisit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteDetail {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  registration: ").append(registration).append("\n");
    sb.append("  mobileNumber: ").append(mobileNumber).append("\n");
    sb.append("  emailTemplate: ").append(emailTemplate).append("\n");
    sb.append("  inviteWatchlist: ").append(inviteWatchlist).append("\n");
    sb.append("  notificationTriggers: ").append(notificationTriggers).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  watchlistColour: ").append(watchlistColour).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  hosts: ").append(hosts).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  checkedIn: ").append(checkedIn).append("\n");
    sb.append("  groupVisit: ").append(groupVisit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
