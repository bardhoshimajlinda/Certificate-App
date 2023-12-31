package org.example.certificateApp;

import org.example.certificateApp.model.PersonalCertificate;
import org.example.certificateApp.repository.PersonalCertificateRepository;

import java.util.List;

public class CertificateApp {
    public static void main(String[] args) {
        testGetAll();
    }

    public static void testGetAll() {
        PersonalCertificateRepository repository = new PersonalCertificateRepository();
        List<PersonalCertificate> personalCertificates = repository.getALL();
        System.out.println(personalCertificates);
    }
}