package com.WeatherTracker.WeatherTracker.datasource.mapper;

import com.WeatherTracker.WeatherTracker.datasource.model.UserEntity;
import com.WeatherTracker.WeatherTracker.domain.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public UserEntity toDatasource(UserModel userModel){
        UserEntity userEntity = new UserEntity();
        userEntity.setNickname(userModel.getNickname());
        userEntity.setPassword(userModel.getHashPassword());
        userEntity.setCity(userModel.getCity());

        return userEntity;
    }

    public UserModel toDomain(UserEntity userEntity){
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId());
        userModel.setNickname(userEntity.getNickname());
        userModel.setHashPassword(userModel.getHashPassword());
        userModel.setCity(userEntity.getCity());

        return userModel;
    }
}
