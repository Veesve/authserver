//package ru.veesve.authserver.config;
//
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.TokenRequest;
//import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
//import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
//
//public class VeesveAuthorizationServerTokenServices implements AuthorizationServerTokenServices {
//    @Override
//    public OAuth2AccessToken createAccessToken(OAuth2Authentication authentication) throws AuthenticationException {
//        JdbcTokenStore jdbcTokenStore = new JdbcTokenStore();
//        return jdbcTokenStore.;
//    }
//
//    @Override
//    public OAuth2AccessToken refreshAccessToken(String refreshToken, TokenRequest tokenRequest) throws AuthenticationException {
//        return null;
//    }
//
//    @Override
//    public OAuth2AccessToken getAccessToken(OAuth2Authentication authentication) {
//        return null;
//    }
//}
