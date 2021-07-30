/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.16.0
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

import org.openapitools.client.model.ErrorsList;
import org.openapitools.client.model.GroupVisit;
import org.openapitools.client.model.GroupVisitCreateParams;
import org.openapitools.client.model.GroupVisitUpdateParams;
import org.openapitools.client.model.PaginatedGroupVisitsList;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GroupVisitsApi {
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
  * Create a new Group Visit (Appointment)
  * Creates a &#x60;GroupVisit&#x60; (Appointment)
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @param groupVisitCreateParams 
   * @return GroupVisit
  */
  public GroupVisit createGroupVisit (String idempotencyKey, GroupVisitCreateParams groupVisitCreateParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupVisitCreateParams;

    // create path and map variables
    String path = "/group_visits";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));
    String[] contentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GroupVisit) ApiInvoker.deserialize(localVarResponse, "", GroupVisit.class);
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
   * Create a new Group Visit (Appointment)
   * Creates a &#x60;GroupVisit&#x60; (Appointment)
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored   * @param groupVisitCreateParams 
  */
  public void createGroupVisit (String idempotencyKey, GroupVisitCreateParams groupVisitCreateParams, final Response.Listener<GroupVisit> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupVisitCreateParams;


    // create path and map variables
    String path = "/group_visits".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));

    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GroupVisit) ApiInvoker.deserialize(localVarResponse,  "", GroupVisit.class));
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
  * Delete a Group Visit (Appointment)
  * Deletes a single instance of &#x60;GroupVisit&#x60; (Appointment).
   * @param groupVisitId 
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @return void
  */
  public void deleteGroupVisit (String groupVisitId, String idempotencyKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling deleteGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling deleteGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
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
   * Delete a Group Visit (Appointment)
   * Deletes a single instance of &#x60;GroupVisit&#x60; (Appointment).
   * @param groupVisitId    * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
  */
  public void deleteGroupVisit (String groupVisitId, String idempotencyKey, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling deleteGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling deleteGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));

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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
  * Get a Group Visit (Appointment)
  * Gets the details of a single instance of a &#x60;GroupVisit&#x60;.
   * @param groupVisitId 
   * @return GroupVisit
  */
  public GroupVisit getGroupVisit (String groupVisitId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling getGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling getGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

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
         return (GroupVisit) ApiInvoker.deserialize(localVarResponse, "", GroupVisit.class);
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
   * Get a Group Visit (Appointment)
   * Gets the details of a single instance of a &#x60;GroupVisit&#x60;.
   * @param groupVisitId 
  */
  public void getGroupVisit (String groupVisitId, final Response.Listener<GroupVisit> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling getGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling getGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

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
              responseListener.onResponse((GroupVisit) ApiInvoker.deserialize(localVarResponse,  "", GroupVisit.class));
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
  * List all Group Visits (Appointments)
  * Gets a list of all &#x60;GroupVisit&#x60; entities (Appointments).
   * @param limit Limits the results to a specified number. Defaults to 50.
   * @param offset Offsets the results to a specified number. Defaults to 0.
   * @param locationIds A comma-separated string of locations IDs, to only show group visits (appointments) from those locations.
   * @param sortWith A combination of attribute and direction, joined with an underscore, for sorting. Valid attributes are: &#x60;created_at&#x60;, &#x60;updated_at&#x60;, &#x60;name&#x60;, and &#x60;start_time&#x60;. Valid directions are &#x60;asc&#x60; and &#x60;desc&#x60;. E.g., &#x60;name_desc&#x60;, &#x60;start_time_asc&#x60;.
   * @return PaginatedGroupVisitsList
  */
  public PaginatedGroupVisitsList getGroupVisits (String limit, String offset, String locationIds, String sortWith) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/group_visits";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort_with", sortWith));
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
         return (PaginatedGroupVisitsList) ApiInvoker.deserialize(localVarResponse, "", PaginatedGroupVisitsList.class);
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
   * List all Group Visits (Appointments)
   * Gets a list of all &#x60;GroupVisit&#x60; entities (Appointments).
   * @param limit Limits the results to a specified number. Defaults to 50.   * @param offset Offsets the results to a specified number. Defaults to 0.   * @param locationIds A comma-separated string of locations IDs, to only show group visits (appointments) from those locations.   * @param sortWith A combination of attribute and direction, joined with an underscore, for sorting. Valid attributes are: &#x60;created_at&#x60;, &#x60;updated_at&#x60;, &#x60;name&#x60;, and &#x60;start_time&#x60;. Valid directions are &#x60;asc&#x60; and &#x60;desc&#x60;. E.g., &#x60;name_desc&#x60;, &#x60;start_time_asc&#x60;.
  */
  public void getGroupVisits (String limit, String offset, String locationIds, String sortWith, final Response.Listener<PaginatedGroupVisitsList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/group_visits".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort_with", sortWith));


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
              responseListener.onResponse((PaginatedGroupVisitsList) ApiInvoker.deserialize(localVarResponse,  "", PaginatedGroupVisitsList.class));
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
  * Update a Group Visit (Appointment)
  * Updates an existing &#x60;GroupVisit&#x60; (Appointment).
   * @param groupVisitId 
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @param groupVisitUpdateParams 
   * @return GroupVisit
  */
  public GroupVisit updateGroupVisit (String groupVisitId, String idempotencyKey, GroupVisitUpdateParams groupVisitUpdateParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupVisitUpdateParams;
    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling updateGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling updateGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));
    String[] contentTypes = {
      "application/json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GroupVisit) ApiInvoker.deserialize(localVarResponse, "", GroupVisit.class);
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
   * Update a Group Visit (Appointment)
   * Updates an existing &#x60;GroupVisit&#x60; (Appointment).
   * @param groupVisitId    * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored   * @param groupVisitUpdateParams 
  */
  public void updateGroupVisit (String groupVisitId, String idempotencyKey, GroupVisitUpdateParams groupVisitUpdateParams, final Response.Listener<GroupVisit> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupVisitUpdateParams;

    // verify the required parameter 'groupVisitId' is set
    if (groupVisitId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupVisitId' when calling updateGroupVisit",
        new ApiException(400, "Missing the required parameter 'groupVisitId' when calling updateGroupVisit"));
    }

    // create path and map variables
    String path = "/group_visits/{group_visit_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "group_visit_id" + "\\}", apiInvoker.escapeString(groupVisitId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Idempotency-Key", ApiInvoker.parameterToString(idempotencyKey));

    String[] contentTypes = {
      "application/json"
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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GroupVisit) ApiInvoker.deserialize(localVarResponse,  "", GroupVisit.class));
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
