package com.example.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init(){
		LOGGER.info("Application Started");
	}

	public static void main(String[] args)
	{
		LOGGER.info("Application Running");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
