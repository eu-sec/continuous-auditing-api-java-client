# CaApiPersistenceApi

All URIs are relative to *https://localhost/euseccaapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEncryptionInfo**](CaApiPersistenceApi.md#getEncryptionInfo) | **GET** /{scope}/persistence/{objectId}/encryption | Retrieves the encryption info of an object.
[**getLocation**](CaApiPersistenceApi.md#getLocation) | **GET** /{scope}/persistence/{objectId}/location/ | Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object
[**getStorage**](CaApiPersistenceApi.md#getStorage) | **GET** /{scope}/persistence/{objectId}/storage/ | Returns persistence information for a particular data object by its Id


<a name="getEncryptionInfo"></a>
# **getEncryptionInfo**
> EncryptionStorageResponse getEncryptionInfo(objectId, scope)

Retrieves the encryption info of an object.

Based on CCM-EKM-04. Retrieves the encryption info of an object. Propper interpretation has to be performed by the audit tool.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiPersistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CaApiPersistenceApi apiInstance = new CaApiPersistenceApi();
String objectId = "objectId_example"; // String | ID of either objectId on SaaS level or storeageId on lower level
String scope = "scope_example"; // String | Scope of the service
try {
    EncryptionStorageResponse result = apiInstance.getEncryptionInfo(objectId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiPersistenceApi#getEncryptionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| ID of either objectId on SaaS level or storeageId on lower level |
 **scope** | **String**| Scope of the service |

### Return type

[**EncryptionStorageResponse**](EncryptionStorageResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocation"></a>
# **getLocation**
> GeoLocation getLocation(objectId, scope)

Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object

Retrieves the data location of an object. Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object. Based on CCM-STA-05.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiPersistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CaApiPersistenceApi apiInstance = new CaApiPersistenceApi();
String objectId = "objectId_example"; // String | ID of either objectId on SaaS level or storeageId on lower level
String scope = "scope_example"; // String | Scope of the service
try {
    GeoLocation result = apiInstance.getLocation(objectId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiPersistenceApi#getLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| ID of either objectId on SaaS level or storeageId on lower level |
 **scope** | **String**| Scope of the service |

### Return type

[**GeoLocation**](GeoLocation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorage"></a>
# **getStorage**
> LocationStorageResponse getStorage(objectId, scope)

Returns persistence information for a particular data object by its Id

Depending on the kind of storage this call returns an identifier of the particular storage entity. E.g database name, RDS id, Harddrive, SMB location etc. If stored on multiple services all are returned. Based on CCM-GRM-02. This requires each logical object to be traceable to its physical persistence capabilities.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiPersistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CaApiPersistenceApi apiInstance = new CaApiPersistenceApi();
String objectId = "objectId_example"; // String | ID of data object to return
String scope = "scope_example"; // String | Scope of service
try {
    LocationStorageResponse result = apiInstance.getStorage(objectId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiPersistenceApi#getStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| ID of data object to return |
 **scope** | **String**| Scope of service |

### Return type

[**LocationStorageResponse**](LocationStorageResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

