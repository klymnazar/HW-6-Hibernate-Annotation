package com.HW6.services;

import com.HW6.dao.SchoolDao;
import com.HW6.entity.School;

public class SchoolServices {

    private SchoolDao schoolDao = new SchoolDao();

    public void saveSchool(School school) {
        schoolDao.save(school);
    }

    public void updateSchoolt(School school) {
        schoolDao.update(school);
    }

    public void deleteSchool(School school) {
        schoolDao.delete(school);
    }

    public School findSchool(int id) {
        return schoolDao.findById(id);
    }



}
