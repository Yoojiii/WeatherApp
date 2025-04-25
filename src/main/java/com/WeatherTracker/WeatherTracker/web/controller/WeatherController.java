package com.WeatherTracker.WeatherTracker.web.controller;

import com.WeatherTracker.WeatherTracker.domain.model.WeatherApiModel;
import com.WeatherTracker.WeatherTracker.domain.service.WeatherService;
import com.WeatherTracker.WeatherTracker.web.mapper.WeatherMapper;
import com.WeatherTracker.WeatherTracker.web.model.WeatherRequest;
import com.WeatherTracker.WeatherTracker.web.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;
    private final WeatherMapper weatherMapper;

    public WeatherController(WeatherService weatherService, WeatherMapper weatherMapper) {
        this.weatherService = weatherService;
        this.weatherMapper = weatherMapper;
    }


    @PostMapping("/temperature")
    public WeatherResponse getTemperature(@RequestBody WeatherRequest request) {
        WeatherApiModel apiModel = weatherService.getTemperature(request);

        return weatherMapper.toResponse(apiModel);
    }
}
