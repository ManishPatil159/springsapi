package com.springbootapi.org.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springbootapi.org.Entity.Student;

@Transactional
@Repository
@Qualifier("SampleData")
public class StudentDao implements IStudentDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.springbootapi.org.Dao.IStudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents(){
		String hql="SELECT stud FROM Student stud";
		return (List<Student>)entityManager.createQuery(hql).getResultList();
	}
	
	/* (non-Javadoc)
	 * @see com.springbootapi.org.Dao.IStudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}

	/* (non-Javadoc)
	 * @see com.springbootapi.org.Dao.IStudentDao#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int id) {
		entityManager.remove(getStudentById(id));
	}
	
	/* (non-Javadoc)
	 * @see com.springbootapi.org.Dao.IStudentDao#updateStudent(com.springbootapi.org.Entity.Student)
	 */
	@Override
	public Student updateStudent(Student student) {
		Student repoStudent=getStudentById(student.getId());
		repoStudent.setCourse(student.getCourse());
		repoStudent.setName(student.getName());
		entityManager.flush();
		return repoStudent;
		
	}
	
	/* (non-Javadoc)
	 * @see com.springbootapi.org.Dao.IStudentDao#insertStudent(com.springbootapi.org.Entity.Student)
	 */
	@Override
	public void insertStudent(Student student) {
		entityManager.persist(student);
	}
	
}
