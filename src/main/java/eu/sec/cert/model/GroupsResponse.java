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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T14:46:49.847+01:00")
public class GroupsResponse {
  @SerializedName("groups")
  private List<String> groups = new ArrayList<String>();

  public GroupsResponse groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public GroupsResponse addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(example = "[\"root\",\"awsEc2Full\",\"users\"]", required = true, value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsResponse groupsResponse = (GroupsResponse) o;
    return Objects.equals(this.groups, groupsResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsResponse {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

