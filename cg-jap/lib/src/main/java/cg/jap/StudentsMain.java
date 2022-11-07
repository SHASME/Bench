package cg.jap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentsMain {
	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Students std = new Students();
	std.setStudentsName("sss");
    transaction.begin();
    manager.persist(std);
    transaction.commit();
    manager.close();
    
}
}

