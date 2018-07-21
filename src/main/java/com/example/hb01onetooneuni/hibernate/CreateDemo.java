package com.example.hb01onetooneuni.hibernate;

import com.example.hb01onetooneuni.Model.Instructor;
import com.example.hb01onetooneuni.Model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Instructor instructor = new Instructor("Konrad", "xxx", "supa@pl");
            InstructorDetail instructorDetail = new InstructorDetail("redtube.com", "Picking in the nose");
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
