package com.soaint.fogacoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FogacoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FogacoopApplication.class, args);
	}

}
