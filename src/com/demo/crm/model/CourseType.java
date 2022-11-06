package com.demo.crm.model;

import com.demo.crm.model.enums.CourseFormats;

import java.time.LocalTime;

public class CourseType extends BaseModel {

    private String typeName;
    private Integer durationOfCourse;
    private LocalTime durationOfLesson;
    private Integer lessonsPerWeek;
    private Double pricePerMonth;
    private Boolean isOffline;
    private CourseFormats format;

    public CourseType() {

    }
    public CourseType(Long id, String typeName, Integer durationOfCourse, LocalTime durationOfLesson,
                      Integer lessonsPerWeek, Double pricePerMonth, Boolean isOffline, CourseFormats format) {
        super(id);
        this.typeName = typeName;
        this.durationOfCourse = durationOfCourse;
        this.durationOfLesson = durationOfLesson;
        this.lessonsPerWeek = lessonsPerWeek;
        this.pricePerMonth = pricePerMonth;
        this.isOffline = isOffline;
        this.format = format;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getDurationOfCourse() {
        return durationOfCourse;
    }

    public void setDurationOfCourse(Integer durationOfCourse) {
        this.durationOfCourse = durationOfCourse;
    }

    public LocalTime getDurationOfLesson() {
        return durationOfLesson;
    }

    public void setDurationOfLesson(LocalTime durationOfLesson) {
        this.durationOfLesson = durationOfLesson;
    }

    public Integer getLessonsPerWeek() {
        return lessonsPerWeek;
    }

    public void setLessonsPerWeek(Integer lessonsPerWeek) {
        this.lessonsPerWeek = lessonsPerWeek;
    }

    public Double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public Boolean getOffline() {
        return isOffline;
    }

    public void setOffline(Boolean offline) {
        isOffline = offline;
    }

    public CourseFormats getFormat() {
        return format;
    }

    public void setFormat(CourseFormats format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "CourseType{" +
                " id = " + getId() +
                ", typeName = '" + typeName + '\'' +
                ", durationOfCourse = " + durationOfCourse +
                ", durationOfLesson = " + durationOfLesson +
                ", lessonsPerWeek = " + lessonsPerWeek +
                ", pricePerMonth = " + pricePerMonth +
                ", isOffline = " + isOffline +
                ", format = " + format +
                ", offline = " + getOffline() +
                ", createDate = " + getCreateDate() +
                '}';
    }
}
