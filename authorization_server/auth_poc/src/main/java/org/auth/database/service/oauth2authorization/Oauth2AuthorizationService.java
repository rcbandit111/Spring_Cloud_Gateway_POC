package org.auth.database.service.oauth2authorization;

import org.auth.database.entity.Oauth2Authorization;

import java.util.Optional;

public interface Oauth2AuthorizationService {

    Optional<Oauth2Authorization> findById(Long id);

    Oauth2Authorization update(Oauth2Authorization oauth2Authorization);

    Oauth2Authorization save(Oauth2Authorization oauth2Authorization);
}
