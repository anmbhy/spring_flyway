package com.anmbhy.springflyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringflywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringflywayApplication.class, args);
	}

}
