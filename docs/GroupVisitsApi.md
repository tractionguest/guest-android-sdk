# GroupVisitsApi

All URIs are relative to *https://tractionguest.ca/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupVisit**](GroupVisitsApi.md#createGroupVisit) | **POST** /group_visits | Create a new Group Visit (Appointment)
[**deleteGroupVisit**](GroupVisitsApi.md#deleteGroupVisit) | **DELETE** /group_visits/{group_visit_id} | Delete a Group Visit (Appointment)
[**getGroupVisit**](GroupVisitsApi.md#getGroupVisit) | **GET** /group_visits/{group_visit_id} | Get a Group Visit (Appointment)
[**getGroupVisits**](GroupVisitsApi.md#getGroupVisits) | **GET** /group_visits | List all Group Visits (Appointments)
[**updateGroupVisit**](GroupVisitsApi.md#updateGroupVisit) | **PUT** /group_visits/{group_visit_id} | Update a Group Visit (Appointment)



## createGroupVisit

> GroupVisit createGroupVisit(idempotencyKey, groupVisitCreateParams)

Create a new Group Visit (Appointment)

Creates a &#x60;GroupVisit&#x60; (Appointment)

### Example

```java
// Import classes:
//import GuestSDK.GroupVisitsApi;

GroupVisitsApi apiInstance = new GroupVisitsApi();
String idempotencyKey = null; // String | An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it's submitted. We store idempotency keys for only 24 hours. Any `Idempotency-Key` shorter than 10 characters will be ignored
GroupVisitCreateParams groupVisitCreateParams = new GroupVisitCreateParams(); // GroupVisitCreateParams | 
try {
    GroupVisit result = apiInstance.createGroupVisit(idempotencyKey, groupVisitCreateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupVisitsApi#createGroupVisit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **String**| An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored | [optional] [default to null]
 **groupVisitCreateParams** | [**GroupVisitCreateParams**](GroupVisitCreateParams.md)|  | [optional]

### Return type

[**GroupVisit**](GroupVisit.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteGroupVisit

> deleteGroupVisit(groupVisitId, idempotencyKey)

Delete a Group Visit (Appointment)

Deletes a single instance of &#x60;GroupVisit&#x60; (Appointment).

### Example

```java
// Import classes:
//import GuestSDK.GroupVisitsApi;

GroupVisitsApi apiInstance = new GroupVisitsApi();
String groupVisitId = null; // String | 
String idempotencyKey = null; // String | An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it's submitted. We store idempotency keys for only 24 hours. Any `Idempotency-Key` shorter than 10 characters will be ignored
try {
    apiInstance.deleteGroupVisit(groupVisitId, idempotencyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupVisitsApi#deleteGroupVisit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupVisitId** | **String**|  | [default to null]
 **idempotencyKey** | **String**| An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getGroupVisit

> GroupVisit getGroupVisit(groupVisitId)

Get a Group Visit (Appointment)

Gets the details of a single instance of a &#x60;GroupVisit&#x60;.

### Example

```java
// Import classes:
//import GuestSDK.GroupVisitsApi;

GroupVisitsApi apiInstance = new GroupVisitsApi();
String groupVisitId = null; // String | 
try {
    GroupVisit result = apiInstance.getGroupVisit(groupVisitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupVisitsApi#getGroupVisit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupVisitId** | **String**|  | [default to null]

### Return type

[**GroupVisit**](GroupVisit.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGroupVisits

> PaginatedGroupVisitsList getGroupVisits(limit, offset, locationIds, sortWith)

List all Group Visits (Appointments)

Gets a list of all &#x60;GroupVisit&#x60; entities (Appointments).

### Example

```java
// Import classes:
//import GuestSDK.GroupVisitsApi;

GroupVisitsApi apiInstance = new GroupVisitsApi();
String limit = null; // String | Limits the results to a specified number. Defaults to 50.
String offset = null; // String | Offsets the results to a specified number. Defaults to 0.
String locationIds = null; // String | A comma-separated string of locations IDs, to only show group visits (appointments) from those locations.
String sortWith = null; // String | A combination of attribute and direction, joined with an underscore, for sorting. Valid attributes are: `created_at`, `updated_at`, `name`, and `start_time`. Valid directions are `asc` and `desc`. E.g., `name_desc`, `start_time_asc`.
try {
    PaginatedGroupVisitsList result = apiInstance.getGroupVisits(limit, offset, locationIds, sortWith);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupVisitsApi#getGroupVisits");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| Limits the results to a specified number. Defaults to 50. | [optional] [default to null]
 **offset** | **String**| Offsets the results to a specified number. Defaults to 0. | [optional] [default to null]
 **locationIds** | **String**| A comma-separated string of locations IDs, to only show group visits (appointments) from those locations. | [optional] [default to null]
 **sortWith** | **String**| A combination of attribute and direction, joined with an underscore, for sorting. Valid attributes are: &#x60;created_at&#x60;, &#x60;updated_at&#x60;, &#x60;name&#x60;, and &#x60;start_time&#x60;. Valid directions are &#x60;asc&#x60; and &#x60;desc&#x60;. E.g., &#x60;name_desc&#x60;, &#x60;start_time_asc&#x60;. | [optional] [default to null]

### Return type

[**PaginatedGroupVisitsList**](PaginatedGroupVisitsList.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateGroupVisit

> GroupVisit updateGroupVisit(groupVisitId, idempotencyKey, groupVisitUpdateParams)

Update a Group Visit (Appointment)

Updates an existing &#x60;GroupVisit&#x60; (Appointment).

### Example

```java
// Import classes:
//import GuestSDK.GroupVisitsApi;

GroupVisitsApi apiInstance = new GroupVisitsApi();
String groupVisitId = null; // String | 
String idempotencyKey = null; // String | An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it's submitted. We store idempotency keys for only 24 hours. Any `Idempotency-Key` shorter than 10 characters will be ignored
GroupVisitUpdateParams groupVisitUpdateParams = new GroupVisitUpdateParams(); // GroupVisitUpdateParams | 
try {
    GroupVisit result = apiInstance.updateGroupVisit(groupVisitId, idempotencyKey, groupVisitUpdateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupVisitsApi#updateGroupVisit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupVisitId** | **String**|  | [default to null]
 **idempotencyKey** | **String**| An optional idempotency key to allow for repeat API requests. Any API request with this key will only be executed once, no matter how many times it&#39;s submitted. We store idempotency keys for only 24 hours. Any &#x60;Idempotency-Key&#x60; shorter than 10 characters will be ignored | [optional] [default to null]
 **groupVisitUpdateParams** | [**GroupVisitUpdateParams**](GroupVisitUpdateParams.md)|  | [optional]

### Return type

[**GroupVisit**](GroupVisit.md)

### Authorization

[TractionGuestAuth](../README.md#TractionGuestAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

