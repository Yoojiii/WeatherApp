package com.WeatherTracker.WeatherTracker.domain.service;

import com.WeatherTracker.WeatherTracker.domain.model.WeatherApiModel;
import com.WeatherTracker.WeatherTracker.domain.model.WeatherConfigModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public WeatherApiModel getTemperature(WeatherConfigModel weatherConfigModel) {
        String url = String.format("%s?q=%s&appid=%s&units=metric", weatherConfigModel.getApiUrl(), weatherConfigModel.getCity(), weatherConfigModel.getApiKey());
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, WeatherApiModel.class); //return apiModel
    }

}
