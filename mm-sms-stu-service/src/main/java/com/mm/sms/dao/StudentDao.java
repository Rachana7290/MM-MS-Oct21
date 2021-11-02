/**
 * 
 */
package com.mm.sms.dao;

import java.util.List;

import com.mm.sms.entity.Student;

/**
 * @author USER
 *
 */
public interface StudentDao {
	List<Student> getStudentsList();

	Student getStudentByRollno(Long rollno);

	Student addStudent(Student student);

	Student modifyStudent(Student student, Long rollno);

	Student removeStudent(Long rollno);

	Student findByRollno(Long rollno);

	List<Student> findByName(String name);

	List<Student> findByFee(Double fee);
}
