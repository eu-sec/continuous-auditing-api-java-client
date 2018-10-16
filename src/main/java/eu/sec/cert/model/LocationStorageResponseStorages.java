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
import eu.sec.cert.model.StorageType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LocationStorageResponseStorages
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T13:48:25.853+02:00")
public class LocationStorageResponseStorages {
  @SerializedName("storageUri")
  private String storageUri = null;

  @SerializedName("type")
  private StorageType type = null;

  @SerializedName("description")
  private String description = null;

  public LocationStorageResponseStorages storageUri(String storageUri) {
    this.storageUri = storageUri;
    return this;
  }

   /**
   * Get storageUri
   * @return storageUri
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStorageUri() {
    return storageUri;
  }

  public void setStorageUri(String storageUri) {
    this.storageUri = storageUri;
  }

  public LocationStorageResponseStorages type(StorageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageType getType() {
    return type;
  }

  public void setType(StorageType type) {
    this.type = type;
  }

  public LocationStorageResponseStorages description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description should have comments that specify information, that will be stored in the description field. E.g., based on 5.6. call, description should contain technical details like database type with its version.
   * @return description
  **/
  @ApiModelProperty(value = "Description should have comments that specify information, that will be stored in the description field. E.g., based on 5.6. call, description should contain technical details like database type with its version.")
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
    LocationStorageResponseStorages locationStorageResponseStorages = (LocationStorageResponseStorages) o;
    return Objects.equals(this.storageUri, locationStorageResponseStorages.storageUri) &&
        Objects.equals(this.type, locationStorageResponseStorages.type) &&
        Objects.equals(this.description, locationStorageResponseStorages.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageUri, type, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationStorageResponseStorages {\n");
    
    sb.append("    storageUri: ").append(toIndentedString(storageUri)).append("\n");
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

