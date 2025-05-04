package com.WeatherTracker.WeatherTracker.web.mapper;

import com.WeatherTracker.WeatherTracker.domain.model.WeatherApiModel;
import com.WeatherTracker.WeatherTracker.domain.model.WeatherConfigModel;
import com.WeatherTracker.WeatherTracker.web.model.WeatherRequest;
import com.WeatherTracker.WeatherTracker.web.model.WeatherResponse;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper {
    public WeatherResponse toResponse(WeatherApiModel apiModel){
        WeatherResponse response = new WeatherResponse();
        response.setTemp(apiModel.getMain().getTemp());

        return response;
    }

    public WeatherConfigModel toModel(WeatherRequest request){
        WeatherConfigModel model = new WeatherConfigModel();
        model.setCity(request.getCity());

        return model;
    }
}
