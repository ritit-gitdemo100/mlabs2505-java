package com.rit.config.p1simple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

	
	@Bean
	public Bicycle bicycle() {
		return new Bicycle();
	}
	
}


//We have define each bean objects here in config class
//alternatively we can have @ComponentScan