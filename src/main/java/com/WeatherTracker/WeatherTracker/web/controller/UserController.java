package com.WeatherTracker.WeatherTracker.web.controller;

import com.WeatherTracker.WeatherTracker.domain.service.UserService;
import com.WeatherTracker.WeatherTracker.web.mapper.UserMapper;
import com.WeatherTracker.WeatherTracker.web.model.UserLogin;
import com.WeatherTracker.WeatherTracker.web.model.UserRequest;
import com.WeatherTracker.WeatherTracker.web.model.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    @PostMapping("/findByNickname")
//    public String findByNickname(@RequestBody String nickname){
//        //nickname = "'" + nickname + "'";
//        return userService.findByNickname(nickname);
//    }

}
