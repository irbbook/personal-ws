package spring.api.personnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value = {@ComponentScan("spring.api.share")})
public class PersonnalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonnalApplication.class, args);
	}

}
