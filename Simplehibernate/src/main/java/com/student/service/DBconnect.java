package com.student.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBconnect {
	public Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure("com/student/service/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
