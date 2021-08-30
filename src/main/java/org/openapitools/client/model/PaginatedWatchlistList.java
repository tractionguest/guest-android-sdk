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
import org.openapitools.client.model.Pagination;
import org.openapitools.client.model.Watchlist;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PaginatedWatchlistList {
  
  @SerializedName("watchlists")
  private List<Watchlist> watchlists = null;
  @SerializedName("pagination")
  private Pagination pagination = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Watchlist> getWatchlists() {
    return watchlists;
  }
  public void setWatchlists(List<Watchlist> watchlists) {
    this.watchlists = watchlists;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedWatchlistList paginatedWatchlistList = (PaginatedWatchlistList) o;
    return (this.watchlists == null ? paginatedWatchlistList.watchlists == null : this.watchlists.equals(paginatedWatchlistList.watchlists)) &&
        (this.pagination == null ? paginatedWatchlistList.pagination == null : this.pagination.equals(paginatedWatchlistList.pagination));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.watchlists == null ? 0: this.watchlists.hashCode());
    result = 31 * result + (this.pagination == null ? 0: this.pagination.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedWatchlistList {\n");
    
    sb.append("  watchlists: ").append(watchlists).append("\n");
    sb.append("  pagination: ").append(pagination).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
