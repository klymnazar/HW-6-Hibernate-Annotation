package com.HW6.dao;

import com.HW6.config.HibernateUtils;
import com.HW6.entity.School;
import org.hibernate.Session;

public class SchoolDao {

    HibernateUtils hibernateUtils = new HibernateUtils();
    Session session = hibernateUtils.getSessionFactory().openSession();

    public SchoolDao() {
    }

    public void save(School school) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(school);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void update(School school) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(school);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }

    public void delete(School school) {
        Session session = hibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(school);
        session.getTransaction().commit();
        session.close();
//        HibernateUtils.close();
    }


    public School findById(int id) {
        return hibernateUtils.getSessionFactory().openSession().get(School.class, id);
    }

}
