package spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBoot {
public static void main(String[] args) {
	SpringApplication.run(HelloSpringBoot.class, args);
	System.out.println("This is a sample boot application");
	System.out.println("Hello this is Shashikumar M E");
}
}
