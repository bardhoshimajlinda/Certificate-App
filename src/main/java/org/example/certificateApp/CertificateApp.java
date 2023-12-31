package org.example.certificateApp;

import org.example.certificateApp.model.PersonalCertificate;
import org.example.certificateApp.model.enums.Gender;
import org.example.certificateApp.model.enums.RelationshipStatus;
import org.example.certificateApp.repository.PersonalCertificateRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class CertificateApp {
    public static void main(String[] args) {
       // testGetAll();
      //  testGetById(3);
        testInsert();
    }

    public static void testGetAll() {
        PersonalCertificateRepository repository = new PersonalCertificateRepository();
        List<PersonalCertificate> personalCertificates = repository.getALL();
        System.out.println(personalCertificates);
    }

    public static void testGetById(int id) {
        PersonalCertificateRepository personalCertificateRepository = new PersonalCertificateRepository();
        System.out.println(personalCertificateRepository.getById(id));
    }

    public static PersonalCertificate createPersonalCertificate() {

        PersonalCertificate personalCertificate = new PersonalCertificate();

        personalCertificate.setId(1);
        personalCertificate.setName("Test Name");
        personalCertificate.setSurname("Test Surname");
        personalCertificate.setBirthDate(LocalDate.of(1998, Month.JULY, 22));
        personalCertificate.setGender(Gender.FEMALE);
        personalCertificate.setRelationshipStatus(RelationshipStatus.COMPLICATED);
        personalCertificate.setSsn("K4684189L");
        personalCertificate.setAge(25);
        personalCertificate.setHeight(165.50);
        personalCertificate.setEmployed(true);

        return personalCertificate;
    }

    public static void testInsert() {

        PersonalCertificate personalCertificate = createPersonalCertificate();
        PersonalCertificateRepository repository = new PersonalCertificateRepository();
        repository.insert(personalCertificate);

    }
}