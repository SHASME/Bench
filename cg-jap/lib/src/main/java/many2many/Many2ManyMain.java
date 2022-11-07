package many2many;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2ManyMain {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction tran = manager.getTransaction();

	Bank bank1 = new Bank();
	bank1.setName("AXIS");
	bank1.setBranchName("SHIMOGA");
	bank1.setSwiftCode("AS8292");

	Bank bank2 = new Bank();
	bank2.setName("KBI");
	bank2.setBranchName("Soraba");
	bank2.setSwiftCode("KBI0712");

	Set<Bank> banks = new HashSet<Bank>();
	banks.add(bank1);
	banks.add(bank2);

	Customer c1 = new Customer();
	c1.setName("SHASHI");
	c1.setMobile(7328611L); 

	Customer c2 = new Customer();
	c2.setName("SHAAAJK");
	c2.setMobile(898245L);

	Customer c3 = new Customer();
	c3.setName("sagar");
	c3.setMobile(900043L); 

	Customer c4 = new Customer();
	c4.setName("HULI");
	c4.setMobile(228335L); 

	Set<Customer> customerSet1 = new HashSet<Customer>();
	customerSet1.add(c1);
	customerSet1.add(c2);
	bank1.setCustomers(customerSet1);

	Set<Customer> customerSet2 = new HashSet<Customer>();
	customerSet2.add(c2);
	customerSet2.add(c3);
	customerSet2.add(c4);
	bank2.setCustomers(customerSet2); 

	tran.begin();
	manager.persist(bank1);
	manager.persist(bank2);
	tran.commit();
	manager.close();

}
}
