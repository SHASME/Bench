package spring.core;

public class EmployeeApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); 
		Employee emp = ctx.getBean("emp",Employee.class); 
		System.out.println(emp.getCode()+" "+emp.getEmpname());  
	}
}