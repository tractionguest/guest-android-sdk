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

package GuestSDK;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.AuditLog;
import org.openapitools.client.model.ErrorsList;
import org.openapitools.client.model.PaginatedAuditLogsList;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AuditLogsApi {
  String basePath = "https://us.tractionguest.com/api/v3";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get an AuditLog
  * Gets the details of a single instance of an &#x60;AuditLog&#x60;.
   * @param auditLogId 
   * @return AuditLog
  */
  public AuditLog getAuditLog (String auditLogId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'auditLogId' is set
    if (auditLogId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'auditLogId' when calling getAuditLog",
        new ApiException(400, "Missing the required parameter 'auditLogId' when calling getAuditLog"));
    }

    // create path and map variables
    String path = "/audit_logs/{audit_log_id}".replaceAll("\\{" + "audit_log_id" + "\\}", apiInvoker.escapeString(auditLogId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "TractionGuestAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (AuditLog) ApiInvoker.deserialize(localVarResponse, "", AuditLog.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get an AuditLog
   * Gets the details of a single instance of an &#x60;AuditLog&#x60;.
   * @param auditLogId 
  */
  public void getAuditLog (String auditLogId, final Response.Listener<AuditLog> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'auditLogId' is set
    if (auditLogId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'auditLogId' when calling getAuditLog",
        new ApiException(400, "Missing the required parameter 'auditLogId' when calling getAuditLog"));
    }

    // create path and map variables
    String path = "/audit_logs/{audit_log_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "audit_log_id" + "\\}", apiInvoker.escapeString(auditLogId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "TractionGuestAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AuditLog) ApiInvoker.deserialize(localVarResponse,  "", AuditLog.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * List all AuditLogs
  * Gets a list of all &#x60;AuditLog&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50
   * @param offset Offsets the results to a specified number, defaults to 0
   * @param sortBy Sorts by the field name and direction provided where the pattern is &#x60;FIELD_NAME_DIRECTION&#x60;
   * @param auditableId The unique ID of a model that has associated audit logs
   * @param auditableType The name of the model that has associated audit logs. Valid values include: - &#x60;user&#x60; - &#x60;device_configuration&#x60; - &#x60;signin&#x60; - &#x60;invite&#x60; - &#x60;watchlist_record&#x60; - &#x60;account_preference&#x60; - &#x60;signout&#x60; - &#x60;host&#x60; - &#x60;invite_watchlist&#x60; - &#x60;location_preference&#x60; - &#x60;parking_lot&#x60; - &#x60;parking_stall&#x60; - &#x60;permission_bundle&#x60; - &#x60;person&#x60; - &#x60;physical_access_grant&#x60; - &#x60;physical_access_provider&#x60; - &#x60;physical_access_rule&#x60; - &#x60;security_badge_type&#x60; - &#x60;signin_watchlist&#x60; - &#x60;user_group_physical_access_rule&#x60; - &#x60;visitor&#x60; - &#x60;bulk_data_batch&#x60; 
   * @param actionType The action performed by the user. Valid values include: - &#x60;create&#x60; - &#x60;update&#x60; - &#x60;destroy&#x60; 
   * @param userId The ID of the user who performed the database change
   * @return PaginatedAuditLogsList
  */
  public PaginatedAuditLogsList getAuditLogs (Integer limit, Integer offset, String sortBy, Integer auditableId, String auditableType, String actionType, Integer userId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/audit_logs";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort_by", sortBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "auditable_id", auditableId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "auditable_type", auditableType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action_type", actionType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "user_id", userId));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "TractionGuestAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PaginatedAuditLogsList) ApiInvoker.deserialize(localVarResponse, "", PaginatedAuditLogsList.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * List all AuditLogs
   * Gets a list of all &#x60;AuditLog&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50   * @param offset Offsets the results to a specified number, defaults to 0   * @param sortBy Sorts by the field name and direction provided where the pattern is &#x60;FIELD_NAME_DIRECTION&#x60;   * @param auditableId The unique ID of a model that has associated audit logs   * @param auditableType The name of the model that has associated audit logs. Valid values include: - &#x60;user&#x60; - &#x60;device_configuration&#x60; - &#x60;signin&#x60; - &#x60;invite&#x60; - &#x60;watchlist_record&#x60; - &#x60;account_preference&#x60; - &#x60;signout&#x60; - &#x60;host&#x60; - &#x60;invite_watchlist&#x60; - &#x60;location_preference&#x60; - &#x60;parking_lot&#x60; - &#x60;parking_stall&#x60; - &#x60;permission_bundle&#x60; - &#x60;person&#x60; - &#x60;physical_access_grant&#x60; - &#x60;physical_access_provider&#x60; - &#x60;physical_access_rule&#x60; - &#x60;security_badge_type&#x60; - &#x60;signin_watchlist&#x60; - &#x60;user_group_physical_access_rule&#x60; - &#x60;visitor&#x60; - &#x60;bulk_data_batch&#x60;    * @param actionType The action performed by the user. Valid values include: - &#x60;create&#x60; - &#x60;update&#x60; - &#x60;destroy&#x60;    * @param userId The ID of the user who performed the database change
  */
  public void getAuditLogs (Integer limit, Integer offset, String sortBy, Integer auditableId, String auditableType, String actionType, Integer userId, final Response.Listener<PaginatedAuditLogsList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/audit_logs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort_by", sortBy));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "auditable_id", auditableId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "auditable_type", auditableType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "action_type", actionType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "user_id", userId));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "TractionGuestAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PaginatedAuditLogsList) ApiInvoker.deserialize(localVarResponse,  "", PaginatedAuditLogsList.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
