/*
 * EU-SEC CA API
 * This is audit-api serves evidences for a continuous audit. In the EU-Sec project such evidences are collected and evaluated to determine the compliance status based on controls from the    [ccm](https://cloudsecurityalliance.org/group/cloud-controls-matrix).
 *
 * OpenAPI spec version: 1.0.8
 * Contact: contact@sec-cert.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eu.sec.cert.api;

import eu.sec.cert.ApiException;
import eu.sec.cert.model.SubmittedResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CaApiMetaApi
 */
@Ignore
public class CaApiMetaApiTest {

    private final CaApiMetaApi api = new CaApiMetaApi();

    
    /**
     * Returns a list of administrators
     *
     * Based on CCM-IVS-01. Gives information on when certain documents have been pushed dedicated endpoints of the customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubmittedTest() throws ApiException {
        String scope = null;
        SubmittedResponse response = api.getSubmitted(scope);

        // TODO: test validations
    }
    
}
