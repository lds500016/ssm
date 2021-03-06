package org.com.dao;

import org.com.entities.major;

public interface IMajorDao {
    public major findAll();
    public int addMajor(major m);
    public int updateMajor(major m);
    public int delMajor(int id);
}
