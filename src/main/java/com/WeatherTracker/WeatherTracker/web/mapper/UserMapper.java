package com.WeatherTracker.WeatherTracker.web.mapper;


import com.WeatherTracker.WeatherTracker.domain.model.UserModel;
import com.WeatherTracker.WeatherTracker.web.model.UserLogin;
import com.WeatherTracker.WeatherTracker.web.model.UserRequest;
import com.WeatherTracker.WeatherTracker.web.model.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse domainToResponse(UserModel userModel){
        UserResponse userResponse = new UserResponse();
        userResponse.setNickname(userModel.getNickname());
        userResponse.setCity(userModel.getCity());

        return userResponse;
    }

    public UserModel requestToDomain(UserRequest userRequest){
        UserModel userModel = new UserModel();
        userModel.setNickname(userRequest.getNickname());
        userModel.setHashPassword(userRequest.getPassword());
        userModel.setCity(userRequest.getCity());

        return userModel;
    }

    public UserModel loginToDomain(UserLogin userLogin){
        UserModel userModel = new UserModel();
        userModel.setNickname(userLogin.getNickanme());
        //userModel.setHashPassword(userLogin.getPassword());

        return userModel;
    }
}
