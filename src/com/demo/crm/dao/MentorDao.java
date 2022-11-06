package com.demo.crm.dao;

import com.demo.crm.model.Mentor;

public interface MentorDao {
    public Mentor save(Mentor mentor);
    public Mentor find(Long id);
}
