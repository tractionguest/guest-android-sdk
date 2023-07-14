/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.18.0
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
import org.openapitools.client.model.PaginatedRegistrationsList;
import org.openapitools.client.model.RegistrationDetail;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class RegistrationsApi {
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
  * Get a Registration
  * Gets the details of a single instance of a &#x60;Registration&#x60;
   * @param registrationId 
   * @param include A list of comma-separated related models to include
   * @return RegistrationDetail
  */
  public RegistrationDetail getRegistration (String registrationId, String include) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'registrationId' when calling getRegistration",
        new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistration"));
    }

    // create path and map variables
    String path = "/registrations/{registration_id}".replaceAll("\\{" + "registration_id" + "\\}", apiInvoker.escapeString(registrationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));
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
         return (RegistrationDetail) ApiInvoker.deserialize(localVarResponse, "", RegistrationDetail.class);
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
   * Get a Registration
   * Gets the details of a single instance of a &#x60;Registration&#x60;
   * @param registrationId    * @param include A list of comma-separated related models to include
  */
  public void getRegistration (String registrationId, String include, final Response.Listener<RegistrationDetail> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'registrationId' when calling getRegistration",
        new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistration"));
    }

    // create path and map variables
    String path = "/registrations/{registration_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "registration_id" + "\\}", apiInvoker.escapeString(registrationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));


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
              responseListener.onResponse((RegistrationDetail) ApiInvoker.deserialize(localVarResponse,  "", RegistrationDetail.class));
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
  * List all Registrations
  * Gets a list of all &#x60;Registration&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50
   * @param offset Offsets the results to a specified number, defaults to 0
   * @param locationIds A comma separated list of Location IDs
   * @param createdBefore Restricts results to only those that were created before the provided date
   * @param createdAfter Restricts results to only those that were created after the provided date
   * @param needsConfirmation A confirmed &#x60;Registration&#x60; is one with an associated &#x60;Invite&#x60;. This filter returns those without an &#x60;Invite&#x60; when true, and those with an &#x60;Invite&#x60; when false.
   * @return PaginatedRegistrationsList
  */
  public PaginatedRegistrationsList getRegistrations (Integer limit, Integer offset, String locationIds, String createdBefore, String createdAfter, Boolean needsConfirmation) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/registrations";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "created_before", createdBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "created_after", createdAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "needs_confirmation", needsConfirmation));
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
         return (PaginatedRegistrationsList) ApiInvoker.deserialize(localVarResponse, "", PaginatedRegistrationsList.class);
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
   * List all Registrations
   * Gets a list of all &#x60;Registration&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50   * @param offset Offsets the results to a specified number, defaults to 0   * @param locationIds A comma separated list of Location IDs   * @param createdBefore Restricts results to only those that were created before the provided date   * @param createdAfter Restricts results to only those that were created after the provided date   * @param needsConfirmation A confirmed &#x60;Registration&#x60; is one with an associated &#x60;Invite&#x60;. This filter returns those without an &#x60;Invite&#x60; when true, and those with an &#x60;Invite&#x60; when false.
  */
  public void getRegistrations (Integer limit, Integer offset, String locationIds, String createdBefore, String createdAfter, Boolean needsConfirmation, final Response.Listener<PaginatedRegistrationsList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/registrations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "created_before", createdBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "created_after", createdAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "needs_confirmation", needsConfirmation));


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
              responseListener.onResponse((PaginatedRegistrationsList) ApiInvoker.deserialize(localVarResponse,  "", PaginatedRegistrationsList.class));
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
