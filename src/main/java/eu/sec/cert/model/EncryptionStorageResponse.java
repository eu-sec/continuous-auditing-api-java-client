/*
 * EU-SEC CA API
 * This is audit-api serves evidences for a continuous audit. In the EU-Sec project such evidences are collected and evaluated to determine the compliance status based on controls from the    [ccm](https://cloudsecurityalliance.org/group/cloud-controls-matrix).
 *
 * OpenAPI spec version: 1.0.5
 * Contact: contact@sec-cert.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eu.sec.cert.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.sec.cert.model.EncryptionStorageResponseEncryption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EncryptionStorageResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T13:44:30.652+02:00")
public class EncryptionStorageResponse {
  @SerializedName("encryption")
  private EncryptionStorageResponseEncryption encryption = null;

  public EncryptionStorageResponse encryption(EncryptionStorageResponseEncryption encryption) {
    this.encryption = encryption;
    return this;
  }

   /**
   * Get encryption
   * @return encryption
  **/
  @ApiModelProperty(value = "")
  public EncryptionStorageResponseEncryption getEncryption() {
    return encryption;
  }

  public void setEncryption(EncryptionStorageResponseEncryption encryption) {
    this.encryption = encryption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionStorageResponse encryptionStorageResponse = (EncryptionStorageResponse) o;
    return Objects.equals(this.encryption, encryptionStorageResponse.encryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionStorageResponse {\n");
    
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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
