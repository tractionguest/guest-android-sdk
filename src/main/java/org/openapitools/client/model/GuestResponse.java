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

import java.util.*;
import org.openapitools.client.model.CustomField;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The data collected from the response on a Registration
 **/
@ApiModel(description = "The data collected from the response on a Registration")
public class GuestResponse {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("custom_fields")
  private List<CustomField> customFields = null;
  @SerializedName("page_type")
  private String pageType = null;
  @SerializedName("sequence")
  private Integer sequence = null;
  @SerializedName("title")
  private String title = null;

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
   * Flex fields
   **/
  @ApiModelProperty(value = "Flex fields")
  public List<CustomField> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPageType() {
    return pageType;
  }
  public void setPageType(String pageType) {
    this.pageType = pageType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSequence() {
    return sequence;
  }
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  /**
   * Page title
   **/
  @ApiModelProperty(value = "Page title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestResponse guestResponse = (GuestResponse) o;
    return (this.id == null ? guestResponse.id == null : this.id.equals(guestResponse.id)) &&
        (this.customFields == null ? guestResponse.customFields == null : this.customFields.equals(guestResponse.customFields)) &&
        (this.pageType == null ? guestResponse.pageType == null : this.pageType.equals(guestResponse.pageType)) &&
        (this.sequence == null ? guestResponse.sequence == null : this.sequence.equals(guestResponse.sequence)) &&
        (this.title == null ? guestResponse.title == null : this.title.equals(guestResponse.title));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.customFields == null ? 0: this.customFields.hashCode());
    result = 31 * result + (this.pageType == null ? 0: this.pageType.hashCode());
    result = 31 * result + (this.sequence == null ? 0: this.sequence.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  pageType: ").append(pageType).append("\n");
    sb.append("  sequence: ").append(sequence).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
