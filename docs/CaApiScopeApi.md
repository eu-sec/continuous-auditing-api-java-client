# CaApiScopeApi

All URIs are relative to *https://localhost/euseccaapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScopes**](CaApiScopeApi.md#getScopes) | **GET** /scopes/ | Returns all scopes of the cloud service


<a name="getScopes"></a>
# **getScopes**
> ScopeResponse getScopes()

Returns all scopes of the cloud service

Returns the available scopes for the cloud service. The scope corresponds often with the layers of the cloud service architecture like IaaS, PaaS, SaaS.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiScopeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basic_auth
HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
basic_auth.setUsername("YOUR USERNAME");
basic_auth.setPassword("YOUR PASSWORD");

CaApiScopeApi apiInstance = new CaApiScopeApi();
try {
    ScopeResponse result = apiInstance.getScopes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiScopeApi#getScopes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScopeResponse**](ScopeResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

