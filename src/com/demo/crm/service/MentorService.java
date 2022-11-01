package com.demo.crm.service;

import com.demo.crm.model.Mentor;
import com.demo.crm.model.builder.MentorBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MentorService {
    private Scanner scanner;

    private static Long idCounter;

    static {
        System.out.println("Static block initialized 2");
        idCounter = 0L;
    }

    public MentorService() {
        System.out.println("Mentor service constructor invoked");
        this.scanner = new Scanner(System.in);
    }

    public Mentor create() {
        System.out.println("Creating Mentor...");

        System.out.println("Please, enter Mentor data below.");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Date of birth(dd.MM.yyyy): ");
        String dobInString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dob = LocalDate.parse(dobInString, formatter);

        System.out.println("Set salary");
        Double salary = scanner.nextDouble();

        return MentorBuilder.builder().id(++idCounter)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phoneNumber(phoneNumber)
                .dob(dob)
                .salary(salary).build();
    }
}
