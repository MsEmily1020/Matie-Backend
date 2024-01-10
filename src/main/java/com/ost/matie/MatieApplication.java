package com.ost.matie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MatieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatieApplication.class, args);
	}

}
