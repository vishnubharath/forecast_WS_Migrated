package com.cts.forcast.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.cts.forcast"} )
@ComponentScan(basePackages= {"com.cts.forcast"})
@PropertySource("classpath:forcast-common.properties")
@EntityScan(basePackages = {"com.cts.forcast"})
public class ForecastMain {

	public static void main(String[] args) {
		SpringApplication.run(ForecastMain.class, args);
	}
	
	
}
