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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.sec.cert.model.KeyOriginType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object contains information about the key origin depending on type
 */
@ApiModel(description = "Object contains information about the key origin depending on type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T09:38:29.538+02:00")
public class EncryptionStorageResponseEncryption {
  @SerializedName("keyOriginUri")
  private String keyOriginUri = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  @SerializedName("type")
  private KeyOriginType type = null;

  @SerializedName("description")
  private String description = null;

  public EncryptionStorageResponseEncryption keyOriginUri(String keyOriginUri) {
    this.keyOriginUri = keyOriginUri;
    return this;
  }

   /**
   * Get keyOriginUri
   * @return keyOriginUri
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKeyOriginUri() {
    return keyOriginUri;
  }

  public void setKeyOriginUri(String keyOriginUri) {
    this.keyOriginUri = keyOriginUri;
  }

  public EncryptionStorageResponseEncryption algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @ApiModelProperty(value = "")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public EncryptionStorageResponseEncryption type(KeyOriginType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public KeyOriginType getType() {
    return type;
  }

  public void setType(KeyOriginType type) {
    this.type = type;
  }

  public EncryptionStorageResponseEncryption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Comments on technical details of the key origin.
   * @return description
  **/
  @ApiModelProperty(value = "Comments on technical details of the key origin.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionStorageResponseEncryption encryptionStorageResponseEncryption = (EncryptionStorageResponseEncryption) o;
    return Objects.equals(this.keyOriginUri, encryptionStorageResponseEncryption.keyOriginUri) &&
        Objects.equals(this.algorithm, encryptionStorageResponseEncryption.algorithm) &&
        Objects.equals(this.type, encryptionStorageResponseEncryption.type) &&
        Objects.equals(this.description, encryptionStorageResponseEncryption.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyOriginUri, algorithm, type, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionStorageResponseEncryption {\n");
    
    sb.append("    keyOriginUri: ").append(toIndentedString(keyOriginUri)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

