package org.auth.database.service.oauth2authorizationconsent;

import org.auth.database.entity.Oauth2AuthorizationConsent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Oauth2AuthorizationConsentRepository extends JpaRepository<Oauth2AuthorizationConsent, Long>, JpaSpecificationExecutor<Oauth2AuthorizationConsent> {
}
