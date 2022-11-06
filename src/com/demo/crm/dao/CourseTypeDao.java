package com.demo.crm.dao;

import com.demo.crm.model.CourseType;

public interface CourseTypeDao {
    public CourseType save(CourseType courseType);
    public CourseType find(Long id);
}
