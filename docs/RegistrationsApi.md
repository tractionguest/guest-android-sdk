# RegistrationsApi

All URIs are relative to *https://tractionguest.ca/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistrationSignout**](RegistrationsApi.md#createRegistrationSignout) | **POST** /registrations/{registration_id}/signouts | 
[**getRegistration**](RegistrationsApi.md#getRegistration) | **GET** /registrations/{registration_id} | Get a Registration
[**getRegistrations**](RegistrationsApi.md#getRegistrations) | **GET** /registrations | List all Registrations



## createRegistrationSignout

> SigninDetail createRegistrationSignout(registrationId, idempotencyKey)



Signs out the last &#x60;Signin&#x60; on a &#x60;Registration&#x60;. Returns the &#x60;SigninDetail&#x60; that was signed out, if the sign out is successful.

### Example

```java
// Import classes:
//import GuestSDK.RegistrationsApi;

RegistrationsApi apiInstance = new RegistrationsApi();
String registrationId = null; // String | 
String idempotencyKey = null; // String | An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it's submitted. We store idempotency keys for only 24 hours. Any `Idempotency-Key` shorter than 10 characters will be ignored
try {
    SigninDetail result = apiInstance.createRegistrationSignout(registrationId, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#createRegistrationSignout");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**|  | [default to null]
 **idempotencyKey** | **String**| An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored | [optional] [default to null]

### Return type

[**SigninDetail**](SigninDetail.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRegistration

> RegistrationDetail getRegistration(registrationId, include)

Get a Registration

Gets the details of a single instance of a &#x60;Registration&#x60;

### Example

```java
// Import classes:
//import GuestSDK.RegistrationsApi;

RegistrationsApi apiInstance = new RegistrationsApi();
String registrationId = null; // String | 
String include = null; // String | A list of comma-separated related models to include
try {
    RegistrationDetail result = apiInstance.getRegistration(registrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#getRegistration");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**|  | [default to null]
 **include** | **String**| A list of comma-separated related models to include | [optional] [default to null]

### Return type

[**RegistrationDetail**](RegistrationDetail.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRegistrations

> PaginatedRegistrationsList getRegistrations(limit, offset, locationIds, createdBefore, createdAfter)

List all Registrations

Gets a list of all &#x60;Registration&#x60; entities.

### Example

```java
// Import classes:
//import GuestSDK.RegistrationsApi;

RegistrationsApi apiInstance = new RegistrationsApi();
Integer limit = null; // Integer | Limits the results to a specified number, defaults to 50
Integer offset = null; // Integer | Offsets the results to a specified number, defaults to 0
String locationIds = null; // String | A comma separated list of Location IDs
String createdBefore = null; // String | Restricts results to only those that were created before the provided date
String createdAfter = null; // String | Restricts results to only those that were created after the provided date
try {
    PaginatedRegistrationsList result = apiInstance.getRegistrations(limit, offset, locationIds, createdBefore, createdAfter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationsApi#getRegistrations");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the results to a specified number, defaults to 50 | [optional] [default to null]
 **offset** | **Integer**| Offsets the results to a specified number, defaults to 0 | [optional] [default to null]
 **locationIds** | **String**| A comma separated list of Location IDs | [optional] [default to null]
 **createdBefore** | **String**| Restricts results to only those that were created before the provided date | [optional] [default to null]
 **createdAfter** | **String**| Restricts results to only those that were created after the provided date | [optional] [default to null]

### Return type

[**PaginatedRegistrationsList**](PaginatedRegistrationsList.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

