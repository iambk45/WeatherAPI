package com.task.weather.WeatherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;

@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
		System.out.println("Application is running");
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
