package com.WeatherTracker.WeatherTracker.web.model;

public class WeatherRequest {
    private String city;

    public WeatherRequest(String city) {
        this.city = city;
    }

    public String getApiKey() {
        return "60c581c479853141f0d284b3d8c5e928";
    }

    public String getApiUrl() {
        return "http://api.openweathermap.org/data/2.5/weather";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
