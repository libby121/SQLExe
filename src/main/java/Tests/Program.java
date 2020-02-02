package Tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import beans.CEO;
import beans.Employee;
import beans.CEO;

public class Program {

	public static void main(String[] args) {

		
		
		try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class)){

		
						
			Employee emp= ctx.getBean(Employee.class, "rami", 25, "pyhton developer", 15);
			Employee emp1= ctx.getBean(Employee.class, "yael", 28, "pyhton developer", 12);
			Employee emp2= ctx.getBean(Employee.class, "bar", 13, "pyhton developer", 10);
			
			System.out.println(emp+"\n "+emp1+"\n "+emp2);
			
			

		}}
	
}
