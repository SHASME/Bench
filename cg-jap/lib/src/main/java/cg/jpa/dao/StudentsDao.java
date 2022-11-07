package cg.jpa.dao;

import java.util.List;

import cg.jpa.entities.Student;

public interface StudentsDao {
	int addStudents(Student std);
	List<Student> getAllStudents();
}

