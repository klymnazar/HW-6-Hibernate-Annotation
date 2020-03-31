package com.HW6.services;

import com.HW6.dao.SubjectDao;
import com.HW6.entity.Subject;

public class SubjectServices {

    private SubjectDao subjectDao = new SubjectDao();

    public void saveSubject(Subject subject) {
        subjectDao.save(subject);
    }

    public void updateSubject(Subject subject) {
        subjectDao.update(subject);
    }

    public void deleteSubject(Subject subject) {
        subjectDao.delete(subject);
    }

    public Subject findSubject(int id) {
        return subjectDao.findById(id);
    }



}
