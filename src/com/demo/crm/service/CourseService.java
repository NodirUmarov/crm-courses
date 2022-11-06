package com.demo.crm.service;

import com.demo.crm.dao.CourseDao;
import com.demo.crm.dao.impl.CourseDaoImplFile;
import com.demo.crm.model.Course;
import com.demo.crm.model.CourseType;
import com.demo.crm.model.builder.CourseBuilder;


import java.util.Scanner;

public class CourseService {
    private Scanner scanner;

    private static Long idCounter;
    private CourseTypeService courseTypeService;

    private CourseDao courseDao;

    static {
        idCounter = 0L;
    }

    public CourseService() {
        this.scanner = new Scanner(System.in);
        courseTypeService = new CourseTypeService();
        this.courseDao = new CourseDaoImplFile();
    }

    public Course create() {
        System.out.println("Creating course... ");

        System.out.println("Please, enter course data below");
        System.out.print("Course name: ");
        String courseName = scanner.nextLine();

        System.out.print("Course type: ");
        CourseType courseType = courseTypeService.create();

        return courseDao.save(CourseBuilder.builder()
                .id(++idCounter)
                .courseName(courseName)
                .courseType(courseType)
                .build());
    }

    public Course find(Long id) {
        return courseDao.find(id);
    }

}
