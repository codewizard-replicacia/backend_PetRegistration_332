package com.apps.petreg.repository;


import com.apps.petreg.model.Veterian;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class VeterianRepository extends SimpleJpaRepository<Veterian, String> {
    private final EntityManager em;
    public VeterianRepository(EntityManager em) {
        super(Veterian.class, em);
        this.em = em;
    }
    @Override
    public List<Veterian> findAll() {
        return em.createNativeQuery("Select * from \"petreg\".\"Veterian\"", Veterian.class).getResultList();
    }
}