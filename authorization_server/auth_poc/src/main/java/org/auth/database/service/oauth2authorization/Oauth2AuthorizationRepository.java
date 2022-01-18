package org.auth.database.service.oauth2authorization;

import org.auth.database.entity.Oauth2Authorization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Oauth2AuthorizationRepository extends JpaRepository<Oauth2Authorization, Long>, JpaSpecificationExecutor<Oauth2Authorization> {
}
