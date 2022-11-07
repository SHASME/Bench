package spring.coree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Customer cust1 = ctx.getBean("cust",Customer.class);
		Customer cust2 = ctx.getBean("cust",Customer.class);
		cust2.setCode(1822); 
		cust1.setCustname("JAMES"); 
		System.out.println(cust1.getCode()+" "+cust1.getCustname()+" "+cust1.getCommn());
		System.out.println(cust2.getCode()+" "+cust2.getCustname()+" "+cust2.getCommn());
	}
}