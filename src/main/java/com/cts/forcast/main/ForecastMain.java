package com.cts.forcast.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.cts.forcast"})
public class ForecastMain {

	public static void main(String[] args) {
		SpringApplication.run(ForecastMain.class, args);
	}
}
