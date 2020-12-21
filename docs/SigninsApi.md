# SigninsApi

All URIs are relative to *https://tractionguest.ca/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSignin**](SigninsApi.md#createSignin) | **POST** /signins | Create Signin
[**getSignin**](SigninsApi.md#getSignin) | **GET** /signins/{signin_id} | Get a Signin
[**getSignins**](SigninsApi.md#getSignins) | **GET** /signins | List all Signins
[**updateSignin**](SigninsApi.md#updateSignin) | **PUT** /signins/{signin_id} | Update a Signin



## createSignin

> Signin createSignin(signinCreateParams)

Create Signin

Creates a Signin

### Example

```java
// Import classes:
//import GuestSDK.SigninsApi;

SigninsApi apiInstance = new SigninsApi();
SigninCreateParams signinCreateParams = new SigninCreateParams(); // SigninCreateParams | 
try {
    Signin result = apiInstance.createSignin(signinCreateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigninsApi#createSignin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signinCreateParams** | [**SigninCreateParams**](SigninCreateParams.md)|  | [optional]

### Return type

[**Signin**](Signin.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSignin

> SigninDetail getSignin(signinId, include)

Get a Signin

Gets the details of a single instance of a &#x60;Signin&#x60;.

### Example

```java
// Import classes:
//import GuestSDK.SigninsApi;

SigninsApi apiInstance = new SigninsApi();
String signinId = null; // String | 
String include = null; // String | A list of comma-separated related models to include
try {
    SigninDetail result = apiInstance.getSignin(signinId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigninsApi#getSignin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signinId** | **String**|  | [default to null]
 **include** | **String**| A list of comma-separated related models to include | [optional] [default to null]

### Return type

[**SigninDetail**](SigninDetail.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSignins

> PaginatedSigninsList getSignins(locationIds, withColours, query, withAcknowledged, withSignedIn, signinBefore, signinAfter, limit, offset, querySort, include)

List all Signins

Gets a list of all &#x60;Signin&#x60; entities.

### Example

```java
// Import classes:
//import GuestSDK.SigninsApi;

SigninsApi apiInstance = new SigninsApi();
String locationIds = null; // String | A comma separated list of Location IDs
String withColours = null; // String | A comma separated list of case-insensitive colour values. i.e., `red`, `green`, `yellow`, and `orange`
String query = null; // String | Allows you to query by `company`, `email`, `first_name`, `last_name`, and `location_name`
Boolean withAcknowledged = null; // Boolean | Filters to all those `Signin`s that have, or have not been acknowledged
Boolean withSignedIn = null; // Boolean | Filters to all `Signin`s that are, or are not currently signed out.
Date signinBefore = null; // Date | Filters results to all those *before* the provided datetime
Date signinAfter = null; // Date | Filters results to all those *after* the provided datetime
Integer limit = null; // Integer | Limits the results to a specified number, defaults to 50
Integer offset = null; // Integer | Offsets the results to a specified number, defaults to 0
String querySort = null; // String | Allows you to override ordering by most relevant results when querying
String include = null; // String | A list of comma-separated related models to include
try {
    PaginatedSigninsList result = apiInstance.getSignins(locationIds, withColours, query, withAcknowledged, withSignedIn, signinBefore, signinAfter, limit, offset, querySort, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigninsApi#getSignins");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationIds** | **String**| A comma separated list of Location IDs | [optional] [default to null]
 **withColours** | **String**| A comma separated list of case-insensitive colour values. i.e., &#x60;red&#x60;, &#x60;green&#x60;, &#x60;yellow&#x60;, and &#x60;orange&#x60; | [optional] [default to null]
 **query** | **String**| Allows you to query by &#x60;company&#x60;, &#x60;email&#x60;, &#x60;first_name&#x60;, &#x60;last_name&#x60;, and &#x60;location_name&#x60; | [optional] [default to null]
 **withAcknowledged** | **Boolean**| Filters to all those &#x60;Signin&#x60;s that have, or have not been acknowledged | [optional] [default to null]
 **withSignedIn** | **Boolean**| Filters to all &#x60;Signin&#x60;s that are, or are not currently signed out. | [optional] [default to null]
 **signinBefore** | **Date**| Filters results to all those *before* the provided datetime | [optional] [default to null]
 **signinAfter** | **Date**| Filters results to all those *after* the provided datetime | [optional] [default to null]
 **limit** | **Integer**| Limits the results to a specified number, defaults to 50 | [optional] [default to null]
 **offset** | **Integer**| Offsets the results to a specified number, defaults to 0 | [optional] [default to null]
 **querySort** | **String**| Allows you to override ordering by most relevant results when querying | [optional] [default to null] [enum: signin_timestamp_desc, signin_timestamp_asc]
 **include** | **String**| A list of comma-separated related models to include | [optional] [default to null]

### Return type

[**PaginatedSigninsList**](PaginatedSigninsList.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateSignin

> Object updateSignin(signinId, signinUpdateParams, idempotencyKey)

Update a Signin

Update, acknowledge, or &#x60;Signout&#x60; a &#x60;Signin&#x60;

### Example

```java
// Import classes:
//import GuestSDK.SigninsApi;

SigninsApi apiInstance = new SigninsApi();
String signinId = null; // String | 
SigninUpdateParams signinUpdateParams = new SigninUpdateParams(); // SigninUpdateParams | 
String idempotencyKey = null; // String | An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it's submitted. We store idempotency keys for only 24 hours. Any `Idempotency-Key` shorter than 10 characters will be ignored
try {
    Object result = apiInstance.updateSignin(signinId, signinUpdateParams, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigninsApi#updateSignin");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signinId** | **String**|  | [default to null]
 **signinUpdateParams** | [**SigninUpdateParams**](SigninUpdateParams.md)|  |
 **idempotencyKey** | **String**| An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored | [optional] [default to null]

### Return type

**Object**

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

