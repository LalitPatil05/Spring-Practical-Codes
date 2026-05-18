package in.infogalaxy.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.infogalaxy.beans.Address;
import in.infogalaxy.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		
		addr.setPlot(15);
		addr.setStreet("Patel Nagar");
		addr.setCity("Shahada");
		addr.setPincode(425409);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student student = new Student();
		
		student.setRollno(101);
		student.setName("Pavan");
		// student.setAddress(createAddressObj()); Manual DI
		
		return student;
	}
	
}
