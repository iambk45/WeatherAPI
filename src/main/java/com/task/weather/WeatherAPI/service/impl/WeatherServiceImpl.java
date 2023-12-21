package com.task.weather.WeatherAPI.service.impl;

import com.task.weather.WeatherAPI.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    RestTemplate template;

    @Value("${Rapid.Key}")
    String rapidKey;

    @Value("${Rapid.Host}")
    String rapidHost;
    @Override
    public ResponseEntity<String> getWeatherByLocation(String location) throws HttpClientErrorException.TooManyRequests {
        return template.exchange("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + location + "/summary/",
                HttpMethod.GET, getEntity(), String.class);
    }

    @Override
    public ResponseEntity<String> getHourlyWeatherByLocation(String location) throws HttpClientErrorException.TooManyRequests {
        return template.exchange("https://forecast9.p.rapidapi.com/rapidapi/forecast/"+location+"/hourly/",
                HttpMethod.GET,getEntity(),String.class);
    }

    private HttpEntity<String> getEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-RapidAPI-Key",rapidKey);
        headers.add("X-RapidAPI-Host",rapidHost);
        return new HttpEntity<>(headers);
    }
}
