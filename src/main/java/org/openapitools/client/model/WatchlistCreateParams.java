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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Parameters required for updating or creating watchlist records 
 **/
@ApiModel(description = "Parameters required for updating or creating watchlist records ")
public class WatchlistCreateParams {
  
  @SerializedName("aliases")
  private List<String> aliases = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("email")
  private String email = null;
  public enum ColourEnum {
     RED,  YELLOW,  GREEN,  ORANGE, 
  };
  @SerializedName("colour")
  private ColourEnum colour = null;
  @SerializedName("base64_image")
  private byte[] base64Image = null;
  @SerializedName("driver_license")
  private String driverLicense = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAliases() {
    return aliases;
  }
  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
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
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
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
  public ColourEnum getColour() {
    return colour;
  }
  public void setColour(ColourEnum colour) {
    this.colour = colour;
  }

  /**
   * A base64 encoded image. base64_image should be strict encoded 
   **/
  @ApiModelProperty(value = "A base64 encoded image. base64_image should be strict encoded ")
  public byte[] getBase64Image() {
    return base64Image;
  }
  public void setBase64Image(byte[] base64Image) {
    this.base64Image = base64Image;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDriverLicense() {
    return driverLicense;
  }
  public void setDriverLicense(String driverLicense) {
    this.driverLicense = driverLicense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistCreateParams watchlistCreateParams = (WatchlistCreateParams) o;
    return (this.aliases == null ? watchlistCreateParams.aliases == null : this.aliases.equals(watchlistCreateParams.aliases)) &&
        (this.notes == null ? watchlistCreateParams.notes == null : this.notes.equals(watchlistCreateParams.notes)) &&
        (this.lastName == null ? watchlistCreateParams.lastName == null : this.lastName.equals(watchlistCreateParams.lastName)) &&
        (this.firstName == null ? watchlistCreateParams.firstName == null : this.firstName.equals(watchlistCreateParams.firstName)) &&
        (this.email == null ? watchlistCreateParams.email == null : this.email.equals(watchlistCreateParams.email)) &&
        (this.colour == null ? watchlistCreateParams.colour == null : this.colour.equals(watchlistCreateParams.colour)) &&
        (this.base64Image == null ? watchlistCreateParams.base64Image == null : this.base64Image.equals(watchlistCreateParams.base64Image)) &&
        (this.driverLicense == null ? watchlistCreateParams.driverLicense == null : this.driverLicense.equals(watchlistCreateParams.driverLicense));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aliases == null ? 0: this.aliases.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.colour == null ? 0: this.colour.hashCode());
    result = 31 * result + (this.base64Image == null ? 0: this.base64Image.hashCode());
    result = 31 * result + (this.driverLicense == null ? 0: this.driverLicense.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistCreateParams {\n");
    
    sb.append("  aliases: ").append(aliases).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  colour: ").append(colour).append("\n");
    sb.append("  base64Image: ").append(base64Image).append("\n");
    sb.append("  driverLicense: ").append(driverLicense).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
