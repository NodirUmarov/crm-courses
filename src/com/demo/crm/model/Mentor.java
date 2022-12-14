package com.demo.crm.model;

import java.time.LocalDate;

public class Mentor extends Person {

   public Mentor() {

    }

    public Mentor(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dob, Double salary) {
        super(id, firstName, lastName, email, phoneNumber, dob);

    }

    @Override
    public String toString() {
        return "Mentor{" +
                " id = " + getId() +
                ", firstName = '" + getFirstName() + '\'' +
                ", lastName = '" + getLastName() + '\'' +
                ", email = '" + getEmail() + '\'' +
                ", phoneNumber = '" + getPhoneNumber() + '\'' +
                ", dob = " + getDob() +
                ", createDate = " + getCreateDate() +
                '}';
    }
}
