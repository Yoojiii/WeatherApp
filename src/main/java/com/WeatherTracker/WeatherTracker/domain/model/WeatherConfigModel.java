package com.WeatherTracker.WeatherTracker.domain.model;

public class WeatherConfigModel {
    private String city;
    private final String apiKey = "60c581c479853141f0d284b3d8c5e928";
    private final String apiUrl = "http://api.openweathermap.org/data/2.5/weather";

    public String getApiKey() {
        return apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
