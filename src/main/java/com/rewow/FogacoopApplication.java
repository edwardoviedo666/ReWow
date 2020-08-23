package com.soaint.fogacoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RewowApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewowApplication.class, args);
	}

}
