package com.demo.crm.dao.impl;

import com.demo.crm.dao.CourseDao;
import com.demo.crm.model.Course;
import com.demo.crm.service.CourseTypeService;


import java.io.*;
import java.util.Scanner;

public class CourseDaoImplFile implements CourseDao {

    private File pathToFile;
    private File pathToFolder;

    private CourseTypeService courseTypeService;



    public CourseDaoImplFile() {
        pathToFolder = new File("C:\\Users\\Elbek\\Java_Course\\Download");
        pathToFile = new File(pathToFolder + "\\course.txt");
        CourseTypeService courseTypeService1 = new CourseTypeService();

        if (!pathToFolder.exists()) {
            pathToFolder.mkdirs();
        }

        if (!pathToFile.exists()) {
            try {
                pathToFile.createNewFile();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }
    }

    @Override
    public Course save(Course course) {
        try {
            FileWriter fileWriter = new FileWriter(pathToFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(course.getId());
            printWriter.println(course.getCourseName());
            printWriter.println(course.getCourseType());

            printWriter.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return course;
    }

    @Override
    public Course find(Long id) {
        Course course = null;
        try {
            Scanner scanner = new Scanner(pathToFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine(); // "1"
                if (line.trim().equals(String.valueOf(id))) {
                    course = new Course();
                    course.setId(Long.parseLong(line));
                    course.setCourseName(scanner.nextLine());
                    course.setCourseType(courseTypeService.create());
                }
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        return course;
    }
}
