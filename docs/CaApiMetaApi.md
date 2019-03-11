# CaApiMetaApi

All URIs are relative to *https://localhost/euseccaapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubmitted**](CaApiMetaApi.md#getSubmitted) | **GET** /{scope}/meta/submitted | Returns a list of administrators


<a name="getSubmitted"></a>
# **getSubmitted**
> SubmittedResponse getSubmitted(scope)

Returns a list of administrators

Based on CCM-IVS-01. Gives information on when certain documents have been pushed dedicated endpoints of the customer

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiMetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CaApiMetaApi apiInstance = new CaApiMetaApi();
String scope = "scope_example"; // String | Scope of the service
try {
    SubmittedResponse result = apiInstance.getSubmitted(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiMetaApi#getSubmitted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the service |

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

