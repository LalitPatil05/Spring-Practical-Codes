package in.infogalaxy.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.infogalaxy.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("StdObj1")
	public Student createStdBeanObj1() {
		
		Student std = new Student();
		
		std.setrollno(101);
		std.setName("Yogesh");
		std.setEmail("yogesh@gmail.com");
		
		return std; 
	}
	
	@Bean("StdObj2")
	public Student createStdBeanObj2() {
		
		Student std = new Student();
		
		std.setrollno(102);
		std.setName("Yash");
		std.setEmail("yash@gmail.com");
		
		return std; 
	}

}
