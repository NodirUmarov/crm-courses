package com.demo.crm.dao;

import com.demo.crm.model.Course;

public interface CourseDao {
    public Course save(Course course);
    public Course find(Long id);
}
