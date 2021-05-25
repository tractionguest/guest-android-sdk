# BatchesApi

All URIs are relative to *https://us.tractionguest.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchDeleteInvites**](BatchesApi.md#batchDeleteInvites) | **POST** /invites/batch_delete | Delete Multiple Invites
[**getBatch**](BatchesApi.md#getBatch) | **GET** /batches/{batch_id} | Get a BatchJob



## batchDeleteInvites

> BatchJob batchDeleteInvites(identifierList)

Delete Multiple Invites

Queues up a \&quot;delete\&quot; background task for one or more &#x60;Invite&#x60; entities.

### Example

```java
// Import classes:
//import GuestSDK.BatchesApi;

BatchesApi apiInstance = new BatchesApi();
IdentifierList identifierList = new IdentifierList(); // IdentifierList | 
try {
    BatchJob result = apiInstance.batchDeleteInvites(identifierList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#batchDeleteInvites");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierList** | [**IdentifierList**](IdentifierList.md)|  | [optional]

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBatch

> BatchJob getBatch(batchId)

Get a BatchJob

Retrieve a given &#x60;BatchJob&#x60; entity.

### Example

```java
// Import classes:
//import GuestSDK.BatchesApi;

BatchesApi apiInstance = new BatchesApi();
String batchId = null; // String | 
try {
    BatchJob result = apiInstance.getBatch(batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#getBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**|  | [default to null]

### Return type

[**BatchJob**](BatchJob.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

