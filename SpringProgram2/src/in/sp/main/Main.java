package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.infogalaxy.beans.Student;
import in.infogalaxy.resources.SpringConfigFile;

public class Main {
	
	private static ApplicationContext context;

	public static void main(String args[]) {
		
		context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		// Student std = (Student) context.getBean("stdId1");
		// std.display();
		
		// Student std = context.getBean(Student.class);
		// std.display();
		
		// Student std = (Student) context.getBean("StdObj");
		// std.display();
		
		Student std1 = (Student) context.getBean("StdObj1");
		std1.display();
		
		System.out.println("---------------------------------");
		
		Student std2 = (Student) context.getBean("StdObj2");
		std2.display();
		
	}

}
