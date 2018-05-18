package org.cfd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.cfd.api.repository")
@EntityScan("org.cfd.api.domain")
public class CFDRestAPIApplication extends SpringBootServletInitializer {

	private static Class<CFDRestAPIApplication> cfdKlazz = CFDRestAPIApplication.class;

	public static void main(String args[]) {

		SpringApplication.run(cfdKlazz, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(cfdKlazz);
	}
}
