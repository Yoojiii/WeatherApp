package com.WeatherTracker.WeatherTracker.web.controller;

import com.WeatherTracker.WeatherTracker.domain.service.UserService;
import com.WeatherTracker.WeatherTracker.web.mapper.UserMapper;
import com.WeatherTracker.WeatherTracker.web.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/create")
    public String createUser(@RequestBody UserRequest userRequest){
        return userService.createUser(userMapper.requestToDomain(userRequest));
    }
}
