package org.example.certificateApp.repository;

import org.example.certificateApp.model.PersonalCertificate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class PersonalCertificateRepository {

    public List<PersonalCertificate> getALL() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("certificate-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        List<PersonalCertificate> personalCertificates = entityManager.createQuery(
                            "SELECT p FROM PersonalCertificate p", PersonalCertificate.class)
                .getResultList();

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        return personalCertificates;
    }

    public PersonalCertificate getById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("certificate-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        PersonalCertificate personalCertificate = entityManager.find(PersonalCertificate.class, id);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        return personalCertificate;
    }

}
