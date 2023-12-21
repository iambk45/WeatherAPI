package com.task.weather.WeatherAPI.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

public interface WeatherService {
    ResponseEntity<String> getWeatherByLocation(String location) throws HttpClientErrorException.TooManyRequests;
    ResponseEntity<String> getHourlyWeatherByLocation(String location) throws HttpClientErrorException.TooManyRequests;

}
