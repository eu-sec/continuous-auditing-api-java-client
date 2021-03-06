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


package eu.sec.cert.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AuthType
 */
@JsonAdapter(AuthType.Adapter.class)
public enum AuthType {
  
  ONEFACTOR("oneFactor"),
  
  TWOFACTOR("twoFactor"),
  
  MULTIFACTOR("multiFactor");

  private String value;

  AuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AuthType fromValue(String text) {
    for (AuthType b : AuthType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AuthType.fromValue(String.valueOf(value));
    }
  }
}

