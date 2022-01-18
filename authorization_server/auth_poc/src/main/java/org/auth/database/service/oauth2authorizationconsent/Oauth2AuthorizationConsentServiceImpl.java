package org.auth.database.service.oauth2authorizationconsent;

import org.auth.database.entity.Oauth2AuthorizationConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
@Transactional
public class Oauth2AuthorizationConsentServiceImpl implements Oauth2AuthorizationConsentService {

    @PersistenceContext
    private EntityManager entityManager;

    private Oauth2AuthorizationConsentRepository dao;

    @Autowired
    public Oauth2AuthorizationConsentServiceImpl(Oauth2AuthorizationConsentRepository dao){
        this.dao = dao;
    }

    @Override
    public Optional<Oauth2AuthorizationConsent> findById(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public Oauth2AuthorizationConsent update(Oauth2AuthorizationConsent oauth2AuthorizationConsent)
    {
        return dao.saveAndFlush(oauth2AuthorizationConsent);
    }

    @Override
    public Oauth2AuthorizationConsent save(Oauth2AuthorizationConsent oauth2AuthorizationConsent)
    {
        return dao.saveAndFlush(oauth2AuthorizationConsent);
    }
}
