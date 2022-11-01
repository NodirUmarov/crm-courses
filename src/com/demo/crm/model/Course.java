package com.demo.crm.model;

public class Course extends BaseModel {

    private String courseName;
    private String courseType;

    public Course() {
    }

    public Course(Long id, String courseName, String courseType) {
        super(id);
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                " id = " + getId() +
                ", courseName = '" + courseName + '\'' +
                ", courseType = " + courseType +
                ", createDate = " + getCreateDate() +
                '}';
    }
}
