# RegistrationsApi

All URIs are relative to *https://us.tractionguest.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRegistration**](RegistrationsApi.md#getRegistration) | **GET** /registrations/{registration_id} | Get a Registration
[**getRegistrations**](RegistrationsApi.md#getRegistrations) | **GET** /registrations | List all Registrations



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

> PaginatedRegistrationsList getRegistrations(limit, offset, locationIds, createdBefore, createdAfter, needsConfirmation)

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
Boolean needsConfirmation = null; // Boolean | A confirmed `Registration` is one with an associated `Invite`. This filter returns those without an `Invite` when true, and those with an `Invite` when false.
try {
    PaginatedRegistrationsList result = apiInstance.getRegistrations(limit, offset, locationIds, createdBefore, createdAfter, needsConfirmation);
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
 **needsConfirmation** | **Boolean**| A confirmed &#x60;Registration&#x60; is one with an associated &#x60;Invite&#x60;. This filter returns those without an &#x60;Invite&#x60; when true, and those with an &#x60;Invite&#x60; when false. | [optional] [default to null]

### Return type

[**PaginatedRegistrationsList**](PaginatedRegistrationsList.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

