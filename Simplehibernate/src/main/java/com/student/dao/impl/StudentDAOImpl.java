package com.student.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.student.dao.StudentDAO;
import com.student.entity.Student;
import com.student.service.DBconnect;

public class StudentDAOImpl implements StudentDAO {

	DBconnect connect = null;
	Session session = null;
	List<Student> list = null;

	public boolean saveStudent(Student student) {

		connect = new DBconnect();
		session = connect.getSession();
		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		} finally {
			session.close();
		}
		return true;
	}

	public List<Student> getStudentList() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		connect = new DBconnect();

		session = connect.getSession();
		try {
			session.beginTransaction();
			studentList = (ArrayList<Student>) session.createQuery("From Student").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error");
			return null;
		} finally {
			session.close();
		}

		return studentList;
	}

	public Student getStudentByName(String name) {
		
	
		return null;
	}

}
