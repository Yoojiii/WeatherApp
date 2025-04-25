package com.WeatherTracker.WeatherTracker.domain.service;

import com.WeatherTracker.WeatherTracker.domain.model.WeatherApiModel;
import com.WeatherTracker.WeatherTracker.web.model.WeatherRequest;
import com.WeatherTracker.WeatherTracker.web.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    //Надо будет исправить этот момент
    public WeatherApiModel getTemperature(WeatherRequest request) {
        String url = String.format("%s?q=%s&appid=%s&units=metric", request.getApiUrl(), request.getCity(), request.getApiKey());
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, WeatherApiModel.class); //return apiModel
    }

}
