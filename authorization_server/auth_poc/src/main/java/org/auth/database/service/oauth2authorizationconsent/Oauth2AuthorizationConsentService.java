package org.auth.database.service.oauth2authorizationconsent;

import org.auth.database.entity.Oauth2AuthorizationConsent;

import java.util.Optional;

public interface Oauth2AuthorizationConsentService {

    Optional<Oauth2AuthorizationConsent> findById(Long id);

    Oauth2AuthorizationConsent update(Oauth2AuthorizationConsent oauth2AuthorizationConsent);

    Oauth2AuthorizationConsent save(Oauth2AuthorizationConsent oauth2AuthorizationConsent);
}
