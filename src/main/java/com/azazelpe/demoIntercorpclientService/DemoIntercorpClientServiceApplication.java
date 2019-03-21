package com.azazelpe.demoIntercorpclientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoIntercorpClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntercorpClientServiceApplication.class, args);
	}

}
