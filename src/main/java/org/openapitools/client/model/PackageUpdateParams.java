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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Update/Edit information about a Package.  [picked_up] - changes the package_state to picked up and assigns non null value to picked_up_at  [recipient_id] - update the package&#39;s intended recipient. Changes package_state to &#39;recipient_matched&#39; and notifies host about their package via email. A previous recipient will stop getting notifications  [carrier_name] - change/update the package&#39;s carrier/courier information 
 **/
@ApiModel(description = "Update/Edit information about a Package.  [picked_up] - changes the package_state to picked up and assigns non null value to picked_up_at  [recipient_id] - update the package's intended recipient. Changes package_state to 'recipient_matched' and notifies host about their package via email. A previous recipient will stop getting notifications  [carrier_name] - change/update the package's carrier/courier information ")
public class PackageUpdateParams {
  
  @SerializedName("picked_up")
  private Boolean pickedUp = null;
  @SerializedName("carrier_name")
  private String carrierName = null;
  @SerializedName("recipient_id")
  private Integer recipientId = null;

  /**
   * changes the package_state to picked up and assigns non null value to picked_up_at
   **/
  @ApiModelProperty(value = "changes the package_state to picked up and assigns non null value to picked_up_at")
  public Boolean getPickedUp() {
    return pickedUp;
  }
  public void setPickedUp(Boolean pickedUp) {
    this.pickedUp = pickedUp;
  }

  /**
   * change/update the package's carrier/courier information
   **/
  @ApiModelProperty(value = "change/update the package's carrier/courier information")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  /**
   * id of the Host for which you want to send notifications to regarding their package
   **/
  @ApiModelProperty(value = "id of the Host for which you want to send notifications to regarding their package")
  public Integer getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageUpdateParams packageUpdateParams = (PackageUpdateParams) o;
    return (this.pickedUp == null ? packageUpdateParams.pickedUp == null : this.pickedUp.equals(packageUpdateParams.pickedUp)) &&
        (this.carrierName == null ? packageUpdateParams.carrierName == null : this.carrierName.equals(packageUpdateParams.carrierName)) &&
        (this.recipientId == null ? packageUpdateParams.recipientId == null : this.recipientId.equals(packageUpdateParams.recipientId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pickedUp == null ? 0: this.pickedUp.hashCode());
    result = 31 * result + (this.carrierName == null ? 0: this.carrierName.hashCode());
    result = 31 * result + (this.recipientId == null ? 0: this.recipientId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageUpdateParams {\n");
    
    sb.append("  pickedUp: ").append(pickedUp).append("\n");
    sb.append("  carrierName: ").append(carrierName).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
