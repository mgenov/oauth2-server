package com.clouway.oauth2;

import com.clouway.oauth2.http.RsJson;
import com.clouway.oauth2.http.RsWrap;

import javax.json.Json;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class BearerTokenResponse extends RsWrap {

  public BearerTokenResponse(String accessToken, Long expiresInSeconds, String refreshToken) {
    super(new RsJson(Json.createObjectBuilder()
            .add("access_token", accessToken)
            .add("token_type", "bearer")
            .add("expires_in", expiresInSeconds)
            .add("refresh_token", refreshToken)
            .build()
    ));
  }
}
