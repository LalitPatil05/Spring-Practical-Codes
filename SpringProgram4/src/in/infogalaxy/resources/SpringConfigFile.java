package in.infogalaxy.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("in.infogalaxy.beans")
//@ComponentScan({"in.infogalaxy.beans"})
@ComponentScan(basePackages = {"in.infogalaxy.beans"})

public class SpringConfigFile {
	
}
