package com.demo.crm.model;

import java.time.LocalDate;

public class Student extends Person {

    public Student() {
        super();
    }

    public Student(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dob) {
        super(id, firstName, lastName, email, phoneNumber, dob);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", dob=" + getDob() +
                ", createDate=" + getCreateDate() +
                "} " + super.toString();
    }
}