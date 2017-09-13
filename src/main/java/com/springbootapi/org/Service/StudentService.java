package com.springbootapi.org.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.org.Entity.Student;
import com.springbootapi.org.Repository.StudentRepository;

/**
 * @author Manish Patil
 *
 */
@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository studentRepo;

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Service.IStudentService#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<>();
		studentRepo.findAll().forEach(studentList::add);
		return studentList;
	}

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Service.IStudentService#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return studentRepo.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Service.IStudentService#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int id) {
		studentRepo.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Service.IStudentService#updateStudent(com.springbootapi.org.Entity.Student)
	 */
	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Service.IStudentService#insertStudent(com.springbootapi.org.Entity.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		studentRepo.save(student);
	}
}
