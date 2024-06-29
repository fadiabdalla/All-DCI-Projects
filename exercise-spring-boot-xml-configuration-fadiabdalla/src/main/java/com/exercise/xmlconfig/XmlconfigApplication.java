package com.exercise.xmlconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class XmlconfigApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
		SpringApplication.run(XmlconfigApplication.class, args);

		CarProcessor cs = applicationContext.getBean(CarProcessor.class);

		cs.processCar("Starting...");
	}

}
