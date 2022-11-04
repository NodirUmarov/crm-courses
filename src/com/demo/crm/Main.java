package com.demo.crm;

import com.demo.crm.model.Course;
import com.demo.crm.model.Mentor;
import com.demo.crm.model.Student;
import com.demo.crm.service.CourseService;
import com.demo.crm.service.MentorService;
import com.demo.crm.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Course> listOfCourse = new ArrayList<>();
    private static List<Mentor> listOfMentors = new ArrayList<>();
    private static List<Student> listOfStudents = new ArrayList<>();

    private static CourseService courseService = new CourseService();
    private static MentorService mentorService = new MentorService();
    private static StudentService studentService = new StudentService();
    private static int value = 7;

    public static void main(String[] args) {
        while (value != 0) {
            run();
        }

    }

    public static void run() {
        System.out.println();
        System.out.println(new StringBuilder()
                .append("Enter 1 to create Course\n")
                .append("Enter 2 to create Mentor\n")
                .append("Enter 3 to create Student\n")
                .append("Enter 4 to print list of Course\n")
                .append("Enter 5 to print list of Mentors\n")
                .append("Enter 6 to get student by id\n")
                .append("Enter 0 to EXIT").toString());
        System.out.println("Please, enter number between 0 to 6");

        value = scanner.nextInt();

        if (value == 1) {
            courseCreate();
        } else if (value == 2) {
            mentorCreate();
        } else if (value == 3) {
            studentCreate();
        } else if (value == 4) {
            printCourseList();
        } else if (value == 5) {
            printMentorsList();
        } else if (value == 6) {
            getStudent();
        } else if (value == 0) {
            return;
        }
    }

    public static void courseCreate() {
        Course course = courseService.create();
        listOfCourse.add(course);
    }

    public static void mentorCreate() {
        Mentor mentor = mentorService.create();
        listOfMentors.add(mentor);
    }

    public static void studentCreate() {
        Student student = studentService.create();
        listOfStudents.add(student);
    }

    public static void printCourseList() {
        for (Course course : listOfCourse) {
            System.out.println(course);
        }
    }

    public static void printMentorsList() {
        for (Mentor mentor : listOfMentors) {
            System.out.println(mentor);
        }
    }

    public static void printStudentsList() {
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }

    public static void getStudent() {
        System.out.print("Enter student id: ");
        long id = scanner.nextLong();
        System.out.println(studentService.find(id));
    }

}