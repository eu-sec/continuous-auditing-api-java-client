# CaApiIamApi

All URIs are relative to *https://localhost/euseccaapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdmins**](CaApiIamApi.md#getAdmins) | **GET** /{scope}/identityfederation/admins/ | Returns a list of administrators
[**getObjectAccess**](CaApiIamApi.md#getObjectAccess) | **POST** /{scope}/identityfederation/data/access | Checks whether a user has a certain access to an object.
[**getPasswordRequirements**](CaApiIamApi.md#getPasswordRequirements) | **GET** /{scope}/identityfederation/{userId}/passwordRequirements | returns the password requirements for a specific user
[**getUserAccesses**](CaApiIamApi.md#getUserAccesses) | **GET** /{scope}/identityfederation/{userId}/logins | Returns a list of the last logins of a user
[**getUserAuthType**](CaApiIamApi.md#getUserAuthType) | **GET** /{scope}/identityfederation/{userId}/auth | Returns the authentication type of a user. E.g password, two-factor
[**getUserOrganisation**](CaApiIamApi.md#getUserOrganisation) | **GET** /{scope}/identityfederation/{userId}/groups | Returns the groups of a user


<a name="getAdmins"></a>
# **getAdmins**
> AdminResponse getAdmins(scope)

Returns a list of administrators

Based on CCM-IAM-12. Reads out all administrators of the application and returns them.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
String scope = "scope_example"; // String | Scope of the service
try {
    AdminResponse result = apiInstance.getAdmins(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getAdmins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| Scope of the service |

### Return type

[**AdminResponse**](AdminResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectAccess"></a>
# **getObjectAccess**
> AccessResponse getObjectAccess(request, scope)

Checks whether a user has a certain access to an object.

Checks whether a user has a certain access to an object.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
AccessRequest request = new AccessRequest(); // AccessRequest | request object
String scope = "scope_example"; // String | Scope of the service
try {
    AccessResponse result = apiInstance.getObjectAccess(request, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getObjectAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AccessRequest**](AccessRequest.md)| request object |
 **scope** | **String**| Scope of the service |

### Return type

[**AccessResponse**](AccessResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPasswordRequirements"></a>
# **getPasswordRequirements**
> PasswordRequirementsResponse getPasswordRequirements(userId, scope)

returns the password requirements for a specific user

Based on CCM-IAM-12. Strong authentication might require a strong password. Password requirements are a indicator for strong password and therefore can be part of an audit.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
String userId = "userId_example"; // String | ID of user
String scope = "scope_example"; // String | Scope of the service
try {
    PasswordRequirementsResponse result = apiInstance.getPasswordRequirements(userId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getPasswordRequirements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of user |
 **scope** | **String**| Scope of the service |

### Return type

[**PasswordRequirementsResponse**](PasswordRequirementsResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserAccesses"></a>
# **getUserAccesses**
> LoginResponse getUserAccesses(userId, scope, from, to, limit)

Returns a list of the last logins of a user

Based on CCM-IAM-12. Whenever a user logs in into the application this kind access gets logged. This call returns the last accesses of a particular user based on existing logs.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
String userId = "userId_example"; // String | ID of user
String scope = "scope_example"; // String | Scope of the service
String from = "from_example"; // String | from date in ISO-8601 format e.g 2005-08-15T15:52:01+0000
String to = "to_example"; // String | to date in ISO-8601 format  e.g 2005-08-15T15:52:01+0000
Integer limit = 56; // Integer | Limits the number of retuned values
try {
    LoginResponse result = apiInstance.getUserAccesses(userId, scope, from, to, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getUserAccesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of user |
 **scope** | **String**| Scope of the service |
 **from** | **String**| from date in ISO-8601 format e.g 2005-08-15T15:52:01+0000 | [optional]
 **to** | **String**| to date in ISO-8601 format  e.g 2005-08-15T15:52:01+0000 | [optional]
 **limit** | **Integer**| Limits the number of retuned values | [optional]

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserAuthType"></a>
# **getUserAuthType**
> AdminAuth getUserAuthType(userId, scope)

Returns the authentication type of a user. E.g password, two-factor

Based on CCM-IAM-12. Reads out a particular users authentication settings and returns them. Propper interpretation has to be performed by the audit tool.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
String userId = "userId_example"; // String | ID of user
String scope = "scope_example"; // String | Scope of the service
try {
    AdminAuth result = apiInstance.getUserAuthType(userId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getUserAuthType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of user |
 **scope** | **String**| Scope of the service |

### Return type

[**AdminAuth**](AdminAuth.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserOrganisation"></a>
# **getUserOrganisation**
> GroupsResponse getUserOrganisation(userId, scope)

Returns the groups of a user

Based on CCM-IAM-12. Depending on the implementation a group can be e.g a unix group, organisation, role etc.

### Example
```java
// Import classes:
//import eu.sec.cert.ApiClient;
//import eu.sec.cert.ApiException;
//import eu.sec.cert.Configuration;
//import eu.sec.cert.auth.*;
//import eu.sec.cert.api.CaApiIamApi;

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

CaApiIamApi apiInstance = new CaApiIamApi();
String userId = "userId_example"; // String | ID of user
String scope = "scope_example"; // String | Scope of the service
try {
    GroupsResponse result = apiInstance.getUserOrganisation(userId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApiIamApi#getUserOrganisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of user |
 **scope** | **String**| Scope of the service |

### Return type

[**GroupsResponse**](GroupsResponse.md)

### Authorization

[api_key](../README.md#api_key), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

