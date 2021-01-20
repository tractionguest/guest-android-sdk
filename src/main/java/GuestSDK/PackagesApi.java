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

package GuestSDK;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.ErrorsList;
import org.openapitools.client.model.ModelPackage;
import org.openapitools.client.model.PackageCreateParams;
import org.openapitools.client.model.PackageUpdateParams;
import org.openapitools.client.model.PaginatedPackagesList;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PackagesApi {
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
  * Create package
  * Creates a [Package] entity by extracting information about the recipient and carrier from the given image file.
   * @param packageCreateParams Parameters for creating a package
   * @return ModelPackage
  */
  public ModelPackage createPackage (PackageCreateParams packageCreateParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = packageCreateParams;

    // create path and map variables
    String path = "/packages";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
         return (ModelPackage) ApiInvoker.deserialize(localVarResponse, "", ModelPackage.class);
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
   * Create package
   * Creates a [Package] entity by extracting information about the recipient and carrier from the given image file.
   * @param packageCreateParams Parameters for creating a package
  */
  public void createPackage (PackageCreateParams packageCreateParams, final Response.Listener<ModelPackage> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = packageCreateParams;


    // create path and map variables
    String path = "/packages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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
              responseListener.onResponse((ModelPackage) ApiInvoker.deserialize(localVarResponse,  "", ModelPackage.class));
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
  * 
  * Delete a pacakge
   * @param packageId 
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @return void
  */
  public void deletePackage (String packageId, String idempotencyKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling deletePackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling deletePackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
   * 
   * Delete a pacakge
   * @param packageId    * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
  */
  public void deletePackage (String packageId, String idempotencyKey, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling deletePackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling deletePackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
  * Get Package
  * Gets the details of a single instance of a Package
   * @param packageId 
   * @param include A list of comma-separated related models to include 
   * @return ModelPackage
  */
  public ModelPackage getPackage (String packageId, String include) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling getPackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling getPackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
         return (ModelPackage) ApiInvoker.deserialize(localVarResponse, "", ModelPackage.class);
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
   * Get Package
   * Gets the details of a single instance of a Package
   * @param packageId    * @param include A list of comma-separated related models to include 
  */
  public void getPackage (String packageId, String include, final Response.Listener<ModelPackage> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling getPackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling getPackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
              responseListener.onResponse((ModelPackage) ApiInvoker.deserialize(localVarResponse,  "", ModelPackage.class));
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
  * Get packages
  * Gets a list of [Package] entities.
   * @param locationIds A comma separated list of Location ids for filtering. i.e. &#39;1,2,3&#39; Will return all packages from all locations if none are specified
   * @param limit Limits the results to a specified number, defaults to 50
   * @param offset Offsets the results to a specified number, defaults to 0
   * @param include A list of comma-separated related models to include. Possible values: &#39;recipient&#39;, &#39;location&#39;, &#39;image&#39;
   * @param pickedUp Filters packages by their \&quot;picked_up\&quot; state..
   * @param query Searches for packages by recipient name
   * @return PaginatedPackagesList
  */
  public PaginatedPackagesList getPackages (String locationIds, Integer limit, Integer offset, String include, Boolean pickedUp, String query) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/packages";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "picked_up", pickedUp));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
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
         return (PaginatedPackagesList) ApiInvoker.deserialize(localVarResponse, "", PaginatedPackagesList.class);
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
   * Get packages
   * Gets a list of [Package] entities.
   * @param locationIds A comma separated list of Location ids for filtering. i.e. &#39;1,2,3&#39; Will return all packages from all locations if none are specified   * @param limit Limits the results to a specified number, defaults to 50   * @param offset Offsets the results to a specified number, defaults to 0   * @param include A list of comma-separated related models to include. Possible values: &#39;recipient&#39;, &#39;location&#39;, &#39;image&#39;   * @param pickedUp Filters packages by their \&quot;picked_up\&quot; state..   * @param query Searches for packages by recipient name
  */
  public void getPackages (String locationIds, Integer limit, Integer offset, String include, Boolean pickedUp, String query, final Response.Listener<PaginatedPackagesList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/packages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "location_ids", locationIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "picked_up", pickedUp));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));


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
              responseListener.onResponse((PaginatedPackagesList) ApiInvoker.deserialize(localVarResponse,  "", PaginatedPackagesList.class));
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
  * Update Package
  * Update/Edit information about a Package.  picked_up - changes the package_state to picked up and assigns non null value to picked_up_at  recipient_id - update the package&#39;s intended recipient. Changes package_state to &#39;recipient_matched&#39; if a match hasn&#39;t been found and notifies host about their package via email. A previous recipient will stop getting notifications  carrier_name - change/update the package&#39;s carrier/courier information    
   * @param packageId 
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @param packageUpdateParams 
   * @return ModelPackage
  */
  public ModelPackage updatePackage (String packageId, String idempotencyKey, PackageUpdateParams packageUpdateParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = packageUpdateParams;
    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling updatePackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling updatePackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
         return (ModelPackage) ApiInvoker.deserialize(localVarResponse, "", ModelPackage.class);
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
   * Update Package
   * Update/Edit information about a Package.  picked_up - changes the package_state to picked up and assigns non null value to picked_up_at  recipient_id - update the package&#39;s intended recipient. Changes package_state to &#39;recipient_matched&#39; if a match hasn&#39;t been found and notifies host about their package via email. A previous recipient will stop getting notifications  carrier_name - change/update the package&#39;s carrier/courier information    
   * @param packageId    * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored   * @param packageUpdateParams 
  */
  public void updatePackage (String packageId, String idempotencyKey, PackageUpdateParams packageUpdateParams, final Response.Listener<ModelPackage> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = packageUpdateParams;

    // verify the required parameter 'packageId' is set
    if (packageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageId' when calling updatePackage",
        new ApiException(400, "Missing the required parameter 'packageId' when calling updatePackage"));
    }

    // create path and map variables
    String path = "/packages/{package_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "package_id" + "\\}", apiInvoker.escapeString(packageId.toString()));

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
              responseListener.onResponse((ModelPackage) ApiInvoker.deserialize(localVarResponse,  "", ModelPackage.class));
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
