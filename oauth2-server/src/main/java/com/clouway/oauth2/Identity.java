package com.clouway.oauth2;

import java.util.Map;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public final class Identity {
  private final String id;
  private final String name;
  private final String givenName;
  private final String familyName;
  private final String email;
  private final String picture;
  private final Map<String, Object> claims;

  public Identity(String id, String name, String givenName, String familyName, String email, String picture, Map<String, Object> claims) {
    this.id = id;
    this.name = name;
    this.givenName = givenName;
    this.familyName = familyName;
    this.email = email;
    this.picture = picture;
    this.claims = claims;
  }

  public String id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String email() {
    return email;
  }

  public String givenName() {
    return givenName;
  }

  public String familyName() {
    return familyName;
  }

  public String picture() {
    return picture;
  }

  public Map<String, Object> claims() {
    return claims;
  }
}
