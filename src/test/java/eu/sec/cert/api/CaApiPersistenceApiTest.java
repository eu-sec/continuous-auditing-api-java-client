/*
 * EU-SEC CA API
 * This is audit-api serves evidences for a continuous audit. In the EU-Sec project such evidences are collected and evaluated to determine the compliance status based on controls from the    [ccm](https://cloudsecurityalliance.org/group/cloud-controls-matrix).
 *
 * OpenAPI spec version: 1.0.7
 * Contact: contact@sec-cert.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eu.sec.cert.api;

import eu.sec.cert.ApiException;
import eu.sec.cert.model.EncryptionStorageResponse;
import eu.sec.cert.model.GeoLocation;
import eu.sec.cert.model.LocationStorageResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CaApiPersistenceApi
 */
@Ignore
public class CaApiPersistenceApiTest {

    private final CaApiPersistenceApi api = new CaApiPersistenceApi();

    
    /**
     * Retrieves the encryption info of an object.
     *
     * Based on CCM-EKM-04. Retrieves the encryption info of an object. Propper interpretation has to be performed by the audit tool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEncryptionInfoTest() throws ApiException {
        String objectId = null;
        String scope = null;
        EncryptionStorageResponse response = api.getEncryptionInfo(objectId, scope);

        // TODO: test validations
    }
    
    /**
     * Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object
     *
     * Retrieves the data location of an object. Returns location the ISO 3166-1 alpha-2 country code of the location of the data of the object. Based on CCM-STA-05.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationTest() throws ApiException {
        String objectId = null;
        String scope = null;
        GeoLocation response = api.getLocation(objectId, scope);

        // TODO: test validations
    }
    
    /**
     * Returns persistence information for a particular data object by its Id
     *
     * Depending on the kind of storage this call returns an identifier of the particular storage entity. E.g database name, RDS id, Harddrive, SMB location etc. If stored on multiple services all are returned. Based on CCM-GRM-02. This requires each logical object to be traceable to its physical persistence capabilities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageTest() throws ApiException {
        String objectId = null;
        String scope = null;
        LocationStorageResponse response = api.getStorage(objectId, scope);

        // TODO: test validations
    }
    
}
