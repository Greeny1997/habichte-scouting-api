package de.jinou.habichtescouting.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Scout
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T16:25:36.526Z")

public class Scout   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("userStatus")
  private Integer userStatus = null;

  @JsonProperty("zuletztOnline")
  private Long zuletztOnline = null;

  public Scout id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Scout email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Scout password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Scout userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * User Status
   * @return userStatus
  **/
  @ApiModelProperty(value = "User Status")


  public Integer getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  public Scout zuletztOnline(Long zuletztOnline) {
    this.zuletztOnline = zuletztOnline;
    return this;
  }

  /**
   * Get zuletztOnline
   * @return zuletztOnline
  **/
  @ApiModelProperty(value = "")


  public Long getZuletztOnline() {
    return zuletztOnline;
  }

  public void setZuletztOnline(Long zuletztOnline) {
    this.zuletztOnline = zuletztOnline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scout scout = (Scout) o;
    return Objects.equals(this.id, scout.id) &&
        Objects.equals(this.email, scout.email) &&
        Objects.equals(this.password, scout.password) &&
        Objects.equals(this.userStatus, scout.userStatus) &&
        Objects.equals(this.zuletztOnline, scout.zuletztOnline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, userStatus, zuletztOnline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scout {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    zuletztOnline: ").append(toIndentedString(zuletztOnline)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

