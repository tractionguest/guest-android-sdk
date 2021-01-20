/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.14.2
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
import org.openapitools.client.model.NotificationTriggerCreateParams;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the InviteCreateParams type&#39;s schema.
 **/
@ApiModel(description = "The root of the InviteCreateParams type's schema.")
public class InviteCreateParams {
  
  @SerializedName("mobile_number")
  private String mobileNumber = null;
  @SerializedName("notification_triggers")
  private List<NotificationTriggerCreateParams> notificationTriggers = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("email_template_id")
  private Integer emailTemplateId = null;
  @SerializedName("custom_fields")
  private List<CustomField> customFields = null;
  @SerializedName("host_ids")
  private List<Integer> hostIds = null;
  public enum WatchlistColourEnum {
     RED,  GREEN,  YELLOW,  ORANGE, 
  };
  @SerializedName("watchlist_colour")
  private WatchlistColourEnum watchlistColour = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("start_date")
  private Date startDate = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("end_date")
  private Date endDate = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("group_visit_id")
  private String groupVisitId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<NotificationTriggerCreateParams> getNotificationTriggers() {
    return notificationTriggers;
  }
  public void setNotificationTriggers(List<NotificationTriggerCreateParams> notificationTriggers) {
    this.notificationTriggers = notificationTriggers;
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
  public Integer getEmailTemplateId() {
    return emailTemplateId;
  }
  public void setEmailTemplateId(Integer emailTemplateId) {
    this.emailTemplateId = emailTemplateId;
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
  public List<Integer> getHostIds() {
    return hostIds;
  }
  public void setHostIds(List<Integer> hostIds) {
    this.hostIds = hostIds;
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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The `start_date` is required for invitations to lobbies
   **/
  @ApiModelProperty(value = "The `start_date` is required for invitations to lobbies")
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
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGroupVisitId() {
    return groupVisitId;
  }
  public void setGroupVisitId(String groupVisitId) {
    this.groupVisitId = groupVisitId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteCreateParams inviteCreateParams = (InviteCreateParams) o;
    return (this.mobileNumber == null ? inviteCreateParams.mobileNumber == null : this.mobileNumber.equals(inviteCreateParams.mobileNumber)) &&
        (this.notificationTriggers == null ? inviteCreateParams.notificationTriggers == null : this.notificationTriggers.equals(inviteCreateParams.notificationTriggers)) &&
        (this.firstName == null ? inviteCreateParams.firstName == null : this.firstName.equals(inviteCreateParams.firstName)) &&
        (this.emailTemplateId == null ? inviteCreateParams.emailTemplateId == null : this.emailTemplateId.equals(inviteCreateParams.emailTemplateId)) &&
        (this.customFields == null ? inviteCreateParams.customFields == null : this.customFields.equals(inviteCreateParams.customFields)) &&
        (this.hostIds == null ? inviteCreateParams.hostIds == null : this.hostIds.equals(inviteCreateParams.hostIds)) &&
        (this.watchlistColour == null ? inviteCreateParams.watchlistColour == null : this.watchlistColour.equals(inviteCreateParams.watchlistColour)) &&
        (this.title == null ? inviteCreateParams.title == null : this.title.equals(inviteCreateParams.title)) &&
        (this.startDate == null ? inviteCreateParams.startDate == null : this.startDate.equals(inviteCreateParams.startDate)) &&
        (this.lastName == null ? inviteCreateParams.lastName == null : this.lastName.equals(inviteCreateParams.lastName)) &&
        (this.endDate == null ? inviteCreateParams.endDate == null : this.endDate.equals(inviteCreateParams.endDate)) &&
        (this.email == null ? inviteCreateParams.email == null : this.email.equals(inviteCreateParams.email)) &&
        (this.company == null ? inviteCreateParams.company == null : this.company.equals(inviteCreateParams.company)) &&
        (this.groupVisitId == null ? inviteCreateParams.groupVisitId == null : this.groupVisitId.equals(inviteCreateParams.groupVisitId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mobileNumber == null ? 0: this.mobileNumber.hashCode());
    result = 31 * result + (this.notificationTriggers == null ? 0: this.notificationTriggers.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.emailTemplateId == null ? 0: this.emailTemplateId.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    result = 31 * result + (this.hostIds == null ? 0: this.hostIds.hashCode());
    result = 31 * result + (this.watchlistColour == null ? 0: this.watchlistColour.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.groupVisitId == null ? 0: this.groupVisitId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteCreateParams {\n");
    
    sb.append("  mobileNumber: ").append(mobileNumber).append("\n");
    sb.append("  notificationTriggers: ").append(notificationTriggers).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  emailTemplateId: ").append(emailTemplateId).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  hostIds: ").append(hostIds).append("\n");
    sb.append("  watchlistColour: ").append(watchlistColour).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  groupVisitId: ").append(groupVisitId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
