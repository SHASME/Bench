package cg.jpa.service;

import java.util.List;

import cg.jpa.dao.StudentsDao;
import cg.jpa.dao.StudentsDaoImpl;
import cg.jpa.entities.Student;

public class StudentsServiceImpl  implements StudentsService{
	StudentsDao dao = new StudentsDaoImpl();

	@Override
	public int addStudents(Student std) {
		// TODO Auto-generated method stub
		return dao.addStudents(std);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}
	}
	