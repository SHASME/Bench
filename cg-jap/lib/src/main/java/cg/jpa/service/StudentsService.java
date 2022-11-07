package cg.jpa.service;

import java.util.List;

import cg.jpa.entities.Student;

public interface StudentsService {
	int addStudents(Student std);
	List<Student> getAllStudents();
}

