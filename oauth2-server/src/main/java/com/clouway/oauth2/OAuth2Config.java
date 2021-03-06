package com.clouway.oauth2;

import com.clouway.oauth2.authorization.ClientAuthorizationRepository;
import com.clouway.oauth2.client.ClientRepository;
import com.clouway.oauth2.client.ServiceAccountFinder;
import com.clouway.oauth2.token.Tokens;
import com.clouway.oauth2.user.IdentityFinder;

/**
 * OAuth2Config is a configuration class which is used to pass configuration from apps to the oauth2-server flow.
 *
 * @see {@link OAuth2Servlet#config()}
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public final class OAuth2Config {

  public static OAuth2Config.Builder newConfig() {
    return new OAuth2Config.Builder();
  }

  public static class Builder {

    private Tokens tokens;
    private IdentityFinder identityFinder;
    private ServiceAccountFinder serviceAccountFinder;
    private ClientAuthorizationRepository clientAuthorizationRepository;
    private ClientRepository clientRepository;
    private String loginPageUrl;

    public Builder tokens(Tokens tokens) {
      this.tokens = tokens;
      return this;
    }
    public Builder identityFinder(IdentityFinder identityFinder) {
      this.identityFinder = identityFinder;
      return this;
    }

    public Builder serviceAccountRepository(ServiceAccountFinder serviceAccountFinder) {
      this.serviceAccountFinder = serviceAccountFinder;
      return this;
    }

    public Builder clientAuthorizationRepository(ClientAuthorizationRepository clientAuthorizationRepository) {
      this.clientAuthorizationRepository = clientAuthorizationRepository;
      return this;
    }

    public Builder clientRepository(ClientRepository clientRepository) {
      this.clientRepository = clientRepository;
      return this;
    }

    public Builder loginPageUrl(String url) {
      this.loginPageUrl = url;
      return this;
    }

    public OAuth2Config build() {
      return new OAuth2Config(this);
    }

  }

  private final IdentityFinder identityFinder;

  private final ClientRepository clientRepository;

  private final Tokens tokens;
  private final ClientAuthorizationRepository clientAuthorizationRepository;
  private final ServiceAccountFinder serviceAccountFinder;
  private final String loginPageUrl;
  private OAuth2Config(Builder builder) {
    this.tokens = builder.tokens;
    this.identityFinder = builder.identityFinder;
    this.clientRepository = builder.clientRepository;
    this.clientAuthorizationRepository = builder.clientAuthorizationRepository;
    this.serviceAccountFinder = builder.serviceAccountFinder;
    this.loginPageUrl = builder.loginPageUrl;
  }

  public ClientAuthorizationRepository clientAuthorizationRepository() {
    return this.clientAuthorizationRepository;
  }

  public ServiceAccountFinder serviceAccountRepository() {
    return this.serviceAccountFinder;
  }

  public Tokens tokens() {
    return this.tokens;
  }

  public IdentityFinder identityFinder() {
    return this.identityFinder;
  }

  public ClientRepository clientRepository() {
    return this.clientRepository;
  }

  public String loginPageUrl() {
    return this.loginPageUrl;
  }

}
