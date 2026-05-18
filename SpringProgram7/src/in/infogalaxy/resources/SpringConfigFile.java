package in.infogalaxy.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.infogalaxy.beans.Address;
import in.infogalaxy.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address add = new Address();
		
		add.setPlot(15);
		add.setStreet("Kartik Nagar");
		add.setCity("Shahada");
		add.setPincode(425409);
		
		return add;
	}
	
	@Bean
	public Student createStudentObj() {
		Student student = new Student();
		
		student.setRollno(101);
		student.setName("Shubham");
		student.setAddress(createAddressObj());
		
		return student;
	}
}
