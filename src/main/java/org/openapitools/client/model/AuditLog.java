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
import org.openapitools.client.model.AuditLogChange;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the AuditLog type&#39;s schema.
 **/
@ApiModel(description = "The root of the AuditLog type's schema.")
public class AuditLog {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("request_uuid")
  private String requestUuid = null;
  @SerializedName("remote_address")
  private String remoteAddress = null;
  @SerializedName("comment")
  private String comment = null;
  @SerializedName("version")
  private Integer version = null;
  @SerializedName("audited_changes")
  private List<AuditLogChange> auditedChanges = null;
  @SerializedName("action")
  private String action = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("auditable_type")
  private String auditableType = null;
  @SerializedName("auditable_id")
  private Integer auditableId = null;

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getRequestUuid() {
    return requestUuid;
  }
  public void setRequestUuid(String requestUuid) {
    this.requestUuid = requestUuid;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }
  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AuditLogChange> getAuditedChanges() {
    return auditedChanges;
  }
  public void setAuditedChanges(List<AuditLogChange> auditedChanges) {
    this.auditedChanges = auditedChanges;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAuditableType() {
    return auditableType;
  }
  public void setAuditableType(String auditableType) {
    this.auditableType = auditableType;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getAuditableId() {
    return auditableId;
  }
  public void setAuditableId(Integer auditableId) {
    this.auditableId = auditableId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return (this.id == null ? auditLog.id == null : this.id.equals(auditLog.id)) &&
        (this.createdAt == null ? auditLog.createdAt == null : this.createdAt.equals(auditLog.createdAt)) &&
        (this.requestUuid == null ? auditLog.requestUuid == null : this.requestUuid.equals(auditLog.requestUuid)) &&
        (this.remoteAddress == null ? auditLog.remoteAddress == null : this.remoteAddress.equals(auditLog.remoteAddress)) &&
        (this.comment == null ? auditLog.comment == null : this.comment.equals(auditLog.comment)) &&
        (this.version == null ? auditLog.version == null : this.version.equals(auditLog.version)) &&
        (this.auditedChanges == null ? auditLog.auditedChanges == null : this.auditedChanges.equals(auditLog.auditedChanges)) &&
        (this.action == null ? auditLog.action == null : this.action.equals(auditLog.action)) &&
        (this.username == null ? auditLog.username == null : this.username.equals(auditLog.username)) &&
        (this.userId == null ? auditLog.userId == null : this.userId.equals(auditLog.userId)) &&
        (this.auditableType == null ? auditLog.auditableType == null : this.auditableType.equals(auditLog.auditableType)) &&
        (this.auditableId == null ? auditLog.auditableId == null : this.auditableId.equals(auditLog.auditableId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.requestUuid == null ? 0: this.requestUuid.hashCode());
    result = 31 * result + (this.remoteAddress == null ? 0: this.remoteAddress.hashCode());
    result = 31 * result + (this.comment == null ? 0: this.comment.hashCode());
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    result = 31 * result + (this.auditedChanges == null ? 0: this.auditedChanges.hashCode());
    result = 31 * result + (this.action == null ? 0: this.action.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.auditableType == null ? 0: this.auditableType.hashCode());
    result = 31 * result + (this.auditableId == null ? 0: this.auditableId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  requestUuid: ").append(requestUuid).append("\n");
    sb.append("  remoteAddress: ").append(remoteAddress).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  auditedChanges: ").append(auditedChanges).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  auditableType: ").append(auditableType).append("\n");
    sb.append("  auditableId: ").append(auditableId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
