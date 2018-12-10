package org.com.dao;

import org.com.entities.city;

public interface ICityDao {
        public city findAll();
        public int addCity(city c);
        public int updateCity(city c);
        public int delCity(int id);

}
