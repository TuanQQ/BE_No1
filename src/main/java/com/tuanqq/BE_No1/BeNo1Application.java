package com.tuanqq.BE_No1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeNo1Application {
	private static final Logger log = LoggerFactory.getLogger(BeNo1Application.class);
	public static void main(String[] args) {
		log.info("Starting BeNo1 Backend: Start");
		SpringApplication.run(BeNo1Application.class, args);
	}

}
