package com.task.weather.WeatherAPI.controller;

import com.task.weather.WeatherAPI.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping(value = "/{location}")
    public ResponseEntity<String> getWeatherForecastByCity(@PathVariable("location") String location){
        try {
            return weatherService.getWeatherByLocation(location);
        }catch (HttpClientErrorException.TooManyRequests exception){
            return ResponseEntity.status(429).body("Too Many Requests. Daily Quota Exhausted. Please try again tomorrow or change the X-RapidAPI-Key in the application.yaml File.");
        }
    }

    @GetMapping(value = "/{location}/hourly")
    public ResponseEntity<String> getHourlyWeatherForecastByCity(@PathVariable("location") String location){
        try {
            return weatherService.getHourlyWeatherByLocation(location);
        }catch (HttpClientErrorException.TooManyRequests exception){
            return ResponseEntity.status(429).body("Too Many Requests. Daily Quota Exhausted. Please try again tomorrow or change the X-RapidAPI-Key in the application.yaml File.");
        }
    }
}
