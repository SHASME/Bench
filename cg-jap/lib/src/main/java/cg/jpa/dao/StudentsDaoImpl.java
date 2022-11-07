package cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cg.jpa.entities.Student;

public class StudentsDaoImpl implements StudentsDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	@Override
	public int addStudents(Student std) {
		transaction.begin();
		manager.persist(std);
		transaction.commit();
		return std.getRlno();
	}
	@Override
	public List<Student> getAllStudents() {
		
		Query qry = manager.createNamedQuery("findall");
		return qry.getResultList();
	}
}
	
	