package com.demo.crm.dao;

import com.demo.crm.model.Student;

public interface StudentDao {
    public Student save(Student student);
    public Student find(Long id);

}
