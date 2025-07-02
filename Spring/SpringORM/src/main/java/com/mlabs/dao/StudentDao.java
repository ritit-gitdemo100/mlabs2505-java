package com.mlabs.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mlabs.entity.Student;

@Repository
public class StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void insert(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Transactional(readOnly = true)
    public Student getById(int id) {
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }

    @Transactional(readOnly = true)
    public List<Student> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Student", Student.class).list();
    }

    @Transactional
    public void update(Student student) {
        sessionFactory.getCurrentSession().update(student);
    }

    @Transactional
    public void delete(int id) {
        Student s = sessionFactory.getCurrentSession().get(Student.class, id);
        if (s != null)
            sessionFactory.getCurrentSession().delete(s);
    }
}
