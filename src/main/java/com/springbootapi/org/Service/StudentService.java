package com.springbootapi.org.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springbootapi.org.Dao.IStudentDao;
import com.springbootapi.org.Entity.Student;

@Service
public class StudentService implements IStudentService {
	@Autowired
	@Qualifier("SampleData")
	private IStudentDao studentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springbootapi.org.Service.IStudentService#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springbootapi.org.Service.IStudentService#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.springbootapi.org.Service.IStudentService#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.springbootapi.org.Service.IStudentService#updateStudent(com.springbootapi
	 * .org.Entity.Student)
	 */
	@Override
	public Student updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.springbootapi.org.Service.IStudentService#insertStudent(com.springbootapi
	 * .org.Entity.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
	}
}
