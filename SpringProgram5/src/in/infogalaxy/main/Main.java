package in.infogalaxy.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.infogalaxy.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String config_file_loc = "/in/infogalaxy/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student student = (Student) context.getBean("studId");
		student.display();
		
	}

}
