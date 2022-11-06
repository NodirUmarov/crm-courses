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

import static sun.misc.Version.print;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Course> listOfCourse = new ArrayList<>();
    private static List<Mentor> listOfMentors = new ArrayList<>();
    private static List<Student> listOfStudents = new ArrayList<>();

    private static CourseService courseService = new CourseService();
    private static MentorService mentorService = new MentorService();
    private static StudentService studentService = new StudentService();
    private static int value = 10;

    public static void main(String[] args) {
        while (value != 0) {
            run();
        }

    }
    public static void run() {
        System.out.println();
        System.out.println(new StringBuilder()
                .append("Enter 1 to create Data\n")
                .append("Enter 2 to print list of Data\n")
                .append("Enter 3 to get Data by id\n")
                .append("Enter 0 to EXIT").toString());
        System.out.println("Please, enter number between 0 to 3");

        value = scanner.nextInt();


        switch (value) {
            case 1:
                System.out.println(new StringBuilder()
                        .append("Enter 1 to create Course data\n")
                        .append("Enter 2 to create Mentor data\n")
                        .append("Enter 3 to create Student data\n")
                        .append("Enter 4 to go back").toString());
                value = scanner.nextInt();
                switch (value) {
                    case 1:
                        courseCreate();
                        break;
                    case 2:
                        mentorCreate();
                        break;
                    case 3:
                        studentCreate();
                        break;
                    case 4:
                        return;
                }
                break;
            case 2:
                System.out.println(new StringBuilder()
                        .append("Enter 1 to print Course list\n")
                        .append("Enter 2 to print Mentor list\n")
                        .append("Enter 3 to print Student list\n")
                        .append("Enter 4 to go back").toString());
                value = scanner.nextInt();
                switch (value) {
                    case 1:
                        printCourseList();
                        break;
                    case 2:
                        printMentorsList();
                        break;
                    case 3:
                        printStudentsList();
                        break;
                    case 4:
                        return;
                }
                break;
            case 3:
                System.out.println(new StringBuilder()
                        .append("Enter 1 to find Course by id\n")
                        .append("Enter 2 to find Mentor by id\n")
                        .append("Enter 3 to find Student by id\n")
                        .append("Enter 4 to go back").toString());
                value = scanner.nextInt();
                switch (value) {
                    case 1:
                        getCourse();
                        break;
                    case 2:
                        getMentor();
                        break;
                    case 3:
                        getStudent();
                        break;
                    case 4:
                        return;
                }
                break;
            case 0:
                return;
            default:
                System.out.println("Please enter given number: ");
                break;
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
        System.out.print("Enter Student id: ");
        long id = scanner.nextLong();
        System.out.println(studentService.find(id));

    }

    public static void getMentor() {
        System.out.print("Enter Mentor id: ");
        long id = scanner.nextLong();
        System.out.println(mentorService.find(id));

    }

    public static void getCourse() {
        System.out.print("Enter Course id: ");
        long id = scanner.nextLong();
        System.out.println(courseService.find(id));

    }



}