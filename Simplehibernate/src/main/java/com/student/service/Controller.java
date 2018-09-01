package com.student.service;

import java.util.List;

import com.student.dao.impl.StudentDAOImpl;
import com.student.entity.Student;

public class Controller {
	public static void main(String args[]) {
		Student st = new Student();
		st.setName("deepak");
		st.setAddress("ABC");
		StudentDAOImpl impl = new StudentDAOImpl();
		boolean check = impl.saveStudent(st);
		if (check) {
			System.out.println("Save Student successfully");
		} else {
			System.out.println("something went wrong");
		}
		List<Student> list = impl.getStudentList();
		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAddress());
		}

		Student userDetails = impl.getStudentByName("Deepak");

	}

}
