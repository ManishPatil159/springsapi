package com.springbootapi.org.Repository;


import org.springframework.data.repository.CrudRepository;

import com.springbootapi.org.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
//		public List<Student> getStudentByName(String name);
}