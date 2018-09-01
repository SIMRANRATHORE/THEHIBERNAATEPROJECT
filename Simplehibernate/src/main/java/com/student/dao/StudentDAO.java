package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface StudentDAO {

	public boolean saveStudent(Student student);

	public List<Student> getStudentList();

	public Student getStudentByName(String name);
}
