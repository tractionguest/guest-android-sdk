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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class AuditLogChange {
  
  @SerializedName("field_name")
  private String fieldName = null;
  @SerializedName("field_value_before")
  private String fieldValueBefore = null;
  @SerializedName("field_value_after")
  private String fieldValueAfter = null;
  public enum FormatEnum {
     string,  boolean,  integer,  json,  no_value, 
  };
  @SerializedName("format")
  private FormatEnum format = null;

  /**
   * What the field should be displayed/labeled as
   **/
  @ApiModelProperty(value = "What the field should be displayed/labeled as")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  /**
   * The value to be displayed for the field before changes
   **/
  @ApiModelProperty(value = "The value to be displayed for the field before changes")
  public String getFieldValueBefore() {
    return fieldValueBefore;
  }
  public void setFieldValueBefore(String fieldValueBefore) {
    this.fieldValueBefore = fieldValueBefore;
  }

  /**
   * The value to be displayed for the field after changes
   **/
  @ApiModelProperty(value = "The value to be displayed for the field after changes")
  public String getFieldValueAfter() {
    return fieldValueAfter;
  }
  public void setFieldValueAfter(String fieldValueAfter) {
    this.fieldValueAfter = fieldValueAfter;
  }

  /**
   * The format type of the field
   **/
  @ApiModelProperty(value = "The format type of the field")
  public FormatEnum getFormat() {
    return format;
  }
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogChange auditLogChange = (AuditLogChange) o;
    return (this.fieldName == null ? auditLogChange.fieldName == null : this.fieldName.equals(auditLogChange.fieldName)) &&
        (this.fieldValueBefore == null ? auditLogChange.fieldValueBefore == null : this.fieldValueBefore.equals(auditLogChange.fieldValueBefore)) &&
        (this.fieldValueAfter == null ? auditLogChange.fieldValueAfter == null : this.fieldValueAfter.equals(auditLogChange.fieldValueAfter)) &&
        (this.format == null ? auditLogChange.format == null : this.format.equals(auditLogChange.format));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fieldName == null ? 0: this.fieldName.hashCode());
    result = 31 * result + (this.fieldValueBefore == null ? 0: this.fieldValueBefore.hashCode());
    result = 31 * result + (this.fieldValueAfter == null ? 0: this.fieldValueAfter.hashCode());
    result = 31 * result + (this.format == null ? 0: this.format.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogChange {\n");
    
    sb.append("  fieldName: ").append(fieldName).append("\n");
    sb.append("  fieldValueBefore: ").append(fieldValueBefore).append("\n");
    sb.append("  fieldValueAfter: ").append(fieldValueAfter).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
