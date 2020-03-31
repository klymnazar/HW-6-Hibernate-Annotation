package com.HW6.dao;

import com.HW6.config.HibernateUtils;
import com.HW6.entity.Student;
import org.hibernate.Session;

public class StudentDao {

    HibernateUtils hibernateUtils = new HibernateUtils();
    Session session = hibernateUtils.getSessionFactory().openSession();

    public StudentDao() {
    }

    public void save(Student student) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void update(Student student) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void delete(Student student) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }


    public Student findById(int id) {
        return hibernateUtils.getSessionFactory().openSession().get(Student.class, id);
    }


}
