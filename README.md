# continuous-auditing-api-java-client

EU-SEC CA API
- API version: 1.0.7
  - Build date: 2019-03-11T14:46:49.847+01:00

This is audit-api serves evidences for a continuous audit. In the EU-Sec project such evidences are collected and evaluated to determine the compliance status based on controls from the    [ccm](https://cloudsecurityalliance.org/group/cloud-controls-matrix).

  For more information, please visit [http://www.sec-cert.eu/](http://www.sec-cert.eu/)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>eu.sec.cert</groupId>
  <artifactId>continuous-auditing-api-java-client</artifactId>
  <version>1.0.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "eu.sec.cert:continuous-auditing-api-java-client:1.0.7"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/continuous-auditing-api-java-client-1.0.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import eu.sec.cert.*;
import eu.sec.cert.auth.*;
import eu.sec.cert.model.*;
import eu.sec.cert.api.CaApiIamApi;

import java.io.File;
import java.util.*;

public class CaApiIamApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CaApiIamApi apiInstance = new CaApiIamApi();
        String scope = "scope_example"; // String | Scope of the service
        try {
            AdminResponse result = apiInstance.getAdmins(scope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaApiIamApi#getAdmins");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/euseccaapi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CaApiIamApi* | [**getAdmins**](docs/CaApiIamApi.md#getAdmins) | **GET** /{scope}/identityfederation/admins/ | Returns a list of administrators
*CaApiIamApi* | [**getObjectAccess**](docs/CaApiIamApi.md#getObjectAccess) | **POST** /{scope}/identityfederation/data/access | Checks whether a user has a certain access to an object.
*CaApiIamApi* | [**getPasswordRequirements**](docs/CaApiIamApi.md#getPasswordRequirements) | **GET** /{scope}/identityfederation/{userId}/passwordRequirements | returns the password requirements for a specific user
*CaApiIamApi* | [**getUserAccesses**](docs/CaApiIamApi.md#getUserAccesses) | **GET** /{scope}/identityfederation/{userId}/logins | Returns a list of the last logins of a user
*CaApiIamApi* | [**getUserAuthType**](docs/CaApiIamApi.md#getUserAuthType) | **GET** /{scope}/identityfederation/{userId}/auth | Returns the authentication type of a user. E.g password, two-factor
*CaApiIamApi* | [**getUserOrganisation**](docs/CaApiIamApi.md#getUserOrganisation) | **GET** /{scope}/identityfederation/{userId}/groups | Returns the groups of a user
*CaApiMetaApi* | [**getSubmitted**](docs/CaApiMetaApi.md#getSubmitted) | **GET** /{scope}/meta/submitted | Returns a list of administrators
*CaApiObjectsApi* | [**getObjects**](docs/CaApiObjectsApi.md#getObjects) | **GET** /{scope}/objects/ | Returns Object ids of all objects that are in the scope of the audit.
*CaApiPersistenceApi* | [**getEncryptionInfo**](docs/CaApiPersistenceApi.md#getEncryptionInfo) | **GET** /{scope}/persistence/{objectId}/encryption | Retrieves the encryption info of an object.
*CaApiPersistenceApi* | [**getLocation**](docs/CaApiPersistenceApi.md#getLocation) | **GET** /{scope}/persistence/{objectId}/location/ | Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object
*CaApiPersistenceApi* | [**getStorage**](docs/CaApiPersistenceApi.md#getStorage) | **GET** /{scope}/persistence/{objectId}/storage/ | Returns persistence information for a particular data object by its Id
*CaApiScopeApi* | [**getScopes**](docs/CaApiScopeApi.md#getScopes) | **GET** /scopes/ | Returns all scopes of the cloud service


## Documentation for Models

 - [AccessRequest](docs/AccessRequest.md)
 - [AccessResponse](docs/AccessResponse.md)
 - [AccessType](docs/AccessType.md)
 - [AdminAuth](docs/AdminAuth.md)
 - [AdminResponse](docs/AdminResponse.md)
 - [AuthType](docs/AuthType.md)
 - [EncryptionStorageResponse](docs/EncryptionStorageResponse.md)
 - [EncryptionStorageResponseEncryption](docs/EncryptionStorageResponseEncryption.md)
 - [GeoLocation](docs/GeoLocation.md)
 - [GroupsResponse](docs/GroupsResponse.md)
 - [KeyOriginType](docs/KeyOriginType.md)
 - [LocationStorageResponse](docs/LocationStorageResponse.md)
 - [LocationStorageResponseStorages](docs/LocationStorageResponseStorages.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [ObjectResponse](docs/ObjectResponse.md)
 - [ObjectResponseObjects](docs/ObjectResponseObjects.md)
 - [PasswordRequirementsResponse](docs/PasswordRequirementsResponse.md)
 - [PasswordRequirementsResponsePasswordRequirements](docs/PasswordRequirementsResponsePasswordRequirements.md)
 - [ScopeResponse](docs/ScopeResponse.md)
 - [StorageType](docs/StorageType.md)
 - [SubmittedResponse](docs/SubmittedResponse.md)
 - [SubmittedResponseItems](docs/SubmittedResponseItems.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### basic_auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@sec-cert.eu

