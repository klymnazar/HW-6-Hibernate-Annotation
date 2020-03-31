package com.HW6.services;

import com.HW6.dao.StudentDao;
import com.HW6.entity.Student;

public class StudentServices {

    private StudentDao studentDao = new StudentDao();

    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    public void deleteStudent(Student student) {
        studentDao.delete(student);
    }

    public Student findStudent(int id) {
        return studentDao.findById(id);
    }



}
