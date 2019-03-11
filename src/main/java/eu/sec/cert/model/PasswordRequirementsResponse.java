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


package eu.sec.cert.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.sec.cert.model.PasswordRequirementsResponsePasswordRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PasswordRequirementsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T14:46:49.847+01:00")
public class PasswordRequirementsResponse {
  @SerializedName("passwordRequirements")
  private PasswordRequirementsResponsePasswordRequirements passwordRequirements = null;

  public PasswordRequirementsResponse passwordRequirements(PasswordRequirementsResponsePasswordRequirements passwordRequirements) {
    this.passwordRequirements = passwordRequirements;
    return this;
  }

   /**
   * Get passwordRequirements
   * @return passwordRequirements
  **/
  @ApiModelProperty(value = "")
  public PasswordRequirementsResponsePasswordRequirements getPasswordRequirements() {
    return passwordRequirements;
  }

  public void setPasswordRequirements(PasswordRequirementsResponsePasswordRequirements passwordRequirements) {
    this.passwordRequirements = passwordRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordRequirementsResponse passwordRequirementsResponse = (PasswordRequirementsResponse) o;
    return Objects.equals(this.passwordRequirements, passwordRequirementsResponse.passwordRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordRequirementsResponse {\n");
    
    sb.append("    passwordRequirements: ").append(toIndentedString(passwordRequirements)).append("\n");
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

