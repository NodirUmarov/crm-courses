package com.demo.crm.service;

import com.demo.crm.model.Course;
import com.demo.crm.model.builder.CourseBuilder;

import java.util.Scanner;

public class CourseService {

    private Scanner scanner;

    private static  Long idCounter;

    static {
        System.out.println("Static block initialized 3");
        idCounter = 0L;
    }

    public CourseService() {
        System.out.println("Course service constructor invoked");
        this.scanner = new Scanner(System.in);
    }

    public Course create() {
        System.out.println("Creating Course...");

        System.out.println("Please, enter Course data below.");
        System.out.print("Course name: ");
        String courseName = scanner.nextLine();



        return CourseBuilder.builder().id(++idCounter)
                .courseName(courseName)
                .build();


    }
}
