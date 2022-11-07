package cg.jap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeQueries {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	// to get single entity
	 try {
		 Employee emp = manager.find(Employee.class, 100);
		 System.out.println(emp.getEmpcode()+" "+ emp.getEmpname()+ " "+ emp.getSalary());
	 }
	 catch(NullPointerException e) {
	// e.printStackTrace();
	 System.out.println("Employee doesn't exit.....");
}
	 manager.clear();
}
}