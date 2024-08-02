package com.sample.apache;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camel-context.xml")
public class ApacheCamelProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelProjectApplication.class, args);
	}
}
