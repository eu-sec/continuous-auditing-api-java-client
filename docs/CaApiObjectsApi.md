# CaApiObjectsApi

All URIs are relative to *https://localhost/euseccaapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getObjects**](CaApiObjectsApi.md#getObjects) | **GET** /{scope}/objects/ | Returns Object ids of all objects that are in the scope of the audit.


<a name="getObjects"></a>
# **getObjects**
> ObjectResponse getObjects(scope, from, limit)

Returns Object ids of all objects that are in the scope of the audit.

Returns the auditable object ids that are subject to the audit. The results can be limited according to a time range.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CaApiObjectsApi apiInstance = new CaApiObjectsApi();
String scope = "scope_example"; // String | Scope of service
String from = "from_example"; // String | in ISO-8601 formart
Integer limit = 56; // Integer | Limits the number of retuned values
try {
    ObjectResponse result = apiInstance.getObjects(scope, from, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiObjectsApi#getObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of service |
 **from** | **String**| in ISO-8601 formart | [optional]
 **limit** | **Integer**| Limits the number of retuned values | [optional]

### Return type

[**ObjectResponse**](ObjectResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

