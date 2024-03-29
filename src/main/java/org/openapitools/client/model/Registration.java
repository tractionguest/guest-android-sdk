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

import java.util.Date;
import org.openapitools.client.model.Invite;
import org.openapitools.client.model.Signin;
import org.openapitools.client.model.Visitor;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The data of a Registration
 **/
@ApiModel(description = "The data of a Registration")
public class Registration {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("visitor")
  private Visitor visitor = null;
  @SerializedName("invite")
  private Invite invite = null;
  @SerializedName("photo_url")
  private String photoUrl = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("signin")
  private Signin signin = null;

  /**
   * Registration unique identifier
   **/
  @ApiModelProperty(required = true, value = "Registration unique identifier")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Visitor getVisitor() {
    return visitor;
  }
  public void setVisitor(Visitor visitor) {
    this.visitor = visitor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Invite getInvite() {
    return invite;
  }
  public void setInvite(Invite invite) {
    this.invite = invite;
  }

  /**
   * URL of the uploaded photo
   **/
  @ApiModelProperty(value = "URL of the uploaded photo")
  public String getPhotoUrl() {
    return photoUrl;
  }
  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  /**
   * Company's name
   **/
  @ApiModelProperty(value = "Company's name")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * E-mail
   **/
  @ApiModelProperty(value = "E-mail")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Guest's name
   **/
  @ApiModelProperty(value = "Guest's name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Datetime when registration was created
   **/
  @ApiModelProperty(required = true, value = "Datetime when registration was created")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Signin getSignin() {
    return signin;
  }
  public void setSignin(Signin signin) {
    this.signin = signin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registration registration = (Registration) o;
    return (this.id == null ? registration.id == null : this.id.equals(registration.id)) &&
        (this.visitor == null ? registration.visitor == null : this.visitor.equals(registration.visitor)) &&
        (this.invite == null ? registration.invite == null : this.invite.equals(registration.invite)) &&
        (this.photoUrl == null ? registration.photoUrl == null : this.photoUrl.equals(registration.photoUrl)) &&
        (this.company == null ? registration.company == null : this.company.equals(registration.company)) &&
        (this.email == null ? registration.email == null : this.email.equals(registration.email)) &&
        (this.name == null ? registration.name == null : this.name.equals(registration.name)) &&
        (this.createdAt == null ? registration.createdAt == null : this.createdAt.equals(registration.createdAt)) &&
        (this.signin == null ? registration.signin == null : this.signin.equals(registration.signin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.visitor == null ? 0: this.visitor.hashCode());
    result = 31 * result + (this.invite == null ? 0: this.invite.hashCode());
    result = 31 * result + (this.photoUrl == null ? 0: this.photoUrl.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.signin == null ? 0: this.signin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registration {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  visitor: ").append(visitor).append("\n");
    sb.append("  invite: ").append(invite).append("\n");
    sb.append("  photoUrl: ").append(photoUrl).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  signin: ").append(signin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
