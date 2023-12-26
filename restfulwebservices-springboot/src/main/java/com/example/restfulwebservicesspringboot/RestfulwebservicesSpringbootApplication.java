package com.example.restfulwebservicesspringboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Shiva",
						email = "a.shiva16052000@gmail.com",
						url = "https://www.linkedin.com/in/arukondashiva/"
				),
				license = @License(
						name = "Apache 2.000",
						url = "https://www.linkedin.com/in/arukondashiva/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "https://www.linkedin.com/in/arukondashiva/"
		)
)
public class RestfulwebservicesSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulwebservicesSpringbootApplication.class, args);
	}

}
