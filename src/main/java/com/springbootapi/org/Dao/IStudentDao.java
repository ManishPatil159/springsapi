package com.springbootapi.org.Dao;

import java.util.Collection;
import java.util.List;

import com.springbootapi.org.Entity.Student;

public interface IStudentDao {

	List<Student> getAllStudents();

	Student getStudentById(int id);

	void deleteStudent(int id);

	Student updateStudent(Student student);

	void insertStudent(Student student);

}