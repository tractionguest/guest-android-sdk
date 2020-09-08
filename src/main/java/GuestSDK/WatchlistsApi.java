/**
 * Traction Guest API
 * The Traction Guest API is currently under limited release to select customers as we gather and iterate on feedback.  # Getting Started If you are interested in getting early access to the API, please send us an email to [support@tractionguest.com](mailto:support@tractionguest.com).  We will also add you to our Slack channel where you can ask questions and get further help.  # Terms and Conditions Please visit: [https://tractionguest.com/tos/api/](https://tractionguest.com/tos/api/)  # Versioning This API follows [semantic versioning](https://semver.org/), which follows the `Major`.`Minor`.`Patch` format.  * The `Major` number increments when potentially incompatible changes are made. * The `Minor` number increments when backwards-compatible additions are made. * The `Patch` number increments when backwards-compatible bug-fixes are made. 
 *
 * The version of the OpenAPI document: 0.14.0
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
import org.openapitools.client.model.PaginatedWatchlistList;
import org.openapitools.client.model.Watchlist;
import org.openapitools.client.model.WatchlistCreateParams;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WatchlistsApi {
  String basePath = "https://tractionguest.ca/api/v3";
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
  * Create Watchlist
  * Create a new &#x60;Watchlist&#x60; record. Please note, every action taken against this endpoint is recorded in the audit log.
   * @param watchlistCreateParams The new &#x60;Watchlist&#x60; to create
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @return Watchlist
  */
  public Watchlist createWatchlist (WatchlistCreateParams watchlistCreateParams, String idempotencyKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = watchlistCreateParams;
    // verify the required parameter 'watchlistCreateParams' is set
    if (watchlistCreateParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistCreateParams' when calling createWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistCreateParams' when calling createWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists";

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
         return (Watchlist) ApiInvoker.deserialize(localVarResponse, "", Watchlist.class);
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
   * Create Watchlist
   * Create a new &#x60;Watchlist&#x60; record. Please note, every action taken against this endpoint is recorded in the audit log.
   * @param watchlistCreateParams The new &#x60;Watchlist&#x60; to create   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
  */
  public void createWatchlist (WatchlistCreateParams watchlistCreateParams, String idempotencyKey, final Response.Listener<Watchlist> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = watchlistCreateParams;

    // verify the required parameter 'watchlistCreateParams' is set
    if (watchlistCreateParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistCreateParams' when calling createWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistCreateParams' when calling createWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((Watchlist) ApiInvoker.deserialize(localVarResponse,  "", Watchlist.class));
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
  * Deletes a Watchlist
  * Deletes a single instance of &#x60;Watchlist&#x60;
   * @param watchlistId 
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @return void
  */
  public void deleteWatchlist (String watchlistId, String idempotencyKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling deleteWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling deleteWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
   * Deletes a Watchlist
   * Deletes a single instance of &#x60;Watchlist&#x60;
   * @param watchlistId    * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
  */
  public void deleteWatchlist (String watchlistId, String idempotencyKey, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling deleteWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling deleteWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
  * Get a Watchlist
  * Gets the details of a single instance of a &#x60;Watchlist&#x60;.
   * @param watchlistId 
   * @param include A list of comma-separated related models to include
   * @return Watchlist
  */
  public Watchlist getWatchlist (String watchlistId, String include) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling getWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling getWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
         return (Watchlist) ApiInvoker.deserialize(localVarResponse, "", Watchlist.class);
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
   * Get a Watchlist
   * Gets the details of a single instance of a &#x60;Watchlist&#x60;.
   * @param watchlistId    * @param include A list of comma-separated related models to include
  */
  public void getWatchlist (String watchlistId, String include, final Response.Listener<Watchlist> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling getWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling getWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
              responseListener.onResponse((Watchlist) ApiInvoker.deserialize(localVarResponse,  "", Watchlist.class));
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
  * List all Watchlists
  * Gets a list of all &#x60;Watchlist&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50
   * @param offset Offsets the results to a specified number, defaults to 0
   * @param query Query the results by &#x60;first_name&#x60;, &#x60;last_name&#x60;, &#x60;email&#x60;, &#x60;colour&#x60;, and &#x60;notes&#x60; all at once.
   * @param withColours A comma separated list of case-insensitive colour values. i.e., &#x60;red&#x60;, &#x60;green&#x60;, &#x60;yellow&#x60;, and &#x60;orange&#x60;
   * @param include A list of comma-separated related models to include
   * @return PaginatedWatchlistList
  */
  public PaginatedWatchlistList getWatchlists (Integer limit, Integer offset, String query, String withColours, String include) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/watchlists";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "with_colours", withColours));
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
         return (PaginatedWatchlistList) ApiInvoker.deserialize(localVarResponse, "", PaginatedWatchlistList.class);
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
   * List all Watchlists
   * Gets a list of all &#x60;Watchlist&#x60; entities.
   * @param limit Limits the results to a specified number, defaults to 50   * @param offset Offsets the results to a specified number, defaults to 0   * @param query Query the results by &#x60;first_name&#x60;, &#x60;last_name&#x60;, &#x60;email&#x60;, &#x60;colour&#x60;, and &#x60;notes&#x60; all at once.   * @param withColours A comma separated list of case-insensitive colour values. i.e., &#x60;red&#x60;, &#x60;green&#x60;, &#x60;yellow&#x60;, and &#x60;orange&#x60;   * @param include A list of comma-separated related models to include
  */
  public void getWatchlists (Integer limit, Integer offset, String query, String withColours, String include, final Response.Listener<PaginatedWatchlistList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/watchlists".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "with_colours", withColours));
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
              responseListener.onResponse((PaginatedWatchlistList) ApiInvoker.deserialize(localVarResponse,  "", PaginatedWatchlistList.class));
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
  * Update a Watchlist
  * Update an existing &#x60;Watchlist&#x60; record. Every operation against this endpoint is recorded in the audit log.
   * @param watchlistId 
   * @param watchlistCreateParams The watchlist record attributes to update
   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
   * @return Watchlist
  */
  public Watchlist updateWatchlist (String watchlistId, WatchlistCreateParams watchlistCreateParams, String idempotencyKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = watchlistCreateParams;
    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling updateWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling updateWatchlist"));
    }
    // verify the required parameter 'watchlistCreateParams' is set
    if (watchlistCreateParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistCreateParams' when calling updateWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistCreateParams' when calling updateWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
         return (Watchlist) ApiInvoker.deserialize(localVarResponse, "", Watchlist.class);
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
   * Update a Watchlist
   * Update an existing &#x60;Watchlist&#x60; record. Every operation against this endpoint is recorded in the audit log.
   * @param watchlistId    * @param watchlistCreateParams The watchlist record attributes to update   * @param idempotencyKey An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored
  */
  public void updateWatchlist (String watchlistId, WatchlistCreateParams watchlistCreateParams, String idempotencyKey, final Response.Listener<Watchlist> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = watchlistCreateParams;

    // verify the required parameter 'watchlistId' is set
    if (watchlistId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistId' when calling updateWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistId' when calling updateWatchlist"));
    }
    // verify the required parameter 'watchlistCreateParams' is set
    if (watchlistCreateParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'watchlistCreateParams' when calling updateWatchlist",
        new ApiException(400, "Missing the required parameter 'watchlistCreateParams' when calling updateWatchlist"));
    }

    // create path and map variables
    String path = "/watchlists/{watchlist_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "watchlist_id" + "\\}", apiInvoker.escapeString(watchlistId.toString()));

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
              responseListener.onResponse((Watchlist) ApiInvoker.deserialize(localVarResponse,  "", Watchlist.class));
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
