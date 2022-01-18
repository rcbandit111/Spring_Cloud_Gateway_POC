package org.auth.database.service.oauth2authorization;

import org.auth.database.entity.Oauth2Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
@Transactional
public class Oauth2AuthorizationServiceImpl implements Oauth2AuthorizationService {

    @PersistenceContext
    private EntityManager entityManager;

    private Oauth2AuthorizationRepository dao;

    @Autowired
    public Oauth2AuthorizationServiceImpl(Oauth2AuthorizationRepository dao){
        this.dao = dao;
    }

    @Override
    public Optional<Oauth2Authorization> findById(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public Oauth2Authorization update(Oauth2Authorization oauth2Authorization)
    {
        return dao.saveAndFlush(oauth2Authorization);
    }

    @Override
    public Oauth2Authorization save(Oauth2Authorization oauth2Authorization)
    {
        return dao.saveAndFlush(oauth2Authorization);
    }
}
