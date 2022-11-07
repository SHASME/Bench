package cg.jap;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class StudentsNamedQueries {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();

		Query qry = manager.createNamedQuery("findall");
		List<Students> stdlist = qry.getResultList();
		for(Students s : stdlist)
			System.out.println(s.getRlno()+" "+s.getStudentsName()); 

		Query qry2 = manager.createNamedQuery("findById");
		qry2.setParameter(1, 2);
		stdlist = qry2.getResultList();
		for(Students s : stdlist)
			System.out.println(s.getRlno()+" "+s.getStudentsName()); 
	}

}

