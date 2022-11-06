package com.demo.crm.service;

import com.demo.crm.dao.MentorDao;
import com.demo.crm.dao.impl.MentorDaoImplFile;
import com.demo.crm.model.Mentor;
import com.demo.crm.model.builder.MentorBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MentorService {

    private Scanner scanner;
    private static Long idCounter;

    private MentorDao mentorDao;

    static {
        idCounter = 0L;
    }

    public MentorService() {
        this.scanner = new Scanner(System.in);
        this.mentorDao = new MentorDaoImplFile();
    }

    public Mentor create() {
        System.out.println("Creating mentor...");

        System.out.println("Please, enter mentor data below.");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Date of birth(day.month.year): ");
        String dobInString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy");
        LocalDate dob = LocalDate.parse(dobInString, formatter);

        System.out.print("Salary: ");
        Double salary = Double.parseDouble(scanner.nextLine());

        return mentorDao.save(MentorBuilder
                .builder()
                .id(++idCounter)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phoneNumber(phoneNumber)
                .dob(dob)
                .salary(salary)
                .build());
    }

    public Mentor find(Long id) {
        return  mentorDao.find(id);
    }
}
