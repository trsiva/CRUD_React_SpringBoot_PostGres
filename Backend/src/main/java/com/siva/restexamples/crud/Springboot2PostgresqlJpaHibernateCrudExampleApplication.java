package com.siva.restexamples.crud;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@ComponentScans({ @ComponentScan("net.guides.springboot2.crud.config")})
@EnableWebSecurity
public class Springboot2PostgresqlJpaHibernateCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2PostgresqlJpaHibernateCrudExampleApplication.class, args);
	}

}


