package com.demo.crm;

import com.demo.crm.model.Course;
import com.demo.crm.model.CourseType;
import com.demo.crm.model.Mentor;
import com.demo.crm.model.Student;
import com.demo.crm.service.CourseService;
import com.demo.crm.service.CourseTypeService;
import com.demo.crm.service.MentorService;
import com.demo.crm.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = studentService.create();

        MentorService mentorService = new MentorService();
        Mentor mentor = mentorService.create();

        CourseService courseService = new CourseService();
        Course course = courseService.create();

        CourseTypeService courseTypeService = new CourseTypeService();
        CourseType courseType = courseTypeService.create();

        System.out.println(student);
        System.out.println(mentor);
        System.out.println(course);
        System.out.println(courseType);
    }
}