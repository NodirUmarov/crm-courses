package com.demo.crm.service;

import com.demo.crm.model.CourseType;
import com.demo.crm.model.builder.CourseTypeBuilder;
import com.demo.crm.model.enums.CourseFormats;

import java.time.Clock;
import java.time.LocalTime;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class CourseTypeService {

    private Scanner scanner;
    private static Long idCounter;

    static {
        System.out.println("Static block initialized 4");
        idCounter = 0L;
    }

    public CourseTypeService() {
        System.out.println("Course Type service constructor invoked");
        this.scanner = new Scanner(System.in);
    }

    public CourseType create() {
        System.out.println("Creating Course Type...");

        System.out.println("Please, enter Course Type data below.");
        System.out.println("Type name: ");
        String typeName = scanner.nextLine();

        System.out.print("Duration of Course: ");
        Integer durationOfCourse = scanner.nextInt();

        System.out.print("Duration of Lesson: ");
        LocalTime durationOfLesson = LocalTime.ofSecondOfDay(scanner.nextInt());

        System.out.print("Lessons per Week: ");
        Integer lessonsPerWeek = scanner.nextInt();

        System.out.print("Price per Month: ");
        Double pricePerMonth = scanner.nextDouble();

        System.out.print("Is Offline: ");
        Boolean isOffline = scanner.nextBoolean();

        System.out.print("Format: ");
        CourseFormats format = CourseFormats.valueOf(scanner.next());

        return CourseTypeBuilder.builder().id(++idCounter)
                .typeName(typeName)
                .durationOfCourse(durationOfCourse)
                .durationOfLesson(durationOfLesson)
                .lessonsPerWeek(lessonsPerWeek)
                .pricePerMonth(pricePerMonth)
                .isOffline(isOffline)
                .format(format).build();
    }
}
