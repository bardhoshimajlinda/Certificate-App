package org.example.certificateApp.model;

import org.example.certificateApp.model.enums.Gender;
import org.example.certificateApp.model.enums.RelationshipStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personal_certificates")
public class PersonalCertificate {

    @Id
    private int id;
    private String name;
    private String surname;
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "relationship_status")
    @Enumerated(EnumType.STRING)
    private RelationshipStatus relationshipStatus;

    private String ssn;

    private int age;

    private double height;

    private boolean employed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public RelationshipStatus getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    @Override
    public String toString() {
        return "PersonalCertificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", relationshipStatus=" + relationshipStatus +
                ", ssn='" + ssn + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", employed=" + employed +
                '}';
    }
}

