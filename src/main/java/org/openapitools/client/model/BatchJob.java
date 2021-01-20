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

import org.openapitools.client.model.User;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The root of the BatchJob&#39;s schema.
 **/
@ApiModel(description = "The root of the BatchJob's schema.")
public class BatchJob {
  
  @SerializedName("bid")
  private String bid = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("total_records")
  private Integer totalRecords = null;
  @SerializedName("worker_name")
  private String workerName = null;
  @SerializedName("user")
  private User user = null;
  @SerializedName("pending")
  private Integer pending = null;
  @SerializedName("completed")
  private Integer completed = null;
  @SerializedName("failed")
  private Integer failed = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBid() {
    return bid;
  }
  public void setBid(String bid) {
    this.bid = bid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWorkerName() {
    return workerName;
  }
  public void setWorkerName(String workerName) {
    this.workerName = workerName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPending() {
    return pending;
  }
  public void setPending(Integer pending) {
    this.pending = pending;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCompleted() {
    return completed;
  }
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFailed() {
    return failed;
  }
  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchJob batchJob = (BatchJob) o;
    return (this.bid == null ? batchJob.bid == null : this.bid.equals(batchJob.bid)) &&
        (this.createdAt == null ? batchJob.createdAt == null : this.createdAt.equals(batchJob.createdAt)) &&
        (this.status == null ? batchJob.status == null : this.status.equals(batchJob.status)) &&
        (this.totalRecords == null ? batchJob.totalRecords == null : this.totalRecords.equals(batchJob.totalRecords)) &&
        (this.workerName == null ? batchJob.workerName == null : this.workerName.equals(batchJob.workerName)) &&
        (this.user == null ? batchJob.user == null : this.user.equals(batchJob.user)) &&
        (this.pending == null ? batchJob.pending == null : this.pending.equals(batchJob.pending)) &&
        (this.completed == null ? batchJob.completed == null : this.completed.equals(batchJob.completed)) &&
        (this.failed == null ? batchJob.failed == null : this.failed.equals(batchJob.failed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bid == null ? 0: this.bid.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.totalRecords == null ? 0: this.totalRecords.hashCode());
    result = 31 * result + (this.workerName == null ? 0: this.workerName.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.pending == null ? 0: this.pending.hashCode());
    result = 31 * result + (this.completed == null ? 0: this.completed.hashCode());
    result = 31 * result + (this.failed == null ? 0: this.failed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchJob {\n");
    
    sb.append("  bid: ").append(bid).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  totalRecords: ").append(totalRecords).append("\n");
    sb.append("  workerName: ").append(workerName).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  pending: ").append(pending).append("\n");
    sb.append("  completed: ").append(completed).append("\n");
    sb.append("  failed: ").append(failed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
