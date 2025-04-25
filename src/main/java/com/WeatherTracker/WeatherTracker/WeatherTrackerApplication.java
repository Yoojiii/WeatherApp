package com.WeatherTracker.WeatherTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WeatherTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherTrackerApplication.class, args);
	}
}
