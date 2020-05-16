package com.mind2codes.gsemaquis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GsemaquisApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsemaquisApplication.class, args);
	}

}
