package spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptApplication {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	Department dept = ctx.getBean("dept",Department.class);
	System.out.println(dept.getDeptno()+" "+dept.getDeptname());
}
}
