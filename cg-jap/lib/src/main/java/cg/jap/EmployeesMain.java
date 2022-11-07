package cg.jap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeesMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Employee emp = new Employee();
		emp.setEmpcode(200);
		emp.setEmpname("sk");
		emp.setSalary(1360); 

		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		manager.close();


	}

}
