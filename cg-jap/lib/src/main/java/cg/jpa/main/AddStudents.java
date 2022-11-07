package cg.jpa.main;

import java.util.List;

import cg.jpa.entities.Student;
import cg.jpa.service.StudentsService;
import cg.jpa.service.StudentsServiceImpl;

public class AddStudents {
	public static void main(String[] args) {
		StudentsService service = new StudentsServiceImpl();
		Student std = new Student();
		std.setStudentsName("ddd");
		//int id = service.addStudents(std);
		//System.out.println("id = "+id);
		List<Student> stdList = service.getAllStudents();
		for(Student s : stdList)
		System.out.println(s.getRlno()+" "+s.getStudentsName());  
	}

}
