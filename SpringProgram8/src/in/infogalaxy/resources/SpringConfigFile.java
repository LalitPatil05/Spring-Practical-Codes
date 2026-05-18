package in.infogalaxy.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.infogalaxy.beans.Address;
import in.infogalaxy.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address add = new Address(15, "Shiv Nagar", "Shahada", 425409);
		
		return add;
	}
	
	@Bean
	public Student createStudentObj() {
		Student student = new Student(101, "Umesh", createAddressObj());
	
		return student;
	}
}
