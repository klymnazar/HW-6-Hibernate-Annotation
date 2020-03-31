package com.HW6.dao;

import com.HW6.config.HibernateUtils;
import com.HW6.entity.Subject;
import org.hibernate.Session;

public class SubjectDao {

    HibernateUtils hibernateUtils = new HibernateUtils();
    Session session = hibernateUtils.getSessionFactory().openSession();

    public SubjectDao() {
    }

    public void save(Subject subject) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(subject);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void update(Subject subject) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(subject);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void delete(Subject subject) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(subject);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }


    public Subject findById(int id) {
        return hibernateUtils.getSessionFactory().openSession().get(Subject.class, id);
    }



}
