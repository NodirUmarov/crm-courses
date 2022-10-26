package com.demo.crm.model;

import java.time.LocalDate;

public class Mentor extends Person {

    private Double salary;

    public Mentor() {
        super();
    }

    public Mentor(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dob, Double salary) {
        super(id, firstName, lastName, email, phoneNumber, dob);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "salary=" + salary +
                '}';
    }
}
