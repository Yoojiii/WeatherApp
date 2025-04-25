package com.WeatherTracker.WeatherTracker.web.model;

public class UserRequest {
    private String nickname;
    private String password;
    private String city;


    public UserRequest(String nickname, String password, String city) {
        this.nickname = nickname;
        this.password = password;
        this.city = city;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
