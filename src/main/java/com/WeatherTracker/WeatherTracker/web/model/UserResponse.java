package com.WeatherTracker.WeatherTracker.web.model;

public class UserResponse {
    private String nickname;
    private String city;

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
