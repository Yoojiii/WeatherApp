package com.WeatherTracker.WeatherTracker.domain.service;

import com.WeatherTracker.WeatherTracker.datasource.mapper.UserEntityMapper;
import com.WeatherTracker.WeatherTracker.datasource.repository.UserRepository;
import com.WeatherTracker.WeatherTracker.domain.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    //private final PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository, UserEntityMapper userEntityMapper){
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
        //this.passwordEncoder = passwordEncoder;
    }

    public String createUser(UserModel userModel){
       // String hashedPassword = passwordEncoder.encode(userModel.getPassword());
        String hashedPassword = userModel.getHashPassword();
        userModel.setHashPassword(hashedPassword);
        userRepository.save(userEntityMapper.toDatasource(userModel));
        //return userRepository.save(userMapper.toDatasource(userModel));
        return "User : " + userModel.getNickname() + " was saved";
    }
}
