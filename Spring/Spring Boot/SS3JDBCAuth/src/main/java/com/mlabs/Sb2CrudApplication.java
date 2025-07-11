package com.mlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Sb2CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb2CrudApplication.class, args);
		
		System.out.println("User : "+new BCryptPasswordEncoder().encode("user"));
		System.out.println("Admin : "+new BCryptPasswordEncoder().encode("admin"));
	}

}
