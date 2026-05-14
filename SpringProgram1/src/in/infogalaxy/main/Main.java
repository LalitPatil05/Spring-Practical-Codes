package in.infogalaxy.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.infogalaxy.beans.Student;

public class Main {
	
	public static void main(String args[]) {
		
		String config_loc = "in/infogalaxy/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student student = (Student) context.getBean("stdId1");
		student.display();
		
		System.out.println("===============================");
		
		Student student2 = (Student) context.getBean("stdId2");
		student2.display();
		
		System.out.println("===============================");
		
		Student student3 = (Student) context.getBean("stdId3");
		student3.display();
		
	}
	
}
