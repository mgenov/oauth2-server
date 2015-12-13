package com.clouway.oauth2;

import com.clouway.oauth2.http.Response;
import com.clouway.oauth2.http.RsJson;
import com.clouway.oauth2.http.RsWrap;

import javax.json.Json;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class OAuthError extends RsWrap {

  public static OAuthError unathorizedClient() {
    return new OAuthError("unauthorized_client");
  }

  public static OAuthError invalidGrant() {
    return new OAuthError("invalid_grant");
  }

  private OAuthError(String errorName) {
    super(new RsJson(Json.createObjectBuilder()
            .add("error", errorName)
            .build()
    ));
  }
}
