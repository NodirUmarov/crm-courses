package com.demo.crm.dao.impl;

import com.demo.crm.dao.CourseTypeDao;
import com.demo.crm.model.CourseType;
import com.demo.crm.model.enums.CourseFormats;

import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;

public class CourseTypeDaoImplFile implements CourseTypeDao {

    private File pathToFile;

    private File pathToFolder;

    public CourseTypeDaoImplFile() {
        pathToFolder = new File("C:\\Users\\Elbek\\Java_Course\\Download");
        pathToFile = new File(pathToFolder + "\\CourseType.txt");

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
    public CourseType save(CourseType courseType) {
        try {
            FileWriter fileWriter = new FileWriter(pathToFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(courseType.getId());
            printWriter.println(courseType.getTypeName());
            printWriter.println(courseType.getDurationOfCourse());
            printWriter.println(courseType.getDurationOfLesson());
            printWriter.println(courseType.getLessonsPerWeek());
            printWriter.println(courseType.getPricePerMonth());
            printWriter.println(courseType.getOffline());
            printWriter.println(courseType.getFormat());

            printWriter.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return courseType;
    }

    @Override
    public CourseType find(Long id) {
        CourseType courseType = null;
        try {
            Scanner scanner = new Scanner(pathToFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.trim().equals(String.valueOf(id))) {
                    courseType = new CourseType();
                    courseType.setId(Long.parseLong(line));
                    courseType.setTypeName(scanner.nextLine());
                    courseType.setDurationOfCourse(scanner.nextInt());
                    courseType.setDurationOfLesson(LocalTime.parse(toString()));
                    courseType.setPricePerMonth(scanner.nextDouble());
                    courseType.setOffline(scanner.nextBoolean());
                    courseType.setFormat(CourseFormats.valueOf(scanner.nextLine().trim().toUpperCase()));
                }
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        return courseType;
    }
}
